/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import org.abchip.mimo.biz.marketing.contact.*;
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
			case ContactPackage.CONTACT_LIST: return (EObject)createContactList();
			case ContactPackage.CONTACT_LIST_COMM_STATUS: return (EObject)createContactListCommStatus();
			case ContactPackage.CONTACT_LIST_PARTY: return (EObject)createContactListParty();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS: return (EObject)createContactListPartyStatus();
			case ContactPackage.CONTACT_LIST_TYPE: return (EObject)createContactListType();
			case ContactPackage.WEB_SITE_CONTACT_LIST: return (EObject)createWebSiteContactList();
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
	public ContactList createContactList() {
		ContactListImpl contactList = new ContactListImpl();
		return contactList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListCommStatus createContactListCommStatus() {
		ContactListCommStatusImpl contactListCommStatus = new ContactListCommStatusImpl();
		return contactListCommStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListParty createContactListParty() {
		ContactListPartyImpl contactListParty = new ContactListPartyImpl();
		return contactListParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListPartyStatus createContactListPartyStatus() {
		ContactListPartyStatusImpl contactListPartyStatus = new ContactListPartyStatusImpl();
		return contactListPartyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListType createContactListType() {
		ContactListTypeImpl contactListType = new ContactListTypeImpl();
		return contactListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSiteContactList createWebSiteContactList() {
		WebSiteContactListImpl webSiteContactList = new WebSiteContactListImpl();
		return webSiteContactList;
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
