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
import org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Shipment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl#getCarrierServiceCode <em>Carrier Service Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierShipmentMethodImpl extends BizEntityImpl implements CarrierShipmentMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierShipmentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierServiceCode() {
		return (String)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__CARRIER_SERVICE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierServiceCode(String newCarrierServiceCode) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__CARRIER_SERVICE_CODE, newCarrierServiceCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return (String)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNumber() {
		return (Long)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__SEQUENCE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(long newSequenceNumber) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__SEQUENCE_NUMBER, newSequenceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		return (ShipmentMethodType)eGet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		eSet(Shipment_Package.Literals.CARRIER_SHIPMENT_METHOD__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

} //CarrierShipmentMethodImpl
