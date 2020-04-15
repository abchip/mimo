/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.context.Identity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Job Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JobManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true"
	 * @generated
	 */
	boolean checkCapability(JobCapability capability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.server.ServerException" capabilityRequired="true"
	 * @generated
	 */
	void close(JobCapability capability) throws ServerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.server.ServerException" jobRequired="true"
	 * @generated
	 */
	void close(Job job) throws ServerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int countActiveJobs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.server.ServerException" identityRequired="true"
	 * @generated
	 */
	JobCapability create(Identity<?> identity) throws ServerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.server.ServerException" identityRequired="true" jobNameRequired="true"
	 * @generated
	 */
	JobCapability create(Identity<?> identity, String jobName) throws ServerException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" statusRequired="true"
	 * @generated
	 */
	void updateStatus(Job job, JobStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model millisRequired="true"
	 * @generated
	 */
	void delay(long millis);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resumeTimeRequired="true"
	 * @generated
	 */
	void delay(String resumeTime);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<Job> getActiveJobs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<Job> getUserJobs(String user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" jobReferenceRequired="true"
	 * @generated
	 */
	Job lookup(String contextID, JobReference jobReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	Job lookup(String contextID, String name, String user, int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	Job lookup(String contextID, String name, String user, String number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" jobIDRequired="true"
	 * @generated
	 */
	Job lookupActiveJob(String contextID, String jobID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	Job lookupActiveJob(String contextID, String name, String user, String number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true"
	 * @generated
	 */
	Job lookup(JobCapability capability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	Job lookup(String contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true"
	 * @generated
	 */
	Date now(Job job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(JobListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.server.ServerException" parentRequired="true" jobNameRequired="true" copyEnvironmentVariablesRequired="true"
	 * @generated
	 */
	JobCapability spawn(Job parent, String jobName, boolean copyEnvironmentVariables) throws ServerException;

} // JobManager
