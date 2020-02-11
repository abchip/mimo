/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.test;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

@Test(category = "Language")
public class TestLanguageSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	public TestLanguageSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category);
	}

	@TestStarted
	public void start() {
		
	}

	@TestStopped
	public void stop() {

	}
}
