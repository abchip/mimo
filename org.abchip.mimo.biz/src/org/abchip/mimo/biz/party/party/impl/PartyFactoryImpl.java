/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.party.party.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyFactoryImpl extends EFactoryImpl implements PartyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartyFactory init() {
		try {
			PartyFactory thePartyFactory = (PartyFactory)EPackage.Registry.INSTANCE.getEFactory(PartyPackage.eNS_URI);
			if (thePartyFactory != null) {
				return thePartyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PartyPackage.ADDRESS_MATCH_MAP: return (EObject)createAddressMatchMap();
			case PartyPackage.AFFILIATE: return (EObject)createAffiliate();
			case PartyPackage.PARTY: return (EObject)createParty();
			case PartyPackage.PARTY_ATTRIBUTE: return (EObject)createPartyAttribute();
			case PartyPackage.PARTY_CARRIER_ACCOUNT: return (EObject)createPartyCarrierAccount();
			case PartyPackage.PARTY_CLASSIFICATION: return (EObject)createPartyClassification();
			case PartyPackage.PARTY_CLASSIFICATION_GROUP: return (EObject)createPartyClassificationGroup();
			case PartyPackage.PARTY_CLASSIFICATION_TYPE: return (EObject)createPartyClassificationType();
			case PartyPackage.PARTY_CONTENT: return (EObject)createPartyContent();
			case PartyPackage.PARTY_CONTENT_TYPE: return (EObject)createPartyContentType();
			case PartyPackage.PARTY_DATA_SOURCE: return (EObject)createPartyDataSource();
			case PartyPackage.PARTY_GEO_POINT: return (EObject)createPartyGeoPoint();
			case PartyPackage.PARTY_GROUP: return (EObject)createPartyGroup();
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE: return (EObject)createPartyIcsAvsOverride();
			case PartyPackage.PARTY_IDENTIFICATION: return (EObject)createPartyIdentification();
			case PartyPackage.PARTY_IDENTIFICATION_TYPE: return (EObject)createPartyIdentificationType();
			case PartyPackage.PARTY_INVITATION: return (EObject)createPartyInvitation();
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC: return (EObject)createPartyInvitationGroupAssoc();
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC: return (EObject)createPartyInvitationRoleAssoc();
			case PartyPackage.PARTY_NAME_HISTORY: return (EObject)createPartyNameHistory();
			case PartyPackage.PARTY_NOTE: return (EObject)createPartyNote();
			case PartyPackage.PARTY_PROFILE_DEFAULT: return (EObject)createPartyProfileDefault();
			case PartyPackage.PARTY_RELATIONSHIP: return (EObject)createPartyRelationship();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE: return (EObject)createPartyRelationshipType();
			case PartyPackage.PARTY_ROLE: return (EObject)createPartyRole();
			case PartyPackage.PARTY_STATUS: return (EObject)createPartyStatus();
			case PartyPackage.PARTY_TYPE: return (EObject)createPartyType();
			case PartyPackage.PARTY_TYPE_ATTR: return (EObject)createPartyTypeAttr();
			case PartyPackage.PERSON: return (EObject)createPerson();
			case PartyPackage.PRIORITY_TYPE: return (EObject)createPriorityType();
			case PartyPackage.ROLE_TYPE: return (EObject)createRoleType();
			case PartyPackage.ROLE_TYPE_ATTR: return (EObject)createRoleTypeAttr();
			case PartyPackage.VENDOR: return (EObject)createVendor();
			case PartyPackage.WEB_SITE_ROLE: return (EObject)createWebSiteRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressMatchMap createAddressMatchMap() {
		AddressMatchMapImpl addressMatchMap = new AddressMatchMapImpl();
		return addressMatchMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Affiliate createAffiliate() {
		AffiliateImpl affiliate = new AffiliateImpl();
		return affiliate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyAttribute createPartyAttribute() {
		PartyAttributeImpl partyAttribute = new PartyAttributeImpl();
		return partyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyCarrierAccount createPartyCarrierAccount() {
		PartyCarrierAccountImpl partyCarrierAccount = new PartyCarrierAccountImpl();
		return partyCarrierAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassification createPartyClassification() {
		PartyClassificationImpl partyClassification = new PartyClassificationImpl();
		return partyClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationGroup createPartyClassificationGroup() {
		PartyClassificationGroupImpl partyClassificationGroup = new PartyClassificationGroupImpl();
		return partyClassificationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationType createPartyClassificationType() {
		PartyClassificationTypeImpl partyClassificationType = new PartyClassificationTypeImpl();
		return partyClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyContent createPartyContent() {
		PartyContentImpl partyContent = new PartyContentImpl();
		return partyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyContentType createPartyContentType() {
		PartyContentTypeImpl partyContentType = new PartyContentTypeImpl();
		return partyContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyDataSource createPartyDataSource() {
		PartyDataSourceImpl partyDataSource = new PartyDataSourceImpl();
		return partyDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyGeoPoint createPartyGeoPoint() {
		PartyGeoPointImpl partyGeoPoint = new PartyGeoPointImpl();
		return partyGeoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyGroup createPartyGroup() {
		PartyGroupImpl partyGroup = new PartyGroupImpl();
		return partyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyIcsAvsOverride createPartyIcsAvsOverride() {
		PartyIcsAvsOverrideImpl partyIcsAvsOverride = new PartyIcsAvsOverrideImpl();
		return partyIcsAvsOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyIdentification createPartyIdentification() {
		PartyIdentificationImpl partyIdentification = new PartyIdentificationImpl();
		return partyIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyIdentificationType createPartyIdentificationType() {
		PartyIdentificationTypeImpl partyIdentificationType = new PartyIdentificationTypeImpl();
		return partyIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyInvitation createPartyInvitation() {
		PartyInvitationImpl partyInvitation = new PartyInvitationImpl();
		return partyInvitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyInvitationGroupAssoc createPartyInvitationGroupAssoc() {
		PartyInvitationGroupAssocImpl partyInvitationGroupAssoc = new PartyInvitationGroupAssocImpl();
		return partyInvitationGroupAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyInvitationRoleAssoc createPartyInvitationRoleAssoc() {
		PartyInvitationRoleAssocImpl partyInvitationRoleAssoc = new PartyInvitationRoleAssocImpl();
		return partyInvitationRoleAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyNameHistory createPartyNameHistory() {
		PartyNameHistoryImpl partyNameHistory = new PartyNameHistoryImpl();
		return partyNameHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyNote createPartyNote() {
		PartyNoteImpl partyNote = new PartyNoteImpl();
		return partyNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyProfileDefault createPartyProfileDefault() {
		PartyProfileDefaultImpl partyProfileDefault = new PartyProfileDefaultImpl();
		return partyProfileDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRelationship createPartyRelationship() {
		PartyRelationshipImpl partyRelationship = new PartyRelationshipImpl();
		return partyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRelationshipType createPartyRelationshipType() {
		PartyRelationshipTypeImpl partyRelationshipType = new PartyRelationshipTypeImpl();
		return partyRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRole createPartyRole() {
		PartyRoleImpl partyRole = new PartyRoleImpl();
		return partyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyStatus createPartyStatus() {
		PartyStatusImpl partyStatus = new PartyStatusImpl();
		return partyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyType createPartyType() {
		PartyTypeImpl partyType = new PartyTypeImpl();
		return partyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyTypeAttr createPartyTypeAttr() {
		PartyTypeAttrImpl partyTypeAttr = new PartyTypeAttrImpl();
		return partyTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityType createPriorityType() {
		PriorityTypeImpl priorityType = new PriorityTypeImpl();
		return priorityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleTypeAttr createRoleTypeAttr() {
		RoleTypeAttrImpl roleTypeAttr = new RoleTypeAttrImpl();
		return roleTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vendor createVendor() {
		VendorImpl vendor = new VendorImpl();
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSiteRole createWebSiteRole() {
		WebSiteRoleImpl webSiteRole = new WebSiteRoleImpl();
		return webSiteRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyPackage getPartyPackage() {
		return (PartyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartyPackage getPackage() {
		return PartyPackage.eINSTANCE;
	}

} //PartyFactoryImpl
