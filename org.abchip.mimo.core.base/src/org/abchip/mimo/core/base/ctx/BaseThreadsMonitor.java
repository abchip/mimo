/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.ctx;

public class BaseThreadsMonitor implements Runnable {

	private BaseThreadManagerImpl threadManager;

	public BaseThreadsMonitor(BaseThreadManagerImpl threadManager) {
		this.threadManager = threadManager;
	}

	@Override
	public void run() {
		while (threadManager.currentThread().checkRunnable()) {

			try {
				Thread.sleep(1000);
				threadManager.refreshCPUUsage();
			} catch (InterruptedException e) {
				break;
			}
		}
	}

}
