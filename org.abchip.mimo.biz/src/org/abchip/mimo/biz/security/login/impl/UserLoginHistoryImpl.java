/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.login.UserLoginHistory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getPasswordUsed <em>Password Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#isSuccessfulLogin <em>Successful Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getOriginUserLoginId <em>Origin User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginHistoryImpl extends BizEntityImpl implements UserLoginHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;


	/**
	 * The default value of the '{@link #getPasswordUsed() <em>Password Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_USED_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getPasswordUsed() <em>Password Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordUsed()
	 * @generated
	 * @ordered
	 */
	protected String passwordUsed = PASSWORD_USED_EDEFAULT;


	/**
	 * The default value of the '{@link #isSuccessfulLogin() <em>Successful Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccessfulLogin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUCCESSFUL_LOGIN_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isSuccessfulLogin() <em>Successful Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccessfulLogin()
	 * @generated
	 * @ordered
	 */
	protected boolean successfulLogin = SUCCESSFUL_LOGIN_EDEFAULT;


	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;


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
	 * The cached value of the '{@link #getOriginUserLoginId() <em>Origin User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin originUserLoginId;


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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getOriginUserLoginId() {
		if (originUserLoginId != null && ((EObject)originUserLoginId).eIsProxy()) {
			InternalEObject oldOriginUserLoginId = (InternalEObject)originUserLoginId;
			originUserLoginId = (UserLogin)eResolveProxy(oldOriginUserLoginId);
			if (originUserLoginId != oldOriginUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID, oldOriginUserLoginId, originUserLoginId));
			}
		}
		return originUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetOriginUserLoginId() {
		return originUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginUserLoginId(UserLogin newOriginUserLoginId) {
		UserLogin oldOriginUserLoginId = originUserLoginId;
		originUserLoginId = newOriginUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID, oldOriginUserLoginId, originUserLoginId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_HISTORY__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordUsed() {
		return passwordUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordUsed(String newPasswordUsed) {
		String oldPasswordUsed = passwordUsed;
		passwordUsed = newPasswordUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__PASSWORD_USED, oldPasswordUsed, passwordUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuccessfulLogin() {
		return successfulLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessfulLogin(boolean newSuccessfulLogin) {
		boolean oldSuccessfulLogin = successfulLogin;
		successfulLogin = newSuccessfulLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN, oldSuccessfulLogin, successfulLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__THRU_DATE, oldThruDate, thruDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID, oldUserLoginId, userLoginId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_HISTORY__VISIT_ID, oldVisitId, visitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_HISTORY__FROM_DATE:
				return getFromDate();
			case LoginPackage.USER_LOGIN_HISTORY__PASSWORD_USED:
				return getPasswordUsed();
			case LoginPackage.USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN:
				return isSuccessfulLogin();
			case LoginPackage.USER_LOGIN_HISTORY__THRU_DATE:
				return getThruDate();
			case LoginPackage.USER_LOGIN_HISTORY__VISIT_ID:
				return getVisitId();
			case LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID:
				if (resolve) return getOriginUserLoginId();
				return basicGetOriginUserLoginId();
			case LoginPackage.USER_LOGIN_HISTORY__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case LoginPackage.USER_LOGIN_HISTORY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__PASSWORD_USED:
				setPasswordUsed((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN:
				setSuccessfulLogin((Boolean)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID:
				setOriginUserLoginId((UserLogin)newValue);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__PARTY_ID:
				setPartyId((Party)newValue);
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
			case LoginPackage.USER_LOGIN_HISTORY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__PASSWORD_USED:
				setPasswordUsed(PASSWORD_USED_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN:
				setSuccessfulLogin(SUCCESSFUL_LOGIN_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID:
				setOriginUserLoginId((UserLogin)null);
				return;
			case LoginPackage.USER_LOGIN_HISTORY__PARTY_ID:
				setPartyId((Party)null);
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
			case LoginPackage.USER_LOGIN_HISTORY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LoginPackage.USER_LOGIN_HISTORY__PASSWORD_USED:
				return PASSWORD_USED_EDEFAULT == null ? passwordUsed != null : !PASSWORD_USED_EDEFAULT.equals(passwordUsed);
			case LoginPackage.USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN:
				return successfulLogin != SUCCESSFUL_LOGIN_EDEFAULT;
			case LoginPackage.USER_LOGIN_HISTORY__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case LoginPackage.USER_LOGIN_HISTORY__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case LoginPackage.USER_LOGIN_HISTORY__USER_LOGIN_ID:
				return userLoginId != null;
			case LoginPackage.USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID:
				return originUserLoginId != null;
			case LoginPackage.USER_LOGIN_HISTORY__PARTY_ID:
				return partyId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", passwordUsed: ");
		result.append(passwordUsed);
		result.append(", successfulLogin: ");
		result.append(successfulLogin);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(')');
		return result.toString();
	}

} //UserLoginHistoryImpl
