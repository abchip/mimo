/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderBlacklist;
import org.abchip.mimo.biz.order.order.OrderBlacklistType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Blacklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderBlacklistImpl#getBlacklistString <em>Blacklist String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderBlacklistImpl#getOrderBlacklistTypeId <em>Order Blacklist Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderBlacklistImpl extends BizEntityTypedImpl<OrderBlacklistType> implements OrderBlacklist {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getBlacklistString() <em>Blacklist String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlacklistString()
	 * @generated
	 * @ordered
	 */
	protected static final String BLACKLIST_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlacklistString() <em>Blacklist String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlacklistString()
	 * @generated
	 * @ordered
	 */
	protected String blacklistString = BLACKLIST_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderBlacklistTypeId() <em>Order Blacklist Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBlacklistTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderBlacklistType orderBlacklistTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderBlacklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_BLACKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlacklistString() {
		return blacklistString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlacklistString(String newBlacklistString) {
		String oldBlacklistString = blacklistString;
		blacklistString = newBlacklistString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_BLACKLIST__BLACKLIST_STRING, oldBlacklistString, blacklistString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBlacklistType getOrderBlacklistTypeId() {
		if (orderBlacklistTypeId != null && ((EObject)orderBlacklistTypeId).eIsProxy()) {
			InternalEObject oldOrderBlacklistTypeId = (InternalEObject)orderBlacklistTypeId;
			orderBlacklistTypeId = (OrderBlacklistType)eResolveProxy(oldOrderBlacklistTypeId);
			if (orderBlacklistTypeId != oldOrderBlacklistTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID, oldOrderBlacklistTypeId, orderBlacklistTypeId));
			}
		}
		return orderBlacklistTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderBlacklistType basicGetOrderBlacklistTypeId() {
		return orderBlacklistTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderBlacklistTypeId(OrderBlacklistType newOrderBlacklistTypeId) {
		OrderBlacklistType oldOrderBlacklistTypeId = orderBlacklistTypeId;
		orderBlacklistTypeId = newOrderBlacklistTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID, oldOrderBlacklistTypeId, orderBlacklistTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_BLACKLIST__BLACKLIST_STRING:
				return getBlacklistString();
			case OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID:
				if (resolve) return getOrderBlacklistTypeId();
				return basicGetOrderBlacklistTypeId();
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
			case OrderPackage.ORDER_BLACKLIST__BLACKLIST_STRING:
				setBlacklistString((String)newValue);
				return;
			case OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID:
				setOrderBlacklistTypeId((OrderBlacklistType)newValue);
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
			case OrderPackage.ORDER_BLACKLIST__BLACKLIST_STRING:
				setBlacklistString(BLACKLIST_STRING_EDEFAULT);
				return;
			case OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID:
				setOrderBlacklistTypeId((OrderBlacklistType)null);
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
			case OrderPackage.ORDER_BLACKLIST__BLACKLIST_STRING:
				return BLACKLIST_STRING_EDEFAULT == null ? blacklistString != null : !BLACKLIST_STRING_EDEFAULT.equals(blacklistString);
			case OrderPackage.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID:
				return orderBlacklistTypeId != null;
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
		result.append(" (blacklistString: ");
		result.append(blacklistString);
		result.append(')');
		return result.toString();
	}

} //OrderBlacklistImpl
