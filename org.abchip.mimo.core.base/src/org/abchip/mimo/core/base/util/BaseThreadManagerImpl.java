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
package org.abchip.mimo.core.base.util;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.util.UtilFactory;
import org.abchip.mimo.util.ThreadManager;
import org.abchip.mimo.util.Threads;

public class BaseThreadManagerImpl implements ThreadManager {

	private Map<Long, BaseThreadTime> currentTimes = new HashMap<Long, BaseThreadTime>();
	private Map<Long, Long> previousCpuTimes = new HashMap<Long, Long>();

	private Threads threads;
	private long totalCpuTime = 0;

	@Inject
	public BaseThreadManagerImpl(Threads threads) {
		this.threads = threads;

		org.abchip.mimo.util.Thread thread = createThread("cpu-monitor", new BaseThreadsMonitor(this), true);
		start(thread);
	}

	protected long getCpuTime() {
		return totalCpuTime;
	}

	protected BaseThreadTime getThreadTime(Thread thread) {
		return currentTimes.get(thread.getId());
	}

	@Override
	public org.abchip.mimo.util.Thread createThread(String name, Runnable runnable) {
		return createThread(name, runnable, false);
	}

	@Override
	public org.abchip.mimo.util.Thread createThread(String name, Runnable runnable, boolean daemon) {

		BaseThreadImpl thread = new BaseThreadImpl(this, runnable, "mimo://thread/" + name, daemon);
		return thread;
	}

	@Override
	public List<org.abchip.mimo.util.Thread> listThreads() {

		List<org.abchip.mimo.util.Thread> threads = new ArrayList<org.abchip.mimo.util.Thread>();

		for (Thread thread : Threads.qINSTANCE.listThreads()) {
			if (thread == null)
				continue;

			if (thread instanceof org.abchip.mimo.util.Thread)
				threads.add((org.abchip.mimo.util.Thread) thread);
			else
				threads.add(new BaseThreadAdapter(this, thread));
		}

		return threads;
	}

	@Override
	public org.abchip.mimo.util.Thread lookupThread(long id) {

		Thread thread = threads.lookupThread(id);
		if (thread instanceof org.abchip.mimo.util.Thread)
			return (org.abchip.mimo.util.Thread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@Override
	public org.abchip.mimo.util.Thread lookupThread(String name) {

		Thread thread = threads.lookupThread(name);
		if (thread instanceof org.abchip.mimo.util.Thread)
			return (org.abchip.mimo.util.Thread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void release(org.abchip.mimo.util.Thread thread) {
		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			baseThreadImpl.unlock();
		} else
			thread.getJavaThread().resume();
	}

	@Override
	public void start(org.abchip.mimo.util.Thread thread) {
		thread.getJavaThread().start();
	}

	@Override
	public void stop(org.abchip.mimo.util.Thread thread) {
		thread.getJavaThread().interrupt();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void suspend(org.abchip.mimo.util.Thread thread) {

		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			if(!baseThreadImpl.isSuspended())
				baseThreadImpl.lock();
		} else
			thread.getJavaThread().suspend();
	}

	@Override
	public org.abchip.mimo.util.Thread currentThread() {

		Thread currentThread = Thread.currentThread();
		if (currentThread instanceof org.abchip.mimo.util.Thread)
			return (org.abchip.mimo.util.Thread) currentThread;
		else
			return new BaseThreadAdapter(this, currentThread);
	}

	protected synchronized void refreshCPUUsage() {

		ThreadMXBean thBean = ManagementFactory.getThreadMXBean();
		HashMap<Long, BaseThreadTime> newTimes = new HashMap<Long, BaseThreadTime>();

		for (Thread thread : threads.listThreads()) {
			// TODO remove me
			if (thread == null)
				continue;

			BaseThreadTime currentThreadTime = this.currentTimes.get(thread.getId());
			long cpuTime = thBean.getThreadCpuTime(thread.getId());
			Long previousCpuTime = previousCpuTimes.get(thread.getId());
			double cpuUsage = 0;
			previousCpuTimes.put(thread.getId(), cpuTime);
			if (previousCpuTime != null)
				cpuUsage = Math.min((cpuTime - previousCpuTime) / 10000000d, 100);
			previousCpuTimes.put(thread.getId(), cpuTime);
			
			if (currentThreadTime == null) 
				newTimes.put(thread.getId(), new BaseThreadTime(cpuUsage));
			else  {
				currentThreadTime.setCPUUsage(cpuUsage);
				newTimes.put(thread.getId(), new BaseThreadTime(cpuUsage));
			}
		}

		this.currentTimes = newTimes;
	}

	@Override
	public org.abchip.mimo.util.ThreadInfo getThreadInfo(org.abchip.mimo.util.Thread thread) {

		org.abchip.mimo.util.ThreadInfo threadInfo = UtilFactory.eINSTANCE.createThreadInfo();

		threadInfo.setThreadName(thread.getThreadName());
	
		threadInfo.setThreadId(thread.getThreadID());
		threadInfo.setThreadPriority(thread.getThreadPriority());
		threadInfo.setThreadCPUUsage(thread.getThreadCPUUsage());
		threadInfo.setThreadStatus(thread.getThreadStatus());
		threadInfo.setThreadRunnable(thread.checkRunnable());
		threadInfo.setThreadInterrupted(thread.isInterrupted());
		threadInfo.setThreadNative(thread.isNative());
		threadInfo.setThreadSuspended(thread.isSuspended());
		threadInfo.setThreadDaemon(thread.isThreadDaemon());

		return threadInfo;
		
	}
}