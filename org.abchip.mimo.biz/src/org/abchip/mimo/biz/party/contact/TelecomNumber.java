/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecom Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAskForName <em>Ask For Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getContactNumber <em>Contact Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getTelecomNumber()
 * @model annotation="mimo-ent-frame title='Telecommunications Number'"
 * @generated
 */
public interface TelecomNumber extends ContactMech {
	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #setAreaCode(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getTelecomNumber_AreaCode()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getAreaCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #getAreaCode()
	 * @generated
	 */
	void setAreaCode(String value);

	/**
	 * Returns the value of the '<em><b>Ask For Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ask For Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ask For Name</em>' attribute.
	 * @see #setAskForName(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getTelecomNumber_AskForName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getAskForName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAskForName <em>Ask For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ask For Name</em>' attribute.
	 * @see #getAskForName()
	 * @generated
	 */
	void setAskForName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Number</em>' attribute.
	 * @see #setContactNumber(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getTelecomNumber_ContactNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getContactNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getContactNumber <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Number</em>' attribute.
	 * @see #getContactNumber()
	 * @generated
	 */
	void setContactNumber(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getTelecomNumber_CountryCode()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

} // TelecomNumber
