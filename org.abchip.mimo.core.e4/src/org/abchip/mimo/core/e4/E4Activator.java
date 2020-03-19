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
	public void start(BundleContext bundleContext) throws Exception {
		this.applicationManagerRegistration = bundleContext.registerService(ApplicationManager.class, new BaseApplicationManagerImpl(), null);

		String applicationConfig = null;
		for (ServiceReference<String> str : bundleContext.getServiceReferences(String.class, null)) {
			if (str.getProperty(MimoConstants.APPLICATION_CONFIG) == null)
				continue;

			applicationConfig = bundleContext.getService(str).toString();

			/*
			 * if (applicationHome != null) { ApplicationPaths applicationPaths =
			 * application.getPaths();
			 * applicationPaths.setData(applicationPaths.getData().replaceFirst(
			 * "\\{mimo.home\\}", applicationHome));
			 * applicationPaths.setLogs(applicationPaths.getLogs().replaceFirst(
			 * "\\{mimo.home\\}", applicationHome));
			 * applicationPaths.setWork(applicationPaths.getWork().replaceFirst(
			 * "\\{mimo.home\\}", applicationHome)); }
			 */

			break;
		}

		if (applicationConfig != null) {
			startApplication(applicationConfig);
		} else {
			bundleContext.addServiceListener(new ServiceListener() {

				@Override
				public void serviceChanged(ServiceEvent event) {
					switch (event.getType()) {
					case ServiceEvent.REGISTERED:
						ServiceReference<?> serviceReference = event.getServiceReference();
						if (serviceReference.getProperties().get(MimoConstants.APPLICATION_CONFIG) == null)
							return;

						String applicationConfig = bundleContext.getService(serviceReference).toString();
						try {
							startApplication(applicationConfig);
						} catch (Exception e) {
							// TODO Auto-generated catch block
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

	@SuppressWarnings({ "resource" })
	private void startApplication(String applicationConfig) throws Exception {

		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = null;
			if (applicationConfig.startsWith("http"))
				uri = URI.createURI(applicationConfig);
			else
				uri = URI.createFileURI(new File(applicationConfig).getAbsolutePath());

			Resource resource = resourceSet.getResource(uri, true);
			resource.load(Collections.EMPTY_MAP);
			E4Activator.application = (Application) resource.getContents().get(0);

			Bundle bundle = application.getBundle();
			ClassLoader bundleLoader = bundle.adapt(BundleWiring.class).getClassLoader();
			Thread.currentThread().setContextClassLoader(bundleLoader);

			// context
			ContextRoot contextApplication = new E4ContextRootImpl(bundle, application.getContextDescription());
			contextApplication.set(Application.class, application);
			contextApplication.set(ApplicationPaths.class, application.getPaths());
			contextApplication.set(ContextRoot.class, contextApplication);

			E4Activator.application.setContext(contextApplication);

			ApplicationManager applicationManager = contextApplication.get(ApplicationManager.class);

			applicationManager.start(application, System.out);
			System.out.println("Started " + application);
		} catch (Exception e) {
			System.err.println("Failed " + application);
			throw e;
		}
	}
}
