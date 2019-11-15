/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication User Password</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationUserPasswordImpl extends EntityImpl implements AuthenticationUserPassword {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationUserPasswordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__PASSWORD, newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__TENANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_PASSWORD__TENANT, newTenant);
	}
} //AuthenticationUserPasswordImpl
