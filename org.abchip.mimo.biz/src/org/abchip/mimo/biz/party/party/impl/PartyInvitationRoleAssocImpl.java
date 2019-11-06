/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.PartyInvitation;
import org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Invitation Role Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyInvitationRoleAssocImpl extends BizEntityImpl implements PartyInvitationRoleAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;
	/**
	 * The cached value of the '{@link #getPartyInvitationId() <em>Party Invitation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInvitationId()
	 * @generated
	 * @ordered
	 */
	protected PartyInvitation partyInvitationId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyInvitationRoleAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_INVITATION_ROLE_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyInvitation getPartyInvitationId() {
		if (partyInvitationId != null && ((EObject)partyInvitationId).eIsProxy()) {
			InternalEObject oldPartyInvitationId = (InternalEObject)partyInvitationId;
			partyInvitationId = (PartyInvitation)eResolveProxy(oldPartyInvitationId);
			if (partyInvitationId != oldPartyInvitationId) {
			}
		}
		return partyInvitationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyInvitation basicGetPartyInvitationId() {
		return partyInvitationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyInvitationId(PartyInvitation newPartyInvitationId) {
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				if (resolve) return getPartyInvitationId();
				return basicGetPartyInvitationId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId((PartyInvitation)newValue);
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId((PartyInvitation)null);
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				return roleTypeId != null;
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				return partyInvitationId != null;
		}
		return super.eIsSet(featureID);
	}

} //PartyInvitationRoleAssocImpl
