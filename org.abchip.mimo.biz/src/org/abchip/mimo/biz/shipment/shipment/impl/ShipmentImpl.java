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
import java.util.List;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.picklist.PicklistBin;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech;
import org.abchip.mimo.biz.shipment.shipment.ShipmentItem;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentAttributes <em>Shipment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentContactMechs <em>Shipment Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentItems <em>Shipment Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentPackages <em>Shipment Packages</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentRouteSegments <em>Shipment Route Segments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getStatusId <em>Status Id</em>}</li>
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
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalShippingCharge(BigDecimal newAdditionalShippingCharge) {
		eSet(Shipment_Package.Literals.SHIPMENT__ADDITIONAL_SHIPPING_CHARGE, newAdditionalShippingCharge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddtlShippingChargeDesc() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddtlShippingChargeDesc(String newAddtlShippingChargeDesc) {
		eSet(Shipment_Package.Literals.SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC, newAddtlShippingChargeDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(Shipment_Package.Literals.SHIPMENT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getDestinationContactMechId() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT__DESTINATION_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationContactMechId(ContactMech newDestinationContactMechId) {
		eSet(Shipment_Package.Literals.SHIPMENT__DESTINATION_CONTACT_MECH_ID, newDestinationContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestinationFacilityId() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT__DESTINATION_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(Facility newDestinationFacilityId) {
		eSet(Shipment_Package.Literals.SHIPMENT__DESTINATION_FACILITY_ID, newDestinationFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getDestinationTelecomNumberId() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationTelecomNumberId(TelecomNumber newDestinationTelecomNumberId) {
		eSet(Shipment_Package.Literals.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID, newDestinationTelecomNumberId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedArrivalDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_ARRIVAL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_ARRIVAL_DATE, newEstimatedArrivalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getEstimatedArrivalWorkEffId() {
		return (WorkEffort)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalWorkEffId(WorkEffort newEstimatedArrivalWorkEffId) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID, newEstimatedArrivalWorkEffId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedReadyDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_READY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedReadyDate(Date newEstimatedReadyDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_READY_DATE, newEstimatedReadyDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedShipCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipCost(BigDecimal newEstimatedShipCost) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_COST, newEstimatedShipCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_DATE, newEstimatedShipDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getEstimatedShipWorkEffId() {
		return (WorkEffort)eGet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipWorkEffId(WorkEffort newEstimatedShipWorkEffId) {
		eSet(Shipment_Package.Literals.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID, newEstimatedShipWorkEffId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandlingInstructions() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__HANDLING_INSTRUCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandlingInstructions(String newHandlingInstructions) {
		eSet(Shipment_Package.Literals.SHIPMENT__HANDLING_INSTRUCTIONS, newHandlingInstructions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(Shipment_Package.Literals.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLatestCancelDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT__LATEST_CANCEL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestCancelDate(Date newLatestCancelDate) {
		eSet(Shipment_Package.Literals.SHIPMENT__LATEST_CANCEL_DATE, newLatestCancelDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMechId() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT__ORIGIN_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(ContactMech newOriginContactMechId) {
		eSet(Shipment_Package.Literals.SHIPMENT__ORIGIN_CONTACT_MECH_ID, newOriginContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT__ORIGIN_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		eSet(Shipment_Package.Literals.SHIPMENT__ORIGIN_FACILITY_ID, newOriginFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getOriginTelecomNumberId() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginTelecomNumberId(TelecomNumber newOriginTelecomNumberId) {
		eSet(Shipment_Package.Literals.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID, newOriginTelecomNumberId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(Shipment_Package.Literals.SHIPMENT__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT__PARTY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		eSet(Shipment_Package.Literals.SHIPMENT__PARTY_ID_TO, newPartyIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistBin getPicklistBinId() {
		return (PicklistBin)eGet(Shipment_Package.Literals.SHIPMENT__PICKLIST_BIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistBinId(PicklistBin newPicklistBinId) {
		eSet(Shipment_Package.Literals.SHIPMENT__PICKLIST_BIN_ID, newPicklistBinId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getPrimaryOrderId() {
		return (OrderHeader)eGet(Shipment_Package.Literals.SHIPMENT__PRIMARY_ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOrderId(OrderHeader newPrimaryOrderId) {
		eSet(Shipment_Package.Literals.SHIPMENT__PRIMARY_ORDER_ID, newPrimaryOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getPrimaryReturnId() {
		return (ReturnHeader)eGet(Shipment_Package.Literals.SHIPMENT__PRIMARY_RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryReturnId(ReturnHeader newPrimaryReturnId) {
		eSet(Shipment_Package.Literals.SHIPMENT__PRIMARY_RETURN_ID, newPrimaryReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryShipGroupSeqId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryShipGroupSeqId(String newPrimaryShipGroupSeqId) {
		eSet(Shipment_Package.Literals.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID, newPrimaryShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentAttribute> getShipmentAttributes() {
		return (List<ShipmentAttribute>)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentContactMech> getShipmentContactMechs() {
		return (List<ShipmentContactMech>)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_CONTACT_MECHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentItem> getShipmentItems() {
		return (List<ShipmentItem>)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentPackage> getShipmentPackages() {
		return (List<ShipmentPackage>)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_PACKAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentRouteSegment> getShipmentRouteSegments() {
		return (List<ShipmentRouteSegment>)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_ROUTE_SEGMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_ID, newShipmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentType getShipmentTypeId() {
		return (ShipmentType)eGet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentTypeId(ShipmentType newShipmentTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT__SHIPMENT_TYPE_ID, newShipmentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(Shipment_Package.Literals.SHIPMENT__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(Shipment_Package.Literals.SHIPMENT__STATUS_ID, newStatusId);
	}

} //ShipmentImpl
