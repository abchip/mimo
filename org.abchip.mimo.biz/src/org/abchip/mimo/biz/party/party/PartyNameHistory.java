/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Name History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory()
 * @model
 * @generated
 */
public interface PartyNameHistory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_ChangeDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_FirstName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_GroupName()
	 * @model annotation="mimo-ent-slot help='For Party Groups only'"
	 *        annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_LastName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_MiddleName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Title</em>' attribute.
	 * @see #setPersonalTitle(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_PersonalTitle()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPersonalTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPersonalTitle <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Title</em>' attribute.
	 * @see #getPersonalTitle()
	 * @generated
	 */
	void setPersonalTitle(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_Suffix()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNameHistory_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

} // PartyNameHistory
