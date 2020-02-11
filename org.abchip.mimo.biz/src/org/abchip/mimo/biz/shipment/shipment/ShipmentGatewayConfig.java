/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Gateway Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfig()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShipmentGatewayConfig extends BizEntityTyped<ShipmentGatewayConfigType> {
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfig_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Gateway Conf Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Gateway Conf Type Id</em>' reference.
	 * @see #setShipmentGatewayConfTypeId(ShipmentGatewayConfigType)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfig_ShipmentGatewayConfTypeId()
	 * @model keys="shipmentGatewayConfTypeId"
	 * @generated
	 */
	ShipmentGatewayConfigType getShipmentGatewayConfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Gateway Conf Type Id</em>' reference.
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 */
	void setShipmentGatewayConfTypeId(ShipmentGatewayConfigType value);

	/**
	 * Returns the value of the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Gateway Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Gateway Config Id</em>' attribute.
	 * @see #setShipmentGatewayConfigId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayConfig_ShipmentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Gateway Config Id</em>' attribute.
	 * @see #getShipmentGatewayConfigId()
	 * @generated
	 */
	void setShipmentGatewayConfigId(String value);

} // ShipmentGatewayConfig
