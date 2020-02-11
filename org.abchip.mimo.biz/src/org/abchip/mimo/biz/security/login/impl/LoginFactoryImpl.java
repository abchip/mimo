/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import org.abchip.mimo.biz.security.login.*;
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
public class LoginFactoryImpl extends EFactoryImpl implements LoginFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoginFactory init() {
		try {
			LoginFactory theLoginFactory = (LoginFactory)EPackage.Registry.INSTANCE.getEFactory(LoginPackage.eNS_URI);
			if (theLoginFactory != null) {
				return theLoginFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoginFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginFactoryImpl() {
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
			case LoginPackage.USER_LOGIN: return (EObject)createUserLogin();
			case LoginPackage.USER_LOGIN_HISTORY: return (EObject)createUserLoginHistory();
			case LoginPackage.USER_LOGIN_PASSWORD_HISTORY: return (EObject)createUserLoginPasswordHistory();
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION: return (EObject)createUserLoginSecurityQuestion();
			case LoginPackage.USER_LOGIN_SESSION: return (EObject)createUserLoginSession();
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
	public UserLogin createUserLogin() {
		UserLoginImpl userLogin = new UserLoginImpl();
		return userLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLoginHistory createUserLoginHistory() {
		UserLoginHistoryImpl userLoginHistory = new UserLoginHistoryImpl();
		return userLoginHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLoginPasswordHistory createUserLoginPasswordHistory() {
		UserLoginPasswordHistoryImpl userLoginPasswordHistory = new UserLoginPasswordHistoryImpl();
		return userLoginPasswordHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLoginSecurityQuestion createUserLoginSecurityQuestion() {
		UserLoginSecurityQuestionImpl userLoginSecurityQuestion = new UserLoginSecurityQuestionImpl();
		return userLoginSecurityQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLoginSession createUserLoginSession() {
		UserLoginSessionImpl userLoginSession = new UserLoginSessionImpl();
		return userLoginSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoginPackage getLoginPackage() {
		return (LoginPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoginPackage getPackage() {
		return LoginPackage.eINSTANCE;
	}

} //LoginFactoryImpl
