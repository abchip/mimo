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
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.ProductPromoCode;
import org.abchip.mimo.biz.product.promo.ProductPromoUse;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getPromoSequenceId <em>Promo Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getQuantityLeftInActions <em>Quantity Left In Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getTotalDiscountAmount <em>Total Discount Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoUseImpl#getPartyId <em>Party Id</em>}</li>
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
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

	/**
	 * The cached value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromoCode productPromoCodeId;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

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
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_USE__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_USE__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
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
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		ProductPromo oldProductPromoId = productPromoId;
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
	public ProductPromoCode getProductPromoCodeId() {
		if (productPromoCodeId != null && ((EObject)productPromoCodeId).eIsProxy()) {
			InternalEObject oldProductPromoCodeId = (InternalEObject)productPromoCodeId;
			productPromoCodeId = (ProductPromoCode)eResolveProxy(oldProductPromoCodeId);
			if (productPromoCodeId != oldProductPromoCodeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID, oldProductPromoCodeId, productPromoCodeId));
			}
		}
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromoCode basicGetProductPromoCodeId() {
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCodeId(ProductPromoCode newProductPromoCodeId) {
		ProductPromoCode oldProductPromoCodeId = productPromoCodeId;
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
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				return getPromoSequenceId();
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				return getQuantityLeftInActions();
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				return getTotalDiscountAmount();
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				if (resolve) return getProductPromoCodeId();
				return basicGetProductPromoCodeId();
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				setPromoSequenceId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				setQuantityLeftInActions((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				setTotalDiscountAmount((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((ProductPromoCode)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				setPromoSequenceId(PROMO_SEQUENCE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				setQuantityLeftInActions(QUANTITY_LEFT_IN_ACTIONS_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				setTotalDiscountAmount(TOTAL_DISCOUNT_AMOUNT_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((ProductPromoCode)null);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				setPartyId((Party)null);
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
			case PromoPackage.PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID:
				return PROMO_SEQUENCE_ID_EDEFAULT == null ? promoSequenceId != null : !PROMO_SEQUENCE_ID_EDEFAULT.equals(promoSequenceId);
			case PromoPackage.PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS:
				return QUANTITY_LEFT_IN_ACTIONS_EDEFAULT == null ? quantityLeftInActions != null : !QUANTITY_LEFT_IN_ACTIONS_EDEFAULT.equals(quantityLeftInActions);
			case PromoPackage.PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT:
				return TOTAL_DISCOUNT_AMOUNT_EDEFAULT == null ? totalDiscountAmount != null : !TOTAL_DISCOUNT_AMOUNT_EDEFAULT.equals(totalDiscountAmount);
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_ID:
				return productPromoId != null;
			case PromoPackage.PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE_ID:
				return productPromoCodeId != null;
			case PromoPackage.PRODUCT_PROMO_USE__ORDER_ID:
				return orderId != null;
			case PromoPackage.PRODUCT_PROMO_USE__PARTY_ID:
				return partyId != null;
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
		result.append(" (promoSequenceId: ");
		result.append(promoSequenceId);
		result.append(", quantityLeftInActions: ");
		result.append(quantityLeftInActions);
		result.append(", totalDiscountAmount: ");
		result.append(totalDiscountAmount);
		result.append(')');
		return result.toString();
	}

} //ProductPromoUseImpl
