/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Usps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectUrlLabels <em>Connect Url Labels</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getMaxEstimateWeight <em>Max Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayUspsImpl extends ShipmentGatewayConfigImpl implements ShipmentGatewayUsps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAccessPassword() <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPassword() <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPassword()
	 * @generated
	 * @ordered
	 */
	protected String accessPassword = ACCESS_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessUserId() <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessUserId() <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserId()
	 * @generated
	 * @ordered
	 */
	protected String accessUserId = ACCESS_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long CONNECT_TIMEOUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeout()
	 * @generated
	 * @ordered
	 */
	protected long connectTimeout = CONNECT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectUrl() <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectUrl() <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrl()
	 * @generated
	 * @ordered
	 */
	protected String connectUrl = CONNECT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectUrlLabels() <em>Connect Url Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrlLabels()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_URL_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectUrlLabels() <em>Connect Url Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrlLabels()
	 * @generated
	 * @ordered
	 */
	protected String connectUrlLabels = CONNECT_URL_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEstimateWeight() <em>Max Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_ESTIMATE_WEIGHT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxEstimateWeight() <em>Max Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected long maxEstimateWeight = MAX_ESTIMATE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayUspsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPassword() {
		return accessPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPassword(String newAccessPassword) {
		String oldAccessPassword = accessPassword;
		accessPassword = newAccessPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD, oldAccessPassword, accessPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserId() {
		return accessUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserId(String newAccessUserId) {
		String oldAccessUserId = accessUserId;
		accessUserId = newAccessUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID, oldAccessUserId, accessUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return connectTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		long oldConnectTimeout = connectTimeout;
		connectTimeout = newConnectTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return connectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		String oldConnectUrl = connectUrl;
		connectUrl = newConnectUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL, oldConnectUrl, connectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrlLabels() {
		return connectUrlLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrlLabels(String newConnectUrlLabels) {
		String oldConnectUrlLabels = connectUrlLabels;
		connectUrlLabels = newConnectUrlLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS, oldConnectUrlLabels, connectUrlLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxEstimateWeight() {
		return maxEstimateWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEstimateWeight(long newMaxEstimateWeight) {
		long oldMaxEstimateWeight = maxEstimateWeight;
		maxEstimateWeight = newMaxEstimateWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT, oldMaxEstimateWeight, maxEstimateWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_USPS__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD:
				return getAccessPassword();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID:
				return getAccessUserId();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL:
				return getConnectUrl();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS:
				return getConnectUrlLabels();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT:
				return getMaxEstimateWeight();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__TEST:
				return getTest();
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
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD:
				setAccessPassword((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID:
				setAccessUserId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT:
				setConnectTimeout((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL:
				setConnectUrl((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS:
				setConnectUrlLabels((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT:
				setMaxEstimateWeight((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__TEST:
				setTest((String)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD:
				setAccessPassword(ACCESS_PASSWORD_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID:
				setAccessUserId(ACCESS_USER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT:
				setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL:
				setConnectUrl(CONNECT_URL_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS:
				setConnectUrlLabels(CONNECT_URL_LABELS_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT:
				setMaxEstimateWeight(MAX_ESTIMATE_WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__TEST:
				setTest(TEST_EDEFAULT);
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
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD:
				return ACCESS_PASSWORD_EDEFAULT == null ? accessPassword != null : !ACCESS_PASSWORD_EDEFAULT.equals(accessPassword);
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID:
				return ACCESS_USER_ID_EDEFAULT == null ? accessUserId != null : !ACCESS_USER_ID_EDEFAULT.equals(accessUserId);
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT:
				return connectTimeout != CONNECT_TIMEOUT_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL:
				return CONNECT_URL_EDEFAULT == null ? connectUrl != null : !CONNECT_URL_EDEFAULT.equals(connectUrl);
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS:
				return CONNECT_URL_LABELS_EDEFAULT == null ? connectUrlLabels != null : !CONNECT_URL_LABELS_EDEFAULT.equals(connectUrlLabels);
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT:
				return maxEstimateWeight != MAX_ESTIMATE_WEIGHT_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_USPS__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
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
		result.append(" (accessPassword: ");
		result.append(accessPassword);
		result.append(", accessUserId: ");
		result.append(accessUserId);
		result.append(", connectTimeout: ");
		result.append(connectTimeout);
		result.append(", connectUrl: ");
		result.append(connectUrl);
		result.append(", connectUrlLabels: ");
		result.append(connectUrlLabels);
		result.append(", maxEstimateWeight: ");
		result.append(maxEstimateWeight);
		result.append(", test: ");
		result.append(test);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayUspsImpl
