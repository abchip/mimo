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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleWiring;

public class E4Activator implements BundleActivator {

	private static Application application;

	public static Application getApplication() {
		return E4Activator.application;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {

		if (!Boolean.parseBoolean(bundleContext.getProperty("mimo.activation")))
			return;

		if (bundleContext.getProperty("mimo.config") == null)
			return;

		if (bundleContext.getProperty("mimo.home") == null)
			return;

		startApplication(bundleContext.getProperty("mimo.config"), bundleContext.getProperty("mimo.home"), bundleContext.getProperty("mimo.admin.key"));
	}

	@Override
	public void stop(BundleContext context) throws Exception {

	}

	private void startApplication(String applicationConfig, String applicationHome, String adminKey) throws Exception {

		if (E4Activator.application != null) {
			System.err.println("Application already started " + application);
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

			// ${mimo.admin.key}
			if (adminKey == null)
				adminKey = "";
			if (application.getAdminKey() != null)
				application.setAdminKey(application.getAdminKey().replaceFirst("\\$\\{mimo.admin.key\\}", adminKey.toString()));
			if (application.getAdminKey().isEmpty())
				application.setAdminKey(null);

			// ${mimo.home}
			if (applicationHome != null) {
				ApplicationPaths applicationPaths = application.getPaths();

				// win path
				applicationHome = applicationHome.toString().replace("\\","\\\\");
				
				applicationPaths.setData(applicationPaths.getData().replaceFirst("\\$\\{mimo.home\\}", applicationHome.toString()));
				applicationPaths.setLogs(applicationPaths.getLogs().replaceFirst("\\$\\{mimo.home\\}", applicationHome.toString()));
				applicationPaths.setWork(applicationPaths.getWork().replaceFirst("\\$\\{mimo.home\\}", applicationHome.toString()));
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

			E4Activator.application = application;
			new E4ApplicationStarter(application, System.out).start();

			System.out.println("Started " + application);
		} catch (Exception e) {
			E4Activator.application = null;
			System.err.println("Failed " + application);
			throw e;
		}
	}
}
