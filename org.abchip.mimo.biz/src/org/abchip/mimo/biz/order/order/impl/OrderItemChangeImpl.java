/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderItemChange;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getOrderItemChangeId <em>Order Item Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getChangeComments <em>Change Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getChangeDatetime <em>Change Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getChangeTypeEnumId <em>Change Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getChangeUserLogin <em>Change User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemChangeImpl#getUnitPrice <em>Unit Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemChangeImpl extends BizEntityImpl implements OrderItemChange {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderItemChangeId() <em>Order Item Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemChangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_CHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemChangeId() <em>Order Item Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemChangeId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemChangeId = ORDER_ITEM_CHANGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CANCEL_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cancelQuantity = CANCEL_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeComments() <em>Change Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeComments()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeComments() <em>Change Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeComments()
	 * @generated
	 * @ordered
	 */
	protected String changeComments = CHANGE_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeDatetime() <em>Change Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDatetime() <em>Change Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date changeDatetime = CHANGE_DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeTypeEnumId() <em>Change Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeTypeEnumId() <em>Change Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String changeTypeEnumId = CHANGE_TYPE_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeUserLogin() <em>Change User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeUserLogin() <em>Change User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String changeUserLogin = CHANGE_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected String itemDescription = ITEM_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected String reasonEnumId = REASON_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCancelQuantity() {
		return cancelQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelQuantity(BigDecimal newCancelQuantity) {
		BigDecimal oldCancelQuantity = cancelQuantity;
		cancelQuantity = newCancelQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__CANCEL_QUANTITY, oldCancelQuantity, cancelQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeComments() {
		return changeComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeComments(String newChangeComments) {
		String oldChangeComments = changeComments;
		changeComments = newChangeComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__CHANGE_COMMENTS, oldChangeComments, changeComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangeDatetime() {
		return changeDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDatetime(Date newChangeDatetime) {
		Date oldChangeDatetime = changeDatetime;
		changeDatetime = newChangeDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__CHANGE_DATETIME, oldChangeDatetime, changeDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeTypeEnumId() {
		return changeTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeTypeEnumId(String newChangeTypeEnumId) {
		String oldChangeTypeEnumId = changeTypeEnumId;
		changeTypeEnumId = newChangeTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID, oldChangeTypeEnumId, changeTypeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeUserLogin() {
		return changeUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeUserLogin(String newChangeUserLogin) {
		String oldChangeUserLogin = changeUserLogin;
		changeUserLogin = newChangeUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN, oldChangeUserLogin, changeUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDescription(String newItemDescription) {
		String oldItemDescription = itemDescription;
		itemDescription = newItemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION, oldItemDescription, itemDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemChangeId() {
		return orderItemChangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemChangeId(String newOrderItemChangeId) {
		String oldOrderItemChangeId = orderItemChangeId;
		orderItemChangeId = newOrderItemChangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID, oldOrderItemChangeId, orderItemChangeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(String newReasonEnumId) {
		String oldReasonEnumId = reasonEnumId;
		reasonEnumId = newReasonEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__REASON_ENUM_ID, oldReasonEnumId, reasonEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		BigDecimal oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_CHANGE__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID:
				return getOrderItemChangeId();
			case OrderPackage.ORDER_ITEM_CHANGE__CANCEL_QUANTITY:
				return getCancelQuantity();
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_COMMENTS:
				return getChangeComments();
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_DATETIME:
				return getChangeDatetime();
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID:
				return getChangeTypeEnumId();
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN:
				return getChangeUserLogin();
			case OrderPackage.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION:
				return getItemDescription();
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_CHANGE__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER_ITEM_CHANGE__REASON_ENUM_ID:
				return getReasonEnumId();
			case OrderPackage.ORDER_ITEM_CHANGE__UNIT_PRICE:
				return getUnitPrice();
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
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID:
				setOrderItemChangeId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CANCEL_QUANTITY:
				setCancelQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_COMMENTS:
				setChangeComments((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_DATETIME:
				setChangeDatetime((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID:
				setChangeTypeEnumId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN:
				setChangeUserLogin((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION:
				setItemDescription((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__REASON_ENUM_ID:
				setReasonEnumId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
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
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID:
				setOrderItemChangeId(ORDER_ITEM_CHANGE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CANCEL_QUANTITY:
				setCancelQuantity(CANCEL_QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_COMMENTS:
				setChangeComments(CHANGE_COMMENTS_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_DATETIME:
				setChangeDatetime(CHANGE_DATETIME_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID:
				setChangeTypeEnumId(CHANGE_TYPE_ENUM_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN:
				setChangeUserLogin(CHANGE_USER_LOGIN_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION:
				setItemDescription(ITEM_DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__REASON_ENUM_ID:
				setReasonEnumId(REASON_ENUM_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_CHANGE__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
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
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID:
				return ORDER_ITEM_CHANGE_ID_EDEFAULT == null ? orderItemChangeId != null : !ORDER_ITEM_CHANGE_ID_EDEFAULT.equals(orderItemChangeId);
			case OrderPackage.ORDER_ITEM_CHANGE__CANCEL_QUANTITY:
				return CANCEL_QUANTITY_EDEFAULT == null ? cancelQuantity != null : !CANCEL_QUANTITY_EDEFAULT.equals(cancelQuantity);
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_COMMENTS:
				return CHANGE_COMMENTS_EDEFAULT == null ? changeComments != null : !CHANGE_COMMENTS_EDEFAULT.equals(changeComments);
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_DATETIME:
				return CHANGE_DATETIME_EDEFAULT == null ? changeDatetime != null : !CHANGE_DATETIME_EDEFAULT.equals(changeDatetime);
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID:
				return CHANGE_TYPE_ENUM_ID_EDEFAULT == null ? changeTypeEnumId != null : !CHANGE_TYPE_ENUM_ID_EDEFAULT.equals(changeTypeEnumId);
			case OrderPackage.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN:
				return CHANGE_USER_LOGIN_EDEFAULT == null ? changeUserLogin != null : !CHANGE_USER_LOGIN_EDEFAULT.equals(changeUserLogin);
			case OrderPackage.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION:
				return ITEM_DESCRIPTION_EDEFAULT == null ? itemDescription != null : !ITEM_DESCRIPTION_EDEFAULT.equals(itemDescription);
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM_CHANGE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OrderPackage.ORDER_ITEM_CHANGE__REASON_ENUM_ID:
				return REASON_ENUM_ID_EDEFAULT == null ? reasonEnumId != null : !REASON_ENUM_ID_EDEFAULT.equals(reasonEnumId);
			case OrderPackage.ORDER_ITEM_CHANGE__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? unitPrice != null : !UNIT_PRICE_EDEFAULT.equals(unitPrice);
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
		result.append(" (orderItemChangeId: ");
		result.append(orderItemChangeId);
		result.append(", cancelQuantity: ");
		result.append(cancelQuantity);
		result.append(", changeComments: ");
		result.append(changeComments);
		result.append(", changeDatetime: ");
		result.append(changeDatetime);
		result.append(", changeTypeEnumId: ");
		result.append(changeTypeEnumId);
		result.append(", changeUserLogin: ");
		result.append(changeUserLogin);
		result.append(", itemDescription: ");
		result.append(itemDescription);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reasonEnumId: ");
		result.append(reasonEnumId);
		result.append(", unitPrice: ");
		result.append(unitPrice);
		result.append(')');
		return result.toString();
	}

} //OrderItemChangeImpl
