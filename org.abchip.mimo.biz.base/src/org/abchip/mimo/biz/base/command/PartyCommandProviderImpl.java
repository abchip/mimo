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

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class PartyCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _testParty(CommandInterpreter interpreter) throws Exception {

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(contextRoot, Party.class);
		Party party = partyReader.lookup("10000");
		System.out.println(party.getURI());
		System.out.println(party.getPartyTypeId().getID());
		System.out.println(party.getCreatedByUserLogin().getPartyId().getID());
	}

	public <E extends EntityIdentifiable> void _hackerParty(CommandInterpreter interpreter) throws Exception {

		String id = interpreter.nextArgument();

		// Write Person
		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(contextRoot, Person.class);

		Person person = PartyFactory.eINSTANCE.createPerson();
		person.setPreferredCurrencyUomId(resourceManager.getFrame(contextRoot, Uom.class).createProxy("EUR"));
		person.setStatusId(resourceManager.getFrame(contextRoot, StatusItem.class).createProxy("PARTY_ENABLED"));
		person.setPartyTypeId(resourceManager.getFrame(contextRoot, PartyType.class).createProxy("PERSON"));
		person.setPartyId(id);
		person.setFirstName("Test hacker party person");
		personWriter.create(person);

		// Write PartyGroup
		ResourceWriter<PartyGroup> groupWriter = resourceManager.getResourceWriter(contextRoot, PartyGroup.class);

		PartyGroup partyGroup = PartyFactory.eINSTANCE.createPartyGroup();
		partyGroup.setPreferredCurrencyUomId(resourceManager.getFrame(contextRoot, Uom.class).createProxy("EUR"));
		partyGroup.setStatusId(resourceManager.getFrame(contextRoot, StatusItem.class).createProxy("PARTY_ENABLED"));
		partyGroup.setPartyTypeId(resourceManager.getFrame(contextRoot, PartyType.class).createProxy("PARTY_GROUP"));
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
