/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester.impl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.expression.ExpressionPackage;
import org.abchip.mimo.tester.Asserter;
import org.abchip.mimo.tester.AssertionFailed;
import org.abchip.mimo.tester.AssertionResult;
import org.abchip.mimo.tester.AssertionState;
import org.abchip.mimo.tester.AssertionSuccess;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestObject;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestRunnerEvent;
import org.abchip.mimo.tester.TestRunnerEventType;
import org.abchip.mimo.tester.TestRunnerListener;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.TestUnitRunner;
import org.abchip.mimo.tester.TesterFactory;
import org.abchip.mimo.tester.TesterPackage;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TesterPackageImpl extends EPackageImpl implements TesterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asserterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionSuccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testAsserterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteLauncherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testUnitRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testRunnerEventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.tester.TesterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TesterPackageImpl() {
		super(eNS_URI, TesterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TesterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TesterPackage init() {
		if (isInited) return (TesterPackage)EPackage.Registry.INSTANCE.getEPackage(TesterPackage.eNS_URI);

		// Obtain or create and register package
		TesterPackageImpl theTesterPackage = (TesterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TesterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TesterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		EntityPackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();
		UtilPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTesterPackage.createPackageContents();

		// Initialize created meta-data
		theTesterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTesterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TesterPackage.eNS_URI, theTesterPackage);
		return theTesterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsserter() {
		return asserterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionFailed() {
		return assertionFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionResult() {
		return assertionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionResult_Message() {
		return (EAttribute)assertionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionResult_Time() {
		return (EAttribute)assertionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionSuccess() {
		return assertionSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestAsserter() {
		return testAsserterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestManager() {
		return testManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunner() {
		return testRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunnerEvent() {
		return testRunnerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunnerEvent_Source() {
		return (EReference)testRunnerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestRunnerEvent_Type() {
		return (EAttribute)testRunnerEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunnerListener() {
		return testRunnerListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestResult() {
		return testResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestResult_AssertResults() {
		return (EReference)testResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Category() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Object() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Runner() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Time() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteLauncher() {
		return testSuiteLauncherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteRunner() {
		return testSuiteRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestUnitRunner() {
		return testUnitRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestObject() {
		return testObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObject_Name() {
		return (EAttribute)testObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObject_StringProperty() {
		return (EAttribute)testObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObject_IntegerProperty() {
		return (EAttribute)testObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestObject_ObjectReference() {
		return (EReference)testObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestObject_ObjectReferences() {
		return (EReference)testObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionState() {
		return assertionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestRunnerEventType() {
		return testRunnerEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesterFactory getTesterFactory() {
		return (TesterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		asserterEClass = createEClass(ASSERTER);

		assertionFailedEClass = createEClass(ASSERTION_FAILED);

		assertionResultEClass = createEClass(ASSERTION_RESULT);
		createEAttribute(assertionResultEClass, ASSERTION_RESULT__MESSAGE);
		createEAttribute(assertionResultEClass, ASSERTION_RESULT__TIME);

		assertionSuccessEClass = createEClass(ASSERTION_SUCCESS);

		testAsserterEClass = createEClass(TEST_ASSERTER);

		testManagerEClass = createEClass(TEST_MANAGER);

		testRunnerEClass = createEClass(TEST_RUNNER);

		testRunnerEventEClass = createEClass(TEST_RUNNER_EVENT);
		createEReference(testRunnerEventEClass, TEST_RUNNER_EVENT__SOURCE);
		createEAttribute(testRunnerEventEClass, TEST_RUNNER_EVENT__TYPE);

		testRunnerListenerEClass = createEClass(TEST_RUNNER_LISTENER);

		testResultEClass = createEClass(TEST_RESULT);
		createEReference(testResultEClass, TEST_RESULT__ASSERT_RESULTS);
		createEAttribute(testResultEClass, TEST_RESULT__CATEGORY);
		createEAttribute(testResultEClass, TEST_RESULT__OBJECT);
		createEAttribute(testResultEClass, TEST_RESULT__RUNNER);
		createEAttribute(testResultEClass, TEST_RESULT__TIME);

		testSuiteLauncherEClass = createEClass(TEST_SUITE_LAUNCHER);

		testSuiteRunnerEClass = createEClass(TEST_SUITE_RUNNER);

		testUnitRunnerEClass = createEClass(TEST_UNIT_RUNNER);

		testObjectEClass = createEClass(TEST_OBJECT);
		createEAttribute(testObjectEClass, TEST_OBJECT__NAME);
		createEAttribute(testObjectEClass, TEST_OBJECT__STRING_PROPERTY);
		createEAttribute(testObjectEClass, TEST_OBJECT__INTEGER_PROPERTY);
		createEReference(testObjectEClass, TEST_OBJECT__OBJECT_REFERENCE);
		createEReference(testObjectEClass, TEST_OBJECT__OBJECT_REFERENCES);

		// Create enums
		assertionStateEEnum = createEEnum(ASSERTION_STATE);
		testRunnerEventTypeEEnum = createEEnum(TEST_RUNNER_EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertionFailedEClass.getESuperTypes().add(this.getAssertionResult());
		assertionResultEClass.getESuperTypes().add(theEntityPackage.getEntity());
		assertionSuccessEClass.getESuperTypes().add(this.getAssertionResult());
		testAsserterEClass.getESuperTypes().add(this.getAsserter());
		testRunnerEClass.getESuperTypes().add(theContextPackage.getContextProvider());
		testResultEClass.getESuperTypes().add(theEntityPackage.getEntity());
		EGenericType g1 = createEGenericType(this.getTestRunner());
		testSuiteRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theUtilPackage.getJavaCallable());
		EGenericType g2 = createEGenericType(theUtilPackage.getJavaList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getTestResult());
		g2.getETypeArguments().add(g3);
		testSuiteRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTestRunner());
		testUnitRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theUtilPackage.getJavaCallable());
		g2 = createEGenericType(this.getTestResult());
		g1.getETypeArguments().add(g2);
		testUnitRunnerEClass.getEGenericSuperTypes().add(g1);
		testObjectEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(asserterEClass, Asserter.class, "Asserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(asserterEClass, null, "assertTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "fail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "success", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionFailedEClass, AssertionFailed.class, "AssertionFailed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionResultEClass, AssertionResult.class, "AssertionResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionResult_Message(), ecorePackage.getEString(), "message", null, 0, 1, AssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, AssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assertionResultEClass, this.getAssertionState(), "getAssertionState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionSuccessEClass, AssertionSuccess.class, "AssertionSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testAsserterEClass, TestAsserter.class, "TestAsserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(testAsserterEClass, null, "resetTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testManagerEClass, TestManager.class, "TestManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testManagerEClass, this.getTestSuiteRunner(), "prepareSuiteRunner", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestUnitRunner(), "prepareUnitRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestUnitRunner(), "prepareUnitRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "classURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testRunnerEClass, TestRunner.class, "TestRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testRunnerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testRunnerEClass, null, "removeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testRunnerEventEClass, TestRunnerEvent.class, "TestRunnerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunnerEvent_Source(), this.getTestRunner(), null, "source", null, 1, 1, TestRunnerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestRunnerEvent_Type(), this.getTestRunnerEventType(), "type", null, 1, 1, TestRunnerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunnerListenerEClass, TestRunnerListener.class, "TestRunnerListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testRunnerListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testResultEClass, TestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestResult_AssertResults(), this.getAssertionResult(), null, "assertResults", null, 0, -1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Category(), ecorePackage.getEString(), "category", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Object(), ecorePackage.getEString(), "object", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Runner(), ecorePackage.getEString(), "runner", null, 1, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEInt(), "getFailedCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEInt(), "getSuccessCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEBoolean(), "isFailed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testSuiteLauncherEClass, TestSuiteLauncher.class, "TestSuiteLauncher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testSuiteLauncherEClass, this.getTestSuiteRunner(), "createSuite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testSuiteRunnerEClass, TestSuiteRunner.class, "TestSuiteRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testUnitRunnerEClass, TestUnitRunner.class, "TestUnitRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testObjectEClass, TestObject.class, "TestObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, TestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestObject_StringProperty(), ecorePackage.getEString(), "stringProperty", null, 0, 1, TestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestObject_IntegerProperty(), ecorePackage.getEInt(), "integerProperty", null, 0, 1, TestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestObject_ObjectReference(), this.getTestObject(), null, "objectReference", null, 0, 1, TestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestObject_ObjectReferences(), this.getTestObject(), null, "objectReferences", null, 0, -1, TestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assertionStateEEnum, AssertionState.class, "AssertionState");
		addEEnumLiteral(assertionStateEEnum, AssertionState.SUCCESS);
		addEEnumLiteral(assertionStateEEnum, AssertionState.FAILED);

		initEEnum(testRunnerEventTypeEEnum, TestRunnerEventType.class, "TestRunnerEventType");
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STARTING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STOPPING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STOPPED);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STARTING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STOPPING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STOPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //TesterPackageImpl
