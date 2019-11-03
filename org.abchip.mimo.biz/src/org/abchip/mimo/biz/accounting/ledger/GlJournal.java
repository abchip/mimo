/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Journal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalName <em>Gl Journal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getPostedDate <em>Posted Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal()
 * @model
 * @generated
 */
public interface GlJournal extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Gl Journal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Name</em>' attribute.
	 * @see #setGlJournalName(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal_GlJournalName()
	 * @model
	 * @generated
	 */
	String getGlJournalName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalName <em>Gl Journal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Name</em>' attribute.
	 * @see #getGlJournalName()
	 * @generated
	 */
	void setGlJournalName(String value);

	/**
	 * Returns the value of the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Posted</em>' attribute.
	 * @see #setIsPosted(boolean)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal_IsPosted()
	 * @model
	 * @generated
	 */
	boolean isIsPosted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#isIsPosted <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Posted</em>' attribute.
	 * @see #isIsPosted()
	 * @generated
	 */
	void setIsPosted(boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' attribute.
	 * @see #setOrganizationPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal_OrganizationPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getOrganizationPartyId <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' attribute.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date</em>' attribute.
	 * @see #setPostedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal_PostedDate()
	 * @model
	 * @generated
	 */
	Date getPostedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getPostedDate <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' attribute.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='glJournalId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='errorGlJournalId'"
	 * @generated
	 */
	List<String> partyAcctgPreferences();

	/**
	 * Returns the value of the '<em><b>Gl Journal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #setGlJournalId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlJournal_GlJournalId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getGlJournalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalId <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #getGlJournalId()
	 * @generated
	 */
	void setGlJournalId(String value);

} // GlJournal
