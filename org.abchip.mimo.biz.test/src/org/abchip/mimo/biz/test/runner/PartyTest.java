/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Party")
public class PartyTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void doTest() {

		// Party
		Party party = PartyFactory.eINSTANCE.createParty();
		testAsserter.assertNotNull("Frame Party creation", party);

		// Person
		String personId = "PersonCanary";

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(testRunner.getContext(), Party.class);
		testAsserter.assertNotNull("Party Reader", partyReader);
		if (partyReader != null) {
			Party partyTest = partyReader.lookup(personId);
			testAsserter.assertNotNull("Party '" + personId + "' exist", partyTest);
			if(partyTest != null) {
				testAsserter.assertEquals("Party type", "PERSON", partyTest.getPartyTypeId().getPartyTypeId());
			} else {
				testAsserter.assertEquals("Party type", "PERSON", "");
			}
		}
		
		ResourceReader<Person> personReader = resourceManager.getResourceReader(testRunner.getContext(), Person.class);
		testAsserter.assertNotNull("Person Reader", personReader);
		if (personReader != null) {
			Person personTest = personReader.lookup(personId);
			testAsserter.assertNotNull("Person '" + personId + "' exist", personTest);
			if(personTest != null) {
				testAsserter.assertEquals("Group name", "First name", personTest.getFirstName());
				testAsserter.assertEquals("Group name", "Last name", personTest.getLastName());
			} else {
				testAsserter.assertEquals("Group name", "First name", "");
				testAsserter.assertEquals("Group name", "Last name", "");
			}
		}

		// PartyGroup
		String partyGroupId = "Company";

		if (partyReader != null) {
			Party partyTest = partyReader.lookup(partyGroupId);
			testAsserter.assertNotNull("Party '" + partyGroupId + "' exist", partyTest);
			if(partyTest != null) {
				testAsserter.assertEquals("Party type", "PARTY_GROUP", partyTest.getPartyTypeId().getPartyTypeId());
			} else {
				testAsserter.assertEquals("Party type", "PARTY_GROUP", "");
			}
		}
		
		ResourceReader<PartyGroup> partyGroupReader = resourceManager.getResourceReader(testRunner.getContext(), PartyGroup.class);
		testAsserter.assertNotNull("PartyGroup Reader", partyGroupReader);
		if (partyGroupReader != null) {
			PartyGroup partyGroupTest = partyGroupReader.lookup(partyGroupId);
			testAsserter.assertNotNull("PartyGroup '" + partyGroupId + "' exist", partyGroupTest);
			if(partyGroupTest != null) {
				testAsserter.assertEquals("Group name", "ABChip Test", partyGroupTest.getGroupName());
			} else {
				testAsserter.assertEquals("Group name", "ABChip Test", "");
			}
		}

		// Select first party
		if (partyReader != null) {
			Party partyTest = partyReader.first();
			testAsserter.assertNotNull("Select first party", partyTest);
		} else {
			testAsserter.assertNotNull("Select first party", null);
		}

		// Select first party with find 
		if (partyReader != null) {
			try (EntityIterator<Party> partyIteratorTest = partyReader.find(null, null, "partyId", 1)){
				if(partyIteratorTest.hasNext()) {
					Party partyTest = partyIteratorTest.next();
					testAsserter.assertNotNull("Select first party with find", partyTest);
				} else {
					testAsserter.assertNotNull("Select first party with find", null);
				}
			}
		}
	}
}