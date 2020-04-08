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
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Systems;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.log.Logger;

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
			Logger logger = Logs.getLogger(E4Activator.class);
			logger.warn("Application {} alreay started", E4Activator.application.getName());
			return;
		}

		E4Activator.application = loadApplication(applicationConfig);

		// logs
		Logs.reset(E4Activator.application.getLogs());

		// keys
		setApplicationKeys(E4Activator.application, adminKey);

		// path
		setApplicationPaths(E4Activator.application.getPaths(), applicationHome);

		Bundle bundle = E4Activator.application.getBundle();
		ClassLoader bundleLoader = bundle.adapt(BundleWiring.class).getClassLoader();
		Thread.currentThread().setContextClassLoader(bundleLoader);

		// context
		ContextRoot contextApplication = new E4ContextRootImpl(bundle, E4Activator.application.getContextDescription());
		contextApplication.set(Application.class, E4Activator.application);
		contextApplication.set(ApplicationPaths.class, E4Activator.application.getPaths());
		contextApplication.set(ContextRoot.class, contextApplication);

		E4Activator.application.setContext(contextApplication);

		new E4ApplicationStarter(E4Activator.application, System.out).start();
	}

	private Application loadApplication(String applicationConfig) throws IOException {

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
		return (Application) resource.getContents().get(0);
	}

	private void setApplicationKeys(Application application, String adminKey) {

		// ${mimo.admin.key}
		if (adminKey == null)
			adminKey = "";
		if (application.getAdminKey() != null)
			application.setAdminKey(application.getAdminKey().replaceFirst("\\$\\{mimo.admin.key\\}", adminKey.toString()));
		if (application.getAdminKey().isEmpty())
			application.setAdminKey(null);

	}

	private void setApplicationPaths(ApplicationPaths applicationPaths, String applicationHome) {

		// win path
		if (Systems.isWindows())
			applicationHome = applicationHome.replace("\\", "\\\\");

		// ${mimo.home}
		if (applicationHome != null) {
			applicationPaths.setData(applicationPaths.getData().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
			applicationPaths.setLogs(applicationPaths.getLogs().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
			applicationPaths.setWork(applicationPaths.getWork().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
		}
	}
}