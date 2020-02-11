/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.user.UserPreference;
import org.abchip.mimo.biz.party.party.Party;

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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='For use with external authentication; the userLdapDn should be replaced with this'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format length='10'"
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
	 * @model annotation="mimo-ent-format length='60'"
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
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.login.UserLogin#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * @model required="true"
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
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
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
	 * @model annotation="mimo-ent-slot help='The user\'s LDAP Distinguished Name - used for LDAP authentication'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>User Login Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.security.login.UserLoginHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLoginHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<UserLoginHistory> getUserLoginHistories();

	/**
	 * Returns the value of the '<em><b>User Login Password Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Password Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Password Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserLoginPasswordHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<UserLoginPasswordHistory> getUserLoginPasswordHistories();

	/**
	 * Returns the value of the '<em><b>User Preferences</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.common.user.UserPreference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Preferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Preferences</em>' reference list.
	 * @see org.abchip.mimo.biz.security.login.LoginPackage#getUserLogin_UserPreferences()
	 * @model derived="true"
	 * @generated
	 */
	List<UserPreference> getUserPreferences();

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
	 *        annotation="mimo-ent-format length='255'"
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

} // UserLogin
