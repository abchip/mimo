/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Invitation Role Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitationRoleAssoc()
 * @model
 * @generated
 */
public interface PartyInvitationRoleAssoc extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitationRoleAssoc_RoleTypeId()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Party Invitation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Invitation Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Invitation Id</em>' reference.
	 * @see #setPartyInvitationId(PartyInvitation)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyInvitationRoleAssoc_PartyInvitationId()
	 * @model keys="partyInvitationId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyInvitation getPartyInvitationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getPartyInvitationId <em>Party Invitation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Invitation Id</em>' reference.
	 * @see #getPartyInvitationId()
	 * @generated
	 */
	void setPartyInvitationId(PartyInvitation value);

} // PartyInvitationRoleAssoc
