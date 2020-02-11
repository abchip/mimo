/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.List;

import java.util.concurrent.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestSuiteRunner()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.tester.TestRunner org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.java.JavaList&lt;org.abchip.mimo.tester.TestResult&gt;&gt;"
 * @generated
 */
public interface TestSuiteRunner extends TestRunner, Callable<List<TestResult>> {
} // QTestSuiteRunner
