/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.e4;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class E4EquinoxApplicationImpl implements IApplication {

	private Application application = null;
	private ApplicationManager applicationManager;

	@Override
	public Object start(IApplicationContext context) throws Exception {

		String applicationConfig = null;
		String applicationName = null;
		String applicationPort = null;
		
		String[] arguments = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		for (int i = 0; i < arguments.length; i++) {
			if (arguments[i].equals("-mimo.config")) {
				applicationConfig = arguments[i + 1];
				i++;
				continue;
			}
			else if (arguments[i].equals("-mimo.application.name")) {
				applicationName = arguments[i + 1];
				i++;
				continue;
			}
			else if (arguments[i].equals("-mimo.application.port")) {
				applicationPort = arguments[i + 1];
				i++;
				continue;
			}
		}

		context.applicationRunning();

		if (applicationConfig == null) {
			System.out.println("Configuration required: see -mimo.config parameter");

			return waitForStopOrRestart();
		}
		// BundleContext bundleContext =
		// InternalPlatform.getDefault().getBundleContext();
		// Load application
		ApplicationPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = null;
		
		if(applicationConfig.startsWith("http"))
			uri = URI.createURI(applicationConfig);
		else
			uri = URI.createFileURI(applicationConfig);
		
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		application = (Application) resource.getContents().get(0);

		if(applicationName != null)
			application.setName(applicationName);
		
		if(applicationPort != null)
			application.setPort(Integer.parseInt(applicationPort));

		// context
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		
		BundleContext bundleContext = bundle.getBundleContext();		
		E4ContextRootImpl contextApplication = new E4ContextRootImpl(bundleContext, UUID.randomUUID().toString(), application.getContextDescription());
		contextApplication.set(Application.class, application);
		contextApplication.set(ContextRoot.class, contextApplication);
		application.setContext(contextApplication);

		// application manager
		ServiceReference<ApplicationManager> applicationManagerReference = bundleContext.getServiceReference(ApplicationManager.class);
		applicationManager = bundleContext.getService(applicationManagerReference);
		
		System.out.println("Starting " + application);
		applicationManager.start(this.getClass(), application, System.out);
		
		return waitForStopOrRestart();
	}

	private Object waitForStopOrRestart() {
		while(true) {
			try {
				if(applicationManager == null)
					continue;
			    TimeUnit.MILLISECONDS.sleep(1000);
			    if (applicationManager.restartCalled()) 
			    	return EXIT_RESTART;
			    if (applicationManager.stopCalled()) 
			    	return EXIT_OK;
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void stop() {
		System.out.println("Stopping " + application.getText());
		applicationManager.stop();
	}

}
