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
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.picklist.PicklistBin;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationContactMechId <em>Destination Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipCost <em>Estimated Ship Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLatestCancelDate <em>Latest Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryOrderId <em>Primary Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryReturnId <em>Primary Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentAttributes <em>Shipment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentContactMechs <em>Shipment Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentItems <em>Shipment Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentPackages <em>Shipment Packages</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentRouteSegments <em>Shipment Route Segments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends BizEntityTyped<ShipmentType> {
	/**
	 * Returns the value of the '<em><b>Additional Shipping Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Shipping Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Shipping Charge</em>' attribute.
	 * @see #setAdditionalShippingCharge(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_AdditionalShippingCharge()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAdditionalShippingCharge();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Shipping Charge</em>' attribute.
	 * @see #getAdditionalShippingCharge()
	 * @generated
	 */
	void setAdditionalShippingCharge(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Addtl Shipping Charge Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addtl Shipping Charge Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addtl Shipping Charge Desc</em>' attribute.
	 * @see #setAddtlShippingChargeDesc(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_AddtlShippingChargeDesc()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddtlShippingChargeDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addtl Shipping Charge Desc</em>' attribute.
	 * @see #getAddtlShippingChargeDesc()
	 * @generated
	 */
	void setAddtlShippingChargeDesc(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Destination Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Contact Mech Id</em>' reference.
	 * @see #setDestinationContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getDestinationContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationContactMechId <em>Destination Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Contact Mech Id</em>' reference.
	 * @see #getDestinationContactMechId()
	 * @generated
	 */
	void setDestinationContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Destination Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility Id</em>' reference.
	 * @see #setDestinationFacilityId(Facility)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getDestinationFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationFacilityId <em>Destination Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility Id</em>' reference.
	 * @see #getDestinationFacilityId()
	 * @generated
	 */
	void setDestinationFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Destination Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Telecom Number Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Telecom Number Id</em>' reference.
	 * @see #setDestinationTelecomNumberId(TelecomNumber)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationTelecomNumberId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getDestinationTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Telecom Number Id</em>' reference.
	 * @see #getDestinationTelecomNumberId()
	 * @generated
	 */
	void setDestinationTelecomNumberId(TelecomNumber value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 */
	void setEstimatedArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Work Eff Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Arrival Work Eff Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Work Eff Id</em>' reference.
	 * @see #setEstimatedArrivalWorkEffId(WorkEffort)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedArrivalWorkEffId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getEstimatedArrivalWorkEffId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Work Eff Id</em>' reference.
	 * @see #getEstimatedArrivalWorkEffId()
	 * @generated
	 */
	void setEstimatedArrivalWorkEffId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Estimated Ready Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ready Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #setEstimatedReadyDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedReadyDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedReadyDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedReadyDate <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #getEstimatedReadyDate()
	 * @generated
	 */
	void setEstimatedReadyDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Cost</em>' attribute.
	 * @see #setEstimatedShipCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedShipCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedShipCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipCost <em>Estimated Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Cost</em>' attribute.
	 * @see #getEstimatedShipCost()
	 * @generated
	 */
	void setEstimatedShipCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #setEstimatedShipDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedShipDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedShipDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipDate <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #getEstimatedShipDate()
	 * @generated
	 */
	void setEstimatedShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Work Eff Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Work Eff Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Work Eff Id</em>' reference.
	 * @see #setEstimatedShipWorkEffId(WorkEffort)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedShipWorkEffId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getEstimatedShipWorkEffId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Work Eff Id</em>' reference.
	 * @see #getEstimatedShipWorkEffId()
	 * @generated
	 */
	void setEstimatedShipWorkEffId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Handling Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Instructions</em>' attribute.
	 * @see #setHandlingInstructions(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_HandlingInstructions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHandlingInstructions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getHandlingInstructions <em>Handling Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Instructions</em>' attribute.
	 * @see #getHandlingInstructions()
	 * @generated
	 */
	void setHandlingInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Latest Cancel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Cancel Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Cancel Date</em>' attribute.
	 * @see #setLatestCancelDate(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_LatestCancelDate()
	 * @model
	 * @generated
	 */
	Date getLatestCancelDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLatestCancelDate <em>Latest Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Cancel Date</em>' attribute.
	 * @see #getLatestCancelDate()
	 * @generated
	 */
	void setLatestCancelDate(Date value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getOriginContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginContactMechId <em>Origin Contact Mech Id</em>}' reference.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getOriginFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginFacilityId <em>Origin Facility Id</em>}' reference.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginTelecomNumberId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getOriginTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Telecom Number Id</em>' reference.
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 */
	void setOriginTelecomNumberId(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PartyIdTo()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin Id</em>' reference.
	 * @see #setPicklistBinId(PicklistBin)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PicklistBinId()
	 * @model keys="picklistBinId"
	 * @generated
	 */
	PicklistBin getPicklistBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPicklistBinId <em>Picklist Bin Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin Id</em>' reference.
	 * @see #getPicklistBinId()
	 * @generated
	 */
	void setPicklistBinId(PicklistBin value);

	/**
	 * Returns the value of the '<em><b>Primary Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Order Id</em>' reference.
	 * @see #setPrimaryOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PrimaryOrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getPrimaryOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryOrderId <em>Primary Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Order Id</em>' reference.
	 * @see #getPrimaryOrderId()
	 * @generated
	 */
	void setPrimaryOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Primary Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Return Id</em>' reference.
	 * @see #setPrimaryReturnId(ReturnHeader)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PrimaryReturnId()
	 * @model keys="returnId"
	 * @generated
	 */
	ReturnHeader getPrimaryReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryReturnId <em>Primary Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Return Id</em>' reference.
	 * @see #getPrimaryReturnId()
	 * @generated
	 */
	void setPrimaryReturnId(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #setPrimaryShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PrimaryShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPrimaryShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 */
	void setPrimaryShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentAttribute> getShipmentAttributes();

	/**
	 * Returns the value of the '<em><b>Shipment Contact Mechs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Contact Mechs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Contact Mechs</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentContactMechs()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentContactMech> getShipmentContactMechs();

	/**
	 * Returns the value of the '<em><b>Shipment Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Items</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentItems()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentItem> getShipmentItems();

	/**
	 * Returns the value of the '<em><b>Shipment Packages</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Packages</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentPackages()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentPackage> getShipmentPackages();

	/**
	 * Returns the value of the '<em><b>Shipment Route Segments</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Route Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segments</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentRouteSegments()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentRouteSegment> getShipmentRouteSegments();

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Type Id</em>' reference.
	 * @see #setShipmentTypeId(ShipmentType)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentTypeId()
	 * @model keys="shipmentTypeId"
	 * @generated
	 */
	ShipmentType getShipmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId <em>Shipment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Type Id</em>' reference.
	 * @see #getShipmentTypeId()
	 * @generated
	 */
	void setShipmentTypeId(ShipmentType value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // Shipment
