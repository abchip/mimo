/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.bom;

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
 * @see org.abchip.mimo.biz.manufacturing.bom.BomFactory
 * @model kind="package"
 * @generated
 */
public interface BomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/manufacturing/bom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-bom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BomPackage eINSTANCE = org.abchip.mimo.biz.manufacturing.bom.impl.BomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl <em>Product Manufacturing Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl
	 * @see org.abchip.mimo.biz.manufacturing.bom.impl.BomPackageImpl#getProductManufacturingRule()
	 * @generated
	 */
	int PRODUCT_MANUFACTURING_RULE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Id For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Id In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Id In Subst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rule Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rule Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Product Manufacturing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANUFACTURING_RULE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule <em>Product Manufacturing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Manufacturing Rule</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule
	 * @generated
	 */
	EClass getProductManufacturingRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleId()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_RuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getDescription()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getFromDate()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductFeature()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EReference getProductManufacturingRule_ProductFeature();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductId()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EReference getProductManufacturingRule_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdFor <em>Product Id For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id For</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdFor()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EReference getProductManufacturingRule_ProductIdFor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdIn <em>Product Id In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id In</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdIn()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EReference getProductManufacturingRule_ProductIdIn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdInSubst <em>Product Id In Subst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id In Subst</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdInSubst()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EReference getProductManufacturingRule_ProductIdInSubst();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getQuantity()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleOperator <em>Rule Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Operator</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleOperator()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_RuleOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleSeqId <em>Rule Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Seq Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleSeqId()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_RuleSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getThruDate()
	 * @see #getProductManufacturingRule()
	 * @generated
	 */
	EAttribute getProductManufacturingRule_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BomFactory getBomFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl <em>Product Manufacturing Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl
		 * @see org.abchip.mimo.biz.manufacturing.bom.impl.BomPackageImpl#getProductManufacturingRule()
		 * @generated
		 */
		EClass PRODUCT_MANUFACTURING_RULE = eINSTANCE.getProductManufacturingRule();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__RULE_ID = eINSTANCE.getProductManufacturingRule_RuleId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__DESCRIPTION = eINSTANCE.getProductManufacturingRule_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__FROM_DATE = eINSTANCE.getProductManufacturingRule_FromDate();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE = eINSTANCE.getProductManufacturingRule_ProductFeature();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANUFACTURING_RULE__PRODUCT_ID = eINSTANCE.getProductManufacturingRule_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Id For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR = eINSTANCE.getProductManufacturingRule_ProductIdFor();

		/**
		 * The meta object literal for the '<em><b>Product Id In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN = eINSTANCE.getProductManufacturingRule_ProductIdIn();

		/**
		 * The meta object literal for the '<em><b>Product Id In Subst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST = eINSTANCE.getProductManufacturingRule_ProductIdInSubst();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__QUANTITY = eINSTANCE.getProductManufacturingRule_Quantity();

		/**
		 * The meta object literal for the '<em><b>Rule Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR = eINSTANCE.getProductManufacturingRule_RuleOperator();

		/**
		 * The meta object literal for the '<em><b>Rule Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID = eINSTANCE.getProductManufacturingRule_RuleSeqId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MANUFACTURING_RULE__THRU_DATE = eINSTANCE.getProductManufacturingRule_ThruDate();

	}

} //BomPackage
