/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.entity.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = org.abchip.mimo.biz.entity.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Type</em>'.
	 * @generated
	 */
	TestFieldType createTestFieldType();

	/**
	 * Returns a new object of class '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing</em>'.
	 * @generated
	 */
	Testing createTesting();

	/**
	 * Returns a new object of class '<em>Testing Crypto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Crypto</em>'.
	 * @generated
	 */
	TestingCrypto createTestingCrypto();

	/**
	 * Returns a new object of class '<em>Testing Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Item</em>'.
	 * @generated
	 */
	TestingItem createTestingItem();

	/**
	 * Returns a new object of class '<em>Testing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Node</em>'.
	 * @generated
	 */
	TestingNode createTestingNode();

	/**
	 * Returns a new object of class '<em>Testing Node Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Node Member</em>'.
	 * @generated
	 */
	TestingNodeMember createTestingNodeMember();

	/**
	 * Returns a new object of class '<em>Testing Remove All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Remove All</em>'.
	 * @generated
	 */
	TestingRemoveAll createTestingRemoveAll();

	/**
	 * Returns a new object of class '<em>Testing Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Status</em>'.
	 * @generated
	 */
	TestingStatus createTestingStatus();

	/**
	 * Returns a new object of class '<em>Testing Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Subtype</em>'.
	 * @generated
	 */
	TestingSubtype createTestingSubtype();

	/**
	 * Returns a new object of class '<em>Testing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Type</em>'.
	 * @generated
	 */
	TestingType createTestingType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
