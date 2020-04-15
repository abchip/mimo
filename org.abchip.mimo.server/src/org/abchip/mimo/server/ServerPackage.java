/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.server.ServerFactory
 * @model kind="package"
 * @generated
 */
public interface ServerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/server";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-srv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerPackage eINSTANCE = org.abchip.mimo.server.impl.ServerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CURRENT_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DATE_FORMAT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DATE_SEPARATOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destroy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DESTROY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Job Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_REFERENCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Job Run Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_RUN_INFO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Job Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_THREAD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Job Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MESSAGES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SYSTEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Time Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIME_SEPARATOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobCapabilityImpl <em>Job Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobCapabilityImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobCapability()
	 * @generated
	 */
	int JOB_CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__RIGHTS = ContextPackage.CAPABILITY__RIGHTS;

	/**
	 * The feature id for the '<em><b>Entity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__ENTITY_URI = ContextPackage.CAPABILITY__ENTITY_URI;

	/**
	 * The feature id for the '<em><b>Job Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__JOB_REFERENCE = ContextPackage.CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__NAME = ContextPackage.CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__PORT = ContextPackage.CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY__TEXT = ContextPackage.CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Job Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CAPABILITY_FEATURE_COUNT = ContextPackage.CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobDescriptionImpl <em>Job Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobDescriptionImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobDescription()
	 * @generated
	 */
	int JOB_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__USER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobEventImpl <em>Job Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobEventImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobEvent()
	 * @generated
	 */
	int JOB_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Job Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobListener <em>Job Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobListener
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobListener()
	 * @generated
	 */
	int JOB_LISTENER = 4;

	/**
	 * The number of structural features of the '<em>Job Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobLogImpl <em>Job Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobLogImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLog()
	 * @generated
	 */
	int JOB_LOG = 5;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__JOB = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__ENTRIES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobLogEntryImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLogEntry()
	 * @generated
	 */
	int JOB_LOG_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__GRAVITY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__MESSAGE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__CREATION_DATE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobLogManager <em>Job Log Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobLogManager
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLogManager()
	 * @generated
	 */
	int JOB_LOG_MANAGER = 7;

	/**
	 * The number of structural features of the '<em>Job Log Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobManager <em>Job Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobManager
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobManager()
	 * @generated
	 */
	int JOB_MANAGER = 8;

	/**
	 * The number of structural features of the '<em>Job Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobMessageImpl <em>Job Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobMessageImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobMessage()
	 * @generated
	 */
	int JOB_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MESSAGE__MESSAGE_ID = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MESSAGE__MESSAGE_TEXT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MESSAGE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobReferenceImpl <em>Job Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobReferenceImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobReference()
	 * @generated
	 */
	int JOB_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REFERENCE__JOB_NUMBER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REFERENCE__JOB_USER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REFERENCE__JOB_NAME = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REFERENCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.JobRunInfoImpl <em>Job Run Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.JobRunInfoImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobRunInfo()
	 * @generated
	 */
	int JOB_RUN_INFO = 11;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_RUN_INFO__MEMORY_SIZE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Job Run Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_RUN_INFO_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.SystemImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LAST_JOB_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_USER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.impl.SystemEventImpl <em>System Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.impl.SystemEventImpl
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemEvent()
	 * @generated
	 */
	int SYSTEM_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.SystemListener <em>System Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.SystemListener
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemListener()
	 * @generated
	 */
	int SYSTEM_LISTENER = 14;

	/**
	 * The number of structural features of the '<em>System Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.SystemManager <em>System Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.SystemManager
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemManager()
	 * @generated
	 */
	int SYSTEM_MANAGER = 15;

	/**
	 * The number of structural features of the '<em>System Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobEventType <em>Job Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobEventType
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobEventType()
	 * @generated
	 */
	int JOB_EVENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobStatus
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.JobType <em>Job Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.JobType
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobType()
	 * @generated
	 */
	int JOB_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.SystemEventType <em>System Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.SystemEventType
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemEventType()
	 * @generated
	 */
	int SYSTEM_EVENT_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.server.SystemStatus <em>System Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.SystemStatus
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 20;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.server.ServerException
	 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getServerException()
	 * @generated
	 */
	int SERVER_EXCEPTION = 21;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.abchip.mimo.server.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.server.Job#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.abchip.mimo.server.Job#getContext()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.abchip.mimo.server.Job#getCreationDate()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getCurrentResource <em>Current Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Resource</em>'.
	 * @see org.abchip.mimo.server.Job#getCurrentResource()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_CurrentResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see org.abchip.mimo.server.Job#getDateFormat()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getDateSeparator <em>Date Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Separator</em>'.
	 * @see org.abchip.mimo.server.Job#getDateSeparator()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_DateSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getDestroyDate <em>Destroy Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroy Date</em>'.
	 * @see org.abchip.mimo.server.Job#getDestroyDate()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_DestroyDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getJobID <em>Job ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job ID</em>'.
	 * @see org.abchip.mimo.server.Job#getJobID()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobID();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.server.Job#getJobReference <em>Job Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Reference</em>'.
	 * @see org.abchip.mimo.server.Job#getJobReference()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_JobReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.server.Job#getJobRunInfo <em>Job Run Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Run Info</em>'.
	 * @see org.abchip.mimo.server.Job#getJobRunInfo()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_JobRunInfo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.Job#getJobThread <em>Job Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Thread</em>'.
	 * @see org.abchip.mimo.server.Job#getJobThread()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_JobThread();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getJobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Type</em>'.
	 * @see org.abchip.mimo.server.Job#getJobType()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.server.Job#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.abchip.mimo.server.Job#getMessages()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Messages();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.Job#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.abchip.mimo.server.Job#getSystem()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_System();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.Job#getTimeSeparator <em>Time Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Separator</em>'.
	 * @see org.abchip.mimo.server.Job#getTimeSeparator()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_TimeSeparator();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobCapability <em>Job Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Capability</em>'.
	 * @see org.abchip.mimo.server.JobCapability
	 * @generated
	 */
	EClass getJobCapability();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.JobCapability#getJobReference <em>Job Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Reference</em>'.
	 * @see org.abchip.mimo.server.JobCapability#getJobReference()
	 * @see #getJobCapability()
	 * @generated
	 */
	EReference getJobCapability_JobReference();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobCapability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.server.JobCapability#getName()
	 * @see #getJobCapability()
	 * @generated
	 */
	EAttribute getJobCapability_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobCapability#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.server.JobCapability#getPort()
	 * @see #getJobCapability()
	 * @generated
	 */
	EAttribute getJobCapability_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobCapability#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.server.JobCapability#getText()
	 * @see #getJobCapability()
	 * @generated
	 */
	EAttribute getJobCapability_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Description</em>'.
	 * @see org.abchip.mimo.server.JobDescription
	 * @generated
	 */
	EClass getJobDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.server.JobDescription#getName()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobDescription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.server.JobDescription#getText()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobDescription#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.server.JobDescription#getUser()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_User();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobEvent <em>Job Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Event</em>'.
	 * @see org.abchip.mimo.server.JobEvent
	 * @generated
	 */
	EClass getJobEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.JobEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.abchip.mimo.server.JobEvent#getSource()
	 * @see #getJobEvent()
	 * @generated
	 */
	EReference getJobEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.server.JobEvent#getType()
	 * @see #getJobEvent()
	 * @generated
	 */
	EAttribute getJobEvent_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobListener <em>Job Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Listener</em>'.
	 * @see org.abchip.mimo.server.JobListener
	 * @generated
	 */
	EClass getJobListener();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobLog <em>Job Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log</em>'.
	 * @see org.abchip.mimo.server.JobLog
	 * @generated
	 */
	EClass getJobLog();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.JobLog#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see org.abchip.mimo.server.JobLog#getJob()
	 * @see #getJobLog()
	 * @generated
	 */
	EReference getJobLog_Job();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.server.JobLog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.abchip.mimo.server.JobLog#getEntries()
	 * @see #getJobLog()
	 * @generated
	 */
	EReference getJobLog_Entries();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobLogEntry <em>Job Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Entry</em>'.
	 * @see org.abchip.mimo.server.JobLogEntry
	 * @generated
	 */
	EClass getJobLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobLogEntry#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.abchip.mimo.server.JobLogEntry#getGravity()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Gravity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobLogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.abchip.mimo.server.JobLogEntry#getMessage()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobLogEntry#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.abchip.mimo.server.JobLogEntry#getCreationDate()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_CreationDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobLogManager <em>Job Log Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Manager</em>'.
	 * @see org.abchip.mimo.server.JobLogManager
	 * @generated
	 */
	EClass getJobLogManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobManager <em>Job Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Manager</em>'.
	 * @see org.abchip.mimo.server.JobManager
	 * @generated
	 */
	EClass getJobManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobMessage <em>Job Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Message</em>'.
	 * @see org.abchip.mimo.server.JobMessage
	 * @generated
	 */
	EClass getJobMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobMessage#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.server.JobMessage#getMessageId()
	 * @see #getJobMessage()
	 * @generated
	 */
	EAttribute getJobMessage_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobMessage#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Text</em>'.
	 * @see org.abchip.mimo.server.JobMessage#getMessageText()
	 * @see #getJobMessage()
	 * @generated
	 */
	EAttribute getJobMessage_MessageText();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobReference <em>Job Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Reference</em>'.
	 * @see org.abchip.mimo.server.JobReference
	 * @generated
	 */
	EClass getJobReference();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobReference#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see org.abchip.mimo.server.JobReference#getJobNumber()
	 * @see #getJobReference()
	 * @generated
	 */
	EAttribute getJobReference_JobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobReference#getJobUser <em>Job User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job User</em>'.
	 * @see org.abchip.mimo.server.JobReference#getJobUser()
	 * @see #getJobReference()
	 * @generated
	 */
	EAttribute getJobReference_JobUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobReference#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.abchip.mimo.server.JobReference#getJobName()
	 * @see #getJobReference()
	 * @generated
	 */
	EAttribute getJobReference_JobName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.JobRunInfo <em>Job Run Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Run Info</em>'.
	 * @see org.abchip.mimo.server.JobRunInfo
	 * @generated
	 */
	EClass getJobRunInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.JobRunInfo#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.abchip.mimo.server.JobRunInfo#getMemorySize()
	 * @see #getJobRunInfo()
	 * @generated
	 */
	EAttribute getJobRunInfo_MemorySize();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.abchip.mimo.server.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.server.System#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.abchip.mimo.server.System#getContext()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.System#getLastJobNumber <em>Last Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Job Number</em>'.
	 * @see org.abchip.mimo.server.System#getLastJobNumber()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_LastJobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.server.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.System#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.server.System#getPort()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.System#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.server.System#getStatus()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.System#getSystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System User</em>'.
	 * @see org.abchip.mimo.server.System#getSystemUser()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemUser();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Event</em>'.
	 * @see org.abchip.mimo.server.SystemEvent
	 * @generated
	 */
	EClass getSystemEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.server.SystemEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.abchip.mimo.server.SystemEvent#getSource()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EReference getSystemEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.server.SystemEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.server.SystemEvent#getType()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EAttribute getSystemEvent_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.SystemListener <em>System Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Listener</em>'.
	 * @see org.abchip.mimo.server.SystemListener
	 * @generated
	 */
	EClass getSystemListener();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.server.SystemManager <em>System Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Manager</em>'.
	 * @see org.abchip.mimo.server.SystemManager
	 * @generated
	 */
	EClass getSystemManager();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.server.JobEventType <em>Job Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Event Type</em>'.
	 * @see org.abchip.mimo.server.JobEventType
	 * @generated
	 */
	EEnum getJobEventType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.server.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see org.abchip.mimo.server.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.server.JobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Type</em>'.
	 * @see org.abchip.mimo.server.JobType
	 * @generated
	 */
	EEnum getJobType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.server.SystemEventType <em>System Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Event Type</em>'.
	 * @see org.abchip.mimo.server.SystemEventType
	 * @generated
	 */
	EEnum getSystemEventType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.server.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Status</em>'.
	 * @see org.abchip.mimo.server.SystemStatus
	 * @generated
	 */
	EEnum getSystemStatus();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.server.ServerException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.abchip.mimo.server.ServerException
	 * @model instanceClass="org.abchip.mimo.server.ServerException"
	 * @generated
	 */
	EDataType getServerException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServerFactory getServerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTEXT = eINSTANCE.getJob_Context();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CREATION_DATE = eINSTANCE.getJob_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Current Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CURRENT_RESOURCE = eINSTANCE.getJob_CurrentResource();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DATE_FORMAT = eINSTANCE.getJob_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Date Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DATE_SEPARATOR = eINSTANCE.getJob_DateSeparator();

		/**
		 * The meta object literal for the '<em><b>Destroy Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DESTROY_DATE = eINSTANCE.getJob_DestroyDate();

		/**
		 * The meta object literal for the '<em><b>Job ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_ID = eINSTANCE.getJob_JobID();

		/**
		 * The meta object literal for the '<em><b>Job Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB_REFERENCE = eINSTANCE.getJob_JobReference();

		/**
		 * The meta object literal for the '<em><b>Job Run Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB_RUN_INFO = eINSTANCE.getJob_JobRunInfo();

		/**
		 * The meta object literal for the '<em><b>Job Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB_THREAD = eINSTANCE.getJob_JobThread();

		/**
		 * The meta object literal for the '<em><b>Job Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_TYPE = eINSTANCE.getJob_JobType();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__MESSAGES = eINSTANCE.getJob_Messages();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SYSTEM = eINSTANCE.getJob_System();

		/**
		 * The meta object literal for the '<em><b>Time Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TIME_SEPARATOR = eINSTANCE.getJob_TimeSeparator();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobCapabilityImpl <em>Job Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobCapabilityImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobCapability()
		 * @generated
		 */
		EClass JOB_CAPABILITY = eINSTANCE.getJobCapability();

		/**
		 * The meta object literal for the '<em><b>Job Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_CAPABILITY__JOB_REFERENCE = eINSTANCE.getJobCapability_JobReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_CAPABILITY__NAME = eINSTANCE.getJobCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_CAPABILITY__PORT = eINSTANCE.getJobCapability_Port();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_CAPABILITY__TEXT = eINSTANCE.getJobCapability_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobDescriptionImpl <em>Job Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobDescriptionImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobDescription()
		 * @generated
		 */
		EClass JOB_DESCRIPTION = eINSTANCE.getJobDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__NAME = eINSTANCE.getJobDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__TEXT = eINSTANCE.getJobDescription_Text();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__USER = eINSTANCE.getJobDescription_User();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobEventImpl <em>Job Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobEventImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobEvent()
		 * @generated
		 */
		EClass JOB_EVENT = eINSTANCE.getJobEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_EVENT__SOURCE = eINSTANCE.getJobEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_EVENT__TYPE = eINSTANCE.getJobEvent_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobListener <em>Job Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobListener
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobListener()
		 * @generated
		 */
		EClass JOB_LISTENER = eINSTANCE.getJobListener();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobLogImpl <em>Job Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobLogImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLog()
		 * @generated
		 */
		EClass JOB_LOG = eINSTANCE.getJobLog();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_LOG__JOB = eINSTANCE.getJobLog_Job();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_LOG__ENTRIES = eINSTANCE.getJobLog_Entries();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobLogEntryImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLogEntry()
		 * @generated
		 */
		EClass JOB_LOG_ENTRY = eINSTANCE.getJobLogEntry();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__GRAVITY = eINSTANCE.getJobLogEntry_Gravity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__MESSAGE = eINSTANCE.getJobLogEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__CREATION_DATE = eINSTANCE.getJobLogEntry_CreationDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobLogManager <em>Job Log Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobLogManager
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobLogManager()
		 * @generated
		 */
		EClass JOB_LOG_MANAGER = eINSTANCE.getJobLogManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobManager <em>Job Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobManager
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobManager()
		 * @generated
		 */
		EClass JOB_MANAGER = eINSTANCE.getJobManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobMessageImpl <em>Job Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobMessageImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobMessage()
		 * @generated
		 */
		EClass JOB_MESSAGE = eINSTANCE.getJobMessage();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MESSAGE__MESSAGE_ID = eINSTANCE.getJobMessage_MessageId();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MESSAGE__MESSAGE_TEXT = eINSTANCE.getJobMessage_MessageText();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobReferenceImpl <em>Job Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobReferenceImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobReference()
		 * @generated
		 */
		EClass JOB_REFERENCE = eINSTANCE.getJobReference();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REFERENCE__JOB_NUMBER = eINSTANCE.getJobReference_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Job User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REFERENCE__JOB_USER = eINSTANCE.getJobReference_JobUser();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REFERENCE__JOB_NAME = eINSTANCE.getJobReference_JobName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.JobRunInfoImpl <em>Job Run Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.JobRunInfoImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobRunInfo()
		 * @generated
		 */
		EClass JOB_RUN_INFO = eINSTANCE.getJobRunInfo();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_RUN_INFO__MEMORY_SIZE = eINSTANCE.getJobRunInfo_MemorySize();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.SystemImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTEXT = eINSTANCE.getSystem_Context();

		/**
		 * The meta object literal for the '<em><b>Last Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__LAST_JOB_NUMBER = eINSTANCE.getSystem_LastJobNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__PORT = eINSTANCE.getSystem_Port();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__STATUS = eINSTANCE.getSystem_Status();

		/**
		 * The meta object literal for the '<em><b>System User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_USER = eINSTANCE.getSystem_SystemUser();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.impl.SystemEventImpl <em>System Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.impl.SystemEventImpl
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemEvent()
		 * @generated
		 */
		EClass SYSTEM_EVENT = eINSTANCE.getSystemEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_EVENT__SOURCE = eINSTANCE.getSystemEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_EVENT__TYPE = eINSTANCE.getSystemEvent_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.SystemListener <em>System Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.SystemListener
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemListener()
		 * @generated
		 */
		EClass SYSTEM_LISTENER = eINSTANCE.getSystemListener();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.SystemManager <em>System Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.SystemManager
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemManager()
		 * @generated
		 */
		EClass SYSTEM_MANAGER = eINSTANCE.getSystemManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobEventType <em>Job Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobEventType
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobEventType()
		 * @generated
		 */
		EEnum JOB_EVENT_TYPE = eINSTANCE.getJobEventType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobStatus
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.JobType <em>Job Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.JobType
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getJobType()
		 * @generated
		 */
		EEnum JOB_TYPE = eINSTANCE.getJobType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.SystemEventType <em>System Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.SystemEventType
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemEventType()
		 * @generated
		 */
		EEnum SYSTEM_EVENT_TYPE = eINSTANCE.getSystemEventType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.server.SystemStatus <em>System Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.SystemStatus
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getSystemStatus()
		 * @generated
		 */
		EEnum SYSTEM_STATUS = eINSTANCE.getSystemStatus();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.server.ServerException
		 * @see org.abchip.mimo.server.impl.ServerPackageImpl#getServerException()
		 * @generated
		 */
		EDataType SERVER_EXCEPTION = eINSTANCE.getServerException();

	}

} //ServerPackage
