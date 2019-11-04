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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl#getUserPrefValue <em>User Pref Value</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER_PREFERENCE__USER_LOGIN_ID, oldUserLoginId, userLoginId));
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
		String oldUserPrefDataType = userPrefDataType;
		userPrefDataType = newUserPrefDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE, oldUserPrefDataType, userPrefDataType));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID, oldUserPrefGroupTypeId, userPrefGroupTypeId));
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
		UserPrefGroupType oldUserPrefGroupTypeId = userPrefGroupTypeId;
		userPrefGroupTypeId = newUserPrefGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID, oldUserPrefGroupTypeId, userPrefGroupTypeId));
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
		String oldUserPrefTypeId = userPrefTypeId;
		userPrefTypeId = newUserPrefTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID, oldUserPrefTypeId, userPrefTypeId));
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
		String oldUserPrefValue = userPrefValue;
		userPrefValue = newUserPrefValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER_PREFERENCE__USER_PREF_VALUE, oldUserPrefValue, userPrefValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				return getUserLoginId();
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				return getUserPrefTypeId();
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				return getUserPrefDataType();
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				return getUserPrefValue();
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
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				setUserPrefTypeId((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				setUserPrefDataType((String)newValue);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				setUserPrefValue((String)newValue);
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
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				setUserPrefTypeId(USER_PREF_TYPE_ID_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				setUserPrefDataType(USER_PREF_DATA_TYPE_EDEFAULT);
				return;
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				setUserPrefValue(USER_PREF_VALUE_EDEFAULT);
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
			case UserPackage.USER_PREFERENCE__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case UserPackage.USER_PREFERENCE__USER_PREF_TYPE_ID:
				return USER_PREF_TYPE_ID_EDEFAULT == null ? userPrefTypeId != null : !USER_PREF_TYPE_ID_EDEFAULT.equals(userPrefTypeId);
			case UserPackage.USER_PREFERENCE__USER_PREF_DATA_TYPE:
				return USER_PREF_DATA_TYPE_EDEFAULT == null ? userPrefDataType != null : !USER_PREF_DATA_TYPE_EDEFAULT.equals(userPrefDataType);
			case UserPackage.USER_PREFERENCE__USER_PREF_VALUE:
				return USER_PREF_VALUE_EDEFAULT == null ? userPrefValue != null : !USER_PREF_VALUE_EDEFAULT.equals(userPrefValue);
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
		result.append(" (userLoginId: ");
		result.append(userLoginId);
		result.append(", userPrefTypeId: ");
		result.append(userPrefTypeId);
		result.append(", userPrefDataType: ");
		result.append(userPrefDataType);
		result.append(", userPrefValue: ");
		result.append(userPrefValue);
		result.append(')');
		return result.toString();
	}

} //UserPreferenceImpl
