/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.ctx;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.util.Threads;

public class BaseThreadManagerImpl implements ThreadManager {

	private Map<Long, BaseThreadTime> currentTimes = new HashMap<Long, BaseThreadTime>();
	private Map<Long, Long> previousCpuTimes = new HashMap<Long, Long>();

	private long totalCpuTime = 0;

	public BaseThreadManagerImpl() {
		org.abchip.mimo.context.Thread thread = createThread("cpu-monitor", new BaseThreadsMonitor(this), true);
		start(thread);
	}

	protected long getCpuTime() {
		return totalCpuTime;
	}

	protected BaseThreadTime getThreadTime(Thread thread) {
		return currentTimes.get(thread.getId());
	}

	@Override
	public org.abchip.mimo.context.Thread createThread(String name, Runnable runnable) {
		return createThread(name, runnable, false);
	}

	@Override
	public org.abchip.mimo.context.Thread createThread(String name, Runnable runnable, boolean daemon) {

		BaseThreadImpl thread = new BaseThreadImpl(this, runnable, name, daemon);
		return thread;
	}

	@Override
	public List<org.abchip.mimo.context.Thread> listThreads() {

		List<org.abchip.mimo.context.Thread> threads = new ArrayList<org.abchip.mimo.context.Thread>();

		for (Thread thread : Threads.listThreads()) {
			if (thread == null)
				continue;

			if (thread instanceof org.abchip.mimo.context.Thread)
				threads.add((org.abchip.mimo.context.Thread) thread);
			else
				threads.add(new BaseThreadAdapter(this, thread));
		}

		return threads;
	}

	@Override
	public org.abchip.mimo.context.Thread lookupThread(long id) {

		Thread thread = Threads.lookupThread(id);
		if (thread instanceof org.abchip.mimo.context.Thread)
			return (org.abchip.mimo.context.Thread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@Override
	public org.abchip.mimo.context.Thread lookupThread(String name) {

		Thread thread = Threads.lookupThread(name);
		if (thread instanceof org.abchip.mimo.context.Thread)
			return (org.abchip.mimo.context.Thread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void release(org.abchip.mimo.context.Thread thread) {
		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			baseThreadImpl.unlock();
		} else
			thread.getJavaThread().resume();
	}

	@Override
	public void start(org.abchip.mimo.context.Thread thread) {
		thread.getJavaThread().start();
	}

	@Override
	public void stop(org.abchip.mimo.context.Thread thread) {
		thread.getJavaThread().interrupt();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void suspend(org.abchip.mimo.context.Thread thread) {

		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			if (!baseThreadImpl.isSuspended())
				baseThreadImpl.lock();
		} else
			thread.getJavaThread().suspend();
	}

	@Override
	public org.abchip.mimo.context.Thread currentThread() {

		Thread currentThread = Thread.currentThread();
		if (currentThread instanceof org.abchip.mimo.context.Thread)
			return (org.abchip.mimo.context.Thread) currentThread;
		else
			return new BaseThreadAdapter(this, currentThread);
	}

	protected synchronized void refreshCPUUsage() {

		ThreadMXBean thBean = ManagementFactory.getThreadMXBean();
		HashMap<Long, BaseThreadTime> newTimes = new HashMap<Long, BaseThreadTime>();

		for (Thread thread : Threads.listThreads()) {
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
			else {
				currentThreadTime.setCPUUsage(cpuUsage);
				newTimes.put(thread.getId(), new BaseThreadTime(cpuUsage));
			}
		}

		this.currentTimes = newTimes;
	}

	@Override
	public org.abchip.mimo.context.ThreadInfo getThreadInfo(org.abchip.mimo.context.Thread thread) {

		org.abchip.mimo.context.ThreadInfo threadInfo = ContextFactory.eINSTANCE.createThreadInfo();

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