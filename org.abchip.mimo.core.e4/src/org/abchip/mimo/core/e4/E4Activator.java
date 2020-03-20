/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.io.File;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Map;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.base.app.BaseApplicationManagerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleWiring;

public class E4Activator implements BundleActivator {

	private ServiceRegistration<ApplicationManager> applicationManagerRegistration;
	private static Application application;

	public static Application getApplication() {
		return E4Activator.application;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void start(BundleContext bundleContext) throws Exception {
		this.applicationManagerRegistration = bundleContext.registerService(ApplicationManager.class, new BaseApplicationManagerImpl(), null);

		Dictionary dictionary = null;
		for (ServiceReference<Dictionary> dictionaryReference : bundleContext.getServiceReferences(Dictionary.class, null)) {
			if (dictionaryReference.getProperty(MimoConstants.APPLICATION_ACTIVATOR) == null)
				continue;

			dictionary = bundleContext.getService(dictionaryReference);
			break;
		}

		if (dictionary != null) {
			startApplication(dictionary);

		} else {
			bundleContext.addServiceListener(new ServiceListener() {

				@Override
				public void serviceChanged(ServiceEvent event) {
					switch (event.getType()) {
					case ServiceEvent.REGISTERED:
						ServiceReference<?> serviceReference = event.getServiceReference();
						if (serviceReference.getProperty(MimoConstants.APPLICATION_ACTIVATOR) == null)
							return;

						
						try {
							Dictionary dictionary = (Dictionary) bundleContext.getService(serviceReference);
							startApplication(dictionary);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
			});
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());
	}

	@SuppressWarnings({ "resource", "rawtypes" })
	private void startApplication(Dictionary dictionary) throws Exception {

		if(E4Activator.application != null) {
			System.err.println("Application already started " + application);
			return;
		}
		
		Object applicationConfig = dictionary.get(MimoConstants.APPLICATION_ACTIVATOR_CONFIG);
		Object applicationHome = dictionary.get(MimoConstants.APPLICATION_ACTIVATOR_HOME);
		
		if (applicationConfig == null) {
			System.err.println("Application config is required");
			return;			
		}
		
		Application application = null;
		
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = null;
			if (applicationConfig.toString().startsWith("http"))
				uri = URI.createURI(applicationConfig.toString());
			else
				uri = URI.createFileURI(new File(applicationConfig.toString()).getAbsolutePath());

			Resource resource = resourceSet.getResource(uri, true);
			resource.load(Collections.EMPTY_MAP);
			application = (Application) resource.getContents().get(0);

			if (applicationHome != null) {
				ApplicationPaths applicationPaths = application.getPaths();
				applicationPaths.setData(applicationPaths.getData().replaceFirst("\\{mimo.home\\}", applicationHome.toString()));
				applicationPaths.setLogs(applicationPaths.getLogs().replaceFirst("\\{mimo.home\\}", applicationHome.toString()));
				applicationPaths.setWork(applicationPaths.getWork().replaceFirst("\\{mimo.home\\}", applicationHome.toString()));
			}

			
			Bundle bundle = application.getBundle();
			ClassLoader bundleLoader = bundle.adapt(BundleWiring.class).getClassLoader();
			Thread.currentThread().setContextClassLoader(bundleLoader);

			// context
			ContextRoot contextApplication = new E4ContextRootImpl(bundle, application.getContextDescription());
			contextApplication.set(Application.class, application);
			contextApplication.set(ApplicationPaths.class, application.getPaths());
			contextApplication.set(ContextRoot.class, contextApplication);

			application.setContext(contextApplication);

			ApplicationManager applicationManager = contextApplication.get(ApplicationManager.class);

			E4Activator.application = application;
			applicationManager.start(application, System.out);

			System.out.println("Started " + application);
		} catch (Exception e) {
			E4Activator.application = null;
			System.err.println("Failed " + application);
			throw e;
		}
	}
}
