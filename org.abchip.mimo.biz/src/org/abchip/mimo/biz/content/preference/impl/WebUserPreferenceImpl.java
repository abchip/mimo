/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.preference.impl;

import org.abchip.mimo.biz.content.preference.PreferencePackage;
import org.abchip.mimo.biz.content.preference.WebPreferenceType;
import org.abchip.mimo.biz.content.preference.WebUserPreference;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web User Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getWebPreferenceValue <em>Web Preference Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getWebPreferenceTypeId <em>Web Preference Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUserPreferenceImpl extends BizEntityImpl implements WebUserPreference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebPreferenceValue() <em>Web Preference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceValue()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PREFERENCE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPreferenceValue() <em>Web Preference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceValue()
	 * @generated
	 * @ordered
	 */
	protected String webPreferenceValue = WEB_PREFERENCE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWebPreferenceTypeId() <em>Web Preference Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected WebPreferenceType webPreferenceTypeId;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLoginId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUserPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencePackage.Literals.WEB_USER_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		if (userLoginId != null && ((EObject)userLoginId).eIsProxy()) {
			InternalEObject oldUserLoginId = (InternalEObject)userLoginId;
			userLoginId = (UserLogin)eResolveProxy(oldUserLoginId);
			if (userLoginId != oldUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID, oldUserLoginId, userLoginId));
			}
		}
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		UserLogin oldUserLoginId = userLoginId;
		userLoginId = newUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID, oldVisitId, visitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebPreferenceType getWebPreferenceTypeId() {
		if (webPreferenceTypeId != null && ((EObject)webPreferenceTypeId).eIsProxy()) {
			InternalEObject oldWebPreferenceTypeId = (InternalEObject)webPreferenceTypeId;
			webPreferenceTypeId = (WebPreferenceType)eResolveProxy(oldWebPreferenceTypeId);
			if (webPreferenceTypeId != oldWebPreferenceTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID, oldWebPreferenceTypeId, webPreferenceTypeId));
			}
		}
		return webPreferenceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebPreferenceType basicGetWebPreferenceTypeId() {
		return webPreferenceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceTypeId(WebPreferenceType newWebPreferenceTypeId) {
		WebPreferenceType oldWebPreferenceTypeId = webPreferenceTypeId;
		webPreferenceTypeId = newWebPreferenceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID, oldWebPreferenceTypeId, webPreferenceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebPreferenceValue() {
		return webPreferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceValue(String newWebPreferenceValue) {
		String oldWebPreferenceValue = webPreferenceValue;
		webPreferenceValue = newWebPreferenceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE, oldWebPreferenceValue, webPreferenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				return getVisitId();
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				return getWebPreferenceValue();
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				if (resolve) return getWebPreferenceTypeId();
				return basicGetWebPreferenceTypeId();
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				setWebPreferenceValue((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId((WebPreferenceType)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				setWebPreferenceValue(WEB_PREFERENCE_VALUE_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId((WebPreferenceType)null);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				setPartyId((Party)null);
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
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				return WEB_PREFERENCE_VALUE_EDEFAULT == null ? webPreferenceValue != null : !WEB_PREFERENCE_VALUE_EDEFAULT.equals(webPreferenceValue);
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				return webPreferenceTypeId != null;
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				return userLoginId != null;
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				return partyId != null;
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
		result.append(" (visitId: ");
		result.append(visitId);
		result.append(", webPreferenceValue: ");
		result.append(webPreferenceValue);
		result.append(')');
		return result.toString();
	}

} //WebUserPreferenceImpl
