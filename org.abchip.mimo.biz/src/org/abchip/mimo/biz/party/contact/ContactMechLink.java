/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Mech Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechLink()
 * @model annotation="mimo-ent-frame title='Contact Mechanism Link'"
 * @generated
 */
public interface ContactMechLink extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Contact Mech Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id From</em>' reference.
	 * @see #setContactMechIdFrom(ContactMech)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechLink_ContactMechIdFrom()
	 * @model keys="contactMechId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMechIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdFrom <em>Contact Mech Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id From</em>' reference.
	 * @see #getContactMechIdFrom()
	 * @generated
	 */
	void setContactMechIdFrom(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id To</em>' reference.
	 * @see #setContactMechIdTo(ContactMech)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechLink_ContactMechIdTo()
	 * @model keys="contactMechId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMechIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdTo <em>Contact Mech Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id To</em>' reference.
	 * @see #getContactMechIdTo()
	 * @generated
	 */
	void setContactMechIdTo(ContactMech value);

} // ContactMechLink
