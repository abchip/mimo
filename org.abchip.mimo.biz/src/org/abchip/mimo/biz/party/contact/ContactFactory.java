/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.party.contact.ContactPackage
 * @generated
 */
public interface ContactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContactFactory eINSTANCE = org.abchip.mimo.biz.party.contact.impl.ContactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech</em>'.
	 * @generated
	 */
	ContactMech createContactMech();

	/**
	 * Returns a new object of class '<em>Mech Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Attribute</em>'.
	 * @generated
	 */
	ContactMechAttribute createContactMechAttribute();

	/**
	 * Returns a new object of class '<em>Mech Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Link</em>'.
	 * @generated
	 */
	ContactMechLink createContactMechLink();

	/**
	 * Returns a new object of class '<em>Mech Purpose Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Purpose Type</em>'.
	 * @generated
	 */
	ContactMechPurposeType createContactMechPurposeType();

	/**
	 * Returns a new object of class '<em>Mech Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Type</em>'.
	 * @generated
	 */
	ContactMechType createContactMechType();

	/**
	 * Returns a new object of class '<em>Mech Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Type Attr</em>'.
	 * @generated
	 */
	ContactMechTypeAttr createContactMechTypeAttr();

	/**
	 * Returns a new object of class '<em>Mech Type Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mech Type Purpose</em>'.
	 * @generated
	 */
	ContactMechTypePurpose createContactMechTypePurpose();

	/**
	 * Returns a new object of class '<em>Email Address Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Address Verification</em>'.
	 * @generated
	 */
	EmailAddressVerification createEmailAddressVerification();

	/**
	 * Returns a new object of class '<em>Ftp Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ftp Address</em>'.
	 * @generated
	 */
	FtpAddress createFtpAddress();

	/**
	 * Returns a new object of class '<em>Party Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Contact Mech</em>'.
	 * @generated
	 */
	PartyContactMech createPartyContactMech();

	/**
	 * Returns a new object of class '<em>Party Contact Mech Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Contact Mech Purpose</em>'.
	 * @generated
	 */
	PartyContactMechPurpose createPartyContactMechPurpose();

	/**
	 * Returns a new object of class '<em>Postal Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address</em>'.
	 * @generated
	 */
	PostalAddress createPostalAddress();

	/**
	 * Returns a new object of class '<em>Postal Address Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address Boundary</em>'.
	 * @generated
	 */
	PostalAddressBoundary createPostalAddressBoundary();

	/**
	 * Returns a new object of class '<em>Telecom Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telecom Number</em>'.
	 * @generated
	 */
	TelecomNumber createTelecomNumber();

	/**
	 * Returns a new object of class '<em>Valid Contact Mech Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Contact Mech Role</em>'.
	 * @generated
	 */
	ValidContactMechRole createValidContactMechRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContactPackage getContactPackage();

} //ContactFactory
