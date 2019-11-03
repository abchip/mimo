/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responding Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.RespondingParty#getRespondingPartySeqId <em>Responding Party Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.RespondingParty#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.RespondingParty#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.RespondingParty#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.RespondingParty#getDateSent <em>Date Sent</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty()
 * @model
 * @generated
 */
public interface RespondingParty extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty_ContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.RespondingParty#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' attribute.
	 * @see #setCustRequestId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty_CustRequestId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.RespondingParty#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Sent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sent</em>' attribute.
	 * @see #setDateSent(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty_DateSent()
	 * @model
	 * @generated
	 */
	Date getDateSent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.RespondingParty#getDateSent <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' attribute.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(Date value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.RespondingParty#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Responding Party Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Party Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Party Seq Id</em>' attribute.
	 * @see #setRespondingPartySeqId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getRespondingParty_RespondingPartySeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRespondingPartySeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.RespondingParty#getRespondingPartySeqId <em>Responding Party Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Party Seq Id</em>' attribute.
	 * @see #getRespondingPartySeqId()
	 * @generated
	 */
	void setRespondingPartySeqId(String value);

} // RespondingParty
