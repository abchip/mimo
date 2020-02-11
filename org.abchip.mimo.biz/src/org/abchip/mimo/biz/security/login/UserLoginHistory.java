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
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getOriginUserLoginId <em>Origin User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPasswordUsed <em>Password Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#isSuccessfulLogin <em>Successful Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory()
 * @model
 * @generated
 */
public interface UserLoginHistory extends BizEntity {
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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Origin User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin User Login Id</em>' reference.
	 * @see #setOriginUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_OriginUserLoginId()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getOriginUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getOriginUserLoginId <em>Origin User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin User Login Id</em>' reference.
	 * @see #getOriginUserLoginId()
	 * @generated
	 */
	void setOriginUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Password Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Used</em>' attribute.
	 * @see #setPasswordUsed(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_PasswordUsed()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPasswordUsed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPasswordUsed <em>Password Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Used</em>' attribute.
	 * @see #getPasswordUsed()
	 * @generated
	 */
	void setPasswordUsed(String value);

	/**
	 * Returns the value of the '<em><b>Successful Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful Login</em>' attribute.
	 * @see #setSuccessfulLogin(boolean)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_SuccessfulLogin()
	 * @model
	 * @generated
	 */
	boolean isSuccessfulLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#isSuccessfulLogin <em>Successful Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful Login</em>' attribute.
	 * @see #isSuccessfulLogin()
	 * @generated
	 */
	void setSuccessfulLogin(boolean value);

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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getThruDate <em>Thru Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_UserLoginId()
	 * @model keys="userLoginId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getUserLoginId <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' reference.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLoginHistory_VisitId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

} // UserLoginHistory
