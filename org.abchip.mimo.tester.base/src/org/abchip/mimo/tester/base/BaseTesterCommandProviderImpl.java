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
package org.abchip.mimo.tester.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationModule;
import org.abchip.mimo.application.ServiceRef;
import org.abchip.mimo.application.ServiceStatus;
import org.abchip.mimo.tester.AssertionFailed;
import org.abchip.mimo.tester.AssertionResult;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class BaseTesterCommandProviderImpl implements CommandProvider {

	@Inject
	private Application application;
	@Inject
	private TestManager testManager;
	
	public void _test(CommandInterpreter interpreter) throws Exception {
	
		String componentName = interpreter.nextArgument();
		
		for(ApplicationComponent component: application.getComponents()) {
			if(!component.getName().equalsIgnoreCase(componentName))
				continue;
			
			for(ApplicationModule module: component.getModules()) {
				for(ServiceRef serviceRef: module.getServices()) {
					if(!serviceRef.getInterfaceName().equals(TestSuiteLauncher.class.getName()))
						continue;
					
					if(serviceRef.getStatus() != ServiceStatus.ACTIVE)
						continue;

					List<TestSuiteRunner> runners = testManager.prepareSuiteRunner(application, component.getName());
					for(TestSuiteRunner runner: runners) {		
						List<TestResult> results = runner.call();
						for(TestResult result: results) {							
							if(result.isFailed()) {
								for(AssertionResult assertionResult: result.getAssertResults()) {
									switch (assertionResult.getAssertionState()) {
									case FAILED:
										AssertionFailed assertionFailed = (AssertionFailed)assertionResult;
										System.err.println(assertionFailed);
										break;
									case SUCCESS:
										break;
									}
								}
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
