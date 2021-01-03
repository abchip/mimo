/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

import org.abchip.mimo.context.ContextHandler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationManager()
 * @model
 * @generated
 */
public interface AuthenticationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authenticationRequired="true" createRequired="true"
	 * @generated
	 */
	boolean checkLogin(AuthenticationUserToken authentication, boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.authentication.AuthenticationException" contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextHandler login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.authentication.AuthenticationException" contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextHandler login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.authentication.AuthenticationException" contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextHandler login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.authentication.AuthenticationException" contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextHandler login(String contextId, AuthenticationAdminKey authentication) throws AuthenticationException;

} // AuthenticationManager
