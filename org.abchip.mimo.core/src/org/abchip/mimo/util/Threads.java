/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.lang.management.ManagementFactory;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.List;

public class Threads {

	private static ThreadGroup rootThreadGroup = null;

	public static List<Thread> listThreads() {
		ThreadGroup rootThreadGroup = getRootThreadGroup();
		ThreadMXBean thbean = ManagementFactory.getThreadMXBean();

		int size = thbean.getThreadCount();
		int n = 0;
		Thread[] threads = null;
		do {
			size *= 2;
			threads = new Thread[size];
			n = rootThreadGroup.enumerate(threads, true);
		} while (n == size);

		return java.util.Arrays.asList(threads);
	}

	public List<Thread> listThreads(String threadGroup) {
		ThreadGroup group = lookupThreadGroup(threadGroup);
		if (group == null)
			return null;
		return listThreads(group);

	}

	public List<Thread> listThreads(ThreadGroup threadGroup) {
		int size = threadGroup.activeCount();
		int n = 0;
		Thread[] threads = null;
		do {
			size *= 2;
			threads = new Thread[size];
			n = threadGroup.enumerate(threads, false);
		} while (n == size);
		return java.util.Arrays.asList(threads);

	}

	public List<ThreadGroup> listThreadGroups() {
		ThreadGroup root = getRootThreadGroup();
		int size = root.activeGroupCount();
		int n = 0;
		ThreadGroup[] groups = null;
		do {
			size *= 2;
			groups = new ThreadGroup[size];
			n = root.enumerate(groups, true);
		} while (n == size);
		ThreadGroup[] allGroups = new ThreadGroup[n + 1];
		allGroups[0] = root;
		System.arraycopy(groups, 0, allGroups, 1, n);
		return java.util.Arrays.asList(allGroups);
	}

	public List<ThreadInfo> listThreadInfos() {
		ThreadMXBean thbean = ManagementFactory.getThreadMXBean();
		long[] threadIds = thbean.getAllThreadIds();

		ThreadInfo[] infos;
		if (!thbean.isObjectMonitorUsageSupported() || !thbean.isSynchronizerUsageSupported())
			infos = thbean.getThreadInfo(threadIds);
		else
			infos = thbean.getThreadInfo(threadIds, true, false);

		ThreadInfo[] notNulls = new ThreadInfo[infos.length];
		int nNotNulls = 0;
		for (ThreadInfo info : infos)
			if (info != null)
				notNulls[nNotNulls++] = info;

		if (nNotNulls == infos.length)
			return java.util.Arrays.asList(infos);

		return java.util.Arrays.asList(notNulls);
	}

	public Thread lookupBlockingThread(Thread thread) {
		ThreadInfo info = lookupThreadInfo(thread);
		if (info == null)
			return null;
		long id = info.getLockOwnerId();
		if (id == -1)
			return null;
		return lookupThread(id);
	}

	public Thread lookupLockingThread(Object object) {

		long identity = System.identityHashCode(object);

		ThreadInfo info = null;
		MonitorInfo[] monitors = null;
		for (Thread thread : listThreads()) {
			info = lookupThreadInfo(thread.getId());
			if (info == null)
				continue;
			monitors = info.getLockedMonitors();
			for (MonitorInfo monitor : monitors)
				if (identity == monitor.getIdentityHashCode())
					return thread;
		}
		return null;
	}

	public static Thread lookupThread(long id) {
		for (Thread thread : listThreads())
			if (thread.getId() == id)
				return thread;
		return null;
	}

	public static Thread lookupThread(String name) {
		for (Thread thread : listThreads())
			if (thread.getName().equals(name))
				return thread;
		return null;
	}

	public Thread lookupThread(ThreadInfo info) {
		return lookupThread(info.getThreadId());
	}

	public ThreadGroup lookupThreadGroup(String name) {
		for (ThreadGroup group : listThreadGroups())
			if (group.getName().equals(name))
				return group;
		return null;
	}

	public static ThreadInfo lookupThreadInfo(long id) {
		ThreadMXBean thbean = ManagementFactory.getThreadMXBean();

		if (!thbean.isObjectMonitorUsageSupported() || !thbean.isSynchronizerUsageSupported())
			return thbean.getThreadInfo(id);

		ThreadInfo[] infos = thbean.getThreadInfo(new long[] { id }, true, false);
		if (infos.length == 0)
			return null;
		return infos[0];
	}

	public static ThreadInfo lookupThreadInfo(Thread thread) {
		return Threads.lookupThreadInfo(thread.getId());
	}

	public ThreadInfo lookupThreadInfo(String name) {

		for (Thread thread : listThreads())
			if (thread.getName().equals(name))
				return lookupThreadInfo(thread.getId());
		return null;

	}

	private static ThreadGroup getRootThreadGroup() {

		if (rootThreadGroup != null)
			return rootThreadGroup;

		synchronized (Threads.class) {
			if (rootThreadGroup == null) {
				ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
				ThreadGroup parentThreadGroup = null;
				while ((parentThreadGroup = threadGroup.getParent()) != null)
					threadGroup = parentThreadGroup;

				rootThreadGroup = threadGroup;
			}
		}

		return rootThreadGroup;
	}
}
