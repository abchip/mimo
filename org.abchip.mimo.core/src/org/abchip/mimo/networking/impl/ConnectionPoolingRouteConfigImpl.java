/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.networking.ConnectionPoolingRouteConfig;
import org.abchip.mimo.networking.HostConfig;
import org.abchip.mimo.networking.NetworkingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Pooling Route Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.networking.impl.ConnectionPoolingRouteConfigImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.abchip.mimo.networking.impl.ConnectionPoolingRouteConfigImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPoolingRouteConfigImpl extends EntityImpl implements ConnectionPoolingRouteConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected HostConfig host;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPoolingRouteConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.CONNECTION_POOLING_ROUTE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostConfig getHost() {
		if (host != null && ((EObject)host).eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (HostConfig)eResolveProxy(oldHost);
			if (host != oldHost) {
				InternalEObject newHost = (InternalEObject)host;
				NotificationChain msgs = oldHost.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, null, null);
				if (newHost.eInternalContainer() == null) {
					msgs = newHost.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostConfig basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(HostConfig newHost, NotificationChain msgs) {
		HostConfig oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(HostConfig newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, null, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, null, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST:
				return basicSetHost(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__MAX:
				return getMax();
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
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST:
				setHost((HostConfig)newValue);
				return;
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__MAX:
				setMax((Integer)newValue);
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
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST:
				setHost((HostConfig)null);
				return;
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__MAX:
				setMax(MAX_EDEFAULT);
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
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__HOST:
				return host != null;
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG__MAX:
				return max != MAX_EDEFAULT;
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
		result.append(" (max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //ConnectionPoolingRouteConfigImpl
