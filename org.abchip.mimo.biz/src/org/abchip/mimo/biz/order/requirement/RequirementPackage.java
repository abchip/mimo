/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

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
 * @see org.abchip.mimo.biz.order.requirement.RequirementFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-requirement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementPackage eINSTANCE = org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl <em>Desired Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getDesiredFeature()
	 * @generated
	 */
	int DESIRED_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desired Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__DESIRED_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__OPTIONAL_IND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Desired Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.OrderRequirementCommitmentImpl <em>Order Requirement Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.OrderRequirementCommitmentImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getOrderRequirementCommitment()
	 * @generated
	 */
	int ORDER_REQUIREMENT_COMMITMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Order Requirement Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deliverable Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DELIVERABLE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ESTIMATED_BUDGET = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REASON = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Required By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRED_BY_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Requirement Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Requirement Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_START_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Requirement Statuss</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_STATUSS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Requirement Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__USE_CASE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Work Requirement Fulfillments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementAttributeImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementAttribute()
	 * @generated
	 */
	int REQUIREMENT_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementBudgetAllocationImpl <em>Budget Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementBudgetAllocationImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementBudgetAllocation()
	 * @generated
	 */
	int REQUIREMENT_BUDGET_ALLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Budget Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementCustRequestImpl <em>Cust Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementCustRequestImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementCustRequest()
	 * @generated
	 */
	int REQUIREMENT_CUST_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cust Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementRoleImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementRole()
	 * @generated
	 */
	int REQUIREMENT_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementStatusImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementStatus()
	 * @generated
	 */
	int REQUIREMENT_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementTypeImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementTypeAttr()
	 * @generated
	 */
	int REQUIREMENT_TYPE_ATTR = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.WorkReqFulfTypeImpl <em>Work Req Fulf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.WorkReqFulfTypeImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getWorkReqFulfType()
	 * @generated
	 */
	int WORK_REQ_FULF_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Work Req Fulf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__WORK_REQ_FULF_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Req Fulf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl <em>Work Requirement Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl
	 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getWorkRequirementFulfillment()
	 * @generated
	 */
	int WORK_REQUIREMENT_FULFILLMENT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Req Fulf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Requirement Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature <em>Desired Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desired Feature</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.DesiredFeature
	 * @generated
	 */
	EClass getDesiredFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired Feature Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.DesiredFeature#getDesiredFeatureId()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EAttribute getDesiredFeature_DesiredFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.DesiredFeature#getRequirementId()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EReference getDesiredFeature_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#isOptionalInd <em>Optional Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Ind</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.DesiredFeature#isOptionalInd()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EAttribute getDesiredFeature_OptionalInd();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.DesiredFeature#getProductFeatureId()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EReference getDesiredFeature_ProductFeatureId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment <em>Order Requirement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Requirement Commitment</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment
	 * @generated
	 */
	EClass getOrderRequirementCommitment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getOrderId()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EReference getOrderRequirementCommitment_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getOrderItemSeqId()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EAttribute getOrderRequirementCommitment_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getRequirementId()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EReference getOrderRequirementCommitment_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.OrderRequirementCommitment#getQuantity()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EAttribute getOrderRequirementCommitment_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequirementId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getCreatedByUserLogin()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getCreatedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getDeliverableId <em>Deliverable Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getDeliverableId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DeliverableId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getEstimatedBudget <em>Estimated Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Budget</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getEstimatedBudget()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_EstimatedBudget();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getFacilityId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getFixedAssetId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getLastModifiedByUserLogin()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getLastModifiedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getProductId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getQuantity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getReason()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Reason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequiredByDate <em>Required By Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequiredByDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequiredByDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequirementAttributes <em>Requirement Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Attributes</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequirementAttributes()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequirementStartDate <em>Requirement Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Start Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequirementStartDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequirementStartDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequirementStatuss <em>Requirement Statuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Statuss</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequirementStatuss()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementStatuss();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getRequirementTypeId <em>Requirement Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getRequirementTypeId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.Requirement#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getStatusId()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.Requirement#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Case</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getUseCase()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.requirement.Requirement#getWorkRequirementFulfillments <em>Work Requirement Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Requirement Fulfillments</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.Requirement#getWorkRequirementFulfillments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_WorkRequirementFulfillments();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementAttribute
	 * @generated
	 */
	EClass getRequirementAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementAttribute#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementAttribute#getRequirementId()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EReference getRequirementAttribute_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrName()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrDescription()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementAttribute#getAttrValue()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation <em>Budget Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget Allocation</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation
	 * @generated
	 */
	EClass getRequirementBudgetAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getBudgetId()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EReference getRequirementBudgetAllocation_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getBudgetItemSeqId()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EAttribute getRequirementBudgetAllocation_BudgetItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getRequirementId()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EReference getRequirementBudgetAllocation_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementBudgetAllocation#getAmount()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EAttribute getRequirementBudgetAllocation_Amount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest <em>Cust Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementCustRequest
	 * @generated
	 */
	EClass getRequirementCustRequest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestId()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EReference getRequirementCustRequest_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestItemSeqId()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EAttribute getRequirementCustRequest_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getRequirementId()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EReference getRequirementCustRequest_RequirementId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole
	 * @generated
	 */
	EClass getRequirementRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementRole#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole#getRequirementId()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EReference getRequirementRole_RequirementId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole#getPartyId()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EReference getRequirementRole_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole#getRoleTypeId()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole#getFromDate()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementRole#getThruDate()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementStatus
	 * @generated
	 */
	EClass getRequirementStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementStatus#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementStatus#getRequirementId()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_RequirementId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementStatus#getStatusId()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementStatus#getChangeByUserLoginId()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementStatus#getStatusDate()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EAttribute getRequirementStatus_StatusDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementType#getRequirementTypeId <em>Requirement Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType#getRequirementTypeId()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_RequirementTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType#getDescription()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType#isHasTable()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType#getParentTypeId()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.requirement.RequirementType#getRequirementTypeAttrs <em>Requirement Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementType#getRequirementTypeAttrs()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_RequirementTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.RequirementTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementTypeAttr
	 * @generated
	 */
	EClass getRequirementTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getRequirementTypeId <em>Requirement Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getRequirementTypeId()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EReference getRequirementTypeAttr_RequirementTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getAttrName()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EAttribute getRequirementTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.RequirementTypeAttr#getDescription()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EAttribute getRequirementTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType <em>Work Req Fulf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Req Fulf Type</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkReqFulfType
	 * @generated
	 */
	EClass getWorkReqFulfType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Req Fulf Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId()
	 * @see #getWorkReqFulfType()
	 * @generated
	 */
	EAttribute getWorkReqFulfType_WorkReqFulfTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getDescription()
	 * @see #getWorkReqFulfType()
	 * @generated
	 */
	EAttribute getWorkReqFulfType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment <em>Work Requirement Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Requirement Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment
	 * @generated
	 */
	EClass getWorkRequirementFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getRequirementId()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_RequirementId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkEffortId()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Req Fulf Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkReqFulfTypeId()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_WorkReqFulfTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementFactory getRequirementFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl <em>Desired Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getDesiredFeature()
		 * @generated
		 */
		EClass DESIRED_FEATURE = eINSTANCE.getDesiredFeature();

		/**
		 * The meta object literal for the '<em><b>Desired Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIRED_FEATURE__DESIRED_FEATURE_ID = eINSTANCE.getDesiredFeature_DesiredFeatureId();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIRED_FEATURE__REQUIREMENT_ID = eINSTANCE.getDesiredFeature_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Optional Ind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIRED_FEATURE__OPTIONAL_IND = eINSTANCE.getDesiredFeature_OptionalInd();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIRED_FEATURE__PRODUCT_FEATURE_ID = eINSTANCE.getDesiredFeature_ProductFeatureId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.OrderRequirementCommitmentImpl <em>Order Requirement Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.OrderRequirementCommitmentImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getOrderRequirementCommitment()
		 * @generated
		 */
		EClass ORDER_REQUIREMENT_COMMITMENT = eINSTANCE.getOrderRequirementCommitment();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REQUIREMENT_COMMITMENT__ORDER_ID = eINSTANCE.getOrderRequirementCommitment_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REQUIREMENT_COMMITMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderRequirementCommitment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REQUIREMENT_COMMITMENT__REQUIREMENT_ID = eINSTANCE.getOrderRequirementCommitment_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REQUIREMENT_COMMITMENT__QUANTITY = eINSTANCE.getOrderRequirementCommitment_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT_ID = eINSTANCE.getRequirement_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getRequirement_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_DATE = eINSTANCE.getRequirement_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Deliverable Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DELIVERABLE_ID = eINSTANCE.getRequirement_DeliverableId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ESTIMATED_BUDGET = eINSTANCE.getRequirement_EstimatedBudget();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FACILITY_ID = eINSTANCE.getRequirement_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FIXED_ASSET_ID = eINSTANCE.getRequirement_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getRequirement_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LAST_MODIFIED_DATE = eINSTANCE.getRequirement_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PRODUCT_ID = eINSTANCE.getRequirement_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__QUANTITY = eINSTANCE.getRequirement_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REASON = eINSTANCE.getRequirement_Reason();

		/**
		 * The meta object literal for the '<em><b>Required By Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIRED_BY_DATE = eINSTANCE.getRequirement_RequiredByDate();

		/**
		 * The meta object literal for the '<em><b>Requirement Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_ATTRIBUTES = eINSTANCE.getRequirement_RequirementAttributes();

		/**
		 * The meta object literal for the '<em><b>Requirement Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT_START_DATE = eINSTANCE.getRequirement_RequirementStartDate();

		/**
		 * The meta object literal for the '<em><b>Requirement Statuss</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_STATUSS = eINSTANCE.getRequirement_RequirementStatuss();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_TYPE_ID = eINSTANCE.getRequirement_RequirementTypeId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__STATUS_ID = eINSTANCE.getRequirement_StatusId();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__USE_CASE = eINSTANCE.getRequirement_UseCase();

		/**
		 * The meta object literal for the '<em><b>Work Requirement Fulfillments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS = eINSTANCE.getRequirement_WorkRequirementFulfillments();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementAttributeImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementAttribute()
		 * @generated
		 */
		EClass REQUIREMENT_ATTRIBUTE = eINSTANCE.getRequirementAttribute();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ATTRIBUTE__REQUIREMENT_ID = eINSTANCE.getRequirementAttribute_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getRequirementAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getRequirementAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getRequirementAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementBudgetAllocationImpl <em>Budget Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementBudgetAllocationImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementBudgetAllocation()
		 * @generated
		 */
		EClass REQUIREMENT_BUDGET_ALLOCATION = eINSTANCE.getRequirementBudgetAllocation();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ID = eINSTANCE.getRequirementBudgetAllocation_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getRequirementBudgetAllocation_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_BUDGET_ALLOCATION__REQUIREMENT_ID = eINSTANCE.getRequirementBudgetAllocation_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_BUDGET_ALLOCATION__AMOUNT = eINSTANCE.getRequirementBudgetAllocation_Amount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementCustRequestImpl <em>Cust Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementCustRequestImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementCustRequest()
		 * @generated
		 */
		EClass REQUIREMENT_CUST_REQUEST = eINSTANCE.getRequirementCustRequest();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ID = eINSTANCE.getRequirementCustRequest_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getRequirementCustRequest_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CUST_REQUEST__REQUIREMENT_ID = eINSTANCE.getRequirementCustRequest_RequirementId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementRoleImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementRole()
		 * @generated
		 */
		EClass REQUIREMENT_ROLE = eINSTANCE.getRequirementRole();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROLE__REQUIREMENT_ID = eINSTANCE.getRequirementRole_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROLE__PARTY_ID = eINSTANCE.getRequirementRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__ROLE_TYPE_ID = eINSTANCE.getRequirementRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__FROM_DATE = eINSTANCE.getRequirementRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__THRU_DATE = eINSTANCE.getRequirementRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementStatusImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementStatus()
		 * @generated
		 */
		EClass REQUIREMENT_STATUS = eINSTANCE.getRequirementStatus();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__REQUIREMENT_ID = eINSTANCE.getRequirementStatus_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__STATUS_ID = eINSTANCE.getRequirementStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getRequirementStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_STATUS__STATUS_DATE = eINSTANCE.getRequirementStatus_StatusDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementTypeImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementType()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__REQUIREMENT_TYPE_ID = eINSTANCE.getRequirementType_RequirementTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__DESCRIPTION = eINSTANCE.getRequirementType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__HAS_TABLE = eINSTANCE.getRequirementType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getRequirementType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REQUIREMENT_TYPE_ATTRS = eINSTANCE.getRequirementType_RequirementTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getRequirementTypeAttr()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE_ATTR = eINSTANCE.getRequirementTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID = eINSTANCE.getRequirementTypeAttr_RequirementTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getRequirementTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getRequirementTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.WorkReqFulfTypeImpl <em>Work Req Fulf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.WorkReqFulfTypeImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getWorkReqFulfType()
		 * @generated
		 */
		EClass WORK_REQ_FULF_TYPE = eINSTANCE.getWorkReqFulfType();

		/**
		 * The meta object literal for the '<em><b>Work Req Fulf Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_REQ_FULF_TYPE__WORK_REQ_FULF_TYPE_ID = eINSTANCE.getWorkReqFulfType_WorkReqFulfTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_REQ_FULF_TYPE__DESCRIPTION = eINSTANCE.getWorkReqFulfType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl <em>Work Requirement Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl
		 * @see org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl#getWorkRequirementFulfillment()
		 * @generated
		 */
		EClass WORK_REQUIREMENT_FULFILLMENT = eINSTANCE.getWorkRequirementFulfillment();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID = eINSTANCE.getWorkRequirementFulfillment_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID = eINSTANCE.getWorkRequirementFulfillment_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Work Req Fulf Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID = eINSTANCE.getWorkRequirementFulfillment_WorkReqFulfTypeId();

	}

} //RequirementPackage
