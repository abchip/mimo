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
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.login.UserLoginSession;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getSavedDate <em>Saved Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getSessionData <em>Session Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getUserLoginId <em>User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginSessionImpl extends BizEntityImpl implements UserLoginSession {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getSavedDate() <em>Saved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SAVED_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getSavedDate() <em>Saved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavedDate()
	 * @generated
	 * @ordered
	 */
	protected Date savedDate = SAVED_DATE_EDEFAULT;


	/**
	 * The default value of the '{@link #getSessionData() <em>Session Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionData()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_DATA_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getSessionData() <em>Session Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionData()
	 * @generated
	 * @ordered
	 */
	protected String sessionData = SESSION_DATA_EDEFAULT;


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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSavedDate() {
		return savedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSavedDate(Date newSavedDate) {
		Date oldSavedDate = savedDate;
		savedDate = newSavedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SESSION__SAVED_DATE, oldSavedDate, savedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionData() {
		return sessionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionData(String newSessionData) {
		String oldSessionData = sessionData;
		sessionData = newSessionData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SESSION__SESSION_DATA, oldSessionData, sessionData));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID, oldUserLoginId, userLoginId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoginPackage.USER_LOGIN_SESSION__SAVED_DATE:
				return getSavedDate();
			case LoginPackage.USER_LOGIN_SESSION__SESSION_DATA:
				return getSessionData();
			case LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
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
			case LoginPackage.USER_LOGIN_SESSION__SAVED_DATE:
				setSavedDate((Date)newValue);
				return;
			case LoginPackage.USER_LOGIN_SESSION__SESSION_DATA:
				setSessionData((String)newValue);
				return;
			case LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
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
			case LoginPackage.USER_LOGIN_SESSION__SAVED_DATE:
				setSavedDate(SAVED_DATE_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_SESSION__SESSION_DATA:
				setSessionData(SESSION_DATA_EDEFAULT);
				return;
			case LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
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
			case LoginPackage.USER_LOGIN_SESSION__SAVED_DATE:
				return SAVED_DATE_EDEFAULT == null ? savedDate != null : !SAVED_DATE_EDEFAULT.equals(savedDate);
			case LoginPackage.USER_LOGIN_SESSION__SESSION_DATA:
				return SESSION_DATA_EDEFAULT == null ? sessionData != null : !SESSION_DATA_EDEFAULT.equals(sessionData);
			case LoginPackage.USER_LOGIN_SESSION__USER_LOGIN_ID:
				return userLoginId != null;
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
		result.append(" (savedDate: ");
		result.append(savedDate);
		result.append(", sessionData: ");
		result.append(sessionData);
		result.append(')');
		return result.toString();
	}

} //UserLoginSessionImpl
