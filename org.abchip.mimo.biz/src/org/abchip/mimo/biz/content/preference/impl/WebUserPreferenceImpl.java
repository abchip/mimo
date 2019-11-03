/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.preference.impl;

import org.abchip.mimo.biz.content.preference.PreferencePackage;
import org.abchip.mimo.biz.content.preference.WebUserPreference;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web User Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getWebPreferenceTypeId <em>Web Preference Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getWebPreferenceValue <em>Web Preference Value</em>}</li>
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
	 * The default value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String userLoginId = USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getWebPreferenceTypeId() <em>Web Preference Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PREFERENCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPreferenceTypeId() <em>Web Preference Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String webPreferenceTypeId = WEB_PREFERENCE_TYPE_ID_EDEFAULT;

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
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
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
	public String getUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		String oldUserLoginId = userLoginId;
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
	public String getWebPreferenceTypeId() {
		return webPreferenceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceTypeId(String newWebPreferenceTypeId) {
		String oldWebPreferenceTypeId = webPreferenceTypeId;
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
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				return getUserLoginId();
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				return getPartyId();
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				return getVisitId();
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				return getWebPreferenceTypeId();
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				return getWebPreferenceValue();
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
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId((String)newValue);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				setWebPreferenceValue((String)newValue);
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
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId(WEB_PREFERENCE_TYPE_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				setWebPreferenceValue(WEB_PREFERENCE_VALUE_EDEFAULT);
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
			case PreferencePackage.WEB_USER_PREFERENCE__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case PreferencePackage.WEB_USER_PREFERENCE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PreferencePackage.WEB_USER_PREFERENCE__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID:
				return WEB_PREFERENCE_TYPE_ID_EDEFAULT == null ? webPreferenceTypeId != null : !WEB_PREFERENCE_TYPE_ID_EDEFAULT.equals(webPreferenceTypeId);
			case PreferencePackage.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE:
				return WEB_PREFERENCE_VALUE_EDEFAULT == null ? webPreferenceValue != null : !WEB_PREFERENCE_VALUE_EDEFAULT.equals(webPreferenceValue);
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
		result.append(" (userLoginId: ");
		result.append(userLoginId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(", webPreferenceTypeId: ");
		result.append(webPreferenceTypeId);
		result.append(", webPreferenceValue: ");
		result.append(webPreferenceValue);
		result.append(')');
		return result.toString();
	}

} //WebUserPreferenceImpl
