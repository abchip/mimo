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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.AssertionFailed;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestRunnerEvent;
import org.abchip.mimo.tester.TestRunnerEventType;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.TestUnitRunner;
import org.abchip.mimo.tester.TesterFactory;

public class BaseTestUnitRunnerImpl extends BaseTestRunnerImpl implements TestUnitRunner {

	private String classURI;
	
	public BaseTestUnitRunnerImpl(Context context, String classURI) {
		super(context);
		this.classURI = classURI;

	}
	
	@Override
	public TestResult call() {

		TestRunnerEvent event = TesterFactory.eINSTANCE.createTestRunnerEvent();
		event.setSource(this);

		Class<?> testClass = getContext().getContextRoot().loadClass(classURI);
		if (testClass == null)
			throw new RuntimeException("Invalid runner: " + classURI);

		TestResult testResult = TesterFactory.eINSTANCE.createTestResult();

		Test test = testClass.getAnnotation(Test.class);
		if(!test.category().isEmpty())
			testResult.setCategory(test.category());
		if(test.entity() != null)
			testResult.setObject(test.entity());
		testResult.setRunner(testClass.getSimpleName());

		TestAsserter testAsserter = new BaseTestAsserterImpl(testResult);
		getContext().set(TestAsserter.class, testAsserter);
		getContext().set(TestResult.class, testResult);
		getContext().set(TestRunner.class, this);

		Object testCase = getContext().make(testClass);
		long start = System.currentTimeMillis();
		testAsserter.resetTime();
		try {
			// unit starting
			event.setType(TestRunnerEventType.UNIT_STARTING);
			fireEvent(event);

			getContext().invoke(testCase, TestStarted.class);

			// unit stopping
			event.setType(TestRunnerEventType.UNIT_STOPPING);
			fireEvent(event);

			// invoke
			getContext().invoke(testCase, TestStopped.class);

			// unit stopped
			event.setType(TestRunnerEventType.UNIT_STOPPED);
			fireEvent(event);

		} catch (Exception e) {
			AssertionFailed assertionFailed = TesterFactory.eINSTANCE.createAssertionFailed();
			assertionFailed.setMessage(e.getMessage());
			testResult.getAssertResults().add(assertionFailed);
		} finally {
			long end = System.currentTimeMillis();
			testResult.setTime(end - start);
		}

		return testResult;
	}
}
