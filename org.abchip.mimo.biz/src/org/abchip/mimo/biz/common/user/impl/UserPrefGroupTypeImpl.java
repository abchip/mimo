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
		return (String)eGet(UserPackage.Literals.USER_PREF_GROUP_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(UserPackage.Literals.USER_PREF_GROUP_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPrefGroupTypeId() {
		return (String)eGet(UserPackage.Literals.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPrefGroupTypeId(String newUserPrefGroupTypeId) {
		eSet(UserPackage.Literals.USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID, newUserPrefGroupTypeId);
	}

} //UserPrefGroupTypeImpl
