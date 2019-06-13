/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
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
	public FrameManager frameManager;

	@TestStarted
	public void main() {
		testAsserter.assertNotNull("FrameManager", frameManager);

		testFrame();
	}

	private <E extends EntityNameable> void testFrame() {

		EntityReader<Frame<E>> frameReader = frameManager.getFrameReader(testRunner);
		for (Frame<E> frame : frameReader.find(null)) {
			if (!frame.isAbstract() && frame.getSuperNames().contains(EntityPackage.eINSTANCE.getEntityNameable().getName()))
				testAsserter.assertNotNull("Entity creation " + frame.getName(), frameManager.createEntity(frame));
		}
	}
}
