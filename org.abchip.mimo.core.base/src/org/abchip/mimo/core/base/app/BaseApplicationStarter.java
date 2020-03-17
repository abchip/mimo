/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.app;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationModule;
import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.application.ApplicationStarting;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.application.ComponentStarting;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.application.ServiceCommandProvider;
import org.abchip.mimo.application.ServiceExecutor;
import org.abchip.mimo.application.ServiceHook;
import org.abchip.mimo.application.ServiceRef;
import org.abchip.mimo.application.ServiceRegistry;
import org.abchip.mimo.application.ServiceRegistryEntry;
import org.abchip.mimo.application.ServiceServlet;
import org.abchip.mimo.application.ServiceStatus;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.util.Singleton;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class BaseApplicationStarter {

	private static final String SINGLETON_INSTANCE = "qINSTANCE";

	private Application application = null;
	private List<Object> applicationHooks = null;
	private Map<String, List<Object>> componentMapHooks = new HashMap<String, List<Object>>();

	private int messageLevel;
	private Writer writer = null;

	public BaseApplicationStarter(Application application, OutputStream outputStream) {
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
		Dictionary<String, String> properties = new Hashtable<String, String>();
		properties.put("org.abchip.mimo.application.hook.application", application.getName());
		applicationHooks = registerHooks(application.getContext(), application.getContext(), application.getHooks(), properties);
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
		registerCommands(application.getContext(), application.getContext(), application.getCommands());
		messageLevel--;

		return application;
	}

	public void activateComponent(ApplicationComponent component) {

		println(">component " + component);
		if (component.getStatus() != ComponentStatus.ACTIVE) {
			println("!unactive");
			return;
		}

		@SuppressWarnings("resource")
		Context componentContext = application.getContext().createChildContext(component.getName());
		componentContext.set(ApplicationComponent.class, component);
		component.setContext(componentContext);

		// configuration
		if (component.getConfig() != null)
			registerConfig(componentContext, component.getConfig().getEntities());

		// hooks starting
		messageLevel++;
		Dictionary<String, String> properties = new Hashtable<String, String>();
		properties.put("org.abchip.mimo.application.hook.component", component.getName());
		List<Object> componentHooks = registerHooks(application.getContext(), componentContext, component.getHooks(), properties);
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
		registerCommands(application.getContext(), componentContext, component.getCommands());
		messageLevel--;
	}

	private List<Object> registerHooks(ContextRoot contextRoot, Context contextChild, List<ServiceHook> hooks, Dictionary<String, String> properties) {

		List<Object> services = new ArrayList<Object>();
		for (ServiceHook hook : hooks) {
			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(contextChild, hook.getClassName());
			contextRoot.set(hook.getInterfaceName(), service, false, properties);
			services.add(service);
		}

		return services;
	}

	private void registerConfig(Context context, List<Entity> entities) {
		for (Entity entity : entities)
			context.set(entity.getClass().getInterfaces()[0].getName(), entity);
	}

	private List<Object> registerCommands(ContextRoot contextRoot, Context contextChild, List<ServiceCommandProvider> commandProviders) {

		List<Object> commands = new ArrayList<Object>();
		for (ServiceCommandProvider command : commandProviders) {
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(contextChild, command.getClassName());
			contextRoot.set(command.getInterfaceName(), service, false, null);
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

		// service properties
		Dictionary<String, String> dictionary = new Hashtable<String, String>();

		// registry entry
		if (serviceRef instanceof ServiceRegistryEntry) {
			ServiceRegistryEntry serviceRegistry = (ServiceRegistryEntry) serviceRef;
			dictionary.put(MimoConstants.REGISTRY_NAME, serviceRegistry.getName());
			dictionary.put(MimoConstants.REGISTRY_VENDOR, serviceRegistry.getVendor());
			dictionary.put(MimoConstants.REGISTRY_VERSION, serviceRegistry.getVersion());
		}

		// servlet
		if (serviceRef instanceof ServiceServlet) {
			ServiceServlet serviceServlet = (ServiceServlet) serviceRef;
			dictionary.put(MimoConstants.SERVICE_ALIAS, serviceServlet.getAlias());
		}

		// service registration
		Object service = loadObject(component.getContext(), serviceRef.getClassName());
		if (service == null) {
			System.err.println("Service reference not found: " + serviceRef);
			println("");
			return;
		}

		String interfaceName = serviceRef.getInterfaceName() != null ? serviceRef.getInterfaceName() : serviceRef.getClassName();

		boolean remoteExport = false;
		if (serviceRef instanceof ServiceExecutor) {
			ServiceExecutor serviceExecutor = (ServiceExecutor) serviceRef;
			remoteExport = serviceExecutor.isRemoteExport();
		}

		registerService(component, interfaceName, service, remoteExport, dictionary);

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

		// servlet
		if (serviceRef instanceof ServiceServlet) {
			ServiceServlet serviceServlet = (ServiceServlet) serviceRef;

			HttpService httpService = application.getContext().get(HttpService.class);
			if (httpService != null) {
				try {
					httpService.registerServlet(serviceServlet.getAlias(), (Servlet) service, null, null);
				} catch (ServletException | NamespaceException e) {
					System.err.println("Servlet registration failed: " + serviceRef);
					println("");
				}
			}
		}
	}

	private void registerService(ApplicationComponent component, String name, Object service, boolean remoteExport, Dictionary<String, String> properties) {

		// service properties
		properties.put(MimoConstants.APPLICATION_NAME, application.getName());
		properties.put(MimoConstants.COMPONENT_NAME, component.getName());

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
				throw new RuntimeException(e);
			}
		}

		application.getContext().set(name, service, remoteExport, properties);
	}

	private Object loadObject(Context context, String className) {
		Class<?> tempClass = this.application.getContext().loadClass(className);
		if (tempClass == null) {
			try {
				System.err.println("load from base: " + className);
				tempClass = Class.forName(className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		}

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
