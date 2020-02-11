/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login Security Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getQuestionEnumId <em>Question Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getSecurityAnswer <em>Security Answer</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSecurityQuestion()
 * @model
 * @generated
 */
public interface UserLoginSecurityQuestion extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Question Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Enum Id</em>' reference.
	 * @see #setQuestionEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSecurityQuestion_QuestionEnumId()
	 * @model keys="enumId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getQuestionEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getQuestionEnumId <em>Question Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Enum Id</em>' reference.
	 * @see #getQuestionEnumId()
	 * @generated
	 */
	void setQuestionEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Security Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Answer</em>' attribute.
	 * @see #setSecurityAnswer(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSecurityQuestion_SecurityAnswer()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getSecurityAnswer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getSecurityAnswer <em>Security Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Answer</em>' attribute.
	 * @see #getSecurityAnswer()
	 * @generated
	 */
	void setSecurityAnswer(String value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' reference.
	 * @see #setUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSecurityQuestion_UserLoginId()
	 * @model keys="userLoginId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getUserLoginId <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' reference.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(UserLogin value);

} // UserLoginSecurityQuestion
