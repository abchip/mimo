/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__CURRENT_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPassword(String newCurrentPassword) {
		eSet(LoginPackage.Literals.USER_LOGIN__CURRENT_PASSWORD, newCurrentPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabledBy() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__DISABLED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledBy(String newDisabledBy) {
		eSet(LoginPackage.Literals.USER_LOGIN__DISABLED_BY, newDisabledBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDisabledDateTime() {
		return (Date)eGet(LoginPackage.Literals.USER_LOGIN__DISABLED_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledDateTime(Date newDisabledDateTime) {
		eSet(LoginPackage.Literals.USER_LOGIN__DISABLED_DATE_TIME, newDisabledDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		eSet(LoginPackage.Literals.USER_LOGIN__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalAuthId() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__EXTERNAL_AUTH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalAuthId(String newExternalAuthId) {
		eSet(LoginPackage.Literals.USER_LOGIN__EXTERNAL_AUTH_ID, newExternalAuthId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasLoggedOut() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__HAS_LOGGED_OUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasLoggedOut(boolean newHasLoggedOut) {
		eSet(LoginPackage.Literals.USER_LOGIN__HAS_LOGGED_OUT, newHasLoggedOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSystem() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__IS_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSystem(boolean newIsSystem) {
		eSet(LoginPackage.Literals.USER_LOGIN__IS_SYSTEM, newIsSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastCurrencyUom() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCurrencyUom(String newLastCurrencyUom) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_CURRENCY_UOM, newLastCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLocale() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_LOCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLocale(String newLastLocale) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_LOCALE, newLastLocale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastTimeZone() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_TIME_ZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTimeZone(String newLastTimeZone) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_TIME_ZONE, newLastTimeZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(LoginPackage.Literals.USER_LOGIN__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(LoginPackage.Literals.USER_LOGIN__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordHint() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__PASSWORD_HINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordHint(String newPasswordHint) {
		eSet(LoginPackage.Literals.USER_LOGIN__PASSWORD_HINT, newPasswordHint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePasswordChange() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__REQUIRE_PASSWORD_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePasswordChange(boolean newRequirePasswordChange) {
		eSet(LoginPackage.Literals.USER_LOGIN__REQUIRE_PASSWORD_CHANGE, newRequirePasswordChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSuccessiveFailedLogins() {
		return (Long)eGet(LoginPackage.Literals.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessiveFailedLogins(long newSuccessiveFailedLogins) {
		eSet(LoginPackage.Literals.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS, newSuccessiveFailedLogins);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLdapDn() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__USER_LDAP_DN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLdapDn(String newUserLdapDn) {
		eSet(LoginPackage.Literals.USER_LOGIN__USER_LDAP_DN, newUserLdapDn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getUserLoginHistories() {
		return (List<String>)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getUserLoginPasswordHistories() {
		return (List<String>)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getUserPreferences() {
		return (List<String>)eGet(LoginPackage.Literals.USER_LOGIN__USER_PREFERENCES, true);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LoginPackage.USER_LOGIN___APPROVED_BY_TIMESHEETS:
				return approvedByTimesheets();
			case LoginPackage.USER_LOGIN___AUTH_JOB_SANDBOXS:
				return authJobSandboxs();
			case LoginPackage.USER_LOGIN___CHANGE_BY_BUDGET_STATUSS:
				return changeByBudgetStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_BY_CUST_REQUEST_STATUSS:
				return changeByCustRequestStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_BY_ORDER_ITEMS:
				return changeByOrderItems();
			case LoginPackage.USER_LOGIN___CHANGE_BY_REQUIREMENT_STATUSS:
				return changeByRequirementStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_BY_RETURN_STATUSS:
				return changeByReturnStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_BY_SHIPMENT_STATUSS:
				return changeByShipmentStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_BY_TESTING_STATUSS:
				return changeByTestingStatuss();
			case LoginPackage.USER_LOGIN___CHANGE_PICKLIST_STATUS_HISTORIES:
				return changePicklistStatusHistories();
			case LoginPackage.USER_LOGIN___CHANGED_BY_PRODUCT_PRICE_CHANGES:
				return changedByProductPriceChanges();
			case LoginPackage.USER_LOGIN___CREATED_BY_CONTACT_LISTS:
				return createdByContactLists();
			case LoginPackage.USER_LOGIN___CREATED_BY_CONTENTS:
				return createdByContents();
			case LoginPackage.USER_LOGIN___CREATED_BY_DATA_RESOURCES:
				return createdByDataResources();
			case LoginPackage.USER_LOGIN___CREATED_BY_ORDER_HEADERS:
				return createdByOrderHeaders();
			case LoginPackage.USER_LOGIN___CREATED_BY_PARTIES:
				return createdByParties();
			case LoginPackage.USER_LOGIN___CREATED_BY_PRODUCT_PROMO_CODES:
				return createdByProductPromoCodes();
			case LoginPackage.USER_LOGIN___CREATED_BY_PRODUCT_PROMOS:
				return createdByProductPromos();
			case LoginPackage.USER_LOGIN___CREATED_BY_PRODUCTS:
				return createdByProducts();
			case LoginPackage.USER_LOGIN___CREATED_BY_SALES_FORECASTS:
				return createdBySalesForecasts();
			case LoginPackage.USER_LOGIN___DONT_CANCEL_SET_ORDER_ITEMS:
				return dontCancelSetOrderItems();
			case LoginPackage.USER_LOGIN___ISSUED_BY_ITEM_ISSUANCES:
				return issuedByItemIssuances();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_CONTACT_LISTS:
				return lastModifiedByContactLists();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_CONTENTS:
				return lastModifiedByContents();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_DATA_RESOURCES:
				return lastModifiedByDataResources();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_PARTIES:
				return lastModifiedByParties();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_PRODUCT_PROMO_CODES:
				return lastModifiedByProductPromoCodes();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_PRODUCT_PROMOS:
				return lastModifiedByProductPromos();
			case LoginPackage.USER_LOGIN___LAST_MODIFIED_BY_PRODUCTS:
				return lastModifiedByProducts();
			case LoginPackage.USER_LOGIN___MODIFIED_BY_SALES_FORECAST_HISTORIES:
				return modifiedBySalesForecastHistories();
			case LoginPackage.USER_LOGIN___MODIFIED_BY_SALES_FORECASTS:
				return modifiedBySalesForecasts();
			case LoginPackage.USER_LOGIN___ORDER_ADJUSTMENTS:
				return orderAdjustments();
			case LoginPackage.USER_LOGIN___ORDER_ITEM_CHANGES:
				return orderItemChanges();
			case LoginPackage.USER_LOGIN___ORDER_PAYMENT_PREFERENCES:
				return orderPaymentPreferences();
			case LoginPackage.USER_LOGIN___ORDER_STATUSS:
				return orderStatuss();
			case LoginPackage.USER_LOGIN___PRODUCT_REVIEWS:
				return productReviews();
			case LoginPackage.USER_LOGIN___QUOTE_ADJUSTMENTS:
				return quoteAdjustments();
			case LoginPackage.USER_LOGIN___RETURN_ADJUSTMENTS:
				return returnAdjustments();
			case LoginPackage.USER_LOGIN___RETURN_HEADERS:
				return returnHeaders();
			case LoginPackage.USER_LOGIN___RUN_AS_JOB_SANDBOXS:
				return runAsJobSandboxs();
			case LoginPackage.USER_LOGIN___SALES_OPPORTUNITIES:
				return salesOpportunities();
			case LoginPackage.USER_LOGIN___SALES_OPPORTUNITY_HISTORIES:
				return salesOpportunityHistories();
			case LoginPackage.USER_LOGIN___SHIPMENT_RECEIPTS:
				return shipmentReceipts();
			case LoginPackage.USER_LOGIN___USER_LOGIN_SECURITY_QUESTIONS:
				return userLoginSecurityQuestions();
			case LoginPackage.USER_LOGIN___VISITORS:
				return visitors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserLoginImpl
