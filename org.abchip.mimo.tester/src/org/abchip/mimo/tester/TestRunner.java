/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import org.abchip.mimo.context.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestRunner()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestRunner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(TestRunnerListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void removeListener(TestRunnerListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

} // QTestRunner
