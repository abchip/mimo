/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage
 * @generated
 */
public interface FinaccountFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinaccountFactory eINSTANCE = org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fin Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account</em>'.
	 * @generated
	 */
	FinAccount createFinAccount();

	/**
	 * Returns a new object of class '<em>Fin Account Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Attribute</em>'.
	 * @generated
	 */
	FinAccountAttribute createFinAccountAttribute();

	/**
	 * Returns a new object of class '<em>Fin Account Auth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Auth</em>'.
	 * @generated
	 */
	FinAccountAuth createFinAccountAuth();

	/**
	 * Returns a new object of class '<em>Fin Account Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Role</em>'.
	 * @generated
	 */
	FinAccountRole createFinAccountRole();

	/**
	 * Returns a new object of class '<em>Fin Account Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Status</em>'.
	 * @generated
	 */
	FinAccountStatus createFinAccountStatus();

	/**
	 * Returns a new object of class '<em>Fin Account Trans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Trans</em>'.
	 * @generated
	 */
	FinAccountTrans createFinAccountTrans();

	/**
	 * Returns a new object of class '<em>Fin Account Trans Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Trans Attribute</em>'.
	 * @generated
	 */
	FinAccountTransAttribute createFinAccountTransAttribute();

	/**
	 * Returns a new object of class '<em>Fin Account Trans Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Trans Type</em>'.
	 * @generated
	 */
	FinAccountTransType createFinAccountTransType();

	/**
	 * Returns a new object of class '<em>Fin Account Trans Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Trans Type Attr</em>'.
	 * @generated
	 */
	FinAccountTransTypeAttr createFinAccountTransTypeAttr();

	/**
	 * Returns a new object of class '<em>Fin Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Type</em>'.
	 * @generated
	 */
	FinAccountType createFinAccountType();

	/**
	 * Returns a new object of class '<em>Fin Account Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Type Attr</em>'.
	 * @generated
	 */
	FinAccountTypeAttr createFinAccountTypeAttr();

	/**
	 * Returns a new object of class '<em>Fin Account Type Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Account Type Gl Account</em>'.
	 * @generated
	 */
	FinAccountTypeGlAccount createFinAccountTypeGlAccount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FinaccountPackage getFinaccountPackage();

} //FinaccountFactory
