/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.application.e4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationModule;
import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.application.ApplicationStarting;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.application.ComponentStarting;
import org.abchip.mimo.application.ServiceCommandProvider;
import org.abchip.mimo.application.ServiceExecutor;
import org.abchip.mimo.application.ServiceHook;
import org.abchip.mimo.application.ServiceRef;
import org.abchip.mimo.application.ServiceRegistering;
import org.abchip.mimo.application.ServiceRegistry;
import org.abchip.mimo.application.ServiceRegistryEntry;
import org.abchip.mimo.application.ServiceStatus;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.util.Singleton;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import orb.abchip.mimo.core.e4.E4ContextRootImpl;

public class E4ApplicationStarter {

	private static final String SINGLETON_INSTANCE = "qINSTANCE";

	private Application application;
	private BundleContext bundleContext;

	private int messageLevel;
	private Writer writer;

	protected E4ApplicationStarter(Application application, BundleContext bundleContext, OutputStream outputStream) {
		this.application = application;
		this.bundleContext = bundleContext;
		this.writer = new OutputStreamWriter(outputStream);
	}

	public Application start() throws Exception {

		println("");

		println(">application " + application);

		Context contextApplication = new E4ContextRootImpl(bundleContext, UUID.randomUUID().toString(), application.getContextDescription());
		this.application.setContext(contextApplication);

		bundleContext.registerService(Application.class, application, null);

		// configuration
		if (application.getConfig() != null) {
			for (Entity entity : application.getConfig().getEntities())
				contextApplication.set(entity.getClass().getInterfaces()[0].getName(), entity);
		}

		// hooks
		messageLevel++;
		for (ServiceHook hook : application.getHooks()) {

			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(contextApplication, hook.getClassName());

			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.abchip.mimo.application.hook.application", application.getName());
			bundleContext.registerService(hook.getInterfaceName(), service, properties);
		}

		// hooks
		messageLevel++;

		for (Object hook : loadHooks(application)) {
			println("+hook " + hook);
			contextApplication.invoke(hook, ApplicationStarting.class);
		}

		messageLevel--;

		for (ApplicationComponent component : application.getComponents()) {
			Context contextComponent = contextApplication.createChildContext(component.getName());
			contextComponent.set(ApplicationComponent.class, component);

			// configuration
			if (component.getConfig() != null) {
				for (Entity entity : component.getConfig().getEntities())
					contextComponent.set(entity.getClass().getInterfaces()[0].getName(), entity);
			}

			messageLevel++;
			println(">component " + component);
			activateComponent(application, component, contextComponent);
			messageLevel--;

			contextComponent.close();
		}

		// hooks
		messageLevel++;

		for (Object hook : loadHooks(application)) {
			println("+hook " + hook);
			contextApplication.invoke(hook, ApplicationStarted.class);
		}

		messageLevel--;

		// commands provider
		messageLevel++;
		for (ServiceCommandProvider command : application.getCommands()) {

			// STOPPED
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(contextApplication, command.getClassName());
			bundleContext.registerService(command.getInterfaceName(), service, null);
		}
		messageLevel--;

		return application;
	}

	public void activateComponent(Application application, ApplicationComponent component, Context contextComponent) {

		// hooks
		messageLevel++;
		for (ServiceHook hook : component.getHooks()) {
			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(contextComponent, hook.getClassName());
			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.abchip.mimo.application.hook.component", component.getName());
			bundleContext.registerService(hook.getInterfaceName(), service, properties);
		}
		messageLevel--;

		// hooks
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component starting " + hook);
			contextComponent.invoke(hook, ComponentStarting.class);
		}
		messageLevel--;

		for (ApplicationModule module : component.getModules()) {
			messageLevel++;
			println(">module " + module);

			messageLevel++;

			// services
			for (ServiceRef serviceRef : module.getServices()) {
				try {
					registerService(application, component, contextComponent, serviceRef);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			messageLevel--;

			messageLevel--;
		}

		// hooks
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component started " + hook);
			contextComponent.invoke(hook, ComponentStarted.class);
		}
		messageLevel--;

		// commands provider
		messageLevel++;
		for (ServiceCommandProvider command : component.getCommands()) {

			// STOPPED
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(contextComponent, command.getClassName());
			bundleContext.registerService(command.getInterfaceName(), service, null);
		}
		messageLevel--;
	}

