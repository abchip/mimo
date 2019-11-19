package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

import ezvcard.VCard;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.TelephoneType;
import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;

public class PartyServices {

	public static VCard createVcardFromParty(Context context, String partyId) {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ResourceReader<Person> personReader = resourceManager.getResourceReader(context, Person.class);
		ResourceReader<PartyGroup> partyGroupReader = resourceManager.getResourceReader(context, PartyGroup.class);
		Party partyEntity = partyReader.lookup(partyId);

		VCard vcard = new VCard();
		StructuredName structuredName = new StructuredName();
		if (partyEntity == null) {
			// response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			// return;

			// mock
			structuredName.setGiven("Nome");
			structuredName.setFamily("Cognome");
			// fullName = "MockVcard";
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
				if (personEntity.getFirstName() != null && !personEntity.getFirstName().isEmpty()) {
					structuredName.setGiven(personEntity.getFirstName());
					// fullName = personEntity.getFirstName();
				}
				if (personEntity.getMiddleName() != null && !personEntity.getMiddleName().isEmpty()) {
					structuredName.setGiven(personEntity.getMiddleName());
					// fullName += personEntity.getMiddleName();
				}
				if (personEntity.getLastName() != null && !personEntity.getLastName().isEmpty()) {
					structuredName.setFamily(personEntity.getLastName());
					// fullName += personEntity.getLastName();
				}
				break;
			case "PARTY_GROUP":
				PartyGroup partyGroupEntity = partyGroupReader.lookup(partyId);
				if (partyGroupEntity.getGroupName() != null && !partyGroupEntity.getGroupName().isEmpty()) {
					structuredName.setGiven(partyGroupEntity.getGroupName());
					// fullName = partyGroupEntity.getGroupName();
				}
				break;
			}

			vcard.setStructuredName(structuredName);

			// PostalAddress
			writeLatestPostalAddress(context, vcard, partyId);

			// TelecomNumber
			writeLatestTelecomNumber(context, vcard, partyId);

			// E-mail
			writeLatestEmail(context, vcard, partyId);
		}

		return vcard;
	}

	private static void writeLatestPostalAddress(Context context, VCard vcard, String partyId) {
		PostalAddress postalAddress = ContactMechServices.getLatestPostaAddress(context, partyId);
		if (postalAddress == null)
			return;

		Address address = new Address();
		if (postalAddress.getAddress1() != null && !postalAddress.getAddress1().isEmpty())
			address.setStreetAddress(postalAddress.getAddress1());
		if (postalAddress.getCity() != null && !postalAddress.getCity().isEmpty())
			address.setLocality(postalAddress.getCity());
		if (postalAddress.getPostalCode() != null && !postalAddress.getPostalCode().isEmpty())
			address.setPostalCode(postalAddress.getPostalCode());
		// StateProvinceGeo per decodifica
		if (postalAddress.getStateProvinceGeoId() != null)
			address.setRegion(postalAddress.getStateProvinceGeoId().getGeoId());
		// CountryGeo per decodifica
		if (postalAddress.getCountryGeoId() != null)
			address.setCountry(postalAddress.getCountryGeoId().getGeoId());

		address.getTypes().add(AddressType.WORK);
		vcard.addAddress(address);
	}

	private static void writeLatestTelecomNumber(Context context, VCard vcard, String partyId) {
		TelecomNumber telecomNumber = ContactMechServices.getLatestTelecomNumber(context, partyId);
		if (telecomNumber == null)
			return;

		String areaCode = "";
		String number = "";
		if (telecomNumber.getAreaCode() != null && !telecomNumber.getAreaCode().isEmpty())
			areaCode = telecomNumber.getAreaCode();
		if (telecomNumber.getContactNumber() != null && !telecomNumber.getContactNumber().isEmpty())
			number = telecomNumber.getContactNumber();
		Telephone tel = new Telephone(areaCode + number);
		tel.getTypes().add(TelephoneType.WORK);
		vcard.addTelephoneNumber(tel);
	}

	private static void writeLatestEmail(Context context, VCard vcard, String partyId) {
		String email = ContactMechServices.getLatestEmail(context, partyId);
		if (email.isEmpty())
			return;
		vcard.addEmail(new Email(email));
	}
}
