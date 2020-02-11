/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.Date;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.service.schedule.JobSandbox;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Sandbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getAuthUserLoginId <em>Auth User Login Id</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunAsUser <em>Run As User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunByInstanceId <em>Run By Instance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl#getTempExprId <em>Temp Expr Id</em>}</li>
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
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__JOB_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobId(String newJobId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__JOB_ID, newJobId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getAuthUserLoginId() {
		return (UserLogin)eGet(SchedulePackage.Literals.JOB_SANDBOX__AUTH_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthUserLoginId(UserLogin newAuthUserLoginId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__AUTH_USER_LOGIN_ID, newAuthUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCancelDateTime() {
		return (Date)eGet(SchedulePackage.Literals.JOB_SANDBOX__CANCEL_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelDateTime(Date newCancelDateTime) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__CANCEL_DATE_TIME, newCancelDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentRecurrenceCount() {
		return (Long)eGet(SchedulePackage.Literals.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRecurrenceCount(long newCurrentRecurrenceCount) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__CURRENT_RECURRENCE_COUNT, newCurrentRecurrenceCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentRetryCount() {
		return (Long)eGet(SchedulePackage.Literals.JOB_SANDBOX__CURRENT_RETRY_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRetryCount(long newCurrentRetryCount) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__CURRENT_RETRY_COUNT, newCurrentRetryCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFinishDateTime() {
		return (Date)eGet(SchedulePackage.Literals.JOB_SANDBOX__FINISH_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinishDateTime(Date newFinishDateTime) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__FINISH_DATE_TIME, newFinishDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobName() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__JOB_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobName(String newJobName) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__JOB_NAME, newJobName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobResult() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__JOB_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobResult(String newJobResult) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__JOB_RESULT, newJobResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoaderName() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__LOADER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoaderName(String newLoaderName) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__LOADER_NAME, newLoaderName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRecurrenceCount() {
		return (Long)eGet(SchedulePackage.Literals.JOB_SANDBOX__MAX_RECURRENCE_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRecurrenceCount(long newMaxRecurrenceCount) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__MAX_RECURRENCE_COUNT, newMaxRecurrenceCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRetry() {
		return (Long)eGet(SchedulePackage.Literals.JOB_SANDBOX__MAX_RETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRetry(long newMaxRetry) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__MAX_RETRY, newMaxRetry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentJobId() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__PARENT_JOB_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentJobId(String newParentJobId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__PARENT_JOB_ID, newParentJobId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoolId() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__POOL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolId(String newPoolId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__POOL_ID, newPoolId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousJobId() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__PREVIOUS_JOB_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousJobId(String newPreviousJobId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__PREVIOUS_JOB_ID, newPreviousJobId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfoId() {
		return (RecurrenceInfo)eGet(SchedulePackage.Literals.JOB_SANDBOX__RECURRENCE_INFO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__RECURRENCE_INFO_ID, newRecurrenceInfoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getRunAsUser() {
		return (UserLogin)eGet(SchedulePackage.Literals.JOB_SANDBOX__RUN_AS_USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunAsUser(UserLogin newRunAsUser) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__RUN_AS_USER, newRunAsUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunByInstanceId() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__RUN_BY_INSTANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunByInstanceId(String newRunByInstanceId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__RUN_BY_INSTANCE_ID, newRunByInstanceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRunTime() {
		return (Date)eGet(SchedulePackage.Literals.JOB_SANDBOX__RUN_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunTime(Date newRunTime) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__RUN_TIME, newRunTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeData getRuntimeDataId() {
		return (RuntimeData)eGet(SchedulePackage.Literals.JOB_SANDBOX__RUNTIME_DATA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeDataId(RuntimeData newRuntimeDataId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__RUNTIME_DATA_ID, newRuntimeDataId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eGet(SchedulePackage.Literals.JOB_SANDBOX__SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDateTime() {
		return (Date)eGet(SchedulePackage.Literals.JOB_SANDBOX__START_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDateTime(Date newStartDateTime) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__START_DATE_TIME, newStartDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(SchedulePackage.Literals.JOB_SANDBOX__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getTempExprId() {
		return (TemporalExpression)eGet(SchedulePackage.Literals.JOB_SANDBOX__TEMP_EXPR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprId(TemporalExpression newTempExprId) {
		eSet(SchedulePackage.Literals.JOB_SANDBOX__TEMP_EXPR_ID, newTempExprId);
	}

} //JobSandboxImpl
