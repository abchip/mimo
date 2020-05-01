/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobLog;
import org.abchip.mimo.server.JobLogEntry;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerHelper;

public class BaseJobLogManagerImpl implements JobLogManager {

	@Inject
	private JobManager jobManager;
	@Inject
	private ThreadManager threadManager;

	private ExecutorService jobLogExecutor;

	@PostConstruct
	private void init() {
		jobLogExecutor = Executors.newCachedThreadPool(new JobLogThreadFactory(threadManager));
	}

	@Override
	public void info(Job job, String message) {
		addEntry(job, 10, message);
	}

	@Override
	public void warning(Job job, String message) {
		addEntry(job, 20, message);
	}

	@Override
	public void error(Job job, String message) {
		addEntry(job, 30, message);
	}

	@Override
	public void addEntry(Job job, int gravity, String message) {
		jobLogExecutor.submit(taskFor(job, gravity, message));
	}

	private Runnable taskFor(final Job job, final int gravity, final String message) {
		return new Runnable() {
			@Override
			public void run() {
				// job log
				JobLog jobLog = lookup(job);
				if (jobLog == null) {
					jobLog = ServerFactory.eINSTANCE.createJobLog();
					jobLog.setJob(job);

					job.getContext().set(JobLog.class, jobLog);
				}

				// entry
				JobLogEntry entry = ServerFactory.eINSTANCE.createJobLogEntry();
				entry.setGravity(gravity);
				entry.setMessage(message);
				entry.setCreationDate(ServerHelper.now());

				jobLog.getEntries().add(entry);

				// save
				// ResourceWriter<JobLog> jobLogWriter =
				// context.getResourceManager().getResourceWriter(job.getContext(), JobLog.class);
				// jobLogWriter.create(jobLog, true);
			}
		};
	}

	@Override
	public JobLog lookup(Job job) {
		JobLog jobLog = null;

		if (job.getContext() != null)
			jobLog = job.getContext().get(JobLog.class);

		return jobLog;
	}

	@Override
	public JobLog lookup(String contextID, JobReference jobReference) {
		return lookup(contextID, jobReference.getJobName(), jobReference.getJobUser(), jobReference.getJobNumber());
	}

	@Override
	public JobLog lookup(String contextID, String name, String user, int number) {
//		Job jobCaller = jobManager.lookup(contextID);

		Job jobTarget = jobManager.lookup(contextID, name, user, number);
		if (jobTarget == null)
			return null;

		// ResourceReader<JobLog> jobLogReader =
		// context.getResourceManager().getResourceReader(jobCaller.getContext(), JobLog.class);
		// JobLog jobLog = jobLogReader.lookup(jobTarget.getJobID());

		return null;
	}

	private class JobLogThreadFactory implements ThreadFactory {

		private ThreadManager threadManager;

		public JobLogThreadFactory(ThreadManager threadManager) {
			this.threadManager = threadManager;
		}

		@Override
		public Thread newThread(Runnable runnable) {
			org.abchip.mimo.context.Thread thread = threadManager.createThread("job-logger", runnable);
			return thread.getJavaThread();
		}

	}
}
