/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getQuestionEnumId() <em>Question Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionEnumId() <em>Question Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionEnumId()
	 * @generated
	 * @ordered
	 */
	protected String questionEnumId = QUESTION_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String userLoginId = USER_LOGIN_ID_EDEFAULT;


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
	public String getQuestionEnumId() {
		return questionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionEnumId(String newQuestionEnumId) {
		String oldQuestionEnumId = questionEnumId;
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
	public String getUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		String oldUserLoginId = userLoginId;
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
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				return getQuestionEnumId();
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				return getUserLoginId();
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				return getSecurityAnswer();
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
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				setQuestionEnumId((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				setSecurityAnswer((String)newValue);
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
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				setQuestionEnumId(QUESTION_ENUM_ID_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				setSecurityAnswer(SECURITY_ANSWER_EDEFAULT);
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
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID:
				return QUESTION_ENUM_ID_EDEFAULT == null ? questionEnumId != null : !QUESTION_ENUM_ID_EDEFAULT.equals(questionEnumId);
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case LoginPackage.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER:
				return SECURITY_ANSWER_EDEFAULT == null ? securityAnswer != null : !SECURITY_ANSWER_EDEFAULT.equals(securityAnswer);
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
		result.append(" (questionEnumId: ");
		result.append(questionEnumId);
		result.append(", userLoginId: ");
		result.append(userLoginId);
		result.append(", securityAnswer: ");
		result.append(securityAnswer);
		result.append(')');
		return result.toString();
	}

} //UserLoginSecurityQuestionImpl
