/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.webapp.visit.UserAgent;
import org.abchip.mimo.biz.webapp.visit.UserAgentType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAgentImpl extends BizEntityTypedImpl<UserAgentType> implements UserAgent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getUserAgentId() <em>User Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_AGENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAgentId() <em>User Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentId()
	 * @generated
	 * @ordered
	 */
	protected String userAgentId = USER_AGENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrowserTypeId() <em>Browser Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrowserTypeId() <em>Browser Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserTypeId()
	 * @generated
	 * @ordered
	 */
	protected String browserTypeId = BROWSER_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformTypeId() <em>Platform Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformTypeId() <em>Platform Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformTypeId()
	 * @generated
	 * @ordered
	 */
	protected String platformTypeId = PLATFORM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolTypeId() <em>Protocol Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolTypeId() <em>Protocol Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolTypeId()
	 * @generated
	 * @ordered
	 */
	protected String protocolTypeId = PROTOCOL_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAgentMethodTypeId() <em>User Agent Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_AGENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAgentMethodTypeId() <em>User Agent Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String userAgentMethodTypeId = USER_AGENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAgentTypeId() <em>User Agent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_AGENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAgentTypeId() <em>User Agent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String userAgentTypeId = USER_AGENT_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.USER_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAgentId() {
		return userAgentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentId(String newUserAgentId) {
		String oldUserAgentId = userAgentId;
		userAgentId = newUserAgentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__USER_AGENT_ID, oldUserAgentId, userAgentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserTypeId() {
		return browserTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(String newBrowserTypeId) {
		String oldBrowserTypeId = browserTypeId;
		browserTypeId = newBrowserTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__BROWSER_TYPE_ID, oldBrowserTypeId, browserTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformTypeId() {
		return platformTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(String newPlatformTypeId) {
		String oldPlatformTypeId = platformTypeId;
		platformTypeId = newPlatformTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__PLATFORM_TYPE_ID, oldPlatformTypeId, platformTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolTypeId() {
		return protocolTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolTypeId(String newProtocolTypeId) {
		String oldProtocolTypeId = protocolTypeId;
		protocolTypeId = newProtocolTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID, oldProtocolTypeId, protocolTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAgentMethodTypeId() {
		return userAgentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentMethodTypeId(String newUserAgentMethodTypeId) {
		String oldUserAgentMethodTypeId = userAgentMethodTypeId;
		userAgentMethodTypeId = newUserAgentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, oldUserAgentMethodTypeId, userAgentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAgentTypeId() {
		return userAgentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentTypeId(String newUserAgentTypeId) {
		String oldUserAgentTypeId = userAgentTypeId;
		userAgentTypeId = newUserAgentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID, oldUserAgentTypeId, userAgentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> visits() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitPackage.USER_AGENT__USER_AGENT_ID:
				return getUserAgentId();
			case VisitPackage.USER_AGENT__BROWSER_TYPE_ID:
				return getBrowserTypeId();
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				return getPlatformTypeId();
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				return getProtocolTypeId();
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				return getUserAgentMethodTypeId();
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				return getUserAgentTypeId();
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
			case VisitPackage.USER_AGENT__USER_AGENT_ID:
				setUserAgentId((String)newValue);
				return;
			case VisitPackage.USER_AGENT__BROWSER_TYPE_ID:
				setBrowserTypeId((String)newValue);
				return;
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				setPlatformTypeId((String)newValue);
				return;
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				setProtocolTypeId((String)newValue);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				setUserAgentMethodTypeId((String)newValue);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				setUserAgentTypeId((String)newValue);
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
			case VisitPackage.USER_AGENT__USER_AGENT_ID:
				setUserAgentId(USER_AGENT_ID_EDEFAULT);
				return;
			case VisitPackage.USER_AGENT__BROWSER_TYPE_ID:
				setBrowserTypeId(BROWSER_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				setPlatformTypeId(PLATFORM_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				setProtocolTypeId(PROTOCOL_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				setUserAgentMethodTypeId(USER_AGENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				setUserAgentTypeId(USER_AGENT_TYPE_ID_EDEFAULT);
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
			case VisitPackage.USER_AGENT__USER_AGENT_ID:
				return USER_AGENT_ID_EDEFAULT == null ? userAgentId != null : !USER_AGENT_ID_EDEFAULT.equals(userAgentId);
			case VisitPackage.USER_AGENT__BROWSER_TYPE_ID:
				return BROWSER_TYPE_ID_EDEFAULT == null ? browserTypeId != null : !BROWSER_TYPE_ID_EDEFAULT.equals(browserTypeId);
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				return PLATFORM_TYPE_ID_EDEFAULT == null ? platformTypeId != null : !PLATFORM_TYPE_ID_EDEFAULT.equals(platformTypeId);
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				return PROTOCOL_TYPE_ID_EDEFAULT == null ? protocolTypeId != null : !PROTOCOL_TYPE_ID_EDEFAULT.equals(protocolTypeId);
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				return USER_AGENT_METHOD_TYPE_ID_EDEFAULT == null ? userAgentMethodTypeId != null : !USER_AGENT_METHOD_TYPE_ID_EDEFAULT.equals(userAgentMethodTypeId);
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				return USER_AGENT_TYPE_ID_EDEFAULT == null ? userAgentTypeId != null : !USER_AGENT_TYPE_ID_EDEFAULT.equals(userAgentTypeId);
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
		result.append(" (userAgentId: ");
		result.append(userAgentId);
		result.append(", browserTypeId: ");
		result.append(browserTypeId);
		result.append(", platformTypeId: ");
		result.append(platformTypeId);
		result.append(", protocolTypeId: ");
		result.append(protocolTypeId);
		result.append(", userAgentMethodTypeId: ");
		result.append(userAgentMethodTypeId);
		result.append(", userAgentTypeId: ");
		result.append(userAgentTypeId);
		result.append(')');
		return result.toString();
	}

} //UserAgentImpl
