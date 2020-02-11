/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestRunnerListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestRunnerListener {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventRequired="true"
	 * @generated
	 */
	void handleEvent(TestRunnerEvent event);
} // QTestRunnerListener
