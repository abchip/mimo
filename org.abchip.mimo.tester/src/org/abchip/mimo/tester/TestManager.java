/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.List;
import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model componentRequired="true"
	 * @generated
	 */
	List<TestSuiteRunner> prepareSuiteRunner(ContextProvider contextProvider, String component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	TestUnitRunner prepareUnitRunner(ContextProvider contextProvider, Class<?> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" classURIRequired="true"
	 * @generated
	 */
	TestUnitRunner prepareUnitRunner(ContextProvider contextProvider, String classURI);

} // QTestManager
