/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarpitted Login View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarpittedLoginViewImpl extends BizEntityImpl implements TarpittedLoginView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getViewNameId() <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewNameId()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewNameId() <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewNameId()
	 * @generated
	 * @ordered
	 */
	protected String viewNameId = VIEW_NAME_ID_EDEFAULT;


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
	 * The default value of the '{@link #getTarpitReleaseDateTime() <em>Tarpit Release Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarpitReleaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TARPIT_RELEASE_DATE_TIME_EDEFAULT = 0L;


	/**
	 * The cached value of the '{@link #getTarpitReleaseDateTime() <em>Tarpit Release Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarpitReleaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected long tarpitReleaseDateTime = TARPIT_RELEASE_DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TarpittedLoginViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTarpitReleaseDateTime() {
		return tarpitReleaseDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarpitReleaseDateTime(long newTarpitReleaseDateTime) {
		tarpitReleaseDateTime = newTarpitReleaseDateTime;
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
		userLoginId = newUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewNameId() {
		return viewNameId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewNameId(String newViewNameId) {
		viewNameId = newViewNameId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID:
				return getViewNameId();
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID:
				return getUserLoginId();
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME:
				return getTarpitReleaseDateTime();
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
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID:
				setViewNameId((String)newValue);
				return;
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME:
				setTarpitReleaseDateTime((Long)newValue);
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
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID:
				setViewNameId(VIEW_NAME_ID_EDEFAULT);
				return;
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME:
				setTarpitReleaseDateTime(TARPIT_RELEASE_DATE_TIME_EDEFAULT);
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
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID:
				return VIEW_NAME_ID_EDEFAULT == null ? viewNameId != null : !VIEW_NAME_ID_EDEFAULT.equals(viewNameId);
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME:
				return tarpitReleaseDateTime != TARPIT_RELEASE_DATE_TIME_EDEFAULT;
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
		result.append(" (viewNameId: ");
		result.append(viewNameId);
		result.append(", userLoginId: ");
		result.append(userLoginId);
		result.append(", tarpitReleaseDateTime: ");
		result.append(tarpitReleaseDateTime);
		result.append(')');
		return result.toString();
	}

} //TarpittedLoginViewImpl
