package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class ContactMechServices {

	public static PostalAddress getLatestPostaAddress(ResourceManager resourceManager, ContextProvider contextProvider, String partyId) {
		
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(contextProvider, PartyContactMech.class);
		ResourceReader<PostalAddress> postalAddressReader = resourceManager.getResourceReader(contextProvider, PostalAddress.class);
		PostalAddress postalAddress = null;
		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter, null, order)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(contextProvider, ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("POSTAL_ADDRESS"))
				continue;

			postalAddress = postalAddressReader.lookup(contactMech.getContactMechId());
			break;
		}
		return postalAddress;
	}
	
	public static TelecomNumber getLatestTelecomNumber(ResourceManager resourceManager, ContextProvider contextProvider, String partyId) {
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(contextProvider,
				PartyContactMech.class);
		ResourceReader<TelecomNumber> telecomNumberReader = resourceManager.getResourceReader(contextProvider,
				TelecomNumber.class);
		TelecomNumber telecomNumber = null;
		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter, null, order)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(contextProvider,
					ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("TELECOM_NUMBER"))
				continue;

			telecomNumber = telecomNumberReader.lookup(contactMech.getContactMechId());
			break;
		}
		return telecomNumber;
	}
	
	public static String getLatestEmail(ResourceManager resourceManager, ContextProvider contextProvider, String partyId) {
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(contextProvider,
				PartyContactMech.class);
		String email = "";

		for (PartyContactMech partyContactMech : partyContactMechReader.find(filter, null, order)) {
			ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(contextProvider,
					ContactMech.class);
			ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

			if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("EMAIL_ADDRESS"))
				continue;

			if (contactMech.getInfoString() != null && !contactMech.getInfoString().isEmpty()) {
				email = contactMech.getInfoString();
				break;
			}
		}
		return email;
	}
}
