/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayConfigImpl extends BizEntityTypedImpl<ShipmentGatewayConfigType> implements ShipmentGatewayConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfigType getShipmentGatewayConfTypeId() {
		return (ShipmentGatewayConfigType)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfTypeId(ShipmentGatewayConfigType newShipmentGatewayConfTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID, newShipmentGatewayConfTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentGatewayConfigId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfigId(String newShipmentGatewayConfigId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID, newShipmentGatewayConfigId);
	}

} //ShipmentGatewayConfigImpl
