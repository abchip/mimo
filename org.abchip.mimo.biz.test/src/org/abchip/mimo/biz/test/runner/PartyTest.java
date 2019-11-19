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

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Party")
public class PartyTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private AuthenticationManager authenticationManager;

	@TestStarted
	public void doTest() {

		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("user-test");
		authentication.setPassword("ofbiz");

		Context context = authenticationManager.login(null, authentication);
		testAsserter.assertNotNull("Connection to Ofbiz", context);

		if (context == null)
			return;

		// Party
		Party party = PartyFactory.eINSTANCE.createParty();
		testAsserter.assertNotNull("Frame Party creation", party);

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		testAsserter.assertNotNull("Party Reader", partyReader);
		if (partyReader != null) {
			Party partyTest = partyReader.lookup("party-test");
			testAsserter.assertNotNull("Party 'user-test' exist", partyTest);

			Party partyCanary = partyReader.lookup("party-canary");
			testAsserter.assertNull("Party 'party-canary' not exixst", partyCanary);
		}

		// Person
		ResourceReader<Person> personReader = resourceManager.getResourceReader(context, Person.class);
		testAsserter.assertNotNull("Person Reader", personReader);
		if (personReader != null) {
			Person personTest = personReader.lookup("party-test");
			testAsserter.assertNotNull("Person 'party-test' exist", personTest);
		}

		// test hacker
		// Write Person
		String partyId = "party-test-01";

		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(context, Person.class);
		testAsserter.assertNotNull("Person Writer", personWriter);
		if (personWriter != null) {
			Person person = PartyFactory.eINSTANCE.createPerson();
			person.setPreferredCurrencyUomId(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
			person.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
			person.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PERSON"));
			person.setPartyId(partyId);
			person.setFirstName("Test hacker party person");
			personWriter.create(person);

			if (personReader != null) {
				Person personTest = personReader.lookup(partyId);
				testAsserter.assertNotNull("Person '" + partyId + "' exist", personTest);
			}
		}

		// Write PartyGroup
		ResourceReader<PartyGroup> groupReader = resourceManager.getResourceReader(context, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Reader", groupReader);

		ResourceWriter<PartyGroup> groupWriter = resourceManager.getResourceWriter(context, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Writer", groupWriter);

		if (groupWriter != null) {
			PartyGroup partyGroup = PartyFactory.eINSTANCE.createPartyGroup();
			partyGroup.setPreferredCurrencyUomId(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
			partyGroup.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
			partyGroup.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PARTY_GROUP"));
			partyGroup.setPartyId(partyId);
			partyGroup.setGroupName("Test hacker party group");
			groupWriter.create(partyGroup);

			if (groupReader != null) {
				PartyGroup partyGrouTest = groupReader.lookup(partyId);
				testAsserter.assertNull("Party Group '" + partyId + "' not exist", partyGrouTest);
			}
		}

		// Eseguire letture

		// close
		context.close();
	}
}