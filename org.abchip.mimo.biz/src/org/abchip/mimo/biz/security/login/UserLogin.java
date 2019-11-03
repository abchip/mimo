/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getCurrentPassword <em>Current Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledBy <em>Disabled By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledDateTime <em>Disabled Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getExternalAuthId <em>External Auth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#isHasLoggedOut <em>Has Logged Out</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#isIsSystem <em>Is System</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getLastCurrencyUom <em>Last Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getLastLocale <em>Last Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getLastTimeZone <em>Last Time Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getPasswordHint <em>Password Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#isRequirePasswordChange <em>Require Password Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getSuccessiveFailedLogins <em>Successive Failed Logins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLdapDn <em>User Ldap Dn</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginHistories <em>User Login Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginPasswordHistories <em>User Login Password Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.UserLogin#getUserPreferences <em>User Preferences</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin()
 * @model
 * @generated
 */
public interface UserLogin extends BizEntity {
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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_CurrentPassword()
	 * @model
	 * @generated
	 */
	String getCurrentPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getCurrentPassword <em>Current Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Password</em>' attribute.
	 * @see #getCurrentPassword()
	 * @generated
	 */
	void setCurrentPassword(String value);

	/**
	 * Returns the value of the '<em><b>Disabled By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled By</em>' attribute.
	 * @see #setDisabledBy(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_DisabledBy()
	 * @model
	 * @generated
	 */
	String getDisabledBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledBy <em>Disabled By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled By</em>' attribute.
	 * @see #getDisabledBy()
	 * @generated
	 */
	void setDisabledBy(String value);

	/**
	 * Returns the value of the '<em><b>Disabled Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Date Time</em>' attribute.
	 * @see #setDisabledDateTime(Date)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_DisabledDateTime()
	 * @model
	 * @generated
	 */
	Date getDisabledDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledDateTime <em>Disabled Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Date Time</em>' attribute.
	 * @see #getDisabledDateTime()
	 * @generated
	 */
	void setDisabledDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>External Auth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Auth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Auth Id</em>' attribute.
	 * @see #setExternalAuthId(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_ExternalAuthId()
	 * @model
	 * @generated
	 */
	String getExternalAuthId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getExternalAuthId <em>External Auth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Auth Id</em>' attribute.
	 * @see #getExternalAuthId()
	 * @generated
	 */
	void setExternalAuthId(String value);

