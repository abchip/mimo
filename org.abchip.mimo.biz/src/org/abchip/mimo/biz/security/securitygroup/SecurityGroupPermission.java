/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getPermissionId <em>Permission Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission()
 * @model annotation="mimo-ent-frame help='Defines a permission available to a security group; there is no FK to SecurityPermission because we want to leave open the possibility of ad-hoc permissions, especially for the Entity Data Maintenance pages which have TONS of permissions' title='Security Component - Security Group Permission'"
 * @generated
 */
public interface SecurityGroupPermission extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' reference.
	 * @see #setGroupId(SecurityGroup)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_GroupId()
	 * @model keys="groupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SecurityGroup getGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getGroupId <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' reference.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Permission Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Id</em>' reference.
	 * @see #setPermissionId(SecurityPermission)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_PermissionId()
	 * @model keys="permissionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SecurityPermission getPermissionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getPermissionId <em>Permission Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Id</em>' reference.
	 * @see #getPermissionId()
	 * @generated
	 */
	void setPermissionId(SecurityPermission value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.SecurityGroupPermission#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // SecurityGroupPermission
