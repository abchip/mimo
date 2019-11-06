/**
 * Copyright (c) 2017, 2019 ABChip and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleSeqId <em>Rule Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdFor <em>Product Id For</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdIn <em>Product Id In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdInSubst <em>Product Id In Subst</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductFeature <em>Product Feature</em>}</li>
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
	 * The default value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected String ruleId = RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected double quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected String ruleOperator = RULE_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleSeqId() <em>Rule Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleSeqId() <em>Rule Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSeqId()
	 * @generated
	 * @ordered
	 */
	protected String ruleSeqId = RULE_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getProductIdFor() <em>Product Id For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdFor()
	 * @generated
	 * @ordered
	 */
	protected Product productIdFor;

	/**
	 * The cached value of the '{@link #getProductIdIn() <em>Product Id In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdIn()
	 * @generated
	 * @ordered
	 */
	protected Product productIdIn;

	/**
	 * The cached value of the '{@link #getProductIdInSubst() <em>Product Id In Subst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdInSubst()
	 * @generated
	 * @ordered
	 */
	protected Product productIdInSubst;

	/**
	 * The cached value of the '{@link #getProductFeature() <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeature()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeature;

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
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleId(String newRuleId) {
		ruleId = newRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeature() {
		if (productFeature != null && ((EObject)productFeature).eIsProxy()) {
			InternalEObject oldProductFeature = (InternalEObject)productFeature;
			productFeature = (ProductFeature)eResolveProxy(oldProductFeature);
			if (productFeature != oldProductFeature) {
			}
		}
		return productFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeature() {
		return productFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(ProductFeature newProductFeature) {
		productFeature = newProductFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdFor() {
		if (productIdFor != null && ((EObject)productIdFor).eIsProxy()) {
			InternalEObject oldProductIdFor = (InternalEObject)productIdFor;
			productIdFor = (Product)eResolveProxy(oldProductIdFor);
			if (productIdFor != oldProductIdFor) {
			}
		}
		return productIdFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductIdFor() {
		return productIdFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdFor(Product newProductIdFor) {
		productIdFor = newProductIdFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdIn() {
		if (productIdIn != null && ((EObject)productIdIn).eIsProxy()) {
			InternalEObject oldProductIdIn = (InternalEObject)productIdIn;
			productIdIn = (Product)eResolveProxy(oldProductIdIn);
			if (productIdIn != oldProductIdIn) {
			}
		}
		return productIdIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductIdIn() {
		return productIdIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdIn(Product newProductIdIn) {
		productIdIn = newProductIdIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdInSubst() {
		if (productIdInSubst != null && ((EObject)productIdInSubst).eIsProxy()) {
			InternalEObject oldProductIdInSubst = (InternalEObject)productIdInSubst;
			productIdInSubst = (Product)eResolveProxy(oldProductIdInSubst);
			if (productIdInSubst != oldProductIdInSubst) {
			}
		}
		return productIdInSubst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductIdInSubst() {
		return productIdInSubst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdInSubst(Product newProductIdInSubst) {
		productIdInSubst = newProductIdInSubst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(double newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleOperator() {
		return ruleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleOperator(String newRuleOperator) {
		ruleOperator = newRuleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleSeqId() {
		return ruleSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleSeqId(String newRuleSeqId) {
		ruleSeqId = newRuleSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_ID:
				return getRuleId();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__DESCRIPTION:
				return getDescription();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__FROM_DATE:
				return getFromDate();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				return getQuantity();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				return getRuleOperator();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				return getRuleSeqId();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				return getThruDate();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				if (resolve) return getProductIdFor();
				return basicGetProductIdFor();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				if (resolve) return getProductIdIn();
				return basicGetProductIdIn();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				if (resolve) return getProductIdInSubst();
				return basicGetProductIdInSubst();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				if (resolve) return getProductFeature();
				return basicGetProductFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_ID:
				setRuleId((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				setQuantity((Double)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				setRuleOperator((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				setRuleSeqId((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				setProductIdFor((Product)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				setProductIdIn((Product)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				setProductIdInSubst((Product)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				setProductFeature((ProductFeature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_ID:
				setRuleId(RULE_ID_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				setRuleOperator(RULE_OPERATOR_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				setRuleSeqId(RULE_SEQ_ID_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				setProductIdFor((Product)null);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				setProductIdIn((Product)null);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				setProductIdInSubst((Product)null);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				setProductFeature((ProductFeature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_ID:
				return RULE_ID_EDEFAULT == null ? ruleId != null : !RULE_ID_EDEFAULT.equals(ruleId);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				return RULE_OPERATOR_EDEFAULT == null ? ruleOperator != null : !RULE_OPERATOR_EDEFAULT.equals(ruleOperator);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				return RULE_SEQ_ID_EDEFAULT == null ? ruleSeqId != null : !RULE_SEQ_ID_EDEFAULT.equals(ruleSeqId);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				return productId != null;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				return productIdFor != null;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				return productIdIn != null;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				return productIdInSubst != null;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				return productFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ruleId: ");
		result.append(ruleId);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", ruleOperator: ");
		result.append(ruleOperator);
		result.append(", ruleSeqId: ");
		result.append(ruleSeqId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductManufacturingRuleImpl
