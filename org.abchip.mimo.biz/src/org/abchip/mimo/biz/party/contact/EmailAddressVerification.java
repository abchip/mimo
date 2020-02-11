/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Address Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getVerifyHash <em>Verify Hash</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getEmailAddressVerification()
 * @model annotation="mimo-ent-frame help='Holds hashes for email address verification'"
 * @generated
 */
public interface EmailAddressVerification extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getEmailAddressVerification_EmailAddress()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(Date)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getEmailAddressVerification_ExpireDate()
	 * @model
	 * @generated
	 */
	Date getExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(Date value);

	/**
	 * Returns the value of the '<em><b>Verify Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Hash</em>' attribute.
	 * @see #setVerifyHash(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getEmailAddressVerification_VerifyHash()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyHash();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getVerifyHash <em>Verify Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Hash</em>' attribute.
	 * @see #getVerifyHash()
	 * @generated
	 */
	void setVerifyHash(String value);

} // EmailAddressVerification
