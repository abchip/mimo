/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchipm.imo.logic.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.logic.MindManager;
import org.abchip.mimo.logic.Term;
import org.abchip.mimo.logic.Theory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Logic")
public class TestLogic {

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private MindManager mindManager;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void start() {

		Frame<?> frame = resourceManager.getFrame(testRunner.getContext(), EntityPackage.eINSTANCE.getFrame().getName());

		Theory theory = mindManager.buildTheory(testRunner.getContext(), frame);

		for (Term mindTerm : theory.getFacts())
			mindTerm.toString();
	}
}
