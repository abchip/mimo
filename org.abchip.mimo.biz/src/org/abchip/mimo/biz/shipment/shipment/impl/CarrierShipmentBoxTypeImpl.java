/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizeCode(String newOversizeCode) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE, newOversizeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackagingTypeCode() {
		return (String)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagingTypeCode(String newPackagingTypeCode) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE, newPackagingTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getShipmentBoxTypeId() {
		return (ShipmentBoxType)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(ShipmentBoxType newShipmentBoxTypeId) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID, newShipmentBoxTypeId);
	}

} //CarrierShipmentBoxTypeImpl
