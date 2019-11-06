/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.user.impl;

import java.util.List;

import org.abchip.mimo.biz.common.user.UserPackage;
import org.abchip.mimo.biz.common.user.UserPrefGroupType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Pref Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserPrefGroupTypeImpl extends BizEntityImpl implements UserPrefGroupType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getUserPrefGroupTypeId() <em>User Pref Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PREF_GROUP_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPrefGroupTypeId() <em>User Pref Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrefGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected String userPrefGroupTypeId = USER_PREF_GROUP_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserPrefGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.USER_PREF_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> userPreferences() {
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
	public String getUserPrefGroupTypeId() {
		return userPrefGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefGroupTypeId(String newUserPrefGroupTypeId) {
		userPrefGroupTypeId = newUserPrefGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID:
				return getUserPrefGroupTypeId();
			case UserPackage.USER_PREF_GROUP_TYPE__DESCRIPTION:
				return getDescription();
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
			case UserPackage.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID:
				setUserPrefGroupTypeId((String)newValue);
				return;
			case UserPackage.USER_PREF_GROUP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case UserPackage.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID:
				setUserPrefGroupTypeId(USER_PREF_GROUP_TYPE_ID_EDEFAULT);
				return;
			case UserPackage.USER_PREF_GROUP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case UserPackage.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID:
				return USER_PREF_GROUP_TYPE_ID_EDEFAULT == null ? userPrefGroupTypeId != null : !USER_PREF_GROUP_TYPE_ID_EDEFAULT.equals(userPrefGroupTypeId);
			case UserPackage.USER_PREF_GROUP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (userPrefGroupTypeId: ");
		result.append(userPrefGroupTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UserPrefGroupTypeImpl
