/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.util;

import java.lang.management.ThreadInfo;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.util.ThreadStatus;
import org.abchip.mimo.util.Threads;


public class BaseThreadAdapter implements org.abchip.mimo.util.Thread {

	private static final long serialVersionUID = 1L;
	private Thread thread;
	private BaseThreadManagerImpl threadManager = null;

	public BaseThreadAdapter(BaseThreadManagerImpl threadManager, Thread thread) {
		this.threadManager = threadManager;
		this.thread = thread;
	}

	@Override
	public String getThreadName() {
		return thread.getName();
	}

	@Override
	public ThreadStatus getThreadStatus() {
		return BaseThreadHelper.getThreadStatus(thread.getState());
	}

	@Override
	public long getThreadID() {
		return thread.getId();
	}

	@Override
	public int getThreadPriority() {
		return getJavaThread().getPriority();
	}

	@Override
	public boolean isThreadDaemon() {
		return getJavaThread().isDaemon();
	}

	@Override
	public Thread getJavaThread() {
		return thread;
	}

	@Override
	public boolean checkRunnable() {
		return false;
	}

	@Override
	public boolean isNative() {
		return false;
	}

	@Override
	public boolean isSuspended() {
		ThreadInfo threadInfo = Threads.qINSTANCE.lookupThreadInfo(getJavaThread());
		if (threadInfo != null)
			return threadInfo.isSuspended();
		else
			return false;
	}
	
	@Override
	public boolean isInterrupted() {
		return getJavaThread().isInterrupted();
	}
	
	@Override
	public double getThreadCPUUsage() {

		BaseThreadTime threadTime = threadManager.getThreadTime(getJavaThread());
		if (threadTime == null)
			return 0;

		return threadTime.getCPUUsage();
	}

	@Override
	public <E extends Entity> Frame<E> isa() {
		// TODO Auto-generated method stub
		return null;
	}
}