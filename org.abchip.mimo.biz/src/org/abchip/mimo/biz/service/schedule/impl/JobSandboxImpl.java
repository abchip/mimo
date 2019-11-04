/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.service.schedule.JobSandbox;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Sandbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getCancelDateTime <em>Cancel Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getCurrentRecurrenceCount <em>Current Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getCurrentRetryCount <em>Current Retry Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getFinishDateTime <em>Finish Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getJobResult <em>Job Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getLoaderName <em>Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getMaxRecurrenceCount <em>Max Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getMaxRetry <em>Max Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getParentJobId <em>Parent Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getPoolId <em>Pool Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getPreviousJobId <em>Previous Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunByInstanceId <em>Run By Instance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getAuthUserLoginId <em>Auth User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunAsUser <em>Run As User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSandboxImpl extends BizEntityImpl implements JobSandbox {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobId()
	 * @generated
	 * @ordered
	 */
	protected String jobId = JOB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelDateTime() <em>Cancel Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CANCEL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelDateTime() <em>Cancel Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date cancelDateTime = CANCEL_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentRecurrenceCount() <em>Current Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_RECURRENCE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentRecurrenceCount() <em>Current Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected long currentRecurrenceCount = CURRENT_RECURRENCE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentRetryCount() <em>Current Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_RETRY_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentRetryCount() <em>Current Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRetryCount()
	 * @generated
	 * @ordered
	 */
	protected long currentRetryCount = CURRENT_RETRY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishDateTime() <em>Finish Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FINISH_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishDateTime() <em>Finish Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date finishDateTime = FINISH_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobResult() <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobResult()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobResult() <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobResult()
	 * @generated
	 * @ordered
	 */
	protected String jobResult = JOB_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoaderName() <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoaderName() <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaderName()
	 * @generated
	 * @ordered
	 */
	protected String loaderName = LOADER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRecurrenceCount() <em>Max Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RECURRENCE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRecurrenceCount() <em>Max Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected long maxRecurrenceCount = MAX_RECURRENCE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRetry() <em>Max Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetry()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RETRY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRetry() <em>Max Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetry()
	 * @generated
	 * @ordered
	 */
	protected long maxRetry = MAX_RETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentJobId() <em>Parent Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentJobId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentJobId() <em>Parent Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentJobId()
	 * @generated
	 * @ordered
	 */
	protected String parentJobId = PARENT_JOB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolId() <em>Pool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolId()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolId() <em>Pool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolId()
	 * @generated
	 * @ordered
	 */
	protected String poolId = POOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousJobId() <em>Previous Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousJobId()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousJobId() <em>Previous Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousJobId()
	 * @generated
	 * @ordered
	 */
	protected String previousJobId = PREVIOUS_JOB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunByInstanceId() <em>Run By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunByInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_BY_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunByInstanceId() <em>Run By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunByInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String runByInstanceId = RUN_BY_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected Date runTime = RUN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date startDateTime = START_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceInfo recurrenceInfoId;

	/**
	 * The cached value of the '{@link #getTempExprId() <em>Temp Expr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprId()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression tempExprId;

	/**
	 * The cached value of the '{@link #getRuntimeDataId() <em>Runtime Data Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeDataId()
	 * @generated
	 * @ordered
	 */
	protected RuntimeData runtimeDataId;

	/**
	 * The cached value of the '{@link #getAuthUserLoginId() <em>Auth User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin authUserLoginId;

	/**
	 * The cached value of the '{@link #getRunAsUser() <em>Run As User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAsUser()
	 * @generated
	 * @ordered
	 */
	protected UserLogin runAsUser;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSandboxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.JOB_SANDBOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobId() {
		return jobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobId(String newJobId) {
		String oldJobId = jobId;
		jobId = newJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__JOB_ID, oldJobId, jobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getAuthUserLoginId() {
		if (authUserLoginId != null && ((EObject)authUserLoginId).eIsProxy()) {
			InternalEObject oldAuthUserLoginId = (InternalEObject)authUserLoginId;
			authUserLoginId = (UserLogin)eResolveProxy(oldAuthUserLoginId);
			if (authUserLoginId != oldAuthUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID, oldAuthUserLoginId, authUserLoginId));
			}
		}
		return authUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetAuthUserLoginId() {
		return authUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthUserLoginId(UserLogin newAuthUserLoginId) {
		UserLogin oldAuthUserLoginId = authUserLoginId;
		authUserLoginId = newAuthUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID, oldAuthUserLoginId, authUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCancelDateTime() {
		return cancelDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelDateTime(Date newCancelDateTime) {
		Date oldCancelDateTime = cancelDateTime;
		cancelDateTime = newCancelDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__CANCEL_DATE_TIME, oldCancelDateTime, cancelDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentRecurrenceCount() {
		return currentRecurrenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRecurrenceCount(long newCurrentRecurrenceCount) {
		long oldCurrentRecurrenceCount = currentRecurrenceCount;
		currentRecurrenceCount = newCurrentRecurrenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT, oldCurrentRecurrenceCount, currentRecurrenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentRetryCount() {
		return currentRetryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRetryCount(long newCurrentRetryCount) {
		long oldCurrentRetryCount = currentRetryCount;
		currentRetryCount = newCurrentRetryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__CURRENT_RETRY_COUNT, oldCurrentRetryCount, currentRetryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFinishDateTime() {
		return finishDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinishDateTime(Date newFinishDateTime) {
		Date oldFinishDateTime = finishDateTime;
		finishDateTime = newFinishDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__FINISH_DATE_TIME, oldFinishDateTime, finishDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobResult() {
		return jobResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobResult(String newJobResult) {
		String oldJobResult = jobResult;
		jobResult = newJobResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__JOB_RESULT, oldJobResult, jobResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoaderName() {
		return loaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoaderName(String newLoaderName) {
		String oldLoaderName = loaderName;
		loaderName = newLoaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__LOADER_NAME, oldLoaderName, loaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRecurrenceCount() {
		return maxRecurrenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRecurrenceCount(long newMaxRecurrenceCount) {
		long oldMaxRecurrenceCount = maxRecurrenceCount;
		maxRecurrenceCount = newMaxRecurrenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__MAX_RECURRENCE_COUNT, oldMaxRecurrenceCount, maxRecurrenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRetry() {
		return maxRetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRetry(long newMaxRetry) {
		long oldMaxRetry = maxRetry;
		maxRetry = newMaxRetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__MAX_RETRY, oldMaxRetry, maxRetry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentJobId() {
		return parentJobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentJobId(String newParentJobId) {
		String oldParentJobId = parentJobId;
		parentJobId = newParentJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__PARENT_JOB_ID, oldParentJobId, parentJobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoolId() {
		return poolId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolId(String newPoolId) {
		String oldPoolId = poolId;
		poolId = newPoolId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__POOL_ID, oldPoolId, poolId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousJobId() {
		return previousJobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousJobId(String newPreviousJobId) {
		String oldPreviousJobId = previousJobId;
		previousJobId = newPreviousJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__PREVIOUS_JOB_ID, oldPreviousJobId, previousJobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfoId() {
		if (recurrenceInfoId != null && ((EObject)recurrenceInfoId).eIsProxy()) {
			InternalEObject oldRecurrenceInfoId = (InternalEObject)recurrenceInfoId;
			recurrenceInfoId = (RecurrenceInfo)eResolveProxy(oldRecurrenceInfoId);
			if (recurrenceInfoId != oldRecurrenceInfoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
			}
		}
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceInfo basicGetRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		RecurrenceInfo oldRecurrenceInfoId = recurrenceInfoId;
		recurrenceInfoId = newRecurrenceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getRunAsUser() {
		if (runAsUser != null && ((EObject)runAsUser).eIsProxy()) {
			InternalEObject oldRunAsUser = (InternalEObject)runAsUser;
			runAsUser = (UserLogin)eResolveProxy(oldRunAsUser);
			if (runAsUser != oldRunAsUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__RUN_AS_USER, oldRunAsUser, runAsUser));
			}
		}
		return runAsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetRunAsUser() {
		return runAsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunAsUser(UserLogin newRunAsUser) {
		UserLogin oldRunAsUser = runAsUser;
		runAsUser = newRunAsUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__RUN_AS_USER, oldRunAsUser, runAsUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunByInstanceId() {
		return runByInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunByInstanceId(String newRunByInstanceId) {
		String oldRunByInstanceId = runByInstanceId;
		runByInstanceId = newRunByInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__RUN_BY_INSTANCE_ID, oldRunByInstanceId, runByInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRunTime() {
		return runTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunTime(Date newRunTime) {
		Date oldRunTime = runTime;
		runTime = newRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__RUN_TIME, oldRunTime, runTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeData getRuntimeDataId() {
		if (runtimeDataId != null && ((EObject)runtimeDataId).eIsProxy()) {
			InternalEObject oldRuntimeDataId = (InternalEObject)runtimeDataId;
			runtimeDataId = (RuntimeData)eResolveProxy(oldRuntimeDataId);
			if (runtimeDataId != oldRuntimeDataId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID, oldRuntimeDataId, runtimeDataId));
			}
		}
		return runtimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeData basicGetRuntimeDataId() {
		return runtimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeDataId(RuntimeData newRuntimeDataId) {
		RuntimeData oldRuntimeDataId = runtimeDataId;
		runtimeDataId = newRuntimeDataId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID, oldRuntimeDataId, runtimeDataId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDateTime(Date newStartDateTime) {
		Date oldStartDateTime = startDateTime;
		startDateTime = newStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__START_DATE_TIME, oldStartDateTime, startDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getTempExprId() {
		if (tempExprId != null && ((EObject)tempExprId).eIsProxy()) {
			InternalEObject oldTempExprId = (InternalEObject)tempExprId;
			tempExprId = (TemporalExpression)eResolveProxy(oldTempExprId);
			if (tempExprId != oldTempExprId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID, oldTempExprId, tempExprId));
			}
		}
		return tempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression basicGetTempExprId() {
		return tempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprId(TemporalExpression newTempExprId) {
		TemporalExpression oldTempExprId = tempExprId;
		tempExprId = newTempExprId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID, oldTempExprId, tempExprId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productGroupOrders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.JOB_SANDBOX__JOB_ID:
				return getJobId();
			case SchedulePackage.JOB_SANDBOX__CANCEL_DATE_TIME:
				return getCancelDateTime();
			case SchedulePackage.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT:
				return getCurrentRecurrenceCount();
			case SchedulePackage.JOB_SANDBOX__CURRENT_RETRY_COUNT:
				return getCurrentRetryCount();
			case SchedulePackage.JOB_SANDBOX__FINISH_DATE_TIME:
				return getFinishDateTime();
			case SchedulePackage.JOB_SANDBOX__JOB_NAME:
				return getJobName();
			case SchedulePackage.JOB_SANDBOX__JOB_RESULT:
				return getJobResult();
			case SchedulePackage.JOB_SANDBOX__LOADER_NAME:
				return getLoaderName();
			case SchedulePackage.JOB_SANDBOX__MAX_RECURRENCE_COUNT:
				return getMaxRecurrenceCount();
			case SchedulePackage.JOB_SANDBOX__MAX_RETRY:
				return getMaxRetry();
			case SchedulePackage.JOB_SANDBOX__PARENT_JOB_ID:
				return getParentJobId();
			case SchedulePackage.JOB_SANDBOX__POOL_ID:
				return getPoolId();
			case SchedulePackage.JOB_SANDBOX__PREVIOUS_JOB_ID:
				return getPreviousJobId();
			case SchedulePackage.JOB_SANDBOX__RUN_BY_INSTANCE_ID:
				return getRunByInstanceId();
			case SchedulePackage.JOB_SANDBOX__RUN_TIME:
				return getRunTime();
			case SchedulePackage.JOB_SANDBOX__SERVICE_NAME:
				return getServiceName();
			case SchedulePackage.JOB_SANDBOX__START_DATE_TIME:
				return getStartDateTime();
			case SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID:
				if (resolve) return getRecurrenceInfoId();
				return basicGetRecurrenceInfoId();
			case SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID:
				if (resolve) return getTempExprId();
				return basicGetTempExprId();
			case SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID:
				if (resolve) return getRuntimeDataId();
				return basicGetRuntimeDataId();
			case SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID:
				if (resolve) return getAuthUserLoginId();
				return basicGetAuthUserLoginId();
			case SchedulePackage.JOB_SANDBOX__RUN_AS_USER:
				if (resolve) return getRunAsUser();
				return basicGetRunAsUser();
			case SchedulePackage.JOB_SANDBOX__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.JOB_SANDBOX__JOB_ID:
				setJobId((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__CANCEL_DATE_TIME:
				setCancelDateTime((Date)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT:
				setCurrentRecurrenceCount((Long)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__CURRENT_RETRY_COUNT:
				setCurrentRetryCount((Long)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__FINISH_DATE_TIME:
				setFinishDateTime((Date)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__JOB_NAME:
				setJobName((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__JOB_RESULT:
				setJobResult((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__LOADER_NAME:
				setLoaderName((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__MAX_RECURRENCE_COUNT:
				setMaxRecurrenceCount((Long)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__MAX_RETRY:
				setMaxRetry((Long)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__PARENT_JOB_ID:
				setParentJobId((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__POOL_ID:
				setPoolId((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__PREVIOUS_JOB_ID:
				setPreviousJobId((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_BY_INSTANCE_ID:
				setRunByInstanceId((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_TIME:
				setRunTime((Date)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID:
				setTempExprId((TemporalExpression)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID:
				setRuntimeDataId((RuntimeData)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID:
				setAuthUserLoginId((UserLogin)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_AS_USER:
				setRunAsUser((UserLogin)newValue);
				return;
			case SchedulePackage.JOB_SANDBOX__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulePackage.JOB_SANDBOX__JOB_ID:
				setJobId(JOB_ID_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__CANCEL_DATE_TIME:
				setCancelDateTime(CANCEL_DATE_TIME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT:
				setCurrentRecurrenceCount(CURRENT_RECURRENCE_COUNT_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__CURRENT_RETRY_COUNT:
				setCurrentRetryCount(CURRENT_RETRY_COUNT_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__FINISH_DATE_TIME:
				setFinishDateTime(FINISH_DATE_TIME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__JOB_NAME:
				setJobName(JOB_NAME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__JOB_RESULT:
				setJobResult(JOB_RESULT_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__LOADER_NAME:
				setLoaderName(LOADER_NAME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__MAX_RECURRENCE_COUNT:
				setMaxRecurrenceCount(MAX_RECURRENCE_COUNT_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__MAX_RETRY:
				setMaxRetry(MAX_RETRY_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__PARENT_JOB_ID:
				setParentJobId(PARENT_JOB_ID_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__POOL_ID:
				setPoolId(POOL_ID_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__PREVIOUS_JOB_ID:
				setPreviousJobId(PREVIOUS_JOB_ID_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_BY_INSTANCE_ID:
				setRunByInstanceId(RUN_BY_INSTANCE_ID_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_TIME:
				setRunTime(RUN_TIME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__START_DATE_TIME:
				setStartDateTime(START_DATE_TIME_EDEFAULT);
				return;
			case SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)null);
				return;
			case SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID:
				setTempExprId((TemporalExpression)null);
				return;
			case SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID:
				setRuntimeDataId((RuntimeData)null);
				return;
			case SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID:
				setAuthUserLoginId((UserLogin)null);
				return;
			case SchedulePackage.JOB_SANDBOX__RUN_AS_USER:
				setRunAsUser((UserLogin)null);
				return;
			case SchedulePackage.JOB_SANDBOX__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulePackage.JOB_SANDBOX__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobId != null : !JOB_ID_EDEFAULT.equals(jobId);
			case SchedulePackage.JOB_SANDBOX__CANCEL_DATE_TIME:
				return CANCEL_DATE_TIME_EDEFAULT == null ? cancelDateTime != null : !CANCEL_DATE_TIME_EDEFAULT.equals(cancelDateTime);
			case SchedulePackage.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT:
				return currentRecurrenceCount != CURRENT_RECURRENCE_COUNT_EDEFAULT;
			case SchedulePackage.JOB_SANDBOX__CURRENT_RETRY_COUNT:
				return currentRetryCount != CURRENT_RETRY_COUNT_EDEFAULT;
			case SchedulePackage.JOB_SANDBOX__FINISH_DATE_TIME:
				return FINISH_DATE_TIME_EDEFAULT == null ? finishDateTime != null : !FINISH_DATE_TIME_EDEFAULT.equals(finishDateTime);
			case SchedulePackage.JOB_SANDBOX__JOB_NAME:
				return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
			case SchedulePackage.JOB_SANDBOX__JOB_RESULT:
				return JOB_RESULT_EDEFAULT == null ? jobResult != null : !JOB_RESULT_EDEFAULT.equals(jobResult);
			case SchedulePackage.JOB_SANDBOX__LOADER_NAME:
				return LOADER_NAME_EDEFAULT == null ? loaderName != null : !LOADER_NAME_EDEFAULT.equals(loaderName);
			case SchedulePackage.JOB_SANDBOX__MAX_RECURRENCE_COUNT:
				return maxRecurrenceCount != MAX_RECURRENCE_COUNT_EDEFAULT;
			case SchedulePackage.JOB_SANDBOX__MAX_RETRY:
				return maxRetry != MAX_RETRY_EDEFAULT;
			case SchedulePackage.JOB_SANDBOX__PARENT_JOB_ID:
				return PARENT_JOB_ID_EDEFAULT == null ? parentJobId != null : !PARENT_JOB_ID_EDEFAULT.equals(parentJobId);
			case SchedulePackage.JOB_SANDBOX__POOL_ID:
				return POOL_ID_EDEFAULT == null ? poolId != null : !POOL_ID_EDEFAULT.equals(poolId);
			case SchedulePackage.JOB_SANDBOX__PREVIOUS_JOB_ID:
				return PREVIOUS_JOB_ID_EDEFAULT == null ? previousJobId != null : !PREVIOUS_JOB_ID_EDEFAULT.equals(previousJobId);
			case SchedulePackage.JOB_SANDBOX__RUN_BY_INSTANCE_ID:
				return RUN_BY_INSTANCE_ID_EDEFAULT == null ? runByInstanceId != null : !RUN_BY_INSTANCE_ID_EDEFAULT.equals(runByInstanceId);
			case SchedulePackage.JOB_SANDBOX__RUN_TIME:
				return RUN_TIME_EDEFAULT == null ? runTime != null : !RUN_TIME_EDEFAULT.equals(runTime);
			case SchedulePackage.JOB_SANDBOX__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case SchedulePackage.JOB_SANDBOX__START_DATE_TIME:
				return START_DATE_TIME_EDEFAULT == null ? startDateTime != null : !START_DATE_TIME_EDEFAULT.equals(startDateTime);
			case SchedulePackage.JOB_SANDBOX__RECURRENCE_INFO_ID:
				return recurrenceInfoId != null;
			case SchedulePackage.JOB_SANDBOX__TEMP_EXPR_ID:
				return tempExprId != null;
			case SchedulePackage.JOB_SANDBOX__RUNTIME_DATA_ID:
				return runtimeDataId != null;
			case SchedulePackage.JOB_SANDBOX__AUTH_USER_LOGIN_ID:
				return authUserLoginId != null;
			case SchedulePackage.JOB_SANDBOX__RUN_AS_USER:
				return runAsUser != null;
			case SchedulePackage.JOB_SANDBOX__STATUS_ID:
				return statusId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jobId: ");
		result.append(jobId);
		result.append(", cancelDateTime: ");
		result.append(cancelDateTime);
		result.append(", currentRecurrenceCount: ");
		result.append(currentRecurrenceCount);
		result.append(", currentRetryCount: ");
		result.append(currentRetryCount);
		result.append(", finishDateTime: ");
		result.append(finishDateTime);
		result.append(", jobName: ");
		result.append(jobName);
		result.append(", jobResult: ");
		result.append(jobResult);
		result.append(", loaderName: ");
		result.append(loaderName);
		result.append(", maxRecurrenceCount: ");
		result.append(maxRecurrenceCount);
		result.append(", maxRetry: ");
		result.append(maxRetry);
		result.append(", parentJobId: ");
		result.append(parentJobId);
		result.append(", poolId: ");
		result.append(poolId);
		result.append(", previousJobId: ");
		result.append(previousJobId);
		result.append(", runByInstanceId: ");
		result.append(runByInstanceId);
		result.append(", runTime: ");
		result.append(runTime);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", startDateTime: ");
		result.append(startDateTime);
		result.append(')');
		return result.toString();
	}

} //JobSandboxImpl
