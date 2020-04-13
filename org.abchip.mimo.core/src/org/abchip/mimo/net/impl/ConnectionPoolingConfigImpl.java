/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.net.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.net.ConnectionPoolingConfig;
import org.abchip.mimo.net.NetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Pooling Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.net.impl.ConnectionPoolingConfigImpl#getMaxTotal <em>Max Total</em>}</li>
 *   <li>{@link org.abchip.mimo.net.impl.ConnectionPoolingConfigImpl#getMaxPerRoute <em>Max Per Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPoolingConfigImpl extends EntityImpl implements ConnectionPoolingConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected int maxTotal = MAX_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPerRoute() <em>Max Per Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPerRoute()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PER_ROUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPerRoute() <em>Max Per Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPerRoute()
	 * @generated
	 * @ordered
	 */
	protected int maxPerRoute = MAX_PER_ROUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPoolingConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetPackage.Literals.CONNECTION_POOLING_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxTotal() {
		return maxTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTotal(int newMaxTotal) {
		int oldMaxTotal = maxTotal;
		maxTotal = newMaxTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetPackage.CONNECTION_POOLING_CONFIG__MAX_TOTAL, oldMaxTotal, maxTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxPerRoute() {
		return maxPerRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPerRoute(int newMaxPerRoute) {
		int oldMaxPerRoute = maxPerRoute;
		maxPerRoute = newMaxPerRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetPackage.CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE, oldMaxPerRoute, maxPerRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_TOTAL:
				return getMaxTotal();
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE:
				return getMaxPerRoute();
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
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_TOTAL:
				setMaxTotal((Integer)newValue);
				return;
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE:
				setMaxPerRoute((Integer)newValue);
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
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_TOTAL:
				setMaxTotal(MAX_TOTAL_EDEFAULT);
				return;
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE:
				setMaxPerRoute(MAX_PER_ROUTE_EDEFAULT);
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
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_TOTAL:
				return maxTotal != MAX_TOTAL_EDEFAULT;
			case NetPackage.CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE:
				return maxPerRoute != MAX_PER_ROUTE_EDEFAULT;
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
		result.append(" (maxTotal: ");
		result.append(maxTotal);
		result.append(", maxPerRoute: ");
		result.append(maxPerRoute);
		result.append(')');
		return result.toString();
	}

} //ConnectionPoolingConfigImpl
