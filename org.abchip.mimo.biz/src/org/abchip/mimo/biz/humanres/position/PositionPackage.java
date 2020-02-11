/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position;

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
 * @see org.abchip.mimo.biz.humanres.position.PositionFactory
 * @model kind="package"
 * @generated
 */
public interface PositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "position";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/humanres/position";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-position";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PositionPackage eINSTANCE = org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl <em>Empl Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPosition()
	 * @generated
	 */
	int EMPL_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ACTUAL_FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ACTUAL_THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__BUDGET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estimated From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ESTIMATED_FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estimated Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ESTIMATED_THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exempt Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EXEMPT_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fulltime Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__FULLTIME_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Salary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__SALARY_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Temporary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__TEMPORARY_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Empl Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionClassTypeImpl <em>Empl Position Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionClassTypeImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionClassType()
	 * @generated
	 */
	int EMPL_POSITION_CLASS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Class Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__EMPL_POSITION_CLASS_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Empl Position Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionFulfillmentImpl <em>Empl Position Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionFulfillmentImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionFulfillment()
	 * @generated
	 */
	int EMPL_POSITION_FULFILLMENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__EMPL_POSITION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Empl Position Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl <em>Empl Position Reporting Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionReportingStruct()
	 * @generated
	 */
	int EMPL_POSITION_REPORTING_STRUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Id Reporting To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Empl Position Id Managed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Empl Position Reporting Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl <em>Empl Position Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionResponsibility()
	 * @generated
	 */
	int EMPL_POSITION_RESPONSIBILITY = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsibility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Empl Position Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeImpl <em>Empl Position Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionType()
	 * @generated
	 */
	int EMPL_POSITION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Empl Position Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl <em>Empl Position Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeClass()
	 * @generated
	 */
	int EMPL_POSITION_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Empl Position Class Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Standard Hours Per Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Empl Position Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl <em>Empl Position Type Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeRate()
	 * @generated
	 */
	int EMPL_POSITION_TYPE_RATE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pay Grade Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Salary Step Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Empl Position Type Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl <em>Valid Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl
	 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getValidResponsibility()
	 * @generated
	 */
	int VALID_RESPONSIBILITY = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsibility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Valid Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition
	 * @generated
	 */
	EClass getEmplPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionId <em>Empl Position Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EmplPositionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualFromDate <em>Actual From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getActualFromDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ActualFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualThruDate <em>Actual Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getActualThruDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ActualThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetItemSeqId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_BudgetItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionTypeId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_EmplPositionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedFromDate <em>Estimated From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedFromDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EstimatedFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedThruDate <em>Estimated Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedThruDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EstimatedThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isExemptFlag <em>Exempt Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Flag</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#isExemptFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ExemptFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isFulltimeFlag <em>Fulltime Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulltime Flag</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#isFulltimeFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_FulltimeFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getPartyId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isSalaryFlag <em>Salary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Flag</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#isSalaryFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_SalaryFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#getStatusId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isTemporaryFlag <em>Temporary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporary Flag</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPosition#isTemporaryFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_TemporaryFlag();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionClassType <em>Empl Position Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Class Type</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionClassType
	 * @generated
	 */
	EClass getEmplPositionClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getEmplPositionClassTypeId <em>Empl Position Class Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Class Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getEmplPositionClassTypeId()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_EmplPositionClassTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getDescription()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionClassType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionClassType#isHasTable()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionClassType#getParentTypeId()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EReference getEmplPositionClassType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment <em>Empl Position Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment
	 * @generated
	 */
	EClass getEmplPositionFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getEmplPositionId <em>Empl Position Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getEmplPositionId()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EReference getEmplPositionFulfillment_EmplPositionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getPartyId()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EReference getEmplPositionFulfillment_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getFromDate()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getComments()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionFulfillment#getThruDate()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct <em>Empl Position Reporting Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Reporting Struct</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct
	 * @generated
	 */
	EClass getEmplPositionReportingStruct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo <em>Empl Position Id Reporting To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id Reporting To</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EReference getEmplPositionReportingStruct_EmplPositionIdReportingTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy <em>Empl Position Id Managed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id Managed By</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EReference getEmplPositionReportingStruct_EmplPositionIdManagedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getFromDate()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getComments()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getPrimaryFlag <em>Primary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Flag</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getPrimaryFlag()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_PrimaryFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getThruDate()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility <em>Empl Position Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Responsibility</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility
	 * @generated
	 */
	EClass getEmplPositionResponsibility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getEmplPositionId <em>Empl Position Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getEmplPositionId()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EReference getEmplPositionResponsibility_EmplPositionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getResponsibilityTypeId <em>Responsibility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getResponsibilityTypeId()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EReference getEmplPositionResponsibility_ResponsibilityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getFromDate()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getComments()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getThruDate()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionType
	 * @generated
	 */
	EClass getEmplPositionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionType#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionType#getEmplPositionTypeId()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_EmplPositionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionType#getDescription()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionType#isHasTable()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionType#getParentTypeId()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EReference getEmplPositionType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass <em>Empl Position Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type Class</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass
	 * @generated
	 */
	EClass getEmplPositionTypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getEmplPositionTypeId()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EReference getEmplPositionTypeClass_EmplPositionTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getEmplPositionClassTypeId <em>Empl Position Class Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Class Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getEmplPositionClassTypeId()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EReference getEmplPositionTypeClass_EmplPositionClassTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getFromDate()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek <em>Standard Hours Per Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Hours Per Week</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_StandardHoursPerWeek();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass#getThruDate()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate <em>Empl Position Type Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type Rate</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate
	 * @generated
	 */
	EClass getEmplPositionTypeRate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getEmplPositionTypeId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EReference getEmplPositionTypeRate_EmplPositionTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getRateTypeId <em>Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getRateTypeId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EReference getEmplPositionTypeRate_RateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getFromDate()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getPayGradeId <em>Pay Grade Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Grade Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getPayGradeId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_PayGradeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getSalaryStepSeqId <em>Salary Step Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Step Seq Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getSalaryStepSeqId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_SalaryStepSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate#getThruDate()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility <em>Valid Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Responsibility</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility
	 * @generated
	 */
	EClass getValidResponsibility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility#getEmplPositionTypeId()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EReference getValidResponsibility_EmplPositionTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility#getResponsibilityTypeId <em>Responsibility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility Type Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility#getResponsibilityTypeId()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EReference getValidResponsibility_ResponsibilityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility#getFromDate()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility#getComments()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.position.ValidResponsibility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.humanres.position.ValidResponsibility#getThruDate()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PositionFactory getPositionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl <em>Empl Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPosition()
		 * @generated
		 */
		EClass EMPL_POSITION = eINSTANCE.getEmplPosition();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__EMPL_POSITION_ID = eINSTANCE.getEmplPosition_EmplPositionId();

		/**
		 * The meta object literal for the '<em><b>Actual From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ACTUAL_FROM_DATE = eINSTANCE.getEmplPosition_ActualFromDate();

		/**
		 * The meta object literal for the '<em><b>Actual Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ACTUAL_THRU_DATE = eINSTANCE.getEmplPosition_ActualThruDate();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__BUDGET_ID = eINSTANCE.getEmplPosition_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getEmplPosition_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__EMPL_POSITION_TYPE_ID = eINSTANCE.getEmplPosition_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Estimated From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ESTIMATED_FROM_DATE = eINSTANCE.getEmplPosition_EstimatedFromDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ESTIMATED_THRU_DATE = eINSTANCE.getEmplPosition_EstimatedThruDate();

		/**
		 * The meta object literal for the '<em><b>Exempt Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__EXEMPT_FLAG = eINSTANCE.getEmplPosition_ExemptFlag();

		/**
		 * The meta object literal for the '<em><b>Fulltime Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__FULLTIME_FLAG = eINSTANCE.getEmplPosition_FulltimeFlag();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__PARTY_ID = eINSTANCE.getEmplPosition_PartyId();

		/**
		 * The meta object literal for the '<em><b>Salary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__SALARY_FLAG = eINSTANCE.getEmplPosition_SalaryFlag();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__STATUS_ID = eINSTANCE.getEmplPosition_StatusId();

		/**
		 * The meta object literal for the '<em><b>Temporary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__TEMPORARY_FLAG = eINSTANCE.getEmplPosition_TemporaryFlag();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionClassTypeImpl <em>Empl Position Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionClassTypeImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionClassType()
		 * @generated
		 */
		EClass EMPL_POSITION_CLASS_TYPE = eINSTANCE.getEmplPositionClassType();

		/**
		 * The meta object literal for the '<em><b>Empl Position Class Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__EMPL_POSITION_CLASS_TYPE_ID = eINSTANCE.getEmplPositionClassType_EmplPositionClassTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__DESCRIPTION = eINSTANCE.getEmplPositionClassType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__HAS_TABLE = eINSTANCE.getEmplPositionClassType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_CLASS_TYPE__PARENT_TYPE_ID = eINSTANCE.getEmplPositionClassType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionFulfillmentImpl <em>Empl Position Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionFulfillmentImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionFulfillment()
		 * @generated
		 */
		EClass EMPL_POSITION_FULFILLMENT = eINSTANCE.getEmplPositionFulfillment();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_FULFILLMENT__EMPL_POSITION_ID = eINSTANCE.getEmplPositionFulfillment_EmplPositionId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_FULFILLMENT__PARTY_ID = eINSTANCE.getEmplPositionFulfillment_PartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__FROM_DATE = eINSTANCE.getEmplPositionFulfillment_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__COMMENTS = eINSTANCE.getEmplPositionFulfillment_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__THRU_DATE = eINSTANCE.getEmplPositionFulfillment_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl <em>Empl Position Reporting Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionReportingStruct()
		 * @generated
		 */
		EClass EMPL_POSITION_REPORTING_STRUCT = eINSTANCE.getEmplPositionReportingStruct();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id Reporting To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO = eINSTANCE.getEmplPositionReportingStruct_EmplPositionIdReportingTo();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id Managed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY = eINSTANCE.getEmplPositionReportingStruct_EmplPositionIdManagedBy();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__FROM_DATE = eINSTANCE.getEmplPositionReportingStruct_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__COMMENTS = eINSTANCE.getEmplPositionReportingStruct_Comments();

		/**
		 * The meta object literal for the '<em><b>Primary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG = eINSTANCE.getEmplPositionReportingStruct_PrimaryFlag();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__THRU_DATE = eINSTANCE.getEmplPositionReportingStruct_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl <em>Empl Position Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionResponsibility()
		 * @generated
		 */
		EClass EMPL_POSITION_RESPONSIBILITY = eINSTANCE.getEmplPositionResponsibility();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID = eINSTANCE.getEmplPositionResponsibility_EmplPositionId();

		/**
		 * The meta object literal for the '<em><b>Responsibility Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID = eINSTANCE.getEmplPositionResponsibility_ResponsibilityTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__FROM_DATE = eINSTANCE.getEmplPositionResponsibility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__COMMENTS = eINSTANCE.getEmplPositionResponsibility_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__THRU_DATE = eINSTANCE.getEmplPositionResponsibility_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeImpl <em>Empl Position Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionType()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE = eINSTANCE.getEmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID = eINSTANCE.getEmplPositionType_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__DESCRIPTION = eINSTANCE.getEmplPositionType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__HAS_TABLE = eINSTANCE.getEmplPositionType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE__PARENT_TYPE_ID = eINSTANCE.getEmplPositionType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl <em>Empl Position Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeClass()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE_CLASS = eINSTANCE.getEmplPositionTypeClass();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID = eINSTANCE.getEmplPositionTypeClass_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Empl Position Class Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID = eINSTANCE.getEmplPositionTypeClass_EmplPositionClassTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__FROM_DATE = eINSTANCE.getEmplPositionTypeClass_FromDate();

		/**
		 * The meta object literal for the '<em><b>Standard Hours Per Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK = eINSTANCE.getEmplPositionTypeClass_StandardHoursPerWeek();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__THRU_DATE = eINSTANCE.getEmplPositionTypeClass_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl <em>Empl Position Type Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeRate()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE_RATE = eINSTANCE.getEmplPositionTypeRate();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID = eINSTANCE.getEmplPositionTypeRate_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Rate Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID = eINSTANCE.getEmplPositionTypeRate_RateTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__FROM_DATE = eINSTANCE.getEmplPositionTypeRate_FromDate();

		/**
		 * The meta object literal for the '<em><b>Pay Grade Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID = eINSTANCE.getEmplPositionTypeRate_PayGradeId();

		/**
		 * The meta object literal for the '<em><b>Salary Step Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID = eINSTANCE.getEmplPositionTypeRate_SalaryStepSeqId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__THRU_DATE = eINSTANCE.getEmplPositionTypeRate_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl <em>Valid Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl
		 * @see org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl#getValidResponsibility()
		 * @generated
		 */
		EClass VALID_RESPONSIBILITY = eINSTANCE.getValidResponsibility();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID = eINSTANCE.getValidResponsibility_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Responsibility Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID = eINSTANCE.getValidResponsibility_ResponsibilityTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__FROM_DATE = eINSTANCE.getValidResponsibility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__COMMENTS = eINSTANCE.getValidResponsibility_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__THRU_DATE = eINSTANCE.getValidResponsibility_ThruDate();

	}

} //PositionPackage
