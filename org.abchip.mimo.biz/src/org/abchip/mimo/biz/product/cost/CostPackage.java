/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

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
 * @see org.abchip.mimo.biz.product.cost.CostFactory
 * @model kind="package"
 * @generated
 */
public interface CostPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cost";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/cost";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-cost";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CostPackage eINSTANCE = org.abchip.mimo.biz.product.cost.impl.CostPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponent()
	 * @generated
	 */
	int COST_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cost Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Component Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Component Calc Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_CALC_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentAttributeImpl <em>Component Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentAttributeImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentAttribute()
	 * @generated
	 */
	int COST_COMPONENT_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cost Component Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__COST_COMPONENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl <em>Component Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentCalc()
	 * @generated
	 */
	int COST_COMPONENT_CALC = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cost Component Calc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__FIXED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Offsetting Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Per Milli Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__PER_MILLI_SECOND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__VARIABLE_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Component Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentTypeImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentType()
	 * @generated
	 */
	int COST_COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Component Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentTypeAttrImpl <em>Component Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentTypeAttrImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentTypeAttr()
	 * @generated
	 */
	int COST_COMPONENT_TYPE_ATTR = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__COST_COMPONENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl <em>Product Cost Component Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl
	 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getProductCostComponentCalc()
	 * @generated
	 */
	int PRODUCT_COST_COMPONENT_CALC = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Component Calc Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Cost Component Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.CostComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent
	 * @generated
	 */
	EClass getCostComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_CostComponentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCost()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_Cost();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentAttributes <em>Cost Component Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Component Attributes</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentAttributes()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentCalcId <em>Cost Component Calc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Calc Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentCalcId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentCalcId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentTypeId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostUomId <em>Cost Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getCostUomId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getFixedAssetId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getFromDate()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getGeoId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_GeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getPartyId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getProductFeatureId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getProductId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getThruDate()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_ThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponent#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponent#getWorkEffortId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.CostComponentAttribute <em>Component Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Attribute</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentAttribute
	 * @generated
	 */
	EClass getCostComponentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentAttribute#getCostComponentId <em>Cost Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentAttribute#getCostComponentId()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EReference getCostComponentAttribute_CostComponentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrName()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrDescription()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentAttribute#getAttrValue()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc <em>Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Calc</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc
	 * @generated
	 */
	EClass getCostComponentCalc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Calc Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostComponentCalcId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_CostComponentCalcId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostCustomMethodId <em>Cost Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostCustomMethodId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CostCustomMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostGlAccountTypeId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CostGlAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getCurrencyUomId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getDescription()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Cost</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getFixedCost()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_FixedCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offsetting Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getOffsettingGlAccountTypeId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_OffsettingGlAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Milli Second</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getPerMilliSecond()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_PerMilliSecond();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Cost</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentCalc#getVariableCost()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_VariableCost();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.CostComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType
	 * @generated
	 */
	EClass getCostComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeId()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_CostComponentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeAttrs <em>Cost Component Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Component Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeAttrs()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EReference getCostComponentType_CostComponentTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType#getDescription()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType#isHasTable()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentType#getParentTypeId()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EReference getCostComponentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.CostComponentTypeAttr <em>Component Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Attr</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentTypeAttr
	 * @generated
	 */
	EClass getCostComponentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getCostComponentTypeId()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EReference getCostComponentTypeAttr_CostComponentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getAttrName()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EAttribute getCostComponentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.cost.CostComponentTypeAttr#getDescription()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EAttribute getCostComponentTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc <em>Product Cost Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Cost Component Calc</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc
	 * @generated
	 */
	EClass getProductCostComponentCalc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getProductId()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getCostComponentTypeId()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_CostComponentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getFromDate()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Calc Id</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getCostComponentCalcId()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_CostComponentCalcId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getSequenceNum()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.cost.ProductCostComponentCalc#getThruDate()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CostFactory getCostFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponent()
		 * @generated
		 */
		EClass COST_COMPONENT = eINSTANCE.getCostComponent();

		/**
		 * The meta object literal for the '<em><b>Cost Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__COST_COMPONENT_ID = eINSTANCE.getCostComponent_CostComponentId();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__COST = eINSTANCE.getCostComponent_Cost();

		/**
		 * The meta object literal for the '<em><b>Cost Component Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_ATTRIBUTES = eINSTANCE.getCostComponent_CostComponentAttributes();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_CALC_ID = eINSTANCE.getCostComponent_CostComponentCalcId();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_TYPE_ID = eINSTANCE.getCostComponent_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>Cost Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_UOM_ID = eINSTANCE.getCostComponent_CostUomId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__FIXED_ASSET_ID = eINSTANCE.getCostComponent_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__FROM_DATE = eINSTANCE.getCostComponent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__GEO_ID = eINSTANCE.getCostComponent_GeoId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PARTY_ID = eINSTANCE.getCostComponent_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PRODUCT_FEATURE_ID = eINSTANCE.getCostComponent_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PRODUCT_ID = eINSTANCE.getCostComponent_ProductId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__THRU_DATE = eINSTANCE.getCostComponent_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__WORK_EFFORT_ID = eINSTANCE.getCostComponent_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentAttributeImpl <em>Component Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentAttributeImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentAttribute()
		 * @generated
		 */
		EClass COST_COMPONENT_ATTRIBUTE = eINSTANCE.getCostComponentAttribute();

		/**
		 * The meta object literal for the '<em><b>Cost Component Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_ATTRIBUTE__COST_COMPONENT_ID = eINSTANCE.getCostComponentAttribute_CostComponentId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getCostComponentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getCostComponentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getCostComponentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl <em>Component Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentCalc()
		 * @generated
		 */
		EClass COST_COMPONENT_CALC = eINSTANCE.getCostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = eINSTANCE.getCostComponentCalc_CostComponentCalcId();

		/**
		 * The meta object literal for the '<em><b>Cost Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID = eINSTANCE.getCostComponentCalc_CostCustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Cost Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID = eINSTANCE.getCostComponentCalc_CostGlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__CURRENCY_UOM_ID = eINSTANCE.getCostComponentCalc_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__DESCRIPTION = eINSTANCE.getCostComponentCalc_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__FIXED_COST = eINSTANCE.getCostComponentCalc_FixedCost();

		/**
		 * The meta object literal for the '<em><b>Offsetting Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID = eINSTANCE.getCostComponentCalc_OffsettingGlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Per Milli Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__PER_MILLI_SECOND = eINSTANCE.getCostComponentCalc_PerMilliSecond();

		/**
		 * The meta object literal for the '<em><b>Variable Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__VARIABLE_COST = eINSTANCE.getCostComponentCalc_VariableCost();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentTypeImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentType()
		 * @generated
		 */
		EClass COST_COMPONENT_TYPE = eINSTANCE.getCostComponentType();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ID = eINSTANCE.getCostComponentType_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ATTRS = eINSTANCE.getCostComponentType_CostComponentTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__DESCRIPTION = eINSTANCE.getCostComponentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__HAS_TABLE = eINSTANCE.getCostComponentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getCostComponentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.CostComponentTypeAttrImpl <em>Component Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.CostComponentTypeAttrImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getCostComponentTypeAttr()
		 * @generated
		 */
		EClass COST_COMPONENT_TYPE_ATTR = eINSTANCE.getCostComponentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE_ATTR__COST_COMPONENT_TYPE_ID = eINSTANCE.getCostComponentTypeAttr_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getCostComponentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getCostComponentTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl <em>Product Cost Component Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl
		 * @see org.abchip.mimo.biz.product.cost.impl.CostPackageImpl#getProductCostComponentCalc()
		 * @generated
		 */
		EClass PRODUCT_COST_COMPONENT_CALC = eINSTANCE.getProductCostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID = eINSTANCE.getProductCostComponentCalc_ProductId();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID = eINSTANCE.getProductCostComponentCalc_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__FROM_DATE = eINSTANCE.getProductCostComponentCalc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = eINSTANCE.getProductCostComponentCalc_CostComponentCalcId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM = eINSTANCE.getProductCostComponentCalc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__THRU_DATE = eINSTANCE.getProductCostComponentCalc_ThruDate();

	}

} //CostPackage
