/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.user.impl;

import org.abchip.mimo.biz.common.user.UserPackage;
import org.abchip.mimo.biz.common.user.UserPrefGroupType;
import org.abchip.mimo.biz.common.user.UserPreference;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefTypeId <em>User Pref Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefDataType <em>User Pref Data Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefValue <em>User Pref Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserPreferenceImpl extends BizEntityImpl implements UserPreference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.USER_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		return (UserLogin)eGet(UserPackage.Literals.USER_PREFERENCE__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		eSet(UserPackage.Literals.USER_PREFERENCE__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefDataType() {
		return (String)eGet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefDataType(String newUserPrefDataType) {
		eSet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_DATA_TYPE, newUserPrefDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPrefGroupType getUserPrefGroupTypeId() {
		return (UserPrefGroupType)eGet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefGroupTypeId(UserPrefGroupType newUserPrefGroupTypeId) {
		eSet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID, newUserPrefGroupTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefTypeId() {
		return (String)eGet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefTypeId(String newUserPrefTypeId) {
		eSet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_TYPE_ID, newUserPrefTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefValue() {
		return (String)eGet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefValue(String newUserPrefValue) {
		eSet(UserPackage.Literals.USER_PREFERENCE__USER_PREF_VALUE, newUserPrefValue);
	}

} //UserPreferenceImpl
