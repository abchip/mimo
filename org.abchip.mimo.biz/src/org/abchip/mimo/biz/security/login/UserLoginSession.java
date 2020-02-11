/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSession#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSavedDate <em>Saved Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSessionData <em>Session Data</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSession()
 * @model annotation="mimo-ent-frame title='User Login History'"
 * @generated
 */
public interface UserLoginSession extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Saved Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saved Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saved Date</em>' attribute.
	 * @see #setSavedDate(Date)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSession_SavedDate()
	 * @model
	 * @generated
	 */
	Date getSavedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSavedDate <em>Saved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saved Date</em>' attribute.
	 * @see #getSavedDate()
	 * @generated
	 */
	void setSavedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Session Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Data</em>' attribute.
	 * @see #setSessionData(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSession_SessionData()
	 * @model
	 * @generated
	 */
	String getSessionData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSessionData <em>Session Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Data</em>' attribute.
	 * @see #getSessionData()
	 * @generated
	 */
	void setSessionData(String value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' attribute.
	 * @see #setUserLoginId(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginSession_UserLoginId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

} // UserLoginSession
