/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web User Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getWebPreferenceTypeId <em>Web Preference Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl#getVisitId <em>Visit Id</em>}</li>
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
		return (Party)eGet(PreferencePackage.Literals.WEB_USER_PREFERENCE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(PreferencePackage.Literals.WEB_USER_PREFERENCE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		return (UserLogin)eGet(PreferencePackage.Literals.WEB_USER_PREFERENCE__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		eSet(PreferencePackage.Literals.WEB_USER_PREFERENCE__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(PreferencePackage.Literals.WEB_USER_PREFERENCE__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(PreferencePackage.Literals.WEB_USER_PREFERENCE__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebPreferenceType getWebPreferenceTypeId() {
		return (WebPreferenceType)eGet(PreferencePackage.Literals.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceTypeId(WebPreferenceType newWebPreferenceTypeId) {
		eSet(PreferencePackage.Literals.WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID, newWebPreferenceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebPreferenceValue() {
		return (String)eGet(PreferencePackage.Literals.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceValue(String newWebPreferenceValue) {
		eSet(PreferencePackage.Literals.WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE, newWebPreferenceValue);
	}

} //WebUserPreferenceImpl
