/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Gateway Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShipmentGatewayConfigType extends BizEntityType<ShipmentGatewayConfig> {
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' attribute.
	 * @see #setParentTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_ParentTypeId()
	 * @model annotation="mimo-ent-domain frame='ShipmentGatewayConfigType'"
	 * @generated
	 */
	String getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' attribute.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentGatewayConfigType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childShipmentGatewayConfigTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentGatewayConfig' route='shipmentGatewayConfTypeId'"
	 * @generated
	 */
	List<String> shipmentGatewayConfigs();

	/**
	 * Returns the value of the '<em><b>Shipment Gateway Conf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Gateway Conf Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Gateway Conf Type Id</em>' attribute.
	 * @see #setShipmentGatewayConfTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_ShipmentGatewayConfTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentGatewayConfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Gateway Conf Type Id</em>' attribute.
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 */
	void setShipmentGatewayConfTypeId(String value);

} // ShipmentGatewayConfigType
