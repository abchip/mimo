/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.data.DataPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobCapability;
import org.abchip.mimo.server.JobDescription;
import org.abchip.mimo.server.JobEvent;
import org.abchip.mimo.server.JobEventType;
import org.abchip.mimo.server.JobListener;
import org.abchip.mimo.server.JobLog;
import org.abchip.mimo.server.JobLogEntry;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.server.JobMessage;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.JobRunInfo;
import org.abchip.mimo.server.JobStatus;
import org.abchip.mimo.server.JobType;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerPackage;
import org.abchip.mimo.server.SystemEvent;
import org.abchip.mimo.server.SystemEventType;
import org.abchip.mimo.server.SystemListener;
import org.abchip.mimo.server.SystemManager;
import org.abchip.mimo.server.SystemStatus;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerPackageImpl extends EPackageImpl implements ServerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRunInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.server.ServerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServerPackageImpl() {
		super(eNS_URI, ServerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ServerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServerPackage init() {
		if (isInited) return (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServerPackageImpl theServerPackage = registeredServerPackage instanceof ServerPackageImpl ? (ServerPackageImpl)registeredServerPackage : new ServerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServerPackage.createPackageContents();

		// Initialize created meta-data
		theServerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServerPackage.eNS_URI, theServerPackage);
		return theServerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Context() {
		return (EReference)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_CreationDate() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_CurrentResource() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_DateFormat() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_DateSeparator() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_DestroyDate() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobID() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_JobReference() {
		return (EReference)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_JobRunInfo() {
		return (EReference)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_JobThread() {
		return (EReference)jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobType() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Messages() {
		return (EReference)jobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_System() {
		return (EReference)jobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_TimeSeparator() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobCapability() {
		return jobCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobCapability_JobReference() {
		return (EReference)jobCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobCapability_Name() {
		return (EAttribute)jobCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobCapability_Port() {
		return (EAttribute)jobCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobCapability_Text() {
		return (EAttribute)jobCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobDescription() {
		return jobDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobDescription_Name() {
		return (EAttribute)jobDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobDescription_User() {
		return (EAttribute)jobDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobDescription_Text() {
		return (EAttribute)jobDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobEvent() {
		return jobEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobEvent_Source() {
		return (EReference)jobEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobEvent_Type() {
		return (EAttribute)jobEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobListener() {
		return jobListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLog() {
		return jobLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobLog_Job() {
		return (EReference)jobLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobLog_Entries() {
		return (EReference)jobLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLogEntry() {
		return jobLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_Gravity() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_Message() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_CreationDate() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLogManager() {
		return jobLogManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobManager() {
		return jobManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobMessage() {
		return jobMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobMessage_MessageId() {
		return (EAttribute)jobMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobMessage_MessageText() {
		return (EAttribute)jobMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobReference() {
		return jobReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobReference_JobNumber() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobReference_JobUser() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobReference_JobName() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobRunInfo() {
		return jobRunInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobRunInfo_MemorySize() {
		return (EAttribute)jobRunInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Context() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_LastJobNumber() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Port() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Status() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_SystemUser() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemEvent() {
		return systemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemEvent_Source() {
		return (EReference)systemEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemEvent_Type() {
		return (EAttribute)systemEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemListener() {
		return systemListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemManager() {
		return systemManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobEventType() {
		return jobEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobStatus() {
		return jobStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobType() {
		return jobTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemEventType() {
		return systemEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemStatus() {
		return systemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerFactory getServerFactory() {
		return (ServerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__CONTEXT);
		createEAttribute(jobEClass, JOB__CREATION_DATE);
		createEAttribute(jobEClass, JOB__CURRENT_RESOURCE);
		createEAttribute(jobEClass, JOB__DATE_FORMAT);
		createEAttribute(jobEClass, JOB__DATE_SEPARATOR);
		createEAttribute(jobEClass, JOB__DESTROY_DATE);
		createEAttribute(jobEClass, JOB__JOB_ID);
		createEReference(jobEClass, JOB__JOB_REFERENCE);
		createEReference(jobEClass, JOB__JOB_RUN_INFO);
		createEReference(jobEClass, JOB__JOB_THREAD);
		createEAttribute(jobEClass, JOB__JOB_TYPE);
		createEReference(jobEClass, JOB__MESSAGES);
		createEReference(jobEClass, JOB__SYSTEM);
		createEAttribute(jobEClass, JOB__TIME_SEPARATOR);

		jobCapabilityEClass = createEClass(JOB_CAPABILITY);
		createEReference(jobCapabilityEClass, JOB_CAPABILITY__JOB_REFERENCE);
		createEAttribute(jobCapabilityEClass, JOB_CAPABILITY__NAME);
		createEAttribute(jobCapabilityEClass, JOB_CAPABILITY__PORT);
		createEAttribute(jobCapabilityEClass, JOB_CAPABILITY__TEXT);

		jobDescriptionEClass = createEClass(JOB_DESCRIPTION);
		createEAttribute(jobDescriptionEClass, JOB_DESCRIPTION__NAME);
		createEAttribute(jobDescriptionEClass, JOB_DESCRIPTION__TEXT);
		createEAttribute(jobDescriptionEClass, JOB_DESCRIPTION__USER);

		jobEventEClass = createEClass(JOB_EVENT);
		createEReference(jobEventEClass, JOB_EVENT__SOURCE);
		createEAttribute(jobEventEClass, JOB_EVENT__TYPE);

		jobListenerEClass = createEClass(JOB_LISTENER);

		jobLogEClass = createEClass(JOB_LOG);
		createEReference(jobLogEClass, JOB_LOG__JOB);
		createEReference(jobLogEClass, JOB_LOG__ENTRIES);

		jobLogEntryEClass = createEClass(JOB_LOG_ENTRY);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__GRAVITY);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__MESSAGE);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__CREATION_DATE);

		jobLogManagerEClass = createEClass(JOB_LOG_MANAGER);

		jobManagerEClass = createEClass(JOB_MANAGER);

		jobMessageEClass = createEClass(JOB_MESSAGE);
		createEAttribute(jobMessageEClass, JOB_MESSAGE__MESSAGE_ID);
		createEAttribute(jobMessageEClass, JOB_MESSAGE__MESSAGE_TEXT);

		jobReferenceEClass = createEClass(JOB_REFERENCE);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_NUMBER);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_USER);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_NAME);

		jobRunInfoEClass = createEClass(JOB_RUN_INFO);
		createEAttribute(jobRunInfoEClass, JOB_RUN_INFO__MEMORY_SIZE);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTEXT);
		createEAttribute(systemEClass, SYSTEM__LAST_JOB_NUMBER);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__PORT);
		createEAttribute(systemEClass, SYSTEM__STATUS);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_USER);

		systemEventEClass = createEClass(SYSTEM_EVENT);
		createEReference(systemEventEClass, SYSTEM_EVENT__SOURCE);
		createEAttribute(systemEventEClass, SYSTEM_EVENT__TYPE);

		systemListenerEClass = createEClass(SYSTEM_LISTENER);

		systemManagerEClass = createEClass(SYSTEM_MANAGER);

		// Create enums
		jobEventTypeEEnum = createEEnum(JOB_EVENT_TYPE);
		jobStatusEEnum = createEEnum(JOB_STATUS);
		jobTypeEEnum = createEEnum(JOB_TYPE);
		systemEventTypeEEnum = createEEnum(SYSTEM_EVENT_TYPE);
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		jobCapabilityEClass.getESuperTypes().add(theContextPackage.getCapability());
		jobDescriptionEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		jobDescriptionEClass.getESuperTypes().add(theEntityPackage.getTextable());
		jobLogEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		jobLogEntryEClass.getESuperTypes().add(theEntityPackage.getEntity());
		jobMessageEClass.getESuperTypes().add(theEntityPackage.getEntity());
		jobReferenceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		jobRunInfoEClass.getESuperTypes().add(theEntityPackage.getEntity());
		systemEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Context(), theContextPackage.getContext(), null, "context", null, 0, 1, Job.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_CurrentResource(), ecorePackage.getEString(), "currentResource", "QGPL", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_DateFormat(), theDataPackage.getDateFormat(), "dateFormat", "DMY", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_DateSeparator(), ecorePackage.getEString(), "dateSeparator", "/", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_DestroyDate(), ecorePackage.getEDate(), "destroyDate", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_JobID(), ecorePackage.getEString(), "jobID", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobReference(), this.getJobReference(), null, "jobReference", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobRunInfo(), this.getJobRunInfo(), null, "jobRunInfo", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobThread(), theUtilPackage.getThread(), null, "jobThread", null, 0, 1, Job.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_JobType(), this.getJobType(), "jobType", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Messages(), this.getJobMessage(), null, "messages", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_System(), this.getSystem(), null, "system", null, 1, 1, Job.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_TimeSeparator(), ecorePackage.getEString(), "timeSeparator", ":", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jobEClass, this.getJobStatus(), "getJobStatus", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEDouble(), "getCPUUsage", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, this.getJobMessage(), "getLastMessage", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getELong(), "getMemorySize", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEInt(), "getPriority", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEBoolean(), "isActive", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEBoolean(), "isError", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEBoolean(), "isRouted", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobCapabilityEClass, JobCapability.class, "JobCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobCapability_JobReference(), this.getJobReference(), null, "jobReference", null, 1, 1, JobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobCapability_Name(), ecorePackage.getEString(), "name", null, 1, 1, JobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobCapability_Port(), ecorePackage.getEInt(), "port", null, 0, 1, JobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobCapability_Text(), ecorePackage.getEString(), "text", null, 1, 1, JobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobDescriptionEClass, JobDescription.class, "JobDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, JobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobDescription_Text(), ecorePackage.getEString(), "text", null, 1, 1, JobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobDescription_User(), ecorePackage.getEString(), "user", null, 0, 1, JobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEventEClass, JobEvent.class, "JobEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEvent_Source(), this.getJob(), null, "source", null, 0, 1, JobEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEvent_Type(), this.getJobEventType(), "type", null, 1, 1, JobEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobListenerEClass, JobListener.class, "JobListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(jobListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobLogEClass, JobLog.class, "JobLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobLog_Job(), this.getJob(), null, "job", null, 1, 1, JobLog.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobLog_Entries(), this.getJobLogEntry(), null, "entries", null, 0, -1, JobLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobLogEntryEClass, JobLogEntry.class, "JobLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobLogEntry_Gravity(), ecorePackage.getEInt(), "gravity", null, 1, 1, JobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobLogEntry_Message(), ecorePackage.getEString(), "message", null, 1, 1, JobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobLogEntry_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, JobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobLogManagerEClass, JobLogManager.class, "JobLogManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(jobLogManagerEClass, null, "addEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "gravity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobReference(), "jobReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobManagerEClass, JobManager.class, "JobManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(jobManagerEClass, ecorePackage.getEBoolean(), "checkCapability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobManagerEClass, ecorePackage.getEInt(), "countActiveJobs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theContextPackage.getIdentity());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "identity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theContextPackage.getIdentity());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "identity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "delay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "millis", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "delay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resumeTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobManagerEClass, this.getJob(), "getActiveJobs", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "getUserJobs", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobReference(), "jobReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookupActiveJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookupActiveJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, ecorePackage.getEDate(), "now", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "spawn", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "copyEnvironmentVariables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "updateStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobStatus(), "status", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobMessageEClass, JobMessage.class, "JobMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobMessage_MessageId(), ecorePackage.getEString(), "messageId", null, 0, 1, JobMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobMessage_MessageText(), ecorePackage.getEString(), "messageText", null, 1, 1, JobMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobReferenceEClass, JobReference.class, "JobReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobReference_JobNumber(), ecorePackage.getEInt(), "jobNumber", null, 1, 1, JobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobReference_JobUser(), ecorePackage.getEString(), "jobUser", null, 1, 1, JobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobReference_JobName(), ecorePackage.getEString(), "jobName", null, 1, 1, JobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobRunInfoEClass, JobRunInfo.class, "JobRunInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobRunInfo_MemorySize(), ecorePackage.getELong(), "memorySize", null, 0, 1, JobRunInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, org.abchip.mimo.server.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Context(), theContextPackage.getContext(), null, "context", null, 0, 1, org.abchip.mimo.server.System.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_LastJobNumber(), ecorePackage.getEInt(), "lastJobNumber", null, 0, 1, org.abchip.mimo.server.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, org.abchip.mimo.server.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Port(), ecorePackage.getEInt(), "port", null, 1, 1, org.abchip.mimo.server.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Status(), this.getSystemStatus(), "status", "STP", 1, 1, org.abchip.mimo.server.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemUser(), ecorePackage.getEString(), "systemUser", null, 1, 1, org.abchip.mimo.server.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(systemEClass, ecorePackage.getEInt(), "getAvailableProcessors", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemEClass, ecorePackage.getEDouble(), "getLoadAverage", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEventEClass, SystemEvent.class, "SystemEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEvent_Source(), this.getSystem(), null, "source", null, 0, 1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemEvent_Type(), this.getSystemEventType(), "type", null, 1, 1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemListenerEClass, SystemListener.class, "SystemListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(systemListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemManagerEClass, SystemManager.class, "SystemManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(systemManagerEClass, this.getJob(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystem(), "system", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(systemManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(systemManagerEClass, null, "updateStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemStatus(), "status", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobEventTypeEEnum, JobEventType.class, "JobEventType");
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STARTING);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STARTED);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STATUS_CHANGED);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STOPPING);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STOPPED);

		initEEnum(jobStatusEEnum, JobStatus.class, "JobStatus");
		addEEnumLiteral(jobStatusEEnum, JobStatus.ACTIVE);
		addEEnumLiteral(jobStatusEEnum, JobStatus.TIME_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.RUN);
		addEEnumLiteral(jobStatusEEnum, JobStatus.MESSAGE_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.LOCK_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.EVENT_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.HOLD);
		addEEnumLiteral(jobStatusEEnum, JobStatus.END_OF_JOB);
		addEEnumLiteral(jobStatusEEnum, JobStatus.END);

		initEEnum(jobTypeEEnum, JobType.class, "JobType");
		addEEnumLiteral(jobTypeEEnum, JobType.KERNEL);
		addEEnumLiteral(jobTypeEEnum, JobType.INTERACTIVE);
		addEEnumLiteral(jobTypeEEnum, JobType.BATCH);

		initEEnum(systemEventTypeEEnum, SystemEventType.class, "SystemEventType");
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STARTING);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STARTED);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STATUS_CHANGED);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STOPPING);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STOPPED);

		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ACTIVATING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STARTED);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ENDING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STOPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServerPackageImpl
