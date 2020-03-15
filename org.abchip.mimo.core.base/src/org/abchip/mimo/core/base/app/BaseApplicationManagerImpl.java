/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.app;

import java.io.OutputStream;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;

public class BaseApplicationManagerImpl implements ApplicationManager {

	@Override
	public void start(Application application, OutputStream output) {

		try {
			// Start application
			new BaseApplicationStarter(application, output).start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean restart(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stop(Application application) {
		application.getContext().close();
		return true;
	}
}
