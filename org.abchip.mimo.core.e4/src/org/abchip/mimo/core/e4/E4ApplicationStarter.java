/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

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
import org.abchip.mimo.application.ModuleStatus;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.service.ServiceStatus;
import org.abchip.mimo.service.reg.ServiceCommandProviderReg;
import org.abchip.mimo.service.reg.ServiceExecutorReg;
import org.abchip.mimo.service.reg.ServiceHookReg;
import org.abchip.mimo.service.reg.ServiceReg;
import org.abchip.mimo.service.reg.ServiceRegistryEntryReg;
import org.abchip.mimo.service.reg.ServiceRegistryReg;
import org.abchip.mimo.service.reg.ServiceServletReg;
import org.abchip.mimo.util.Logs;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.service.log.Logger;
import org.osgi.util.tracker.ServiceTracker;

public class E4ApplicationStarter implements Runnable {

	private Application application = null;
	private List<Object> applicationHooks = null;
	private Map<String, List<Object>> componentMapHooks = new HashMap<String, List<Object>>();

	private Logger LOGGER = null;

	private ServiceTracker<?, ?> httpServiceTracker;
	private HttpService httpService = null;

	public E4ApplicationStarter(Application application) {
		this.application = application;
	}

	@Override
	public void run() {

		LOGGER = Logs.getLogger(E4ApplicationStarter.class);

		try {
			application.getContext().set(Application.class, application);
			this.start();
//			application.getContext().set(Application.class, null);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	private Application start() throws Exception {

		httpService = application.getContext().get(HttpService.class);

		if (httpService == null) {
			httpServiceTracker = new HttpServiceTracker(application.getBundle().getBundleContext());
			httpServiceTracker.open();
		}

		System.setProperty("mimo.logs", application.getPaths().getLogs());

		LOGGER.info("Starting application {} {}", application.getName(), application.getText());

		// configuration
		if (application.getConfig() != null)
			registerConfig(application.getContext(), application.getConfig().getEntities());

		// hooks starting
		Dictionary<String, String> properties = new Hashtable<String, String>();
		properties.put("org.abchip.mimo.application.hook.application", application.getName());
		applicationHooks = registerHooks(application.getContext(), application.getContext(), application.getHooks(), properties);
		for (Object hook : applicationHooks) {
			LOGGER.info("Notify application {} starting to hook {}", application.getName(), hook.getClass().getName());
			application.getContext().invoke(hook, ApplicationStarting.class);
		}

		// components
		for (ApplicationComponent component : application.getComponents())
			activateComponent(component);

		// hooks started
		for (Object hook : applicationHooks) {
			LOGGER.info("Notify application {} started to hook {}", application.getName(), hook.getClass().getName());
			application.getContext().invoke(hook, ApplicationStarted.class);
		}

		// commands provider
		registerCommands(application.getContext(), application.getContext(), application.getCommands());

		return application;
	}

	public void activateComponent(ApplicationComponent component) {

		if (component.getStatus() != ComponentStatus.ACTIVE) {
			LOGGER.info("Disabled component {}", component.getName());
			return;
		}

		LOGGER.info("Starting component {}", component.getName());

		@SuppressWarnings("resource")
		Context componentContext = application.getContext().createChildContext(component.getName()).get();
		componentContext.set(ApplicationComponent.class, component);
		component.setContext(componentContext);

		// configuration
		if (component.getConfig() != null)
			registerConfig(componentContext, component.getConfig().getEntities());

		// hooks starting
		Dictionary<String, String> properties = new Hashtable<String, String>();
		properties.put("org.abchip.mimo.application.hook.component", component.getName());
		List<Object> componentHooks = registerHooks(application.getContext(), componentContext, component.getHooks(), properties);
		componentMapHooks.put(component.getName(), componentHooks);
		for (Object hook : componentHooks) {
			LOGGER.info("Notify component {} starting to hook {}", component.getName(), hook.getClass().getName());
			component.getContext().invoke(hook, ComponentStarting.class);
		}

		// modules
		for (ApplicationModule module : component.getModules()) {
			if (module.getStatus() != ModuleStatus.ACTIVE) {
				LOGGER.info("Disabled module {}", module.getName());
				continue;
			}

			LOGGER.info("Load module {}", module.getName());
			// services
			for (ServiceReg serviceRef : module.getServices()) {
				try {
					registerService(component, serviceRef);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		// hooks
		for (Object hook : componentHooks) {
			LOGGER.info("Notify component {} started to hook {}", component.getName(), hook.getClass().getName());
			component.getContext().invoke(hook, ComponentStarted.class);
		}

		// commands provider
		registerCommands(application.getContext(), componentContext, component.getCommands());
	}

	private List<Object> registerHooks(ContextRoot contextRoot, Context contextChild, List<ServiceHookReg> hooks, Dictionary<String, String> properties) {

		List<Object> services = new ArrayList<Object>();
		for (ServiceHookReg hook : hooks) {
			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				LOGGER.info("Disabled hook {}", hook.getClassName());
				continue;
			}

			LOGGER.info("Register hook {}", hook.getClassName());
			try {
				Object service = loadObject(contextChild, hook.getClassName());
				contextRoot.set(hook.getInterfaceName(), service, false, properties);
				services.add(service);
			} catch (Exception e) {
				LOGGER.error(e.getMessage());
			}
		}

		return services;
	}

	private void registerConfig(Context context, List<Entity> entities) {
		for (Entity entity : entities)
			context.set(entity.getClass().getInterfaces()[0].getName(), entity);
	}

	private List<Object> registerCommands(ContextRoot contextRoot, Context contextChild, List<ServiceCommandProviderReg> commandProviders) {

		List<Object> commands = new ArrayList<Object>();
		for (ServiceCommandProviderReg command : commandProviders) {
			if (command.getStatus() == ServiceStatus.STOPPED) {
				LOGGER.info("Disabled command {}", command.getClassName());
				continue;
			}

			LOGGER.info("Register command {}", command.getClassName());
			try {
				Object service = loadObject(contextChild, command.getClassName());
				contextRoot.set(command.getInterfaceName(), service, false, null);
				commands.add(service);
			} catch (Exception e) {
				LOGGER.error(e.getMessage());
			}
		}

		return commands;
	}

	private void registerService(ApplicationComponent component, ServiceReg serviceRef) {
		// STOPPED
		if (serviceRef.getStatus() == ServiceStatus.STOPPED) {
			LOGGER.info("Disabled service {}", serviceRef.getClassName());
			return;
		}

		LOGGER.info("Register service {}", serviceRef.getClassName());

		// service properties
		Dictionary<String, String> dictionary = new Hashtable<String, String>();

		// registry entry
		if (serviceRef instanceof ServiceRegistryEntryReg) {
			ServiceRegistryEntryReg serviceRegistry = (ServiceRegistryEntryReg) serviceRef;
			dictionary.put(MimoConstants.REGISTRY_NAME, serviceRegistry.getName());
			dictionary.put(MimoConstants.REGISTRY_VENDOR, serviceRegistry.getVendor());
			dictionary.put(MimoConstants.REGISTRY_VERSION, serviceRegistry.getVersion());
		}

		// servlet
		if (serviceRef instanceof ServiceServletReg) {
			ServiceServletReg serviceServlet = (ServiceServletReg) serviceRef;
			dictionary.put(MimoConstants.SERVLET_ALIAS, serviceServlet.getAlias());
		}

		String interfaceName = serviceRef.getInterfaceName() != null ? serviceRef.getInterfaceName() : serviceRef.getClassName();
		boolean remoteExport = false;
		if (serviceRef instanceof ServiceExecutorReg) {
			ServiceExecutorReg serviceExecutor = (ServiceExecutorReg) serviceRef;
			remoteExport = serviceExecutor.isRemoteExport();
		}

		// service registration
		Object service = null;
		try {
			service = loadObject(component.getContext(), serviceRef.getClassName());
			registerService(component, interfaceName, service, remoteExport, dictionary);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return;
		}

		// registry
		if (serviceRef instanceof ServiceRegistryReg) {
			ServiceRegistryReg serviceRegistry = (ServiceRegistryReg) serviceRef;
			// service entries
			for (ServiceRegistryEntryReg serviceChildRef : serviceRegistry.getEntries()) {
				registerService(component, serviceChildRef);
			}
		}

		// servlet
		if (serviceRef instanceof ServiceServletReg) {
			ServiceServletReg serviceServlet = (ServiceServletReg) serviceRef;

			if (httpService != null) {
				try {
					httpService.registerServlet(serviceServlet.getAlias(), (Servlet) service, null, null);
				} catch (ServletException | NamespaceException e) {
					LOGGER.error(e.getMessage());
				}
			}
		}
	}

	private void registerService(ApplicationComponent component, String name, Object service, boolean remoteExport, Dictionary<String, String> properties) {

		// service properties
		properties.put(MimoConstants.APPLICATION_NAME, application.getName());
		properties.put(MimoConstants.COMPONENT_NAME, component.getName());

		application.getContext().set(name, service, remoteExport, properties);
	}

	private Object loadObject(Context context, String className) throws Exception {
		Class<?> tempClass = this.application.getBundle().loadClass(className);
		return context.make(tempClass);
	}

	private class HttpServiceTracker extends ServiceTracker<HttpService, HttpService> {

		public HttpServiceTracker(BundleContext context) {
			super(context, HttpService.class, null);
		}

		public HttpService addingService(ServiceReference<HttpService> reference) {
			httpService = super.addingService(reference);

			BundleContext bundleContext = application.getBundle().getBundleContext();

			try {
				for (ServiceReference<Servlet> serviceReference : bundleContext.getServiceReferences(Servlet.class, null)) {
					Object servletAlias = serviceReference.getProperty(MimoConstants.SERVLET_ALIAS);
					if (servletAlias == null)
						continue;

					try {
						Servlet servlet = bundleContext.getService(serviceReference);
						httpService.registerServlet(servletAlias.toString(), servlet, serviceReference.getProperties(), null);
					} catch (ServletException | NamespaceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (InvalidSyntaxException e) {
				e.printStackTrace();
			}

			return httpService;
		}

		public void removedService(ServiceReference<HttpService> reference, HttpService service) {
			httpService = null;
			super.removedService(reference, service);
		}
	}
}