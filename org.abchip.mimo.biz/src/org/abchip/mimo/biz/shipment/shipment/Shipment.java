/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentAttributes <em>Shipment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentContactMechs <em>Shipment Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentItems <em>Shipment Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentPackages <em>Shipment Packages</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentRouteSegments <em>Shipment Route Segments</em>}</li>
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Destination Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Contact Mech Id</em>' attribute.
	 * @see #setDestinationContactMechId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getDestinationContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationContactMechId <em>Destination Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Contact Mech Id</em>' attribute.
	 * @see #getDestinationContactMechId()
	 * @generated
	 */
	void setDestinationContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Destination Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility Id</em>' attribute.
	 * @see #setDestinationFacilityId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getDestinationFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationFacilityId <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility Id</em>' attribute.
	 * @see #getDestinationFacilityId()
	 * @generated
	 */
	void setDestinationFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Destination Telecom Number Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Telecom Number Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Telecom Number Id</em>' attribute.
	 * @see #setDestinationTelecomNumberId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_DestinationTelecomNumberId()
	 * @model annotation="mimo-ent-domain frame='TelecomNumber'"
	 * @generated
	 */
	String getDestinationTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Telecom Number Id</em>' attribute.
	 * @see #getDestinationTelecomNumberId()
	 * @generated
	 */
	void setDestinationTelecomNumberId(String value);

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
	 * Returns the value of the '<em><b>Estimated Arrival Work Eff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Arrival Work Eff Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Work Eff Id</em>' attribute.
	 * @see #setEstimatedArrivalWorkEffId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedArrivalWorkEffId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getEstimatedArrivalWorkEffId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Work Eff Id</em>' attribute.
	 * @see #getEstimatedArrivalWorkEffId()
	 * @generated
	 */
	void setEstimatedArrivalWorkEffId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Estimated Ship Work Eff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Work Eff Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Work Eff Id</em>' attribute.
	 * @see #setEstimatedShipWorkEffId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_EstimatedShipWorkEffId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getEstimatedShipWorkEffId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Work Eff Id</em>' attribute.
	 * @see #getEstimatedShipWorkEffId()
	 * @generated
	 */
	void setEstimatedShipWorkEffId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Origin Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech Id</em>' attribute.
	 * @see #setOriginContactMechId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getOriginContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginContactMechId <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech Id</em>' attribute.
	 * @see #getOriginContactMechId()
	 * @generated
	 */
	void setOriginContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Origin Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Facility Id</em>' attribute.
	 * @see #setOriginFacilityId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getOriginFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginFacilityId <em>Origin Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility Id</em>' attribute.
	 * @see #getOriginFacilityId()
	 * @generated
	 */
	void setOriginFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Origin Telecom Number Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Telecom Number Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Telecom Number Id</em>' attribute.
	 * @see #setOriginTelecomNumberId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_OriginTelecomNumberId()
	 * @model annotation="mimo-ent-domain frame='TelecomNumber'"
	 * @generated
	 */
	String getOriginTelecomNumberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Telecom Number Id</em>' attribute.
	 * @see #getOriginTelecomNumberId()
	 * @generated
	 */
	void setOriginTelecomNumberId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' attribute.
	 * @see #setPartyIdFrom(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PartyIdFrom()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' attribute.
	 * @see #setPartyIdTo(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PartyIdTo()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' attribute.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #setPicklistBinId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PicklistBinId()
	 * @model annotation="mimo-ent-domain frame='PicklistBin'"
	 * @generated
	 */
	String getPicklistBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPicklistBinId <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #getPicklistBinId()
	 * @generated
	 */
	void setPicklistBinId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Order Id</em>' attribute.
	 * @see #setPrimaryOrderId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PrimaryOrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getPrimaryOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryOrderId <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Order Id</em>' attribute.
	 * @see #getPrimaryOrderId()
	 * @generated
	 */
	void setPrimaryOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Return Id</em>' attribute.
	 * @see #setPrimaryReturnId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_PrimaryReturnId()
	 * @model annotation="mimo-ent-domain frame='ReturnHeader'"
	 * @generated
	 */
	String getPrimaryReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryReturnId <em>Primary Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Return Id</em>' attribute.
	 * @see #getPrimaryReturnId()
	 * @generated
	 */
	void setPrimaryReturnId(String value);

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
	 * @model
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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Shipment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Type Id</em>' attribute.
	 * @see #setShipmentTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentTypeId()
	 * @model annotation="mimo-ent-domain frame='ShipmentType'"
	 * @generated
	 */
	String getShipmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId <em>Shipment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Type Id</em>' attribute.
	 * @see #getShipmentTypeId()
	 * @generated
	 */
	void setShipmentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentAttribute'"
	 * @generated
	 */
	List<String> getShipmentAttributes();

	/**
	 * Returns the value of the '<em><b>Shipment Contact Mechs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Contact Mechs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Contact Mechs</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentContactMechs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentContactMech'"
	 * @generated
	 */
	List<String> getShipmentContactMechs();

	/**
	 * Returns the value of the '<em><b>Shipment Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentItem'"
	 * @generated
	 */
	List<String> getShipmentItems();

	/**
	 * Returns the value of the '<em><b>Shipment Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Packages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Packages</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentPackages()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentPackage'"
	 * @generated
	 */
	List<String> getShipmentPackages();

	/**
	 * Returns the value of the '<em><b>Shipment Route Segments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Route Segments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segments</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipment_ShipmentRouteSegments()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment'"
	 * @generated
	 */
	List<String> getShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='shipmentId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ItemIssuance' route='shipmentId'"
	 * @generated
	 */
	List<String> itemIssuances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentReceipt' route='shipmentId'"
	 * @generated
	 */
	List<String> shipmentReceipts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentStatus' route='shipmentId'"
	 * @generated
	 */
	List<String> shipmentStatuss();

} // Shipment
