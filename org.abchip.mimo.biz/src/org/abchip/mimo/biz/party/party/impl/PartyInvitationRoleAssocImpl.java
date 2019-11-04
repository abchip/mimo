/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Invitation Role Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyInvitationRoleAssocImpl extends BizEntityImpl implements PartyInvitationRoleAssoc {
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
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
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
		RoleType oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
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
		String oldPartyInvitationId = partyInvitationId;
		partyInvitationId = newPartyInvitationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID, oldPartyInvitationId, partyInvitationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				return getPartyInvitationId();
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId(PARTY_INVITATION_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
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
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID:
				return PARTY_INVITATION_ID_EDEFAULT == null ? partyInvitationId != null : !PARTY_INVITATION_ID_EDEFAULT.equals(partyInvitationId);
			case PartyPackage.PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID:
				return roleTypeId != null;
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
		result.append(')');
		return result.toString();
	}

} //PartyInvitationRoleAssocImpl
