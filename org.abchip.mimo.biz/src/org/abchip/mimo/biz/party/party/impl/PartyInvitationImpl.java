/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyInvitation;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getToName <em>To Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyInvitationGroupAssocs <em>Party Invitation Group Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl#getPartyInvitationRoleAssocs <em>Party Invitation Role Assocs</em>}</li>
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
	 * The default value of the '{@link #getPartyInvitationId() <em>Party Invitation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInvitationId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_INVITATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyInvitationId() <em>Party Invitation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInvitationId()
	 * @generated
	 * @ordered
	 */
	protected String partyInvitationId = PARTY_INVITATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailAddress = EMAIL_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastInviteDate() <em>Last Invite Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInviteDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_INVITE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastInviteDate() <em>Last Invite Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInviteDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastInviteDate = LAST_INVITE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected String toName = TO_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getPartyInvitationGroupAssocs() <em>Party Invitation Group Assocs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInvitationGroupAssocs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyInvitationGroupAssocs;
	/**
	 * The cached value of the '{@link #getPartyInvitationRoleAssocs() <em>Party Invitation Role Assocs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInvitationRoleAssocs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyInvitationRoleAssocs;

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
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		emailAddress = newEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInviteDate() {
		return lastInviteDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInviteDate(Date newLastInviteDate) {
		lastInviteDate = newLastInviteDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return toName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		toName = newToName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyInvitationGroupAssocs() {
		if (partyInvitationGroupAssocs == null) {
			partyInvitationGroupAssocs = new BasicInternalEList<String>(String.class);
		}
		return partyInvitationGroupAssocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyInvitationRoleAssocs() {
		if (partyInvitationRoleAssocs == null) {
			partyInvitationRoleAssocs = new BasicInternalEList<String>(String.class);
		}
		return partyInvitationRoleAssocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		partyIdFrom = newPartyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyInvitationId() {
		return partyInvitationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyInvitationId(String newPartyInvitationId) {
		partyInvitationId = newPartyInvitationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ID:
				return getPartyInvitationId();
			case PartyPackage.PARTY_INVITATION__EMAIL_ADDRESS:
				return getEmailAddress();
			case PartyPackage.PARTY_INVITATION__LAST_INVITE_DATE:
				return getLastInviteDate();
			case PartyPackage.PARTY_INVITATION__PARTY_ID:
				return getPartyId();
			case PartyPackage.PARTY_INVITATION__TO_NAME:
				return getToName();
			case PartyPackage.PARTY_INVITATION__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case PartyPackage.PARTY_INVITATION__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS:
				return getPartyInvitationGroupAssocs();
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS:
				return getPartyInvitationRoleAssocs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ID:
				setPartyInvitationId((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__LAST_INVITE_DATE:
				setLastInviteDate((Date)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__TO_NAME:
				setToName((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS:
				getPartyInvitationGroupAssocs().clear();
				getPartyInvitationGroupAssocs().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS:
				getPartyInvitationRoleAssocs().clear();
				getPartyInvitationRoleAssocs().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ID:
				setPartyInvitationId(PARTY_INVITATION_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION__LAST_INVITE_DATE:
				setLastInviteDate(LAST_INVITE_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION__TO_NAME:
				setToName(TO_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case PartyPackage.PARTY_INVITATION__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS:
				getPartyInvitationGroupAssocs().clear();
				return;
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS:
				getPartyInvitationRoleAssocs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ID:
				return PARTY_INVITATION_ID_EDEFAULT == null ? partyInvitationId != null : !PARTY_INVITATION_ID_EDEFAULT.equals(partyInvitationId);
			case PartyPackage.PARTY_INVITATION__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? emailAddress != null : !EMAIL_ADDRESS_EDEFAULT.equals(emailAddress);
			case PartyPackage.PARTY_INVITATION__LAST_INVITE_DATE:
				return LAST_INVITE_DATE_EDEFAULT == null ? lastInviteDate != null : !LAST_INVITE_DATE_EDEFAULT.equals(lastInviteDate);
			case PartyPackage.PARTY_INVITATION__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PartyPackage.PARTY_INVITATION__TO_NAME:
				return TO_NAME_EDEFAULT == null ? toName != null : !TO_NAME_EDEFAULT.equals(toName);
			case PartyPackage.PARTY_INVITATION__PARTY_ID_FROM:
				return partyIdFrom != null;
			case PartyPackage.PARTY_INVITATION__STATUS_ID:
				return statusId != null;
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS:
				return partyInvitationGroupAssocs != null && !partyInvitationGroupAssocs.isEmpty();
			case PartyPackage.PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS:
				return partyInvitationRoleAssocs != null && !partyInvitationRoleAssocs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (partyInvitationId: ");
		result.append(partyInvitationId);
		result.append(", emailAddress: ");
		result.append(emailAddress);
		result.append(", lastInviteDate: ");
		result.append(lastInviteDate);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", toName: ");
		result.append(toName);
		result.append(", partyInvitationGroupAssocs: ");
		result.append(partyInvitationGroupAssocs);
		result.append(", partyInvitationRoleAssocs: ");
		result.append(partyInvitationRoleAssocs);
		result.append(')');
		return result.toString();
	}

} //PartyInvitationImpl
