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
package org.abchip.mimo.application.osgi;

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
import java.util.Map;

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
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.util.Singleton;

public class OSGIApplicationStarter {

	private static final String SINGLETON_INSTANCE = "qINSTANCE";

	private Application application = null;
	private List<Object> applicationHooks = null;
	private Map<String, List<Object>> componentMapHooks = null;

	private int messageLevel;
	private Writer writer = null;

	public OSGIApplicationStarter(Application application, OutputStream outputStream) {
		this.application = application;
		this.writer = new OutputStreamWriter(outputStream);
	}

	public Application start() throws Exception {

		println(">application " + application);

		// configuration
		if (application.getConfig() != null)
			registerConfig(application.getContext(), application.getConfig().getEntities());

		// hooks starting
		messageLevel++;
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put("org.abchip.mimo.application.hook.application", application.getName());
		applicationHooks = registerHooks(application.getContext(), application.getHooks(), properties);
		for (Object hook : applicationHooks) {
			println("!application starting " + hook);
			application.getContext().invoke(hook, ApplicationStarting.class);
		}
		messageLevel--;

		// components
		for (ApplicationComponent component : application.getComponents()) {
			messageLevel++;
			activateComponent(component);
			messageLevel--;
		}

		// hooks started
		messageLevel++;
		for (Object hook : applicationHooks) {
			println("!application started " + hook);
			application.getContext().invoke(hook, ApplicationStarted.class);
		}
		messageLevel--;

		// commands provider
		messageLevel++;
		registerCommands(application.getContext(), application.getCommands());
		messageLevel--;

		return application;
	}

	public void activateComponent(ApplicationComponent component) {

		Context componentContext = application.getContext().createChildContext(component.getName());
		componentContext.set(ApplicationComponent.class, component);
		component.setContext(componentContext);

		println(">component " + component);

		// configuration
		if (component.getConfig() != null)
			registerConfig(componentContext, component.getConfig().getEntities());

		// hooks starting
		messageLevel++;
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put("org.abchip.mimo.application.hook.component", component.getName());
		List<Object> componentHooks = registerHooks(application.getContext(), component.getHooks(), properties);
		componentMapHooks.put(component.getName(), componentHooks);
		for (Object hook : componentHooks) {
			println("!component starting " + hook);
			component.getContext().invoke(hook, ComponentStarting.class);
		}
		messageLevel--;

		// modules
		for (ApplicationModule module : component.getModules()) {
			messageLevel++;
			println(">module " + module);

			// services
			messageLevel++;
			for (ServiceRef serviceRef : module.getServices()) {
				try {
					registerService(component, serviceRef);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			messageLevel--;

			messageLevel--;
		}

		// hooks
		messageLevel++;
		for (Object hook : componentHooks) {
			println("!component started " + hook);
			component.getContext().invoke(hook, ComponentStarted.class);
		}
		messageLevel--;

		// commands provider
		messageLevel++;
		registerCommands(application.getContext(), component.getCommands());
		messageLevel--;
		messageLevel--;
	}

	private List<Object> registerHooks(ContextRoot context, List<ServiceHook> hooks, Dictionary<String, Object> properties) {

		List<Object> services = new ArrayList<Object>();
		for (ServiceHook hook : hooks) {
			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(context, hook.getClassName());
			context.set(hook.getInterfaceName(), service, properties);
			services.add(service);
		}

		return services;
	}

	private void registerConfig(Context context, List<Entity> entities) {
		for (Entity entity : entities)
			context.set(entity.getClass().getInterfaces()[0].getName(), entity);
	}

	private List<Object> registerCommands(ContextRoot context, List<ServiceCommandProvider> commandProviders) {

		List<Object> commands = new ArrayList<Object>();
		for (ServiceCommandProvider command : commandProviders) {
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(context, command.getClassName());
			context.set(command.getInterfaceName(), service, null);
			commands.add(service);
		}

		return commands;
	}

	private void registerService(ApplicationComponent component, ServiceRef serviceRef) throws ClassNotFoundException {
		// STOPPED
		if (serviceRef.getStatus() == ServiceStatus.STOPPED) {
			println("-service " + serviceRef + " unactive");
			return;
		}

		println("+service " + serviceRef);

		// registry
		if (serviceRef instanceof ServiceRegistry) {
			ServiceRegistry serviceRegistry = (ServiceRegistry) serviceRef;
			// service entries
			for (ServiceRegistryEntry serviceChildRef : serviceRegistry.getEntries()) {
				messageLevel++;
				registerService(component, serviceChildRef);
				messageLevel--;
			}
		}

		// registry entry
		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();
		if (serviceRef instanceof ServiceRegistryEntry) {
			ServiceRegistryEntry serviceRegistry = (ServiceRegistryEntry) serviceRef;
			dictionary.put("org.abchip.mimo.entity.registry.name", serviceRegistry.getName());
			dictionary.put("org.abchip.mimo.entity.registry.vendor", serviceRegistry.getVendor());
			dictionary.put("org.abchip.mimo.entity.registry.version", serviceRegistry.getVersion());
		}

		// service registration
		Object service = loadObject(component.getContext(), serviceRef.getClassName());
		String interfaceName = serviceRef.getInterfaceName() != null ? serviceRef.getInterfaceName() : serviceRef.getClassName();
		boolean remoteExport = false;
		if (serviceRef instanceof ServiceExecutor) {
			ServiceExecutor serviceExecutor = (ServiceExecutor) serviceRef;
			remoteExport = serviceExecutor.isRemoteExport();
		}
		registerService(component, interfaceName, service, dictionary, remoteExport);
	}

	private void registerService(ApplicationComponent component, String name, Object service, Dictionary<String, Object> properties, boolean remoteExport) {

		// service properties
		properties.put("org.abchip.mimo.application.name", application.getName());
		properties.put("org.abchip.mimo.application.port", application.getPort());
		properties.put("org.abchip.mimo.application.component.name", component.getName());

		// context properties
		Context contextService = component.getContext().createChildContext(name);
		contextService.set("org.abchip.mimo.application.service.name", name);
		contextService.set("org.abchip.mimo.application.service.object", service);
		contextService.set("org.abchip.mimo.application.service.properties", properties);
		contextService.set("org.abchip.mimo.application.service.remoteExport", remoteExport);

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

		// application hooks
		for (Object hook : applicationHooks)
			contextService.invoke(hook, ServiceRegistering.class);

		// component hooks
		List<Object> componentHooks = componentMapHooks.get(component.getName());
		if (componentHooks != null) {
			for (Object hook : componentHooks)
				contextService.invoke(hook, ServiceRegistering.class);
		}

		contextService.invoke(service, ServiceRegistering.class);

		application.getContext().set(name, service, properties);

		contextService.close();
	}

	private Object loadObject(Context context, String className) {
		Class<?> tempClass = context.loadClass(className);
		return context.make(tempClass);
	}

	private void println(String message) {

		try {
			writer.write(appendChars(message + "\n", "\t", messageLevel, true));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String appendChars(String in, String chars, int times, boolean before) {
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
