/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.base;

import javax.inject.Inject;

import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.util.ThreadManager;

public class BaseSystemActivator {

	@Inject
	private ThreadManager threadManager;

	@ComponentStarted
	public void start(ContextRoot contextRoot, org.abchip.mimo.server.System system, ResourceManager resourceManager, JobManager jobManager, org.abchip.mimo.server.SystemManager systemManager,
			JobLogManager jobLogManager) {

		system.setContext(contextRoot);

		@SuppressWarnings("resource")
		Job jobKernel = systemManager.start(system);

		contextRoot.set(org.abchip.mimo.server.System.class, system);
		contextRoot.set(Job.class, jobKernel);

		org.abchip.mimo.util.Thread thread = threadManager.createThread("job-closer", new BaseJobCloser(threadManager, jobManager), true);
		threadManager.start(thread);
	}
}
