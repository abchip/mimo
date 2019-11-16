/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.BizProviderUser;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biz Provider User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderUserImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderUserImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BizProviderUserImpl extends BizEntityImpl implements BizProviderUser {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizProviderUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_PROVIDER_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return (String)eGet(BizPackage.Literals.BIZ_PROVIDER_USER__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_USER__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return (String)eGet(BizPackage.Literals.BIZ_PROVIDER_USER__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_USER__PASSWORD, newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return this.getUser();
	}

} //BizProviderUserImpl
