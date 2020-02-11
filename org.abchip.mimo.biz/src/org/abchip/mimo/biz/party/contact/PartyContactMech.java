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
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isAllowSolicitation <em>Allow Solicitation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getMonthsWithContactMech <em>Months With Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getYearsWithContactMech <em>Years With Contact Mech</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech()
 * @model annotation="mimo-ent-frame title='Party Contact Mechanism'"
 * @generated
 */
public interface PartyContactMech extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_Extension()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

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
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Allow Solicitation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Solicitation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Solicitation</em>' attribute.
	 * @see #setAllowSolicitation(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_AllowSolicitation()
	 * @model
	 * @generated
	 */
	boolean isAllowSolicitation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isAllowSolicitation <em>Allow Solicitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Solicitation</em>' attribute.
	 * @see #isAllowSolicitation()
	 * @generated
	 */
	void setAllowSolicitation(boolean value);

	/**
	 * Returns the value of the '<em><b>Months With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Months With Contact Mech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Months With Contact Mech</em>' attribute.
	 * @see #setMonthsWithContactMech(long)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_MonthsWithContactMech()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMonthsWithContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getMonthsWithContactMech <em>Months With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Months With Contact Mech</em>' attribute.
	 * @see #getMonthsWithContactMech()
	 * @generated
	 */
	void setMonthsWithContactMech(long value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified</em>' attribute.
	 * @see #setVerified(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_Verified()
	 * @model
	 * @generated
	 */
	boolean isVerified();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isVerified <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' attribute.
	 * @see #isVerified()
	 * @generated
	 */
	void setVerified(boolean value);

	/**
	 * Returns the value of the '<em><b>Years With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years With Contact Mech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years With Contact Mech</em>' attribute.
	 * @see #setYearsWithContactMech(long)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_YearsWithContactMech()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getYearsWithContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getYearsWithContactMech <em>Years With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years With Contact Mech</em>' attribute.
	 * @see #getYearsWithContactMech()
	 * @generated
	 */
	void setYearsWithContactMech(long value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' reference.
	 * @see #setContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPartyContactMech_ContactMechId()
	 * @model keys="contactMechId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

} // PartyContactMech
