/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

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
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortFactory
 * @model kind="package"
 * @generated
 */
public interface WorkeffortPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workeffort";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/workeffort/workeffort";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-workeffort";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkeffortPackage eINSTANCE = org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.ApplicationSandboxImpl <em>Application Sandbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.ApplicationSandboxImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getApplicationSandbox()
	 * @generated
	 */
	int APPLICATION_SANDBOX = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__APPLICATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Runtime Data Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__RUNTIME_DATA_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Application Sandbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SANDBOX_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl <em>Communication Event Work Eff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getCommunicationEventWorkEff()
	 * @generated
	 */
	int COMMUNICATION_EVENT_WORK_EFF = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Event Work Eff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_WORK_EFF_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Deliverable Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DELIVERABLE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deliverable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DELIVERABLE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deliverable Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DELIVERABLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl <em>Deliverable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getDeliverableType()
	 * @generated
	 */
	int DELIVERABLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Deliverable Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deliverable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl <em>Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffort()
	 * @generated
	 */
	int WORK_EFFORT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accommodation Map Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACCOMMODATION_MAP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accommodation Spot Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACCOMMODATION_SPOT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACTUAL_COMPLETION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actual Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACTUAL_MILLI_SECONDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACTUAL_SETUP_MILLIS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ACTUAL_START_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Communication Event Work Effs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Current Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__CURRENT_STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Estimate Calc Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ESTIMATE_CALC_METHOD = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Estimated Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ESTIMATED_COMPLETION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Estimated Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ESTIMATED_MILLI_SECONDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Estimated Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ESTIMATED_SETUP_MILLIS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__ESTIMATED_START_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__INFO_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Last Status Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LAST_STATUS_UPDATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Location Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__LOCATION_DESC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Money Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__MONEY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__NOTE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__PERCENT_COMPLETE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__PRIORITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Quantity Produced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__QUANTITY_PRODUCED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__QUANTITY_REJECTED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Quantity To Produce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__QUANTITY_TO_PRODUCE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__RESERV2ND_PP_PERC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__RESERV_NTH_PP_PERC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__RESERV_PERSONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__REVISION_NUMBER = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Runtime Data Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__RUNTIME_DATA_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Scope Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SCOPE_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Send Notification Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SEND_NOTIFICATION_EMAIL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Service Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SERVICE_LOADER_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Show As Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SHOW_AS_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SOURCE_REFERENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Special Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__SPECIAL_TERMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__TEMP_EXPR_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Time Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__TIME_TRANSPARENCY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Total Milli Seconds Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Total Money Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__TOTAL_MONEY_ALLOWED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Universal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__UNIVERSAL_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Work Effort Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Work Effort Deliverable Prods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Work Effort Event Reminders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Work Effort Fixed Asset Stds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Work Effort Inventory Assigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Work Effort Inventory Produceds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Work Effort Keywords</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_KEYWORDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Work Effort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Work Effort Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_NOTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Work Effort Parent Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_PARENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Work Effort Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Work Effort Skill Standards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Work Effort Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT__WORK_EFFORT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 60;

	/**
	 * The number of structural features of the '<em>Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 61;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl <em>Work Effort Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssoc()
	 * @generated
	 */
	int WORK_EFFORT_ASSOC = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Effort Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Effort Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl <em>Work Effort Assoc Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocAttribute()
	 * @generated
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Effort Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Effort Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Work Effort Assoc Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl <em>Work Effort Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocType()
	 * @generated
	 */
	int WORK_EFFORT_ASSOC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Effort Assoc Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeAttrImpl <em>Work Effort Assoc Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeAttrImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocTypeAttr()
	 * @generated
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__WORK_EFFORT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Assoc Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ASSOC_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAttributeImpl <em>Work Effort Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAttributeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAttribute()
	 * @generated
	 */
	int WORK_EFFORT_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Effort Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortBillingImpl <em>Work Effort Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortBillingImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortBilling()
	 * @generated
	 */
	int WORK_EFFORT_BILLING = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING__PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Effort Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_BILLING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContactMechImpl <em>Work Effort Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContactMechImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContactMech()
	 * @generated
	 */
	int WORK_EFFORT_CONTACT_MECH = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentImpl <em>Work Effort Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContent()
	 * @generated
	 */
	int WORK_EFFORT_CONTENT = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Effort Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__WORK_EFFORT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentTypeImpl <em>Work Effort Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContentType()
	 * @generated
	 */
	int WORK_EFFORT_CONTENT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__WORK_EFFORT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl <em>Work Effort Cost Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortCostCalc()
	 * @generated
	 */
	int WORK_EFFORT_COST_CALC = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Component Calc Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Cost Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_COST_CALC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortDeliverableProdImpl <em>Work Effort Deliverable Prod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortDeliverableProdImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortDeliverableProd()
	 * @generated
	 */
	int WORK_EFFORT_DELIVERABLE_PROD = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deliverable Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD__DELIVERABLE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Effort Deliverable Prod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_DELIVERABLE_PROD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl <em>Work Effort Event Reminder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortEventReminder()
	 * @generated
	 */
	int WORK_EFFORT_EVENT_REMINDER = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Locale Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__LOCALE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reminder Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reminder Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Repeat Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Time Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Work Effort Event Reminder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_EVENT_REMINDER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl <em>Work Effort Fixed Asset Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Availability Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Work Effort Fixed Asset Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_ASSIGN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl <em>Work Effort Fixed Asset Std</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortFixedAssetStd()
	 * @generated
	 */
	int WORK_EFFORT_FIXED_ASSET_STD = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estimated Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Fixed Asset Std</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_FIXED_ASSET_STD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl <em>Work Effort Good Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortGoodStandard()
	 * @generated
	 */
	int WORK_EFFORT_GOOD_STANDARD = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Good Std Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Work Effort Good Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardTypeImpl <em>Work Effort Good Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortGoodStandardType()
	 * @generated
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Good Std Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__WORK_EFFORT_GOOD_STD_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Effort Good Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_GOOD_STANDARD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortIcalDataImpl <em>Work Effort Ical Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortIcalDataImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortIcalData()
	 * @generated
	 */
	int WORK_EFFORT_ICAL_DATA = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ical Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA__ICAL_DATA = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Effort Ical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_ICAL_DATA_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryAssignImpl <em>Work Effort Inventory Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryAssignImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortInventoryAssign()
	 * @generated
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Effort Inventory Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_ASSIGN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl <em>Work Effort Inventory Produced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortInventoryProduced()
	 * @generated
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Effort Inventory Produced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_INVENTORY_PRODUCED_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortKeywordImpl <em>Work Effort Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortKeywordImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortKeyword()
	 * @generated
	 */
	int WORK_EFFORT_KEYWORD = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__KEYWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relevancy Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD__RELEVANCY_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_KEYWORD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortNoteImpl <em>Work Effort Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortNoteImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortNote()
	 * @generated
	 */
	int WORK_EFFORT_NOTE = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE__INTERNAL_NOTE = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Effort Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl <em>Work Effort Party Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortPartyAssignment()
	 * @generated
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT = 26;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigned By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Availability Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delegate Reason Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expectation Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Must Rsvp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Work Effort Party Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PARTY_ASSIGNMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPurposeTypeImpl <em>Work Effort Purpose Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPurposeTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortPurposeType()
	 * @generated
	 */
	int WORK_EFFORT_PURPOSE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__WORK_EFFORT_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Purpose Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_PURPOSE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl <em>Work Effort Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortReview()
	 * @generated
	 */
	int WORK_EFFORT_REVIEW = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__REVIEW_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Posted Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__POSTED_ANONYMOUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__RATING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Review Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__REVIEW_TEXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Work Effort Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_REVIEW_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl <em>Work Effort Search Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSearchConstraint()
	 * @generated
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Search Result Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Include Sub Work Efforts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is And</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remove Stems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Work Effort Search Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_CONSTRAINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl <em>Work Effort Search Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSearchResult()
	 * @generated
	 */
	int WORK_EFFORT_SEARCH_RESULT = 30;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Search Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Search Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Seconds Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Work Effort Search Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Work Effort Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SEARCH_RESULT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl <em>Work Effort Skill Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSkillStandard()
	 * @generated
	 */
	int WORK_EFFORT_SKILL_STANDARD = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skill Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estimated Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Num People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Skill Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SKILL_STANDARD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl <em>Work Effort Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortStatus()
	 * @generated
	 */
	int WORK_EFFORT_STATUS = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__STATUS_DATETIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__REASON = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Set By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS__SET_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSurveyApplImpl <em>Work Effort Survey Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSurveyApplImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSurveyAppl()
	 * @generated
	 */
	int WORK_EFFORT_SURVEY_APPL = 33;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Survey Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__SURVEY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Effort Survey Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_SURVEY_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl <em>Work Effort Trans Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortTransBox()
	 * @generated
	 */
	int WORK_EFFORT_TRANS_BOX = 34;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Process Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX__TRANSITION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Trans Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TRANS_BOX_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl <em>Work Effort Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortType()
	 * @generated
	 */
	int WORK_EFFORT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Effort Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Effort Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeAttrImpl <em>Work Effort Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeAttrImpl
	 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortTypeAttr()
	 * @generated
	 */
	int WORK_EFFORT_TYPE_ATTR = 36;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Effort Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__WORK_EFFORT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Effort Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EFFORT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox <em>Application Sandbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Sandbox</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox
	 * @generated
	 */
	EClass getApplicationSandbox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getApplicationId()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EAttribute getApplicationSandbox_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getFromDate()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EAttribute getApplicationSandbox_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getPartyId()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EAttribute getApplicationSandbox_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getRoleTypeId()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EAttribute getApplicationSandbox_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getRuntimeDataId <em>Runtime Data Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Data Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getRuntimeDataId()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EReference getApplicationSandbox_RuntimeDataId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox#getWorkEffortId()
	 * @see #getApplicationSandbox()
	 * @generated
	 */
	EAttribute getApplicationSandbox_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff <em>Communication Event Work Eff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Event Work Eff</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff
	 * @generated
	 */
	EClass getCommunicationEventWorkEff();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getWorkEffortId()
	 * @see #getCommunicationEventWorkEff()
	 * @generated
	 */
	EReference getCommunicationEventWorkEff_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getCommunicationEventId()
	 * @see #getCommunicationEventWorkEff()
	 * @generated
	 */
	EReference getCommunicationEventWorkEff_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff#getDescription()
	 * @see #getCommunicationEventWorkEff()
	 * @generated
	 */
	EAttribute getCommunicationEventWorkEff_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableId <em>Deliverable Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliverable Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableId()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_DeliverableId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableName <em>Deliverable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliverable Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableName()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_DeliverableName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableTypeId <em>Deliverable Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableTypeId()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_DeliverableTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDescription()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.DeliverableType <em>Deliverable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.DeliverableType
	 * @generated
	 */
	EClass getDeliverableType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.DeliverableType#getDeliverableTypeId <em>Deliverable Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliverable Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.DeliverableType#getDeliverableTypeId()
	 * @see #getDeliverableType()
	 * @generated
	 */
	EAttribute getDeliverableType_DeliverableTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.DeliverableType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.DeliverableType#getDescription()
	 * @see #getDeliverableType()
	 * @generated
	 */
	EAttribute getDeliverableType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort
	 * @generated
	 */
	EClass getWorkEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationMapId <em>Accommodation Map Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Map Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationMapId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_AccommodationMapId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationSpotId <em>Accommodation Spot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Spot Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationSpotId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_AccommodationSpotId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualCompletionDate <em>Actual Completion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Completion Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualCompletionDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ActualCompletionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualMilliSeconds <em>Actual Milli Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Milli Seconds</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualMilliSeconds()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ActualMilliSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualSetupMillis <em>Actual Setup Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Setup Millis</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualSetupMillis()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ActualSetupMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualStartDate <em>Actual Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Start Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualStartDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ActualStartDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCommunicationEventWorkEffs <em>Communication Event Work Effs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Work Effs</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCommunicationEventWorkEffs()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_CommunicationEventWorkEffs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedByUserLogin()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCurrentStatusId <em>Current Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCurrentStatusId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_CurrentStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getDescription()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimateCalcMethod <em>Estimate Calc Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estimate Calc Method</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimateCalcMethod()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_EstimateCalcMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate <em>Estimated Completion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Completion Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_EstimatedCompletionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Milli Seconds</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_EstimatedMilliSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Setup Millis</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_EstimatedSetupMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedStartDate <em>Estimated Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Start Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedStartDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_EstimatedStartDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFacilityId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFixedAssetId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getInfoUrl <em>Info Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Url</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getInfoUrl()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_InfoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedDate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastStatusUpdate <em>Last Status Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Status Update</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastStatusUpdate()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_LastStatusUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLocationDesc <em>Location Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Desc</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLocationDesc()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_LocationDesc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getMoneyUomId <em>Money Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Money Uom Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getMoneyUomId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_MoneyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Note Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getNoteId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPercentComplete()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_PercentComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPriority()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityProduced <em>Quantity Produced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Produced</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityProduced()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_QuantityProduced();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityRejected <em>Quantity Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Rejected</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityRejected()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_QuantityRejected();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityToProduce <em>Quantity To Produce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity To Produce</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityToProduce()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_QuantityToProduce();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRecurrenceInfoId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_RecurrenceInfoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv2nd PP Perc</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_Reserv2ndPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Nth PP Perc</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservNthPPPerc()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ReservNthPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservPersons()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRevisionNumber()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_RevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRuntimeDataId <em>Runtime Data Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Data Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRuntimeDataId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_RuntimeDataId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getScopeEnumId <em>Scope Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope Enum Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getScopeEnumId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_ScopeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#isSendNotificationEmail <em>Send Notification Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Notification Email</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#isSendNotificationEmail()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_SendNotificationEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getServiceLoaderName <em>Service Loader Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Loader Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getServiceLoaderName()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ServiceLoaderName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getShowAsEnumId <em>Show As Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show As Enum Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getShowAsEnumId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_ShowAsEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSourceReferenceId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSpecialTerms <em>Special Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Terms</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSpecialTerms()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_SpecialTerms();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTempExprId <em>Temp Expr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temp Expr Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTempExprId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_TempExprId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTimeTransparency <em>Time Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Transparency</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTimeTransparency()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_TimeTransparency();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Milli Seconds Allowed</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_TotalMilliSecondsAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed <em>Total Money Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Money Allowed</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_TotalMoneyAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getUniversalId <em>Universal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Universal Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getUniversalId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_UniversalId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortAttributes <em>Work Effort Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Attributes</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortAttributes()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortDeliverableProds <em>Work Effort Deliverable Prods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Deliverable Prods</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortDeliverableProds()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortDeliverableProds();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortEventReminders <em>Work Effort Event Reminders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Event Reminders</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortEventReminders()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortEventReminders();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortFixedAssetStds <em>Work Effort Fixed Asset Stds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Fixed Asset Stds</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortFixedAssetStds()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortFixedAssetStds();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryAssigns <em>Work Effort Inventory Assigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Inventory Assigns</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryAssigns()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortInventoryAssigns();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryProduceds <em>Work Effort Inventory Produceds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Inventory Produceds</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryProduceds()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortInventoryProduceds();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortKeywords <em>Work Effort Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Keywords</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortKeywords()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortKeywords();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortName <em>Work Effort Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortName()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EAttribute getWorkEffort_WorkEffortName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortNotes <em>Work Effort Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Notes</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortNotes()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortParentId <em>Work Effort Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Parent Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortParentId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortParentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortPurposeTypeId <em>Work Effort Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortPurposeTypeId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortPurposeTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortSkillStandards <em>Work Effort Skill Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Skill Standards</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortSkillStandards()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortSkillStandards();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortTypeId <em>Work Effort Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortTypeId()
	 * @see #getWorkEffort()
	 * @generated
	 */
	EReference getWorkEffort_WorkEffortTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc <em>Work Effort Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Assoc</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc
	 * @generated
	 */
	EClass getWorkEffortAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom <em>Work Effort Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id From</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EReference getWorkEffortAssoc_WorkEffortIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo <em>Work Effort Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id To</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EReference getWorkEffortAssoc_WorkEffortIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocTypeId()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EReference getWorkEffortAssoc_WorkEffortAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getFromDate()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EAttribute getWorkEffortAssoc_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getSequenceNum()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EAttribute getWorkEffortAssoc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getThruDate()
	 * @see #getWorkEffortAssoc()
	 * @generated
	 */
	EAttribute getWorkEffortAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute <em>Work Effort Assoc Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Assoc Attribute</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute
	 * @generated
	 */
	EClass getWorkEffortAssocAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortIdFrom <em>Work Effort Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id From</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortIdFrom()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_WorkEffortIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortIdTo <em>Work Effort Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id To</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortIdTo()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_WorkEffortIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getWorkEffortAssocTypeId()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_WorkEffortAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrName()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrDescription()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getAttrValue()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_AttrValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute#getFromDate()
	 * @see #getWorkEffortAssocAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAssocAttribute_FromDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType <em>Work Effort Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType
	 * @generated
	 */
	EClass getWorkEffortAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeId()
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	EAttribute getWorkEffortAssocType_WorkEffortAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getDescription()
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	EAttribute getWorkEffortAssocType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#isHasTable()
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	EAttribute getWorkEffortAssocType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getParentTypeId()
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	EReference getWorkEffortAssocType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeAttrs <em>Work Effort Assoc Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Assoc Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeAttrs()
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	EReference getWorkEffortAssocType_WorkEffortAssocTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr <em>Work Effort Assoc Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Assoc Type Attr</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr
	 * @generated
	 */
	EClass getWorkEffortAssocTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getWorkEffortAssocTypeId()
	 * @see #getWorkEffortAssocTypeAttr()
	 * @generated
	 */
	EReference getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getAttrName()
	 * @see #getWorkEffortAssocTypeAttr()
	 * @generated
	 */
	EAttribute getWorkEffortAssocTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr#getDescription()
	 * @see #getWorkEffortAssocTypeAttr()
	 * @generated
	 */
	EAttribute getWorkEffortAssocTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute <em>Work Effort Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Attribute</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute
	 * @generated
	 */
	EClass getWorkEffortAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getWorkEffortId()
	 * @see #getWorkEffortAttribute()
	 * @generated
	 */
	EReference getWorkEffortAttribute_WorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrName()
	 * @see #getWorkEffortAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrDescription()
	 * @see #getWorkEffortAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute#getAttrValue()
	 * @see #getWorkEffortAttribute()
	 * @generated
	 */
	EAttribute getWorkEffortAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling <em>Work Effort Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Billing</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling
	 * @generated
	 */
	EClass getWorkEffortBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getWorkEffortId()
	 * @see #getWorkEffortBilling()
	 * @generated
	 */
	EReference getWorkEffortBilling_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getInvoiceId()
	 * @see #getWorkEffortBilling()
	 * @generated
	 */
	EReference getWorkEffortBilling_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getInvoiceItemSeqId()
	 * @see #getWorkEffortBilling()
	 * @generated
	 */
	EAttribute getWorkEffortBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling#getPercentage()
	 * @see #getWorkEffortBilling()
	 * @generated
	 */
	EAttribute getWorkEffortBilling_Percentage();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech <em>Work Effort Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech
	 * @generated
	 */
	EClass getWorkEffortContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getWorkEffortId()
	 * @see #getWorkEffortContactMech()
	 * @generated
	 */
	EReference getWorkEffortContactMech_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getContactMechId()
	 * @see #getWorkEffortContactMech()
	 * @generated
	 */
	EReference getWorkEffortContactMech_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getFromDate()
	 * @see #getWorkEffortContactMech()
	 * @generated
	 */
	EAttribute getWorkEffortContactMech_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getComments()
	 * @see #getWorkEffortContactMech()
	 * @generated
	 */
	EAttribute getWorkEffortContactMech_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getThruDate()
	 * @see #getWorkEffortContactMech()
	 * @generated
	 */
	EAttribute getWorkEffortContactMech_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent <em>Work Effort Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Content</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent
	 * @generated
	 */
	EClass getWorkEffortContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getWorkEffortId()
	 * @see #getWorkEffortContent()
	 * @generated
	 */
	EReference getWorkEffortContent_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getContentId()
	 * @see #getWorkEffortContent()
	 * @generated
	 */
	EReference getWorkEffortContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getWorkEffortContentTypeId <em>Work Effort Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getWorkEffortContentTypeId()
	 * @see #getWorkEffortContent()
	 * @generated
	 */
	EReference getWorkEffortContent_WorkEffortContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getFromDate()
	 * @see #getWorkEffortContent()
	 * @generated
	 */
	EAttribute getWorkEffortContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent#getThruDate()
	 * @see #getWorkEffortContent()
	 * @generated
	 */
	EAttribute getWorkEffortContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType <em>Work Effort Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Content Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType
	 * @generated
	 */
	EClass getWorkEffortContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getWorkEffortContentTypeId <em>Work Effort Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getWorkEffortContentTypeId()
	 * @see #getWorkEffortContentType()
	 * @generated
	 */
	EAttribute getWorkEffortContentType_WorkEffortContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getDescription()
	 * @see #getWorkEffortContentType()
	 * @generated
	 */
	EAttribute getWorkEffortContentType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getParentTypeId()
	 * @see #getWorkEffortContentType()
	 * @generated
	 */
	EReference getWorkEffortContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc <em>Work Effort Cost Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Cost Calc</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc
	 * @generated
	 */
	EClass getWorkEffortCostCalc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getWorkEffortId()
	 * @see #getWorkEffortCostCalc()
	 * @generated
	 */
	EReference getWorkEffortCostCalc_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getCostComponentTypeId()
	 * @see #getWorkEffortCostCalc()
	 * @generated
	 */
	EReference getWorkEffortCostCalc_CostComponentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getFromDate()
	 * @see #getWorkEffortCostCalc()
	 * @generated
	 */
	EAttribute getWorkEffortCostCalc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Calc Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getCostComponentCalcId()
	 * @see #getWorkEffortCostCalc()
	 * @generated
	 */
	EReference getWorkEffortCostCalc_CostComponentCalcId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc#getThruDate()
	 * @see #getWorkEffortCostCalc()
	 * @generated
	 */
	EAttribute getWorkEffortCostCalc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd <em>Work Effort Deliverable Prod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Deliverable Prod</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd
	 * @generated
	 */
	EClass getWorkEffortDeliverableProd();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd#getWorkEffortId()
	 * @see #getWorkEffortDeliverableProd()
	 * @generated
	 */
	EReference getWorkEffortDeliverableProd_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd#getDeliverableId <em>Deliverable Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd#getDeliverableId()
	 * @see #getWorkEffortDeliverableProd()
	 * @generated
	 */
	EReference getWorkEffortDeliverableProd_DeliverableId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder <em>Work Effort Event Reminder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Event Reminder</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder
	 * @generated
	 */
	EClass getWorkEffortEventReminder();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getWorkEffortId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EReference getWorkEffortEventReminder_WorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getSequenceId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_SequenceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getContactMechId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EReference getWorkEffortEventReminder_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getCurrentCount <em>Current Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Count</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getCurrentCount()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_CurrentCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getLocaleId <em>Locale Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getLocaleId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_LocaleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getPartyId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EReference getWorkEffortEventReminder_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getReminderDateTime <em>Reminder Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Date Time</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getReminderDateTime()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_ReminderDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getReminderOffset <em>Reminder Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Offset</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getReminderOffset()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_ReminderOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getRepeatCount()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getRepeatInterval <em>Repeat Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Interval</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getRepeatInterval()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_RepeatInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getTimeZoneId <em>Time Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder#getTimeZoneId()
	 * @see #getWorkEffortEventReminder()
	 * @generated
	 */
	EAttribute getWorkEffortEventReminder_TimeZoneId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign <em>Work Effort Fixed Asset Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Fixed Asset Assign</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign
	 * @generated
	 */
	EClass getWorkEffortFixedAssetAssign();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getWorkEffortId()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetAssign_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getFixedAssetId()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetAssign_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getFromDate()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetAssign_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getAllocatedCost <em>Allocated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocated Cost</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getAllocatedCost()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetAssign_AllocatedCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getAvailabilityStatusId <em>Availability Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Availability Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getAvailabilityStatusId()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetAssign_AvailabilityStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getComments()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetAssign_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getStatusId()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetAssign_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign#getThruDate()
	 * @see #getWorkEffortFixedAssetAssign()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetAssign_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd <em>Work Effort Fixed Asset Std</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Fixed Asset Std</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd
	 * @generated
	 */
	EClass getWorkEffortFixedAssetStd();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getWorkEffortId()
	 * @see #getWorkEffortFixedAssetStd()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetStd_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getFixedAssetTypeId()
	 * @see #getWorkEffortFixedAssetStd()
	 * @generated
	 */
	EReference getWorkEffortFixedAssetStd_FixedAssetTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedCost()
	 * @see #getWorkEffortFixedAssetStd()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetStd_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedDuration <em>Estimated Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Duration</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedDuration()
	 * @see #getWorkEffortFixedAssetStd()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetStd_EstimatedDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedQuantity <em>Estimated Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Quantity</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedQuantity()
	 * @see #getWorkEffortFixedAssetStd()
	 * @generated
	 */
	EAttribute getWorkEffortFixedAssetStd_EstimatedQuantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard <em>Work Effort Good Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Good Standard</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard
	 * @generated
	 */
	EClass getWorkEffortGoodStandard();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getWorkEffortId()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EReference getWorkEffortGoodStandard_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getProductId()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EReference getWorkEffortGoodStandard_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getWorkEffortGoodStdTypeId <em>Work Effort Good Std Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Good Std Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getWorkEffortGoodStdTypeId()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EReference getWorkEffortGoodStandard_WorkEffortGoodStdTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getFromDate()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandard_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getEstimatedCost()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandard_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getEstimatedQuantity <em>Estimated Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Quantity</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getEstimatedQuantity()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandard_EstimatedQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getStatusId()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EReference getWorkEffortGoodStandard_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard#getThruDate()
	 * @see #getWorkEffortGoodStandard()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandard_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType <em>Work Effort Good Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Good Standard Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType
	 * @generated
	 */
	EClass getWorkEffortGoodStandardType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getWorkEffortGoodStdTypeId <em>Work Effort Good Std Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Good Std Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getWorkEffortGoodStdTypeId()
	 * @see #getWorkEffortGoodStandardType()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getDescription()
	 * @see #getWorkEffortGoodStandardType()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandardType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#isHasTable()
	 * @see #getWorkEffortGoodStandardType()
	 * @generated
	 */
	EAttribute getWorkEffortGoodStandardType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType#getParentTypeId()
	 * @see #getWorkEffortGoodStandardType()
	 * @generated
	 */
	EReference getWorkEffortGoodStandardType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData <em>Work Effort Ical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Ical Data</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData
	 * @generated
	 */
	EClass getWorkEffortIcalData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData#getWorkEffortId()
	 * @see #getWorkEffortIcalData()
	 * @generated
	 */
	EAttribute getWorkEffortIcalData_WorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData#getIcalData <em>Ical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ical Data</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData#getIcalData()
	 * @see #getWorkEffortIcalData()
	 * @generated
	 */
	EAttribute getWorkEffortIcalData_IcalData();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign <em>Work Effort Inventory Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Inventory Assign</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign
	 * @generated
	 */
	EClass getWorkEffortInventoryAssign();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getWorkEffortId()
	 * @see #getWorkEffortInventoryAssign()
	 * @generated
	 */
	EReference getWorkEffortInventoryAssign_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getInventoryItemId()
	 * @see #getWorkEffortInventoryAssign()
	 * @generated
	 */
	EReference getWorkEffortInventoryAssign_InventoryItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getQuantity()
	 * @see #getWorkEffortInventoryAssign()
	 * @generated
	 */
	EAttribute getWorkEffortInventoryAssign_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign#getStatusId()
	 * @see #getWorkEffortInventoryAssign()
	 * @generated
	 */
	EReference getWorkEffortInventoryAssign_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced <em>Work Effort Inventory Produced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Inventory Produced</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced
	 * @generated
	 */
	EClass getWorkEffortInventoryProduced();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced#getWorkEffortId()
	 * @see #getWorkEffortInventoryProduced()
	 * @generated
	 */
	EReference getWorkEffortInventoryProduced_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced#getInventoryItemId()
	 * @see #getWorkEffortInventoryProduced()
	 * @generated
	 */
	EReference getWorkEffortInventoryProduced_InventoryItemId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword <em>Work Effort Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Keyword</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword
	 * @generated
	 */
	EClass getWorkEffortKeyword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getWorkEffortId()
	 * @see #getWorkEffortKeyword()
	 * @generated
	 */
	EReference getWorkEffortKeyword_WorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getKeyword()
	 * @see #getWorkEffortKeyword()
	 * @generated
	 */
	EAttribute getWorkEffortKeyword_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getRelevancyWeight <em>Relevancy Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevancy Weight</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword#getRelevancyWeight()
	 * @see #getWorkEffortKeyword()
	 * @generated
	 */
	EAttribute getWorkEffortKeyword_RelevancyWeight();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote <em>Work Effort Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Note</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote
	 * @generated
	 */
	EClass getWorkEffortNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote#getWorkEffortId()
	 * @see #getWorkEffortNote()
	 * @generated
	 */
	EReference getWorkEffortNote_WorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote#isInternalNote <em>Internal Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Note</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote#isInternalNote()
	 * @see #getWorkEffortNote()
	 * @generated
	 */
	EAttribute getWorkEffortNote_InternalNote();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment <em>Work Effort Party Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Party Assignment</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment
	 * @generated
	 */
	EClass getWorkEffortPartyAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getWorkEffortId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getPartyId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getRoleTypeId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getFromDate()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EAttribute getWorkEffortPartyAssignment_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getAssignedByUserLoginId <em>Assigned By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getAssignedByUserLoginId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_AssignedByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getAvailabilityStatusId <em>Availability Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Availability Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getAvailabilityStatusId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_AvailabilityStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getComments()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EAttribute getWorkEffortPartyAssignment_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getDelegateReasonEnumId <em>Delegate Reason Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate Reason Enum Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getDelegateReasonEnumId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_DelegateReasonEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getExpectationEnumId <em>Expectation Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expectation Enum Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getExpectationEnumId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_ExpectationEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getFacilityId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#isMustRsvp <em>Must Rsvp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Rsvp</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#isMustRsvp()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EAttribute getWorkEffortPartyAssignment_MustRsvp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getStatusDateTime <em>Status Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date Time</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getStatusDateTime()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EAttribute getWorkEffortPartyAssignment_StatusDateTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getStatusId()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EReference getWorkEffortPartyAssignment_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment#getThruDate()
	 * @see #getWorkEffortPartyAssignment()
	 * @generated
	 */
	EAttribute getWorkEffortPartyAssignment_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType <em>Work Effort Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType
	 * @generated
	 */
	EClass getWorkEffortPurposeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getWorkEffortPurposeTypeId <em>Work Effort Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getWorkEffortPurposeTypeId()
	 * @see #getWorkEffortPurposeType()
	 * @generated
	 */
	EAttribute getWorkEffortPurposeType_WorkEffortPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getDescription()
	 * @see #getWorkEffortPurposeType()
	 * @generated
	 */
	EAttribute getWorkEffortPurposeType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType#getParentTypeId()
	 * @see #getWorkEffortPurposeType()
	 * @generated
	 */
	EReference getWorkEffortPurposeType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview <em>Work Effort Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Review</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview
	 * @generated
	 */
	EClass getWorkEffortReview();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getWorkEffortId()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EReference getWorkEffortReview_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getUserLoginId()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EReference getWorkEffortReview_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getReviewDate()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EAttribute getWorkEffortReview_ReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#isPostedAnonymous <em>Posted Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Anonymous</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#isPostedAnonymous()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EAttribute getWorkEffortReview_PostedAnonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getRating()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EAttribute getWorkEffortReview_Rating();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getReviewText <em>Review Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Text</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getReviewText()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EAttribute getWorkEffortReview_ReviewText();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview#getStatusId()
	 * @see #getWorkEffortReview()
	 * @generated
	 */
	EReference getWorkEffortReview_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint <em>Work Effort Search Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Search Constraint</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint
	 * @generated
	 */
	EClass getWorkEffortSearchConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getWorkEffortSearchResultId <em>Work Effort Search Result Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Search Result Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getWorkEffortSearchResultId()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EReference getWorkEffortSearchConstraint_WorkEffortSearchResultId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Seq Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getConstraintSeqId()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_ConstraintSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getAnyPrefix <em>Any Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Prefix</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getAnyPrefix()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_AnyPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getAnySuffix <em>Any Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Suffix</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getAnySuffix()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_AnySuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getConstraintName()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getHighValue <em>High Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Value</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getHighValue()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_HighValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isIncludeSubWorkEfforts <em>Include Sub Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Sub Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isIncludeSubWorkEfforts()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_IncludeSubWorkEfforts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getInfoString <em>Info String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info String</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getInfoString()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_InfoString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isIsAnd <em>Is And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is And</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isIsAnd()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_IsAnd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getLowValue <em>Low Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Value</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#getLowValue()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_LowValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isRemoveStems <em>Remove Stems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Stems</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint#isRemoveStems()
	 * @see #getWorkEffortSearchConstraint()
	 * @generated
	 */
	EAttribute getWorkEffortSearchConstraint_RemoveStems();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult <em>Work Effort Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Search Result</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult
	 * @generated
	 */
	EClass getWorkEffortSearchResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getWorkEffortSearchResultId <em>Work Effort Search Result Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Search Result Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getWorkEffortSearchResultId()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_WorkEffortSearchResultId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#isIsAscending <em>Is Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ascending</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#isIsAscending()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_IsAscending();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getNumResults <em>Num Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Results</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getNumResults()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_NumResults();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getOrderByName <em>Order By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getOrderByName()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_OrderByName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getSearchDate <em>Search Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getSearchDate()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_SearchDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getSecondsTotal <em>Seconds Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Total</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getSecondsTotal()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_SecondsTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getVisitId()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EAttribute getWorkEffortSearchResult_VisitId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getWorkEffortSearchConstraints <em>Work Effort Search Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Search Constraints</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult#getWorkEffortSearchConstraints()
	 * @see #getWorkEffortSearchResult()
	 * @generated
	 */
	EReference getWorkEffortSearchResult_WorkEffortSearchConstraints();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard <em>Work Effort Skill Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Skill Standard</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard
	 * @generated
	 */
	EClass getWorkEffortSkillStandard();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getWorkEffortId()
	 * @see #getWorkEffortSkillStandard()
	 * @generated
	 */
	EReference getWorkEffortSkillStandard_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getSkillTypeId <em>Skill Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getSkillTypeId()
	 * @see #getWorkEffortSkillStandard()
	 * @generated
	 */
	EReference getWorkEffortSkillStandard_SkillTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedCost()
	 * @see #getWorkEffortSkillStandard()
	 * @generated
	 */
	EAttribute getWorkEffortSkillStandard_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedDuration <em>Estimated Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Duration</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedDuration()
	 * @see #getWorkEffortSkillStandard()
	 * @generated
	 */
	EAttribute getWorkEffortSkillStandard_EstimatedDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedNumPeople <em>Estimated Num People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Num People</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard#getEstimatedNumPeople()
	 * @see #getWorkEffortSkillStandard()
	 * @generated
	 */
	EAttribute getWorkEffortSkillStandard_EstimatedNumPeople();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus <em>Work Effort Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Status</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus
	 * @generated
	 */
	EClass getWorkEffortStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getWorkEffortId()
	 * @see #getWorkEffortStatus()
	 * @generated
	 */
	EReference getWorkEffortStatus_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getStatusId()
	 * @see #getWorkEffortStatus()
	 * @generated
	 */
	EReference getWorkEffortStatus_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getStatusDatetime <em>Status Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Datetime</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getStatusDatetime()
	 * @see #getWorkEffortStatus()
	 * @generated
	 */
	EAttribute getWorkEffortStatus_StatusDatetime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getReason()
	 * @see #getWorkEffortStatus()
	 * @generated
	 */
	EAttribute getWorkEffortStatus_Reason();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getSetByUserLogin <em>Set By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set By User Login</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus#getSetByUserLogin()
	 * @see #getWorkEffortStatus()
	 * @generated
	 */
	EReference getWorkEffortStatus_SetByUserLogin();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl <em>Work Effort Survey Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Survey Appl</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl
	 * @generated
	 */
	EClass getWorkEffortSurveyAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getWorkEffortId()
	 * @see #getWorkEffortSurveyAppl()
	 * @generated
	 */
	EReference getWorkEffortSurveyAppl_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getSurveyId <em>Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getSurveyId()
	 * @see #getWorkEffortSurveyAppl()
	 * @generated
	 */
	EReference getWorkEffortSurveyAppl_SurveyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getFromDate()
	 * @see #getWorkEffortSurveyAppl()
	 * @generated
	 */
	EAttribute getWorkEffortSurveyAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl#getThruDate()
	 * @see #getWorkEffortSurveyAppl()
	 * @generated
	 */
	EAttribute getWorkEffortSurveyAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox <em>Work Effort Trans Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Trans Box</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox
	 * @generated
	 */
	EClass getWorkEffortTransBox();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getProcessWorkEffortId <em>Process Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getProcessWorkEffortId()
	 * @see #getWorkEffortTransBox()
	 * @generated
	 */
	EReference getWorkEffortTransBox_ProcessWorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getToActivityId <em>To Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Activity Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getToActivityId()
	 * @see #getWorkEffortTransBox()
	 * @generated
	 */
	EAttribute getWorkEffortTransBox_ToActivityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getTransitionId <em>Transition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox#getTransitionId()
	 * @see #getWorkEffortTransBox()
	 * @generated
	 */
	EAttribute getWorkEffortTransBox_TransitionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType <em>Work Effort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Type</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType
	 * @generated
	 */
	EClass getWorkEffortType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeId <em>Work Effort Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeId()
	 * @see #getWorkEffortType()
	 * @generated
	 */
	EAttribute getWorkEffortType_WorkEffortTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getDescription()
	 * @see #getWorkEffortType()
	 * @generated
	 */
	EAttribute getWorkEffortType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#isHasTable()
	 * @see #getWorkEffortType()
	 * @generated
	 */
	EAttribute getWorkEffortType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getParentTypeId()
	 * @see #getWorkEffortType()
	 * @generated
	 */
	EReference getWorkEffortType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeAttrs <em>Work Effort Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Effort Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeAttrs()
	 * @see #getWorkEffortType()
	 * @generated
	 */
	EReference getWorkEffortType_WorkEffortTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr <em>Work Effort Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Type Attr</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr
	 * @generated
	 */
	EClass getWorkEffortTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getWorkEffortTypeId <em>Work Effort Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Type Id</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getWorkEffortTypeId()
	 * @see #getWorkEffortTypeAttr()
	 * @generated
	 */
	EReference getWorkEffortTypeAttr_WorkEffortTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getAttrName()
	 * @see #getWorkEffortTypeAttr()
	 * @generated
	 */
	EAttribute getWorkEffortTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr#getDescription()
	 * @see #getWorkEffortTypeAttr()
	 * @generated
	 */
	EAttribute getWorkEffortTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkeffortFactory getWorkeffortFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.ApplicationSandboxImpl <em>Application Sandbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.ApplicationSandboxImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getApplicationSandbox()
		 * @generated
		 */
		EClass APPLICATION_SANDBOX = eINSTANCE.getApplicationSandbox();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SANDBOX__APPLICATION_ID = eINSTANCE.getApplicationSandbox_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SANDBOX__FROM_DATE = eINSTANCE.getApplicationSandbox_FromDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SANDBOX__PARTY_ID = eINSTANCE.getApplicationSandbox_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SANDBOX__ROLE_TYPE_ID = eINSTANCE.getApplicationSandbox_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Runtime Data Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_SANDBOX__RUNTIME_DATA_ID = eINSTANCE.getApplicationSandbox_RuntimeDataId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SANDBOX__WORK_EFFORT_ID = eINSTANCE.getApplicationSandbox_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl <em>Communication Event Work Eff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getCommunicationEventWorkEff()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_WORK_EFF = eINSTANCE.getCommunicationEventWorkEff();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID = eINSTANCE.getCommunicationEventWorkEff_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEventWorkEff_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION = eINSTANCE.getCommunicationEventWorkEff_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();

		/**
		 * The meta object literal for the '<em><b>Deliverable Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__DELIVERABLE_ID = eINSTANCE.getDeliverable_DeliverableId();

		/**
		 * The meta object literal for the '<em><b>Deliverable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__DELIVERABLE_NAME = eINSTANCE.getDeliverable_DeliverableName();

		/**
		 * The meta object literal for the '<em><b>Deliverable Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__DELIVERABLE_TYPE_ID = eINSTANCE.getDeliverable_DeliverableTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__DESCRIPTION = eINSTANCE.getDeliverable_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl <em>Deliverable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getDeliverableType()
		 * @generated
		 */
		EClass DELIVERABLE_TYPE = eINSTANCE.getDeliverableType();

		/**
		 * The meta object literal for the '<em><b>Deliverable Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID = eINSTANCE.getDeliverableType_DeliverableTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE_TYPE__DESCRIPTION = eINSTANCE.getDeliverableType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl <em>Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffort()
		 * @generated
		 */
		EClass WORK_EFFORT = eINSTANCE.getWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getWorkEffort_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Map Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__ACCOMMODATION_MAP_ID = eINSTANCE.getWorkEffort_AccommodationMapId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Spot Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__ACCOMMODATION_SPOT_ID = eINSTANCE.getWorkEffort_AccommodationSpotId();

		/**
		 * The meta object literal for the '<em><b>Actual Completion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ACTUAL_COMPLETION_DATE = eINSTANCE.getWorkEffort_ActualCompletionDate();

		/**
		 * The meta object literal for the '<em><b>Actual Milli Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ACTUAL_MILLI_SECONDS = eINSTANCE.getWorkEffort_ActualMilliSeconds();

		/**
		 * The meta object literal for the '<em><b>Actual Setup Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ACTUAL_SETUP_MILLIS = eINSTANCE.getWorkEffort_ActualSetupMillis();

		/**
		 * The meta object literal for the '<em><b>Actual Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ACTUAL_START_DATE = eINSTANCE.getWorkEffort_ActualStartDate();

		/**
		 * The meta object literal for the '<em><b>Communication Event Work Effs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS = eINSTANCE.getWorkEffort_CommunicationEventWorkEffs();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__CREATED_BY_USER_LOGIN = eINSTANCE.getWorkEffort_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__CREATED_DATE = eINSTANCE.getWorkEffort_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Current Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__CURRENT_STATUS_ID = eINSTANCE.getWorkEffort_CurrentStatusId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__DESCRIPTION = eINSTANCE.getWorkEffort_Description();

		/**
		 * The meta object literal for the '<em><b>Estimate Calc Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__ESTIMATE_CALC_METHOD = eINSTANCE.getWorkEffort_EstimateCalcMethod();

		/**
		 * The meta object literal for the '<em><b>Estimated Completion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ESTIMATED_COMPLETION_DATE = eINSTANCE.getWorkEffort_EstimatedCompletionDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Milli Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ESTIMATED_MILLI_SECONDS = eINSTANCE.getWorkEffort_EstimatedMilliSeconds();

		/**
		 * The meta object literal for the '<em><b>Estimated Setup Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ESTIMATED_SETUP_MILLIS = eINSTANCE.getWorkEffort_EstimatedSetupMillis();

		/**
		 * The meta object literal for the '<em><b>Estimated Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__ESTIMATED_START_DATE = eINSTANCE.getWorkEffort_EstimatedStartDate();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__FACILITY_ID = eINSTANCE.getWorkEffort_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__FIXED_ASSET_ID = eINSTANCE.getWorkEffort_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Info Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__INFO_URL = eINSTANCE.getWorkEffort_InfoUrl();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getWorkEffort_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__LAST_MODIFIED_DATE = eINSTANCE.getWorkEffort_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Last Status Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__LAST_STATUS_UPDATE = eINSTANCE.getWorkEffort_LastStatusUpdate();

		/**
		 * The meta object literal for the '<em><b>Location Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__LOCATION_DESC = eINSTANCE.getWorkEffort_LocationDesc();

		/**
		 * The meta object literal for the '<em><b>Money Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__MONEY_UOM_ID = eINSTANCE.getWorkEffort_MoneyUomId();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__NOTE_ID = eINSTANCE.getWorkEffort_NoteId();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__PERCENT_COMPLETE = eINSTANCE.getWorkEffort_PercentComplete();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__PRIORITY = eINSTANCE.getWorkEffort_Priority();

		/**
		 * The meta object literal for the '<em><b>Quantity Produced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__QUANTITY_PRODUCED = eINSTANCE.getWorkEffort_QuantityProduced();

		/**
		 * The meta object literal for the '<em><b>Quantity Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__QUANTITY_REJECTED = eINSTANCE.getWorkEffort_QuantityRejected();

		/**
		 * The meta object literal for the '<em><b>Quantity To Produce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__QUANTITY_TO_PRODUCE = eINSTANCE.getWorkEffort_QuantityToProduce();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__RECURRENCE_INFO_ID = eINSTANCE.getWorkEffort_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Reserv2nd PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__RESERV2ND_PP_PERC = eINSTANCE.getWorkEffort_Reserv2ndPPPerc();

		/**
		 * The meta object literal for the '<em><b>Reserv Nth PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__RESERV_NTH_PP_PERC = eINSTANCE.getWorkEffort_ReservNthPPPerc();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__RESERV_PERSONS = eINSTANCE.getWorkEffort_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__REVISION_NUMBER = eINSTANCE.getWorkEffort_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Runtime Data Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__RUNTIME_DATA_ID = eINSTANCE.getWorkEffort_RuntimeDataId();

		/**
		 * The meta object literal for the '<em><b>Scope Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__SCOPE_ENUM_ID = eINSTANCE.getWorkEffort_ScopeEnumId();

		/**
		 * The meta object literal for the '<em><b>Send Notification Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__SEND_NOTIFICATION_EMAIL = eINSTANCE.getWorkEffort_SendNotificationEmail();

		/**
		 * The meta object literal for the '<em><b>Service Loader Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__SERVICE_LOADER_NAME = eINSTANCE.getWorkEffort_ServiceLoaderName();

		/**
		 * The meta object literal for the '<em><b>Show As Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__SHOW_AS_ENUM_ID = eINSTANCE.getWorkEffort_ShowAsEnumId();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__SOURCE_REFERENCE_ID = eINSTANCE.getWorkEffort_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Special Terms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__SPECIAL_TERMS = eINSTANCE.getWorkEffort_SpecialTerms();

		/**
		 * The meta object literal for the '<em><b>Temp Expr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__TEMP_EXPR_ID = eINSTANCE.getWorkEffort_TempExprId();

		/**
		 * The meta object literal for the '<em><b>Time Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__TIME_TRANSPARENCY = eINSTANCE.getWorkEffort_TimeTransparency();

		/**
		 * The meta object literal for the '<em><b>Total Milli Seconds Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED = eINSTANCE.getWorkEffort_TotalMilliSecondsAllowed();

		/**
		 * The meta object literal for the '<em><b>Total Money Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__TOTAL_MONEY_ALLOWED = eINSTANCE.getWorkEffort_TotalMoneyAllowed();

		/**
		 * The meta object literal for the '<em><b>Universal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__UNIVERSAL_ID = eINSTANCE.getWorkEffort_UniversalId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_ATTRIBUTES = eINSTANCE.getWorkEffort_WorkEffortAttributes();

		/**
		 * The meta object literal for the '<em><b>Work Effort Deliverable Prods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS = eINSTANCE.getWorkEffort_WorkEffortDeliverableProds();

		/**
		 * The meta object literal for the '<em><b>Work Effort Event Reminders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS = eINSTANCE.getWorkEffort_WorkEffortEventReminders();

		/**
		 * The meta object literal for the '<em><b>Work Effort Fixed Asset Stds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS = eINSTANCE.getWorkEffort_WorkEffortFixedAssetStds();

		/**
		 * The meta object literal for the '<em><b>Work Effort Inventory Assigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS = eINSTANCE.getWorkEffort_WorkEffortInventoryAssigns();

		/**
		 * The meta object literal for the '<em><b>Work Effort Inventory Produceds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS = eINSTANCE.getWorkEffort_WorkEffortInventoryProduceds();

		/**
		 * The meta object literal for the '<em><b>Work Effort Keywords</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_KEYWORDS = eINSTANCE.getWorkEffort_WorkEffortKeywords();

		/**
		 * The meta object literal for the '<em><b>Work Effort Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT__WORK_EFFORT_NAME = eINSTANCE.getWorkEffort_WorkEffortName();

		/**
		 * The meta object literal for the '<em><b>Work Effort Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_NOTES = eINSTANCE.getWorkEffort_WorkEffortNotes();

		/**
		 * The meta object literal for the '<em><b>Work Effort Parent Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_PARENT_ID = eINSTANCE.getWorkEffort_WorkEffortParentId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID = eINSTANCE.getWorkEffort_WorkEffortPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Skill Standards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS = eINSTANCE.getWorkEffort_WorkEffortSkillStandards();

		/**
		 * The meta object literal for the '<em><b>Work Effort Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT__WORK_EFFORT_TYPE_ID = eINSTANCE.getWorkEffort_WorkEffortTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl <em>Work Effort Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssoc()
		 * @generated
		 */
		EClass WORK_EFFORT_ASSOC = eINSTANCE.getWorkEffortAssoc();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM = eINSTANCE.getWorkEffortAssoc_WorkEffortIdFrom();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO = eINSTANCE.getWorkEffortAssoc_WorkEffortIdTo();

		/**
		 * The meta object literal for the '<em><b>Work Effort Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID = eINSTANCE.getWorkEffortAssoc_WorkEffortAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC__FROM_DATE = eINSTANCE.getWorkEffortAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC__SEQUENCE_NUM = eINSTANCE.getWorkEffortAssoc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC__THRU_DATE = eINSTANCE.getWorkEffortAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl <em>Work Effort Assoc Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocAttribute()
		 * @generated
		 */
		EClass WORK_EFFORT_ASSOC_ATTRIBUTE = eINSTANCE.getWorkEffortAssocAttribute();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM = eINSTANCE.getWorkEffortAssocAttribute_WorkEffortIdFrom();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO = eINSTANCE.getWorkEffortAssocAttribute_WorkEffortIdTo();

		/**
		 * The meta object literal for the '<em><b>Work Effort Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID = eINSTANCE.getWorkEffortAssocAttribute_WorkEffortAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME = eINSTANCE.getWorkEffortAssocAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getWorkEffortAssocAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getWorkEffortAssocAttribute_AttrValue();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE = eINSTANCE.getWorkEffortAssocAttribute_FromDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl <em>Work Effort Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocType()
		 * @generated
		 */
		EClass WORK_EFFORT_ASSOC_TYPE = eINSTANCE.getWorkEffortAssocType();

		/**
		 * The meta object literal for the '<em><b>Work Effort Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID = eINSTANCE.getWorkEffortAssocType_WorkEffortAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getWorkEffortAssocType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_TYPE__HAS_TABLE = eINSTANCE.getWorkEffortAssocType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID = eINSTANCE.getWorkEffortAssocType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Assoc Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS = eINSTANCE.getWorkEffortAssocType_WorkEffortAssocTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeAttrImpl <em>Work Effort Assoc Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeAttrImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAssocTypeAttr()
		 * @generated
		 */
		EClass WORK_EFFORT_ASSOC_TYPE_ATTR = eINSTANCE.getWorkEffortAssocTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Work Effort Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ASSOC_TYPE_ATTR__WORK_EFFORT_ASSOC_TYPE_ID = eINSTANCE.getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_TYPE_ATTR__ATTR_NAME = eINSTANCE.getWorkEffortAssocTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ASSOC_TYPE_ATTR__DESCRIPTION = eINSTANCE.getWorkEffortAssocTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAttributeImpl <em>Work Effort Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAttributeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortAttribute()
		 * @generated
		 */
		EClass WORK_EFFORT_ATTRIBUTE = eINSTANCE.getWorkEffortAttribute();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_ATTRIBUTE__WORK_EFFORT_ID = eINSTANCE.getWorkEffortAttribute_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getWorkEffortAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getWorkEffortAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getWorkEffortAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortBillingImpl <em>Work Effort Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortBillingImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortBilling()
		 * @generated
		 */
		EClass WORK_EFFORT_BILLING = eINSTANCE.getWorkEffortBilling();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_BILLING__WORK_EFFORT_ID = eINSTANCE.getWorkEffortBilling_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_BILLING__INVOICE_ID = eINSTANCE.getWorkEffortBilling_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getWorkEffortBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_BILLING__PERCENTAGE = eINSTANCE.getWorkEffortBilling_Percentage();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContactMechImpl <em>Work Effort Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContactMechImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContactMech()
		 * @generated
		 */
		EClass WORK_EFFORT_CONTACT_MECH = eINSTANCE.getWorkEffortContactMech();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTACT_MECH__WORK_EFFORT_ID = eINSTANCE.getWorkEffortContactMech_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getWorkEffortContactMech_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTACT_MECH__FROM_DATE = eINSTANCE.getWorkEffortContactMech_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTACT_MECH__COMMENTS = eINSTANCE.getWorkEffortContactMech_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTACT_MECH__THRU_DATE = eINSTANCE.getWorkEffortContactMech_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentImpl <em>Work Effort Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContent()
		 * @generated
		 */
		EClass WORK_EFFORT_CONTENT = eINSTANCE.getWorkEffortContent();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTENT__WORK_EFFORT_ID = eINSTANCE.getWorkEffortContent_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTENT__CONTENT_ID = eINSTANCE.getWorkEffortContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTENT__WORK_EFFORT_CONTENT_TYPE_ID = eINSTANCE.getWorkEffortContent_WorkEffortContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTENT__FROM_DATE = eINSTANCE.getWorkEffortContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTENT__THRU_DATE = eINSTANCE.getWorkEffortContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentTypeImpl <em>Work Effort Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortContentTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortContentType()
		 * @generated
		 */
		EClass WORK_EFFORT_CONTENT_TYPE = eINSTANCE.getWorkEffortContentType();

		/**
		 * The meta object literal for the '<em><b>Work Effort Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTENT_TYPE__WORK_EFFORT_CONTENT_TYPE_ID = eINSTANCE.getWorkEffortContentType_WorkEffortContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getWorkEffortContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getWorkEffortContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl <em>Work Effort Cost Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortCostCalc()
		 * @generated
		 */
		EClass WORK_EFFORT_COST_CALC = eINSTANCE.getWorkEffortCostCalc();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_COST_CALC__WORK_EFFORT_ID = eINSTANCE.getWorkEffortCostCalc_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID = eINSTANCE.getWorkEffortCostCalc_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_COST_CALC__FROM_DATE = eINSTANCE.getWorkEffortCostCalc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID = eINSTANCE.getWorkEffortCostCalc_CostComponentCalcId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_COST_CALC__THRU_DATE = eINSTANCE.getWorkEffortCostCalc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortDeliverableProdImpl <em>Work Effort Deliverable Prod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortDeliverableProdImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortDeliverableProd()
		 * @generated
		 */
		EClass WORK_EFFORT_DELIVERABLE_PROD = eINSTANCE.getWorkEffortDeliverableProd();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_DELIVERABLE_PROD__WORK_EFFORT_ID = eINSTANCE.getWorkEffortDeliverableProd_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Deliverable Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_DELIVERABLE_PROD__DELIVERABLE_ID = eINSTANCE.getWorkEffortDeliverableProd_DeliverableId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl <em>Work Effort Event Reminder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortEventReminder()
		 * @generated
		 */
		EClass WORK_EFFORT_EVENT_REMINDER = eINSTANCE.getWorkEffortEventReminder();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID = eINSTANCE.getWorkEffortEventReminder_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID = eINSTANCE.getWorkEffortEventReminder_SequenceId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID = eINSTANCE.getWorkEffortEventReminder_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Current Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT = eINSTANCE.getWorkEffortEventReminder_CurrentCount();

		/**
		 * The meta object literal for the '<em><b>Locale Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__LOCALE_ID = eINSTANCE.getWorkEffortEventReminder_LocaleId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_EVENT_REMINDER__PARTY_ID = eINSTANCE.getWorkEffortEventReminder_PartyId();

		/**
		 * The meta object literal for the '<em><b>Reminder Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME = eINSTANCE.getWorkEffortEventReminder_ReminderDateTime();

		/**
		 * The meta object literal for the '<em><b>Reminder Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET = eINSTANCE.getWorkEffortEventReminder_ReminderOffset();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT = eINSTANCE.getWorkEffortEventReminder_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL = eINSTANCE.getWorkEffortEventReminder_RepeatInterval();

		/**
		 * The meta object literal for the '<em><b>Time Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID = eINSTANCE.getWorkEffortEventReminder_TimeZoneId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl <em>Work Effort Fixed Asset Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortFixedAssetAssign()
		 * @generated
		 */
		EClass WORK_EFFORT_FIXED_ASSET_ASSIGN = eINSTANCE.getWorkEffortFixedAssetAssign();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID = eINSTANCE.getWorkEffortFixedAssetAssign_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID = eINSTANCE.getWorkEffortFixedAssetAssign_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE = eINSTANCE.getWorkEffortFixedAssetAssign_FromDate();

		/**
		 * The meta object literal for the '<em><b>Allocated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST = eINSTANCE.getWorkEffortFixedAssetAssign_AllocatedCost();

		/**
		 * The meta object literal for the '<em><b>Availability Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID = eINSTANCE.getWorkEffortFixedAssetAssign_AvailabilityStatusId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS = eINSTANCE.getWorkEffortFixedAssetAssign_Comments();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID = eINSTANCE.getWorkEffortFixedAssetAssign_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE = eINSTANCE.getWorkEffortFixedAssetAssign_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl <em>Work Effort Fixed Asset Std</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortFixedAssetStd()
		 * @generated
		 */
		EClass WORK_EFFORT_FIXED_ASSET_STD = eINSTANCE.getWorkEffortFixedAssetStd();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID = eINSTANCE.getWorkEffortFixedAssetStd_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID = eINSTANCE.getWorkEffortFixedAssetStd_FixedAssetTypeId();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST = eINSTANCE.getWorkEffortFixedAssetStd_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Estimated Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION = eINSTANCE.getWorkEffortFixedAssetStd_EstimatedDuration();

		/**
		 * The meta object literal for the '<em><b>Estimated Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY = eINSTANCE.getWorkEffortFixedAssetStd_EstimatedQuantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl <em>Work Effort Good Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortGoodStandard()
		 * @generated
		 */
		EClass WORK_EFFORT_GOOD_STANDARD = eINSTANCE.getWorkEffortGoodStandard();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID = eINSTANCE.getWorkEffortGoodStandard_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID = eINSTANCE.getWorkEffortGoodStandard_ProductId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Good Std Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID = eINSTANCE.getWorkEffortGoodStandard_WorkEffortGoodStdTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD__FROM_DATE = eINSTANCE.getWorkEffortGoodStandard_FromDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST = eINSTANCE.getWorkEffortGoodStandard_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Estimated Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY = eINSTANCE.getWorkEffortGoodStandard_EstimatedQuantity();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_GOOD_STANDARD__STATUS_ID = eINSTANCE.getWorkEffortGoodStandard_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD__THRU_DATE = eINSTANCE.getWorkEffortGoodStandard_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardTypeImpl <em>Work Effort Good Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortGoodStandardType()
		 * @generated
		 */
		EClass WORK_EFFORT_GOOD_STANDARD_TYPE = eINSTANCE.getWorkEffortGoodStandardType();

		/**
		 * The meta object literal for the '<em><b>Work Effort Good Std Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD_TYPE__WORK_EFFORT_GOOD_STD_TYPE_ID = eINSTANCE.getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD_TYPE__DESCRIPTION = eINSTANCE.getWorkEffortGoodStandardType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_GOOD_STANDARD_TYPE__HAS_TABLE = eINSTANCE.getWorkEffortGoodStandardType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_GOOD_STANDARD_TYPE__PARENT_TYPE_ID = eINSTANCE.getWorkEffortGoodStandardType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortIcalDataImpl <em>Work Effort Ical Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortIcalDataImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortIcalData()
		 * @generated
		 */
		EClass WORK_EFFORT_ICAL_DATA = eINSTANCE.getWorkEffortIcalData();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ICAL_DATA__WORK_EFFORT_ID = eINSTANCE.getWorkEffortIcalData_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Ical Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_ICAL_DATA__ICAL_DATA = eINSTANCE.getWorkEffortIcalData_IcalData();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryAssignImpl <em>Work Effort Inventory Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryAssignImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortInventoryAssign()
		 * @generated
		 */
		EClass WORK_EFFORT_INVENTORY_ASSIGN = eINSTANCE.getWorkEffortInventoryAssign();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_INVENTORY_ASSIGN__WORK_EFFORT_ID = eINSTANCE.getWorkEffortInventoryAssign_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_INVENTORY_ASSIGN__INVENTORY_ITEM_ID = eINSTANCE.getWorkEffortInventoryAssign_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_INVENTORY_ASSIGN__QUANTITY = eINSTANCE.getWorkEffortInventoryAssign_Quantity();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_INVENTORY_ASSIGN__STATUS_ID = eINSTANCE.getWorkEffortInventoryAssign_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl <em>Work Effort Inventory Produced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortInventoryProduced()
		 * @generated
		 */
		EClass WORK_EFFORT_INVENTORY_PRODUCED = eINSTANCE.getWorkEffortInventoryProduced();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID = eINSTANCE.getWorkEffortInventoryProduced_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID = eINSTANCE.getWorkEffortInventoryProduced_InventoryItemId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortKeywordImpl <em>Work Effort Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortKeywordImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortKeyword()
		 * @generated
		 */
		EClass WORK_EFFORT_KEYWORD = eINSTANCE.getWorkEffortKeyword();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_KEYWORD__WORK_EFFORT_ID = eINSTANCE.getWorkEffortKeyword_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_KEYWORD__KEYWORD = eINSTANCE.getWorkEffortKeyword_Keyword();

		/**
		 * The meta object literal for the '<em><b>Relevancy Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_KEYWORD__RELEVANCY_WEIGHT = eINSTANCE.getWorkEffortKeyword_RelevancyWeight();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortNoteImpl <em>Work Effort Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortNoteImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortNote()
		 * @generated
		 */
		EClass WORK_EFFORT_NOTE = eINSTANCE.getWorkEffortNote();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_NOTE__WORK_EFFORT_ID = eINSTANCE.getWorkEffortNote_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Internal Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_NOTE__INTERNAL_NOTE = eINSTANCE.getWorkEffortNote_InternalNote();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl <em>Work Effort Party Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortPartyAssignment()
		 * @generated
		 */
		EClass WORK_EFFORT_PARTY_ASSIGNMENT = eINSTANCE.getWorkEffortPartyAssignment();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID = eINSTANCE.getWorkEffortPartyAssignment_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID = eINSTANCE.getWorkEffortPartyAssignment_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID = eINSTANCE.getWorkEffortPartyAssignment_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE = eINSTANCE.getWorkEffortPartyAssignment_FromDate();

		/**
		 * The meta object literal for the '<em><b>Assigned By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID = eINSTANCE.getWorkEffortPartyAssignment_AssignedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Availability Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID = eINSTANCE.getWorkEffortPartyAssignment_AvailabilityStatusId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS = eINSTANCE.getWorkEffortPartyAssignment_Comments();

		/**
		 * The meta object literal for the '<em><b>Delegate Reason Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID = eINSTANCE.getWorkEffortPartyAssignment_DelegateReasonEnumId();

		/**
		 * The meta object literal for the '<em><b>Expectation Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID = eINSTANCE.getWorkEffortPartyAssignment_ExpectationEnumId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID = eINSTANCE.getWorkEffortPartyAssignment_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Must Rsvp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP = eINSTANCE.getWorkEffortPartyAssignment_MustRsvp();

		/**
		 * The meta object literal for the '<em><b>Status Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME = eINSTANCE.getWorkEffortPartyAssignment_StatusDateTime();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID = eINSTANCE.getWorkEffortPartyAssignment_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE = eINSTANCE.getWorkEffortPartyAssignment_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPurposeTypeImpl <em>Work Effort Purpose Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPurposeTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortPurposeType()
		 * @generated
		 */
		EClass WORK_EFFORT_PURPOSE_TYPE = eINSTANCE.getWorkEffortPurposeType();

		/**
		 * The meta object literal for the '<em><b>Work Effort Purpose Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PURPOSE_TYPE__WORK_EFFORT_PURPOSE_TYPE_ID = eINSTANCE.getWorkEffortPurposeType_WorkEffortPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_PURPOSE_TYPE__DESCRIPTION = eINSTANCE.getWorkEffortPurposeType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_PURPOSE_TYPE__PARENT_TYPE_ID = eINSTANCE.getWorkEffortPurposeType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl <em>Work Effort Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortReview()
		 * @generated
		 */
		EClass WORK_EFFORT_REVIEW = eINSTANCE.getWorkEffortReview();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_REVIEW__WORK_EFFORT_ID = eINSTANCE.getWorkEffortReview_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_REVIEW__USER_LOGIN_ID = eINSTANCE.getWorkEffortReview_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_REVIEW__REVIEW_DATE = eINSTANCE.getWorkEffortReview_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Posted Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_REVIEW__POSTED_ANONYMOUS = eINSTANCE.getWorkEffortReview_PostedAnonymous();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_REVIEW__RATING = eINSTANCE.getWorkEffortReview_Rating();

		/**
		 * The meta object literal for the '<em><b>Review Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_REVIEW__REVIEW_TEXT = eINSTANCE.getWorkEffortReview_ReviewText();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_REVIEW__STATUS_ID = eINSTANCE.getWorkEffortReview_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl <em>Work Effort Search Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSearchConstraint()
		 * @generated
		 */
		EClass WORK_EFFORT_SEARCH_CONSTRAINT = eINSTANCE.getWorkEffortSearchConstraint();

		/**
		 * The meta object literal for the '<em><b>Work Effort Search Result Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID = eINSTANCE.getWorkEffortSearchConstraint_WorkEffortSearchResultId();

		/**
		 * The meta object literal for the '<em><b>Constraint Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = eINSTANCE.getWorkEffortSearchConstraint_ConstraintSeqId();

		/**
		 * The meta object literal for the '<em><b>Any Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX = eINSTANCE.getWorkEffortSearchConstraint_AnyPrefix();

		/**
		 * The meta object literal for the '<em><b>Any Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX = eINSTANCE.getWorkEffortSearchConstraint_AnySuffix();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getWorkEffortSearchConstraint_ConstraintName();

		/**
		 * The meta object literal for the '<em><b>High Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE = eINSTANCE.getWorkEffortSearchConstraint_HighValue();

		/**
		 * The meta object literal for the '<em><b>Include Sub Work Efforts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS = eINSTANCE.getWorkEffortSearchConstraint_IncludeSubWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Info String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING = eINSTANCE.getWorkEffortSearchConstraint_InfoString();

		/**
		 * The meta object literal for the '<em><b>Is And</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND = eINSTANCE.getWorkEffortSearchConstraint_IsAnd();

		/**
		 * The meta object literal for the '<em><b>Low Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE = eINSTANCE.getWorkEffortSearchConstraint_LowValue();

		/**
		 * The meta object literal for the '<em><b>Remove Stems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS = eINSTANCE.getWorkEffortSearchConstraint_RemoveStems();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl <em>Work Effort Search Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSearchResult()
		 * @generated
		 */
		EClass WORK_EFFORT_SEARCH_RESULT = eINSTANCE.getWorkEffortSearchResult();

		/**
		 * The meta object literal for the '<em><b>Work Effort Search Result Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID = eINSTANCE.getWorkEffortSearchResult_WorkEffortSearchResultId();

		/**
		 * The meta object literal for the '<em><b>Is Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING = eINSTANCE.getWorkEffortSearchResult_IsAscending();

		/**
		 * The meta object literal for the '<em><b>Num Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS = eINSTANCE.getWorkEffortSearchResult_NumResults();

		/**
		 * The meta object literal for the '<em><b>Order By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME = eINSTANCE.getWorkEffortSearchResult_OrderByName();

		/**
		 * The meta object literal for the '<em><b>Search Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE = eINSTANCE.getWorkEffortSearchResult_SearchDate();

		/**
		 * The meta object literal for the '<em><b>Seconds Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL = eINSTANCE.getWorkEffortSearchResult_SecondsTotal();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SEARCH_RESULT__VISIT_ID = eINSTANCE.getWorkEffortSearchResult_VisitId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Search Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS = eINSTANCE.getWorkEffortSearchResult_WorkEffortSearchConstraints();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl <em>Work Effort Skill Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSkillStandard()
		 * @generated
		 */
		EClass WORK_EFFORT_SKILL_STANDARD = eINSTANCE.getWorkEffortSkillStandard();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID = eINSTANCE.getWorkEffortSkillStandard_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Skill Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID = eINSTANCE.getWorkEffortSkillStandard_SkillTypeId();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST = eINSTANCE.getWorkEffortSkillStandard_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Estimated Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION = eINSTANCE.getWorkEffortSkillStandard_EstimatedDuration();

		/**
		 * The meta object literal for the '<em><b>Estimated Num People</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE = eINSTANCE.getWorkEffortSkillStandard_EstimatedNumPeople();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl <em>Work Effort Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortStatus()
		 * @generated
		 */
		EClass WORK_EFFORT_STATUS = eINSTANCE.getWorkEffortStatus();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_STATUS__WORK_EFFORT_ID = eINSTANCE.getWorkEffortStatus_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_STATUS__STATUS_ID = eINSTANCE.getWorkEffortStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Status Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_STATUS__STATUS_DATETIME = eINSTANCE.getWorkEffortStatus_StatusDatetime();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_STATUS__REASON = eINSTANCE.getWorkEffortStatus_Reason();

		/**
		 * The meta object literal for the '<em><b>Set By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_STATUS__SET_BY_USER_LOGIN = eINSTANCE.getWorkEffortStatus_SetByUserLogin();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSurveyApplImpl <em>Work Effort Survey Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSurveyApplImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortSurveyAppl()
		 * @generated
		 */
		EClass WORK_EFFORT_SURVEY_APPL = eINSTANCE.getWorkEffortSurveyAppl();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SURVEY_APPL__WORK_EFFORT_ID = eINSTANCE.getWorkEffortSurveyAppl_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Survey Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_SURVEY_APPL__SURVEY_ID = eINSTANCE.getWorkEffortSurveyAppl_SurveyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SURVEY_APPL__FROM_DATE = eINSTANCE.getWorkEffortSurveyAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_SURVEY_APPL__THRU_DATE = eINSTANCE.getWorkEffortSurveyAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl <em>Work Effort Trans Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortTransBox()
		 * @generated
		 */
		EClass WORK_EFFORT_TRANS_BOX = eINSTANCE.getWorkEffortTransBox();

		/**
		 * The meta object literal for the '<em><b>Process Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID = eINSTANCE.getWorkEffortTransBox_ProcessWorkEffortId();

		/**
		 * The meta object literal for the '<em><b>To Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID = eINSTANCE.getWorkEffortTransBox_ToActivityId();

		/**
		 * The meta object literal for the '<em><b>Transition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TRANS_BOX__TRANSITION_ID = eINSTANCE.getWorkEffortTransBox_TransitionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl <em>Work Effort Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortType()
		 * @generated
		 */
		EClass WORK_EFFORT_TYPE = eINSTANCE.getWorkEffortType();

		/**
		 * The meta object literal for the '<em><b>Work Effort Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID = eINSTANCE.getWorkEffortType_WorkEffortTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TYPE__DESCRIPTION = eINSTANCE.getWorkEffortType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TYPE__HAS_TABLE = eINSTANCE.getWorkEffortType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_TYPE__PARENT_TYPE_ID = eINSTANCE.getWorkEffortType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS = eINSTANCE.getWorkEffortType_WorkEffortTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeAttrImpl <em>Work Effort Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeAttrImpl
		 * @see org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl#getWorkEffortTypeAttr()
		 * @generated
		 */
		EClass WORK_EFFORT_TYPE_ATTR = eINSTANCE.getWorkEffortTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Work Effort Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EFFORT_TYPE_ATTR__WORK_EFFORT_TYPE_ID = eINSTANCE.getWorkEffortTypeAttr_WorkEffortTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getWorkEffortTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_EFFORT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getWorkEffortTypeAttr_Description();

	}

} //WorkeffortPackage
