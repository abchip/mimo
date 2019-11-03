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

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDeliveryId <em>Delivery Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDestFacilityId <em>Dest Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEndMileage <em>End Mileage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFuelUsed <em>Fuel Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getStartMileage <em>Start Mileage</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery()
 * @model
 * @generated
 */
public interface Delivery extends BizEntity {
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_ActualArrivalDate()
	 * @model
	 * @generated
	 */
	Date getActualArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualArrivalDate <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Arrival Date</em>' attribute.
	 * @see #getActualArrivalDate()
	 * @generated
	 */
	void setActualArrivalDate(Date value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_ActualStartDate()
	 * @model
	 * @generated
	 */
	Date getActualStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualStartDate <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start Date</em>' attribute.
	 * @see #getActualStartDate()
	 * @generated
	 */
	void setActualStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Id</em>' attribute.
	 * @see #setDeliveryId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_DeliveryId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDeliveryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDeliveryId <em>Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Id</em>' attribute.
	 * @see #getDeliveryId()
	 * @generated
	 */
	void setDeliveryId(String value);

	/**
	 * Returns the value of the '<em><b>Dest Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Facility Id</em>' attribute.
	 * @see #setDestFacilityId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_DestFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getDestFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDestFacilityId <em>Dest Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Facility Id</em>' attribute.
	 * @see #getDestFacilityId()
	 * @generated
	 */
	void setDestFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>End Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Mileage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Mileage</em>' attribute.
	 * @see #setEndMileage(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_EndMileage()
	 * @model
	 * @generated
	 */
	BigDecimal getEndMileage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEndMileage <em>End Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Mileage</em>' attribute.
	 * @see #getEndMileage()
	 * @generated
	 */
	void setEndMileage(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_EstimatedStartDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedStartDate <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #getEstimatedStartDate()
	 * @generated
	 */
	void setEstimatedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Fuel Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Used</em>' attribute.
	 * @see #setFuelUsed(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_FuelUsed()
	 * @model
	 * @generated
	 */
	BigDecimal getFuelUsed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFuelUsed <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Used</em>' attribute.
	 * @see #getFuelUsed()
	 * @generated
	 */
	void setFuelUsed(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_OriginFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getOriginFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getOriginFacilityId <em>Origin Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility Id</em>' attribute.
	 * @see #getOriginFacilityId()
	 * @generated
	 */
	void setOriginFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Start Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Mileage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Mileage</em>' attribute.
	 * @see #setStartMileage(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getDelivery_StartMileage()
	 * @model
	 * @generated
	 */
	BigDecimal getStartMileage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getStartMileage <em>Start Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Mileage</em>' attribute.
	 * @see #getStartMileage()
	 * @generated
	 */
	void setStartMileage(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='deliveryId'"
	 * @generated
	 */
	List<String> shipmentRouteSegments();

} // Delivery
