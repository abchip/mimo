/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestRunnerEvent;
import org.abchip.mimo.tester.TestRunnerEventType;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.TestUnitRunner;
import org.abchip.mimo.tester.TesterFactory;

public abstract class BaseTestSuiteRunnerImpl extends BaseTestRunnerImpl implements TestSuiteRunner {

	private TestManager testManager;
	private String category;

	public BaseTestSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context);
		this.testManager = testManager;
		this.category = category;
	}

	/*
	 * Return the list of test classes to execute
	 */
	public abstract Collection<Class<?>> getTestClassList();

	protected String getCategory() {
		return category;
	}

	@Override
	public List<TestResult> call() {

		TestRunnerEvent event = TesterFactory.eINSTANCE.createTestRunnerEvent();
		event.setSource(this);

		// suite starting
		event.setType(TestRunnerEventType.SUITE_STARTING);
		fireEvent(event);
		
		getContext().invoke(this, TestStarted.class);

		// runners
		List<TestUnitRunner> testRunners = new ArrayList<TestUnitRunner>();
		for (Class<?> testClass : getTestClassList()) {
			try {
				TestUnitRunner testRunner = testManager.prepareUnitRunner(getContext(), testClass);
				testRunners.add(testRunner);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

		List<TestResult> testResults = new ArrayList<TestResult>();
		for (TestUnitRunner testRunner : testRunners) {
			TestResult testResult;
			try {
				testResult = testRunner.call();
				if (testResult.getCategory() == null) {
					Test testSuite = this.getClass().getAnnotation(Test.class);
					if (testSuite != null && !testSuite.category().isEmpty())
						testResult.setCategory(testSuite.category());
				}
				testResults.add(testResult);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

		// suite stopping
		event.setType(TestRunnerEventType.SUITE_STOPPING);
		fireEvent(event);

		try {
			// invoke
			getContext().invoke(this, TestStopped.class);		
		} catch (Exception e) {
			System.err.println(e.getMessage());			
		}
		
		// suite stopped
		event.setType(TestRunnerEventType.SUITE_STOPPED);
		fireEvent(event);

		return testResults;
	}
}