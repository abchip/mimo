/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Security Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getSecurityAnswer <em>Security Answer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getQuestionEnumId <em>Question Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl#getUserLoginId <em>User Login Id</em>}</li>
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
	 * The default value of the '{@link #getSecurityAnswer() <em>Security Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_ANSWER_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getSecurityAnswer() <em>Security Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityAnswer()
	 * @generated
	 * @ordered
	 */
	protected String securityAnswer = SECURITY_ANSWER_EDEFAULT;


	/**
	 * The cached value of the '{@link #getQuestionEnumId() <em>Question Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration questionEnumId;


	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLoginId;

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
		if (questionEnumId != null && ((EObject)questionEnumId).eIsProxy()) {
			InternalEObject oldQuestionEnumId = (InternalEObject)questionEnumId;
			questionEnumId = (Enumeration)eResolveProxy(oldQuestionEnumId);
			if (questionEnumId != oldQuestionEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, oldQuestionEnumId, questionEnumId));
			}
		}
		return questionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetQuestionEnumId() {
		return questionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionEnumId(Enumeration newQuestionEnumId) {
		Enumeration oldQuestionEnumId = questionEnumId;
		questionEnumId = newQuestionEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, oldQuestionEnumId, questionEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityAnswer() {
		return securityAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityAnswer(String newSecurityAnswer) {
		String oldSecurityAnswer = securityAnswer;
		securityAnswer = newSecurityAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER, oldSecurityAnswer, securityAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		if (userLoginId != null && ((EObject)userLoginId).eIsProxy()) {
			InternalEObject oldUserLoginId = (InternalEObject)userLoginId;
			userLoginId = (UserLogin)eResolveProxy(oldUserLoginId);
			if (userLoginId != oldUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, oldUserLoginId, userLoginId));
			}
		}
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		UserLogin oldUserLoginId = userLoginId;
		userLoginId = newUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				return getSecurityAnswer();
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				if (resolve) return getQuestionEnumId();
				return basicGetQuestionEnumId();
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				setSecurityAnswer((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				setQuestionEnumId((Enumeration)newValue);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				setSecurityAnswer(SECURITY_ANSWER_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				setQuestionEnumId((Enumeration)null);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				return SECURITY_ANSWER_EDEFAULT == null ? securityAnswer != null : !SECURITY_ANSWER_EDEFAULT.equals(securityAnswer);
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				return questionEnumId != null;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				return userLoginId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (securityAnswer: ");
		result.append(securityAnswer);
		result.append(')');
		return result.toString();
	}

} //UserLoginSecurityQuestionImpl
