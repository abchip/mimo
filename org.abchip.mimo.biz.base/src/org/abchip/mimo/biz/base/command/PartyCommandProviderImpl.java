/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.command;

import javax.inject.Inject;

import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.util.Strings;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class PartyCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;

	@SuppressWarnings("unused")
	private <E extends EntityNameable> void _hackerParty(CommandInterpreter interpreter) throws Exception {

		String id = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());

		// Write Person
		EntityWriter<Person> personWriter = resourceManager.getEntityWriter(contextRoot, Person.class);

		Person person = frameManager.createEntity(Person.class);
		person.setPreferredCurrencyUomId("EUR");
		person.setStatusId("PARTY_ENABLED");
		person.setPartyTypeId("PERSON");
		person.setPartyId(id);
		person.setFirstName("Test hacker party person");
		personWriter.create(person);

		// Write PartyGroup
		EntityWriter<PartyGroup> groupWriter = resourceManager.getEntityWriter(contextRoot, PartyGroup.class);

		PartyGroup partyGroup = frameManager.createEntity(PartyGroup.class);
		partyGroup.setPreferredCurrencyUomId("EUR");
		partyGroup.setStatusId("PARTY_ENABLED");
		partyGroup.setPartyTypeId("PARTY_GROUP");
		partyGroup.setPartyId(id);
		partyGroup.setGroupName("Test hacker party group");
		groupWriter.create(partyGroup);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
