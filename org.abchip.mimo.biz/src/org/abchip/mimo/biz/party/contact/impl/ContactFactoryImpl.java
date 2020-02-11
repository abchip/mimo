/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.party.contact.*;
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
public class ContactFactoryImpl extends EFactoryImpl implements ContactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactFactory init() {
		try {
			ContactFactory theContactFactory = (ContactFactory)EPackage.Registry.INSTANCE.getEFactory(ContactPackage.eNS_URI);
			if (theContactFactory != null) {
				return theContactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactFactoryImpl() {
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
			case ContactPackage.CONTACT_MECH: return (EObject)createContactMech();
			case ContactPackage.CONTACT_MECH_ATTRIBUTE: return (EObject)createContactMechAttribute();
			case ContactPackage.CONTACT_MECH_LINK: return (EObject)createContactMechLink();
			case ContactPackage.CONTACT_MECH_PURPOSE_TYPE: return (EObject)createContactMechPurposeType();
			case ContactPackage.CONTACT_MECH_TYPE: return (EObject)createContactMechType();
			case ContactPackage.CONTACT_MECH_TYPE_ATTR: return (EObject)createContactMechTypeAttr();
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE: return (EObject)createContactMechTypePurpose();
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION: return (EObject)createEmailAddressVerification();
			case ContactPackage.FTP_ADDRESS: return (EObject)createFtpAddress();
			case ContactPackage.PARTY_CONTACT_MECH: return (EObject)createPartyContactMech();
			case ContactPackage.PARTY_CONTACT_MECH_PURPOSE: return (EObject)createPartyContactMechPurpose();
			case ContactPackage.POSTAL_ADDRESS: return (EObject)createPostalAddress();
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY: return (EObject)createPostalAddressBoundary();
			case ContactPackage.TELECOM_NUMBER: return (EObject)createTelecomNumber();
			case ContactPackage.VALID_CONTACT_MECH_ROLE: return (EObject)createValidContactMechRole();
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
	public ContactMech createContactMech() {
		ContactMechImpl contactMech = new ContactMechImpl();
		return contactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechAttribute createContactMechAttribute() {
		ContactMechAttributeImpl contactMechAttribute = new ContactMechAttributeImpl();
		return contactMechAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechLink createContactMechLink() {
		ContactMechLinkImpl contactMechLink = new ContactMechLinkImpl();
		return contactMechLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechPurposeType createContactMechPurposeType() {
		ContactMechPurposeTypeImpl contactMechPurposeType = new ContactMechPurposeTypeImpl();
		return contactMechPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType createContactMechType() {
		ContactMechTypeImpl contactMechType = new ContactMechTypeImpl();
		return contactMechType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechTypeAttr createContactMechTypeAttr() {
		ContactMechTypeAttrImpl contactMechTypeAttr = new ContactMechTypeAttrImpl();
		return contactMechTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechTypePurpose createContactMechTypePurpose() {
		ContactMechTypePurposeImpl contactMechTypePurpose = new ContactMechTypePurposeImpl();
		return contactMechTypePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailAddressVerification createEmailAddressVerification() {
		EmailAddressVerificationImpl emailAddressVerification = new EmailAddressVerificationImpl();
		return emailAddressVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtpAddress createFtpAddress() {
		FtpAddressImpl ftpAddress = new FtpAddressImpl();
		return ftpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyContactMech createPartyContactMech() {
		PartyContactMechImpl partyContactMech = new PartyContactMechImpl();
		return partyContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyContactMechPurpose createPartyContactMechPurpose() {
		PartyContactMechPurposeImpl partyContactMechPurpose = new PartyContactMechPurposeImpl();
		return partyContactMechPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress createPostalAddress() {
		PostalAddressImpl postalAddress = new PostalAddressImpl();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddressBoundary createPostalAddressBoundary() {
		PostalAddressBoundaryImpl postalAddressBoundary = new PostalAddressBoundaryImpl();
		return postalAddressBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber createTelecomNumber() {
		TelecomNumberImpl telecomNumber = new TelecomNumberImpl();
		return telecomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidContactMechRole createValidContactMechRole() {
		ValidContactMechRoleImpl validContactMechRole = new ValidContactMechRoleImpl();
		return validContactMechRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPackage getContactPackage() {
		return (ContactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContactPackage getPackage() {
		return ContactPackage.eINSTANCE;
	}

} //ContactFactoryImpl
