/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.UserLoginSession;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getSavedDate <em>Saved Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl#getSessionData <em>Session Data</em>}</li>
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
		return (Date)eGet(LoginPackage.Literals.USER_LOGIN_SESSION__SAVED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSavedDate(Date newSavedDate) {
		eSet(LoginPackage.Literals.USER_LOGIN_SESSION__SAVED_DATE, newSavedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionData() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN_SESSION__SESSION_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionData(String newSessionData) {
		eSet(LoginPackage.Literals.USER_LOGIN_SESSION__SESSION_DATA, newSessionData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN_SESSION__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(LoginPackage.Literals.USER_LOGIN_SESSION__USER_LOGIN_ID, newUserLoginId);
	}

} //UserLoginSessionImpl
