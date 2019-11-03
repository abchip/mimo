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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getProductFeature() <em>Product Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeature() <em>Product Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeature()
	 * @generated
	 * @ordered
	 */
	protected String productFeature = PRODUCT_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductIdFor() <em>Product Id For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdFor()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdFor() <em>Product Id For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdFor()
	 * @generated
	 * @ordered
	 */
	protected String productIdFor = PRODUCT_ID_FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductIdIn() <em>Product Id In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdIn()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdIn() <em>Product Id In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdIn()
	 * @generated
	 * @ordered
	 */
	protected String productIdIn = PRODUCT_ID_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductIdInSubst() <em>Product Id In Subst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdInSubst()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_IN_SUBST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdInSubst() <em>Product Id In Subst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdInSubst()
	 * @generated
	 * @ordered
	 */
	protected String productIdInSubst = PRODUCT_ID_IN_SUBST_EDEFAULT;

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
		String oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_ID, oldRuleId, ruleId));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__DESCRIPTION, oldDescription, description));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeature() {
		return productFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(String newProductFeature) {
		String oldProductFeature = productFeature;
		productFeature = newProductFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE, oldProductFeature, productFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductIdFor() {
		return productIdFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdFor(String newProductIdFor) {
		String oldProductIdFor = productIdFor;
		productIdFor = newProductIdFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR, oldProductIdFor, productIdFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductIdIn() {
		return productIdIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdIn(String newProductIdIn) {
		String oldProductIdIn = productIdIn;
		productIdIn = newProductIdIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN, oldProductIdIn, productIdIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductIdInSubst() {
		return productIdInSubst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdInSubst(String newProductIdInSubst) {
		String oldProductIdInSubst = productIdInSubst;
		productIdInSubst = newProductIdInSubst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST, oldProductIdInSubst, productIdInSubst));
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
		double oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY, oldQuantity, quantity));
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
		String oldRuleOperator = ruleOperator;
		ruleOperator = newRuleOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR, oldRuleOperator, ruleOperator));
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
		String oldRuleSeqId = ruleSeqId;
		ruleSeqId = newRuleSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID, oldRuleSeqId, ruleSeqId));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE, oldThruDate, thruDate));
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
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				return getProductFeature();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				return getProductId();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				return getProductIdFor();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				return getProductIdIn();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				return getProductIdInSubst();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				return getQuantity();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				return getRuleOperator();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				return getRuleSeqId();
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				return getThruDate();
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
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				setProductFeature((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				setProductIdFor((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				setProductIdIn((String)newValue);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				setProductIdInSubst((String)newValue);
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
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				setProductFeature(PRODUCT_FEATURE_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				setProductIdFor(PRODUCT_ID_FOR_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				setProductIdIn(PRODUCT_ID_IN_EDEFAULT);
				return;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				setProductIdInSubst(PRODUCT_ID_IN_SUBST_EDEFAULT);
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
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE:
				return PRODUCT_FEATURE_EDEFAULT == null ? productFeature != null : !PRODUCT_FEATURE_EDEFAULT.equals(productFeature);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR:
				return PRODUCT_ID_FOR_EDEFAULT == null ? productIdFor != null : !PRODUCT_ID_FOR_EDEFAULT.equals(productIdFor);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN:
				return PRODUCT_ID_IN_EDEFAULT == null ? productIdIn != null : !PRODUCT_ID_IN_EDEFAULT.equals(productIdIn);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST:
				return PRODUCT_ID_IN_SUBST_EDEFAULT == null ? productIdInSubst != null : !PRODUCT_ID_IN_SUBST_EDEFAULT.equals(productIdInSubst);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR:
				return RULE_OPERATOR_EDEFAULT == null ? ruleOperator != null : !RULE_OPERATOR_EDEFAULT.equals(ruleOperator);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID:
				return RULE_SEQ_ID_EDEFAULT == null ? ruleSeqId != null : !RULE_SEQ_ID_EDEFAULT.equals(ruleSeqId);
			case BomPackage.PRODUCT_MANUFACTURING_RULE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", productFeature: ");
		result.append(productFeature);
		result.append(", productId: ");
		result.append(productId);
		result.append(", productIdFor: ");
		result.append(productIdFor);
		result.append(", productIdIn: ");
		result.append(productIdIn);
		result.append(", productIdInSubst: ");
		result.append(productIdInSubst);
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
