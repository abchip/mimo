package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;

@Test(entity = "ResourceDriver")
public class TestSerializer {
	
	@SuppressWarnings("unused")
	@Inject
	private ResourceManager resourceManager;
	@SuppressWarnings("unused")
	@Inject
	private TestRunner testRunner;
	@Inject
	public transient TestAsserter asserter;

	@TestStarted
	public void start() {
	}
	
	@TestStopped
	public void stop() {
	}
}