	/**
	 * Returns the value of the '<em><b>Has Logged Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Logged Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Logged Out</em>' attribute.
	 * @see #setHasLoggedOut(boolean)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_HasLoggedOut()
	 * @model
	 * @generated
	 */
	boolean isHasLoggedOut();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#isHasLoggedOut <em>Has Logged Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Logged Out</em>' attribute.
	 * @see #isHasLoggedOut()
	 * @generated
	 */
	void setHasLoggedOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Is System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is System</em>' attribute.
	 * @see #setIsSystem(boolean)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_IsSystem()
	 * @model
	 * @generated
	 */
	boolean isIsSystem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#isIsSystem <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is System</em>' attribute.
	 * @see #isIsSystem()
	 * @generated
	 */
	void setIsSystem(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Currency Uom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Currency Uom</em>' attribute.
	 * @see #setLastCurrencyUom(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_LastCurrencyUom()
	 * @model
	 * @generated
	 */
	String getLastCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastCurrencyUom <em>Last Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Currency Uom</em>' attribute.
	 * @see #getLastCurrencyUom()
	 * @generated
	 */
	void setLastCurrencyUom(String value);

	/**
	 * Returns the value of the '<em><b>Last Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Locale</em>' attribute.
	 * @see #setLastLocale(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_LastLocale()
	 * @model
	 * @generated
	 */
	String getLastLocale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastLocale <em>Last Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Locale</em>' attribute.
	 * @see #getLastLocale()
	 * @generated
	 */
	void setLastLocale(String value);

	/**
	 * Returns the value of the '<em><b>Last Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Time Zone</em>' attribute.
	 * @see #setLastTimeZone(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_LastTimeZone()
	 * @model
	 * @generated
	 */
	String getLastTimeZone();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastTimeZone <em>Last Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Time Zone</em>' attribute.
	 * @see #getLastTimeZone()
	 * @generated
	 */
	void setLastTimeZone(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Password Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Hint</em>' attribute.
	 * @see #setPasswordHint(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_PasswordHint()
	 * @model
	 * @generated
	 */
	String getPasswordHint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getPasswordHint <em>Password Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Hint</em>' attribute.
	 * @see #getPasswordHint()
	 * @generated
	 */
	void setPasswordHint(String value);

	/**
	 * Returns the value of the '<em><b>Require Password Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Password Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Password Change</em>' attribute.
	 * @see #setRequirePasswordChange(boolean)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_RequirePasswordChange()
	 * @model
	 * @generated
	 */
	boolean isRequirePasswordChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#isRequirePasswordChange <em>Require Password Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Password Change</em>' attribute.
	 * @see #isRequirePasswordChange()
	 * @generated
	 */
	void setRequirePasswordChange(boolean value);

	/**
	 * Returns the value of the '<em><b>Successive Failed Logins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successive Failed Logins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successive Failed Logins</em>' attribute.
	 * @see #setSuccessiveFailedLogins(long)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_SuccessiveFailedLogins()
	 * @model
	 * @generated
	 */
	long getSuccessiveFailedLogins();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getSuccessiveFailedLogins <em>Successive Failed Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successive Failed Logins</em>' attribute.
	 * @see #getSuccessiveFailedLogins()
	 * @generated
	 */
	void setSuccessiveFailedLogins(long value);

	/**
	 * Returns the value of the '<em><b>User Ldap Dn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Ldap Dn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Ldap Dn</em>' attribute.
	 * @see #setUserLdapDn(String)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLdapDn()
	 * @model
	 * @generated
	 */
	String getUserLdapDn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLdapDn <em>User Ldap Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Ldap Dn</em>' attribute.
	 * @see #getUserLdapDn()
	 * @generated
	 */
	void setUserLdapDn(String value);

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
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLoginId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>User Login Histories</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Histories</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Histories</em>' attribute list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLoginHistories()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserLoginHistory'"
	 * @generated
	 */
	List<String> getUserLoginHistories();

	/**
	 * Returns the value of the '<em><b>User Login Password Histories</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Password Histories</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Password Histories</em>' attribute list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLoginPasswordHistories()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserLoginPasswordHistory'"
	 * @generated
	 */
	List<String> getUserLoginPasswordHistories();

	/**
	 * Returns the value of the '<em><b>User Preferences</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Preferences</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Preferences</em>' attribute list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserPreferences()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserPreference'"
	 * @generated
	 */
	List<String> getUserPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Timesheet' route='approvedByUserLoginId'"
	 * @generated
	 */
	List<String> approvedByTimesheets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobSandbox' route='authUserLoginId'"
	 * @generated
	 */
	List<String> authJobSandboxs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByBudgetStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByCustRequestStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByOrderItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='RequirementStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByRequirementStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByReturnStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByShipmentStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TestingStatus' route='changeByUserLoginId'"
	 * @generated
	 */
	List<String> changeByTestingStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PicklistStatusHistory' route='changeUserLoginId'"
	 * @generated
	 */
	List<String> changePicklistStatusHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPriceChange' route='changedByUserLogin'"
	 * @generated
	 */
	List<String> changedByProductPriceChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactList' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByContactLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResource' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByDataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='createdBy'"
	 * @generated
	 */
	List<String> createdByOrderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Party' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByParties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoCode' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByProductPromoCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromo' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByProductPromos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> createdByProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecast' route='createdByUserLoginId'"
	 * @generated
	 */
	List<String> createdBySalesForecasts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem' route='dontCancelSetUserLogin'"
	 * @generated
	 */
	List<String> dontCancelSetOrderItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ItemIssuance' route='issuedByUserLoginId'"
	 * @generated
	 */
	List<String> issuedByItemIssuances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactList' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByContactLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResource' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByDataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Party' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByParties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoCode' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByProductPromoCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromo' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByProductPromos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='lastModifiedByUserLogin'"
	 * @generated
	 */
	List<String> lastModifiedByProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastHistory' route='modifiedByUserLoginId'"
	 * @generated
	 */
	List<String> modifiedBySalesForecastHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecast' route='modifiedByUserLoginId'"
	 * @generated
	 */
	List<String> modifiedBySalesForecasts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> orderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemChange' route='changeUserLogin'"
	 * @generated
	 */
	List<String> orderItemChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderPaymentPreference' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> orderPaymentPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderStatus' route='statusUserLogin'"
	 * @generated
	 */
	List<String> orderStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductReview' route='userLoginId'"
	 * @generated
	 */
	List<String> productReviews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAdjustment' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> quoteAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> returnAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='createdBy'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobSandbox' route='runAsUser'"
	 * @generated
	 */
	List<String> runAsJobSandboxs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity' route='createdByUserLogin'"
	 * @generated
	 */
	List<String> salesOpportunities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityHistory' route='modifiedByUserLogin'"
	 * @generated
	 */
	List<String> salesOpportunityHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentReceipt' route='receivedByUserLoginId'"
	 * @generated
	 */
	List<String> shipmentReceipts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserLoginSecurityQuestion' route='userLoginId'"
	 * @generated
	 */
	List<String> userLoginSecurityQuestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Visitor' route='userLoginId'"
	 * @generated
	 */
	List<String> visitors();

} // UserLogin
