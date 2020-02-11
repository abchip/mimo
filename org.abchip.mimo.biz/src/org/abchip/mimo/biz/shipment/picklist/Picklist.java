/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistDate <em>Picklist Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistStatusHistories <em>Picklist Status Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Picklist extends BizEntity {
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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Picklist Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Date</em>' attribute.
	 * @see #setPicklistDate(Date)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_PicklistDate()
	 * @model
	 * @generated
	 */
	Date getPicklistDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistDate <em>Picklist Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Date</em>' attribute.
	 * @see #getPicklistDate()
	 * @generated
	 */
	void setPicklistDate(Date value);

	/**
	 * Returns the value of the '<em><b>Picklist Status Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Status Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Status Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_PicklistStatusHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<PicklistStatusHistory> getPicklistStatusHistories();

	/**
	 * Returns the value of the '<em><b>Picklist Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Id</em>' attribute.
	 * @see #setPicklistId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_PicklistId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPicklistId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistId <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Id</em>' attribute.
	 * @see #getPicklistId()
	 * @generated
	 */
	void setPicklistId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_ShipmentMethodTypeId()
	 * @model keys="shipmentMethodTypeId"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' reference.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(ShipmentMethodType value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklist_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // Picklist
