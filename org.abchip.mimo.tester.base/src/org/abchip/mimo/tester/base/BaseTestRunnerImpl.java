/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 *   Mattia Rocchi  - Implementation
 */
package org.abchip.mimo.tester.base;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestRunnerEvent;
import org.abchip.mimo.tester.TestRunnerListener;

public abstract class BaseTestRunnerImpl implements TestRunner {

	private Context context;
	private List<TestRunnerListener> listeners = new ArrayList<TestRunnerListener>();
	
	protected BaseTestRunnerImpl(Context context) {
		this.context = context;
	}
	
	@Override
	public Context getContext() {
		return this.context;
	}

	@Override
	public void registerListener(TestRunnerListener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removeListener(TestRunnerListener listener) {
		this.listeners.remove(listener);
	}

	protected void fireEvent(TestRunnerEvent event) {
		for (TestRunnerListener listener : this.listeners)
			listener.handleEvent(event);
	}
}
