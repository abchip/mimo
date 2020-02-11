/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import org.abchip.mimo.biz.accounting.finaccount.*;
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
public class FinaccountFactoryImpl extends EFactoryImpl implements FinaccountFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinaccountFactory init() {
		try {
			FinaccountFactory theFinaccountFactory = (FinaccountFactory)EPackage.Registry.INSTANCE.getEFactory(FinaccountPackage.eNS_URI);
			if (theFinaccountFactory != null) {
				return theFinaccountFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinaccountFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinaccountFactoryImpl() {
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
			case FinaccountPackage.FIN_ACCOUNT: return (EObject)createFinAccount();
			case FinaccountPackage.FIN_ACCOUNT_ATTRIBUTE: return (EObject)createFinAccountAttribute();
			case FinaccountPackage.FIN_ACCOUNT_AUTH: return (EObject)createFinAccountAuth();
			case FinaccountPackage.FIN_ACCOUNT_ROLE: return (EObject)createFinAccountRole();
			case FinaccountPackage.FIN_ACCOUNT_STATUS: return (EObject)createFinAccountStatus();
			case FinaccountPackage.FIN_ACCOUNT_TRANS: return (EObject)createFinAccountTrans();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE: return (EObject)createFinAccountTransAttribute();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE: return (EObject)createFinAccountTransType();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE_ATTR: return (EObject)createFinAccountTransTypeAttr();
			case FinaccountPackage.FIN_ACCOUNT_TYPE: return (EObject)createFinAccountType();
			case FinaccountPackage.FIN_ACCOUNT_TYPE_ATTR: return (EObject)createFinAccountTypeAttr();
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT: return (EObject)createFinAccountTypeGlAccount();
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
	public FinAccount createFinAccount() {
		FinAccountImpl finAccount = new FinAccountImpl();
		return finAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountAttribute createFinAccountAttribute() {
		FinAccountAttributeImpl finAccountAttribute = new FinAccountAttributeImpl();
		return finAccountAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountAuth createFinAccountAuth() {
		FinAccountAuthImpl finAccountAuth = new FinAccountAuthImpl();
		return finAccountAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountRole createFinAccountRole() {
		FinAccountRoleImpl finAccountRole = new FinAccountRoleImpl();
		return finAccountRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountStatus createFinAccountStatus() {
		FinAccountStatusImpl finAccountStatus = new FinAccountStatusImpl();
		return finAccountStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTrans createFinAccountTrans() {
		FinAccountTransImpl finAccountTrans = new FinAccountTransImpl();
		return finAccountTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTransAttribute createFinAccountTransAttribute() {
		FinAccountTransAttributeImpl finAccountTransAttribute = new FinAccountTransAttributeImpl();
		return finAccountTransAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTransType createFinAccountTransType() {
		FinAccountTransTypeImpl finAccountTransType = new FinAccountTransTypeImpl();
		return finAccountTransType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTransTypeAttr createFinAccountTransTypeAttr() {
		FinAccountTransTypeAttrImpl finAccountTransTypeAttr = new FinAccountTransTypeAttrImpl();
		return finAccountTransTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType createFinAccountType() {
		FinAccountTypeImpl finAccountType = new FinAccountTypeImpl();
		return finAccountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTypeAttr createFinAccountTypeAttr() {
		FinAccountTypeAttrImpl finAccountTypeAttr = new FinAccountTypeAttrImpl();
		return finAccountTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTypeGlAccount createFinAccountTypeGlAccount() {
		FinAccountTypeGlAccountImpl finAccountTypeGlAccount = new FinAccountTypeGlAccountImpl();
		return finAccountTypeGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinaccountPackage getFinaccountPackage() {
		return (FinaccountPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinaccountPackage getPackage() {
		return FinaccountPackage.eINSTANCE;
	}

} //FinaccountFactoryImpl
