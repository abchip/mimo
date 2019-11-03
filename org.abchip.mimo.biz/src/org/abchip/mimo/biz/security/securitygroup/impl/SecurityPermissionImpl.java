/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecurityPermission;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityPermissionImpl#getPermissionId <em>Permission Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityPermissionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityPermissionImpl extends BizEntityImpl implements SecurityPermission {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getPermissionId() <em>Permission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermissionId() <em>Permission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionId()
	 * @generated
	 * @ordered
	 */
	protected String permissionId = PERMISSION_ID_EDEFAULT;


	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.SECURITY_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_PERMISSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermissionId() {
		return permissionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionId(String newPermissionId) {
		String oldPermissionId = permissionId;
		permissionId = newPermissionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.SECURITY_PERMISSION__PERMISSION_ID, oldPermissionId, permissionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritygroupPackage.SECURITY_PERMISSION__PERMISSION_ID:
				return getPermissionId();
			case SecuritygroupPackage.SECURITY_PERMISSION__DESCRIPTION:
				return getDescription();
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
			case SecuritygroupPackage.SECURITY_PERMISSION__PERMISSION_ID:
				setPermissionId((String)newValue);
				return;
			case SecuritygroupPackage.SECURITY_PERMISSION__DESCRIPTION:
				setDescription((String)newValue);
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
			case SecuritygroupPackage.SECURITY_PERMISSION__PERMISSION_ID:
				setPermissionId(PERMISSION_ID_EDEFAULT);
				return;
			case SecuritygroupPackage.SECURITY_PERMISSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case SecuritygroupPackage.SECURITY_PERMISSION__PERMISSION_ID:
				return PERMISSION_ID_EDEFAULT == null ? permissionId != null : !PERMISSION_ID_EDEFAULT.equals(permissionId);
			case SecuritygroupPackage.SECURITY_PERMISSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (permissionId: ");
		result.append(permissionId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SecurityPermissionImpl
