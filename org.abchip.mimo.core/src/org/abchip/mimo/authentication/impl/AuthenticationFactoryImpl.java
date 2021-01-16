/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication.impl;

import org.abchip.mimo.authentication.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AuthenticationFactoryImpl extends EFactoryImpl implements AuthenticationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthenticationFactory init() {
		try {
			AuthenticationFactory theAuthenticationFactory = (AuthenticationFactory)EPackage.Registry.INSTANCE.getEFactory(AuthenticationPackage.eNS_URI);
			if (theAuthenticationFactory != null) {
				return theAuthenticationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthenticationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationFactoryImpl() {
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
			case AuthenticationPackage.AUTHENTICATION_ADMIN_KEY: return (EObject)createAuthenticationAdminKey();
			case AuthenticationPackage.AUTHENTICATION_ANONYMOUS: return (EObject)createAuthenticationAnonymous();
			case AuthenticationPackage.AUTHENTICATION_MANAGER: return (EObject)createAuthenticationManager();
			case AuthenticationPackage.AUTHENTICATION_USER_PASSWORD: return (EObject)createAuthenticationUserPassword();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN: return (EObject)createAuthenticationUserToken();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AuthenticationPackage.AUTHENTICATION_EXCEPTION:
				return createAuthenticationExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AuthenticationPackage.AUTHENTICATION_EXCEPTION:
				return convertAuthenticationExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationAdminKey createAuthenticationAdminKey() {
		AuthenticationAdminKeyImpl authenticationAdminKey = new AuthenticationAdminKeyImpl();
		return authenticationAdminKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationAnonymous createAuthenticationAnonymous() {
		AuthenticationAnonymousImpl authenticationAnonymous = new AuthenticationAnonymousImpl();
		return authenticationAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationManager createAuthenticationManager() {
		AuthenticationManagerImpl authenticationManager = new AuthenticationManagerImpl();
		return authenticationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationUserPassword createAuthenticationUserPassword() {
		AuthenticationUserPasswordImpl authenticationUserPassword = new AuthenticationUserPasswordImpl();
		return authenticationUserPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationUserToken createAuthenticationUserToken() {
		AuthenticationUserTokenImpl authenticationUserToken = new AuthenticationUserTokenImpl();
		return authenticationUserToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationException createAuthenticationExceptionFromString(EDataType eDataType, String initialValue) {
		return (AuthenticationException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationPackage getAuthenticationPackage() {
		return (AuthenticationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthenticationPackage getPackage() {
		return AuthenticationPackage.eINSTANCE;
	}

} //AuthenticationFactoryImpl
