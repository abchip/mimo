/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission;
import org.abchip.mimo.biz.security.securitygroup.SecurityPermission;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getPermissionId <em>Permission Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.SecurityGroupPermissionImpl#getThruDate <em>Thru Date</em>}</li>
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
		return (Date)eGet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getGroupId() {
		return (SecurityGroup)eGet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(SecurityGroup newGroupId) {
		eSet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPermission getPermissionId() {
		return (SecurityPermission)eGet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__PERMISSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionId(SecurityPermission newPermissionId) {
		eSet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__PERMISSION_ID, newPermissionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(SecuritygroupPackage.Literals.SECURITY_GROUP_PERMISSION__THRU_DATE, newThruDate);
	}

} //SecurityGroupPermissionImpl