	public void registerService(Application application, ApplicationComponent component, Context componentContext, ServiceRef serviceRef) throws ClassNotFoundException {

		boolean remoteExport = false;

		// STOPPED
		if (serviceRef.getStatus() == ServiceStatus.STOPPED) {
			println("-service " + serviceRef + " unactive");
			return;
		}

		println("+service " + serviceRef);

		if (serviceRef instanceof ServiceExecutor) {
			ServiceExecutor serviceExecutor = (ServiceExecutor) serviceRef;
			remoteExport = serviceExecutor.isRemoteExport();

			// service references
			// for (ServiceExecutor serviceChildRef :
			// serviceExecutor.getServices()) {
			// messageLevel++;
			// registerService(application, component, componentContext,
			// serviceChildRef);
			// messageLevel--;
			// }
		}

		if (serviceRef instanceof ServiceRegistry) {
			ServiceRegistry serviceRegistry = (ServiceRegistry) serviceRef;

			// service entries
			for (ServiceRegistryEntry serviceChildRef : serviceRegistry.getEntries()) {
				messageLevel++;
				registerService(application, component, componentContext, serviceChildRef);
				messageLevel--;
			}
		}

		// load service
		Object service = loadObject(componentContext, serviceRef.getClassName());

		// register on context
		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();

		if (serviceRef instanceof ServiceRegistryEntry) {
			ServiceRegistryEntry serviceRegistry = (ServiceRegistryEntry) serviceRef;

			// register on context
			dictionary.put("org.abchip.mimo.entity.registry.name", serviceRegistry.getName());
			dictionary.put("org.abchip.mimo.entity.registry.vendor", serviceRegistry.getVendor());
			dictionary.put("org.abchip.mimo.entity.registry.version", serviceRegistry.getVersion());
		}

		// service registration
		if (serviceRef.getInterfaceName() != null)
			registerService(application, component, componentContext, serviceRef.getInterfaceName(), service, dictionary, remoteExport);
		else
			registerService(application, component, componentContext, serviceRef.getClassName(), service, dictionary, remoteExport);
	}

	private void registerService(Application application, ApplicationComponent component, Context componentContext, String name, Object service, Dictionary<String, Object> properties,
			boolean remoteExport) {

		// service properties
		properties.put("org.abchip.mimo.application.name", application.getName());
		properties.put("org.abchip.mimo.application.port", application.getPort());
		properties.put("org.abchip.mimo.application.component.name", component.getName());

		// context properties
		Context contextService = componentContext.createChildContext(name);
		contextService.set("org.abchip.mimo.application.service.name", name);
		contextService.set("org.abchip.mimo.application.service.object", service);
		contextService.set("org.abchip.mimo.application.service.properties", properties);
		contextService.set("org.abchip.mimo.application.service.remoteExport", remoteExport);

		// application hooks
		for (Object hook : loadHooks(application))
			contextService.invoke(hook, ServiceRegistering.class);

		// component hooks
		for (Object hook : loadHooks(component))
			contextService.invoke(hook, ServiceRegistering.class);

		// singleton
		if (service instanceof Singleton<?>) {
			Class<?> klass = service.getClass();
			try {
				Field field = klass.getField(SINGLETON_INSTANCE);
				if (field != null) {
					field.setAccessible(true);
					Field modifiersField = Field.class.getDeclaredField("modifiers");
					modifiersField.setAccessible(true);
					modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
					field.set(null, service);
					field.setAccessible(false);
				}
			} catch (Exception e) {
				contextService.close();
				throw new RuntimeException(e);
			}
		}

		contextService.invoke(service, ServiceRegistering.class);
		bundleContext.registerService(name, service, properties);

		// prevent remote injection
		application.getContext().set(name, service);

		contextService.close();
	}

	public Object loadObject(Context context, String className) {
		
		for (Bundle bundle : bundleContext.getBundles()) {
			try {
				Class<?> tempClass = bundle.loadClass(className);
				return context.make(tempClass);
			} catch (ClassNotFoundException e) {
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Service: class not found " + className);
	}

	private List<Object> loadHooks(Application application) {

		List<Object> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.abchip.mimo.application.hook.application=" + application.getName() + ")";
			ServiceReference<?> serviceReferences[] = bundleContext.getServiceReferences((String) null, serviceFilter);
			if (serviceReferences != null) {
				for (org.osgi.framework.ServiceReference<?> reference : serviceReferences) {
					Object service = bundleContext.getService(reference);
					hooks.add(service);
				}
			}
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}

		return hooks;
	}

	private List<Object> loadHooks(ApplicationComponent component) {

		List<Object> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.abchip.mimo.application.hook.component=" + component.getName() + ")";
			ServiceReference<?> serviceReferences[] = bundleContext.getServiceReferences((String) null, serviceFilter);
			if (serviceReferences != null) {
				for (ServiceReference<?> reference : serviceReferences) {
					Object service = bundleContext.getService(reference);
					hooks.add(service);
				}
			}
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}

		return hooks;
	}

	private void println(String message) {

		try {
			writer.write(appendChars(message + "\n", "\t", messageLevel, true));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String appendChars(String in, String chars, int times, boolean before) {
		StringBuffer sb = new StringBuffer();
		if (!before)
			sb.append(in);
		for (int x = 0; x < times; x++)
			sb.append(chars);
		if (before)
			sb.append(in);
		sb.trimToSize();
		return sb.toString();
	}
}
