/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.ctx;

import java.util.concurrent.atomic.AtomicBoolean;

import org.abchip.mimo.context.ThreadStatus;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;

public class BaseThreadImpl extends Thread implements org.abchip.mimo.context.Thread {

	private final AtomicBoolean locked = new AtomicBoolean();
	private BaseThreadManagerImpl threadManager = null;
	
	protected BaseThreadImpl(BaseThreadManagerImpl threadManager, Runnable runnable, String name, boolean daemon) {
		super(runnable, name);
		this.threadManager = threadManager;
		setDaemon(daemon);
	}

	@Override
	public Thread getJavaThread() {
		return this;
	}

	@Override
	public boolean checkRunnable() {
		
		boolean result = true;

		if (isSuspended() || locked.get())
			result = false;
							
		return result;
				
	}

	@Override
	public long getThreadID() {
		return getJavaThread().getId();
	}

	@Override
	public String getThreadName() {
		return getJavaThread().getName();
	}

	@Override
	public int getThreadPriority() {
		return getJavaThread().getPriority();
	}

	@Override
	public ThreadStatus getThreadStatus() {
		return BaseThreadHelper.getThreadStatus(getJavaThread().getState());
	}

	@Override
	public boolean isThreadDaemon() {
		return getJavaThread().isDaemon();
	}

	@Override
	public boolean isNative() {
		return true;
	}

	@Override
	public boolean isSuspended() {
		return locked.get();
	}

	protected void unlock() {
		if(locked.get())
			locked.set(false);
	}

	protected void lock() {
		locked.set(true);
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

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource() {
		// TODO Auto-generated method stub
		return null;
	}
}