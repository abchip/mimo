/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.bom.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.bom.BomPackage;
import org.abchip.mimo.biz.manufacturing.bom.ProductManufacturingRule;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Manufacturing Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdFor <em>Product Id For</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdIn <em>Product Id In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdInSubst <em>Product Id In Subst</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleSeqId <em>Rule Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductManufacturingRuleImpl extends BizEntityImpl implements ProductManufacturingRule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductManufacturingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomPackage.Literals.PRODUCT_MANUFACTURING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleId() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleId(String newRuleId) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_ID, newRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeature() {
		return (ProductFeature)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(ProductFeature newProductFeature) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE, newProductFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdFor() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdFor(Product newProductIdFor) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR, newProductIdFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdIn() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdIn(Product newProductIdIn) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN, newProductIdIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdInSubst() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdInSubst(Product newProductIdInSubst) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST, newProductIdInSubst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getQuantity() {
		return (Double)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(double newQuantity) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleOperator() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleOperator(String newRuleOperator) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR, newRuleOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleSeqId() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleSeqId(String newRuleSeqId) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID, newRuleSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__THRU_DATE, newThruDate);
	}

} //ProductManufacturingRuleImpl
