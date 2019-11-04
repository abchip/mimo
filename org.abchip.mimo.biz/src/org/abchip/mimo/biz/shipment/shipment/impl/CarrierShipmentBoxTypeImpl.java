/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getOversizeCode <em>Oversize Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getPackagingTypeCode <em>Packaging Type Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierShipmentBoxTypeImpl extends BizEntityImpl implements CarrierShipmentBoxType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOversizeCode() <em>Oversize Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizeCode()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERSIZE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOversizeCode() <em>Oversize Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizeCode()
	 * @generated
	 * @ordered
	 */
	protected String oversizeCode = OVERSIZE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackagingTypeCode() <em>Packaging Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGING_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagingTypeCode() <em>Packaging Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingTypeCode()
	 * @generated
	 * @ordered
	 */
	protected String packagingTypeCode = PACKAGING_TYPE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentBoxType shipmentBoxTypeId;

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
	protected CarrierShipmentBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOversizeCode() {
		return oversizeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizeCode(String newOversizeCode) {
		String oldOversizeCode = oversizeCode;
		oversizeCode = newOversizeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE, oldOversizeCode, oversizeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackagingTypeCode() {
		return packagingTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagingTypeCode(String newPackagingTypeCode) {
		String oldPackagingTypeCode = packagingTypeCode;
		packagingTypeCode = newPackagingTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE, oldPackagingTypeCode, packagingTypeCode));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID, oldPartyId, partyId));
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
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getShipmentBoxTypeId() {
		if (shipmentBoxTypeId != null && ((EObject)shipmentBoxTypeId).eIsProxy()) {
			InternalEObject oldShipmentBoxTypeId = (InternalEObject)shipmentBoxTypeId;
			shipmentBoxTypeId = (ShipmentBoxType)eResolveProxy(oldShipmentBoxTypeId);
			if (shipmentBoxTypeId != oldShipmentBoxTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID, oldShipmentBoxTypeId, shipmentBoxTypeId));
			}
		}
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentBoxType basicGetShipmentBoxTypeId() {
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(ShipmentBoxType newShipmentBoxTypeId) {
		ShipmentBoxType oldShipmentBoxTypeId = shipmentBoxTypeId;
		shipmentBoxTypeId = newShipmentBoxTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID, oldShipmentBoxTypeId, shipmentBoxTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				return getOversizeCode();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				return getPackagingTypeCode();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				if (resolve) return getShipmentBoxTypeId();
				return basicGetShipmentBoxTypeId();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				setOversizeCode((String)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				setPackagingTypeCode((String)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((ShipmentBoxType)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				setOversizeCode(OVERSIZE_CODE_EDEFAULT);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				setPackagingTypeCode(PACKAGING_TYPE_CODE_EDEFAULT);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((ShipmentBoxType)null);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				return OVERSIZE_CODE_EDEFAULT == null ? oversizeCode != null : !OVERSIZE_CODE_EDEFAULT.equals(oversizeCode);
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				return PACKAGING_TYPE_CODE_EDEFAULT == null ? packagingTypeCode != null : !PACKAGING_TYPE_CODE_EDEFAULT.equals(packagingTypeCode);
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				return shipmentBoxTypeId != null;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
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
		result.append(" (oversizeCode: ");
		result.append(oversizeCode);
		result.append(", packagingTypeCode: ");
		result.append(packagingTypeCode);
		result.append(')');
		return result.toString();
	}

} //CarrierShipmentBoxTypeImpl
