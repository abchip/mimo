/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationLogs;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.util.Logs;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.admin.LoggerContext;

public class LogCommands extends BaseCommands {

	@Inject
	public LogCommands(Application application) {
		super(application);
	}

	public void _logSet(CommandInterpreter interpreter) throws Exception {

		this.getContext();

		String bundle = nextArgument(interpreter);
		if (bundle == null)
			return;

		String bundleLevel = nextArgument(interpreter);
		if (bundleLevel == null)
			return;

		LoggerContext loggerContext = Logs.getLoggerContext();
		if (loggerContext == null)
			return;

		// root
		Map<String, LogLevel> logLevels = new HashMap<>(loggerContext.getLogLevels());

		// package
		logLevels.put(bundle, LogLevel.valueOf(bundleLevel));

		loggerContext.setLogLevels(logLevels);
	}

	public void _logReset(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		LoggerContext loggerContext = Logs.getLoggerContext();
		if (loggerContext == null)
			return;

		ApplicationLogs applicationLogs = context.get(Application.class).getLogs();

		Logs.reset(applicationLogs);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
