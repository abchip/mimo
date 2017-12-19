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
package org.abchip.mimo.server.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobLog;
import org.abchip.mimo.server.JobLogEntry;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerHelper;
import org.abchip.mimo.util.ThreadManager;

public class BaseJobLogManagerImpl implements JobLogManager {

	@Inject
	private ResourceManager resourceManager;
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
				EntityWriter<JobLog> jobLogWriter = resourceManager.getEntityWriter(job, JobLog.class, ResourceScope.ROOT);
				jobLogWriter.save(jobLog, true);
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
		Job jobCaller = jobManager.lookup(contextID);

		Job jobTarget = jobManager.lookup(contextID, name, user, number);
		if (jobTarget == null)
			return null;

		EntityReader<JobLog> jobLogReader = resourceManager.getEntityReader(jobCaller, JobLog.class, ResourceScope.ROOT);
		JobLog jobLog = jobLogReader.lookup(jobTarget.getJobID());

		return jobLog;
	}
	
	private class JobLogThreadFactory implements ThreadFactory {

		private ThreadManager threadManager;
		
		public JobLogThreadFactory(ThreadManager threadManager) {
			this.threadManager = threadManager;
		}
		
		@Override
		public Thread newThread(Runnable runnable) {
			org.abchip.mimo.util.Thread thread = threadManager.createThread("job-logger", runnable);
			return thread.getJavaThread();
		}

	}
}
