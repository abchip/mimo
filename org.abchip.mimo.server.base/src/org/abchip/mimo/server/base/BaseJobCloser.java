/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.base;

import java.util.Date;
import java.util.Iterator;

import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.server.JobStatus;
import org.abchip.mimo.server.ServerHelper;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class BaseJobCloser implements Runnable {

	private static final Logger LOGGER = Logs.getLogger(BaseJobCloser.class);

	private JobManager jobManager;
	private ThreadManager threadManager;

	public BaseJobCloser(ThreadManager threadManager, JobManager jobManager) {
		this.threadManager = threadManager;
		this.jobManager = jobManager;
	}

	@Override
	public void run() {

		while (threadManager.currentThread().checkRunnable()) {

			try {
				Thread.sleep(60 * 1000);
			} catch (InterruptedException e) {
				break;
			}

			Iterator<Job> iterator = jobManager.getActiveJobs().iterator();
			Job tmpJob = null;
			while (iterator.hasNext()) {
				tmpJob = iterator.next();

				switch (tmpJob.getJobStatus()) {
				case ACTIVE:

					Date creationDate = tmpJob.getCreationDate();
					Date now = ServerHelper.now();

					long seconds = (now.getTime() - creationDate.getTime()) / 1000;

					// 12 hour
					if (seconds > 12 * 60 * 60)
						try {
							jobManager.updateStatus(tmpJob, JobStatus.END);
							jobManager.close(tmpJob);
						} catch (Exception e) {
							LOGGER.error(e.getMessage());
						}

					break;
				case END:
					break;
				case END_OF_JOB:
					break;
				case EVENT_WAITING:
					break;
				case LOCK_WAITING:
					break;
				case MESSAGE_WAITING:
					break;
				case HOLD:
					break;
				case RUN:
					break;
				case TIME_WAITING:
					break;
				}
			}
		}
	}
}
