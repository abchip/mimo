/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.tester.base;

import java.util.Collection;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.TestManager;

public abstract class BaseTestSuiteDirectoryRunnerImpl extends BaseTestSuiteRunnerImpl {

	public BaseTestSuiteDirectoryRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category);
	}

	private String runnerDirPath = "/runner/";	

	/**
	 * Override to define runners dir path
	 * @return
	 */
	public String getRunnersDirPath() {
		return runnerDirPath;
	}
	
	@Override
	public Collection<Class<?>> getTestClassList() {
		return BaseTestHelper.findTestClasses(this, getRunnersDirPath(), getCategory());	
	}
}
