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
 * A representation of the model object '<em><b>Contact Mech Type Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechTypePurpose()
 * @model annotation="mimo-ent-frame help='Defines which ContactMechPurposeType entites apply to which ContactMechType' title='Contact Mechanism Type Purpose'"
 * @generated
 */
public interface ContactMechTypePurpose extends BizEntity {
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
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechTypeId()
	 * @model keys="contactMechTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechType getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechTypeId <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' reference.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Purpose Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Purpose Type Id</em>' reference.
	 * @see #setContactMechPurposeTypeId(ContactMechPurposeType)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechPurposeTypeId()
	 * @model keys="contactMechPurposeTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechPurposeType getContactMechPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Purpose Type Id</em>' reference.
	 * @see #getContactMechPurposeTypeId()
	 * @generated
	 */
	void setContactMechPurposeTypeId(ContactMechPurposeType value);

} // ContactMechTypePurpose
