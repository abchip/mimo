/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.promo.ProductPromoUse;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getPromoSequenceId <em>Promo Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getQuantityLeftInActions <em>Quantity Left In Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getTotalDiscountAmount <em>Total Discount Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoUseImpl extends BizEntityImpl implements ProductPromoUse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromoSequenceId() <em>Promo Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoSequenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMO_SEQUENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromoSequenceId() <em>Promo Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoSequenceId()
	 * @generated
	 * @ordered
	 */
	protected String promoSequenceId = PROMO_SEQUENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoCodeId = PRODUCT_PROMO_CODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityLeftInActions() <em>Quantity Left In Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityLeftInActions()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_LEFT_IN_ACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityLeftInActions() <em>Quantity Left In Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityLeftInActions()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityLeftInActions = QUANTITY_LEFT_IN_ACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDiscountAmount() <em>Total Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDiscountAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_DISCOUNT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalDiscountAmount() <em>Total Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDiscountAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalDiscountAmount = TOTAL_DISCOUNT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromoSequenceId() {
		return promoSequenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromoSequenceId(String newPromoSequenceId) {
		String oldPromoSequenceId = promoSequenceId;
		promoSequenceId = newPromoSequenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID, oldPromoSequenceId, promoSequenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityLeftInActions() {
		return quantityLeftInActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityLeftInActions(BigDecimal newQuantityLeftInActions) {
		BigDecimal oldQuantityLeftInActions = quantityLeftInActions;
		quantityLeftInActions = newQuantityLeftInActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS, oldQuantityLeftInActions, quantityLeftInActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalDiscountAmount() {
		return totalDiscountAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalDiscountAmount(BigDecimal newTotalDiscountAmount) {
		BigDecimal oldTotalDiscountAmount = totalDiscountAmount;
		totalDiscountAmount = newTotalDiscountAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT, oldTotalDiscountAmount, totalDiscountAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoCodeId() {
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCodeId(String newProductPromoCodeId) {
		String oldProductPromoCodeId = productPromoCodeId;
		productPromoCodeId = newProductPromoCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID, oldProductPromoCodeId, productPromoCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				return getOrderId();
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				return getPromoSequenceId();
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				return getPartyId();
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				return getProductPromoCodeId();
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				return getQuantityLeftInActions();
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				return getTotalDiscountAmount();
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
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				setPromoSequenceId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				setQuantityLeftInActions((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				setTotalDiscountAmount((BigDecimal)newValue);
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
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				setPromoSequenceId(PROMO_SEQUENCE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId(PRODUCT_PROMO_CODE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				setQuantityLeftInActions(QUANTITY_LEFT_IN_ACTIONS_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				setTotalDiscountAmount(TOTAL_DISCOUNT_AMOUNT_EDEFAULT);
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
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				return PROMO_SEQUENCE_ID_EDEFAULT == null ? promoSequenceId != null : !PROMO_SEQUENCE_ID_EDEFAULT.equals(promoSequenceId);
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				return PRODUCT_PROMO_CODE_ID_EDEFAULT == null ? productPromoCodeId != null : !PRODUCT_PROMO_CODE_ID_EDEFAULT.equals(productPromoCodeId);
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				return QUANTITY_LEFT_IN_ACTIONS_EDEFAULT == null ? quantityLeftInActions != null : !QUANTITY_LEFT_IN_ACTIONS_EDEFAULT.equals(quantityLeftInActions);
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				return TOTAL_DISCOUNT_AMOUNT_EDEFAULT == null ? totalDiscountAmount != null : !TOTAL_DISCOUNT_AMOUNT_EDEFAULT.equals(totalDiscountAmount);
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", promoSequenceId: ");
		result.append(promoSequenceId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", productPromoCodeId: ");
		result.append(productPromoCodeId);
		result.append(", productPromoId: ");
		result.append(productPromoId);
		result.append(", quantityLeftInActions: ");
		result.append(quantityLeftInActions);
		result.append(", totalDiscountAmount: ");
		result.append(totalDiscountAmount);
		result.append(')');
		return result.toString();
	}

} //ProductPromoUseImpl
