/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Security Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getQuestionEnumId <em>Question Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getSecurityAnswer <em>Security Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginSecurityQuestionImpl extends BizEntityImpl implements UserLoginSecurityQuestion {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginSecurityQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getQuestionEnumId() {
		return (Enumeration)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionEnumId(Enumeration newQuestionEnumId) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, newQuestionEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityAnswer() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityAnswer(String newSecurityAnswer) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER, newSecurityAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		return (UserLogin)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, newUserLoginId);
	}

} //UserLoginSecurityQuestionImpl
