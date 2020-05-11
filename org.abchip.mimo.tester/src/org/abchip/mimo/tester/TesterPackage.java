/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.service.ServicePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.tester.TesterFactory
 * @model kind="package"
 * @generated
 */
public interface TesterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tester";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/tester";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TesterPackage eINSTANCE = org.abchip.mimo.tester.impl.TesterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.Asserter <em>Asserter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.Asserter
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAsserter()
	 * @generated
	 */
	int ASSERTER = 0;

	/**
	 * The number of structural features of the '<em>Asserter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.AssertionResultImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionResult()
	 * @generated
	 */
	int ASSERTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__MESSAGE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__TIME = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.AssertionFailedImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionFailed()
	 * @generated
	 */
	int ASSERTION_FAILED = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__NAME = ASSERTION_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__TIME = ASSERTION_RESULT__TIME;

	/**
	 * The number of structural features of the '<em>Assertion Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.AssertionSuccessImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionSuccess()
	 * @generated
	 */
	int ASSERTION_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__NAME = ASSERTION_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__TIME = ASSERTION_RESULT__TIME;

	/**
	 * The number of structural features of the '<em>Assertion Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestAsserter <em>Test Asserter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestAsserter
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestAsserter()
	 * @generated
	 */
	int TEST_ASSERTER = 4;

	/**
	 * The number of structural features of the '<em>Test Asserter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSERTER_FEATURE_COUNT = ASSERTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestManager <em>Test Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestManager
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestManager()
	 * @generated
	 */
	int TEST_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>Test Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestRunner <em>Test Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestRunner
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunner()
	 * @generated
	 */
	int TEST_RUNNER = 6;

	/**
	 * The number of structural features of the '<em>Test Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.TestRunnerEventImpl <em>Test Runner Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.TestRunnerEventImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerEvent()
	 * @generated
	 */
	int TEST_RUNNER_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_EVENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_EVENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Test Runner Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestRunnerListener <em>Test Runner Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestRunnerListener
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerListener()
	 * @generated
	 */
	int TEST_RUNNER_LISTENER = 8;

	/**
	 * The number of structural features of the '<em>Test Runner Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.TestResultImpl <em>Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.TestResultImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Assert Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__ASSERT_RESULTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__CATEGORY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__OBJECT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__RUNNER = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__TIME = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestSuiteLauncher <em>Test Suite Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestSuiteLauncher
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestSuiteLauncher()
	 * @generated
	 */
	int TEST_SUITE_LAUNCHER = 10;

	/**
	 * The number of structural features of the '<em>Test Suite Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_LAUNCHER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestSuiteRunner <em>Test Suite Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestSuiteRunner
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestSuiteRunner()
	 * @generated
	 */
	int TEST_SUITE_RUNNER = 11;

	/**
	 * The number of structural features of the '<em>Test Suite Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestUnitRunner <em>Test Unit Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestUnitRunner
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestUnitRunner()
	 * @generated
	 */
	int TEST_UNIT_RUNNER = 12;

	/**
	 * The number of structural features of the '<em>Test Unit Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_UNIT_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.TestObjectImpl <em>Test Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.TestObjectImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestObject()
	 * @generated
	 */
	int TEST_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__STRING_PROPERTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integer Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__INTEGER_PROPERTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__OBJECT_REFERENCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__OBJECT_REFERENCES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT__VALUES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Test Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.RunTestImpl <em>Run Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.RunTestImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getRunTest()
	 * @generated
	 */
	int RUN_TEST = 14;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST__COMPONENT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.impl.RunTestResponseImpl <em>Run Test Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.impl.RunTestResponseImpl
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getRunTestResponse()
	 * @generated
	 */
	int RUN_TEST_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_RESPONSE__ASSERTIONS = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Test Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_TEST_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.AssertionState <em>Assertion State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.AssertionState
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionState()
	 * @generated
	 */
	int ASSERTION_STATE = 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.tester.TestRunnerEventType <em>Test Runner Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.tester.TestRunnerEventType
	 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerEventType()
	 * @generated
	 */
	int TEST_RUNNER_EVENT_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.Asserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserter</em>'.
	 * @see org.abchip.mimo.tester.Asserter
	 * @generated
	 */
	EClass getAsserter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.AssertionFailed <em>Assertion Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Failed</em>'.
	 * @see org.abchip.mimo.tester.AssertionFailed
	 * @generated
	 */
	EClass getAssertionFailed();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.AssertionResult <em>Assertion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Result</em>'.
	 * @see org.abchip.mimo.tester.AssertionResult
	 * @generated
	 */
	EClass getAssertionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.AssertionResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.abchip.mimo.tester.AssertionResult#getMessage()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.AssertionResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.tester.AssertionResult#getName()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.AssertionResult#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.abchip.mimo.tester.AssertionResult#getTime()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Time();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.AssertionSuccess <em>Assertion Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Success</em>'.
	 * @see org.abchip.mimo.tester.AssertionSuccess
	 * @generated
	 */
	EClass getAssertionSuccess();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestAsserter <em>Test Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Asserter</em>'.
	 * @see org.abchip.mimo.tester.TestAsserter
	 * @generated
	 */
	EClass getTestAsserter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestManager <em>Test Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Manager</em>'.
	 * @see org.abchip.mimo.tester.TestManager
	 * @generated
	 */
	EClass getTestManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestRunner <em>Test Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner</em>'.
	 * @see org.abchip.mimo.tester.TestRunner
	 * @generated
	 */
	EClass getTestRunner();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestRunnerEvent <em>Test Runner Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner Event</em>'.
	 * @see org.abchip.mimo.tester.TestRunnerEvent
	 * @generated
	 */
	EClass getTestRunnerEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.tester.TestRunnerEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.abchip.mimo.tester.TestRunnerEvent#getSource()
	 * @see #getTestRunnerEvent()
	 * @generated
	 */
	EReference getTestRunnerEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestRunnerEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.tester.TestRunnerEvent#getType()
	 * @see #getTestRunnerEvent()
	 * @generated
	 */
	EAttribute getTestRunnerEvent_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestRunnerListener <em>Test Runner Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner Listener</em>'.
	 * @see org.abchip.mimo.tester.TestRunnerListener
	 * @generated
	 */
	EClass getTestRunnerListener();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see org.abchip.mimo.tester.TestResult
	 * @generated
	 */
	EClass getTestResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.tester.TestResult#getAssertResults <em>Assert Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert Results</em>'.
	 * @see org.abchip.mimo.tester.TestResult#getAssertResults()
	 * @see #getTestResult()
	 * @generated
	 */
	EReference getTestResult_AssertResults();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestResult#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.abchip.mimo.tester.TestResult#getCategory()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestResult#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.abchip.mimo.tester.TestResult#getObject()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestResult#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runner</em>'.
	 * @see org.abchip.mimo.tester.TestResult#getRunner()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Runner();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestResult#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.abchip.mimo.tester.TestResult#getTime()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Time();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestSuiteLauncher <em>Test Suite Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite Launcher</em>'.
	 * @see org.abchip.mimo.tester.TestSuiteLauncher
	 * @generated
	 */
	EClass getTestSuiteLauncher();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestSuiteRunner <em>Test Suite Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite Runner</em>'.
	 * @see org.abchip.mimo.tester.TestSuiteRunner
	 * @generated
	 */
	EClass getTestSuiteRunner();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestUnitRunner <em>Test Unit Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Unit Runner</em>'.
	 * @see org.abchip.mimo.tester.TestUnitRunner
	 * @generated
	 */
	EClass getTestUnitRunner();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.TestObject <em>Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Object</em>'.
	 * @see org.abchip.mimo.tester.TestObject
	 * @generated
	 */
	EClass getTestObject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getName()
	 * @see #getTestObject()
	 * @generated
	 */
	EAttribute getTestObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestObject#getStringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Property</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getStringProperty()
	 * @see #getTestObject()
	 * @generated
	 */
	EAttribute getTestObject_StringProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.TestObject#getIntegerProperty <em>Integer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Property</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getIntegerProperty()
	 * @see #getTestObject()
	 * @generated
	 */
	EAttribute getTestObject_IntegerProperty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.tester.TestObject#getObjectReference <em>Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Reference</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getObjectReference()
	 * @see #getTestObject()
	 * @generated
	 */
	EReference getTestObject_ObjectReference();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.tester.TestObject#getObjectReferences <em>Object References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object References</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getObjectReferences()
	 * @see #getTestObject()
	 * @generated
	 */
	EReference getTestObject_ObjectReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.tester.TestObject#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.abchip.mimo.tester.TestObject#getValues()
	 * @see #getTestObject()
	 * @generated
	 */
	EAttribute getTestObject_Values();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.RunTest <em>Run Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Test</em>'.
	 * @see org.abchip.mimo.tester.RunTest
	 * @generated
	 */
	EClass getRunTest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.tester.RunTest#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see org.abchip.mimo.tester.RunTest#getComponent()
	 * @see #getRunTest()
	 * @generated
	 */
	EAttribute getRunTest_Component();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.tester.RunTestResponse <em>Run Test Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Test Response</em>'.
	 * @see org.abchip.mimo.tester.RunTestResponse
	 * @generated
	 */
	EClass getRunTestResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.tester.RunTestResponse#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.abchip.mimo.tester.RunTestResponse#getAssertions()
	 * @see #getRunTestResponse()
	 * @generated
	 */
	EReference getRunTestResponse_Assertions();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.tester.AssertionState <em>Assertion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion State</em>'.
	 * @see org.abchip.mimo.tester.AssertionState
	 * @generated
	 */
	EEnum getAssertionState();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.tester.TestRunnerEventType <em>Test Runner Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Runner Event Type</em>'.
	 * @see org.abchip.mimo.tester.TestRunnerEventType
	 * @generated
	 */
	EEnum getTestRunnerEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TesterFactory getTesterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.Asserter <em>Asserter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.Asserter
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAsserter()
		 * @generated
		 */
		EClass ASSERTER = eINSTANCE.getAsserter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.AssertionFailedImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionFailed()
		 * @generated
		 */
		EClass ASSERTION_FAILED = eINSTANCE.getAssertionFailed();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.AssertionResultImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionResult()
		 * @generated
		 */
		EClass ASSERTION_RESULT = eINSTANCE.getAssertionResult();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__MESSAGE = eINSTANCE.getAssertionResult_Message();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__NAME = eINSTANCE.getAssertionResult_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__TIME = eINSTANCE.getAssertionResult_Time();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.AssertionSuccessImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionSuccess()
		 * @generated
		 */
		EClass ASSERTION_SUCCESS = eINSTANCE.getAssertionSuccess();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestAsserter <em>Test Asserter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestAsserter
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestAsserter()
		 * @generated
		 */
		EClass TEST_ASSERTER = eINSTANCE.getTestAsserter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestManager <em>Test Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestManager
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestManager()
		 * @generated
		 */
		EClass TEST_MANAGER = eINSTANCE.getTestManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestRunner <em>Test Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestRunner
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunner()
		 * @generated
		 */
		EClass TEST_RUNNER = eINSTANCE.getTestRunner();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.TestRunnerEventImpl <em>Test Runner Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.TestRunnerEventImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerEvent()
		 * @generated
		 */
		EClass TEST_RUNNER_EVENT = eINSTANCE.getTestRunnerEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RUNNER_EVENT__SOURCE = eINSTANCE.getTestRunnerEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RUNNER_EVENT__TYPE = eINSTANCE.getTestRunnerEvent_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestRunnerListener <em>Test Runner Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestRunnerListener
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerListener()
		 * @generated
		 */
		EClass TEST_RUNNER_LISTENER = eINSTANCE.getTestRunnerListener();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.TestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.TestResultImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestResult()
		 * @generated
		 */
		EClass TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em><b>Assert Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESULT__ASSERT_RESULTS = eINSTANCE.getTestResult_AssertResults();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__CATEGORY = eINSTANCE.getTestResult_Category();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__OBJECT = eINSTANCE.getTestResult_Object();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__RUNNER = eINSTANCE.getTestResult_Runner();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__TIME = eINSTANCE.getTestResult_Time();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestSuiteLauncher <em>Test Suite Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestSuiteLauncher
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestSuiteLauncher()
		 * @generated
		 */
		EClass TEST_SUITE_LAUNCHER = eINSTANCE.getTestSuiteLauncher();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestSuiteRunner <em>Test Suite Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestSuiteRunner
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestSuiteRunner()
		 * @generated
		 */
		EClass TEST_SUITE_RUNNER = eINSTANCE.getTestSuiteRunner();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestUnitRunner <em>Test Unit Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestUnitRunner
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestUnitRunner()
		 * @generated
		 */
		EClass TEST_UNIT_RUNNER = eINSTANCE.getTestUnitRunner();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.TestObjectImpl <em>Test Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.TestObjectImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestObject()
		 * @generated
		 */
		EClass TEST_OBJECT = eINSTANCE.getTestObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECT__NAME = eINSTANCE.getTestObject_Name();

		/**
		 * The meta object literal for the '<em><b>String Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECT__STRING_PROPERTY = eINSTANCE.getTestObject_StringProperty();

		/**
		 * The meta object literal for the '<em><b>Integer Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECT__INTEGER_PROPERTY = eINSTANCE.getTestObject_IntegerProperty();

		/**
		 * The meta object literal for the '<em><b>Object Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_OBJECT__OBJECT_REFERENCE = eINSTANCE.getTestObject_ObjectReference();

		/**
		 * The meta object literal for the '<em><b>Object References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_OBJECT__OBJECT_REFERENCES = eINSTANCE.getTestObject_ObjectReferences();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECT__VALUES = eINSTANCE.getTestObject_Values();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.RunTestImpl <em>Run Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.RunTestImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getRunTest()
		 * @generated
		 */
		EClass RUN_TEST = eINSTANCE.getRunTest();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_TEST__COMPONENT = eINSTANCE.getRunTest_Component();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.impl.RunTestResponseImpl <em>Run Test Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.impl.RunTestResponseImpl
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getRunTestResponse()
		 * @generated
		 */
		EClass RUN_TEST_RESPONSE = eINSTANCE.getRunTestResponse();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_TEST_RESPONSE__ASSERTIONS = eINSTANCE.getRunTestResponse_Assertions();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.AssertionState <em>Assertion State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.AssertionState
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getAssertionState()
		 * @generated
		 */
		EEnum ASSERTION_STATE = eINSTANCE.getAssertionState();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.tester.TestRunnerEventType <em>Test Runner Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.tester.TestRunnerEventType
		 * @see org.abchip.mimo.tester.impl.TesterPackageImpl#getTestRunnerEventType()
		 * @generated
		 */
		EEnum TEST_RUNNER_EVENT_TYPE = eINSTANCE.getTestRunnerEventType();

	}

} //TesterPackage
