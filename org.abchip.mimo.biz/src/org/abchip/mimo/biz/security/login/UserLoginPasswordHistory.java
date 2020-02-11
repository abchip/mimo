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
 * A representation of the model object '<em><b>User Login Password History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getCurrentPassword <em>Current Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginPasswordHistory()
 * @model
 * @generated
 */
public interface UserLoginPasswordHistory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Current Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Password</em>' attribute.
	 * @see #setCurrentPassword(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginPasswordHistory_CurrentPassword()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCurrentPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getCurrentPassword <em>Current Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Password</em>' attribute.
	 * @see #getCurrentPassword()
	 * @generated
	 */
	void setCurrentPassword(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginPasswordHistory_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginPasswordHistory_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginPasswordHistory_UserLoginId()
	 * @model keys="userLoginId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getUserLoginId <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' reference.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(UserLogin value);

} // UserLoginPasswordHistory
