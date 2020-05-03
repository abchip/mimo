/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.tester.AssertionFailed;
import org.abchip.mimo.tester.AssertionResult;
import org.abchip.mimo.tester.AssertionSuccess;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TestCommands extends BaseTestCommands {

	private TestManager testManager;

	@Inject
	public TestCommands(Application application) {
		super(application);

		this.testManager = application.getContext().get(TestManager.class);
	}

	public void _test(CommandInterpreter interpreter) throws Exception {

		try (ContextProvider contextProvider = this.login()) {

			String componentName = nextArgument(interpreter);

			for (ApplicationComponent component : contextProvider.get().get(Application.class).getActiveComponents()) {
				if (!component.getName().equalsIgnoreCase(componentName))
					continue;

				List<TestSuiteRunner> runners = testManager.prepareSuiteRunner(contextProvider.get(), component.getName());
				for (TestSuiteRunner runner : runners) {
					List<TestResult> results = runner.call();
					for (TestResult result : results) {
						for (AssertionResult assertionResult : result.getAssertResults()) {
							switch (assertionResult.getAssertionState()) {
							case FAILED:
								AssertionFailed assertionFailed = (AssertionFailed) assertionResult;
								interpreter.println(assertionFailed);
								break;
							case SUCCESS:
								AssertionSuccess assertionSuccess = (AssertionSuccess) assertionResult;
								interpreter.println(assertionSuccess);
								break;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
