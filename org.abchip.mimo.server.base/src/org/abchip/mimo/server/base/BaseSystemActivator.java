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
package org.abchip.mimo.server.base;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobLogManager;
import org.abchip.mimo.server.JobManager;
import org.abchip.mimo.util.ThreadManager;

public class BaseSystemActivator {

	@Inject
	private ThreadManager threadManager;

	@ComponentStarted
	public void start(Application application, org.abchip.mimo.server.System system, ResourceManager resourceManager, JobManager jobManager, org.abchip.mimo.server.SystemManager systemManager,
			JobLogManager jobLogManager) {

		system.setName(resolveVariables(application, system.getName()));

		Context systemContext = application.getContext().createChildContext(system.getName());
		system.setContext(systemContext);

		Job jobKernel = systemManager.start(system);

		application.getContext().set(org.abchip.mimo.server.System.class, system);
		application.getContext().set(Job.class, jobKernel);

		org.abchip.mimo.util.Thread thread = threadManager.createThread("job-closer", new BaseJobCloser(threadManager, jobManager), true);
		threadManager.start(thread);
	}

	public static String resolveVariables(Application application, String varString) {

		String resolvedString = varString;
		if (resolvedString.indexOf("${rt.core.application.name}") >= 0)
			resolvedString = resolvedString.replace("${rt.core.application.name}", application.getName());
		if (resolvedString.indexOf("${osgi.instance.area}") >= 0)
			resolvedString = resolvedString.replace("${osgi.instance.area}", System.getProperty("osgi.instance.area"));

		return resolvedString;
	}
}