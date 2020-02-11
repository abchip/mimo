/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.passport.PassportPackage
 * @generated
 */
public interface PassportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PassportFactory eINSTANCE = org.abchip.mimo.biz.passport.impl.PassportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Git Hub User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Hub User</em>'.
	 * @generated
	 */
	GitHubUser createGitHubUser();

	/**
	 * Returns a new object of class '<em>Google User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Google User</em>'.
	 * @generated
	 */
	GoogleUser createGoogleUser();

	/**
	 * Returns a new object of class '<em>Linked In User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linked In User</em>'.
	 * @generated
	 */
	LinkedInUser createLinkedInUser();

	/**
	 * Returns a new object of class '<em>OAuth2 Git Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Git Hub</em>'.
	 * @generated
	 */
	OAuth2GitHub createOAuth2GitHub();

	/**
	 * Returns a new object of class '<em>OAuth2 Google</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Google</em>'.
	 * @generated
	 */
	OAuth2Google createOAuth2Google();

	/**
	 * Returns a new object of class '<em>OAuth2 Linked In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Linked In</em>'.
	 * @generated
	 */
	OAuth2LinkedIn createOAuth2LinkedIn();

	/**
	 * Returns a new object of class '<em>Third Party Login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Third Party Login</em>'.
	 * @generated
	 */
	ThirdPartyLogin createThirdPartyLogin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PassportPackage getPassportPackage();

} //PassportFactory
