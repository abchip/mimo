/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Invitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getLastInviteDate <em>Last Invite Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationGroupAssocs <em>Party Invitation Group Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationRoleAssocs <em>Party Invitation Role Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitation#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation()
 * @model
 * @generated
 */
public interface PartyInvitation extends BizEntity {
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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_EmailAddress()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Last Invite Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Invite Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Invite Date</em>' attribute.
	 * @see #setLastInviteDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_LastInviteDate()
	 * @model
	 * @generated
	 */
	Date getLastInviteDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getLastInviteDate <em>Last Invite Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Invite Date</em>' attribute.
	 * @see #getLastInviteDate()
	 * @generated
	 */
	void setLastInviteDate(Date value);

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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_PartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_ToName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Invitation Group Assocs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Invitation Group Assocs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Invitation Group Assocs</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_PartyInvitationGroupAssocs()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyInvitationGroupAssoc> getPartyInvitationGroupAssocs();

	/**
	 * Returns the value of the '<em><b>Party Invitation Role Assocs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Invitation Role Assocs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Invitation Role Assocs</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_PartyInvitationRoleAssocs()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyInvitationRoleAssoc> getPartyInvitationRoleAssocs();

	/**
	 * Returns the value of the '<em><b>Party Invitation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Invitation Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Invitation Id</em>' attribute.
	 * @see #setPartyInvitationId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitation_PartyInvitationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyInvitationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationId <em>Party Invitation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Invitation Id</em>' attribute.
	 * @see #getPartyInvitationId()
	 * @generated
	 */
	void setPartyInvitationId(String value);

} // PartyInvitation
