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

import org.abchip.mimo.Mimo;
import org.abchip.mimo.application.ApplicationLogEntry;
import org.abchip.mimo.application.ApplicationLogs;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;
import org.osgi.service.log.admin.LoggerAdmin;
import org.osgi.service.log.admin.LoggerContext;

public class Logs {

	private static LoggerFactory loggerFactory = null;
	private static LoggerAdmin loggerAdmin = null;
	private static LogReaderService logReaderService = null;

	public static Logger getLogger(Class<?> context) {
		return getLogger(context.getName());
	}

	public static Logger getLogger(String name) {

		LoggerFactory loggerFactory = getLoggerFactory();
		if (loggerFactory == null)
			throw new RuntimeException("Unexpected condition: b96v46rebt0are66t0b465");

		Logger logger = loggerFactory.getLogger(name);
		return logger;
	}

	public static LoggerFactory getLoggerFactory() {

		if (loggerFactory == null) {
			Bundle bundle = FrameworkUtil.getBundle(Mimo.class);
			BundleContext bundleContext = bundle.getBundleContext();

			ServiceReference<LoggerFactory> loggerFactory = bundleContext.getServiceReference(LoggerFactory.class);
			Logs.loggerFactory = bundleContext.getService(loggerFactory);
		}

		return loggerFactory;
	}

	public static LoggerAdmin getLoggerAdmin() {

		if (loggerAdmin == null) {
			Bundle bundle = FrameworkUtil.getBundle(Mimo.class);
			BundleContext bundleContext = bundle.getBundleContext();

			ServiceReference<LoggerAdmin> loggerAdmin = bundleContext.getServiceReference(LoggerAdmin.class);
			Logs.loggerAdmin = bundleContext.getService(loggerAdmin);
		}

		return loggerAdmin;
	}

	public static LoggerContext getLoggerContext() {

		LoggerAdmin loggerAdmin = Logs.getLoggerAdmin();
		if (loggerAdmin == null)
			return null;

		Bundle bundle = FrameworkUtil.getBundle(Mimo.class);
		LoggerContext loggerContext = loggerAdmin.getLoggerContext(bundle.getSymbolicName());

		return loggerContext;
	}

	public static LogReaderService getLogReaderService() {

		if (logReaderService == null) {
			Bundle bundle = FrameworkUtil.getBundle(Mimo.class);
			BundleContext bundleContext = bundle.getBundleContext();

			ServiceReference<LogReaderService> logReaderService = bundleContext.getServiceReference(LogReaderService.class);
			Logs.logReaderService = bundleContext.getService(logReaderService);
		}

		return logReaderService;
	}

	public static void reset(ApplicationLogs applicationLogs) {

		if (applicationLogs == null)
			return;

		LoggerContext loggerContext = Logs.getLoggerContext();
		if (loggerContext == null)
			return;

		// root
		Map<String, LogLevel> logLevels = new HashMap<>();
		logLevels.put(Logger.ROOT_LOGGER_NAME, LogLevel.valueOf(applicationLogs.getLevel().getLiteral()));

		// packages
		for (ApplicationLogEntry applicationLogEntry : applicationLogs.getEntries())
			logLevels.put(applicationLogEntry.getPackage(), LogLevel.valueOf(applicationLogEntry.getLevel().getLiteral()));

		loggerContext.setLogLevels(logLevels);
	}
}