/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester.impl;

import org.abchip.mimo.tester.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TesterFactoryImpl extends EFactoryImpl implements TesterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TesterFactory init() {
		try {
			TesterFactory theTesterFactory = (TesterFactory)EPackage.Registry.INSTANCE.getEFactory(TesterPackage.eNS_URI);
			if (theTesterFactory != null) {
				return theTesterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TesterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesterFactoryImpl() {
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
			case TesterPackage.ASSERTION_FAILED: return (EObject)createAssertionFailed();
			case TesterPackage.ASSERTION_SUCCESS: return (EObject)createAssertionSuccess();
			case TesterPackage.TEST_RUNNER_EVENT: return (EObject)createTestRunnerEvent();
			case TesterPackage.TEST_RESULT: return (EObject)createTestResult();
			case TesterPackage.TEST_OBJECT: return (EObject)createTestObject();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TesterPackage.ASSERTION_STATE:
				return createAssertionStateFromString(eDataType, initialValue);
			case TesterPackage.TEST_RUNNER_EVENT_TYPE:
				return createTestRunnerEventTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TesterPackage.ASSERTION_STATE:
				return convertAssertionStateToString(eDataType, instanceValue);
			case TesterPackage.TEST_RUNNER_EVENT_TYPE:
				return convertTestRunnerEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionFailed createAssertionFailed() {
		AssertionFailedImpl assertionFailed = new AssertionFailedImpl();
		return assertionFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionSuccess createAssertionSuccess() {
		AssertionSuccessImpl assertionSuccess = new AssertionSuccessImpl();
		return assertionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestRunnerEvent createTestRunnerEvent() {
		TestRunnerEventImpl testRunnerEvent = new TestRunnerEventImpl();
		return testRunnerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestResult createTestResult() {
		TestResultImpl testResult = new TestResultImpl();
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestObject createTestObject() {
		TestObjectImpl testObject = new TestObjectImpl();
		return testObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionState createAssertionStateFromString(EDataType eDataType, String initialValue) {
		AssertionState result = AssertionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestRunnerEventType createTestRunnerEventTypeFromString(EDataType eDataType, String initialValue) {
		TestRunnerEventType result = TestRunnerEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestRunnerEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TesterPackage getTesterPackage() {
		return (TesterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TesterPackage getPackage() {
		return TesterPackage.eINSTANCE;
	}

} //TesterFactoryImpl
