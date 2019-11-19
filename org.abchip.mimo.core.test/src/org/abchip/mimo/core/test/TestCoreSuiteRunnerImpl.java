package org.abchip.mimo.core.test;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

@Test(category = "Core")
public class TestCoreSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	public TestCoreSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category);
	}

	@TestStarted
	public void start() {
	}

	@TestStopped
	public void stop() {
	}
}
