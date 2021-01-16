/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.TestRunnerEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestRunnerEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestRunnerEvent()
 * @model
 * @generated
 */
public interface TestRunnerEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TestRunner)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestRunnerEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	TestRunner getSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestRunnerEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TestRunner value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.tester.TestRunnerEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.tester.TestRunnerEventType
	 * @see #setType(TestRunnerEventType)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestRunnerEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	TestRunnerEventType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestRunnerEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.tester.TestRunnerEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(TestRunnerEventType value);

} // QTestRunnerEvent
