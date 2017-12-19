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
package org.abchip.mimo.server.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobMessage;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.JobRunInfo;
import org.abchip.mimo.server.JobStatus;
import org.abchip.mimo.server.JobType;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerPackage;
import org.abchip.mimo.util.DateFormat;
import org.abchip.mimo.util.Thread;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Job</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getCurrentResource <em>Current Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getDateSeparator <em>Date Separator</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getDestroyDate <em>Destroy Date</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getJobRunInfo <em>Job Run Info</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getJobThread <em>Job Thread</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.JobImpl#getTimeSeparator <em>Time Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends EntityNameableImpl implements Job {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentResource() <em>Current Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentResource()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_RESOURCE_EDEFAULT = "QGPL";

	/**
	 * The cached value of the '{@link #getCurrentResource() <em>Current Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentResource()
	 * @generated
	 * @ordered
	 */
	protected String currentResource = CURRENT_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DateFormat DATE_FORMAT_EDEFAULT = DateFormat.DMY;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected DateFormat dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSeparator() <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_SEPARATOR_EDEFAULT = "/";

	/**
	 * The cached value of the '{@link #getDateSeparator() <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateSeparator()
	 * @generated
	 * @ordered
	 */
	protected String dateSeparator = DATE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestroyDate() <em>Destroy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DESTROY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestroyDate() <em>Destroy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyDate()
	 * @generated
	 * @ordered
	 */
	protected Date destroyDate = DESTROY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected String jobID = JOB_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJobReference() <em>Job Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobReference()
	 * @generated
	 * @ordered
	 */
	protected JobReference jobReference;

	/**
	 * The cached value of the '{@link #getJobRunInfo() <em>Job Run Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRunInfo()
	 * @generated
	 * @ordered
	 */
	protected JobRunInfo jobRunInfo;

	/**
	 * The cached value of the '{@link #getJobThread() <em>Job Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobThread()
	 * @generated
	 * @ordered
	 */
	protected org.abchip.mimo.util.Thread jobThread;

	/**
	 * The default value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected static final JobType JOB_TYPE_EDEFAULT = JobType.KERNEL;

	/**
	 * The cached value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected JobType jobType = JOB_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resources;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<JobMessage> messages;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.abchip.mimo.server.System system;

	/**
	 * The default value of the '{@link #getTimeSeparator() <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_SEPARATOR_EDEFAULT = ":";

	/**
	 * The cached value of the '{@link #getTimeSeparator() <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeparator()
	 * @generated
	 * @ordered
	 */
	protected String timeSeparator = TIME_SEPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.server.System getSystem() {
		if (system != null && ((EObject)system).eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (org.abchip.mimo.server.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.JOB__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.abchip.mimo.server.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(org.abchip.mimo.server.System newSystem) {
		org.abchip.mimo.server.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobID() {
		return jobID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobID(String newJobID) {
		String oldJobID = jobID;
		jobID = newJobID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_ID, oldJobID, jobID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobReference getJobReference() {
		return jobReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobReference(JobReference newJobReference, NotificationChain msgs) {
		JobReference oldJobReference = jobReference;
		jobReference = newJobReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_REFERENCE, oldJobReference, newJobReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobReference(JobReference newJobReference) {
		if (newJobReference != jobReference) {
			NotificationChain msgs = null;
			if (jobReference != null)
				msgs = ((InternalEObject)jobReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__JOB_REFERENCE, null, msgs);
			if (newJobReference != null)
				msgs = ((InternalEObject)newJobReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__JOB_REFERENCE, null, msgs);
			msgs = basicSetJobReference(newJobReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_REFERENCE, newJobReference, newJobReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRunInfo getJobRunInfo() {
		return jobRunInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobRunInfo(JobRunInfo newJobRunInfo, NotificationChain msgs) {
		JobRunInfo oldJobRunInfo = jobRunInfo;
		jobRunInfo = newJobRunInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_RUN_INFO, oldJobRunInfo, newJobRunInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobRunInfo(JobRunInfo newJobRunInfo) {
		if (newJobRunInfo != jobRunInfo) {
			NotificationChain msgs = null;
			if (jobRunInfo != null)
				msgs = ((InternalEObject)jobRunInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__JOB_RUN_INFO, null, msgs);
			if (newJobRunInfo != null)
				msgs = ((InternalEObject)newJobRunInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__JOB_RUN_INFO, null, msgs);
			msgs = basicSetJobRunInfo(newJobRunInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_RUN_INFO, newJobRunInfo, newJobRunInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.abchip.mimo.util.Thread getJobThread() {
		return jobThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobThread(org.abchip.mimo.util.Thread newJobThread) {
		org.abchip.mimo.util.Thread oldJobThread = jobThread;
		jobThread = newJobThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_THREAD, oldJobThread, jobThread));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobType getJobType() {
		return jobType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobType(JobType newJobType) {
		JobType oldJobType = jobType;
		jobType = newJobType == null ? JOB_TYPE_EDEFAULT : newJobType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__JOB_TYPE, oldJobType, jobType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getResources() {
		if (resources == null) {
			resources = new EDataTypeUniqueEList<String>(String.class, this, ServerPackage.JOB__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public JobStatus getJobStatus() {

		Thread thread = getJobThread();
		if(thread == null) {
			if(isActive())
				return JobStatus.ACTIVE;
			else
				return JobStatus.END;
		}

		switch (thread.getThreadStatus()) {
		case NEW:
			return JobStatus.ACTIVE;		
		case TERMINATED:
			if(isError())
				return JobStatus.MESSAGE_WAITING;

			if(isActive())
				return JobStatus.ACTIVE;
			else
				return JobStatus.END;
		case RUNNABLE:			
			return JobStatus.RUN;
		case WAITING:
			if(thread.isSuspended())
				return JobStatus.HOLD;
			
			return JobStatus.RUN;
			
			// TODO JobStatus.MESSAGE_WAITING
		case TIMED_WAITING:
			if(thread.isSuspended())
				return JobStatus.HOLD;
			return JobStatus.TIME_WAITING;
		case BLOCKED:
			return JobStatus.LOCK_WAITING;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getMemorySize() {		
		if(getJobRunInfo() == null)
			return 0;
		
		long memorySize = getJobRunInfo().getMemorySize()/1024/1024;
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPriority() {
		if(getJobThread() == null)
			return 0;

		return getJobThread().getThreadPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getCPUUsage() {
		if(getJobThread() == null)
			return 0;
		
		return getJobThread().getThreadCPUUsage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<JobMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<JobMessage>(JobMessage.class, this, ServerPackage.JOB__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setCurrentResource(String newCurrentResource) {
		String oldCurrentResource = currentResource;
		if (newCurrentResource == null || newCurrentResource.trim().isEmpty()) {
			currentResource = CURRENT_RESOURCE_EDEFAULT;
		} else {
			currentResource = newCurrentResource;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__CURRENT_RESOURCE, oldCurrentResource, currentResource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(DateFormat newDateFormat) {
		DateFormat oldDateFormat = dateFormat;
		dateFormat = newDateFormat == null ? DATE_FORMAT_EDEFAULT : newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateSeparator() {
		return dateSeparator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSeparator(String newDateSeparator) {
		String oldDateSeparator = dateSeparator;
		dateSeparator = newDateSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__DATE_SEPARATOR, oldDateSeparator, dateSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDestroyDate() {
		return destroyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyDate(Date newDestroyDate) {
		Date oldDestroyDate = destroyDate;
		destroyDate = newDestroyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__DESTROY_DATE, oldDestroyDate, destroyDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeSeparator() {
		return timeSeparator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeparator(String newTimeSeparator) {
		String oldTimeSeparator = timeSeparator;
		timeSeparator = newTimeSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__TIME_SEPARATOR, oldTimeSeparator, timeSeparator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isActive() {
		Context context = getContext();
		if (context == null)
			return false;

		if (context.isClosed())
			return false;
		else
			return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isError() {
		if(getMessages().isEmpty())
			return false;
		else
			return getLastMessage().getMessageId().equals("ERRORJOB");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isRouted() {
		return getJobThread() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JobMessage getLastMessage() {

		JobMessage jobMessage = null;
		
		if(getMessages().size()-1 < 0){
			jobMessage = ServerFactory.eINSTANCE.createJobMessage();
		} else {
			jobMessage = getMessages().get(getMessages().size()-1);
		}
		
		return jobMessage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.JOB__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.JOB__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentResource() {
		return currentResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.JOB__CONTEXT:
				return basicSetContext(null, msgs);
			case ServerPackage.JOB__JOB_REFERENCE:
				return basicSetJobReference(null, msgs);
			case ServerPackage.JOB__JOB_RUN_INFO:
				return basicSetJobRunInfo(null, msgs);
			case ServerPackage.JOB__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServerPackage.JOB__CONTEXT:
				return getContext();
			case ServerPackage.JOB__CREATION_DATE:
				return getCreationDate();
			case ServerPackage.JOB__CURRENT_RESOURCE:
				return getCurrentResource();
			case ServerPackage.JOB__DATE_FORMAT:
				return getDateFormat();
			case ServerPackage.JOB__DATE_SEPARATOR:
				return getDateSeparator();
			case ServerPackage.JOB__DESTROY_DATE:
				return getDestroyDate();
			case ServerPackage.JOB__JOB_ID:
				return getJobID();
			case ServerPackage.JOB__JOB_REFERENCE:
				return getJobReference();
			case ServerPackage.JOB__JOB_RUN_INFO:
				return getJobRunInfo();
			case ServerPackage.JOB__JOB_THREAD:
				return getJobThread();
			case ServerPackage.JOB__JOB_TYPE:
				return getJobType();
			case ServerPackage.JOB__RESOURCES:
				return getResources();
			case ServerPackage.JOB__MESSAGES:
				return getMessages();
			case ServerPackage.JOB__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ServerPackage.JOB__TIME_SEPARATOR:
				return getTimeSeparator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServerPackage.JOB__CONTEXT:
				setContext((Context)newValue);
				return;
			case ServerPackage.JOB__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case ServerPackage.JOB__CURRENT_RESOURCE:
				setCurrentResource((String)newValue);
				return;
			case ServerPackage.JOB__DATE_FORMAT:
				setDateFormat((DateFormat)newValue);
				return;
			case ServerPackage.JOB__DATE_SEPARATOR:
				setDateSeparator((String)newValue);
				return;
			case ServerPackage.JOB__DESTROY_DATE:
				setDestroyDate((Date)newValue);
				return;
			case ServerPackage.JOB__JOB_ID:
				setJobID((String)newValue);
				return;
			case ServerPackage.JOB__JOB_REFERENCE:
				setJobReference((JobReference)newValue);
				return;
			case ServerPackage.JOB__JOB_RUN_INFO:
				setJobRunInfo((JobRunInfo)newValue);
				return;
			case ServerPackage.JOB__JOB_THREAD:
				setJobThread((org.abchip.mimo.util.Thread)newValue);
				return;
			case ServerPackage.JOB__JOB_TYPE:
				setJobType((JobType)newValue);
				return;
			case ServerPackage.JOB__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends String>)newValue);
				return;
			case ServerPackage.JOB__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends JobMessage>)newValue);
				return;
			case ServerPackage.JOB__SYSTEM:
				setSystem((org.abchip.mimo.server.System)newValue);
				return;
			case ServerPackage.JOB__TIME_SEPARATOR:
				setTimeSeparator((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServerPackage.JOB__CONTEXT:
				setContext((Context)null);
				return;
			case ServerPackage.JOB__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case ServerPackage.JOB__CURRENT_RESOURCE:
				setCurrentResource(CURRENT_RESOURCE_EDEFAULT);
				return;
			case ServerPackage.JOB__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case ServerPackage.JOB__DATE_SEPARATOR:
				setDateSeparator(DATE_SEPARATOR_EDEFAULT);
				return;
			case ServerPackage.JOB__DESTROY_DATE:
				setDestroyDate(DESTROY_DATE_EDEFAULT);
				return;
			case ServerPackage.JOB__JOB_ID:
				setJobID(JOB_ID_EDEFAULT);
				return;
			case ServerPackage.JOB__JOB_REFERENCE:
				setJobReference((JobReference)null);
				return;
			case ServerPackage.JOB__JOB_RUN_INFO:
				setJobRunInfo((JobRunInfo)null);
				return;
			case ServerPackage.JOB__JOB_THREAD:
				setJobThread((org.abchip.mimo.util.Thread)null);
				return;
			case ServerPackage.JOB__JOB_TYPE:
				setJobType(JOB_TYPE_EDEFAULT);
				return;
			case ServerPackage.JOB__RESOURCES:
				getResources().clear();
				return;
			case ServerPackage.JOB__MESSAGES:
				getMessages().clear();
				return;
			case ServerPackage.JOB__SYSTEM:
				setSystem((org.abchip.mimo.server.System)null);
				return;
			case ServerPackage.JOB__TIME_SEPARATOR:
				setTimeSeparator(TIME_SEPARATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServerPackage.JOB__CONTEXT:
				return context != null;
			case ServerPackage.JOB__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case ServerPackage.JOB__CURRENT_RESOURCE:
				return CURRENT_RESOURCE_EDEFAULT == null ? currentResource != null : !CURRENT_RESOURCE_EDEFAULT.equals(currentResource);
			case ServerPackage.JOB__DATE_FORMAT:
				return dateFormat != DATE_FORMAT_EDEFAULT;
			case ServerPackage.JOB__DATE_SEPARATOR:
				return DATE_SEPARATOR_EDEFAULT == null ? dateSeparator != null : !DATE_SEPARATOR_EDEFAULT.equals(dateSeparator);
			case ServerPackage.JOB__DESTROY_DATE:
				return DESTROY_DATE_EDEFAULT == null ? destroyDate != null : !DESTROY_DATE_EDEFAULT.equals(destroyDate);
			case ServerPackage.JOB__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobID != null : !JOB_ID_EDEFAULT.equals(jobID);
			case ServerPackage.JOB__JOB_REFERENCE:
				return jobReference != null;
			case ServerPackage.JOB__JOB_RUN_INFO:
				return jobRunInfo != null;
			case ServerPackage.JOB__JOB_THREAD:
				return jobThread != null;
			case ServerPackage.JOB__JOB_TYPE:
				return jobType != JOB_TYPE_EDEFAULT;
			case ServerPackage.JOB__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ServerPackage.JOB__MESSAGES:
				return messages != null && !messages.isEmpty();
			case ServerPackage.JOB__SYSTEM:
				return system != null;
			case ServerPackage.JOB__TIME_SEPARATOR:
				return TIME_SEPARATOR_EDEFAULT == null ? timeSeparator != null : !TIME_SEPARATOR_EDEFAULT.equals(timeSeparator);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", currentResource: ");
		result.append(currentResource);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", dateSeparator: ");
		result.append(dateSeparator);
		result.append(", destroyDate: ");
		result.append(destroyDate);
		result.append(", jobID: ");
		result.append(jobID);
		result.append(", jobType: ");
		result.append(jobType);
		result.append(", resources: ");
		result.append(resources);
		result.append(", timeSeparator: ");
		result.append(timeSeparator);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		return getJobID();
	}

} // JobImpl
