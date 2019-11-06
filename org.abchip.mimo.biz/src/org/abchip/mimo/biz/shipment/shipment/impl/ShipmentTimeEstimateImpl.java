/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Time Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getLeadTime <em>Lead Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl#getLeadTimeUomId <em>Lead Time Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentTimeEstimateImpl extends BizEntityImpl implements ShipmentTimeEstimate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentMethodTypeId = SHIPMENT_METHOD_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeadTime() <em>Lead Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LEAD_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeadTime() <em>Lead Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal leadTime = LEAD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeoIdTo() <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdTo()
	 * @generated
	 * @ordered
	 */
	protected Geo geoIdTo;

	/**
	 * The cached value of the '{@link #getGeoIdFrom() <em>Geo Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Geo geoIdFrom;

	/**
	 * The cached value of the '{@link #getLeadTimeUomId() <em>Lead Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom leadTimeUomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentTimeEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_TIME_ESTIMATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdFrom() {
		if (geoIdFrom != null && ((EObject)geoIdFrom).eIsProxy()) {
			InternalEObject oldGeoIdFrom = (InternalEObject)geoIdFrom;
			geoIdFrom = (Geo)eResolveProxy(oldGeoIdFrom);
			if (geoIdFrom != oldGeoIdFrom) {
			}
		}
		return geoIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoIdFrom() {
		return geoIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdFrom(Geo newGeoIdFrom) {
		geoIdFrom = newGeoIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdTo() {
		if (geoIdTo != null && ((EObject)geoIdTo).eIsProxy()) {
			InternalEObject oldGeoIdTo = (InternalEObject)geoIdTo;
			geoIdTo = (Geo)eResolveProxy(oldGeoIdTo);
			if (geoIdTo != oldGeoIdTo) {
			}
		}
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoIdTo() {
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(Geo newGeoIdTo) {
		geoIdTo = newGeoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLeadTime() {
		return leadTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeadTime(BigDecimal newLeadTime) {
		leadTime = newLeadTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getLeadTimeUomId() {
		if (leadTimeUomId != null && ((EObject)leadTimeUomId).eIsProxy()) {
			InternalEObject oldLeadTimeUomId = (InternalEObject)leadTimeUomId;
			leadTimeUomId = (Uom)eResolveProxy(oldLeadTimeUomId);
			if (leadTimeUomId != oldLeadTimeUomId) {
			}
		}
		return leadTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetLeadTimeUomId() {
		return leadTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeadTimeUomId(Uom newLeadTimeUomId) {
		leadTimeUomId = newLeadTimeUomId;
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
		partyId = newPartyId;
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
	public long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(long newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		shipmentMethodTypeId = newShipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__PARTY_ID:
				return getPartyId();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID:
				return getRoleTypeId();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__FROM_DATE:
				return getFromDate();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME:
				return getLeadTime();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__THRU_DATE:
				return getThruDate();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_TO:
				if (resolve) return getGeoIdTo();
				return basicGetGeoIdTo();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM:
				if (resolve) return getGeoIdFrom();
				return basicGetGeoIdFrom();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID:
				if (resolve) return getLeadTimeUomId();
				return basicGetLeadTimeUomId();
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
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME:
				setLeadTime((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER:
				setSequenceNumber((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_TO:
				setGeoIdTo((Geo)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM:
				setGeoIdFrom((Geo)newValue);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID:
				setLeadTimeUomId((Uom)newValue);
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
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME:
				setLeadTime(LEAD_TIME_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_TO:
				setGeoIdTo((Geo)null);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM:
				setGeoIdFrom((Geo)null);
				return;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID:
				setLeadTimeUomId((Uom)null);
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
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME:
				return LEAD_TIME_EDEFAULT == null ? leadTime != null : !LEAD_TIME_EDEFAULT.equals(leadTime);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_TO:
				return geoIdTo != null;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM:
				return geoIdFrom != null;
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID:
				return leadTimeUomId != null;
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
		result.append(" (shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", leadTime: ");
		result.append(leadTime);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ShipmentTimeEstimateImpl
