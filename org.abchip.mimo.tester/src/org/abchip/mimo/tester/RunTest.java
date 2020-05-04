/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.RunTest#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.tester.TesterPackage#getRunTest()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.tester.RunTestResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.tester.RunTestResponse&gt;"
 * @generated
 */
public interface RunTest extends ServiceRequest<RunTestResponse>, Callable<RunTestResponse> {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see org.abchip.mimo.tester.TesterPackage#getRunTest_Component()
	 * @model required="true"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.RunTest#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);
} // RunTest
