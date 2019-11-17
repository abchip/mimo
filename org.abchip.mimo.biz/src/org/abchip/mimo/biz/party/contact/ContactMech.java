/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechAttributes <em>Contact Mech Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getFromContactMechLinks <em>From Contact Mech Links</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech()
 * @model
 * @generated
 */
public interface ContactMech extends BizEntityTyped<ContactMechType> {
	/**
	 * Returns the value of the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info String</em>' attribute.
	 * @see #setInfoString(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_InfoString()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getInfoString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMech#getInfoString <em>Info String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info String</em>' attribute.
	 * @see #getInfoString()
	 * @generated
	 */
	void setInfoString(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_ContactMechAttributes()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactMechAttribute'"
	 * @generated
	 */
	List<String> getContactMechAttributes();

	/**
	 * Returns the value of the '<em><b>From Contact Mech Links</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Contact Mech Links</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Contact Mech Links</em>' attribute list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_FromContactMechLinks()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactMechLink'"
	 * @generated
	 */
	List<String> getFromContactMechLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BillingAccount' route='contactMechId'"
	 * @generated
	 */
	List<String> billingAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CheckAccount' route='contactMechId'"
	 * @generated
	 */
	List<String> checkAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CreditCard' route='contactMechId'"
	 * @generated
	 */
	List<String> creditCards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='destContactMechId'"
	 * @generated
	 */
	List<String> destShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='destinationContactMechId'"
	 * @generated
	 */
	List<String> destShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='EftAccount' route='contactMechId'"
	 * @generated
	 */
	List<String> eftAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEvent' route='contactMechIdFrom'"
	 * @generated
	 */
	List<String> fromCommunicationEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='fulfillContactMechId'"
	 * @generated
	 */
	List<String> fulfillCustRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GiftCard' route='contactMechId'"
	 * @generated
	 */
	List<String> giftCards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Invoice' route='contactMechId'"
	 * @generated
	 */
	List<String> invoices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemShipGroup' route='contactMechId'"
	 * @generated
	 */
	List<String> orderItemShipGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='originContactMechId'"
	 * @generated
	 */
	List<String> originShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='originContactMechId'"
	 * @generated
	 */
	List<String> originShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PayPalPaymentMethod' route='contactMechId'"
	 * @generated
	 */
	List<String> payPalPaymentMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='originContactMechId'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentContactMech' route='contactMechId'"
	 * @generated
	 */
	List<String> shipmentContactMechs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList' route='contactMechId'"
	 * @generated
	 */
	List<String> shoppingLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='contactMechId'"
	 * @generated
	 */
	List<String> subscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemShipGroup' route='telecomContactMechId'"
	 * @generated
	 */
	List<String> telecomOrderItemShipGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEvent' route='contactMechIdTo'"
	 * @generated
	 */
	List<String> toCommunicationEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactMechLink' route='contactMechIdTo'"
	 * @generated
	 */
	List<String> toContactMechLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortEventReminder' route='contactMechId'"
	 * @generated
	 */
	List<String> workEffortEventReminders();

	/**
	 * Returns the value of the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Id</em>' reference.
	 * @see #setContactMechTypeId(ContactMechType)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_ContactMechTypeId()
	 * @model keys="contactMechTypeId"
	 * @generated
	 */
	ContactMechType getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechTypeId <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' reference.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_ContactMechId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

} // ContactMech
