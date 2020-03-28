/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Frame")
public class TestFrame {

	@Inject
	public TestAsserter testAsserter;
	@Inject
	private TestRunner testRunner;
	@Inject
	public ResourceManager resourceManager;

	@TestStarted
	public void main() {
		testFrame();
	}

	@SuppressWarnings("rawtypes")
	private void testFrame() {

		try (EntityIterator<Frame> frames = resourceManager.getResourceReader(testRunner.getContext(), Frame.class).find()) {
			for (Frame<?> frame : frames) {
				if (!frame.isAbstract() && frame.getSuperNames().contains(EntityPackage.eINSTANCE.getEntityIdentifiable().getName()))
					testAsserter.assertNotNull("Entity creation " + frame.getName(), frame.createEntity());
			}
		}
	}
}
