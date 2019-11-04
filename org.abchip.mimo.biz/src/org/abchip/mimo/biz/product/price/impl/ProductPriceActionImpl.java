/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceAction;
import org.abchip.mimo.biz.product.price.ProductPriceActionType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getRateCode <em>Rate Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceActionImpl extends BizEntityTypedImpl<ProductPriceActionType> implements ProductPriceAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceRuleId = PRODUCT_PRICE_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPriceActionSeqId() <em>Product Price Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceActionSeqId() <em>Product Price Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceActionSeqId = PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateCode() <em>Rate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateCode() <em>Rate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateCode()
	 * @generated
	 * @ordered
	 */
	protected String rateCode = RATE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductPriceActionTypeId() <em>Product Price Action Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceActionTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductPriceActionType productPriceActionTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_ACTION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceActionSeqId() {
		return productPriceActionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceActionSeqId(String newProductPriceActionSeqId) {
		String oldProductPriceActionSeqId = productPriceActionSeqId;
		productPriceActionSeqId = newProductPriceActionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID, oldProductPriceActionSeqId, productPriceActionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateCode() {
		return rateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateCode(String newRateCode) {
		String oldRateCode = rateCode;
		rateCode = newRateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_ACTION__RATE_CODE, oldRateCode, rateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceActionType getProductPriceActionTypeId() {
		if (productPriceActionTypeId != null && ((EObject)productPriceActionTypeId).eIsProxy()) {
			InternalEObject oldProductPriceActionTypeId = (InternalEObject)productPriceActionTypeId;
			productPriceActionTypeId = (ProductPriceActionType)eResolveProxy(oldProductPriceActionTypeId);
			if (productPriceActionTypeId != oldProductPriceActionTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID, oldProductPriceActionTypeId, productPriceActionTypeId));
			}
		}
		return productPriceActionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPriceActionType basicGetProductPriceActionTypeId() {
		return productPriceActionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceActionTypeId(ProductPriceActionType newProductPriceActionTypeId) {
		ProductPriceActionType oldProductPriceActionTypeId = productPriceActionTypeId;
		productPriceActionTypeId = newProductPriceActionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID, oldProductPriceActionTypeId, productPriceActionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceRuleId() {
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(String newProductPriceRuleId) {
		String oldProductPriceRuleId = productPriceRuleId;
		productPriceRuleId = newProductPriceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID:
				return getProductPriceRuleId();
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID:
				return getProductPriceActionSeqId();
			case PricePackage.PRODUCT_PRICE_ACTION__AMOUNT:
				return getAmount();
			case PricePackage.PRODUCT_PRICE_ACTION__RATE_CODE:
				return getRateCode();
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID:
				if (resolve) return getProductPriceActionTypeId();
				return basicGetProductPriceActionTypeId();
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
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID:
				setProductPriceActionSeqId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__RATE_CODE:
				setRateCode((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID:
				setProductPriceActionTypeId((ProductPriceActionType)newValue);
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
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId(PRODUCT_PRICE_RULE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID:
				setProductPriceActionSeqId(PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__RATE_CODE:
				setRateCode(RATE_CODE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID:
				setProductPriceActionTypeId((ProductPriceActionType)null);
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
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID:
				return PRODUCT_PRICE_RULE_ID_EDEFAULT == null ? productPriceRuleId != null : !PRODUCT_PRICE_RULE_ID_EDEFAULT.equals(productPriceRuleId);
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID:
				return PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT == null ? productPriceActionSeqId != null : !PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT.equals(productPriceActionSeqId);
			case PricePackage.PRODUCT_PRICE_ACTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PricePackage.PRODUCT_PRICE_ACTION__RATE_CODE:
				return RATE_CODE_EDEFAULT == null ? rateCode != null : !RATE_CODE_EDEFAULT.equals(rateCode);
			case PricePackage.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID:
				return productPriceActionTypeId != null;
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
		result.append(" (productPriceRuleId: ");
		result.append(productPriceRuleId);
		result.append(", productPriceActionSeqId: ");
		result.append(productPriceActionSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", rateCode: ");
		result.append(rateCode);
		result.append(')');
		return result.toString();
	}

} //ProductPriceActionImpl
