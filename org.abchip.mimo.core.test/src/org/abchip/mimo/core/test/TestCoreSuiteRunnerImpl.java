package org.abchip.mimo.core.test;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.resource.ResourceManager;
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

	@SuppressWarnings("unused")
	@TestStarted
	public void start() {

		ContextRoot contextRoot = getContext().get(ContextRoot.class);
		ResourceManager resourceManager = getContext().get(ResourceManager.class);
	}

	@SuppressWarnings("unused")
	@TestStopped
	public void stop() {

		ContextRoot contextRoot = getContext().get(ContextRoot.class);
		ResourceManager resourceManager = getContext().get(ResourceManager.class);
	}
}
