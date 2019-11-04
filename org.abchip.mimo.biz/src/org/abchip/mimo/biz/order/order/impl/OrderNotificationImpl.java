/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderNotification;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderNotificationImpl#getOrderNotificationId <em>Order Notification Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderNotificationImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderNotificationImpl#getNotificationDate <em>Notification Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderNotificationImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderNotificationImpl#getEmailType <em>Email Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderNotificationImpl extends BizEntityImpl implements OrderNotification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderNotificationId() <em>Order Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNotificationId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_NOTIFICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderNotificationId() <em>Order Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNotificationId()
	 * @generated
	 * @ordered
	 */
	protected String orderNotificationId = ORDER_NOTIFICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationDate() <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NOTIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationDate() <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationDate()
	 * @generated
	 * @ordered
	 */
	protected Date notificationDate = NOTIFICATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getEmailType() <em>Email Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailType()
	 * @generated
	 * @ordered
	 */
	protected Enumeration emailType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_NOTIFICATION__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getEmailType() {
		if (emailType != null && ((EObject)emailType).eIsProxy()) {
			InternalEObject oldEmailType = (InternalEObject)emailType;
			emailType = (Enumeration)eResolveProxy(oldEmailType);
			if (emailType != oldEmailType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE, oldEmailType, emailType));
			}
		}
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetEmailType() {
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailType(Enumeration newEmailType) {
		Enumeration oldEmailType = emailType;
		emailType = newEmailType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE, oldEmailType, emailType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNotificationDate() {
		return notificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationDate(Date newNotificationDate) {
		Date oldNotificationDate = notificationDate;
		notificationDate = newNotificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_NOTIFICATION__NOTIFICATION_DATE, oldNotificationDate, notificationDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_NOTIFICATION__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_NOTIFICATION__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderNotificationId() {
		return orderNotificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNotificationId(String newOrderNotificationId) {
		String oldOrderNotificationId = orderNotificationId;
		orderNotificationId = newOrderNotificationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID, oldOrderNotificationId, orderNotificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID:
				return getOrderNotificationId();
			case OrderPackage.ORDER_NOTIFICATION__COMMENTS:
				return getComments();
			case OrderPackage.ORDER_NOTIFICATION__NOTIFICATION_DATE:
				return getNotificationDate();
			case OrderPackage.ORDER_NOTIFICATION__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE:
				if (resolve) return getEmailType();
				return basicGetEmailType();
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
			case OrderPackage.ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID:
				setOrderNotificationId((String)newValue);
				return;
			case OrderPackage.ORDER_NOTIFICATION__COMMENTS:
				setComments((String)newValue);
				return;
			case OrderPackage.ORDER_NOTIFICATION__NOTIFICATION_DATE:
				setNotificationDate((Date)newValue);
				return;
			case OrderPackage.ORDER_NOTIFICATION__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE:
				setEmailType((Enumeration)newValue);
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
			case OrderPackage.ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID:
				setOrderNotificationId(ORDER_NOTIFICATION_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_NOTIFICATION__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case OrderPackage.ORDER_NOTIFICATION__NOTIFICATION_DATE:
				setNotificationDate(NOTIFICATION_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_NOTIFICATION__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE:
				setEmailType((Enumeration)null);
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
			case OrderPackage.ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID:
				return ORDER_NOTIFICATION_ID_EDEFAULT == null ? orderNotificationId != null : !ORDER_NOTIFICATION_ID_EDEFAULT.equals(orderNotificationId);
			case OrderPackage.ORDER_NOTIFICATION__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case OrderPackage.ORDER_NOTIFICATION__NOTIFICATION_DATE:
				return NOTIFICATION_DATE_EDEFAULT == null ? notificationDate != null : !NOTIFICATION_DATE_EDEFAULT.equals(notificationDate);
			case OrderPackage.ORDER_NOTIFICATION__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_NOTIFICATION__EMAIL_TYPE:
				return emailType != null;
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
		result.append(" (orderNotificationId: ");
		result.append(orderNotificationId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", notificationDate: ");
		result.append(notificationDate);
		result.append(')');
		return result.toString();
	}

} //OrderNotificationImpl
