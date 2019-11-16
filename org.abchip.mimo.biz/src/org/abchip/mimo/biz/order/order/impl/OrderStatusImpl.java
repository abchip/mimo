/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.order.order.OrderStatus;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getOrderStatusId <em>Order Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getChangeReason <em>Change Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderStatusImpl#getStatusUserLogin <em>Status User Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderStatusImpl extends BizEntityImpl implements OrderStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderStatusId() <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderStatusId() <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatusId()
	 * @generated
	 * @ordered
	 */
	protected String orderStatusId = ORDER_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeReason() <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeReason()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeReason() <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeReason()
	 * @generated
	 * @ordered
	 */
	protected String changeReason = CHANGE_REASON_EDEFAULT;

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
	 * The default value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date statusDatetime = STATUS_DATETIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

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
	 * The cached value of the '{@link #getOrderPaymentPreferenceId() <em>Order Payment Preference Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected OrderPaymentPreference orderPaymentPreferenceId;

	/**
	 * The cached value of the '{@link #getStatusUserLogin() <em>Status User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin statusUserLogin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeReason() {
		return changeReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeReason(String newChangeReason) {
		String oldChangeReason = changeReason;
		changeReason = newChangeReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__CHANGE_REASON, oldChangeReason, changeReason));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_STATUS__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPaymentPreference getOrderPaymentPreferenceId() {
		if (orderPaymentPreferenceId != null && ((EObject)orderPaymentPreferenceId).eIsProxy()) {
			InternalEObject oldOrderPaymentPreferenceId = (InternalEObject)orderPaymentPreferenceId;
			orderPaymentPreferenceId = (OrderPaymentPreference)eResolveProxy(oldOrderPaymentPreferenceId);
			if (orderPaymentPreferenceId != oldOrderPaymentPreferenceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID, oldOrderPaymentPreferenceId, orderPaymentPreferenceId));
			}
		}
		return orderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderPaymentPreference basicGetOrderPaymentPreferenceId() {
		return orderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(OrderPaymentPreference newOrderPaymentPreferenceId) {
		OrderPaymentPreference oldOrderPaymentPreferenceId = orderPaymentPreferenceId;
		orderPaymentPreferenceId = newOrderPaymentPreferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID, oldOrderPaymentPreferenceId, orderPaymentPreferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderStatusId() {
		return orderStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderStatusId(String newOrderStatusId) {
		String oldOrderStatusId = orderStatusId;
		orderStatusId = newOrderStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__ORDER_STATUS_ID, oldOrderStatusId, orderStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDatetime() {
		return statusDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDatetime(Date newStatusDatetime) {
		Date oldStatusDatetime = statusDatetime;
		statusDatetime = newStatusDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__STATUS_DATETIME, oldStatusDatetime, statusDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_STATUS__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getStatusUserLogin() {
		if (statusUserLogin != null && ((EObject)statusUserLogin).eIsProxy()) {
			InternalEObject oldStatusUserLogin = (InternalEObject)statusUserLogin;
			statusUserLogin = (UserLogin)eResolveProxy(oldStatusUserLogin);
			if (statusUserLogin != oldStatusUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN, oldStatusUserLogin, statusUserLogin));
			}
		}
		return statusUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetStatusUserLogin() {
		return statusUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusUserLogin(UserLogin newStatusUserLogin) {
		UserLogin oldStatusUserLogin = statusUserLogin;
		statusUserLogin = newStatusUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN, oldStatusUserLogin, statusUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_STATUS__ORDER_STATUS_ID:
				return getOrderStatusId();
			case OrderPackage.ORDER_STATUS__CHANGE_REASON:
				return getChangeReason();
			case OrderPackage.ORDER_STATUS__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_STATUS__STATUS_DATETIME:
				return getStatusDatetime();
			case OrderPackage.ORDER_STATUS__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case OrderPackage.ORDER_STATUS__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID:
				if (resolve) return getOrderPaymentPreferenceId();
				return basicGetOrderPaymentPreferenceId();
			case OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN:
				if (resolve) return getStatusUserLogin();
				return basicGetStatusUserLogin();
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
			case OrderPackage.ORDER_STATUS__ORDER_STATUS_ID:
				setOrderStatusId((String)newValue);
				return;
			case OrderPackage.ORDER_STATUS__CHANGE_REASON:
				setChangeReason((String)newValue);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_DATETIME:
				setStatusDatetime((Date)newValue);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((OrderPaymentPreference)newValue);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN:
				setStatusUserLogin((UserLogin)newValue);
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
			case OrderPackage.ORDER_STATUS__ORDER_STATUS_ID:
				setOrderStatusId(ORDER_STATUS_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS__CHANGE_REASON:
				setChangeReason(CHANGE_REASON_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_DATETIME:
				setStatusDatetime(STATUS_DATETIME_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((OrderPaymentPreference)null);
				return;
			case OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN:
				setStatusUserLogin((UserLogin)null);
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
			case OrderPackage.ORDER_STATUS__ORDER_STATUS_ID:
				return ORDER_STATUS_ID_EDEFAULT == null ? orderStatusId != null : !ORDER_STATUS_ID_EDEFAULT.equals(orderStatusId);
			case OrderPackage.ORDER_STATUS__CHANGE_REASON:
				return CHANGE_REASON_EDEFAULT == null ? changeReason != null : !CHANGE_REASON_EDEFAULT.equals(changeReason);
			case OrderPackage.ORDER_STATUS__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_STATUS__STATUS_DATETIME:
				return STATUS_DATETIME_EDEFAULT == null ? statusDatetime != null : !STATUS_DATETIME_EDEFAULT.equals(statusDatetime);
			case OrderPackage.ORDER_STATUS__STATUS_ID:
				return statusId != null;
			case OrderPackage.ORDER_STATUS__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID:
				return orderPaymentPreferenceId != null;
			case OrderPackage.ORDER_STATUS__STATUS_USER_LOGIN:
				return statusUserLogin != null;
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
		result.append(" (orderStatusId: ");
		result.append(orderStatusId);
		result.append(", changeReason: ");
		result.append(changeReason);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", statusDatetime: ");
		result.append(statusDatetime);
		result.append(')');
		return result.toString();
	}

} //OrderStatusImpl
