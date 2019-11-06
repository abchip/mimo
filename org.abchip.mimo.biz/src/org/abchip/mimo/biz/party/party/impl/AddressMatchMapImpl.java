/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.AddressMatchMap;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Match Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl#getMapValue <em>Map Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressMatchMapImpl extends BizEntityImpl implements AddressMatchMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected String mapKey = MAP_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapValue() <em>Map Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapValue() <em>Map Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapValue()
	 * @generated
	 * @ordered
	 */
	protected String mapValue = MAP_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressMatchMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.ADDRESS_MATCH_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapKey() {
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKey(String newMapKey) {
		mapKey = newMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapValue() {
		return mapValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapValue(String newMapValue) {
		mapValue = newMapValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		sequenceNum = newSequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_KEY:
				return getMapKey();
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_VALUE:
				return getMapValue();
			case PartyPackage.ADDRESS_MATCH_MAP__SEQUENCE_NUM:
				return getSequenceNum();
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
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_KEY:
				setMapKey((String)newValue);
				return;
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_VALUE:
				setMapValue((String)newValue);
				return;
			case PartyPackage.ADDRESS_MATCH_MAP__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_KEY:
				setMapKey(MAP_KEY_EDEFAULT);
				return;
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_VALUE:
				setMapValue(MAP_VALUE_EDEFAULT);
				return;
			case PartyPackage.ADDRESS_MATCH_MAP__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_KEY:
				return MAP_KEY_EDEFAULT == null ? mapKey != null : !MAP_KEY_EDEFAULT.equals(mapKey);
			case PartyPackage.ADDRESS_MATCH_MAP__MAP_VALUE:
				return MAP_VALUE_EDEFAULT == null ? mapValue != null : !MAP_VALUE_EDEFAULT.equals(mapValue);
			case PartyPackage.ADDRESS_MATCH_MAP__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (mapKey: ");
		result.append(mapKey);
		result.append(", mapValue: ");
		result.append(mapValue);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //AddressMatchMapImpl
