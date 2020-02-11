/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.Delivery;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Route Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualOtherCost <em>Actual Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualServiceCost <em>Actual Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualTransportCost <em>Actual Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getBillingWeight <em>Billing Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getBillingWeightUomId <em>Billing Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierServiceStatusId <em>Carrier Service Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDeliveryId <em>Delivery Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestContactMechId <em>Dest Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestFacilityId <em>Dest Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestTelecomNumberId <em>Dest Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryDate <em>Home Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryType <em>Home Delivery Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyAccountNumber <em>Third Party Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyPostalCode <em>Third Party Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingDigest <em>Tracking Digest</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingIdNumber <em>Tracking Id Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpsHighValueReport <em>Ups High Value Report</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentRouteSegmentImpl extends BizEntityImpl implements ShipmentRouteSegment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentRouteSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualArrivalDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualArrivalDate(Date newActualArrivalDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE, newActualArrivalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCost(BigDecimal newActualCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST, newActualCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualOtherCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualOtherCost(BigDecimal newActualOtherCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST, newActualOtherCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualServiceCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualServiceCost(BigDecimal newActualServiceCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST, newActualServiceCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE, newActualStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualTransportCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualTransportCost(BigDecimal newActualTransportCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST, newActualTransportCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBillingWeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeight(BigDecimal newBillingWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT, newBillingWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getBillingWeightUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeightUomId(Uom newBillingWeightUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID, newBillingWeightUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierDeliveryZone() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierDeliveryZone(String newCarrierDeliveryZone) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE, newCarrierDeliveryZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCarrierPartyId() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(Party newCarrierPartyId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID, newCarrierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionCodes() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionCodes(String newCarrierRestrictionCodes) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES, newCarrierRestrictionCodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionDesc() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionDesc(String newCarrierRestrictionDesc) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC, newCarrierRestrictionDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getCarrierServiceStatusId() {
		return (StatusItem)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierServiceStatusId(StatusItem newCarrierServiceStatusId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID, newCarrierServiceStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delivery getDeliveryId() {
		return (Delivery)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryId(Delivery newDeliveryId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID, newDeliveryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getDestContactMechId() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestContactMechId(ContactMech newDestContactMechId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID, newDestContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestFacilityId() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestFacilityId(Facility newDestFacilityId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID, newDestFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getDestTelecomNumberId() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestTelecomNumberId(TelecomNumber newDestTelecomNumberId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID, newDestTelecomNumberId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedArrivalDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE, newEstimatedArrivalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE, newEstimatedStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHomeDeliveryDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryDate(Date newHomeDeliveryDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE, newHomeDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomeDeliveryType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryType(String newHomeDeliveryType) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE, newHomeDeliveryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedDate(Date newLastUpdatedDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE, newLastUpdatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMechId() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(ContactMech newOriginContactMechId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID, newOriginContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID, newOriginFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getOriginTelecomNumberId() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginTelecomNumberId(TelecomNumber newOriginTelecomNumberId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID, newOriginTelecomNumberId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		return (Shipment)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID, newShipmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		return (ShipmentMethodType)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentRouteSegmentId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentRouteSegmentId(String newShipmentRouteSegmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID, newShipmentRouteSegmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyAccountNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyAccountNumber(String newThirdPartyAccountNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER, newThirdPartyAccountNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyCountryGeoCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyCountryGeoCode(String newThirdPartyCountryGeoCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE, newThirdPartyCountryGeoCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyPostalCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyPostalCode(String newThirdPartyPostalCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE, newThirdPartyPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingDigest() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingDigest(String newTrackingDigest) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST, newTrackingDigest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingIdNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingIdNumber(String newTrackingIdNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER, newTrackingIdNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdatedByUserLoginId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedByUserLoginId(String newUpdatedByUserLoginId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID, newUpdatedByUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getUpsHighValueReport() {
		return (byte[])eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpsHighValueReport(byte[] newUpsHighValueReport) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT, newUpsHighValueReport);
	}

} //ShipmentRouteSegmentImpl
