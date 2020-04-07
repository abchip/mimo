/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.application.Application;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;
import org.osgi.service.log.admin.LoggerAdmin;
import org.osgi.service.log.admin.LoggerContext;

public class Logs {

	private static LoggerFactory loggerFactory = null;
	private static LoggerAdmin loggerAdmin = null;

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

			LoggerAdmin loggerAdmin = getLoggerAdmin();

			LoggerContext rootLoggerContext = loggerAdmin.getLoggerContext(bundle.getSymbolicName());
			Map<String, LogLevel> rootLogLevels = rootLoggerContext.getLogLevels();

			Map<String, LogLevel> copyLogLevels = new HashMap<>(rootLogLevels);
			copyLogLevels.put(Logger.ROOT_LOGGER_NAME, LogLevel.TRACE);
			rootLoggerContext.setLogLevels(copyLogLevels);

		}

		return loggerFactory;
	}

	private static LoggerAdmin getLoggerAdmin() {

		if (loggerAdmin == null) {
			Bundle bundle = FrameworkUtil.getBundle(Logs.class);
			BundleContext bundleContext = bundle.getBundleContext();

			ServiceReference<LoggerAdmin> loggerAdmin = bundleContext.getServiceReference(LoggerAdmin.class);
			Logs.loggerAdmin = bundleContext.getService(loggerAdmin);
		}

		return loggerAdmin;
	}
}