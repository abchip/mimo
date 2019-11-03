/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 * @model
 * @generated
 */
public interface ContactMechTypePurpose extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Id</em>' attribute.
	 * @see #setContactMechTypeId(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ContactMechType'"
	 * @generated
	 */
	String getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechTypeId <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' attribute.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Purpose Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Purpose Type Id</em>' attribute.
	 * @see #setContactMechPurposeTypeId(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechPurposeTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ContactMechPurposeType'"
	 * @generated
	 */
	String getContactMechPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Purpose Type Id</em>' attribute.
	 * @see #getContactMechPurposeTypeId()
	 * @generated
	 */
	void setContactMechPurposeTypeId(String value);

} // ContactMechTypePurpose
