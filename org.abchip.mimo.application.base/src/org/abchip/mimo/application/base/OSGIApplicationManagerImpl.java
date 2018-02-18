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
package org.abchip.mimo.application.base;

import java.io.OutputStream;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.base.OSGIApplicationStarter;

public class OSGIApplicationManagerImpl implements ApplicationManager {

	private boolean restart = false;
	private boolean stop = false;

	@Override
	public Application start(Class<?> context, Application application, OutputStream output) {

		try {
			// Start application
			return new OSGIApplicationStarter(application, output).start();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void restart() {
		restart = true;
	}

	@Override
	public boolean restartCalled() {
		return restart;
	}

	@Override
	public void stop() {
		stop = true;
	}

	@Override
	public boolean stopCalled() {
		return stop;
	}

}
