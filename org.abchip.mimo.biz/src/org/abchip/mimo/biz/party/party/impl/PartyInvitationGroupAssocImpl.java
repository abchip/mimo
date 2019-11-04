/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Invitation Group Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl#getPartyInvitationId <em>Party Invitation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl#getPartyIdTo <em>Party Id To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyInvitationGroupAssocImpl extends BizEntityImpl implements PartyInvitationGroupAssoc {
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
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyInvitationGroupAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_INVITATION_GROUP_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		Party oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID, oldPartyInvitationId, partyInvitationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID:
				return getPartyInvitationId();
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
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
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId((String)newValue);
				return;
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
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
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID:
				setPartyInvitationId(PARTY_INVITATION_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO:
				setPartyIdTo((Party)null);
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
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID:
				return PARTY_INVITATION_ID_EDEFAULT == null ? partyInvitationId != null : !PARTY_INVITATION_ID_EDEFAULT.equals(partyInvitationId);
			case PartyPackage.PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO:
				return partyIdTo != null;
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

} //PartyInvitationGroupAssocImpl
