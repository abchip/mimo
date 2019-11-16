/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.product.price.ProductPriceRule;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Price Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getModifyAmount <em>Modify Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getRateCode <em>Rate Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemPriceInfoImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemPriceInfoImpl extends BizEntityImpl implements OrderItemPriceInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderItemPriceInfoId() <em>Order Item Price Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemPriceInfoId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_PRICE_INFO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemPriceInfoId() <em>Order Item Price Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemPriceInfoId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemPriceInfoId = ORDER_ITEM_PRICE_INFO_ID_EDEFAULT;

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
	 * The default value of the '{@link #getModifyAmount() <em>Modify Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODIFY_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifyAmount() <em>Modify Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modifyAmount = MODIFY_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected ProductPriceRule productPriceRuleId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemPriceInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_PRICE_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModifyAmount() {
		return modifyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifyAmount(BigDecimal newModifyAmount) {
		BigDecimal oldModifyAmount = modifyAmount;
		modifyAmount = newModifyAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT, oldModifyAmount, modifyAmount));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemPriceInfoId() {
		return orderItemPriceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemPriceInfoId(String newOrderItemPriceInfoId) {
		String oldOrderItemPriceInfoId = orderItemPriceInfoId;
		orderItemPriceInfoId = newOrderItemPriceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID, oldOrderItemPriceInfoId, orderItemPriceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID, oldProductPriceActionSeqId, productPriceActionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceRule getProductPriceRuleId() {
		if (productPriceRuleId != null && ((EObject)productPriceRuleId).eIsProxy()) {
			InternalEObject oldProductPriceRuleId = (InternalEObject)productPriceRuleId;
			productPriceRuleId = (ProductPriceRule)eResolveProxy(oldProductPriceRuleId);
			if (productPriceRuleId != oldProductPriceRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
			}
		}
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPriceRule basicGetProductPriceRuleId() {
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(ProductPriceRule newProductPriceRuleId) {
		ProductPriceRule oldProductPriceRuleId = productPriceRuleId;
		productPriceRuleId = newProductPriceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_PRICE_INFO__RATE_CODE, oldRateCode, rateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID:
				return getOrderItemPriceInfoId();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__DESCRIPTION:
				return getDescription();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT:
				return getModifyAmount();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID:
				return getProductPriceActionSeqId();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__RATE_CODE:
				return getRateCode();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID:
				if (resolve) return getProductPriceRuleId();
				return basicGetProductPriceRuleId();
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
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID:
				setOrderItemPriceInfoId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT:
				setModifyAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID:
				setProductPriceActionSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__RATE_CODE:
				setRateCode((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((ProductPriceRule)newValue);
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
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID:
				setOrderItemPriceInfoId(ORDER_ITEM_PRICE_INFO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT:
				setModifyAmount(MODIFY_AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID:
				setProductPriceActionSeqId(PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__RATE_CODE:
				setRateCode(RATE_CODE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((ProductPriceRule)null);
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
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID:
				return ORDER_ITEM_PRICE_INFO_ID_EDEFAULT == null ? orderItemPriceInfoId != null : !ORDER_ITEM_PRICE_INFO_ID_EDEFAULT.equals(orderItemPriceInfoId);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT:
				return MODIFY_AMOUNT_EDEFAULT == null ? modifyAmount != null : !MODIFY_AMOUNT_EDEFAULT.equals(modifyAmount);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID:
				return PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT == null ? productPriceActionSeqId != null : !PRODUCT_PRICE_ACTION_SEQ_ID_EDEFAULT.equals(productPriceActionSeqId);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__RATE_CODE:
				return RATE_CODE_EDEFAULT == null ? rateCode != null : !RATE_CODE_EDEFAULT.equals(rateCode);
			case OrderPackage.ORDER_ITEM_PRICE_INFO__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID:
				return productPriceRuleId != null;
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
		result.append(" (orderItemPriceInfoId: ");
		result.append(orderItemPriceInfoId);
		result.append(", description: ");
		result.append(description);
		result.append(", modifyAmount: ");
		result.append(modifyAmount);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", productPriceActionSeqId: ");
		result.append(productPriceActionSeqId);
		result.append(", rateCode: ");
		result.append(rateCode);
		result.append(')');
		return result.toString();
	}

} //OrderItemPriceInfoImpl
