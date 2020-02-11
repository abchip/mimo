/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechAttributes <em>Contact Mech Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getFromContactMechLinks <em>From Contact Mech Links</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMech#getInfoString <em>Info String</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech()
 * @model annotation="mimo-ent-frame title='Contact Mechanism'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>From Contact Mech Links</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.contact.ContactMechLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Contact Mech Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Contact Mech Links</em>' reference list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_FromContactMechLinks()
	 * @model derived="true"
	 * @generated
	 */
	List<ContactMechLink> getFromContactMechLinks();

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
	 *        annotation="mimo-ent-format length='20'"
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

	/**
	 * Returns the value of the '<em><b>Contact Mech Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.contact.ContactMechAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMech_ContactMechAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContactMechAttribute> getContactMechAttributes();

} // ContactMech
