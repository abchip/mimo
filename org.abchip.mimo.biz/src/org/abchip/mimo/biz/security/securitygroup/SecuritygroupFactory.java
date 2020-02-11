/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage
 * @generated
 */
public interface SecuritygroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuritygroupFactory eINSTANCE = org.abchip.mimo.biz.security.securitygroup.impl.SecuritygroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Protected View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protected View</em>'.
	 * @generated
	 */
	ProtectedView createProtectedView();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	SecurityGroup createSecurityGroup();

	/**
	 * Returns a new object of class '<em>Security Group Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group Permission</em>'.
	 * @generated
	 */
	SecurityGroupPermission createSecurityGroupPermission();

	/**
	 * Returns a new object of class '<em>Security Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Permission</em>'.
	 * @generated
	 */
	SecurityPermission createSecurityPermission();

	/**
	 * Returns a new object of class '<em>Tarpitted Login View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarpitted Login View</em>'.
	 * @generated
	 */
	TarpittedLoginView createTarpittedLoginView();

	/**
	 * Returns a new object of class '<em>User Login Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login Security Group</em>'.
	 * @generated
	 */
	UserLoginSecurityGroup createUserLoginSecurityGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecuritygroupPackage getSecuritygroupPackage();

} //SecuritygroupFactory
