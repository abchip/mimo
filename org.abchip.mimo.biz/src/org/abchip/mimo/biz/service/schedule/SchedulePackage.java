/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.biz.service.schedule.ScheduleFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/schedule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-schedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulePackage eINSTANCE = org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.JobManagerLockImpl <em>Job Manager Lock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.JobManagerLockImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getJobManagerLock()
	 * @generated
	 */
	int JOB_MANAGER_LOCK = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__INSTANCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reason Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__REASON_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Job Manager Lock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_LOCK_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl <em>Job Sandbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getJobSandbox()
	 * @generated
	 */
	int JOB_SANDBOX = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__JOB_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auth User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__AUTH_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__CANCEL_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__CURRENT_RECURRENCE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__CURRENT_RETRY_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Finish Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__FINISH_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__JOB_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Job Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__JOB_RESULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__LOADER_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__MAX_RECURRENCE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__MAX_RETRY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__PARENT_JOB_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__POOL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Previous Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__PREVIOUS_JOB_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Run As User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__RUN_AS_USER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Run By Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__RUN_BY_INSTANCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__RUN_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Runtime Data Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__RUNTIME_DATA_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__SERVICE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__START_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX__TEMP_EXPR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Job Sandbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SANDBOX_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl <em>Recurrence Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRecurrenceInfo()
	 * @generated
	 */
	int RECURRENCE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Date Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__EXCEPTION_DATE_TIMES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__EXCEPTION_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__RECURRENCE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recurrence Date Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__RECURRENCE_DATE_TIMES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recurrence Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__RECURRENCE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO__START_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Recurrence Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_INFO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl <em>Recurrence Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRecurrenceRule()
	 * @generated
	 */
	int RECURRENCE_RULE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Recurrence Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__RECURRENCE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>By Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_DAY_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>By Hour List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_HOUR_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>By Minute List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_MINUTE_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>By Month Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_MONTH_DAY_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>By Month List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_MONTH_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>By Second List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_SECOND_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>By Set Pos List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_SET_POS_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>By Week No List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_WEEK_NO_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>By Year Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__BY_YEAR_DAY_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Count Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__COUNT_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__FREQUENCY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Interval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__INTERVAL_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Until Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__UNTIL_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Week Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__WEEK_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>XName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE__XNAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Recurrence Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_RULE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl <em>Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRuntimeData()
	 * @generated
	 */
	int RUNTIME_DATA = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Runtime Data Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__RUNTIME_DATA_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA__RUNTIME_INFO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getTemporalExpression()
	 * @generated
	 */
	int TEMPORAL_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Temp Expr Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__TEMP_EXPR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__DATE1 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__DATE2 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Temporal Expression Assocs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Integer1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__INTEGER1 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Integer2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__INTEGER2 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__STRING1 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>String2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__STRING2 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Temp Expr Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Temporal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl <em>Temporal Expression Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl
	 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getTemporalExpressionAssoc()
	 * @generated
	 */
	int TEMPORAL_EXPRESSION_ASSOC = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr Assoc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Expression Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock <em>Job Manager Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Manager Lock</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock
	 * @generated
	 */
	EClass getJobManagerLock();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getInstanceId()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_InstanceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getFromDate()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getComments()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getCreatedByUserLogin()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getCreatedDate()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getLastModifiedByUserLogin()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getLastModifiedDate()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getReasonEnumId <em>Reason Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getReasonEnumId()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EReference getJobManagerLock_ReasonEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobManagerLock#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobManagerLock#getThruDate()
	 * @see #getJobManagerLock()
	 * @generated
	 */
	EAttribute getJobManagerLock_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.JobSandbox <em>Job Sandbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Sandbox</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox
	 * @generated
	 */
	EClass getJobSandbox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobId <em>Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getJobId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_JobId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getAuthUserLoginId <em>Auth User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auth User Login Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getAuthUserLoginId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_AuthUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCancelDateTime <em>Cancel Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Date Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getCancelDateTime()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_CancelDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRecurrenceCount <em>Current Recurrence Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Recurrence Count</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRecurrenceCount()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_CurrentRecurrenceCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRetryCount <em>Current Retry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Retry Count</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getCurrentRetryCount()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_CurrentRetryCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getFinishDateTime <em>Finish Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Date Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getFinishDateTime()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_FinishDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getJobName()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_JobName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getJobResult <em>Job Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Result</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getJobResult()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_JobResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getLoaderName <em>Loader Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loader Name</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getLoaderName()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_LoaderName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRecurrenceCount <em>Max Recurrence Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Recurrence Count</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRecurrenceCount()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_MaxRecurrenceCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRetry <em>Max Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Retry</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getMaxRetry()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_MaxRetry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getParentJobId <em>Parent Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Job Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getParentJobId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_ParentJobId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPoolId <em>Pool Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getPoolId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_PoolId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getPreviousJobId <em>Previous Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Job Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getPreviousJobId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_PreviousJobId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getRecurrenceInfoId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_RecurrenceInfoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunAsUser <em>Run As User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Run As User</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getRunAsUser()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_RunAsUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunByInstanceId <em>Run By Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run By Instance Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getRunByInstanceId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_RunByInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRunTime <em>Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getRunTime()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_RunTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getRuntimeDataId <em>Runtime Data Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Data Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getRuntimeDataId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_RuntimeDataId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getServiceName()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getStartDateTime()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EAttribute getJobSandbox_StartDateTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getStatusId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.JobSandbox#getTempExprId <em>Temp Expr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temp Expr Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.JobSandbox#getTempExprId()
	 * @see #getJobSandbox()
	 * @generated
	 */
	EReference getJobSandbox_TempExprId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo <em>Recurrence Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurrence Info</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo
	 * @generated
	 */
	EClass getRecurrenceInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceInfoId()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EAttribute getRecurrenceInfo_RecurrenceInfoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getExceptionDateTimes <em>Exception Date Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Date Times</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getExceptionDateTimes()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EAttribute getRecurrenceInfo_ExceptionDateTimes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getExceptionRuleId <em>Exception Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Rule Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getExceptionRuleId()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EReference getRecurrenceInfo_ExceptionRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceCount <em>Recurrence Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Count</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceCount()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EAttribute getRecurrenceInfo_RecurrenceCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceDateTimes <em>Recurrence Date Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Date Times</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceDateTimes()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EAttribute getRecurrenceInfo_RecurrenceDateTimes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceRuleId <em>Recurrence Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Rule Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getRecurrenceRuleId()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EReference getRecurrenceInfo_RecurrenceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceInfo#getStartDateTime()
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	EAttribute getRecurrenceInfo_StartDateTime();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule <em>Recurrence Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurrence Rule</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule
	 * @generated
	 */
	EClass getRecurrenceRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getRecurrenceRuleId <em>Recurrence Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Rule Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getRecurrenceRuleId()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_RecurrenceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByDayList <em>By Day List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Day List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByDayList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByDayList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByHourList <em>By Hour List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Hour List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByHourList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByHourList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMinuteList <em>By Minute List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Minute List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMinuteList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByMinuteList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthDayList <em>By Month Day List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month Day List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthDayList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByMonthDayList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthList <em>By Month List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByMonthList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySecondList <em>By Second List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Second List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySecondList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_BySecondList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySetPosList <em>By Set Pos List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Set Pos List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySetPosList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_BySetPosList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByWeekNoList <em>By Week No List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Week No List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByWeekNoList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByWeekNoList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByYearDayList <em>By Year Day List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Year Day List</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByYearDayList()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_ByYearDayList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getCountNumber <em>Count Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Number</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getCountNumber()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_CountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getFrequency()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getIntervalNumber <em>Interval Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Number</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getIntervalNumber()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_IntervalNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getUntilDateTime <em>Until Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date Time</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getUntilDateTime()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_UntilDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getWeekStart <em>Week Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Start</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getWeekStart()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_WeekStart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getXName <em>XName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XName</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RecurrenceRule#getXName()
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	EAttribute getRecurrenceRule_XName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.RuntimeData <em>Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Data</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RuntimeData
	 * @generated
	 */
	EClass getRuntimeData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeDataId <em>Runtime Data Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Data Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeDataId()
	 * @see #getRuntimeData()
	 * @generated
	 */
	EAttribute getRuntimeData_RuntimeDataId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeInfo()
	 * @see #getRuntimeData()
	 * @generated
	 */
	EAttribute getRuntimeData_RuntimeInfo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Expression</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression
	 * @generated
	 */
	EClass getTemporalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprId <em>Temp Expr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Expr Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprId()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_TempExprId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate1 <em>Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date1</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate1()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_Date1();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate2 <em>Date2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date2</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate2()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_Date2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getDescription()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getFromTemporalExpressionAssocs <em>From Temporal Expression Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Temporal Expression Assocs</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getFromTemporalExpressionAssocs()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EReference getTemporalExpression_FromTemporalExpressionAssocs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger1 <em>Integer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer1</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger1()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_Integer1();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger2 <em>Integer2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer2</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger2()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_Integer2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString1 <em>String1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String1</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getString1()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_String1();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString2 <em>String2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String2</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getString2()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_String2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprTypeId <em>Temp Expr Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Expr Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprTypeId()
	 * @see #getTemporalExpression()
	 * @generated
	 */
	EAttribute getTemporalExpression_TempExprTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc <em>Temporal Expression Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Expression Assoc</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc
	 * @generated
	 */
	EClass getTemporalExpressionAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getFromTempExprId <em>From Temp Expr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Temp Expr Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getFromTempExprId()
	 * @see #getTemporalExpressionAssoc()
	 * @generated
	 */
	EReference getTemporalExpressionAssoc_FromTempExprId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getToTempExprId <em>To Temp Expr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Temp Expr Id</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getToTempExprId()
	 * @see #getTemporalExpressionAssoc()
	 * @generated
	 */
	EReference getTemporalExpressionAssoc_ToTempExprId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getExprAssocType <em>Expr Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getExprAssocType()
	 * @see #getTemporalExpressionAssoc()
	 * @generated
	 */
	EAttribute getTemporalExpressionAssoc_ExprAssocType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduleFactory getScheduleFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.JobManagerLockImpl <em>Job Manager Lock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.JobManagerLockImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getJobManagerLock()
		 * @generated
		 */
		EClass JOB_MANAGER_LOCK = eINSTANCE.getJobManagerLock();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__INSTANCE_ID = eINSTANCE.getJobManagerLock_InstanceId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__FROM_DATE = eINSTANCE.getJobManagerLock_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__COMMENTS = eINSTANCE.getJobManagerLock_Comments();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__CREATED_BY_USER_LOGIN = eINSTANCE.getJobManagerLock_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__CREATED_DATE = eINSTANCE.getJobManagerLock_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getJobManagerLock_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__LAST_MODIFIED_DATE = eINSTANCE.getJobManagerLock_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Reason Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_MANAGER_LOCK__REASON_ENUM_ID = eINSTANCE.getJobManagerLock_ReasonEnumId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_MANAGER_LOCK__THRU_DATE = eINSTANCE.getJobManagerLock_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl <em>Job Sandbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.JobSandboxImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getJobSandbox()
		 * @generated
		 */
		EClass JOB_SANDBOX = eINSTANCE.getJobSandbox();

		/**
		 * The meta object literal for the '<em><b>Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__JOB_ID = eINSTANCE.getJobSandbox_JobId();

		/**
		 * The meta object literal for the '<em><b>Auth User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__AUTH_USER_LOGIN_ID = eINSTANCE.getJobSandbox_AuthUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Cancel Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__CANCEL_DATE_TIME = eINSTANCE.getJobSandbox_CancelDateTime();

		/**
		 * The meta object literal for the '<em><b>Current Recurrence Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__CURRENT_RECURRENCE_COUNT = eINSTANCE.getJobSandbox_CurrentRecurrenceCount();

		/**
		 * The meta object literal for the '<em><b>Current Retry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__CURRENT_RETRY_COUNT = eINSTANCE.getJobSandbox_CurrentRetryCount();

		/**
		 * The meta object literal for the '<em><b>Finish Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__FINISH_DATE_TIME = eINSTANCE.getJobSandbox_FinishDateTime();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__JOB_NAME = eINSTANCE.getJobSandbox_JobName();

		/**
		 * The meta object literal for the '<em><b>Job Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__JOB_RESULT = eINSTANCE.getJobSandbox_JobResult();

		/**
		 * The meta object literal for the '<em><b>Loader Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__LOADER_NAME = eINSTANCE.getJobSandbox_LoaderName();

		/**
		 * The meta object literal for the '<em><b>Max Recurrence Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__MAX_RECURRENCE_COUNT = eINSTANCE.getJobSandbox_MaxRecurrenceCount();

		/**
		 * The meta object literal for the '<em><b>Max Retry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__MAX_RETRY = eINSTANCE.getJobSandbox_MaxRetry();

		/**
		 * The meta object literal for the '<em><b>Parent Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__PARENT_JOB_ID = eINSTANCE.getJobSandbox_ParentJobId();

		/**
		 * The meta object literal for the '<em><b>Pool Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__POOL_ID = eINSTANCE.getJobSandbox_PoolId();

		/**
		 * The meta object literal for the '<em><b>Previous Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__PREVIOUS_JOB_ID = eINSTANCE.getJobSandbox_PreviousJobId();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__RECURRENCE_INFO_ID = eINSTANCE.getJobSandbox_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Run As User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__RUN_AS_USER = eINSTANCE.getJobSandbox_RunAsUser();

		/**
		 * The meta object literal for the '<em><b>Run By Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__RUN_BY_INSTANCE_ID = eINSTANCE.getJobSandbox_RunByInstanceId();

		/**
		 * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__RUN_TIME = eINSTANCE.getJobSandbox_RunTime();

		/**
		 * The meta object literal for the '<em><b>Runtime Data Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__RUNTIME_DATA_ID = eINSTANCE.getJobSandbox_RuntimeDataId();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__SERVICE_NAME = eINSTANCE.getJobSandbox_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SANDBOX__START_DATE_TIME = eINSTANCE.getJobSandbox_StartDateTime();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__STATUS_ID = eINSTANCE.getJobSandbox_StatusId();

		/**
		 * The meta object literal for the '<em><b>Temp Expr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SANDBOX__TEMP_EXPR_ID = eINSTANCE.getJobSandbox_TempExprId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl <em>Recurrence Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRecurrenceInfo()
		 * @generated
		 */
		EClass RECURRENCE_INFO = eINSTANCE.getRecurrenceInfo();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_INFO__RECURRENCE_INFO_ID = eINSTANCE.getRecurrenceInfo_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Exception Date Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_INFO__EXCEPTION_DATE_TIMES = eINSTANCE.getRecurrenceInfo_ExceptionDateTimes();

		/**
		 * The meta object literal for the '<em><b>Exception Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRENCE_INFO__EXCEPTION_RULE_ID = eINSTANCE.getRecurrenceInfo_ExceptionRuleId();

		/**
		 * The meta object literal for the '<em><b>Recurrence Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_INFO__RECURRENCE_COUNT = eINSTANCE.getRecurrenceInfo_RecurrenceCount();

		/**
		 * The meta object literal for the '<em><b>Recurrence Date Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_INFO__RECURRENCE_DATE_TIMES = eINSTANCE.getRecurrenceInfo_RecurrenceDateTimes();

		/**
		 * The meta object literal for the '<em><b>Recurrence Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRENCE_INFO__RECURRENCE_RULE_ID = eINSTANCE.getRecurrenceInfo_RecurrenceRuleId();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_INFO__START_DATE_TIME = eINSTANCE.getRecurrenceInfo_StartDateTime();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl <em>Recurrence Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRecurrenceRule()
		 * @generated
		 */
		EClass RECURRENCE_RULE = eINSTANCE.getRecurrenceRule();

		/**
		 * The meta object literal for the '<em><b>Recurrence Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__RECURRENCE_RULE_ID = eINSTANCE.getRecurrenceRule_RecurrenceRuleId();

		/**
		 * The meta object literal for the '<em><b>By Day List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_DAY_LIST = eINSTANCE.getRecurrenceRule_ByDayList();

		/**
		 * The meta object literal for the '<em><b>By Hour List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_HOUR_LIST = eINSTANCE.getRecurrenceRule_ByHourList();

		/**
		 * The meta object literal for the '<em><b>By Minute List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_MINUTE_LIST = eINSTANCE.getRecurrenceRule_ByMinuteList();

		/**
		 * The meta object literal for the '<em><b>By Month Day List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_MONTH_DAY_LIST = eINSTANCE.getRecurrenceRule_ByMonthDayList();

		/**
		 * The meta object literal for the '<em><b>By Month List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_MONTH_LIST = eINSTANCE.getRecurrenceRule_ByMonthList();

		/**
		 * The meta object literal for the '<em><b>By Second List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_SECOND_LIST = eINSTANCE.getRecurrenceRule_BySecondList();

		/**
		 * The meta object literal for the '<em><b>By Set Pos List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_SET_POS_LIST = eINSTANCE.getRecurrenceRule_BySetPosList();

		/**
		 * The meta object literal for the '<em><b>By Week No List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_WEEK_NO_LIST = eINSTANCE.getRecurrenceRule_ByWeekNoList();

		/**
		 * The meta object literal for the '<em><b>By Year Day List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__BY_YEAR_DAY_LIST = eINSTANCE.getRecurrenceRule_ByYearDayList();

		/**
		 * The meta object literal for the '<em><b>Count Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__COUNT_NUMBER = eINSTANCE.getRecurrenceRule_CountNumber();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__FREQUENCY = eINSTANCE.getRecurrenceRule_Frequency();

		/**
		 * The meta object literal for the '<em><b>Interval Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__INTERVAL_NUMBER = eINSTANCE.getRecurrenceRule_IntervalNumber();

		/**
		 * The meta object literal for the '<em><b>Until Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__UNTIL_DATE_TIME = eINSTANCE.getRecurrenceRule_UntilDateTime();

		/**
		 * The meta object literal for the '<em><b>Week Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__WEEK_START = eINSTANCE.getRecurrenceRule_WeekStart();

		/**
		 * The meta object literal for the '<em><b>XName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_RULE__XNAME = eINSTANCE.getRecurrenceRule_XName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl <em>Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getRuntimeData()
		 * @generated
		 */
		EClass RUNTIME_DATA = eINSTANCE.getRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Runtime Data Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_DATA__RUNTIME_DATA_ID = eINSTANCE.getRuntimeData_RuntimeDataId();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_DATA__RUNTIME_INFO = eINSTANCE.getRuntimeData_RuntimeInfo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getTemporalExpression()
		 * @generated
		 */
		EClass TEMPORAL_EXPRESSION = eINSTANCE.getTemporalExpression();

		/**
		 * The meta object literal for the '<em><b>Temp Expr Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__TEMP_EXPR_ID = eINSTANCE.getTemporalExpression_TempExprId();

		/**
		 * The meta object literal for the '<em><b>Date1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__DATE1 = eINSTANCE.getTemporalExpression_Date1();

		/**
		 * The meta object literal for the '<em><b>Date2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__DATE2 = eINSTANCE.getTemporalExpression_Date2();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__DESCRIPTION = eINSTANCE.getTemporalExpression_Description();

		/**
		 * The meta object literal for the '<em><b>From Temporal Expression Assocs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS = eINSTANCE.getTemporalExpression_FromTemporalExpressionAssocs();

		/**
		 * The meta object literal for the '<em><b>Integer1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__INTEGER1 = eINSTANCE.getTemporalExpression_Integer1();

		/**
		 * The meta object literal for the '<em><b>Integer2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__INTEGER2 = eINSTANCE.getTemporalExpression_Integer2();

		/**
		 * The meta object literal for the '<em><b>String1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__STRING1 = eINSTANCE.getTemporalExpression_String1();

		/**
		 * The meta object literal for the '<em><b>String2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__STRING2 = eINSTANCE.getTemporalExpression_String2();

		/**
		 * The meta object literal for the '<em><b>Temp Expr Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID = eINSTANCE.getTemporalExpression_TempExprTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl <em>Temporal Expression Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl
		 * @see org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl#getTemporalExpressionAssoc()
		 * @generated
		 */
		EClass TEMPORAL_EXPRESSION_ASSOC = eINSTANCE.getTemporalExpressionAssoc();

		/**
		 * The meta object literal for the '<em><b>From Temp Expr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID = eINSTANCE.getTemporalExpressionAssoc_FromTempExprId();

		/**
		 * The meta object literal for the '<em><b>To Temp Expr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID = eINSTANCE.getTemporalExpressionAssoc_ToTempExprId();

		/**
		 * The meta object literal for the '<em><b>Expr Assoc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE = eINSTANCE.getTemporalExpressionAssoc_ExprAssocType();

	}

} //SchedulePackage
