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
package org.abchip.mimo.server.test;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

public class TestServerSuiteLauncherImpl implements TestSuiteLauncher {

	@Inject
	private TestManager testManager;

	@Override
	public TestSuiteRunner createSuite(ContextProvider contextProvider) {
		return new InternalSuiteDirectoryRunnerImpl(contextProvider.getContext(), testManager, null);
	}

	@Test(category = "Server")
	private class InternalSuiteDirectoryRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

		public InternalSuiteDirectoryRunnerImpl(Context context, TestManager testManager, String category) {
			super(context, testManager, category);
		}		
	}
}