/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport.impl;

import org.abchip.mimo.biz.passport.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PassportFactoryImpl extends EFactoryImpl implements PassportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PassportFactory init() {
		try {
			PassportFactory thePassportFactory = (PassportFactory)EPackage.Registry.INSTANCE.getEFactory(PassportPackage.eNS_URI);
			if (thePassportFactory != null) {
				return thePassportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PassportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PassportPackage.GIT_HUB_USER: return (EObject)createGitHubUser();
			case PassportPackage.GOOGLE_USER: return (EObject)createGoogleUser();
			case PassportPackage.LINKED_IN_USER: return (EObject)createLinkedInUser();
			case PassportPackage.OAUTH2_GIT_HUB: return (EObject)createOAuth2GitHub();
			case PassportPackage.OAUTH2_GOOGLE: return (EObject)createOAuth2Google();
			case PassportPackage.OAUTH2_LINKED_IN: return (EObject)createOAuth2LinkedIn();
			case PassportPackage.THIRD_PARTY_LOGIN: return (EObject)createThirdPartyLogin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitHubUser createGitHubUser() {
		GitHubUserImpl gitHubUser = new GitHubUserImpl();
		return gitHubUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoogleUser createGoogleUser() {
		GoogleUserImpl googleUser = new GoogleUserImpl();
		return googleUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkedInUser createLinkedInUser() {
		LinkedInUserImpl linkedInUser = new LinkedInUserImpl();
		return linkedInUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2GitHub createOAuth2GitHub() {
		OAuth2GitHubImpl oAuth2GitHub = new OAuth2GitHubImpl();
		return oAuth2GitHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2Google createOAuth2Google() {
		OAuth2GoogleImpl oAuth2Google = new OAuth2GoogleImpl();
		return oAuth2Google;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2LinkedIn createOAuth2LinkedIn() {
		OAuth2LinkedInImpl oAuth2LinkedIn = new OAuth2LinkedInImpl();
		return oAuth2LinkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThirdPartyLogin createThirdPartyLogin() {
		ThirdPartyLoginImpl thirdPartyLogin = new ThirdPartyLoginImpl();
		return thirdPartyLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassportPackage getPassportPackage() {
		return (PassportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PassportPackage getPackage() {
		return PassportPackage.eINSTANCE;
	}

} //PassportFactoryImpl
