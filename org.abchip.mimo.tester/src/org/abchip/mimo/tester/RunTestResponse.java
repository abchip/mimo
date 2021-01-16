/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.List;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Test Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.RunTestResponse#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.tester.TesterPackage#getRunTestResponse()
 * @model
 * @generated
 */
public interface RunTestResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.tester.AssertionResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see org.abchip.mimo.tester.TesterPackage#getRunTestResponse_Assertions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<AssertionResult> getAssertions();

} // RunTestResponse
