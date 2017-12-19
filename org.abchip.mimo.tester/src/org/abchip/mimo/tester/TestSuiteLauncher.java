/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestSuiteLauncher()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestSuiteLauncher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TestSuiteRunner createSuite(ContextProvider contextProvider);

} // QTestSuiteLauncher
