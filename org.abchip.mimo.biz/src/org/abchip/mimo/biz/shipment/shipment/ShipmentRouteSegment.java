/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Route Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualOtherCost <em>Actual Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualServiceCost <em>Actual Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualTransportCost <em>Actual Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeight <em>Billing Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeightUomId <em>Billing Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatusId <em>Carrier Service Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDeliveryId <em>Delivery Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestContactMechId <em>Dest Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestFacilityId <em>Dest Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumberId <em>Dest Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate <em>Home Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType <em>Home Delivery Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber <em>Third Party Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode <em>Third Party Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingDigest <em>Tracking Digest</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber <em>Tracking Id Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport <em>Ups High Value Report</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment()
 * @model
 * @generated
 */
public interface ShipmentRouteSegment extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Actual Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Arrival Date</em>' attribute.
	 * @see #setActualArrivalDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualArrivalDate()
	 * @model
	 * @generated
	 */
	Date getActualArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Arrival Date</em>' attribute.
	 * @see #getActualArrivalDate()
	 * @generated
	 */
	void setActualArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Other Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Other Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Other Cost</em>' attribute.
	 * @see #setActualOtherCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualOtherCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualOtherCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualOtherCost <em>Actual Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Other Cost</em>' attribute.
	 * @see #getActualOtherCost()
	 * @generated
	 */
	void setActualOtherCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Service Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Service Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Service Cost</em>' attribute.
	 * @see #setActualServiceCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualServiceCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualServiceCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualServiceCost <em>Actual Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Service Cost</em>' attribute.
	 * @see #getActualServiceCost()
	 * @generated
	 */
	void setActualServiceCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start Date</em>' attribute.
	 * @see #setActualStartDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualStartDate()
	 * @model
	 * @generated
	 */
	Date getActualStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualStartDate <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start Date</em>' attribute.
	 * @see #getActualStartDate()
	 * @generated
	 */
	void setActualStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Transport Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Transport Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Transport Cost</em>' attribute.
	 * @see #setActualTransportCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualTransportCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualTransportCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualTransportCost <em>Actual Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Transport Cost</em>' attribute.
	 * @see #getActualTransportCost()
	 * @generated
	 */
	void setActualTransportCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Billing Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Weight</em>' attribute.
	 * @see #setBillingWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_BillingWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBillingWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeight <em>Billing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Weight</em>' attribute.
	 * @see #getBillingWeight()
	 * @generated
	 */
	void setBillingWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Billing Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Weight Uom Id</em>' reference.
	 * @see #setBillingWeightUomId(Uom)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_BillingWeightUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getBillingWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeightUomId <em>Billing Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Weight Uom Id</em>' reference.
	 * @see #getBillingWeightUomId()
	 * @generated
	 */
	void setBillingWeightUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Carrier Delivery Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Delivery Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Delivery Zone</em>' attribute.
	 * @see #setCarrierDeliveryZone(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierDeliveryZone()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCarrierDeliveryZone();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Delivery Zone</em>' attribute.
	 * @see #getCarrierDeliveryZone()
	 * @generated
	 */
	void setCarrierDeliveryZone(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' reference.
	 * @see #setCarrierPartyId(Party)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierPartyId <em>Carrier Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' reference.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Carrier Restriction Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Restriction Codes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Restriction Codes</em>' attribute.
	 * @see #setCarrierRestrictionCodes(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierRestrictionCodes()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCarrierRestrictionCodes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Restriction Codes</em>' attribute.
	 * @see #getCarrierRestrictionCodes()
	 * @generated
	 */
	void setCarrierRestrictionCodes(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Restriction Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Restriction Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Restriction Desc</em>' attribute.
	 * @see #setCarrierRestrictionDesc(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierRestrictionDesc()
	 * @model
	 * @generated
	 */
	String getCarrierRestrictionDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Restriction Desc</em>' attribute.
	 * @see #getCarrierRestrictionDesc()
	 * @generated
	 */
	void setCarrierRestrictionDesc(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Service Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Service Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Service Status Id</em>' reference.
	 * @see #setCarrierServiceStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierServiceStatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getCarrierServiceStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatusId <em>Carrier Service Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Service Status Id</em>' reference.
	 * @see #getCarrierServiceStatusId()
	 * @generated
	 */
	void setCarrierServiceStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Delivery Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Id</em>' reference.
	 * @see #setDeliveryId(Delivery)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DeliveryId()
	 * @model keys="deliveryId"
	 * @generated
	 */
	Delivery getDeliveryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDeliveryId <em>Delivery Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Id</em>' reference.
	 * @see #getDeliveryId()
	 * @generated
	 */
	void setDeliveryId(Delivery value);

	/**
	 * Returns the value of the '<em><b>Dest Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Contact Mech Id</em>' reference.
	 * @see #setDestContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getDestContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestContactMechId <em>Dest Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Contact Mech Id</em>' reference.
	 * @see #getDestContactMechId()
	 * @generated
	 */
	void setDestContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Dest Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Facility Id</em>' reference.
	 * @see #setDestFacilityId(Facility)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getDestFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestFacilityId <em>Dest Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Facility Id</em>' reference.
	 * @see #getDestFacilityId()
	 * @generated
	 */
	void setDestFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Dest Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Telecom Number Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Telecom Number Id</em>' reference.
	 * @see #setDestTelecomNumberId(TelecomNumber)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestTelecomNumberId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getDestTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumberId <em>Dest Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Telecom Number Id</em>' reference.
	 * @see #getDestTelecomNumberId()
	 * @generated
	 */
	void setDestTelecomNumberId(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #setEstimatedArrivalDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 */
	void setEstimatedArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #setEstimatedStartDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_EstimatedStartDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #getEstimatedStartDate()
	 * @generated
	 */
	void setEstimatedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Home Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Delivery Date</em>' attribute.
	 * @see #setHomeDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_HomeDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getHomeDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate <em>Home Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Delivery Date</em>' attribute.
	 * @see #getHomeDeliveryDate()
	 * @generated
	 */
	void setHomeDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Home Delivery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Delivery Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Delivery Type</em>' attribute.
	 * @see #setHomeDeliveryType(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_HomeDeliveryType()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getHomeDeliveryType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType <em>Home Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Delivery Type</em>' attribute.
	 * @see #getHomeDeliveryType()
	 * @generated
	 */
	void setHomeDeliveryType(String value);

	/**
	 * Returns the value of the '<em><b>Last Updated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated Date</em>' attribute.
	 * @see #setLastUpdatedDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_LastUpdatedDate()
	 * @model
	 * @generated
	 */
	Date getLastUpdatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate <em>Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated Date</em>' attribute.
	 * @see #getLastUpdatedDate()
	 * @generated
	 */
	void setLastUpdatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Origin Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech Id</em>' reference.
	 * @see #setOriginContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getOriginContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginContactMechId <em>Origin Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech Id</em>' reference.
	 * @see #getOriginContactMechId()
	 * @generated
	 */
	void setOriginContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Origin Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Facility Id</em>' reference.
	 * @see #setOriginFacilityId(Facility)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getOriginFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginFacilityId <em>Origin Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility Id</em>' reference.
	 * @see #getOriginFacilityId()
	 * @generated
	 */
	void setOriginFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Origin Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Telecom Number Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Telecom Number Id</em>' reference.
	 * @see #setOriginTelecomNumberId(TelecomNumber)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginTelecomNumberId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getOriginTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Telecom Number Id</em>' reference.
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 */
	void setOriginTelecomNumberId(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' reference.
	 * @see #setShipmentId(Shipment)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ShipmentId()
	 * @model keys="shipmentId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Shipment getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentId <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' reference.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(Shipment value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' reference.
	 * @see #setShipmentMethodTypeId(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ShipmentMethodTypeId()
	 * @model keys="shipmentMethodTypeId"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' reference.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Shipment Route Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Route Segment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #setShipmentRouteSegmentId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ShipmentRouteSegmentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentRouteSegmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 */
	void setShipmentRouteSegmentId(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Account Number</em>' attribute.
	 * @see #setThirdPartyAccountNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyAccountNumber()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyAccountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber <em>Third Party Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Account Number</em>' attribute.
	 * @see #getThirdPartyAccountNumber()
	 * @generated
	 */
	void setThirdPartyAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Country Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Country Geo Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Country Geo Code</em>' attribute.
	 * @see #setThirdPartyCountryGeoCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyCountryGeoCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyCountryGeoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Country Geo Code</em>' attribute.
	 * @see #getThirdPartyCountryGeoCode()
	 * @generated
	 */
	void setThirdPartyCountryGeoCode(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Postal Code</em>' attribute.
	 * @see #setThirdPartyPostalCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyPostalCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode <em>Third Party Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Postal Code</em>' attribute.
	 * @see #getThirdPartyPostalCode()
	 * @generated
	 */
	void setThirdPartyPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Digest</em>' attribute.
	 * @see #setTrackingDigest(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_TrackingDigest()
	 * @model
	 * @generated
	 */
	String getTrackingDigest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingDigest <em>Tracking Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Digest</em>' attribute.
	 * @see #getTrackingDigest()
	 * @generated
	 */
	void setTrackingDigest(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Id Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Id Number</em>' attribute.
	 * @see #setTrackingIdNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_TrackingIdNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTrackingIdNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber <em>Tracking Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Id Number</em>' attribute.
	 * @see #getTrackingIdNumber()
	 * @generated
	 */
	void setTrackingIdNumber(String value);

	/**
	 * Returns the value of the '<em><b>Updated By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated By User Login Id</em>' attribute.
	 * @see #setUpdatedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_UpdatedByUserLoginId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUpdatedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated By User Login Id</em>' attribute.
	 * @see #getUpdatedByUserLoginId()
	 * @generated
	 */
	void setUpdatedByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Ups High Value Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ups High Value Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ups High Value Report</em>' attribute.
	 * @see #setUpsHighValueReport(byte[])
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentRouteSegment_UpsHighValueReport()
	 * @model
	 * @generated
	 */
	byte[] getUpsHighValueReport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport <em>Ups High Value Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ups High Value Report</em>' attribute.
	 * @see #getUpsHighValueReport()
	 * @generated
	 */
	void setUpsHighValueReport(byte[] value);

} // ShipmentRouteSegment
