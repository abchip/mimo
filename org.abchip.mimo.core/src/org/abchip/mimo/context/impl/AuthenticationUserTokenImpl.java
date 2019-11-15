/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication User Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl#getIdToken <em>Id Token</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationUserTokenImpl extends EntityImpl implements AuthenticationUserToken {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationUserTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.AUTHENTICATION_USER_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessToken() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessToken(String newAccessToken) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN, newAccessToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdToken() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__ID_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdToken(String newIdToken) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__ID_TOKEN, newIdToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicture() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__PICTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(String newPicture) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__PICTURE, newPicture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return (String)eGet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eSet(ContextPackage.Literals.AUTHENTICATION_USER_TOKEN__USER, newUser);
	}

} //AuthenticationUserTokenImpl
