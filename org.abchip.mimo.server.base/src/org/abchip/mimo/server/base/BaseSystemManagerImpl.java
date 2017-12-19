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

import java.security.Principal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.JobType;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerHelper;
import org.abchip.mimo.server.SystemEvent;
import org.abchip.mimo.server.SystemEventType;
import org.abchip.mimo.server.SystemListener;
import org.abchip.mimo.server.SystemManager;
import org.abchip.mimo.server.SystemStatus;
import org.abchip.mimo.util.ThreadManager;


public class BaseSystemManagerImpl implements SystemManager {

	protected static final SimpleDateFormat YYMMDD = new SimpleDateFormat("yyMMdd");
	protected static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	protected static final SimpleDateFormat HHMMSS = new SimpleDateFormat("HHmmss");

	private List<SystemListener> listeners = new ArrayList<SystemListener>();
	private Job jobKernel;
	
	@Inject
	private LockManager lockManager;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private ThreadManager threadManager;
	
	@Override
	public void registerListener(SystemListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(SystemEvent systemEvent) {
		for (SystemListener jobListener : this.listeners)
			jobListener.handleEvent(systemEvent);
	}

	private int nextJobNumber = Integer.parseInt(HHMMSS.format(Calendar.getInstance().getTime()));

	protected Job getJobKernel() {
		return this.jobKernel;
	}
	
	protected synchronized int nextJobID(JobType jobType, org.abchip.mimo.server.System system, Job job) {

		int lastNumber = 0;
		
		if(jobType.equals(JobType.KERNEL)){
			lastNumber = nextJobNumber++;
		} else {
			lastNumber = system.getLastJobNumber();
			lastNumber++;
			// 
			if(lastNumber==1000000)
				lastNumber=1;

			EntityWriter<org.abchip.mimo.server.System> systemWriter = resourceManager.getEntityWriter(job, org.abchip.mimo.server.System.class, ResourceScope.ROOT);
			system.setLastJobNumber(lastNumber);
			systemWriter.save(system, true);
		}
		return lastNumber;
	}

	@Override
	public Job start(org.abchip.mimo.server.System system) {

		// create job kernel
		Principal principal = new Principal() {
			@Override
			public String getName() {
				return system.getSystemUser();
			}
		};

		// acquire system lock
		EntityLocker<org.abchip.mimo.server.System> locker = lockManager.getLocker(system.getContext(), system);
		while (!locker.tryLock(org.abchip.mimo.server.System.LOCK_TIMEOUT, LockType.WRITE));

		try {
			SystemEvent systemEvent = ServerFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STARTING);
			fireEvent(systemEvent);
		
			jobKernel = createJob(system, JobType.KERNEL, principal, "KERNEL");

			EntityWriter<org.abchip.mimo.server.System> systemWriter = resourceManager.getEntityWriter(jobKernel, org.abchip.mimo.server.System.class, ResourceScope.ROOT);
			org.abchip.mimo.server.System persistedSystem = systemWriter.lookup(system.getName());
			if (persistedSystem != null) {
				system.setLastJobNumber(persistedSystem.getLastJobNumber());
			}
			system.setStatus(SystemStatus.STARTED);
			systemWriter.save(system, true);

			systemEvent = ServerFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STARTED);
			
			fireEvent(systemEvent);
		} finally {
			locker.unlock(LockType.WRITE);
		}

		return jobKernel;
	}

	@Override
	public void stop() {

		org.abchip.mimo.server.System system = jobKernel.getSystem();
		
		// TODO system not able to stop
		if (!ServerHelper.isStoppable(system))
			return;

		// acquire system lock
		EntityLocker<org.abchip.mimo.server.System> locker = lockManager.getLocker(jobKernel.getContext(), system);
		locker.lock(LockType.WRITE);
		
		try {
			
			SystemEvent systemEvent = ServerFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STOPPING);
			fireEvent(systemEvent);
	
			systemEvent = ServerFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STOPPED);
			fireEvent(systemEvent);
		}
		finally {
			locker.unlock(LockType.WRITE);
		}
	}

	protected Job createJob(JobType jobType, Principal principal, String jobName) {
		return createJob(jobKernel.getSystem(), jobType, principal, jobName);
	}
	
	protected Job createJob(org.abchip.mimo.server.System system, JobType jobType, Principal principal, String jobName) {

		// job
		final Job job = ServerFactory.eINSTANCE.createJob();

		job.setCreationDate(new Date());
		job.setJobType(jobType);
		job.setSystem(system);

		// reference
		JobReference jobReference = ServerFactory.eINSTANCE.createJobReference();
		jobReference.setJobUser(principal.getName());
		jobReference.setJobNumber(nextJobID(jobType, system, jobKernel));
		if (jobName == null)
			jobReference.setJobName("QAS" + new DecimalFormat("000000").format(jobReference.getJobNumber()));
		else
			jobReference.setJobName(jobName);
		job.setJobReference(jobReference);

		// system resources
		job.getResources().add(system.getContext().getContextDescription().getResourceRoot());

		// job context
		ContextDescription contextDescription = ContextFactory.eINSTANCE.createContextDescription();
		contextDescription.setName(job.getJobReference().getJobName());
		contextDescription.getResources().add("MIMO" + new DecimalFormat("000000").format(job.getJobReference().getJobNumber()));

		Context jobContext = system.getContext().createChildContext(contextDescription);
		job.setJobID(jobContext.getID());
		job.setContext(jobContext);
		
		// Thread
		job.setJobThread(threadManager.currentThread());
		
		jobContext.set(Job.class, job);

		return job;
	}

	@Override
	public void updateStatus(SystemStatus status) {

		SystemEvent systemEvent = ServerFactory.eINSTANCE.createSystemEvent();
		systemEvent.setSource(jobKernel.getSystem());
		systemEvent.setType(SystemEventType.STATUS_CHANGED);
		fireEvent(systemEvent);
	}
}
