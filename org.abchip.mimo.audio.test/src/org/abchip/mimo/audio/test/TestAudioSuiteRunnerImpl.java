/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.test;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

@Test(category = "Audio")
public class TestAudioSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	public TestAudioSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category, "/runner/");
	}

	@TestStarted
	public void start() {
		
	}

	@TestStopped
	public void stop() {

	}
}
