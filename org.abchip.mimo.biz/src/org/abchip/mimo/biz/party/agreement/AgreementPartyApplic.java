/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Party Applic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementPartyApplic()
 * @model
 * @generated
 */
public interface AgreementPartyApplic extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #setAgreementItemSeqId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementPartyApplic_AgreementItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementPartyApplic_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementPartyApplic_AgreementId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Agreement'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementPartyApplic#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

} // AgreementPartyApplic
