/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.log4j;

import org.abchip.mimo.util.Logs;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogReaderService;

public class LOG4JActivator implements BundleActivator {

	private LOG4JLogListener logger = null;

	@Override
	public void start(final BundleContext context) throws Exception {
		
		this.logger = new LOG4JLogListener();
		
		LogReaderService reader = Logs.getLogReaderService();
		if (reader == null)
			return;

		reader.addLogListener(logger);
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		LogReaderService reader = Logs.getLogReaderService();
		if (reader == null)
			return;

		reader.removeLogListener(logger);
		
		this.logger = null;
	}
}