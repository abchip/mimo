/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.io.IOException;
import java.net.URL;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.core.base.BaseRegistryFactoryImpl;
import org.abchip.mimo.core.base.ctx.BaseThreadManagerImpl;
import org.abchip.mimo.core.log4j.LOG4JActivator;
import org.abchip.mimo.util.Applications;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Systems;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.log.Logger;

public class E4Activator implements BundleActivator {

	public static final String APPLICATION_XMI = "/application/application.xmi";

	private static Application application;
	private Thread thread = null;

	public static Application getApplication() {
		return E4Activator.application;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {

		// touch LOG4J to force activation
		LOG4JActivator.class.toString();

		Logger logger = Logs.getLogger(E4Activator.class);

		if (E4Activator.application != null) {
			logger.warn("Application {} already started", E4Activator.application.getName());
			return;
		}

		// mimo.home
		if (bundleContext.getProperty("mimo.home") == null) {
			logger.warn("Property mimo.home not found");
			return;
		}

		// get application.xmi
		if (bundleContext.getProperty("mimo.config") != null) {
			E4Activator.application = Applications.load(bundleContext.getProperty("mimo.config"));
		} else {
			E4Activator.application = searchApplication(bundleContext);
		}

		if (E4Activator.application == null) {
			logger.warn("Application.xmi not found");
			return;
		}

		startApplication(bundleContext.getProperty("mimo.home"), bundleContext.getProperty("mimo.admin.key"));
	}

	private Application searchApplication(BundleContext bundleContext) throws IOException {
		for (Bundle bundle : bundleContext.getBundles()) {
			URL entry = bundle.getEntry(APPLICATION_XMI);
			if (entry == null)
				continue;

			return Applications.load(entry.toString());
		}

		return null;
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (thread != null) {
			ThreadManager threadManager = application.getContext().get(ThreadManager.class);
			threadManager.stop(thread);
		}

		E4Activator.application = null;
	}

	private void startApplication(String applicationHome, String adminKey) throws Exception {

		// bundle
		Bundle bundle = E4Activator.application.getBundle();

		// logs
		Logs.reset(E4Activator.application.getLogs());

		// keys
		setApplicationKeys(E4Activator.application, adminKey);

		// path
		setApplicationPaths(E4Activator.application.getPaths(), applicationHome);

		// context
		ContextRoot contextApplication = new E4ContextRootImpl(bundle.getBundleContext(), E4Activator.application.getContextDescription());
		contextApplication.set(Application.class, E4Activator.application);
		contextApplication.set(ApplicationPaths.class, E4Activator.application.getPaths());
		contextApplication.set(ContextRoot.class, contextApplication);

		E4Activator.application.setContext(contextApplication);

		// registry
		RegistryFactory registryFactory = new BaseRegistryFactoryImpl(contextApplication);
		application.getContext().set(RegistryFactory.class, registryFactory);

		// thread
		ThreadManager threadManager = new BaseThreadManagerImpl();
		application.getContext().set(ThreadManager.class, threadManager);

		Runnable applicationManager = new E4ApplicationStarter(E4Activator.application);
		thread = threadManager.createThread(application.getName(), applicationManager, false);

		ClassLoader bundleLoader = bundle.adapt(BundleWiring.class).getClassLoader();
		thread.getJavaThread().setContextClassLoader(bundleLoader);

		threadManager.start(thread);
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