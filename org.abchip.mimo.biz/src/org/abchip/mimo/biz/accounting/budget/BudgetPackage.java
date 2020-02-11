/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

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
 * @see org.abchip.mimo.biz.accounting.budget.BudgetFactory
 * @model kind="package"
 * @generated
 */
public interface BudgetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "budget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/budget";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-budget";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BudgetPackage eINSTANCE = org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl <em>Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudget()
	 * @generated
	 */
	int BUDGET = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_ITEMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_REVISIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Budget Statuss</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_STATUSS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Budget Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Custom Time Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__CUSTOM_TIME_PERIOD_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetAttribute()
	 * @generated
	 */
	int BUDGET_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItem()
	 * @generated
	 */
	int BUDGET_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__BUDGET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__BUDGET_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__JUSTIFICATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM__PURPOSE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemAttribute()
	 * @generated
	 */
	int BUDGET_ITEM_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemType()
	 * @generated
	 */
	int BUDGET_ITEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemTypeAttr()
	 * @generated
	 */
	int BUDGET_ITEM_TYPE_ATTR = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__BUDGET_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ITEM_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetReview()
	 * @generated
	 */
	int BUDGET_REVIEW = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget Review Result Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__BUDGET_REVIEW_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW__REVIEW_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewResultTypeImpl <em>Review Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewResultTypeImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetReviewResultType()
	 * @generated
	 */
	int BUDGET_REVIEW_RESULT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Review Result Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__BUDGET_REVIEW_RESULT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Review Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVIEW_RESULT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRevision()
	 * @generated
	 */
	int BUDGET_REVISION = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__REVISION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Revised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION__DATE_REVISED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl <em>Revision Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRevisionImpact()
	 * @generated
	 */
	int BUDGET_REVISION_IMPACT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__REVISION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Add Delete Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Revised Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__REVISED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Revision Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT__REVISION_REASON = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Revision Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_REVISION_IMPACT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRoleImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRole()
	 * @generated
	 */
	int BUDGET_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenario()
	 * @generated
	 */
	int BUDGET_SCENARIO = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__BUDGET_SCENARIO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Scenario Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__BUDGET_SCENARIO_RULES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl <em>Scenario Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenarioApplication()
	 * @generated
	 */
	int BUDGET_SCENARIO_APPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Scenario Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Scenario Applic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Percentage Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Scenario Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_APPLICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl <em>Scenario Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenarioRule()
	 * @generated
	 */
	int BUDGET_SCENARIO_RULE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Scenario Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__AMOUNT_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Percentage Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_SCENARIO_RULE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetStatus()
	 * @generated
	 */
	int BUDGET_STATUS = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetType()
	 * @generated
	 */
	int BUDGET_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__BUDGET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__BUDGET_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetTypeAttr()
	 * @generated
	 */
	int BUDGET_TYPE_ATTR = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__BUDGET_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.Budget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget
	 * @generated
	 */
	EClass getBudget();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetId()
	 * @see #getBudget()
	 * @generated
	 */
	EAttribute getBudget_BudgetId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetAttributes <em>Budget Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetAttributes()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_BudgetAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetItems <em>Budget Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Items</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetItems()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_BudgetItems();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetRevisions <em>Budget Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Revisions</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetRevisions()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_BudgetRevisions();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetStatuss <em>Budget Statuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Statuss</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetStatuss()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_BudgetStatuss();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetTypeId <em>Budget Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getBudgetTypeId()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_BudgetTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.Budget#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getComments()
	 * @see #getBudget()
	 * @generated
	 */
	EAttribute getBudget_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.Budget#getCustomTimePeriodId <em>Custom Time Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.Budget#getCustomTimePeriodId()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_CustomTimePeriodId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetAttribute
	 * @generated
	 */
	EClass getBudgetAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getBudgetId()
	 * @see #getBudgetAttribute()
	 * @generated
	 */
	EReference getBudgetAttribute_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrName()
	 * @see #getBudgetAttribute()
	 * @generated
	 */
	EAttribute getBudgetAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrDescription()
	 * @see #getBudgetAttribute()
	 * @generated
	 */
	EAttribute getBudgetAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetAttribute#getAttrValue()
	 * @see #getBudgetAttribute()
	 * @generated
	 */
	EAttribute getBudgetAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem
	 * @generated
	 */
	EClass getBudgetItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetId()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EReference getBudgetItem_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetItemSeqId()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EAttribute getBudgetItem_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getAmount()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EAttribute getBudgetItem_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetItemTypeId <em>Budget Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getBudgetItemTypeId()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EReference getBudgetItem_BudgetItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getJustification()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EAttribute getBudgetItem_Justification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItem#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItem#getPurpose()
	 * @see #getBudgetItem()
	 * @generated
	 */
	EAttribute getBudgetItem_Purpose();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute
	 * @generated
	 */
	EClass getBudgetItemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getBudgetId()
	 * @see #getBudgetItemAttribute()
	 * @generated
	 */
	EAttribute getBudgetItemAttribute_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getBudgetItemSeqId()
	 * @see #getBudgetItemAttribute()
	 * @generated
	 */
	EAttribute getBudgetItemAttribute_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrName()
	 * @see #getBudgetItemAttribute()
	 * @generated
	 */
	EAttribute getBudgetItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrDescription()
	 * @see #getBudgetItemAttribute()
	 * @generated
	 */
	EAttribute getBudgetItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemAttribute#getAttrValue()
	 * @see #getBudgetItemAttribute()
	 * @generated
	 */
	EAttribute getBudgetItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType
	 * @generated
	 */
	EClass getBudgetItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeId <em>Budget Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeId()
	 * @see #getBudgetItemType()
	 * @generated
	 */
	EAttribute getBudgetItemType_BudgetItemTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeAttrs <em>Budget Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeAttrs()
	 * @see #getBudgetItemType()
	 * @generated
	 */
	EReference getBudgetItemType_BudgetItemTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType#getDescription()
	 * @see #getBudgetItemType()
	 * @generated
	 */
	EAttribute getBudgetItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType#isHasTable()
	 * @see #getBudgetItemType()
	 * @generated
	 */
	EAttribute getBudgetItemType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemType#getParentTypeId()
	 * @see #getBudgetItemType()
	 * @generated
	 */
	EReference getBudgetItemType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr
	 * @generated
	 */
	EClass getBudgetItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getBudgetItemTypeId <em>Budget Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getBudgetItemTypeId()
	 * @see #getBudgetItemTypeAttr()
	 * @generated
	 */
	EReference getBudgetItemTypeAttr_BudgetItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getAttrName()
	 * @see #getBudgetItemTypeAttr()
	 * @generated
	 */
	EAttribute getBudgetItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetItemTypeAttr#getDescription()
	 * @see #getBudgetItemTypeAttr()
	 * @generated
	 */
	EAttribute getBudgetItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview
	 * @generated
	 */
	EClass getBudgetReview();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetId()
	 * @see #getBudgetReview()
	 * @generated
	 */
	EReference getBudgetReview_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewId <em>Budget Review Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Review Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewId()
	 * @see #getBudgetReview()
	 * @generated
	 */
	EAttribute getBudgetReview_BudgetReviewId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview#getPartyId()
	 * @see #getBudgetReview()
	 * @generated
	 */
	EReference getBudgetReview_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewResultTypeId <em>Budget Review Result Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Review Result Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewResultTypeId()
	 * @see #getBudgetReview()
	 * @generated
	 */
	EReference getBudgetReview_BudgetReviewResultTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReview#getReviewDate()
	 * @see #getBudgetReview()
	 * @generated
	 */
	EAttribute getBudgetReview_ReviewDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType <em>Review Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Result Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType
	 * @generated
	 */
	EClass getBudgetReviewResultType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getBudgetReviewResultTypeId <em>Budget Review Result Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Review Result Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getBudgetReviewResultTypeId()
	 * @see #getBudgetReviewResultType()
	 * @generated
	 */
	EAttribute getBudgetReviewResultType_BudgetReviewResultTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getComments()
	 * @see #getBudgetReviewResultType()
	 * @generated
	 */
	EAttribute getBudgetReviewResultType_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetReviewResultType#getDescription()
	 * @see #getBudgetReviewResultType()
	 * @generated
	 */
	EAttribute getBudgetReviewResultType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevision
	 * @generated
	 */
	EClass getBudgetRevision();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevision#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevision#getBudgetId()
	 * @see #getBudgetRevision()
	 * @generated
	 */
	EReference getBudgetRevision_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevision#getRevisionSeqId <em>Revision Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevision#getRevisionSeqId()
	 * @see #getBudgetRevision()
	 * @generated
	 */
	EAttribute getBudgetRevision_RevisionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevision#getDateRevised <em>Date Revised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Revised</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevision#getDateRevised()
	 * @see #getBudgetRevision()
	 * @generated
	 */
	EAttribute getBudgetRevision_DateRevised();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact <em>Revision Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision Impact</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact
	 * @generated
	 */
	EClass getBudgetRevisionImpact();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetId()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EReference getBudgetRevisionImpact_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetItemSeqId()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EAttribute getBudgetRevisionImpact_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionSeqId <em>Revision Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionSeqId()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EAttribute getBudgetRevisionImpact_RevisionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#isAddDeleteFlag <em>Add Delete Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Delete Flag</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#isAddDeleteFlag()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EAttribute getBudgetRevisionImpact_AddDeleteFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisedAmount <em>Revised Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revised Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisedAmount()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EAttribute getBudgetRevisionImpact_RevisedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionReason <em>Revision Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Reason</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionReason()
	 * @see #getBudgetRevisionImpact()
	 * @generated
	 */
	EAttribute getBudgetRevisionImpact_RevisionReason();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRole
	 * @generated
	 */
	EClass getBudgetRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetRole#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRole#getBudgetId()
	 * @see #getBudgetRole()
	 * @generated
	 */
	EReference getBudgetRole_BudgetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRole#getPartyId()
	 * @see #getBudgetRole()
	 * @generated
	 */
	EReference getBudgetRole_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetRole#getRoleTypeId()
	 * @see #getBudgetRole()
	 * @generated
	 */
	EAttribute getBudgetRole_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenario
	 * @generated
	 */
	EClass getBudgetScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioId <em>Budget Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Scenario Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioId()
	 * @see #getBudgetScenario()
	 * @generated
	 */
	EAttribute getBudgetScenario_BudgetScenarioId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioRules <em>Budget Scenario Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Scenario Rules</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioRules()
	 * @see #getBudgetScenario()
	 * @generated
	 */
	EReference getBudgetScenario_BudgetScenarioRules();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenario#getDescription()
	 * @see #getBudgetScenario()
	 * @generated
	 */
	EAttribute getBudgetScenario_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication <em>Scenario Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Application</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication
	 * @generated
	 */
	EClass getBudgetScenarioApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Scenario Applic Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EAttribute getBudgetScenarioApplication_BudgetScenarioApplicId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioId <em>Budget Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Scenario Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioId()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EReference getBudgetScenarioApplication_BudgetScenarioId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getAmountChange <em>Amount Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Change</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getAmountChange()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EAttribute getBudgetScenarioApplication_AmountChange();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetId()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EReference getBudgetScenarioApplication_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EAttribute getBudgetScenarioApplication_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getPercentageChange <em>Percentage Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Change</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getPercentageChange()
	 * @see #getBudgetScenarioApplication()
	 * @generated
	 */
	EAttribute getBudgetScenarioApplication_PercentageChange();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule <em>Scenario Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Rule</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule
	 * @generated
	 */
	EClass getBudgetScenarioRule();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetScenarioId <em>Budget Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Scenario Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetScenarioId()
	 * @see #getBudgetScenarioRule()
	 * @generated
	 */
	EReference getBudgetScenarioRule_BudgetScenarioId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetItemTypeId <em>Budget Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetItemTypeId()
	 * @see #getBudgetScenarioRule()
	 * @generated
	 */
	EReference getBudgetScenarioRule_BudgetItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getAmountChange <em>Amount Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Change</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getAmountChange()
	 * @see #getBudgetScenarioRule()
	 * @generated
	 */
	EAttribute getBudgetScenarioRule_AmountChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getPercentageChange <em>Percentage Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Change</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getPercentageChange()
	 * @see #getBudgetScenarioRule()
	 * @generated
	 */
	EAttribute getBudgetScenarioRule_PercentageChange();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus
	 * @generated
	 */
	EClass getBudgetStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus#getBudgetId()
	 * @see #getBudgetStatus()
	 * @generated
	 */
	EReference getBudgetStatus_BudgetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus#getStatusId()
	 * @see #getBudgetStatus()
	 * @generated
	 */
	EReference getBudgetStatus_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus#getChangeByUserLoginId()
	 * @see #getBudgetStatus()
	 * @generated
	 */
	EReference getBudgetStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus#getComments()
	 * @see #getBudgetStatus()
	 * @generated
	 */
	EAttribute getBudgetStatus_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetStatus#getStatusDate()
	 * @see #getBudgetStatus()
	 * @generated
	 */
	EAttribute getBudgetStatus_StatusDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType
	 * @generated
	 */
	EClass getBudgetType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeId <em>Budget Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeId()
	 * @see #getBudgetType()
	 * @generated
	 */
	EAttribute getBudgetType_BudgetTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeAttrs <em>Budget Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Budget Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeAttrs()
	 * @see #getBudgetType()
	 * @generated
	 */
	EReference getBudgetType_BudgetTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType#getDescription()
	 * @see #getBudgetType()
	 * @generated
	 */
	EAttribute getBudgetType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType#isHasTable()
	 * @see #getBudgetType()
	 * @generated
	 */
	EAttribute getBudgetType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetType#getParentTypeId()
	 * @see #getBudgetType()
	 * @generated
	 */
	EReference getBudgetType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr
	 * @generated
	 */
	EClass getBudgetTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getBudgetTypeId <em>Budget Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getBudgetTypeId()
	 * @see #getBudgetTypeAttr()
	 * @generated
	 */
	EReference getBudgetTypeAttr_BudgetTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getAttrName()
	 * @see #getBudgetTypeAttr()
	 * @generated
	 */
	EAttribute getBudgetTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr#getDescription()
	 * @see #getBudgetTypeAttr()
	 * @generated
	 */
	EAttribute getBudgetTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BudgetFactory getBudgetFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl <em>Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudget()
		 * @generated
		 */
		EClass BUDGET = eINSTANCE.getBudget();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET__BUDGET_ID = eINSTANCE.getBudget_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGET_ATTRIBUTES = eINSTANCE.getBudget_BudgetAttributes();

		/**
		 * The meta object literal for the '<em><b>Budget Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGET_ITEMS = eINSTANCE.getBudget_BudgetItems();

		/**
		 * The meta object literal for the '<em><b>Budget Revisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGET_REVISIONS = eINSTANCE.getBudget_BudgetRevisions();

		/**
		 * The meta object literal for the '<em><b>Budget Statuss</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGET_STATUSS = eINSTANCE.getBudget_BudgetStatuss();

		/**
		 * The meta object literal for the '<em><b>Budget Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGET_TYPE_ID = eINSTANCE.getBudget_BudgetTypeId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET__COMMENTS = eINSTANCE.getBudget_Comments();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__CUSTOM_TIME_PERIOD_ID = eINSTANCE.getBudget_CustomTimePeriodId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetAttribute()
		 * @generated
		 */
		EClass BUDGET_ATTRIBUTE = eINSTANCE.getBudgetAttribute();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ATTRIBUTE__BUDGET_ID = eINSTANCE.getBudgetAttribute_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ATTRIBUTE__ATTR_NAME = eINSTANCE.getBudgetAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getBudgetAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getBudgetAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItem()
		 * @generated
		 */
		EClass BUDGET_ITEM = eINSTANCE.getBudgetItem();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ITEM__BUDGET_ID = eINSTANCE.getBudgetItem_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM__BUDGET_ITEM_SEQ_ID = eINSTANCE.getBudgetItem_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM__AMOUNT = eINSTANCE.getBudgetItem_Amount();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ITEM__BUDGET_ITEM_TYPE_ID = eINSTANCE.getBudgetItem_BudgetItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM__JUSTIFICATION = eINSTANCE.getBudgetItem_Justification();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM__PURPOSE = eINSTANCE.getBudgetItem_Purpose();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemAttribute()
		 * @generated
		 */
		EClass BUDGET_ITEM_ATTRIBUTE = eINSTANCE.getBudgetItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_ATTRIBUTE__BUDGET_ID = eINSTANCE.getBudgetItemAttribute_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_ATTRIBUTE__BUDGET_ITEM_SEQ_ID = eINSTANCE.getBudgetItemAttribute_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getBudgetItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getBudgetItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getBudgetItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemType()
		 * @generated
		 */
		EClass BUDGET_ITEM_TYPE = eINSTANCE.getBudgetItemType();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID = eINSTANCE.getBudgetItemType_BudgetItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS = eINSTANCE.getBudgetItemType_BudgetItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_TYPE__DESCRIPTION = eINSTANCE.getBudgetItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_TYPE__HAS_TABLE = eINSTANCE.getBudgetItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ITEM_TYPE__PARENT_TYPE_ID = eINSTANCE.getBudgetItemType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetItemTypeAttr()
		 * @generated
		 */
		EClass BUDGET_ITEM_TYPE_ATTR = eINSTANCE.getBudgetItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ITEM_TYPE_ATTR__BUDGET_ITEM_TYPE_ID = eINSTANCE.getBudgetItemTypeAttr_BudgetItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getBudgetItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getBudgetItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetReview()
		 * @generated
		 */
		EClass BUDGET_REVIEW = eINSTANCE.getBudgetReview();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_REVIEW__BUDGET_ID = eINSTANCE.getBudgetReview_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Review Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVIEW__BUDGET_REVIEW_ID = eINSTANCE.getBudgetReview_BudgetReviewId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_REVIEW__PARTY_ID = eINSTANCE.getBudgetReview_PartyId();

		/**
		 * The meta object literal for the '<em><b>Budget Review Result Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID = eINSTANCE.getBudgetReview_BudgetReviewResultTypeId();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVIEW__REVIEW_DATE = eINSTANCE.getBudgetReview_ReviewDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewResultTypeImpl <em>Review Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewResultTypeImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetReviewResultType()
		 * @generated
		 */
		EClass BUDGET_REVIEW_RESULT_TYPE = eINSTANCE.getBudgetReviewResultType();

		/**
		 * The meta object literal for the '<em><b>Budget Review Result Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVIEW_RESULT_TYPE__BUDGET_REVIEW_RESULT_TYPE_ID = eINSTANCE.getBudgetReviewResultType_BudgetReviewResultTypeId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVIEW_RESULT_TYPE__COMMENTS = eINSTANCE.getBudgetReviewResultType_Comments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVIEW_RESULT_TYPE__DESCRIPTION = eINSTANCE.getBudgetReviewResultType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRevision()
		 * @generated
		 */
		EClass BUDGET_REVISION = eINSTANCE.getBudgetRevision();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_REVISION__BUDGET_ID = eINSTANCE.getBudgetRevision_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Revision Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION__REVISION_SEQ_ID = eINSTANCE.getBudgetRevision_RevisionSeqId();

		/**
		 * The meta object literal for the '<em><b>Date Revised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION__DATE_REVISED = eINSTANCE.getBudgetRevision_DateRevised();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl <em>Revision Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRevisionImpact()
		 * @generated
		 */
		EClass BUDGET_REVISION_IMPACT = eINSTANCE.getBudgetRevisionImpact();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_REVISION_IMPACT__BUDGET_ID = eINSTANCE.getBudgetRevisionImpact_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID = eINSTANCE.getBudgetRevisionImpact_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Revision Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION_IMPACT__REVISION_SEQ_ID = eINSTANCE.getBudgetRevisionImpact_RevisionSeqId();

		/**
		 * The meta object literal for the '<em><b>Add Delete Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG = eINSTANCE.getBudgetRevisionImpact_AddDeleteFlag();

		/**
		 * The meta object literal for the '<em><b>Revised Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION_IMPACT__REVISED_AMOUNT = eINSTANCE.getBudgetRevisionImpact_RevisedAmount();

		/**
		 * The meta object literal for the '<em><b>Revision Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_REVISION_IMPACT__REVISION_REASON = eINSTANCE.getBudgetRevisionImpact_RevisionReason();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetRoleImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetRole()
		 * @generated
		 */
		EClass BUDGET_ROLE = eINSTANCE.getBudgetRole();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ROLE__BUDGET_ID = eINSTANCE.getBudgetRole_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_ROLE__PARTY_ID = eINSTANCE.getBudgetRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_ROLE__ROLE_TYPE_ID = eINSTANCE.getBudgetRole_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenario()
		 * @generated
		 */
		EClass BUDGET_SCENARIO = eINSTANCE.getBudgetScenario();

		/**
		 * The meta object literal for the '<em><b>Budget Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO__BUDGET_SCENARIO_ID = eINSTANCE.getBudgetScenario_BudgetScenarioId();

		/**
		 * The meta object literal for the '<em><b>Budget Scenario Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_SCENARIO__BUDGET_SCENARIO_RULES = eINSTANCE.getBudgetScenario_BudgetScenarioRules();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO__DESCRIPTION = eINSTANCE.getBudgetScenario_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl <em>Scenario Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenarioApplication()
		 * @generated
		 */
		EClass BUDGET_SCENARIO_APPLICATION = eINSTANCE.getBudgetScenarioApplication();

		/**
		 * The meta object literal for the '<em><b>Budget Scenario Applic Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID = eINSTANCE.getBudgetScenarioApplication_BudgetScenarioApplicId();

		/**
		 * The meta object literal for the '<em><b>Budget Scenario Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID = eINSTANCE.getBudgetScenarioApplication_BudgetScenarioId();

		/**
		 * The meta object literal for the '<em><b>Amount Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE = eINSTANCE.getBudgetScenarioApplication_AmountChange();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_SCENARIO_APPLICATION__BUDGET_ID = eINSTANCE.getBudgetScenarioApplication_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getBudgetScenarioApplication_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Percentage Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE = eINSTANCE.getBudgetScenarioApplication_PercentageChange();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl <em>Scenario Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetScenarioRule()
		 * @generated
		 */
		EClass BUDGET_SCENARIO_RULE = eINSTANCE.getBudgetScenarioRule();

		/**
		 * The meta object literal for the '<em><b>Budget Scenario Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID = eINSTANCE.getBudgetScenarioRule_BudgetScenarioId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID = eINSTANCE.getBudgetScenarioRule_BudgetItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Amount Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_RULE__AMOUNT_CHANGE = eINSTANCE.getBudgetScenarioRule_AmountChange();

		/**
		 * The meta object literal for the '<em><b>Percentage Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE = eINSTANCE.getBudgetScenarioRule_PercentageChange();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetStatus()
		 * @generated
		 */
		EClass BUDGET_STATUS = eINSTANCE.getBudgetStatus();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_STATUS__BUDGET_ID = eINSTANCE.getBudgetStatus_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_STATUS__STATUS_ID = eINSTANCE.getBudgetStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getBudgetStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_STATUS__COMMENTS = eINSTANCE.getBudgetStatus_Comments();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_STATUS__STATUS_DATE = eINSTANCE.getBudgetStatus_StatusDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetType()
		 * @generated
		 */
		EClass BUDGET_TYPE = eINSTANCE.getBudgetType();

		/**
		 * The meta object literal for the '<em><b>Budget Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_TYPE__BUDGET_TYPE_ID = eINSTANCE.getBudgetType_BudgetTypeId();

		/**
		 * The meta object literal for the '<em><b>Budget Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_TYPE__BUDGET_TYPE_ATTRS = eINSTANCE.getBudgetType_BudgetTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_TYPE__DESCRIPTION = eINSTANCE.getBudgetType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_TYPE__HAS_TABLE = eINSTANCE.getBudgetType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_TYPE__PARENT_TYPE_ID = eINSTANCE.getBudgetType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl#getBudgetTypeAttr()
		 * @generated
		 */
		EClass BUDGET_TYPE_ATTR = eINSTANCE.getBudgetTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Budget Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_TYPE_ATTR__BUDGET_TYPE_ID = eINSTANCE.getBudgetTypeAttr_BudgetTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_TYPE_ATTR__ATTR_NAME = eINSTANCE.getBudgetTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_TYPE_ATTR__DESCRIPTION = eINSTANCE.getBudgetTypeAttr_Description();

	}

} //BudgetPackage
