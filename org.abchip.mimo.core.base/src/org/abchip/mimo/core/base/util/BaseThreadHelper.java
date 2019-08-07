/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import java.lang.Thread.State;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import org.abchip.mimo.util.ThreadStatus;


public class BaseThreadHelper {

	public static org.abchip.mimo.util.ThreadStatus getThreadStatus(State state) {

		switch (state) {
		case NEW:
			return ThreadStatus.NEW;
		case RUNNABLE:
			return ThreadStatus.RUNNABLE;
		case TIMED_WAITING:
			return ThreadStatus.TIMED_WAITING;
		case BLOCKED:
			return ThreadStatus.BLOCKED;
		case WAITING:
			return ThreadStatus.WAITING;
		case TERMINATED:
			return ThreadStatus.TERMINATED;
		}
		
		return null;
	}

	public static long getThreadCPUTime(long threadId) {

		ThreadMXBean thbean = ManagementFactory.getThreadMXBean();
		long cpuTime = thbean.getThreadCpuTime(threadId);

		return cpuTime;
	}
}
