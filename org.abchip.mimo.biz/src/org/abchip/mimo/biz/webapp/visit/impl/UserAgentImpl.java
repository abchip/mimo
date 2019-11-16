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
import org.abchip.mimo.biz.webapp.visit.BrowserType;
import org.abchip.mimo.biz.webapp.visit.PlatformType;
import org.abchip.mimo.biz.webapp.visit.ProtocolType;
import org.abchip.mimo.biz.webapp.visit.UserAgent;
import org.abchip.mimo.biz.webapp.visit.UserAgentMethodType;
import org.abchip.mimo.biz.webapp.visit.UserAgentType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
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
	 * The cached value of the '{@link #getBrowserTypeId() <em>Browser Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserTypeId()
	 * @generated
	 * @ordered
	 */
	protected BrowserType browserTypeId;

	/**
	 * The cached value of the '{@link #getPlatformTypeId() <em>Platform Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformTypeId()
	 * @generated
	 * @ordered
	 */
	protected PlatformType platformTypeId;

	/**
	 * The cached value of the '{@link #getProtocolTypeId() <em>Protocol Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType protocolTypeId;

	/**
	 * The cached value of the '{@link #getUserAgentTypeId() <em>User Agent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentTypeId()
	 * @generated
	 * @ordered
	 */
	protected UserAgentType userAgentTypeId;

	/**
	 * The cached value of the '{@link #getUserAgentMethodTypeId() <em>User Agent Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected UserAgentMethodType userAgentMethodTypeId;

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
	public BrowserType getBrowserTypeId() {
		if (browserTypeId != null && ((EObject)browserTypeId).eIsProxy()) {
			InternalEObject oldBrowserTypeId = (InternalEObject)browserTypeId;
			browserTypeId = (BrowserType)eResolveProxy(oldBrowserTypeId);
			if (browserTypeId != oldBrowserTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.USER_AGENT__BROWSER_TYPE_ID, oldBrowserTypeId, browserTypeId));
			}
		}
		return browserTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserType basicGetBrowserTypeId() {
		return browserTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(BrowserType newBrowserTypeId) {
		BrowserType oldBrowserTypeId = browserTypeId;
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
	public PlatformType getPlatformTypeId() {
		if (platformTypeId != null && ((EObject)platformTypeId).eIsProxy()) {
			InternalEObject oldPlatformTypeId = (InternalEObject)platformTypeId;
			platformTypeId = (PlatformType)eResolveProxy(oldPlatformTypeId);
			if (platformTypeId != oldPlatformTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.USER_AGENT__PLATFORM_TYPE_ID, oldPlatformTypeId, platformTypeId));
			}
		}
		return platformTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType basicGetPlatformTypeId() {
		return platformTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(PlatformType newPlatformTypeId) {
		PlatformType oldPlatformTypeId = platformTypeId;
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
	public ProtocolType getProtocolTypeId() {
		if (protocolTypeId != null && ((EObject)protocolTypeId).eIsProxy()) {
			InternalEObject oldProtocolTypeId = (InternalEObject)protocolTypeId;
			protocolTypeId = (ProtocolType)eResolveProxy(oldProtocolTypeId);
			if (protocolTypeId != oldProtocolTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID, oldProtocolTypeId, protocolTypeId));
			}
		}
		return protocolTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType basicGetProtocolTypeId() {
		return protocolTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolTypeId(ProtocolType newProtocolTypeId) {
		ProtocolType oldProtocolTypeId = protocolTypeId;
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
	public UserAgentMethodType getUserAgentMethodTypeId() {
		if (userAgentMethodTypeId != null && ((EObject)userAgentMethodTypeId).eIsProxy()) {
			InternalEObject oldUserAgentMethodTypeId = (InternalEObject)userAgentMethodTypeId;
			userAgentMethodTypeId = (UserAgentMethodType)eResolveProxy(oldUserAgentMethodTypeId);
			if (userAgentMethodTypeId != oldUserAgentMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, oldUserAgentMethodTypeId, userAgentMethodTypeId));
			}
		}
		return userAgentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAgentMethodType basicGetUserAgentMethodTypeId() {
		return userAgentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentMethodTypeId(UserAgentMethodType newUserAgentMethodTypeId) {
		UserAgentMethodType oldUserAgentMethodTypeId = userAgentMethodTypeId;
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
	public UserAgentType getUserAgentTypeId() {
		if (userAgentTypeId != null && ((EObject)userAgentTypeId).eIsProxy()) {
			InternalEObject oldUserAgentTypeId = (InternalEObject)userAgentTypeId;
			userAgentTypeId = (UserAgentType)eResolveProxy(oldUserAgentTypeId);
			if (userAgentTypeId != oldUserAgentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID, oldUserAgentTypeId, userAgentTypeId));
			}
		}
		return userAgentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAgentType basicGetUserAgentTypeId() {
		return userAgentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentTypeId(UserAgentType newUserAgentTypeId) {
		UserAgentType oldUserAgentTypeId = userAgentTypeId;
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
				if (resolve) return getBrowserTypeId();
				return basicGetBrowserTypeId();
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				if (resolve) return getPlatformTypeId();
				return basicGetPlatformTypeId();
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				if (resolve) return getProtocolTypeId();
				return basicGetProtocolTypeId();
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				if (resolve) return getUserAgentTypeId();
				return basicGetUserAgentTypeId();
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				if (resolve) return getUserAgentMethodTypeId();
				return basicGetUserAgentMethodTypeId();
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
				setBrowserTypeId((BrowserType)newValue);
				return;
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				setPlatformTypeId((PlatformType)newValue);
				return;
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				setProtocolTypeId((ProtocolType)newValue);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				setUserAgentTypeId((UserAgentType)newValue);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				setUserAgentMethodTypeId((UserAgentMethodType)newValue);
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
				setBrowserTypeId((BrowserType)null);
				return;
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				setPlatformTypeId((PlatformType)null);
				return;
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				setProtocolTypeId((ProtocolType)null);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				setUserAgentTypeId((UserAgentType)null);
				return;
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				setUserAgentMethodTypeId((UserAgentMethodType)null);
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
				return browserTypeId != null;
			case VisitPackage.USER_AGENT__PLATFORM_TYPE_ID:
				return platformTypeId != null;
			case VisitPackage.USER_AGENT__PROTOCOL_TYPE_ID:
				return protocolTypeId != null;
			case VisitPackage.USER_AGENT__USER_AGENT_TYPE_ID:
				return userAgentTypeId != null;
			case VisitPackage.USER_AGENT__USER_AGENT_METHOD_TYPE_ID:
				return userAgentMethodTypeId != null;
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
		result.append(')');
		return result.toString();
	}

} //UserAgentImpl
