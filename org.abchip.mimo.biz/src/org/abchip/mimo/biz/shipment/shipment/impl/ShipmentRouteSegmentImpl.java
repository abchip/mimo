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

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.Delivery;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryDate <em>Home Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryType <em>Home Delivery Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyAccountNumber <em>Third Party Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyPostalCode <em>Third Party Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingDigest <em>Tracking Digest</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingIdNumber <em>Tracking Id Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpsHighValueReport <em>Ups High Value Report</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDeliveryId <em>Delivery Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestFacilityId <em>Dest Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestContactMechId <em>Dest Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestTelecomNumberId <em>Dest Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierServiceStatusId <em>Carrier Service Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl#getBillingWeightUomId <em>Billing Weight Uom Id</em>}</li>
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
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentId = SHIPMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentRouteSegmentId() <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentRouteSegmentId() <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentRouteSegmentId = SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualArrivalDate() <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualArrivalDate() <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualArrivalDate = ACTUAL_ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualCost = ACTUAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOtherCost() <em>Actual Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOtherCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_OTHER_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOtherCost() <em>Actual Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOtherCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualOtherCost = ACTUAL_OTHER_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualServiceCost() <em>Actual Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualServiceCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_SERVICE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualServiceCost() <em>Actual Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualServiceCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualServiceCost = ACTUAL_SERVICE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualStartDate = ACTUAL_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualTransportCost() <em>Actual Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTransportCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_TRANSPORT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualTransportCost() <em>Actual Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTransportCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualTransportCost = ACTUAL_TRANSPORT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingWeight() <em>Billing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BILLING_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingWeight() <em>Billing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal billingWeight = BILLING_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierDeliveryZone() <em>Carrier Delivery Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierDeliveryZone()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_DELIVERY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierDeliveryZone() <em>Carrier Delivery Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierDeliveryZone()
	 * @generated
	 * @ordered
	 */
	protected String carrierDeliveryZone = CARRIER_DELIVERY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRestrictionCodes() <em>Carrier Restriction Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRestrictionCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_RESTRICTION_CODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRestrictionCodes() <em>Carrier Restriction Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRestrictionCodes()
	 * @generated
	 * @ordered
	 */
	protected String carrierRestrictionCodes = CARRIER_RESTRICTION_CODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRestrictionDesc() <em>Carrier Restriction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRestrictionDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_RESTRICTION_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRestrictionDesc() <em>Carrier Restriction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRestrictionDesc()
	 * @generated
	 * @ordered
	 */
	protected String carrierRestrictionDesc = CARRIER_RESTRICTION_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedArrivalDate = ESTIMATED_ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedStartDate = ESTIMATED_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeDeliveryDate() <em>Home Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date HOME_DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeDeliveryDate() <em>Home Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date homeDeliveryDate = HOME_DELIVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeDeliveryType() <em>Home Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeDeliveryType()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_DELIVERY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeDeliveryType() <em>Home Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeDeliveryType()
	 * @generated
	 * @ordered
	 */
	protected String homeDeliveryType = HOME_DELIVERY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedDate() <em>Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedDate() <em>Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdatedDate = LAST_UPDATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThirdPartyAccountNumber() <em>Third Party Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_PARTY_ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThirdPartyAccountNumber() <em>Third Party Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String thirdPartyAccountNumber = THIRD_PARTY_ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getThirdPartyCountryGeoCode() <em>Third Party Country Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyCountryGeoCode()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_PARTY_COUNTRY_GEO_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThirdPartyCountryGeoCode() <em>Third Party Country Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyCountryGeoCode()
	 * @generated
	 * @ordered
	 */
	protected String thirdPartyCountryGeoCode = THIRD_PARTY_COUNTRY_GEO_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThirdPartyPostalCode() <em>Third Party Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_PARTY_POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThirdPartyPostalCode() <em>Third Party Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String thirdPartyPostalCode = THIRD_PARTY_POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingDigest() <em>Tracking Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingDigest()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_DIGEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingDigest() <em>Tracking Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingDigest()
	 * @generated
	 * @ordered
	 */
	protected String trackingDigest = TRACKING_DIGEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingIdNumber() <em>Tracking Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingIdNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_ID_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingIdNumber() <em>Tracking Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingIdNumber()
	 * @generated
	 * @ordered
	 */
	protected String trackingIdNumber = TRACKING_ID_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedByUserLoginId() <em>Updated By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedByUserLoginId() <em>Updated By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String updatedByUserLoginId = UPDATED_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpsHighValueReport() <em>Ups High Value Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpsHighValueReport()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] UPS_HIGH_VALUE_REPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpsHighValueReport() <em>Ups High Value Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpsHighValueReport()
	 * @generated
	 * @ordered
	 */
	protected byte[] upsHighValueReport = UPS_HIGH_VALUE_REPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeliveryId() <em>Delivery Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected Delivery deliveryId;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected PartyGroup carrierPartyId;

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
	 * The cached value of the '{@link #getOriginFacilityId() <em>Origin Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility originFacilityId;

	/**
	 * The cached value of the '{@link #getDestFacilityId() <em>Dest Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility destFacilityId;

	/**
	 * The cached value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected PostalAddress originContactMechId;

	/**
	 * The cached value of the '{@link #getOriginTelecomNumberId() <em>Origin Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected TelecomNumber originTelecomNumberId;

	/**
	 * The cached value of the '{@link #getDestContactMechId() <em>Dest Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestContactMechId()
	 * @generated
	 * @ordered
	 */
	protected PostalAddress destContactMechId;

	/**
	 * The cached value of the '{@link #getDestTelecomNumberId() <em>Dest Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected TelecomNumber destTelecomNumberId;

	/**
	 * The cached value of the '{@link #getCarrierServiceStatusId() <em>Carrier Service Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierServiceStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem carrierServiceStatusId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getBillingWeightUomId() <em>Billing Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom billingWeightUomId;

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
		return actualArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualArrivalDate(Date newActualArrivalDate) {
		Date oldActualArrivalDate = actualArrivalDate;
		actualArrivalDate = newActualArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE, oldActualArrivalDate, actualArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualCost() {
		return actualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCost(BigDecimal newActualCost) {
		BigDecimal oldActualCost = actualCost;
		actualCost = newActualCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST, oldActualCost, actualCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualOtherCost() {
		return actualOtherCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualOtherCost(BigDecimal newActualOtherCost) {
		BigDecimal oldActualOtherCost = actualOtherCost;
		actualOtherCost = newActualOtherCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST, oldActualOtherCost, actualOtherCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualServiceCost() {
		return actualServiceCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualServiceCost(BigDecimal newActualServiceCost) {
		BigDecimal oldActualServiceCost = actualServiceCost;
		actualServiceCost = newActualServiceCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST, oldActualServiceCost, actualServiceCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return actualStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		Date oldActualStartDate = actualStartDate;
		actualStartDate = newActualStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE, oldActualStartDate, actualStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualTransportCost() {
		return actualTransportCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualTransportCost(BigDecimal newActualTransportCost) {
		BigDecimal oldActualTransportCost = actualTransportCost;
		actualTransportCost = newActualTransportCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST, oldActualTransportCost, actualTransportCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBillingWeight() {
		return billingWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeight(BigDecimal newBillingWeight) {
		BigDecimal oldBillingWeight = billingWeight;
		billingWeight = newBillingWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT, oldBillingWeight, billingWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getBillingWeightUomId() {
		if (billingWeightUomId != null && ((EObject)billingWeightUomId).eIsProxy()) {
			InternalEObject oldBillingWeightUomId = (InternalEObject)billingWeightUomId;
			billingWeightUomId = (Uom)eResolveProxy(oldBillingWeightUomId);
			if (billingWeightUomId != oldBillingWeightUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID, oldBillingWeightUomId, billingWeightUomId));
			}
		}
		return billingWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetBillingWeightUomId() {
		return billingWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeightUomId(Uom newBillingWeightUomId) {
		Uom oldBillingWeightUomId = billingWeightUomId;
		billingWeightUomId = newBillingWeightUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID, oldBillingWeightUomId, billingWeightUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierDeliveryZone() {
		return carrierDeliveryZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierDeliveryZone(String newCarrierDeliveryZone) {
		String oldCarrierDeliveryZone = carrierDeliveryZone;
		carrierDeliveryZone = newCarrierDeliveryZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE, oldCarrierDeliveryZone, carrierDeliveryZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyGroup getCarrierPartyId() {
		if (carrierPartyId != null && ((EObject)carrierPartyId).eIsProxy()) {
			InternalEObject oldCarrierPartyId = (InternalEObject)carrierPartyId;
			carrierPartyId = (PartyGroup)eResolveProxy(oldCarrierPartyId);
			if (carrierPartyId != oldCarrierPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
			}
		}
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyGroup basicGetCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(PartyGroup newCarrierPartyId) {
		PartyGroup oldCarrierPartyId = carrierPartyId;
		carrierPartyId = newCarrierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionCodes() {
		return carrierRestrictionCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionCodes(String newCarrierRestrictionCodes) {
		String oldCarrierRestrictionCodes = carrierRestrictionCodes;
		carrierRestrictionCodes = newCarrierRestrictionCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES, oldCarrierRestrictionCodes, carrierRestrictionCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionDesc() {
		return carrierRestrictionDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionDesc(String newCarrierRestrictionDesc) {
		String oldCarrierRestrictionDesc = carrierRestrictionDesc;
		carrierRestrictionDesc = newCarrierRestrictionDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC, oldCarrierRestrictionDesc, carrierRestrictionDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getCarrierServiceStatusId() {
		if (carrierServiceStatusId != null && ((EObject)carrierServiceStatusId).eIsProxy()) {
			InternalEObject oldCarrierServiceStatusId = (InternalEObject)carrierServiceStatusId;
			carrierServiceStatusId = (StatusItem)eResolveProxy(oldCarrierServiceStatusId);
			if (carrierServiceStatusId != oldCarrierServiceStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID, oldCarrierServiceStatusId, carrierServiceStatusId));
			}
		}
		return carrierServiceStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetCarrierServiceStatusId() {
		return carrierServiceStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierServiceStatusId(StatusItem newCarrierServiceStatusId) {
		StatusItem oldCarrierServiceStatusId = carrierServiceStatusId;
		carrierServiceStatusId = newCarrierServiceStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID, oldCarrierServiceStatusId, carrierServiceStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delivery getDeliveryId() {
		if (deliveryId != null && ((EObject)deliveryId).eIsProxy()) {
			InternalEObject oldDeliveryId = (InternalEObject)deliveryId;
			deliveryId = (Delivery)eResolveProxy(oldDeliveryId);
			if (deliveryId != oldDeliveryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID, oldDeliveryId, deliveryId));
			}
		}
		return deliveryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delivery basicGetDeliveryId() {
		return deliveryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryId(Delivery newDeliveryId) {
		Delivery oldDeliveryId = deliveryId;
		deliveryId = newDeliveryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID, oldDeliveryId, deliveryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress getDestContactMechId() {
		if (destContactMechId != null && ((EObject)destContactMechId).eIsProxy()) {
			InternalEObject oldDestContactMechId = (InternalEObject)destContactMechId;
			destContactMechId = (PostalAddress)eResolveProxy(oldDestContactMechId);
			if (destContactMechId != oldDestContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID, oldDestContactMechId, destContactMechId));
			}
		}
		return destContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress basicGetDestContactMechId() {
		return destContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestContactMechId(PostalAddress newDestContactMechId) {
		PostalAddress oldDestContactMechId = destContactMechId;
		destContactMechId = newDestContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID, oldDestContactMechId, destContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestFacilityId() {
		if (destFacilityId != null && ((EObject)destFacilityId).eIsProxy()) {
			InternalEObject oldDestFacilityId = (InternalEObject)destFacilityId;
			destFacilityId = (Facility)eResolveProxy(oldDestFacilityId);
			if (destFacilityId != oldDestFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID, oldDestFacilityId, destFacilityId));
			}
		}
		return destFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetDestFacilityId() {
		return destFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestFacilityId(Facility newDestFacilityId) {
		Facility oldDestFacilityId = destFacilityId;
		destFacilityId = newDestFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID, oldDestFacilityId, destFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getDestTelecomNumberId() {
		if (destTelecomNumberId != null && ((EObject)destTelecomNumberId).eIsProxy()) {
			InternalEObject oldDestTelecomNumberId = (InternalEObject)destTelecomNumberId;
			destTelecomNumberId = (TelecomNumber)eResolveProxy(oldDestTelecomNumberId);
			if (destTelecomNumberId != oldDestTelecomNumberId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID, oldDestTelecomNumberId, destTelecomNumberId));
			}
		}
		return destTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNumber basicGetDestTelecomNumberId() {
		return destTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestTelecomNumberId(TelecomNumber newDestTelecomNumberId) {
		TelecomNumber oldDestTelecomNumberId = destTelecomNumberId;
		destTelecomNumberId = newDestTelecomNumberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID, oldDestTelecomNumberId, destTelecomNumberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		Date oldEstimatedArrivalDate = estimatedArrivalDate;
		estimatedArrivalDate = newEstimatedArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE, oldEstimatedArrivalDate, estimatedArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return estimatedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		Date oldEstimatedStartDate = estimatedStartDate;
		estimatedStartDate = newEstimatedStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE, oldEstimatedStartDate, estimatedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHomeDeliveryDate() {
		return homeDeliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryDate(Date newHomeDeliveryDate) {
		Date oldHomeDeliveryDate = homeDeliveryDate;
		homeDeliveryDate = newHomeDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE, oldHomeDeliveryDate, homeDeliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomeDeliveryType() {
		return homeDeliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryType(String newHomeDeliveryType) {
		String oldHomeDeliveryType = homeDeliveryType;
		homeDeliveryType = newHomeDeliveryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE, oldHomeDeliveryType, homeDeliveryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedDate(Date newLastUpdatedDate) {
		Date oldLastUpdatedDate = lastUpdatedDate;
		lastUpdatedDate = newLastUpdatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE, oldLastUpdatedDate, lastUpdatedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress getOriginContactMechId() {
		if (originContactMechId != null && ((EObject)originContactMechId).eIsProxy()) {
			InternalEObject oldOriginContactMechId = (InternalEObject)originContactMechId;
			originContactMechId = (PostalAddress)eResolveProxy(oldOriginContactMechId);
			if (originContactMechId != oldOriginContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID, oldOriginContactMechId, originContactMechId));
			}
		}
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress basicGetOriginContactMechId() {
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(PostalAddress newOriginContactMechId) {
		PostalAddress oldOriginContactMechId = originContactMechId;
		originContactMechId = newOriginContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID, oldOriginContactMechId, originContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		if (originFacilityId != null && ((EObject)originFacilityId).eIsProxy()) {
			InternalEObject oldOriginFacilityId = (InternalEObject)originFacilityId;
			originFacilityId = (Facility)eResolveProxy(oldOriginFacilityId);
			if (originFacilityId != oldOriginFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID, oldOriginFacilityId, originFacilityId));
			}
		}
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetOriginFacilityId() {
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		Facility oldOriginFacilityId = originFacilityId;
		originFacilityId = newOriginFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID, oldOriginFacilityId, originFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getOriginTelecomNumberId() {
		if (originTelecomNumberId != null && ((EObject)originTelecomNumberId).eIsProxy()) {
			InternalEObject oldOriginTelecomNumberId = (InternalEObject)originTelecomNumberId;
			originTelecomNumberId = (TelecomNumber)eResolveProxy(oldOriginTelecomNumberId);
			if (originTelecomNumberId != oldOriginTelecomNumberId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID, oldOriginTelecomNumberId, originTelecomNumberId));
			}
		}
		return originTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNumber basicGetOriginTelecomNumberId() {
		return originTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginTelecomNumberId(TelecomNumber newOriginTelecomNumberId) {
		TelecomNumber oldOriginTelecomNumberId = originTelecomNumberId;
		originTelecomNumberId = newOriginTelecomNumberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID, oldOriginTelecomNumberId, originTelecomNumberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		String oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID, oldShipmentId, shipmentId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentRouteSegmentId() {
		return shipmentRouteSegmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentRouteSegmentId(String newShipmentRouteSegmentId) {
		String oldShipmentRouteSegmentId = shipmentRouteSegmentId;
		shipmentRouteSegmentId = newShipmentRouteSegmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID, oldShipmentRouteSegmentId, shipmentRouteSegmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyAccountNumber() {
		return thirdPartyAccountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyAccountNumber(String newThirdPartyAccountNumber) {
		String oldThirdPartyAccountNumber = thirdPartyAccountNumber;
		thirdPartyAccountNumber = newThirdPartyAccountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER, oldThirdPartyAccountNumber, thirdPartyAccountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyCountryGeoCode() {
		return thirdPartyCountryGeoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyCountryGeoCode(String newThirdPartyCountryGeoCode) {
		String oldThirdPartyCountryGeoCode = thirdPartyCountryGeoCode;
		thirdPartyCountryGeoCode = newThirdPartyCountryGeoCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE, oldThirdPartyCountryGeoCode, thirdPartyCountryGeoCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyPostalCode() {
		return thirdPartyPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyPostalCode(String newThirdPartyPostalCode) {
		String oldThirdPartyPostalCode = thirdPartyPostalCode;
		thirdPartyPostalCode = newThirdPartyPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE, oldThirdPartyPostalCode, thirdPartyPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingDigest() {
		return trackingDigest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingDigest(String newTrackingDigest) {
		String oldTrackingDigest = trackingDigest;
		trackingDigest = newTrackingDigest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST, oldTrackingDigest, trackingDigest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingIdNumber() {
		return trackingIdNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingIdNumber(String newTrackingIdNumber) {
		String oldTrackingIdNumber = trackingIdNumber;
		trackingIdNumber = newTrackingIdNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER, oldTrackingIdNumber, trackingIdNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdatedByUserLoginId() {
		return updatedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedByUserLoginId(String newUpdatedByUserLoginId) {
		String oldUpdatedByUserLoginId = updatedByUserLoginId;
		updatedByUserLoginId = newUpdatedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID, oldUpdatedByUserLoginId, updatedByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getUpsHighValueReport() {
		return upsHighValueReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpsHighValueReport(byte[] newUpsHighValueReport) {
		byte[] oldUpsHighValueReport = upsHighValueReport;
		upsHighValueReport = newUpsHighValueReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT, oldUpsHighValueReport, upsHighValueReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID:
				return getShipmentId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID:
				return getShipmentRouteSegmentId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE:
				return getActualArrivalDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST:
				return getActualCost();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST:
				return getActualOtherCost();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST:
				return getActualServiceCost();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE:
				return getActualStartDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST:
				return getActualTransportCost();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT:
				return getBillingWeight();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE:
				return getCarrierDeliveryZone();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES:
				return getCarrierRestrictionCodes();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC:
				return getCarrierRestrictionDesc();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE:
				return getEstimatedArrivalDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE:
				return getEstimatedStartDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE:
				return getHomeDeliveryDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE:
				return getHomeDeliveryType();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE:
				return getLastUpdatedDate();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER:
				return getThirdPartyAccountNumber();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE:
				return getThirdPartyCountryGeoCode();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE:
				return getThirdPartyPostalCode();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST:
				return getTrackingDigest();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER:
				return getTrackingIdNumber();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID:
				return getUpdatedByUserLoginId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT:
				return getUpsHighValueReport();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID:
				if (resolve) return getDeliveryId();
				return basicGetDeliveryId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID:
				if (resolve) return getCarrierPartyId();
				return basicGetCarrierPartyId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID:
				if (resolve) return getShipmentMethodTypeId();
				return basicGetShipmentMethodTypeId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID:
				if (resolve) return getOriginFacilityId();
				return basicGetOriginFacilityId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID:
				if (resolve) return getDestFacilityId();
				return basicGetDestFacilityId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID:
				if (resolve) return getOriginContactMechId();
				return basicGetOriginContactMechId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID:
				if (resolve) return getOriginTelecomNumberId();
				return basicGetOriginTelecomNumberId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID:
				if (resolve) return getDestContactMechId();
				return basicGetDestContactMechId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID:
				if (resolve) return getDestTelecomNumberId();
				return basicGetDestTelecomNumberId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID:
				if (resolve) return getCarrierServiceStatusId();
				return basicGetCarrierServiceStatusId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID:
				if (resolve) return getBillingWeightUomId();
				return basicGetBillingWeightUomId();
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
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID:
				setShipmentRouteSegmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE:
				setActualArrivalDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST:
				setActualCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST:
				setActualOtherCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST:
				setActualServiceCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE:
				setActualStartDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST:
				setActualTransportCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT:
				setBillingWeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE:
				setCarrierDeliveryZone((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES:
				setCarrierRestrictionCodes((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC:
				setCarrierRestrictionDesc((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE:
				setEstimatedStartDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE:
				setHomeDeliveryDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE:
				setHomeDeliveryType((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE:
				setLastUpdatedDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER:
				setThirdPartyAccountNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE:
				setThirdPartyCountryGeoCode((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE:
				setThirdPartyPostalCode((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST:
				setTrackingDigest((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER:
				setTrackingIdNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID:
				setUpdatedByUserLoginId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT:
				setUpsHighValueReport((byte[])newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID:
				setDeliveryId((Delivery)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID:
				setCarrierPartyId((PartyGroup)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID:
				setDestFacilityId((Facility)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((PostalAddress)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId((TelecomNumber)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID:
				setDestContactMechId((PostalAddress)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID:
				setDestTelecomNumberId((TelecomNumber)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID:
				setCarrierServiceStatusId((StatusItem)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID:
				setBillingWeightUomId((Uom)newValue);
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
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID:
				setShipmentRouteSegmentId(SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE:
				setActualArrivalDate(ACTUAL_ARRIVAL_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST:
				setActualOtherCost(ACTUAL_OTHER_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST:
				setActualServiceCost(ACTUAL_SERVICE_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE:
				setActualStartDate(ACTUAL_START_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST:
				setActualTransportCost(ACTUAL_TRANSPORT_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT:
				setBillingWeight(BILLING_WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE:
				setCarrierDeliveryZone(CARRIER_DELIVERY_ZONE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES:
				setCarrierRestrictionCodes(CARRIER_RESTRICTION_CODES_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC:
				setCarrierRestrictionDesc(CARRIER_RESTRICTION_DESC_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate(ESTIMATED_ARRIVAL_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE:
				setEstimatedStartDate(ESTIMATED_START_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE:
				setHomeDeliveryDate(HOME_DELIVERY_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE:
				setHomeDeliveryType(HOME_DELIVERY_TYPE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE:
				setLastUpdatedDate(LAST_UPDATED_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER:
				setThirdPartyAccountNumber(THIRD_PARTY_ACCOUNT_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE:
				setThirdPartyCountryGeoCode(THIRD_PARTY_COUNTRY_GEO_CODE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE:
				setThirdPartyPostalCode(THIRD_PARTY_POSTAL_CODE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST:
				setTrackingDigest(TRACKING_DIGEST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER:
				setTrackingIdNumber(TRACKING_ID_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID:
				setUpdatedByUserLoginId(UPDATED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT:
				setUpsHighValueReport(UPS_HIGH_VALUE_REPORT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID:
				setDeliveryId((Delivery)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID:
				setCarrierPartyId((PartyGroup)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID:
				setDestFacilityId((Facility)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((PostalAddress)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId((TelecomNumber)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID:
				setDestContactMechId((PostalAddress)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID:
				setDestTelecomNumberId((TelecomNumber)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID:
				setCarrierServiceStatusId((StatusItem)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID:
				setBillingWeightUomId((Uom)null);
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
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID:
				return SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT == null ? shipmentRouteSegmentId != null : !SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT.equals(shipmentRouteSegmentId);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE:
				return ACTUAL_ARRIVAL_DATE_EDEFAULT == null ? actualArrivalDate != null : !ACTUAL_ARRIVAL_DATE_EDEFAULT.equals(actualArrivalDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST:
				return ACTUAL_COST_EDEFAULT == null ? actualCost != null : !ACTUAL_COST_EDEFAULT.equals(actualCost);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST:
				return ACTUAL_OTHER_COST_EDEFAULT == null ? actualOtherCost != null : !ACTUAL_OTHER_COST_EDEFAULT.equals(actualOtherCost);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST:
				return ACTUAL_SERVICE_COST_EDEFAULT == null ? actualServiceCost != null : !ACTUAL_SERVICE_COST_EDEFAULT.equals(actualServiceCost);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE:
				return ACTUAL_START_DATE_EDEFAULT == null ? actualStartDate != null : !ACTUAL_START_DATE_EDEFAULT.equals(actualStartDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST:
				return ACTUAL_TRANSPORT_COST_EDEFAULT == null ? actualTransportCost != null : !ACTUAL_TRANSPORT_COST_EDEFAULT.equals(actualTransportCost);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT:
				return BILLING_WEIGHT_EDEFAULT == null ? billingWeight != null : !BILLING_WEIGHT_EDEFAULT.equals(billingWeight);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE:
				return CARRIER_DELIVERY_ZONE_EDEFAULT == null ? carrierDeliveryZone != null : !CARRIER_DELIVERY_ZONE_EDEFAULT.equals(carrierDeliveryZone);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES:
				return CARRIER_RESTRICTION_CODES_EDEFAULT == null ? carrierRestrictionCodes != null : !CARRIER_RESTRICTION_CODES_EDEFAULT.equals(carrierRestrictionCodes);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC:
				return CARRIER_RESTRICTION_DESC_EDEFAULT == null ? carrierRestrictionDesc != null : !CARRIER_RESTRICTION_DESC_EDEFAULT.equals(carrierRestrictionDesc);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE:
				return ESTIMATED_ARRIVAL_DATE_EDEFAULT == null ? estimatedArrivalDate != null : !ESTIMATED_ARRIVAL_DATE_EDEFAULT.equals(estimatedArrivalDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE:
				return ESTIMATED_START_DATE_EDEFAULT == null ? estimatedStartDate != null : !ESTIMATED_START_DATE_EDEFAULT.equals(estimatedStartDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE:
				return HOME_DELIVERY_DATE_EDEFAULT == null ? homeDeliveryDate != null : !HOME_DELIVERY_DATE_EDEFAULT.equals(homeDeliveryDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE:
				return HOME_DELIVERY_TYPE_EDEFAULT == null ? homeDeliveryType != null : !HOME_DELIVERY_TYPE_EDEFAULT.equals(homeDeliveryType);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE:
				return LAST_UPDATED_DATE_EDEFAULT == null ? lastUpdatedDate != null : !LAST_UPDATED_DATE_EDEFAULT.equals(lastUpdatedDate);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER:
				return THIRD_PARTY_ACCOUNT_NUMBER_EDEFAULT == null ? thirdPartyAccountNumber != null : !THIRD_PARTY_ACCOUNT_NUMBER_EDEFAULT.equals(thirdPartyAccountNumber);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE:
				return THIRD_PARTY_COUNTRY_GEO_CODE_EDEFAULT == null ? thirdPartyCountryGeoCode != null : !THIRD_PARTY_COUNTRY_GEO_CODE_EDEFAULT.equals(thirdPartyCountryGeoCode);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE:
				return THIRD_PARTY_POSTAL_CODE_EDEFAULT == null ? thirdPartyPostalCode != null : !THIRD_PARTY_POSTAL_CODE_EDEFAULT.equals(thirdPartyPostalCode);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST:
				return TRACKING_DIGEST_EDEFAULT == null ? trackingDigest != null : !TRACKING_DIGEST_EDEFAULT.equals(trackingDigest);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER:
				return TRACKING_ID_NUMBER_EDEFAULT == null ? trackingIdNumber != null : !TRACKING_ID_NUMBER_EDEFAULT.equals(trackingIdNumber);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID:
				return UPDATED_BY_USER_LOGIN_ID_EDEFAULT == null ? updatedByUserLoginId != null : !UPDATED_BY_USER_LOGIN_ID_EDEFAULT.equals(updatedByUserLoginId);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT:
				return UPS_HIGH_VALUE_REPORT_EDEFAULT == null ? upsHighValueReport != null : !UPS_HIGH_VALUE_REPORT_EDEFAULT.equals(upsHighValueReport);
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID:
				return deliveryId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID:
				return carrierPartyId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID:
				return shipmentMethodTypeId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID:
				return originFacilityId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID:
				return destFacilityId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID:
				return originContactMechId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID:
				return originTelecomNumberId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID:
				return destContactMechId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID:
				return destTelecomNumberId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID:
				return carrierServiceStatusId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID:
				return billingWeightUomId != null;
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
		result.append(" (shipmentId: ");
		result.append(shipmentId);
		result.append(", shipmentRouteSegmentId: ");
		result.append(shipmentRouteSegmentId);
		result.append(", actualArrivalDate: ");
		result.append(actualArrivalDate);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", actualOtherCost: ");
		result.append(actualOtherCost);
		result.append(", actualServiceCost: ");
		result.append(actualServiceCost);
		result.append(", actualStartDate: ");
		result.append(actualStartDate);
		result.append(", actualTransportCost: ");
		result.append(actualTransportCost);
		result.append(", billingWeight: ");
		result.append(billingWeight);
		result.append(", carrierDeliveryZone: ");
		result.append(carrierDeliveryZone);
		result.append(", carrierRestrictionCodes: ");
		result.append(carrierRestrictionCodes);
		result.append(", carrierRestrictionDesc: ");
		result.append(carrierRestrictionDesc);
		result.append(", estimatedArrivalDate: ");
		result.append(estimatedArrivalDate);
		result.append(", estimatedStartDate: ");
		result.append(estimatedStartDate);
		result.append(", homeDeliveryDate: ");
		result.append(homeDeliveryDate);
		result.append(", homeDeliveryType: ");
		result.append(homeDeliveryType);
		result.append(", lastUpdatedDate: ");
		result.append(lastUpdatedDate);
		result.append(", thirdPartyAccountNumber: ");
		result.append(thirdPartyAccountNumber);
		result.append(", thirdPartyCountryGeoCode: ");
		result.append(thirdPartyCountryGeoCode);
		result.append(", thirdPartyPostalCode: ");
		result.append(thirdPartyPostalCode);
		result.append(", trackingDigest: ");
		result.append(trackingDigest);
		result.append(", trackingIdNumber: ");
		result.append(trackingIdNumber);
		result.append(", updatedByUserLoginId: ");
		result.append(updatedByUserLoginId);
		result.append(", upsHighValueReport: ");
		result.append(upsHighValueReport);
		result.append(')');
		return result.toString();
	}

} //ShipmentRouteSegmentImpl
