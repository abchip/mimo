/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.TestUnitRunner;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class BaseTestManagerImpl implements TestManager {

	@Override
	public TestUnitRunner prepareUnitRunner(Context context, Class<?> klass) {

		TestUnitRunner testRunner = new BaseTestUnitRunnerImpl(context, klass);

		return testRunner;
	}

	@Override
	public List<TestSuiteRunner> prepareSuiteRunner(Context context, String component) {
		BundleContext bundleContext = FrameworkUtil.getBundle(Context.class).getBundleContext();

		// Search QTestLauncher services for specific component
		String filter = null;

		if (component != null && component.length() > 0)
			filter = "(" + MimoConstants.COMPONENT_NAME + "=" + component + ")";

		Collection<ServiceReference<TestSuiteLauncher>> serviceReferences;
		try {
			serviceReferences = bundleContext.getServiceReferences(TestSuiteLauncher.class, filter);
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		List<TestSuiteRunner> suiteRunners = new ArrayList<TestSuiteRunner>();
		for (ServiceReference<TestSuiteLauncher> serviceRef : serviceReferences) {
			TestSuiteLauncher testSuiteLauncher = bundleContext.getService(serviceRef);

			TestSuiteRunner suiteRunner = testSuiteLauncher.createSuite(context);
			suiteRunners.add(suiteRunner);
		}
		return suiteRunners;
	}
}
