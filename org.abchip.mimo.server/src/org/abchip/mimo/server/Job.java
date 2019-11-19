/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.data.DateFormat;
import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.Job#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getCurrentResource <em>Current Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getDateSeparator <em>Date Separator</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getDestroyDate <em>Destroy Date</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getJobRunInfo <em>Job Run Info</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getJobThread <em>Job Thread</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getSystem <em>System</em>}</li>
 *   <li>{@link org.abchip.mimo.server.Job#getTimeSeparator <em>Time Separator</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EntityNameable {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_Context()
	 * @model containment="true" resolveProxies="true" transient="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_CreationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Current Resource</b></em>' attribute.
	 * The default value is <code>"QGPL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Resource</em>' attribute.
	 * @see #setCurrentResource(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_CurrentResource()
	 * @model default="QGPL"
	 * @generated
	 */
	String getCurrentResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getCurrentResource <em>Current Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Resource</em>' attribute.
	 * @see #getCurrentResource()
	 * @generated
	 */
	void setCurrentResource(String value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The default value is <code>"DMY"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.data.DateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see org.abchip.mimo.data.DateFormat
	 * @see #setDateFormat(DateFormat)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_DateFormat()
	 * @model default="DMY"
	 * @generated
	 */
	DateFormat getDateFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see org.abchip.mimo.data.DateFormat
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(DateFormat value);

	/**
	 * Returns the value of the '<em><b>Date Separator</b></em>' attribute.
	 * The default value is <code>"/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Separator</em>' attribute.
	 * @see #setDateSeparator(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_DateSeparator()
	 * @model default="/"
	 * @generated
	 */
	String getDateSeparator();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getDateSeparator <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Separator</em>' attribute.
	 * @see #getDateSeparator()
	 * @generated
	 */
	void setDateSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Destroy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destroy Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destroy Date</em>' attribute.
	 * @see #setDestroyDate(Date)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_DestroyDate()
	 * @model
	 * @generated
	 */
	Date getDestroyDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getDestroyDate <em>Destroy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Date</em>' attribute.
	 * @see #getDestroyDate()
	 * @generated
	 */
	void setDestroyDate(Date value);

	/**
	 * Returns the value of the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job ID</em>' attribute.
	 * @see #setJobID(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_JobID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getJobID();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getJobID <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job ID</em>' attribute.
	 * @see #getJobID()
	 * @generated
	 */
	void setJobID(String value);

	/**
	 * Returns the value of the '<em><b>Job Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Reference</em>' containment reference.
	 * @see #setJobReference(JobReference)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_JobReference()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	JobReference getJobReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getJobReference <em>Job Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Reference</em>' containment reference.
	 * @see #getJobReference()
	 * @generated
	 */
	void setJobReference(JobReference value);

	/**
	 * Returns the value of the '<em><b>Job Run Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Run Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Run Info</em>' containment reference.
	 * @see #setJobRunInfo(JobRunInfo)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_JobRunInfo()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	JobRunInfo getJobRunInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getJobRunInfo <em>Job Run Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Run Info</em>' containment reference.
	 * @see #getJobRunInfo()
	 * @generated
	 */
	void setJobRunInfo(JobRunInfo value);

	/**
	 * Returns the value of the '<em><b>Job Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Thread</em>' reference.
	 * @see #setJobThread(org.abchip.mimo.util.Thread)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_JobThread()
	 * @model resolveProxies="false" transient="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread getJobThread();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getJobThread <em>Job Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Thread</em>' reference.
	 * @see #getJobThread()
	 * @generated
	 */
	void setJobThread(org.abchip.mimo.util.Thread value);

	/**
	 * Returns the value of the '<em><b>Job Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.server.JobType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Type</em>' attribute.
	 * @see org.abchip.mimo.server.JobType
	 * @see #setJobType(JobType)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_JobType()
	 * @model
	 * @generated
	 */
	JobType getJobType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getJobType <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Type</em>' attribute.
	 * @see org.abchip.mimo.server.JobType
	 * @see #getJobType()
	 * @generated
	 */
	void setJobType(JobType value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.server.JobMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.abchip.mimo.server.ServerPackage#getJob_Messages()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<JobMessage> getMessages();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(org.abchip.mimo.server.System)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_System()
	 * @model required="true" transient="true"
	 * @generated
	 */
	org.abchip.mimo.server.System getSystem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.abchip.mimo.server.System value);

	/**
	 * Returns the value of the '<em><b>Time Separator</b></em>' attribute.
	 * The default value is <code>":"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Separator</em>' attribute.
	 * @see #setTimeSeparator(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJob_TimeSeparator()
	 * @model default=":"
	 * @generated
	 */
	String getTimeSeparator();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.Job#getTimeSeparator <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Separator</em>' attribute.
	 * @see #getTimeSeparator()
	 * @generated
	 */
	void setTimeSeparator(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	JobStatus getJobStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	double getCPUUsage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	JobMessage getLastMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	long getMemorySize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isError();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isRouted();

} // Job
