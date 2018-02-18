/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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

import java.text.SimpleDateFormat;
import java.util.Date;

import org.abchip.mimo.context.Logger;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class E4LoggerImpl implements Logger {

	private LogService logService = new OSGILogService("E4Logger");
	
	@Override
	public void debug(String message) {
		logService.log(LogService.LOG_DEBUG, message);		
	}

	@Override
	public void debug(Throwable throwable) {
		logService.log(LogService.LOG_DEBUG,  null, throwable);		
	}

	@Override
	public void debug(String message, Throwable throwable) {
		logService.log(LogService.LOG_DEBUG, message, throwable);		
	}

	@Override
	public void error(String message) {
		logService.log(LogService.LOG_ERROR, message);
	}

	@Override
	public void error(Throwable throwable) {
		logService.log(LogService.LOG_ERROR, null, throwable);
	}

	@Override
	public void error(String message, Throwable throwable) {
		logService.log(LogService.LOG_ERROR, message, throwable);
	}
	
	@Override
	public void info(String message) {
		logService.log(LogService.LOG_INFO, message);
	}

	@Override
	public void info(Throwable throwable) {
		logService.log(LogService.LOG_INFO, null, throwable);
	}

	@Override
	public void info(String message, Throwable throwable) {
		logService.log(LogService.LOG_INFO, message, throwable);
	}

	@Override
	public void warning(String message) {
		logService.log(LogService.LOG_WARNING, message);
	}

	@Override
	public void warning(Throwable throwable) {
		logService.log(LogService.LOG_WARNING, null, throwable);
	}

	@Override
	public void warning(String message, Throwable throwable) {
		logService.log(LogService.LOG_WARNING, message, throwable);
	}
	
	private static class OSGILogService implements LogService {
		
		private static final SimpleDateFormat dateFormat = new SimpleDateFormat("Z yyyy.MM.dd HH:mm:ss:S");
		private final String pluginName;

		public OSGILogService(String pluginName) {
			this.pluginName = pluginName;
		}

		private static final String getLogCode(int level) {
			switch (level) {
			case 3:
				return "INFO";
			case 1:
				return "ERROR";
			case 4:
				return "DEBUG";
			case 2:
				return "WARNING";
			}
			return "UNKNOWN";
		}

		private final void doLog(ServiceReference<?> sr, int level, String message, Throwable t) {
			StringBuffer buf = new StringBuffer("[log;");
			buf.append(dateFormat.format(new Date())).append(";");
			buf.append(getLogCode(level)).append(";");
			if (sr != null)
				buf.append(sr.getBundle().getSymbolicName()).append(";");
			else
				buf.append(this.pluginName).append(";");

			if (t != null) {
//				t.printStackTrace(System.err);
				buf.append(t.getMessage()+";");
				buf.append(message).append("]");
				System.err.println(buf.toString());
			} else {
				buf.append(message).append("]");
				System.out.println(buf.toString());
			}
		}

		public void log(int level, String message) {
			log(null, level, message, null);
		}

		public void log(int level, String message, Throwable exception) {
			doLog(null, level, message, exception);
		}

		@SuppressWarnings("rawtypes")
		public void log(ServiceReference sr, int level, String message) {
			log(sr, level, message, null);
		}

		@SuppressWarnings("rawtypes")
		public void log(ServiceReference sr, int level, String message, Throwable exception) {
			doLog(sr, level, message, exception);
		}
	}	
}