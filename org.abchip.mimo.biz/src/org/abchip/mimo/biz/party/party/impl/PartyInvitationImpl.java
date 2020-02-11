/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyInvitation;
import org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc;
import org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Invitation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getLastInviteDate <em>Last Invite Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyInvitationGroupAssocs <em>Party Invitation Group Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyInvitationRoleAssocs <em>Party Invitation Role Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyInvitationImpl extends BizEntityImpl implements PartyInvitation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyInvitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_INVITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return (String)eGet(PartyPackage.Literals.PARTY_INVITATION__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__EMAIL_ADDRESS, newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInviteDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY_INVITATION__LAST_INVITE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInviteDate(Date newLastInviteDate) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__LAST_INVITE_DATE, newLastInviteDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.PARTY_INVITATION__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(PartyPackage.Literals.PARTY_INVITATION__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return (String)eGet(PartyPackage.Literals.PARTY_INVITATION__TO_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__TO_NAME, newToName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(PartyPackage.Literals.PARTY_INVITATION__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyInvitationGroupAssoc> getPartyInvitationGroupAssocs() {
		return (List<PartyInvitationGroupAssoc>)eGet(PartyPackage.Literals.PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyInvitationRoleAssoc> getPartyInvitationRoleAssocs() {
		return (List<PartyInvitationRoleAssoc>)eGet(PartyPackage.Literals.PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyInvitationId() {
		return (String)eGet(PartyPackage.Literals.PARTY_INVITATION__PARTY_INVITATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyInvitationId(String newPartyInvitationId) {
		eSet(PartyPackage.Literals.PARTY_INVITATION__PARTY_INVITATION_ID, newPartyInvitationId);
	}

} //PartyInvitationImpl
