/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getCurrentPassword <em>Current Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getDisabledBy <em>Disabled By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getDisabledDateTime <em>Disabled Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getExternalAuthId <em>External Auth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#isHasLoggedOut <em>Has Logged Out</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#isIsSystem <em>Is System</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getLastCurrencyUom <em>Last Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getLastLocale <em>Last Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getLastTimeZone <em>Last Time Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getPasswordHint <em>Password Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#isRequirePasswordChange <em>Require Password Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getSuccessiveFailedLogins <em>Successive Failed Logins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getUserLdapDn <em>User Ldap Dn</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getUserLoginHistories <em>User Login Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getUserLoginPasswordHistories <em>User Login Password Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl#getUserPreferences <em>User Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginImpl extends BizEntityImpl implements UserLogin {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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
	 * The default value of the '{@link #getCurrentPassword() <em>Current Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_PASSWORD_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getCurrentPassword() <em>Current Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPassword()
	 * @generated
	 * @ordered
	 */
	protected String currentPassword = CURRENT_PASSWORD_EDEFAULT;


	/**
	 * The default value of the '{@link #getDisabledBy() <em>Disabled By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledBy()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLED_BY_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getDisabledBy() <em>Disabled By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledBy()
	 * @generated
	 * @ordered
	 */
	protected String disabledBy = DISABLED_BY_EDEFAULT;


	/**
	 * The default value of the '{@link #getDisabledDateTime() <em>Disabled Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DISABLED_DATE_TIME_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getDisabledDateTime() <em>Disabled Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date disabledDateTime = DISABLED_DATE_TIME_EDEFAULT;


	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;


	/**
	 * The default value of the '{@link #getExternalAuthId() <em>External Auth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAuthId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_AUTH_ID_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getExternalAuthId() <em>External Auth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAuthId()
	 * @generated
	 * @ordered
	 */
	protected String externalAuthId = EXTERNAL_AUTH_ID_EDEFAULT;


	/**
	 * The default value of the '{@link #isHasLoggedOut() <em>Has Logged Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLoggedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_LOGGED_OUT_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isHasLoggedOut() <em>Has Logged Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLoggedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean hasLoggedOut = HAS_LOGGED_OUT_EDEFAULT;


	/**
	 * The default value of the '{@link #isIsSystem() <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYSTEM_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isIsSystem() <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean isSystem = IS_SYSTEM_EDEFAULT;


	/**
	 * The default value of the '{@link #getLastCurrencyUom() <em>Last Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CURRENCY_UOM_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getLastCurrencyUom() <em>Last Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected String lastCurrencyUom = LAST_CURRENCY_UOM_EDEFAULT;


	/**
	 * The default value of the '{@link #getLastLocale() <em>Last Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOCALE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getLastLocale() <em>Last Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocale()
	 * @generated
	 * @ordered
	 */
	protected String lastLocale = LAST_LOCALE_EDEFAULT;


	/**
	 * The default value of the '{@link #getLastTimeZone() <em>Last Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_TIME_ZONE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getLastTimeZone() <em>Last Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String lastTimeZone = LAST_TIME_ZONE_EDEFAULT;


	/**
	 * The default value of the '{@link #getPasswordHint() <em>Password Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHint()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_HINT_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getPasswordHint() <em>Password Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHint()
	 * @generated
	 * @ordered
	 */
	protected String passwordHint = PASSWORD_HINT_EDEFAULT;


	/**
	 * The default value of the '{@link #isRequirePasswordChange() <em>Require Password Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePasswordChange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_PASSWORD_CHANGE_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isRequirePasswordChange() <em>Require Password Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePasswordChange()
	 * @generated
	 * @ordered
	 */
	protected boolean requirePasswordChange = REQUIRE_PASSWORD_CHANGE_EDEFAULT;


	/**
	 * The default value of the '{@link #getSuccessiveFailedLogins() <em>Successive Failed Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessiveFailedLogins()
	 * @generated
	 * @ordered
	 */
	protected static final long SUCCESSIVE_FAILED_LOGINS_EDEFAULT = 0L;


	/**
	 * The cached value of the '{@link #getSuccessiveFailedLogins() <em>Successive Failed Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessiveFailedLogins()
	 * @generated
	 * @ordered
	 */
	protected long successiveFailedLogins = SUCCESSIVE_FAILED_LOGINS_EDEFAULT;


	/**
	 * The default value of the '{@link #getUserLdapDn() <em>User Ldap Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLdapDn()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_LDAP_DN_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getUserLdapDn() <em>User Ldap Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLdapDn()
	 * @generated
	 * @ordered
	 */
	protected String userLdapDn = USER_LDAP_DN_EDEFAULT;


	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getUserLoginHistories() <em>User Login Histories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userLoginHistories;


	/**
	 * The cached value of the '{@link #getUserLoginPasswordHistories() <em>User Login Password Histories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginPasswordHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userLoginPasswordHistories;


	/**
	 * The cached value of the '{@link #getUserPreferences() <em>User Preferences</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userPreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentPassword() {
		return currentPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPassword(String newCurrentPassword) {
		String oldCurrentPassword = currentPassword;
		currentPassword = newCurrentPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__CURRENT_PASSWORD, oldCurrentPassword, currentPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabledBy() {
		return disabledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledBy(String newDisabledBy) {
		String oldDisabledBy = disabledBy;
		disabledBy = newDisabledBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__DISABLED_BY, oldDisabledBy, disabledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDisabledDateTime() {
		return disabledDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledDateTime(Date newDisabledDateTime) {
		Date oldDisabledDateTime = disabledDateTime;
		disabledDateTime = newDisabledDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__DISABLED_DATE_TIME, oldDisabledDateTime, disabledDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalAuthId() {
		return externalAuthId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalAuthId(String newExternalAuthId) {
		String oldExternalAuthId = externalAuthId;
		externalAuthId = newExternalAuthId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__EXTERNAL_AUTH_ID, oldExternalAuthId, externalAuthId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasLoggedOut() {
		return hasLoggedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasLoggedOut(boolean newHasLoggedOut) {
		boolean oldHasLoggedOut = hasLoggedOut;
		hasLoggedOut = newHasLoggedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__HAS_LOGGED_OUT, oldHasLoggedOut, hasLoggedOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSystem() {
		return isSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSystem(boolean newIsSystem) {
		boolean oldIsSystem = isSystem;
		isSystem = newIsSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__IS_SYSTEM, oldIsSystem, isSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastCurrencyUom() {
		return lastCurrencyUom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCurrencyUom(String newLastCurrencyUom) {
		String oldLastCurrencyUom = lastCurrencyUom;
		lastCurrencyUom = newLastCurrencyUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__LAST_CURRENCY_UOM, oldLastCurrencyUom, lastCurrencyUom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLocale() {
		return lastLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLocale(String newLastLocale) {
		String oldLastLocale = lastLocale;
		lastLocale = newLastLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__LAST_LOCALE, oldLastLocale, lastLocale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastTimeZone() {
		return lastTimeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTimeZone(String newLastTimeZone) {
		String oldLastTimeZone = lastTimeZone;
		lastTimeZone = newLastTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__LAST_TIME_ZONE, oldLastTimeZone, lastTimeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordHint() {
		return passwordHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordHint(String newPasswordHint) {
		String oldPasswordHint = passwordHint;
		passwordHint = newPasswordHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__PASSWORD_HINT, oldPasswordHint, passwordHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePasswordChange() {
		return requirePasswordChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePasswordChange(boolean newRequirePasswordChange) {
		boolean oldRequirePasswordChange = requirePasswordChange;
		requirePasswordChange = newRequirePasswordChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__REQUIRE_PASSWORD_CHANGE, oldRequirePasswordChange, requirePasswordChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSuccessiveFailedLogins() {
		return successiveFailedLogins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessiveFailedLogins(long newSuccessiveFailedLogins) {
		long oldSuccessiveFailedLogins = successiveFailedLogins;
		successiveFailedLogins = newSuccessiveFailedLogins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS, oldSuccessiveFailedLogins, successiveFailedLogins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLdapDn() {
		return userLdapDn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLdapDn(String newUserLdapDn) {
		String oldUserLdapDn = userLdapDn;
		userLdapDn = newUserLdapDn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__USER_LDAP_DN, oldUserLdapDn, userLdapDn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getUserLoginHistories() {
		if (userLoginHistories == null) {
			userLoginHistories = new EDataTypeUniqueEList<String>(String.class, this, LoginPackage.USER_LOGIN__USER_LOGIN_HISTORIES);
		}
		return userLoginHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getUserLoginPasswordHistories() {
		if (userLoginPasswordHistories == null) {
			userLoginPasswordHistories = new EDataTypeUniqueEList<String>(String.class, this, LoginPackage.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES);
		}
		return userLoginPasswordHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getUserPreferences() {
		if (userPreferences == null) {
			userPreferences = new EDataTypeUniqueEList<String>(String.class, this, LoginPackage.USER_LOGIN__USER_PREFERENCES);
		}
		return userPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> approvedByTimesheets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> authJobSandboxs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByBudgetStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByCustRequestStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByOrderItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByRequirementStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByReturnStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByShipmentStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changeByTestingStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changePicklistStatusHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> changedByProductPriceChanges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByContactLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByContents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByDataResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByOrderHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByParties() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByProductPromoCodes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByProductPromos() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdByProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> createdBySalesForecasts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> dontCancelSetOrderItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> issuedByItemIssuances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByContactLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByContents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByDataResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByParties() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByProductPromoCodes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByProductPromos() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> lastModifiedByProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> modifiedBySalesForecastHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> modifiedBySalesForecasts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderItemChanges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderPaymentPreferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productReviews() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> runAsJobSandboxs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesOpportunities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesOpportunityHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentReceipts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> userLoginSecurityQuestions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> visitors() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN__USER_LOGIN_ID:
				return getUserLoginId();
			case LoginPackage.USER_LOGIN__CURRENT_PASSWORD:
				return getCurrentPassword();
			case LoginPackage.USER_LOGIN__DISABLED_BY:
				return getDisabledBy();
			case LoginPackage.USER_LOGIN__DISABLED_DATE_TIME:
				return getDisabledDateTime();
			case LoginPackage.USER_LOGIN__ENABLED:
				return isEnabled();
			case LoginPackage.USER_LOGIN__EXTERNAL_AUTH_ID:
				return getExternalAuthId();
			case LoginPackage.USER_LOGIN__HAS_LOGGED_OUT:
				return isHasLoggedOut();
			case LoginPackage.USER_LOGIN__IS_SYSTEM:
				return isIsSystem();
			case LoginPackage.USER_LOGIN__LAST_CURRENCY_UOM:
				return getLastCurrencyUom();
			case LoginPackage.USER_LOGIN__LAST_LOCALE:
				return getLastLocale();
			case LoginPackage.USER_LOGIN__LAST_TIME_ZONE:
				return getLastTimeZone();
			case LoginPackage.USER_LOGIN__PASSWORD_HINT:
				return getPasswordHint();
			case LoginPackage.USER_LOGIN__REQUIRE_PASSWORD_CHANGE:
				return isRequirePasswordChange();
			case LoginPackage.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS:
				return getSuccessiveFailedLogins();
			case LoginPackage.USER_LOGIN__USER_LDAP_DN:
				return getUserLdapDn();
			case LoginPackage.USER_LOGIN__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case LoginPackage.USER_LOGIN__USER_LOGIN_HISTORIES:
				return getUserLoginHistories();
			case LoginPackage.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES:
				return getUserLoginPasswordHistories();
			case LoginPackage.USER_LOGIN__USER_PREFERENCES:
				return getUserPreferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__CURRENT_PASSWORD:
				setCurrentPassword((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__DISABLED_BY:
				setDisabledBy((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__DISABLED_DATE_TIME:
				setDisabledDateTime((Date)newValue);
				return;
			case LoginPackage.USER_LOGIN__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case LoginPackage.USER_LOGIN__EXTERNAL_AUTH_ID:
				setExternalAuthId((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__HAS_LOGGED_OUT:
				setHasLoggedOut((Boolean)newValue);
				return;
			case LoginPackage.USER_LOGIN__IS_SYSTEM:
				setIsSystem((Boolean)newValue);
				return;
			case LoginPackage.USER_LOGIN__LAST_CURRENCY_UOM:
				setLastCurrencyUom((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__LAST_LOCALE:
				setLastLocale((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__LAST_TIME_ZONE:
				setLastTimeZone((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__PASSWORD_HINT:
				setPasswordHint((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__REQUIRE_PASSWORD_CHANGE:
				setRequirePasswordChange((Boolean)newValue);
				return;
			case LoginPackage.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS:
				setSuccessiveFailedLogins((Long)newValue);
				return;
			case LoginPackage.USER_LOGIN__USER_LDAP_DN:
				setUserLdapDn((String)newValue);
				return;
			case LoginPackage.USER_LOGIN__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case LoginPackage.USER_LOGIN__USER_LOGIN_HISTORIES:
				getUserLoginHistories().clear();
				getUserLoginHistories().addAll((Collection<? extends String>)newValue);
				return;
			case LoginPackage.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES:
				getUserLoginPasswordHistories().clear();
				getUserLoginPasswordHistories().addAll((Collection<? extends String>)newValue);
				return;
			case LoginPackage.USER_LOGIN__USER_PREFERENCES:
				getUserPreferences().clear();
				getUserPreferences().addAll((Collection<? extends String>)newValue);
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
			case LoginPackage.USER_LOGIN__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__CURRENT_PASSWORD:
				setCurrentPassword(CURRENT_PASSWORD_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__DISABLED_BY:
				setDisabledBy(DISABLED_BY_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__DISABLED_DATE_TIME:
				setDisabledDateTime(DISABLED_DATE_TIME_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__EXTERNAL_AUTH_ID:
				setExternalAuthId(EXTERNAL_AUTH_ID_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__HAS_LOGGED_OUT:
				setHasLoggedOut(HAS_LOGGED_OUT_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__IS_SYSTEM:
				setIsSystem(IS_SYSTEM_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__LAST_CURRENCY_UOM:
				setLastCurrencyUom(LAST_CURRENCY_UOM_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__LAST_LOCALE:
				setLastLocale(LAST_LOCALE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__LAST_TIME_ZONE:
				setLastTimeZone(LAST_TIME_ZONE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__PASSWORD_HINT:
				setPasswordHint(PASSWORD_HINT_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__REQUIRE_PASSWORD_CHANGE:
				setRequirePasswordChange(REQUIRE_PASSWORD_CHANGE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS:
				setSuccessiveFailedLogins(SUCCESSIVE_FAILED_LOGINS_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__USER_LDAP_DN:
				setUserLdapDn(USER_LDAP_DN_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN__PARTY_ID:
				setPartyId((Party)null);
				return;
			case LoginPackage.USER_LOGIN__USER_LOGIN_HISTORIES:
				getUserLoginHistories().clear();
				return;
			case LoginPackage.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES:
				getUserLoginPasswordHistories().clear();
				return;
			case LoginPackage.USER_LOGIN__USER_PREFERENCES:
				getUserPreferences().clear();
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
			case LoginPackage.USER_LOGIN__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case LoginPackage.USER_LOGIN__CURRENT_PASSWORD:
				return CURRENT_PASSWORD_EDEFAULT == null ? currentPassword != null : !CURRENT_PASSWORD_EDEFAULT.equals(currentPassword);
			case LoginPackage.USER_LOGIN__DISABLED_BY:
				return DISABLED_BY_EDEFAULT == null ? disabledBy != null : !DISABLED_BY_EDEFAULT.equals(disabledBy);
			case LoginPackage.USER_LOGIN__DISABLED_DATE_TIME:
				return DISABLED_DATE_TIME_EDEFAULT == null ? disabledDateTime != null : !DISABLED_DATE_TIME_EDEFAULT.equals(disabledDateTime);
			case LoginPackage.USER_LOGIN__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case LoginPackage.USER_LOGIN__EXTERNAL_AUTH_ID:
				return EXTERNAL_AUTH_ID_EDEFAULT == null ? externalAuthId != null : !EXTERNAL_AUTH_ID_EDEFAULT.equals(externalAuthId);
			case LoginPackage.USER_LOGIN__HAS_LOGGED_OUT:
				return hasLoggedOut != HAS_LOGGED_OUT_EDEFAULT;
			case LoginPackage.USER_LOGIN__IS_SYSTEM:
				return isSystem != IS_SYSTEM_EDEFAULT;
			case LoginPackage.USER_LOGIN__LAST_CURRENCY_UOM:
				return LAST_CURRENCY_UOM_EDEFAULT == null ? lastCurrencyUom != null : !LAST_CURRENCY_UOM_EDEFAULT.equals(lastCurrencyUom);
			case LoginPackage.USER_LOGIN__LAST_LOCALE:
				return LAST_LOCALE_EDEFAULT == null ? lastLocale != null : !LAST_LOCALE_EDEFAULT.equals(lastLocale);
			case LoginPackage.USER_LOGIN__LAST_TIME_ZONE:
				return LAST_TIME_ZONE_EDEFAULT == null ? lastTimeZone != null : !LAST_TIME_ZONE_EDEFAULT.equals(lastTimeZone);
			case LoginPackage.USER_LOGIN__PASSWORD_HINT:
				return PASSWORD_HINT_EDEFAULT == null ? passwordHint != null : !PASSWORD_HINT_EDEFAULT.equals(passwordHint);
			case LoginPackage.USER_LOGIN__REQUIRE_PASSWORD_CHANGE:
				return requirePasswordChange != REQUIRE_PASSWORD_CHANGE_EDEFAULT;
			case LoginPackage.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS:
				return successiveFailedLogins != SUCCESSIVE_FAILED_LOGINS_EDEFAULT;
			case LoginPackage.USER_LOGIN__USER_LDAP_DN:
				return USER_LDAP_DN_EDEFAULT == null ? userLdapDn != null : !USER_LDAP_DN_EDEFAULT.equals(userLdapDn);
			case LoginPackage.USER_LOGIN__PARTY_ID:
				return partyId != null;
			case LoginPackage.USER_LOGIN__USER_LOGIN_HISTORIES:
				return userLoginHistories != null && !userLoginHistories.isEmpty();
			case LoginPackage.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES:
				return userLoginPasswordHistories != null && !userLoginPasswordHistories.isEmpty();
			case LoginPackage.USER_LOGIN__USER_PREFERENCES:
				return userPreferences != null && !userPreferences.isEmpty();
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
		result.append(" (userLoginId: ");
		result.append(userLoginId);
		result.append(", currentPassword: ");
		result.append(currentPassword);
		result.append(", disabledBy: ");
		result.append(disabledBy);
		result.append(", disabledDateTime: ");
		result.append(disabledDateTime);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", externalAuthId: ");
		result.append(externalAuthId);
		result.append(", hasLoggedOut: ");
		result.append(hasLoggedOut);
		result.append(", isSystem: ");
		result.append(isSystem);
		result.append(", lastCurrencyUom: ");
		result.append(lastCurrencyUom);
		result.append(", lastLocale: ");
		result.append(lastLocale);
		result.append(", lastTimeZone: ");
		result.append(lastTimeZone);
		result.append(", passwordHint: ");
		result.append(passwordHint);
		result.append(", requirePasswordChange: ");
		result.append(requirePasswordChange);
		result.append(", successiveFailedLogins: ");
		result.append(successiveFailedLogins);
		result.append(", userLdapDn: ");
		result.append(userLdapDn);
		result.append(", userLoginHistories: ");
		result.append(userLoginHistories);
		result.append(", userLoginPasswordHistories: ");
		result.append(userLoginPasswordHistories);
		result.append(", userPreferences: ");
		result.append(userPreferences);
		result.append(')');
		return result.toString();
	}

} //UserLoginImpl
