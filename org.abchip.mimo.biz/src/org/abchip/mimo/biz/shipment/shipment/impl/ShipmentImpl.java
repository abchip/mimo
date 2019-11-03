/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationContactMechId <em>Destination Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipCost <em>Estimated Ship Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLatestCancelDate <em>Latest Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryOrderId <em>Primary Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryReturnId <em>Primary Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentAttributes <em>Shipment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentContactMechs <em>Shipment Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentItems <em>Shipment Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentPackages <em>Shipment Packages</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentRouteSegments <em>Shipment Route Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentImpl extends BizEntityTypedImpl<ShipmentType> implements Shipment {
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
	 * The default value of the '{@link #getAdditionalShippingCharge() <em>Additional Shipping Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalShippingCharge()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADDITIONAL_SHIPPING_CHARGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalShippingCharge() <em>Additional Shipping Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalShippingCharge()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal additionalShippingCharge = ADDITIONAL_SHIPPING_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddtlShippingChargeDesc() <em>Addtl Shipping Charge Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddtlShippingChargeDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDTL_SHIPPING_CHARGE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddtlShippingChargeDesc() <em>Addtl Shipping Charge Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddtlShippingChargeDesc()
	 * @generated
	 * @ordered
	 */
	protected String addtlShippingChargeDesc = ADDTL_SHIPPING_CHARGE_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationContactMechId() <em>Destination Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationContactMechId() <em>Destination Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String destinationContactMechId = DESTINATION_CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String destinationFacilityId = DESTINATION_FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationTelecomNumberId() <em>Destination Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_TELECOM_NUMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationTelecomNumberId() <em>Destination Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected String destinationTelecomNumberId = DESTINATION_TELECOM_NUMBER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEstimatedArrivalWorkEffId() <em>Estimated Arrival Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATED_ARRIVAL_WORK_EFF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalWorkEffId() <em>Estimated Arrival Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected String estimatedArrivalWorkEffId = ESTIMATED_ARRIVAL_WORK_EFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedReadyDate() <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedReadyDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_READY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedReadyDate() <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedReadyDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedReadyDate = ESTIMATED_READY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedShipCost() <em>Estimated Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_SHIP_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedShipCost() <em>Estimated Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedShipCost = ESTIMATED_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedShipDate = ESTIMATED_SHIP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedShipWorkEffId() <em>Estimated Ship Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATED_SHIP_WORK_EFF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedShipWorkEffId() <em>Estimated Ship Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected String estimatedShipWorkEffId = ESTIMATED_SHIP_WORK_EFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlingInstructions() <em>Handling Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLING_INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlingInstructions() <em>Handling Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingInstructions()
	 * @generated
	 * @ordered
	 */
	protected String handlingInstructions = HANDLING_INSTRUCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestCancelDate() <em>Latest Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestCancelDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LATEST_CANCEL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestCancelDate() <em>Latest Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestCancelDate()
	 * @generated
	 * @ordered
	 */
	protected Date latestCancelDate = LATEST_CANCEL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String originContactMechId = ORIGIN_CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginFacilityId() <em>Origin Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginFacilityId() <em>Origin Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String originFacilityId = ORIGIN_FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginTelecomNumberId() <em>Origin Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_TELECOM_NUMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginTelecomNumberId() <em>Origin Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected String originTelecomNumberId = ORIGIN_TELECOM_NUMBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected static final String PICKLIST_BIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected String picklistBinId = PICKLIST_BIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOrderId() <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOrderId() <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOrderId()
	 * @generated
	 * @ordered
	 */
	protected String primaryOrderId = PRIMARY_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryReturnId() <em>Primary Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryReturnId() <em>Primary Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReturnId()
	 * @generated
	 * @ordered
	 */
	protected String primaryReturnId = PRIMARY_RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryShipGroupSeqId() <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryShipGroupSeqId() <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String primaryShipGroupSeqId = PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentTypeId() <em>Shipment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentTypeId() <em>Shipment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentTypeId = SHIPMENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipmentAttributes() <em>Shipment Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentAttributes;

	/**
	 * The cached value of the '{@link #getShipmentContactMechs() <em>Shipment Contact Mechs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentContactMechs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentContactMechs;

	/**
	 * The cached value of the '{@link #getShipmentItems() <em>Shipment Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentItems;

	/**
	 * The cached value of the '{@link #getShipmentPackages() <em>Shipment Packages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentPackages;

	/**
	 * The cached value of the '{@link #getShipmentRouteSegments() <em>Shipment Route Segments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRouteSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentRouteSegments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAdditionalShippingCharge() {
		return additionalShippingCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalShippingCharge(BigDecimal newAdditionalShippingCharge) {
		BigDecimal oldAdditionalShippingCharge = additionalShippingCharge;
		additionalShippingCharge = newAdditionalShippingCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE, oldAdditionalShippingCharge, additionalShippingCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddtlShippingChargeDesc() {
		return addtlShippingChargeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddtlShippingChargeDesc(String newAddtlShippingChargeDesc) {
		String oldAddtlShippingChargeDesc = addtlShippingChargeDesc;
		addtlShippingChargeDesc = newAddtlShippingChargeDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC, oldAddtlShippingChargeDesc, addtlShippingChargeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationContactMechId() {
		return destinationContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationContactMechId(String newDestinationContactMechId) {
		String oldDestinationContactMechId = destinationContactMechId;
		destinationContactMechId = newDestinationContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID, oldDestinationContactMechId, destinationContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationFacilityId() {
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(String newDestinationFacilityId) {
		String oldDestinationFacilityId = destinationFacilityId;
		destinationFacilityId = newDestinationFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID, oldDestinationFacilityId, destinationFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationTelecomNumberId() {
		return destinationTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationTelecomNumberId(String newDestinationTelecomNumberId) {
		String oldDestinationTelecomNumberId = destinationTelecomNumberId;
		destinationTelecomNumberId = newDestinationTelecomNumberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID, oldDestinationTelecomNumberId, destinationTelecomNumberId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE, oldEstimatedArrivalDate, estimatedArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstimatedArrivalWorkEffId() {
		return estimatedArrivalWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalWorkEffId(String newEstimatedArrivalWorkEffId) {
		String oldEstimatedArrivalWorkEffId = estimatedArrivalWorkEffId;
		estimatedArrivalWorkEffId = newEstimatedArrivalWorkEffId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID, oldEstimatedArrivalWorkEffId, estimatedArrivalWorkEffId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedReadyDate() {
		return estimatedReadyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedReadyDate(Date newEstimatedReadyDate) {
		Date oldEstimatedReadyDate = estimatedReadyDate;
		estimatedReadyDate = newEstimatedReadyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE, oldEstimatedReadyDate, estimatedReadyDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedShipCost() {
		return estimatedShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipCost(BigDecimal newEstimatedShipCost) {
		BigDecimal oldEstimatedShipCost = estimatedShipCost;
		estimatedShipCost = newEstimatedShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST, oldEstimatedShipCost, estimatedShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		Date oldEstimatedShipDate = estimatedShipDate;
		estimatedShipDate = newEstimatedShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE, oldEstimatedShipDate, estimatedShipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstimatedShipWorkEffId() {
		return estimatedShipWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipWorkEffId(String newEstimatedShipWorkEffId) {
		String oldEstimatedShipWorkEffId = estimatedShipWorkEffId;
		estimatedShipWorkEffId = newEstimatedShipWorkEffId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID, oldEstimatedShipWorkEffId, estimatedShipWorkEffId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandlingInstructions() {
		return handlingInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandlingInstructions(String newHandlingInstructions) {
		String oldHandlingInstructions = handlingInstructions;
		handlingInstructions = newHandlingInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS, oldHandlingInstructions, handlingInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLatestCancelDate() {
		return latestCancelDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestCancelDate(Date newLatestCancelDate) {
		Date oldLatestCancelDate = latestCancelDate;
		latestCancelDate = newLatestCancelDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE, oldLatestCancelDate, latestCancelDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginContactMechId() {
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(String newOriginContactMechId) {
		String oldOriginContactMechId = originContactMechId;
		originContactMechId = newOriginContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID, oldOriginContactMechId, originContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginFacilityId() {
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(String newOriginFacilityId) {
		String oldOriginFacilityId = originFacilityId;
		originFacilityId = newOriginFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID, oldOriginFacilityId, originFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginTelecomNumberId() {
		return originTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginTelecomNumberId(String newOriginTelecomNumberId) {
		String oldOriginTelecomNumberId = originTelecomNumberId;
		originTelecomNumberId = newOriginTelecomNumberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID, oldOriginTelecomNumberId, originTelecomNumberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicklistBinId() {
		return picklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistBinId(String newPicklistBinId) {
		String oldPicklistBinId = picklistBinId;
		picklistBinId = newPicklistBinId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PICKLIST_BIN_ID, oldPicklistBinId, picklistBinId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOrderId() {
		return primaryOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOrderId(String newPrimaryOrderId) {
		String oldPrimaryOrderId = primaryOrderId;
		primaryOrderId = newPrimaryOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID, oldPrimaryOrderId, primaryOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryReturnId() {
		return primaryReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryReturnId(String newPrimaryReturnId) {
		String oldPrimaryReturnId = primaryReturnId;
		primaryReturnId = newPrimaryReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID, oldPrimaryReturnId, primaryReturnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryShipGroupSeqId() {
		return primaryShipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryShipGroupSeqId(String newPrimaryShipGroupSeqId) {
		String oldPrimaryShipGroupSeqId = primaryShipGroupSeqId;
		primaryShipGroupSeqId = newPrimaryShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID, oldPrimaryShipGroupSeqId, primaryShipGroupSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__SHIPMENT_ID, oldShipmentId, shipmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentTypeId() {
		return shipmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentTypeId(String newShipmentTypeId) {
		String oldShipmentTypeId = shipmentTypeId;
		shipmentTypeId = newShipmentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID, oldShipmentTypeId, shipmentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentAttributes() {
		if (shipmentAttributes == null) {
			shipmentAttributes = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT__SHIPMENT_ATTRIBUTES);
		}
		return shipmentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentContactMechs() {
		if (shipmentContactMechs == null) {
			shipmentContactMechs = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT__SHIPMENT_CONTACT_MECHS);
		}
		return shipmentContactMechs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentItems() {
		if (shipmentItems == null) {
			shipmentItems = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT__SHIPMENT_ITEMS);
		}
		return shipmentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentPackages() {
		if (shipmentPackages == null) {
			shipmentPackages = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT__SHIPMENT_PACKAGES);
		}
		return shipmentPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentRouteSegments() {
		if (shipmentRouteSegments == null) {
			shipmentRouteSegments = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS);
		}
		return shipmentRouteSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> itemIssuances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentReceipts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT__SHIPMENT_ID:
				return getShipmentId();
			case Shipment_Package.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE:
				return getAdditionalShippingCharge();
			case Shipment_Package.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC:
				return getAddtlShippingChargeDesc();
			case Shipment_Package.SHIPMENT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case Shipment_Package.SHIPMENT__CREATED_DATE:
				return getCreatedDate();
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				return getDestinationContactMechId();
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				return getDestinationFacilityId();
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				return getDestinationTelecomNumberId();
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				return getEstimatedArrivalDate();
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				return getEstimatedArrivalWorkEffId();
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				return getEstimatedReadyDate();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				return getEstimatedShipCost();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				return getEstimatedShipDate();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				return getEstimatedShipWorkEffId();
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				return getHandlingInstructions();
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				return getLatestCancelDate();
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				return getOriginContactMechId();
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				return getOriginFacilityId();
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				return getOriginTelecomNumberId();
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				return getPartyIdFrom();
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				return getPartyIdTo();
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				return getPicklistBinId();
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				return getPrimaryOrderId();
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				return getPrimaryReturnId();
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				return getPrimaryShipGroupSeqId();
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				return getShipmentTypeId();
			case Shipment_Package.SHIPMENT__STATUS_ID:
				return getStatusId();
			case Shipment_Package.SHIPMENT__SHIPMENT_ATTRIBUTES:
				return getShipmentAttributes();
			case Shipment_Package.SHIPMENT__SHIPMENT_CONTACT_MECHS:
				return getShipmentContactMechs();
			case Shipment_Package.SHIPMENT__SHIPMENT_ITEMS:
				return getShipmentItems();
			case Shipment_Package.SHIPMENT__SHIPMENT_PACKAGES:
				return getShipmentPackages();
			case Shipment_Package.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS:
				return getShipmentRouteSegments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE:
				setAdditionalShippingCharge((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC:
				setAddtlShippingChargeDesc((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				setDestinationContactMechId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				setDestinationTelecomNumberId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				setEstimatedArrivalWorkEffId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				setEstimatedReadyDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				setEstimatedShipCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				setEstimatedShipWorkEffId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				setHandlingInstructions((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				setLatestCancelDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				setPicklistBinId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				setPrimaryOrderId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				setPrimaryReturnId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				setShipmentTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ATTRIBUTES:
				getShipmentAttributes().clear();
				getShipmentAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_CONTACT_MECHS:
				getShipmentContactMechs().clear();
				getShipmentContactMechs().addAll((Collection<? extends String>)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ITEMS:
				getShipmentItems().clear();
				getShipmentItems().addAll((Collection<? extends String>)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_PACKAGES:
				getShipmentPackages().clear();
				getShipmentPackages().addAll((Collection<? extends String>)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS:
				getShipmentRouteSegments().clear();
				getShipmentRouteSegments().addAll((Collection<? extends String>)newValue);
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
			case Shipment_Package.SHIPMENT__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE:
				setAdditionalShippingCharge(ADDITIONAL_SHIPPING_CHARGE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC:
				setAddtlShippingChargeDesc(ADDTL_SHIPPING_CHARGE_DESC_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				setDestinationContactMechId(DESTINATION_CONTACT_MECH_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				setDestinationFacilityId(DESTINATION_FACILITY_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				setDestinationTelecomNumberId(DESTINATION_TELECOM_NUMBER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate(ESTIMATED_ARRIVAL_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				setEstimatedArrivalWorkEffId(ESTIMATED_ARRIVAL_WORK_EFF_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				setEstimatedReadyDate(ESTIMATED_READY_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				setEstimatedShipCost(ESTIMATED_SHIP_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate(ESTIMATED_SHIP_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				setEstimatedShipWorkEffId(ESTIMATED_SHIP_WORK_EFF_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				setHandlingInstructions(HANDLING_INSTRUCTIONS_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				setLatestCancelDate(LATEST_CANCEL_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId(ORIGIN_CONTACT_MECH_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId(ORIGIN_FACILITY_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId(ORIGIN_TELECOM_NUMBER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				setPicklistBinId(PICKLIST_BIN_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				setPrimaryOrderId(PRIMARY_ORDER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				setPrimaryReturnId(PRIMARY_RETURN_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId(PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				setShipmentTypeId(SHIPMENT_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ATTRIBUTES:
				getShipmentAttributes().clear();
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_CONTACT_MECHS:
				getShipmentContactMechs().clear();
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ITEMS:
				getShipmentItems().clear();
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_PACKAGES:
				getShipmentPackages().clear();
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS:
				getShipmentRouteSegments().clear();
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
			case Shipment_Package.SHIPMENT__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case Shipment_Package.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE:
				return ADDITIONAL_SHIPPING_CHARGE_EDEFAULT == null ? additionalShippingCharge != null : !ADDITIONAL_SHIPPING_CHARGE_EDEFAULT.equals(additionalShippingCharge);
			case Shipment_Package.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC:
				return ADDTL_SHIPPING_CHARGE_DESC_EDEFAULT == null ? addtlShippingChargeDesc != null : !ADDTL_SHIPPING_CHARGE_DESC_EDEFAULT.equals(addtlShippingChargeDesc);
			case Shipment_Package.SHIPMENT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case Shipment_Package.SHIPMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				return DESTINATION_CONTACT_MECH_ID_EDEFAULT == null ? destinationContactMechId != null : !DESTINATION_CONTACT_MECH_ID_EDEFAULT.equals(destinationContactMechId);
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				return DESTINATION_FACILITY_ID_EDEFAULT == null ? destinationFacilityId != null : !DESTINATION_FACILITY_ID_EDEFAULT.equals(destinationFacilityId);
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				return DESTINATION_TELECOM_NUMBER_ID_EDEFAULT == null ? destinationTelecomNumberId != null : !DESTINATION_TELECOM_NUMBER_ID_EDEFAULT.equals(destinationTelecomNumberId);
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				return ESTIMATED_ARRIVAL_DATE_EDEFAULT == null ? estimatedArrivalDate != null : !ESTIMATED_ARRIVAL_DATE_EDEFAULT.equals(estimatedArrivalDate);
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				return ESTIMATED_ARRIVAL_WORK_EFF_ID_EDEFAULT == null ? estimatedArrivalWorkEffId != null : !ESTIMATED_ARRIVAL_WORK_EFF_ID_EDEFAULT.equals(estimatedArrivalWorkEffId);
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				return ESTIMATED_READY_DATE_EDEFAULT == null ? estimatedReadyDate != null : !ESTIMATED_READY_DATE_EDEFAULT.equals(estimatedReadyDate);
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				return ESTIMATED_SHIP_COST_EDEFAULT == null ? estimatedShipCost != null : !ESTIMATED_SHIP_COST_EDEFAULT.equals(estimatedShipCost);
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				return ESTIMATED_SHIP_DATE_EDEFAULT == null ? estimatedShipDate != null : !ESTIMATED_SHIP_DATE_EDEFAULT.equals(estimatedShipDate);
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				return ESTIMATED_SHIP_WORK_EFF_ID_EDEFAULT == null ? estimatedShipWorkEffId != null : !ESTIMATED_SHIP_WORK_EFF_ID_EDEFAULT.equals(estimatedShipWorkEffId);
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				return HANDLING_INSTRUCTIONS_EDEFAULT == null ? handlingInstructions != null : !HANDLING_INSTRUCTIONS_EDEFAULT.equals(handlingInstructions);
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				return LATEST_CANCEL_DATE_EDEFAULT == null ? latestCancelDate != null : !LATEST_CANCEL_DATE_EDEFAULT.equals(latestCancelDate);
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				return ORIGIN_CONTACT_MECH_ID_EDEFAULT == null ? originContactMechId != null : !ORIGIN_CONTACT_MECH_ID_EDEFAULT.equals(originContactMechId);
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				return ORIGIN_FACILITY_ID_EDEFAULT == null ? originFacilityId != null : !ORIGIN_FACILITY_ID_EDEFAULT.equals(originFacilityId);
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				return ORIGIN_TELECOM_NUMBER_ID_EDEFAULT == null ? originTelecomNumberId != null : !ORIGIN_TELECOM_NUMBER_ID_EDEFAULT.equals(originTelecomNumberId);
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				return PICKLIST_BIN_ID_EDEFAULT == null ? picklistBinId != null : !PICKLIST_BIN_ID_EDEFAULT.equals(picklistBinId);
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				return PRIMARY_ORDER_ID_EDEFAULT == null ? primaryOrderId != null : !PRIMARY_ORDER_ID_EDEFAULT.equals(primaryOrderId);
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				return PRIMARY_RETURN_ID_EDEFAULT == null ? primaryReturnId != null : !PRIMARY_RETURN_ID_EDEFAULT.equals(primaryReturnId);
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				return PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT == null ? primaryShipGroupSeqId != null : !PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT.equals(primaryShipGroupSeqId);
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				return SHIPMENT_TYPE_ID_EDEFAULT == null ? shipmentTypeId != null : !SHIPMENT_TYPE_ID_EDEFAULT.equals(shipmentTypeId);
			case Shipment_Package.SHIPMENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case Shipment_Package.SHIPMENT__SHIPMENT_ATTRIBUTES:
				return shipmentAttributes != null && !shipmentAttributes.isEmpty();
			case Shipment_Package.SHIPMENT__SHIPMENT_CONTACT_MECHS:
				return shipmentContactMechs != null && !shipmentContactMechs.isEmpty();
			case Shipment_Package.SHIPMENT__SHIPMENT_ITEMS:
				return shipmentItems != null && !shipmentItems.isEmpty();
			case Shipment_Package.SHIPMENT__SHIPMENT_PACKAGES:
				return shipmentPackages != null && !shipmentPackages.isEmpty();
			case Shipment_Package.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS:
				return shipmentRouteSegments != null && !shipmentRouteSegments.isEmpty();
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
		result.append(", additionalShippingCharge: ");
		result.append(additionalShippingCharge);
		result.append(", addtlShippingChargeDesc: ");
		result.append(addtlShippingChargeDesc);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", destinationContactMechId: ");
		result.append(destinationContactMechId);
		result.append(", destinationFacilityId: ");
		result.append(destinationFacilityId);
		result.append(", destinationTelecomNumberId: ");
		result.append(destinationTelecomNumberId);
		result.append(", estimatedArrivalDate: ");
		result.append(estimatedArrivalDate);
		result.append(", estimatedArrivalWorkEffId: ");
		result.append(estimatedArrivalWorkEffId);
		result.append(", estimatedReadyDate: ");
		result.append(estimatedReadyDate);
		result.append(", estimatedShipCost: ");
		result.append(estimatedShipCost);
		result.append(", estimatedShipDate: ");
		result.append(estimatedShipDate);
		result.append(", estimatedShipWorkEffId: ");
		result.append(estimatedShipWorkEffId);
		result.append(", handlingInstructions: ");
		result.append(handlingInstructions);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", latestCancelDate: ");
		result.append(latestCancelDate);
		result.append(", originContactMechId: ");
		result.append(originContactMechId);
		result.append(", originFacilityId: ");
		result.append(originFacilityId);
		result.append(", originTelecomNumberId: ");
		result.append(originTelecomNumberId);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", picklistBinId: ");
		result.append(picklistBinId);
		result.append(", primaryOrderId: ");
		result.append(primaryOrderId);
		result.append(", primaryReturnId: ");
		result.append(primaryReturnId);
		result.append(", primaryShipGroupSeqId: ");
		result.append(primaryShipGroupSeqId);
		result.append(", shipmentTypeId: ");
		result.append(shipmentTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", shipmentAttributes: ");
		result.append(shipmentAttributes);
		result.append(", shipmentContactMechs: ");
		result.append(shipmentContactMechs);
		result.append(", shipmentItems: ");
		result.append(shipmentItems);
		result.append(", shipmentPackages: ");
		result.append(shipmentPackages);
		result.append(", shipmentRouteSegments: ");
		result.append(shipmentRouteSegments);
		result.append(')');
		return result.toString();
	}

} //ShipmentImpl
