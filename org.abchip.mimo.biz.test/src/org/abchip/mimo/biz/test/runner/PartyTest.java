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

import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
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
		EntityProvider entityProvider = resourceManager.getProvider(UserLogin.class);
		
		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("user-test");
		authentication.setPassword("ofbiz");

		ContextProvider contextProvider = entityProvider.login(null, authentication);
		testAsserter.assertNotNull("Connection to Ofbiz", contextProvider);

		if (contextProvider == null)
			return;

		// Party
		Party party = frameManager.createEntity(Party.class);
		testAsserter.assertNotNull("Frame Party creation", party);

		EntityReader<Party> partyReader = resourceManager.getEntityReader(contextProvider, Party.class);
		testAsserter.assertNotNull("Party Reader", partyReader);
		if (partyReader != null) {
			Party partyTest = partyReader.lookup("party-test");
			testAsserter.assertNotNull("Party 'user-test' exist", partyTest);

			Party partyCanary = partyReader.lookup("party-canary");
			testAsserter.assertNull("Party 'party-canary' not exixst", partyCanary);
		}

		// Person
		EntityReader<Person> personReader = resourceManager.getEntityReader(contextProvider, Person.class);
		testAsserter.assertNotNull("Person Reader", personReader);
		if (personReader != null) {
			Person personTest = personReader.lookup("party-test");
			testAsserter.assertNotNull("Person 'party-test' exist", personTest);
		}

		// test hacker
		// Write Person
		String partyId = "party-test-01";

		EntityWriter<Person> personWriter = resourceManager.getEntityWriter(contextProvider, Person.class);
		testAsserter.assertNotNull("Person Writer", personWriter);
		if (personWriter != null) {
			Person person = frameManager.createEntity(Person.class);
			person.setPreferredCurrencyUomId("EUR");
			person.setStatusId("PARTY_ENABLED");
			person.setPartyTypeId("PERSON");
			person.setPartyId(partyId);
			person.setFirstName("Test hacker party person");
			personWriter.create(person);

			if (personReader != null) {
				Person personTest = personReader.lookup(partyId);
				testAsserter.assertNotNull("Person '" + partyId + "' exist", personTest);
			}
		}

		// Write PartyGroup
		EntityReader<PartyGroup> groupReader = resourceManager.getEntityReader(contextProvider, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Reader", groupReader);

		EntityWriter<PartyGroup> groupWriter = resourceManager.getEntityWriter(contextProvider, PartyGroup.class);
		testAsserter.assertNotNull("Party Group Writer", groupWriter);

		if (groupWriter != null) {
			PartyGroup partyGroup = frameManager.createEntity(PartyGroup.class);
			partyGroup.setPreferredCurrencyUomId("EUR");
			partyGroup.setStatusId("PARTY_ENABLED");
			partyGroup.setPartyTypeId("PARTY_GROUP");
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