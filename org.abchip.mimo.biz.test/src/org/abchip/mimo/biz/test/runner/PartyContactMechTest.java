/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.biz.party.contact.ContactFactory;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "PartyContactMech")
public class PartyContactMechTest {

	@Inject
	public transient TestAsserter testAsserter;
	
	@TestStarted
	public void doTest() {

		PartyContactMech party = ContactFactory.eINSTANCE.createPartyContactMech();
		testAsserter.assertNotNull("Frame PartyContactMech creation", party);
	}
}
