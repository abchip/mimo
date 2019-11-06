/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.shipment.receipt.ReceiptPackage;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Receipt Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentReceiptRoleImpl extends BizEntityImpl implements ShipmentReceiptRole {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceiptId() <em>Receipt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentReceipt receiptId;

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
	protected ShipmentReceiptRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReceiptPackage.Literals.SHIPMENT_RECEIPT_ROLE;
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
	public ShipmentReceipt getReceiptId() {
		if (receiptId != null && ((EObject)receiptId).eIsProxy()) {
			InternalEObject oldReceiptId = (InternalEObject)receiptId;
			receiptId = (ShipmentReceipt)eResolveProxy(oldReceiptId);
			if (receiptId != oldReceiptId) {
			}
		}
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentReceipt basicGetReceiptId() {
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiptId(ShipmentReceipt newReceiptId) {
		receiptId = newReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID:
				return getRoleTypeId();
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__RECEIPT_ID:
				if (resolve) return getReceiptId();
				return basicGetReceiptId();
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__PARTY_ID:
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
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__PARTY_ID:
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
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__PARTY_ID:
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
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__RECEIPT_ID:
				return receiptId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE__PARTY_ID:
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
		result.append(" (roleTypeId: ");
		result.append(roleTypeId);
		result.append(')');
		return result.toString();
	}

} //ShipmentReceiptRoleImpl
