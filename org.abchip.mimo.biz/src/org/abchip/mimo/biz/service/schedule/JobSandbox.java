/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Sandbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getAuthUserLoginId <em>Auth User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCancelDateTime <em>Cancel Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRecurrenceCount <em>Current Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRetryCount <em>Current Retry Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getFinishDateTime <em>Finish Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobResult <em>Job Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getLoaderName <em>Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRecurrenceCount <em>Max Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRetry <em>Max Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getParentJobId <em>Parent Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPoolId <em>Pool Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPreviousJobId <em>Previous Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunAsUser <em>Run As User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunByInstanceId <em>Run By Instance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getTempExprId <em>Temp Expr Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox()
 * @model annotation="mimo-ent-frame title='Job Scheduler Sandbox'"
 * @generated
 */
public interface JobSandbox extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Id</em>' attribute.
	 * @see #setJobId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_JobId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobId <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Id</em>' attribute.
	 * @see #getJobId()
	 * @generated
	 */
	void setJobId(String value);

	/**
	 * Returns the value of the '<em><b>Auth User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth User Login Id</em>' reference.
	 * @see #setAuthUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_AuthUserLoginId()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getAuthUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getAuthUserLoginId <em>Auth User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth User Login Id</em>' reference.
	 * @see #getAuthUserLoginId()
	 * @generated
	 */
	void setAuthUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Cancel Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Date Time</em>' attribute.
	 * @see #setCancelDateTime(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_CancelDateTime()
	 * @model
	 * @generated
	 */
	Date getCancelDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCancelDateTime <em>Cancel Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Date Time</em>' attribute.
	 * @see #getCancelDateTime()
	 * @generated
	 */
	void setCancelDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Current Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Recurrence Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Recurrence Count</em>' attribute.
	 * @see #setCurrentRecurrenceCount(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_CurrentRecurrenceCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCurrentRecurrenceCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRecurrenceCount <em>Current Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Recurrence Count</em>' attribute.
	 * @see #getCurrentRecurrenceCount()
	 * @generated
	 */
	void setCurrentRecurrenceCount(long value);

	/**
	 * Returns the value of the '<em><b>Current Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Retry Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Retry Count</em>' attribute.
	 * @see #setCurrentRetryCount(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_CurrentRetryCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCurrentRetryCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRetryCount <em>Current Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Retry Count</em>' attribute.
	 * @see #getCurrentRetryCount()
	 * @generated
	 */
	void setCurrentRetryCount(long value);

	/**
	 * Returns the value of the '<em><b>Finish Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Date Time</em>' attribute.
	 * @see #setFinishDateTime(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_FinishDateTime()
	 * @model
	 * @generated
	 */
	Date getFinishDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getFinishDateTime <em>Finish Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Date Time</em>' attribute.
	 * @see #getFinishDateTime()
	 * @generated
	 */
	void setFinishDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_JobName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

	/**
	 * Returns the value of the '<em><b>Job Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Result</em>' attribute.
	 * @see #setJobResult(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_JobResult()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getJobResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobResult <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Result</em>' attribute.
	 * @see #getJobResult()
	 * @generated
	 */
	void setJobResult(String value);

	/**
	 * Returns the value of the '<em><b>Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loader Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loader Name</em>' attribute.
	 * @see #setLoaderName(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_LoaderName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLoaderName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getLoaderName <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loader Name</em>' attribute.
	 * @see #getLoaderName()
	 * @generated
	 */
	void setLoaderName(String value);

	/**
	 * Returns the value of the '<em><b>Max Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Recurrence Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Recurrence Count</em>' attribute.
	 * @see #setMaxRecurrenceCount(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_MaxRecurrenceCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxRecurrenceCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRecurrenceCount <em>Max Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Recurrence Count</em>' attribute.
	 * @see #getMaxRecurrenceCount()
	 * @generated
	 */
	void setMaxRecurrenceCount(long value);

	/**
	 * Returns the value of the '<em><b>Max Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Retry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Retry</em>' attribute.
	 * @see #setMaxRetry(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_MaxRetry()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxRetry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRetry <em>Max Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Retry</em>' attribute.
	 * @see #getMaxRetry()
	 * @generated
	 */
	void setMaxRetry(long value);

	/**
	 * Returns the value of the '<em><b>Parent Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Job Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Job Id</em>' attribute.
	 * @see #setParentJobId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_ParentJobId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getParentJobId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getParentJobId <em>Parent Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Job Id</em>' attribute.
	 * @see #getParentJobId()
	 * @generated
	 */
	void setParentJobId(String value);

	/**
	 * Returns the value of the '<em><b>Pool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Id</em>' attribute.
	 * @see #setPoolId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_PoolId()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPoolId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPoolId <em>Pool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Id</em>' attribute.
	 * @see #getPoolId()
	 * @generated
	 */
	void setPoolId(String value);

	/**
	 * Returns the value of the '<em><b>Previous Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Job Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Job Id</em>' attribute.
	 * @see #setPreviousJobId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_PreviousJobId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPreviousJobId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPreviousJobId <em>Previous Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Job Id</em>' attribute.
	 * @see #getPreviousJobId()
	 * @generated
	 */
	void setPreviousJobId(String value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #setRecurrenceInfoId(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_RecurrenceInfoId()
	 * @model keys="recurrenceInfoId"
	 *        annotation="mimo-ent-slot help='Deprecated - use tempExprId instead'"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRecurrenceInfoId <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Run As User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run As User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run As User</em>' reference.
	 * @see #setRunAsUser(UserLogin)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_RunAsUser()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getRunAsUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunAsUser <em>Run As User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As User</em>' reference.
	 * @see #getRunAsUser()
	 * @generated
	 */
	void setRunAsUser(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Run By Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run By Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run By Instance Id</em>' attribute.
	 * @see #setRunByInstanceId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_RunByInstanceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRunByInstanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunByInstanceId <em>Run By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run By Instance Id</em>' attribute.
	 * @see #getRunByInstanceId()
	 * @generated
	 */
	void setRunByInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Time</em>' attribute.
	 * @see #setRunTime(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_RunTime()
	 * @model
	 * @generated
	 */
	Date getRunTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunTime <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Time</em>' attribute.
	 * @see #getRunTime()
	 * @generated
	 */
	void setRunTime(Date value);

	/**
	 * Returns the value of the '<em><b>Runtime Data Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Data Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Data Id</em>' reference.
	 * @see #setRuntimeDataId(RuntimeData)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_RuntimeDataId()
	 * @model keys="runtimeDataId"
	 * @generated
	 */
	RuntimeData getRuntimeDataId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRuntimeDataId <em>Runtime Data Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Data Id</em>' reference.
	 * @see #getRuntimeDataId()
	 * @generated
	 */
	void setRuntimeDataId(RuntimeData value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_ServiceName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #setStartDateTime(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_StartDateTime()
	 * @model
	 * @generated
	 */
	Date getStartDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #getStartDateTime()
	 * @generated
	 */
	void setStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Expr Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Expr Id</em>' reference.
	 * @see #setTempExprId(TemporalExpression)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getJobSandbox_TempExprId()
	 * @model keys="tempExprId"
	 *        annotation="mimo-ent-slot help='Temporal expression id'"
	 * @generated
	 */
	TemporalExpression getTempExprId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getTempExprId <em>Temp Expr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Expr Id</em>' reference.
	 * @see #getTempExprId()
	 * @generated
	 */
	void setTempExprId(TemporalExpression value);

} // JobSandbox
