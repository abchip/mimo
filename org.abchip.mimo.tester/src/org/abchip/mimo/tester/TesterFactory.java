/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.tester.TesterPackage
 * @generated
 */
public interface TesterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TesterFactory eINSTANCE = org.abchip.mimo.tester.impl.TesterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assertion Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Failed</em>'.
	 * @generated
	 */
	AssertionFailed createAssertionFailed();

	/**
	 * Returns a new object of class '<em>Assertion Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Success</em>'.
	 * @generated
	 */
	AssertionSuccess createAssertionSuccess();

	/**
	 * Returns a new object of class '<em>Test Runner Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Runner Event</em>'.
	 * @generated
	 */
	TestRunnerEvent createTestRunnerEvent();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	TestResult createTestResult();

	/**
	 * Returns a new object of class '<em>Test Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Object</em>'.
	 * @generated
	 */
	TestObject createTestObject();

	/**
	 * Returns a new object of class '<em>Run Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Test</em>'.
	 * @generated
	 */
	RunTest createRunTest();

	/**
	 * Returns a new object of class '<em>Run Test Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Test Response</em>'.
	 * @generated
	 */
	RunTestResponse createRunTestResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TesterPackage getTesterPackage();

} //TesterFactory
