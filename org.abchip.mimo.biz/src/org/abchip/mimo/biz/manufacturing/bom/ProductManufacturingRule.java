/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.bom;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Manufacturing Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdFor <em>Product Id For</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdIn <em>Product Id In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdInSubst <em>Product Id In Subst</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleSeqId <em>Rule Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductManufacturingRule extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' attribute.
	 * @see #setRuleId(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_RuleId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleId <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' attribute.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' attribute.
	 * @see #setProductFeature(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ProductFeature()
	 * @model annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductFeature <em>Product Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' attribute.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id For</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id For</em>' attribute.
	 * @see #setProductIdFor(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ProductIdFor()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductIdFor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdFor <em>Product Id For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id For</em>' attribute.
	 * @see #getProductIdFor()
	 * @generated
	 */
	void setProductIdFor(String value);

	/**
	 * Returns the value of the '<em><b>Product Id In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id In</em>' attribute.
	 * @see #setProductIdIn(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ProductIdIn()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductIdIn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdIn <em>Product Id In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id In</em>' attribute.
	 * @see #getProductIdIn()
	 * @generated
	 */
	void setProductIdIn(String value);

	/**
	 * Returns the value of the '<em><b>Product Id In Subst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id In Subst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id In Subst</em>' attribute.
	 * @see #setProductIdInSubst(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ProductIdInSubst()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductIdInSubst();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getProductIdInSubst <em>Product Id In Subst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id In Subst</em>' attribute.
	 * @see #getProductIdInSubst()
	 * @generated
	 */
	void setProductIdInSubst(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(double)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_Quantity()
	 * @model
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Rule Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Operator</em>' attribute.
	 * @see #setRuleOperator(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_RuleOperator()
	 * @model
	 * @generated
	 */
	String getRuleOperator();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleOperator <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Operator</em>' attribute.
	 * @see #getRuleOperator()
	 * @generated
	 */
	void setRuleOperator(String value);

	/**
	 * Returns the value of the '<em><b>Rule Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Seq Id</em>' attribute.
	 * @see #setRuleSeqId(String)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_RuleSeqId()
	 * @model
	 * @generated
	 */
	String getRuleSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getRuleSeqId <em>Rule Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Seq Id</em>' attribute.
	 * @see #getRuleSeqId()
	 * @generated
	 */
	void setRuleSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.manufacturing.bom.BomPackage#getProductManufacturingRule_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductManufacturingRule
