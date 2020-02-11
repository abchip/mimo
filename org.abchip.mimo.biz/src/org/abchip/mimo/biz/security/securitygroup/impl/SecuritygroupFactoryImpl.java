/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import org.abchip.mimo.biz.security.securitygroup.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecuritygroupFactoryImpl extends EFactoryImpl implements SecuritygroupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecuritygroupFactory init() {
		try {
			SecuritygroupFactory theSecuritygroupFactory = (SecuritygroupFactory)EPackage.Registry.INSTANCE.getEFactory(SecuritygroupPackage.eNS_URI);
			if (theSecuritygroupFactory != null) {
				return theSecuritygroupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecuritygroupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritygroupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecuritygroupPackage.PROTECTED_VIEW: return (EObject)createProtectedView();
			case SecuritygroupPackage.SECURITY_GROUP: return (EObject)createSecurityGroup();
			case SecuritygroupPackage.SECURITY_GROUP_PERMISSION: return (EObject)createSecurityGroupPermission();
			case SecuritygroupPackage.SECURITY_PERMISSION: return (EObject)createSecurityPermission();
			case SecuritygroupPackage.TARPITTED_LOGIN_VIEW: return (EObject)createTarpittedLoginView();
			case SecuritygroupPackage.USER_LOGIN_SECURITY_GROUP: return (EObject)createUserLoginSecurityGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectedView createProtectedView() {
		ProtectedViewImpl protectedView = new ProtectedViewImpl();
		return protectedView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroupPermission createSecurityGroupPermission() {
		SecurityGroupPermissionImpl securityGroupPermission = new SecurityGroupPermissionImpl();
		return securityGroupPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPermission createSecurityPermission() {
		SecurityPermissionImpl securityPermission = new SecurityPermissionImpl();
		return securityPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TarpittedLoginView createTarpittedLoginView() {
		TarpittedLoginViewImpl tarpittedLoginView = new TarpittedLoginViewImpl();
		return tarpittedLoginView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLoginSecurityGroup createUserLoginSecurityGroup() {
		UserLoginSecurityGroupImpl userLoginSecurityGroup = new UserLoginSecurityGroupImpl();
		return userLoginSecurityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuritygroupPackage getSecuritygroupPackage() {
		return (SecuritygroupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecuritygroupPackage getPackage() {
		return SecuritygroupPackage.eINSTANCE;
	}

} //SecuritygroupFactoryImpl
