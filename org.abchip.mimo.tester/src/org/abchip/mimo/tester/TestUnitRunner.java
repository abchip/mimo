/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.concurrent.Callable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test Runner</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestUnitRunner()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.tester.TestRunner org.abchip.mimo.util.JavaCallable&lt;org.abchip.mimo.tester.TestResult&gt;"
 * @generated
 */
public interface TestUnitRunner extends TestRunner, Callable<TestResult> {

} // QTestUnitRunner
