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
import org.abchip.mimo.biz.party.party.PartyIcsAvsOverride;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Ics Avs Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl#getAvsDeclineString <em>Avs Decline String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyIcsAvsOverrideImpl extends BizEntityImpl implements PartyIcsAvsOverride {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAvsDeclineString() <em>Avs Decline String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvsDeclineString()
	 * @generated
	 * @ordered
	 */
	protected static final String AVS_DECLINE_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAvsDeclineString() <em>Avs Decline String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvsDeclineString()
	 * @generated
	 * @ordered
	 */
	protected String avsDeclineString = AVS_DECLINE_STRING_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyIcsAvsOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_ICS_AVS_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvsDeclineString() {
		return avsDeclineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsDeclineString(String newAvsDeclineString) {
		avsDeclineString = newAvsDeclineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING:
				return getAvsDeclineString();
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING:
				setAvsDeclineString((String)newValue);
				return;
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING:
				setAvsDeclineString(AVS_DECLINE_STRING_EDEFAULT);
				return;
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__PARTY_ID:
				setPartyId((Party)null);
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
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING:
				return AVS_DECLINE_STRING_EDEFAULT == null ? avsDeclineString != null : !AVS_DECLINE_STRING_EDEFAULT.equals(avsDeclineString);
			case PartyPackage.PARTY_ICS_AVS_OVERRIDE__PARTY_ID:
				return partyId != null;
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
		result.append(" (avsDeclineString: ");
		result.append(avsDeclineString);
		result.append(')');
		return result.toString();
	}

} //PartyIcsAvsOverrideImpl
