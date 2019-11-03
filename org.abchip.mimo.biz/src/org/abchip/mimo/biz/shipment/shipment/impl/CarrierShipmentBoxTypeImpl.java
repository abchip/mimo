/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getOversizeCode <em>Oversize Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl#getPackagingTypeCode <em>Packaging Type Code</em>}</li>
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
	 * The default value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_BOX_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentBoxTypeId = SHIPMENT_BOX_TYPE_ID_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentBoxTypeId() {
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(String newShipmentBoxTypeId) {
		String oldShipmentBoxTypeId = shipmentBoxTypeId;
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				return getShipmentBoxTypeId();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
				return getPartyId();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				return getOversizeCode();
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				return getPackagingTypeCode();
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((String)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				setOversizeCode((String)newValue);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				setPackagingTypeCode((String)newValue);
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId(SHIPMENT_BOX_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				setOversizeCode(OVERSIZE_CODE_EDEFAULT);
				return;
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				setPackagingTypeCode(PACKAGING_TYPE_CODE_EDEFAULT);
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				return SHIPMENT_BOX_TYPE_ID_EDEFAULT == null ? shipmentBoxTypeId != null : !SHIPMENT_BOX_TYPE_ID_EDEFAULT.equals(shipmentBoxTypeId);
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE:
				return OVERSIZE_CODE_EDEFAULT == null ? oversizeCode != null : !OVERSIZE_CODE_EDEFAULT.equals(oversizeCode);
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE:
				return PACKAGING_TYPE_CODE_EDEFAULT == null ? packagingTypeCode != null : !PACKAGING_TYPE_CODE_EDEFAULT.equals(packagingTypeCode);
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
		result.append(" (shipmentBoxTypeId: ");
		result.append(shipmentBoxTypeId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", oversizeCode: ");
		result.append(oversizeCode);
		result.append(", packagingTypeCode: ");
		result.append(packagingTypeCode);
		result.append(')');
		return result.toString();
	}

} //CarrierShipmentBoxTypeImpl
