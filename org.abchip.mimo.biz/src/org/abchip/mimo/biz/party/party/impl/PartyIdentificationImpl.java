/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.PartyIdentification;
import org.abchip.mimo.biz.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyIdentificationImpl extends BizEntityTypedImpl<PartyIdentificationType> implements PartyIdentification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getPartyIdentificationTypeId() <em>Party Identification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_IDENTIFICATION_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdentificationTypeId() <em>Party Identification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected String partyIdentificationTypeId = PARTY_IDENTIFICATION_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected String idValue = ID_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdValue() {
		return idValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdValue(String newIdValue) {
		String oldIdValue = idValue;
		idValue = newIdValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_IDENTIFICATION__ID_VALUE, oldIdValue, idValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdentificationTypeId() {
		return partyIdentificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdentificationTypeId(String newPartyIdentificationTypeId) {
		String oldPartyIdentificationTypeId = partyIdentificationTypeId;
		partyIdentificationTypeId = newPartyIdentificationTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID, oldPartyIdentificationTypeId, partyIdentificationTypeId));
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
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_IDENTIFICATION__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_ID:
				return getPartyId();
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID:
				return getPartyIdentificationTypeId();
			case PartyPackage.PARTY_IDENTIFICATION__ID_VALUE:
				return getIdValue();
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
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID:
				setPartyIdentificationTypeId((String)newValue);
				return;
			case PartyPackage.PARTY_IDENTIFICATION__ID_VALUE:
				setIdValue((String)newValue);
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
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID:
				setPartyIdentificationTypeId(PARTY_IDENTIFICATION_TYPE_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_IDENTIFICATION__ID_VALUE:
				setIdValue(ID_VALUE_EDEFAULT);
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
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PartyPackage.PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID:
				return PARTY_IDENTIFICATION_TYPE_ID_EDEFAULT == null ? partyIdentificationTypeId != null : !PARTY_IDENTIFICATION_TYPE_ID_EDEFAULT.equals(partyIdentificationTypeId);
			case PartyPackage.PARTY_IDENTIFICATION__ID_VALUE:
				return ID_VALUE_EDEFAULT == null ? idValue != null : !ID_VALUE_EDEFAULT.equals(idValue);
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", partyIdentificationTypeId: ");
		result.append(partyIdentificationTypeId);
		result.append(", idValue: ");
		result.append(idValue);
		result.append(')');
		return result.toString();
	}

} //PartyIdentificationImpl
