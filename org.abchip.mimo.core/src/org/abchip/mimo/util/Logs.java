/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import org.abchip.mimo.application.Application;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

public class Logs {

	private static LoggerFactory loggerFactory = null;

	public static org.osgi.service.log.Logger getLogger(Class<?> context) {

		LoggerFactory loggerFactory = getLoggerFactory();
		if (loggerFactory == null)
			System.err.println("Unexpected condition: b96v46rebt0are66t0b465");

		Logger logger = loggerFactory.getLogger(context.getName());
		return logger;
	}

	private static LoggerFactory getLoggerFactory() {

		if (loggerFactory == null) {
			Bundle bundle = FrameworkUtil.getBundle(Application.class);
			BundleContext bundleContext = bundle.getBundleContext();

			ServiceReference<LoggerFactory> loggerFactory = bundleContext.getServiceReference(LoggerFactory.class);
			Logs.loggerFactory = bundleContext.getService(loggerFactory);
		}

		return loggerFactory;
	}

}