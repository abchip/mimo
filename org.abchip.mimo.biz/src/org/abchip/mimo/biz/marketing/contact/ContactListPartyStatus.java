/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact List Party Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getOptInVerifyCode <em>Opt In Verify Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getSetByUserLoginId <em>Set By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus()
 * @model
 * @generated
 */
public interface ContactListPartyStatus extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Id</em>' attribute.
	 * @see #setContactListId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_ContactListId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContactListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getContactListId <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Id</em>' attribute.
	 * @see #getContactListId()
	 * @generated
	 */
	void setContactListId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Opt In Verify Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt In Verify Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt In Verify Code</em>' attribute.
	 * @see #setOptInVerifyCode(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_OptInVerifyCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getOptInVerifyCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getOptInVerifyCode <em>Opt In Verify Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt In Verify Code</em>' attribute.
	 * @see #getOptInVerifyCode()
	 * @generated
	 */
	void setOptInVerifyCode(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Set By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set By User Login Id</em>' attribute.
	 * @see #setSetByUserLoginId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_SetByUserLoginId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSetByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getSetByUserLoginId <em>Set By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set By User Login Id</em>' attribute.
	 * @see #getSetByUserLoginId()
	 * @generated
	 */
	void setSetByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_StatusDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactListPartyStatus_StatusId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // ContactListPartyStatus
