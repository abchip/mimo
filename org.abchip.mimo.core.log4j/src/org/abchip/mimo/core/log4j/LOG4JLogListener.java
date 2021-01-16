/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.log4j;

import java.util.Map;
import java.util.WeakHashMap;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.LogListener;

public final class LOG4JLogListener implements LogListener {

	private static final Level AUDIT = Level.forName("AUDIT", 50);
	private Map<String, Logger> loggers = new WeakHashMap<String, Logger>();

	@Override
	public void logged(LogEntry logEntry) {

		Logger logger = getLogger(logEntry);

		String message = logEntry.getMessage();
		LogLevel level = logEntry.getLogLevel();
		switch (level) {
		case AUDIT:
			logger.log(AUDIT, message);
			break;
		case DEBUG:
			logger.debug(message);
			break;
		case ERROR:
			logger.error(message);
			break;
		case INFO:
			logger.info(message);
			break;
		case TRACE:
			logger.trace(message);
			break;
		case WARN:
			logger.warn(message);
			break;
		}
	}

	private Logger getLogger(LogEntry logEntry) {

		Logger logger = loggers.get(logEntry.getLoggerName());
		if (logger == null) {
			logger = LogManager.getLogger(logEntry.getLoggerName());
			loggers.put(logEntry.getLoggerName(), logger);
		}

		return logger;
	}
}
