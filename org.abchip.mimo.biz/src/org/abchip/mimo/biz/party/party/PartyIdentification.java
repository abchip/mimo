/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyIdentification#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyIdentification()
 * @model
 * @generated
 */
public interface PartyIdentification extends BizEntityTyped<PartyIdentificationType> {
	/**
	 * Returns the value of the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Value</em>' attribute.
	 * @see #setIdValue(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyIdentification_IdValue()
	 * @model
	 * @generated
	 */
	String getIdValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getIdValue <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Value</em>' attribute.
	 * @see #getIdValue()
	 * @generated
	 */
	void setIdValue(String value);

	/**
	 * Returns the value of the '<em><b>Party Identification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Identification Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Identification Type Id</em>' attribute.
	 * @see #setPartyIdentificationTypeId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyIdentification_PartyIdentificationTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PartyIdentificationType'"
	 * @generated
	 */
	String getPartyIdentificationTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Identification Type Id</em>' attribute.
	 * @see #getPartyIdentificationTypeId()
	 * @generated
	 */
	void setPartyIdentificationTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyIdentification_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // PartyIdentification
