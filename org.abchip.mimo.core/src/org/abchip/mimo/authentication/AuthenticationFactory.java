/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.authentication.AuthenticationPackage
 * @generated
 */
public interface AuthenticationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthenticationFactory eINSTANCE = org.abchip.mimo.authentication.impl.AuthenticationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Admin Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin Key</em>'.
	 * @generated
	 */
	AuthenticationAdminKey createAuthenticationAdminKey();

	/**
	 * Returns a new object of class '<em>Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous</em>'.
	 * @generated
	 */
	AuthenticationAnonymous createAuthenticationAnonymous();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	AuthenticationManager createAuthenticationManager();

	/**
	 * Returns a new object of class '<em>User Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Password</em>'.
	 * @generated
	 */
	AuthenticationUserPassword createAuthenticationUserPassword();

	/**
	 * Returns a new object of class '<em>User Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Token</em>'.
	 * @generated
	 */
	AuthenticationUserToken createAuthenticationUserToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuthenticationPackage getAuthenticationPackage();

} //AuthenticationFactory
