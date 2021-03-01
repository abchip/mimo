/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication.impl;

import javax.inject.Inject;

import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationPackage;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AuthenticationManagerImpl extends MinimalEObjectImpl.Container implements AuthenticationManager {

	@Inject
	private ProviderConfig providerConfig;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AuthenticationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationPackage.Literals.AUTHENTICATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ContextHandler login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException {

		ProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			throw new AuthenticationException("Invalid anonymous access");

		AuthenticationUserPassword authenticationUserPassword = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setTenant(authentication.getTenant());
		authenticationUserPassword.setUser(user.getUser());
		authenticationUserPassword.setPassword(user.getPassword());

		ContextHandler context = this.login(contextId, authenticationUserPassword);
		if (context != null)
			context.getContext().getContextDescription().setAnonymous(true);

		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ContextHandler login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ContextHandler login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ContextHandler login(String contextId, AuthenticationAdminKey authentication) throws AuthenticationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // AuthenticationManagerImpl
