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
import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.base.app.BaseApplicationManagerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class E4Activator implements BundleActivator {

	private ServiceRegistration<ApplicationManager> applicationManagerRegistration;
	private static Application application;

	protected static void setApplication(Application application) {
		E4Activator.application = application;
	}

	public static Application getApplication() {
		return E4Activator.application;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		this.applicationManagerRegistration = context.registerService(ApplicationManager.class, new BaseApplicationManagerImpl(), null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());
	}

	public static Application loadApplication(String applicationConfig) throws IOException {

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

		return (Application) resource.getContents().get(0);
	}

	@SuppressWarnings("resource")
	public static void startApplication(BundleContext bundleContext, Application application) {

		// context
		ContextRoot contextApplication = new E4ContextRootImpl(bundleContext, application.getContextDescription());
		contextApplication.set(Application.class, application);
		contextApplication.set(ApplicationPaths.class, application.getPaths());
		contextApplication.set(ContextRoot.class, contextApplication);

		application.setContext(contextApplication);

		ApplicationManager applicationManager = contextApplication.get(ApplicationManager.class);

		try {
			E4Activator.setApplication(application);
			System.out.println("Starting " + application);
			applicationManager.start(application, System.out);
			System.out.println("Started " + application);
		} catch (Exception e) {
			E4Activator.setApplication(null);
			System.err.println("Failed " + application);
			throw e;
		}
	}
}
