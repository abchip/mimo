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
package org.abchip.mimo.server.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.context.Identity;
import org.abchip.mimo.context.UserProfile;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobCapability;
import org.abchip.mimo.server.JobEvent;
import org.abchip.mimo.server.JobEventType;
import org.abchip.mimo.server.JobListener;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.JobStatus;
import org.abchip.mimo.server.JobType;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.SystemManager;
import org.abchip.mimo.util.ThreadManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BaseJobManagerImpl implements JobManager {

	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private ThreadManager threadManager;

	private BaseSystemManagerImpl systemManager;
	private Map<String, Job> activeJobs;
	private List<JobListener> listeners;

	@Inject
	public BaseJobManagerImpl(SystemManager systemManager) {

		this.systemManager = (BaseSystemManagerImpl) systemManager;
		this.activeJobs = new HashMap<String, Job>(); // TODO
														// ConcurrentHashMap????
		this.listeners = new ArrayList<JobListener>();
	}

	@Override
	public JobCapability create(Identity<?> identity) {
		return create(identity, null);
	}

	@Override
	public JobCapability create(Identity<?> identity, String jobName) {

		Job startupJob = systemManager.getJobKernel();
		EntityReader<UserProfile> userResource = resourceManager.getEntityReader(startupJob, UserProfile.class);

		// check credential
		UserProfile userProfile = userResource.lookup(identity.getJavaPrincipal().getName());

		if (userProfile == null)
			throw new RuntimeException("User " + identity.getJavaPrincipal().getName() + " not found");

		Job job = systemManager.createJob(JobType.BATCH, identity.getJavaPrincipal(), jobName);

		JobEvent jobEvent = ServerFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STARTING);
		fireEvent(jobEvent);

		// save
		EntityWriter<Job> jobWriter = resourceManager.getEntityWriter(job, Job.class);
		jobWriter.create(job);

		jobEvent.setType(JobEventType.STARTED);
		fireEvent(jobEvent);

		activeJobs.put(job.getJobID(), job);

		// capability
		JobCapability jobCapability = ServerFactory.eINSTANCE.createJobCapability();
		jobCapability.setJobReference((JobReference) EcoreUtil.copy((EObject) job.getJobReference()));
		jobCapability.setEntityURI(job.getURI());
		jobCapability.setPort(job.getSystem().getPort());

		job.getContext().set(JobCapability.class, jobCapability);

		job.getContext().set(Identity.class, identity);

		return jobCapability;
	}

	@Override
	public JobCapability spawn(final Job parent, String jobName, boolean copyEnvironmentVariables) {

		Identity<?> identity = parent.getContext().get(Identity.class);
		JobCapability jobCapability = create(identity, jobName);

		return jobCapability;
	}

	@Override
	public Job lookup(JobCapability capability) {
		return lookup(capability.getEntityName());
	}

	@Override
	public Job lookup(String contextID, JobReference jobReference) {
		return lookup(contextID, jobReference.getJobName(), jobReference.getJobUser(), jobReference.getJobNumber());
	}

	@Override
	public Job lookup(String contextID, String name, String user, String number) {
		return lookup(contextID, name, user, Integer.parseInt(number));
	}

	@Override
	public Job lookup(String contextID) {
		return activeJobs.get(contextID);
	}

	@Override
	public boolean checkCapability(JobCapability capability) {
		return lookup(capability) != null;
	}

	@Override
	public Job lookupActiveJob(String contextID, String jobID) {

		Job job = this.activeJobs.get(jobID);

		return job;
	}

	@Override
	public Job lookup(String contextID, String name, String user, int number) {

		Job jobCaller = lookup(contextID);

		String filter = "jobReference.jobName = \"" + name + "\" AND jobReference.jobNumber = " + number + " AND jobReference.jobUser = \"" + user + "'";
		Job jobTarget = null;

		EntityReader<Job> jobReader = resourceManager.getEntityReader(jobCaller, Job.class);
		try (EntityIterator<Job> jobs = jobReader.find(filter);) {

			// first element
			if (jobs.hasNext())
				jobTarget = jobs.next();

			return jobTarget;
		}
	}

	@Override
	public List<Job> getActiveJobs() {
		return new ArrayList<Job>(activeJobs.values());
	}

	@Override
	public List<Job> getUserJobs(String user) {

		ArrayList<Job> userJobs = new ArrayList<Job>();
		for (Job job : getActiveJobs()) {

			if (job.getJobReference().getJobUser().equals(user))
				userJobs.add(job);

		}
		return userJobs;
	}

	@Override
	public void close(JobCapability jobCapability) {

		Job job = lookup(jobCapability);
		if (job != null)
			close(job);
	}

	@Override
	public void close(Job job) {

		JobEvent jobEvent = ServerFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STOPPING);

		for (JobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		// save destroy date job
		EntityWriter<Job> jobWriter = resourceManager.getEntityWriter(job, Job.class);
		job.setDestroyDate(new Date());
		jobWriter.update(job);

		job.getContext().close();

		jobEvent.setType(JobEventType.STOPPED);

		for (JobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		this.activeJobs.remove(job.getJobID());

		// close thread
		threadManager.stop(job.getJobThread());
	}

	@Override
	public void registerListener(JobListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(JobEvent jobEvent) {
		for (JobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
	}

	@Override
	public void updateStatus(Job job, JobStatus status) {

		JobEvent jobEvent = ServerFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STATUS_CHANGED);

		fireEvent(jobEvent);
	}

	@Override
	public void delay(long millis) {
		if (millis <= 0)
			throw new RuntimeException("You must specify millis");

		try {
			System.out.println("Job delay " + millis);
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delay(String resumeTime) {
		Date resumeDate = toDate(resumeTime);
		if (resumeDate == null)
			throw new RuntimeException("You must specify resume time");

		delay(nrOfMillisUntilTime(resumeDate));
	}

	private Date toDate(String resumeTime) {
		try {
			String resumeTimeString = resumeTime.replaceAll("[^\\d.]", ""); // Just
																			// numeric
																			// chars
			Date todayHour = hourFormatter().parse(todayString() + resumeTimeString);
			if (todayHour.after(new Date())) {
				return todayHour;
			} else {
				return addOneDay(todayHour);
			}
		} catch (ParseException e) {
			return null;
		}
	}

	private Date addOneDay(Date date) {
		return new Date(date.getTime() + MILLIS_IN_ONE_DAY);
	}

	private String todayString() {
		return new SimpleDateFormat("ddMMyyyy").format(new Date());
	}

	private SimpleDateFormat hourFormatter() {
		SimpleDateFormat dfOre = new SimpleDateFormat("ddMMyyyyHHmmss");
		dfOre.setLenient(false);
		return dfOre;
	}

	private long nrOfMillisUntilTime(Date resumeDate) {
		return (resumeDate.getTime() - new Date().getTime());
	}

	@Override
	public int countActiveJobs() {
		return getActiveJobs().size();
	}

	@Override
	public Date now(Job job) {
		return new Date();
	}

	@Override
	public Job lookupActiveJob(String contextID, String name, String user, String number) {

		for (Job activeJob : getActiveJobs()) {
			JobReference jobReference = activeJob.getJobReference();
			if (jobReference.getJobName().equals(name) && jobReference.getJobUser().equals(user) && jobReference.getJobNumber() == Integer.parseInt(number))
				return activeJob;
		}

		return null;
	}
}