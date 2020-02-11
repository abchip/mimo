/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import java.util.List;
import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Mech Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeAttrs <em>Contact Mech Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypePurposes <em>Contact Mech Type Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.ContactMechType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType()
 * @model annotation="mimo-ent-frame title='Contact Mechanism Type' dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface ContactMechType extends BizEntityType<ContactMech> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(ContactMechType)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_ParentTypeId()
	 * @model keys="contactMechTypeId"
	 * @generated
	 */
	ContactMechType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(ContactMechType value);

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
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_ContactMechTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeId <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' attribute.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.contact.ContactMechTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_ContactMechTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<ContactMechTypeAttr> getContactMechTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Contact Mech Type Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Purposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getContactMechType_ContactMechTypePurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContactMechTypePurpose> getContactMechTypePurposes();

	boolean isPostalAddress();

} // ContactMechType
