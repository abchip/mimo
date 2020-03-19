/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public final class E4EquinoxApplicationImpl implements IApplication {

	private Application application = null;
	private ApplicationManager applicationManager;

	@Override
	public final Object start(IApplicationContext context) throws Exception {

		String applicationConfig = null;
		String applicationHome = null;

		String[] arguments = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		for (int i = 0; i < arguments.length; i++) {
			if (arguments[i].equals("-mimo.config")) {
				applicationConfig = arguments[i + 1];
				i++;
				continue;
			} else if (arguments[i].equals("-mimo.home")) {
				applicationHome = arguments[i + 1];
				i++;
				continue;
			}
		}

		BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(MimoConstants.APPLICATION_CONFIG, true);
		bundleContext.registerService(String.class, applicationConfig, properties);

		context.applicationRunning();

		if (applicationConfig == null) {
			System.out.println("Configuration required: see -mimo.config parameter");

			return waitForStopOrRestart();
		}

		return waitForStopOrRestart();
	}

	private Object waitForStopOrRestart() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				if (applicationManager == null)
					continue;

				// if (applicationManager.restart(application))
				// return EXIT_RESTART;
				// if ()
				//
			} catch (InterruptedException e) {
				applicationManager.stop(application);
				return EXIT_OK;
			}
		}
	}

	@Override
	public final void stop() {
		System.out.println("Stopping " + application.getText());
		applicationManager.stop(application);
	}

}
