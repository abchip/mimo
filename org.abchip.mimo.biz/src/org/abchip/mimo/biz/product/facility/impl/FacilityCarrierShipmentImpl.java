/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.FacilityCarrierShipment;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Carrier Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityCarrierShipmentImpl extends BizEntityImpl implements FacilityCarrierShipment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentMethodType shipmentMethodTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityCarrierShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY_CARRIER_SHIPMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID, oldPartyId, partyId));
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
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		if (shipmentMethodTypeId != null && ((EObject)shipmentMethodTypeId).eIsProxy()) {
			InternalEObject oldShipmentMethodTypeId = (InternalEObject)shipmentMethodTypeId;
			shipmentMethodTypeId = (ShipmentMethodType)eResolveProxy(oldShipmentMethodTypeId);
			if (shipmentMethodTypeId != oldShipmentMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
			}
		}
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentMethodType basicGetShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		ShipmentMethodType oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_CARRIER_SHIPMENT__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__FACILITY_ID:
				return getFacilityId();
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID:
				return getRoleTypeId();
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				if (resolve) return getShipmentMethodTypeId();
				return basicGetShipmentMethodTypeId();
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
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)newValue);
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
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)null);
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
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__PARTY_ID:
				return partyId != null;
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				return shipmentMethodTypeId != null;
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
		result.append(" (facilityId: ");
		result.append(facilityId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(')');
		return result.toString();
	}

} //FacilityCarrierShipmentImpl
