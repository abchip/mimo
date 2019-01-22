/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.List;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test Result</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.TestResult#getAssertResults <em>Assert Results</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestResult#getCategory <em>Category</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestResult#getObject <em>Object</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestResult#getRunner <em>Runner</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestResult#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestResult()
 * @model
 * @generated
 */
public interface TestResult extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFailed();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see org.abchip.mimo.tester.QDevelopmentKitTestPackage#getTestResult_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestResult#getObject
	 * <em>Object</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runner</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Runner</em>' attribute.
	 * @see #setRunner(String)
	 * @see org.abchip.mimo.tester.QDevelopmentKitTestPackage#getTestResult_Runner()
	 * @model required="true"
	 * @generated
	 */
	String getRunner();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestResult#getRunner
	 * <em>Runner</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Runner</em>' attribute.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see org.abchip.mimo.tester.QDevelopmentKitTestPackage#getTestResult_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestResult#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getFailedCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getSuccessCount();

	/**
	 * Returns the value of the '<em><b>Assert Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.tester.AssertionResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert Results</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Results</em>' containment reference list.
	 * @see org.abchip.mimo.tester.TesterPackage#getTestResult_AssertResults()
	 * @model containment="true"
	 * @generated
	 */
	List<AssertionResult> getAssertResults();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.abchip.mimo.tester.QDevelopmentKitTestPackage#getTestResult_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestResult#getCategory
	 * <em>Category</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // QTestResult
