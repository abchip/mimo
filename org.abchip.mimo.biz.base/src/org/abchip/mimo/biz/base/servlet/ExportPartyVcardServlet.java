/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.IOUtils;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.TelephoneType;
import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;

public class ExportPartyVcardServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String partyId = request.getParameter("partyId");

		ResourceReader<Party> partyReader = resourceManager.getEntityReader(contextProvider, Party.class);
		ResourceReader<Person> personReader = resourceManager.getEntityReader(contextProvider, Person.class);
		ResourceReader<PartyGroup> partyGroupReader = resourceManager.getEntityReader(contextProvider, PartyGroup.class);
		Party partyEntity = partyReader.lookup(partyId);

		ezvcard.VCard vcard = new ezvcard.VCard();
		StructuredName structuredName = new StructuredName();
		String fullName = "";

		if (partyEntity == null) {
			// response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			// return;

			// mock

			structuredName.setGiven("Nome");
			structuredName.setFamily("Cognome");
			fullName = "MockVcard";
			vcard.setStructuredName(structuredName);
			Address address = new Address();
			address.setStreetAddress("via Manzoni n.1");
			address.setLocality("Milano");
			address.setPostalCode("20100");
			// StateProvinceGeo per decodifica
			address.setRegion("Milano");
			// CountryGeo per decodifica
			address.setCountry("Italia");
			address.getTypes().add(AddressType.WORK);
			vcard.addAddress(address);
			Telephone tel = new Telephone("0393381234567");
			tel.getTypes().add(TelephoneType.WORK);
			vcard.addTelephoneNumber(tel);
			vcard.addEmail(new Email("nome.cognome@gmail.com"));
		} else {
			// Party or PartyGroup String fullName = "";
			switch (partyEntity.getPartyTypeId().getPartyTypeId()) {
			case "PERSON":
				Person personEntity = personReader.lookup(partyId);
				if (!personEntity.getFirstName().isEmpty()) {
					structuredName.setGiven(personEntity.getFirstName());
					fullName = personEntity.getFirstName();
				}
				if (!personEntity.getMiddleName().isEmpty()) {
					fullName += personEntity.getMiddleName();
				}
				if (!personEntity.getLastName().isEmpty()) {
					structuredName.setGiven(personEntity.getLastName());
					fullName += personEntity.getLastName();
				}
				break;
			case "PARTY_GROUP":
				PartyGroup partyGroupEntity = partyGroupReader.lookup(partyId);
				if (!partyGroupEntity.getGroupName().isEmpty()) {
					structuredName.setGiven(partyGroupEntity.getGroupName());
					fullName = partyGroupEntity.getGroupName();
				}
				break;
			}

			vcard.setStructuredName(structuredName);

			// PostalAddress
			writeLatestPostalAddress(contextProvider, vcard, partyId);

			// TelecomNumber
			writeLatestTelecomNumber(contextProvider, vcard, partyId);

			// E-mail
			writeLatestEmail(contextProvider, vcard, partyId);
		}

		//
		File file = new File(fullName + ".vcf");
		Ezvcard.write(vcard).go(file);

		// Set the content type and attachment header.
		response.setStatus(HttpServletResponse.SC_OK);
		response.addHeader("Content-disposition", "attachment; filename=" + file.getName());
		response.setContentType("text/vcard");

		try (InputStream myStream = FileUtils.openInputStream(file)) {
			IOUtils.copy(myStream, response.getOutputStream());
			response.flushBuffer();
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

	private void writeLatestPostalAddress(ContextProvider contextProvider, ezvcard.VCard vcard, String partyId) {
		// Serve l'ordinamento per fromDate desc
		// e capire come fare il filtro con l'oggetto
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getEntityReader(contextProvider, PartyContactMech.class);
		ResourceReader<PostalAddress> postalAddressReader = resourceManager.getEntityReader(contextProvider, PostalAddress.class);

		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getEntityReader(contextProvider, ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("POSTAL_ADDRESS"))
				continue;

			PostalAddress postalAddress = postalAddressReader.lookup(contactMech.getContactMechId());
			if (postalAddress == null)
				break;

			Address address = new Address();
			address.setStreetAddress(postalAddress.getAddress1());
			address.setLocality(postalAddress.getCity());
			address.setPostalCode(postalAddress.getPostalCode());
			// StateProvinceGeo per decodifica
			address.setRegion(postalAddress.getStateProvinceGeoId().getGeoId());
			// CountryGeo per decodifica
			address.setCountry(postalAddress.getCountryGeoId().getGeoId());
			address.getTypes().add(AddressType.WORK);
			vcard.addAddress(address);
			break;
		}
	}

	private void writeLatestTelecomNumber(ContextProvider contextProvider, VCard vcard, String partyId) {
		// Serve l'ordinamento per fromDate desc
		// e capire come fare il filtro con l'oggetto
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getEntityReader(contextProvider, PartyContactMech.class);
		ResourceReader<TelecomNumber> telecomNumberReader = resourceManager.getEntityReader(contextProvider, TelecomNumber.class);

		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getEntityReader(contextProvider, ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("TELECOM_NUMBER"))
				continue;

			TelecomNumber telecomNumber = telecomNumberReader.lookup(contactMech.getContactMechId());
			if (telecomNumber == null)
				break;

			Telephone tel = new Telephone(telecomNumber.getAreaCode() + telecomNumber.getContactNumber());
			tel.getTypes().add(TelephoneType.WORK);
			vcard.addTelephoneNumber(tel);
			break;
		}

	}

	private void writeLatestEmail(ContextProvider contextProvider, ezvcard.VCard vcard, String partyId) {
		// Serve l'ordinamento per fromDate desc
		// e capire come fare il filtro con l'oggetto
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getEntityReader(contextProvider, PartyContactMech.class);

		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getEntityReader(contextProvider, ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("EMAIL_ADDRESS"))
				continue;

			vcard.addEmail(new Email(contactMech.getInfoString()));
			break;
		}
	}
}