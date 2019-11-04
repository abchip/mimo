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
import org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission;
import org.abchip.mimo.biz.security.securitygroup.SecurityPermission;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getPermissionId <em>Permission Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupPermissionImpl extends BizEntityImpl implements SecurityGroupPermission {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getPermissionId() <em>Permission Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionId()
	 * @generated
	 * @ordered
	 */
	protected SecurityPermission permissionId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGroupPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_GROUP_PERMISSION__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_GROUP_PERMISSION__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPermission getPermissionId() {
		if (permissionId != null && ((EObject)permissionId).eIsProxy()) {
			InternalEObject oldPermissionId = (InternalEObject)permissionId;
			permissionId = (SecurityPermission)eResolveProxy(oldPermissionId);
			if (permissionId != oldPermissionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID, oldPermissionId, permissionId));
			}
		}
		return permissionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPermission basicGetPermissionId() {
		return permissionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionId(SecurityPermission newPermissionId) {
		SecurityPermission oldPermissionId = permissionId;
		permissionId = newPermissionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID, oldPermissionId, permissionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_GROUP_PERMISSION__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__GROUP_ID:
				return getGroupId();
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__FROM_DATE:
				return getFromDate();
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__THRU_DATE:
				return getThruDate();
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID:
				if (resolve) return getPermissionId();
				return basicGetPermissionId();
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
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID:
				setPermissionId((SecurityPermission)newValue);
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
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID:
				setPermissionId((SecurityPermission)null);
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
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION__PERMISSION_ID:
				return permissionId != null;
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //SecurityGroupPermissionImpl
