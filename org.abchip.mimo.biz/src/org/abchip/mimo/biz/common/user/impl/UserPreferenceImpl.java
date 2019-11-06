/**
 * Copyright (c) 2017, 2019 ABChip and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefTypeId <em>User Pref Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefDataType <em>User Pref Data Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefValue <em>User Pref Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}</li>
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
	 * The default value of the '{@link #getUserPrefTypeId() <em>User Pref Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PREF_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPrefTypeId() <em>User Pref Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefTypeId()
	 * @generated
	 * @ordered
	 */
	protected String userPrefTypeId = USER_PREF_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserPrefDataType() <em>User Pref Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PREF_DATA_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUserPrefDataType() <em>User Pref Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefDataType()
	 * @generated
	 * @ordered
	 */
	protected String userPrefDataType = USER_PREF_DATA_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserPrefValue() <em>User Pref Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefValue()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PREF_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPrefValue() <em>User Pref Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefValue()
	 * @generated
	 * @ordered
	 */
	protected String userPrefValue = USER_PREF_VALUE_EDEFAULT;
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
	 * The cached value of the '{@link #getUserPrefGroupTypeId() <em>User Pref Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected UserPrefGroupType userPrefGroupTypeId;

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
		if (userLoginId != null && ((EObject)userLoginId).eIsProxy()) {
			InternalEObject oldUserLoginId = (InternalEObject)userLoginId;
			userLoginId = (UserLogin)eResolveProxy(oldUserLoginId);
			if (userLoginId != oldUserLoginId) {
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
		userLoginId = newUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefDataType() {
		return userPrefDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefDataType(String newUserPrefDataType) {
		userPrefDataType = newUserPrefDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPrefGroupType getUserPrefGroupTypeId() {
		if (userPrefGroupTypeId != null && ((EObject)userPrefGroupTypeId).eIsProxy()) {
			InternalEObject oldUserPrefGroupTypeId = (InternalEObject)userPrefGroupTypeId;
			userPrefGroupTypeId = (UserPrefGroupType)eResolveProxy(oldUserPrefGroupTypeId);
			if (userPrefGroupTypeId != oldUserPrefGroupTypeId) {
			}
		}
		return userPrefGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPrefGroupType basicGetUserPrefGroupTypeId() {
		return userPrefGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefGroupTypeId(UserPrefGroupType newUserPrefGroupTypeId) {
		userPrefGroupTypeId = newUserPrefGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefTypeId() {
		return userPrefTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefTypeId(String newUserPrefTypeId) {
		userPrefTypeId = newUserPrefTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefValue() {
		return userPrefValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefValue(String newUserPrefValue) {
		userPrefValue = newUserPrefValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				return getUserPrefTypeId();
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				return getUserPrefDataType();
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				return getUserPrefValue();
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID:
				if (resolve) return getUserPrefGroupTypeId();
				return basicGetUserPrefGroupTypeId();
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
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				setUserPrefTypeId((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				setUserPrefDataType((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				setUserPrefValue((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID:
				setUserPrefGroupTypeId((UserPrefGroupType)newValue);
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
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				setUserPrefTypeId(USER_PREF_TYPE_ID_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				setUserPrefDataType(USER_PREF_DATA_TYPE_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				setUserPrefValue(USER_PREF_VALUE_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID:
				setUserPrefGroupTypeId((UserPrefGroupType)null);
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
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				return USER_PREF_TYPE_ID_EDEFAULT == null ? userPrefTypeId != null : !USER_PREF_TYPE_ID_EDEFAULT.equals(userPrefTypeId);
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				return USER_PREF_DATA_TYPE_EDEFAULT == null ? userPrefDataType != null : !USER_PREF_DATA_TYPE_EDEFAULT.equals(userPrefDataType);
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				return USER_PREF_VALUE_EDEFAULT == null ? userPrefValue != null : !USER_PREF_VALUE_EDEFAULT.equals(userPrefValue);
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				return userLoginId != null;
			case UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID:
				return userPrefGroupTypeId != null;
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
		result.append(" (userPrefTypeId: ");
		result.append(userPrefTypeId);
		result.append(", userPrefDataType: ");
		result.append(userPrefDataType);
		result.append(", userPrefValue: ");
		result.append(userPrefValue);
		result.append(')');
		return result.toString();
	}

} //UserPreferenceImpl
