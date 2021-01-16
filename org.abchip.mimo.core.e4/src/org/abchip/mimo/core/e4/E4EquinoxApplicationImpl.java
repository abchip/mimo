/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.util.concurrent.TimeUnit;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public final class E4EquinoxApplicationImpl implements IApplication {

	@Override
	public final Object start(IApplicationContext context) throws Exception {
		return waitForStopOrRestart();
	}

	private Object waitForStopOrRestart() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				return EXIT_OK;
			}
		}
	}

	@Override
	public final void stop() {
	}
}
