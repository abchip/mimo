/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationManager()
 * @model interface="true" abstract="true"
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
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	Context login(String contextId, AuthenticationAnonymous authentication);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	Context login(String contextId, AuthenticationUserPassword authentication);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	Context login(String contextId, AuthenticationUserToken authentication);

} // AuthenticationManager
