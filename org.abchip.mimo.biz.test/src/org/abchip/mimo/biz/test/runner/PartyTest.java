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
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Party")
public class PartyTest {

	@Inject
	public transient TestAsserter testAsserter;

	@Inject
	private FrameManager frameManager;

	@Inject
	private ResourceManager resourceManager;

	@TestStarted
	public void doTest() {

		// login
		ResourceProvider resourceProvider = resourceManager.getProvider(UserLogin.class);

		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("user-test");
		authentication.setPassword("ofbiz");

		ContextProvider contextProvider = resourceProvider.login(null, authentication);
		testAsserter.assertNotNull("Connection to Ofbiz", contextProvider);

		if (contextProvider == null)
			return;

		// Party
		Party party = PartyFactory.eINSTANCE.createParty();
		testAsserter.assertNotNull("Frame Party creation", party);

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(contextProvider, Party.class);
		testAsserter.assertNotNull("Party Reader", partyReader);
		if (partyReader != null) {
			Party partyTest = partyReader.lookup("party-test");
			testAsserter.assertNotNull("Party 'user-test' exist", partyTest);

			Party partyCanary = partyReader.lookup("party-canary");
			testAsserter.assertNull("Party 'party-canary' not exixst", partyCanary);
		}

		// Person
		ResourceReader<Person> personReader = resourceManager.getResourceReader(contextProvider, Person.class);
		testAsserter.assertNotNull("Person Reader", personReader);
		if (personReader != null) {
			Person personTest = personReader.lookup("party-test");
			testAsserter.assertNotNull("Person 'party-test' exist", personTest);
		}

		// test hacker
		// Write Person
		String partyId = "party-test-01";

		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(contextProvider, Person.class);
		testAsserter.assertNotNull("Person Writer", personWriter);
		if (personWriter != null) {
			Person person = PartyFactory.eINSTANCE.createPerson();
			person.setPreferredCurrencyUomId(frameManager.createProxy(Uom.class, "EUR"));
			person.setStatusId(frameManager.createProxy(StatusItem.class, "PARTY_ENABLED"));
			person.setPartyTypeId(frameManager.createProxy(PartyType.class, "PERSON"));
			person.setPartyId(partyId);
			person.setFirstName("Test hacker party person");
			personWriter.create(person);

			if (personReader != null) {
				Person personTest = personReader.lookup(partyId);
				testAsserter.assertNotNull("Person '" + partyId + "' exist", personTest);
			}
		}

		// Write PartyGroup
		ResourceReader<PartyGroup> groupReader = resourceManager.getResourceReader(contextProvider, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Reader", groupReader);

		ResourceWriter<PartyGroup> groupWriter = resourceManager.getResourceWriter(contextProvider, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Writer", groupWriter);

		if (groupWriter != null) {
			PartyGroup partyGroup = PartyFactory.eINSTANCE.createPartyGroup();
			partyGroup.setPreferredCurrencyUomId(frameManager.createProxy(Uom.class, "EUR"));
			partyGroup.setStatusId(frameManager.createProxy(StatusItem.class, "PARTY_ENABLED"));
			partyGroup.setPartyTypeId(frameManager.createProxy(PartyType.class, "PARTY_GROUP"));
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
		contextProvider.getContext().close();
	}
}