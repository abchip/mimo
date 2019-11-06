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
import org.abchip.mimo.biz.shipment.shipment.ShipmentType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipCost <em>Estimated Ship Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getLatestCancelDate <em>Latest Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationContactMechId <em>Destination Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryOrderId <em>Primary Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPrimaryReturnId <em>Primary Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
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
	 * The cached value of the '{@link #getShipmentTypeId() <em>Shipment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentType shipmentTypeId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getEstimatedShipWorkEffId() <em>Estimated Ship Work Eff Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort estimatedShipWorkEffId;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalWorkEffId() <em>Estimated Arrival Work Eff Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalWorkEffId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort estimatedArrivalWorkEffId;

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
	 * The cached value of the '{@link #getOriginFacilityId() <em>Origin Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility originFacilityId;

	/**
	 * The cached value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility destinationFacilityId;

	/**
	 * The cached value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech originContactMechId;

	/**
	 * The cached value of the '{@link #getDestinationContactMechId() <em>Destination Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech destinationContactMechId;

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
	 * The cached value of the '{@link #getDestinationTelecomNumberId() <em>Destination Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTelecomNumberId()
	 * @generated
	 * @ordered
	 */
	protected TelecomNumber destinationTelecomNumberId;

	/**
	 * The cached value of the '{@link #getPrimaryOrderId() <em>Primary Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader primaryOrderId;

	/**
	 * The cached value of the '{@link #getPrimaryReturnId() <em>Primary Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReturnId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeader primaryReturnId;

	/**
	 * The cached value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected PicklistBin picklistBinId;

	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;

	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;

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
		additionalShippingCharge = newAdditionalShippingCharge;
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
		addtlShippingChargeDesc = newAddtlShippingChargeDesc;
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
		createdByUserLogin = newCreatedByUserLogin;
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
		createdDate = newCreatedDate;
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
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getDestinationContactMechId() {
		if (destinationContactMechId != null && ((EObject)destinationContactMechId).eIsProxy()) {
			InternalEObject oldDestinationContactMechId = (InternalEObject)destinationContactMechId;
			destinationContactMechId = (ContactMech)eResolveProxy(oldDestinationContactMechId);
			if (destinationContactMechId != oldDestinationContactMechId) {
			}
		}
		return destinationContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetDestinationContactMechId() {
		return destinationContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationContactMechId(ContactMech newDestinationContactMechId) {
		destinationContactMechId = newDestinationContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestinationFacilityId() {
		if (destinationFacilityId != null && ((EObject)destinationFacilityId).eIsProxy()) {
			InternalEObject oldDestinationFacilityId = (InternalEObject)destinationFacilityId;
			destinationFacilityId = (Facility)eResolveProxy(oldDestinationFacilityId);
			if (destinationFacilityId != oldDestinationFacilityId) {
			}
		}
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetDestinationFacilityId() {
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(Facility newDestinationFacilityId) {
		destinationFacilityId = newDestinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getDestinationTelecomNumberId() {
		if (destinationTelecomNumberId != null && ((EObject)destinationTelecomNumberId).eIsProxy()) {
			InternalEObject oldDestinationTelecomNumberId = (InternalEObject)destinationTelecomNumberId;
			destinationTelecomNumberId = (TelecomNumber)eResolveProxy(oldDestinationTelecomNumberId);
			if (destinationTelecomNumberId != oldDestinationTelecomNumberId) {
			}
		}
		return destinationTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNumber basicGetDestinationTelecomNumberId() {
		return destinationTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationTelecomNumberId(TelecomNumber newDestinationTelecomNumberId) {
		destinationTelecomNumberId = newDestinationTelecomNumberId;
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
		estimatedArrivalDate = newEstimatedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getEstimatedArrivalWorkEffId() {
		if (estimatedArrivalWorkEffId != null && ((EObject)estimatedArrivalWorkEffId).eIsProxy()) {
			InternalEObject oldEstimatedArrivalWorkEffId = (InternalEObject)estimatedArrivalWorkEffId;
			estimatedArrivalWorkEffId = (WorkEffort)eResolveProxy(oldEstimatedArrivalWorkEffId);
			if (estimatedArrivalWorkEffId != oldEstimatedArrivalWorkEffId) {
			}
		}
		return estimatedArrivalWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetEstimatedArrivalWorkEffId() {
		return estimatedArrivalWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalWorkEffId(WorkEffort newEstimatedArrivalWorkEffId) {
		estimatedArrivalWorkEffId = newEstimatedArrivalWorkEffId;
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
		estimatedReadyDate = newEstimatedReadyDate;
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
		estimatedShipCost = newEstimatedShipCost;
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
		estimatedShipDate = newEstimatedShipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getEstimatedShipWorkEffId() {
		if (estimatedShipWorkEffId != null && ((EObject)estimatedShipWorkEffId).eIsProxy()) {
			InternalEObject oldEstimatedShipWorkEffId = (InternalEObject)estimatedShipWorkEffId;
			estimatedShipWorkEffId = (WorkEffort)eResolveProxy(oldEstimatedShipWorkEffId);
			if (estimatedShipWorkEffId != oldEstimatedShipWorkEffId) {
			}
		}
		return estimatedShipWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetEstimatedShipWorkEffId() {
		return estimatedShipWorkEffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipWorkEffId(WorkEffort newEstimatedShipWorkEffId) {
		estimatedShipWorkEffId = newEstimatedShipWorkEffId;
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
		handlingInstructions = newHandlingInstructions;
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
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
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
		lastModifiedDate = newLastModifiedDate;
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
		latestCancelDate = newLatestCancelDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMechId() {
		if (originContactMechId != null && ((EObject)originContactMechId).eIsProxy()) {
			InternalEObject oldOriginContactMechId = (InternalEObject)originContactMechId;
			originContactMechId = (ContactMech)eResolveProxy(oldOriginContactMechId);
			if (originContactMechId != oldOriginContactMechId) {
			}
		}
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetOriginContactMechId() {
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(ContactMech newOriginContactMechId) {
		originContactMechId = newOriginContactMechId;
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
		originFacilityId = newOriginFacilityId;
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
		originTelecomNumberId = newOriginTelecomNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		partyIdFrom = newPartyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		partyIdTo = newPartyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistBin getPicklistBinId() {
		if (picklistBinId != null && ((EObject)picklistBinId).eIsProxy()) {
			InternalEObject oldPicklistBinId = (InternalEObject)picklistBinId;
			picklistBinId = (PicklistBin)eResolveProxy(oldPicklistBinId);
			if (picklistBinId != oldPicklistBinId) {
			}
		}
		return picklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicklistBin basicGetPicklistBinId() {
		return picklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistBinId(PicklistBin newPicklistBinId) {
		picklistBinId = newPicklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getPrimaryOrderId() {
		if (primaryOrderId != null && ((EObject)primaryOrderId).eIsProxy()) {
			InternalEObject oldPrimaryOrderId = (InternalEObject)primaryOrderId;
			primaryOrderId = (OrderHeader)eResolveProxy(oldPrimaryOrderId);
			if (primaryOrderId != oldPrimaryOrderId) {
			}
		}
		return primaryOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetPrimaryOrderId() {
		return primaryOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOrderId(OrderHeader newPrimaryOrderId) {
		primaryOrderId = newPrimaryOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getPrimaryReturnId() {
		if (primaryReturnId != null && ((EObject)primaryReturnId).eIsProxy()) {
			InternalEObject oldPrimaryReturnId = (InternalEObject)primaryReturnId;
			primaryReturnId = (ReturnHeader)eResolveProxy(oldPrimaryReturnId);
			if (primaryReturnId != oldPrimaryReturnId) {
			}
		}
		return primaryReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeader basicGetPrimaryReturnId() {
		return primaryReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryReturnId(ReturnHeader newPrimaryReturnId) {
		primaryReturnId = newPrimaryReturnId;
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
		primaryShipGroupSeqId = newPrimaryShipGroupSeqId;
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
		shipmentId = newShipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentType getShipmentTypeId() {
		if (shipmentTypeId != null && ((EObject)shipmentTypeId).eIsProxy()) {
			InternalEObject oldShipmentTypeId = (InternalEObject)shipmentTypeId;
			shipmentTypeId = (ShipmentType)eResolveProxy(oldShipmentTypeId);
			if (shipmentTypeId != oldShipmentTypeId) {
			}
		}
		return shipmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentType basicGetShipmentTypeId() {
		return shipmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentTypeId(ShipmentType newShipmentTypeId) {
		shipmentTypeId = newShipmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentAttributes() {
		if (shipmentAttributes == null) {
			shipmentAttributes = new BasicInternalEList<String>(String.class);
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
			shipmentContactMechs = new BasicInternalEList<String>(String.class);
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
			shipmentItems = new BasicInternalEList<String>(String.class);
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
			shipmentPackages = new BasicInternalEList<String>(String.class);
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
			shipmentRouteSegments = new BasicInternalEList<String>(String.class);
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
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				return getEstimatedArrivalDate();
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				return getEstimatedReadyDate();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				return getEstimatedShipCost();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				return getEstimatedShipDate();
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				return getHandlingInstructions();
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				return getLatestCancelDate();
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				return getPrimaryShipGroupSeqId();
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				if (resolve) return getShipmentTypeId();
				return basicGetShipmentTypeId();
			case Shipment_Package.SHIPMENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				if (resolve) return getEstimatedShipWorkEffId();
				return basicGetEstimatedShipWorkEffId();
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				if (resolve) return getEstimatedArrivalWorkEffId();
				return basicGetEstimatedArrivalWorkEffId();
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				if (resolve) return getOriginFacilityId();
				return basicGetOriginFacilityId();
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				if (resolve) return getDestinationFacilityId();
				return basicGetDestinationFacilityId();
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				if (resolve) return getOriginContactMechId();
				return basicGetOriginContactMechId();
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				if (resolve) return getDestinationContactMechId();
				return basicGetDestinationContactMechId();
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				if (resolve) return getOriginTelecomNumberId();
				return basicGetOriginTelecomNumberId();
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				if (resolve) return getDestinationTelecomNumberId();
				return basicGetDestinationTelecomNumberId();
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				if (resolve) return getPrimaryOrderId();
				return basicGetPrimaryOrderId();
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				if (resolve) return getPrimaryReturnId();
				return basicGetPrimaryReturnId();
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				if (resolve) return getPicklistBinId();
				return basicGetPicklistBinId();
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
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
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate((Date)newValue);
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
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				setShipmentTypeId((ShipmentType)newValue);
				return;
			case Shipment_Package.SHIPMENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				setEstimatedShipWorkEffId((WorkEffort)newValue);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				setEstimatedArrivalWorkEffId((WorkEffort)newValue);
				return;
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((Facility)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((ContactMech)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				setDestinationContactMechId((ContactMech)newValue);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId((TelecomNumber)newValue);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				setDestinationTelecomNumberId((TelecomNumber)newValue);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				setPrimaryOrderId((OrderHeader)newValue);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				setPrimaryReturnId((ReturnHeader)newValue);
				return;
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				setPicklistBinId((PicklistBin)newValue);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
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
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate(ESTIMATED_ARRIVAL_DATE_EDEFAULT);
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
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId(PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				setShipmentTypeId((ShipmentType)null);
				return;
			case Shipment_Package.SHIPMENT__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				setEstimatedShipWorkEffId((WorkEffort)null);
				return;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				setEstimatedArrivalWorkEffId((WorkEffort)null);
				return;
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)null);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((Facility)null);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((ContactMech)null);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				setDestinationContactMechId((ContactMech)null);
				return;
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				setOriginTelecomNumberId((TelecomNumber)null);
				return;
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				setDestinationTelecomNumberId((TelecomNumber)null);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				setPrimaryOrderId((OrderHeader)null);
				return;
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				setPrimaryReturnId((ReturnHeader)null);
				return;
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				setPicklistBinId((PicklistBin)null);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
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
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_DATE:
				return ESTIMATED_ARRIVAL_DATE_EDEFAULT == null ? estimatedArrivalDate != null : !ESTIMATED_ARRIVAL_DATE_EDEFAULT.equals(estimatedArrivalDate);
			case Shipment_Package.SHIPMENT__ESTIMATED_READY_DATE:
				return ESTIMATED_READY_DATE_EDEFAULT == null ? estimatedReadyDate != null : !ESTIMATED_READY_DATE_EDEFAULT.equals(estimatedReadyDate);
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_COST:
				return ESTIMATED_SHIP_COST_EDEFAULT == null ? estimatedShipCost != null : !ESTIMATED_SHIP_COST_EDEFAULT.equals(estimatedShipCost);
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_DATE:
				return ESTIMATED_SHIP_DATE_EDEFAULT == null ? estimatedShipDate != null : !ESTIMATED_SHIP_DATE_EDEFAULT.equals(estimatedShipDate);
			case Shipment_Package.SHIPMENT__HANDLING_INSTRUCTIONS:
				return HANDLING_INSTRUCTIONS_EDEFAULT == null ? handlingInstructions != null : !HANDLING_INSTRUCTIONS_EDEFAULT.equals(handlingInstructions);
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case Shipment_Package.SHIPMENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case Shipment_Package.SHIPMENT__LATEST_CANCEL_DATE:
				return LATEST_CANCEL_DATE_EDEFAULT == null ? latestCancelDate != null : !LATEST_CANCEL_DATE_EDEFAULT.equals(latestCancelDate);
			case Shipment_Package.SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID:
				return PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT == null ? primaryShipGroupSeqId != null : !PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT.equals(primaryShipGroupSeqId);
			case Shipment_Package.SHIPMENT__SHIPMENT_TYPE_ID:
				return shipmentTypeId != null;
			case Shipment_Package.SHIPMENT__STATUS_ID:
				return statusId != null;
			case Shipment_Package.SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID:
				return estimatedShipWorkEffId != null;
			case Shipment_Package.SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID:
				return estimatedArrivalWorkEffId != null;
			case Shipment_Package.SHIPMENT__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case Shipment_Package.SHIPMENT__ORIGIN_FACILITY_ID:
				return originFacilityId != null;
			case Shipment_Package.SHIPMENT__DESTINATION_FACILITY_ID:
				return destinationFacilityId != null;
			case Shipment_Package.SHIPMENT__ORIGIN_CONTACT_MECH_ID:
				return originContactMechId != null;
			case Shipment_Package.SHIPMENT__DESTINATION_CONTACT_MECH_ID:
				return destinationContactMechId != null;
			case Shipment_Package.SHIPMENT__ORIGIN_TELECOM_NUMBER_ID:
				return originTelecomNumberId != null;
			case Shipment_Package.SHIPMENT__DESTINATION_TELECOM_NUMBER_ID:
				return destinationTelecomNumberId != null;
			case Shipment_Package.SHIPMENT__PRIMARY_ORDER_ID:
				return primaryOrderId != null;
			case Shipment_Package.SHIPMENT__PRIMARY_RETURN_ID:
				return primaryReturnId != null;
			case Shipment_Package.SHIPMENT__PICKLIST_BIN_ID:
				return picklistBinId != null;
			case Shipment_Package.SHIPMENT__PARTY_ID_TO:
				return partyIdTo != null;
			case Shipment_Package.SHIPMENT__PARTY_ID_FROM:
				return partyIdFrom != null;
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
		result.append(", estimatedArrivalDate: ");
		result.append(estimatedArrivalDate);
		result.append(", estimatedReadyDate: ");
		result.append(estimatedReadyDate);
		result.append(", estimatedShipCost: ");
		result.append(estimatedShipCost);
		result.append(", estimatedShipDate: ");
		result.append(estimatedShipDate);
		result.append(", handlingInstructions: ");
		result.append(handlingInstructions);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", latestCancelDate: ");
		result.append(latestCancelDate);
		result.append(", primaryShipGroupSeqId: ");
		result.append(primaryShipGroupSeqId);
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
