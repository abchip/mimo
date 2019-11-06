/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.security.securitygroup.UserLoginSecurityGroup;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.UserLoginSecurityGroupImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.UserLoginSecurityGroupImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.UserLoginSecurityGroupImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.UserLoginSecurityGroupImpl#getGroupId <em>Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginSecurityGroupImpl extends BizEntityImpl implements UserLoginSecurityGroup {
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
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLoginId;


	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected SecurityGroup groupId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginSecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.USER_LOGIN_SECURITY_GROUP;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getGroupId() {
		if (groupId != null && ((EObject)groupId).eIsProxy()) {
			InternalEObject oldGroupId = (InternalEObject)groupId;
			groupId = (SecurityGroup)eResolveProxy(oldGroupId);
			if (groupId != oldGroupId) {
			}
		}
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup basicGetGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(SecurityGroup newGroupId) {
		groupId = newGroupId;
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
		thruDate = newThruDate;
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
		userLoginId = newUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__FROM_DATE:
				return getFromDate();
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__THRU_DATE:
				return getThruDate();
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__GROUP_ID:
				if (resolve) return getGroupId();
				return basicGetGroupId();
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
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__GROUP_ID:
				setGroupId((SecurityGroup)newValue);
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
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__GROUP_ID:
				setGroupId((SecurityGroup)null);
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
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID:
				return userLoginId != null;
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP__GROUP_ID:
				return groupId != null;
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
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //UserLoginSecurityGroupImpl
