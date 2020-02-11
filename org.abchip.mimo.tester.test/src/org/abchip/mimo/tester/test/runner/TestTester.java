/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;


@Test(entity = "Asserter")
public class TestTester {

	@Inject
	public transient TestAsserter testAsserter;

	@TestStarted
	public void main() {

		testAsserter.assertTrue("Assert true success", true);
		testAsserter.assertNull("Assert null success", null);
		testAsserter.assertNotNull("Assert not null success", new Object());
		testAsserter.assertEquals("Assert equals boolean success", true, true);
		testAsserter.assertEquals("Assert equals String success", "abc", "abc");
		testAsserter.assertEquals("Assert equals double success", 1d, 1d);
		testAsserter.assertEquals("Assert equals double delta success", 1d, 4d, 3d);
		testAsserter.assertEquals("Assert equals float success", 1f, 1f);
		testAsserter.assertEquals("Assert equals float delta success", 1f, 4f, 3f);
		testAsserter.assertEquals("Assert equals int success", 1, 1);
		testAsserter.assertEquals("Assert equals char success", 'a', 'a');

		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(1);
		testAsserter.assertEquals("Assert equals Object success", obj1, obj2);
		testAsserter.assertSame("Assert same Object success", obj1, obj1);
		testAsserter.assertNotSame("Assert not same Object success", obj1, new Integer(1));
	}
}
