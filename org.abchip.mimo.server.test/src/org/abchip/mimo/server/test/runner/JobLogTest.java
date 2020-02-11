/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobLog;
import org.abchip.mimo.server.JobLogEntry;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "JobLog")
public class JobLogTest {

	@Inject
	private Job job;
	@Inject
	private JobLogManager jobLogManger;
	@Inject
	public transient TestAsserter testAsserter;

	@TestStarted
	public void doTest() {

		jobLogManger.info(job, "Test INFO");

		JobLog jobLog = jobLogManger.lookup(job);

		String lastMessage = null;

		for (JobLogEntry jobLogEntry : jobLog.getEntries())
			lastMessage = jobLogEntry.getMessage();

		testAsserter.assertEquals("Test JOBLOG", "Test INFO", lastMessage);

	}
}
