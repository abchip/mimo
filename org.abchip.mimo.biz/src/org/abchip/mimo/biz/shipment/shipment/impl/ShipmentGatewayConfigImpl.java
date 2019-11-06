/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The default value of the '{@link #getShipmentGatewayConfigId() <em>Shipment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentGatewayConfigId() <em>Shipment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentGatewayConfigId = SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipmentGatewayConfTypeId() <em>Shipment Gateway Conf Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentGatewayConfigType shipmentGatewayConfTypeId;

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
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfigType getShipmentGatewayConfTypeId() {
		if (shipmentGatewayConfTypeId != null && ((EObject)shipmentGatewayConfTypeId).eIsProxy()) {
			InternalEObject oldShipmentGatewayConfTypeId = (InternalEObject)shipmentGatewayConfTypeId;
			shipmentGatewayConfTypeId = (ShipmentGatewayConfigType)eResolveProxy(oldShipmentGatewayConfTypeId);
			if (shipmentGatewayConfTypeId != oldShipmentGatewayConfTypeId) {
			}
		}
		return shipmentGatewayConfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentGatewayConfigType basicGetShipmentGatewayConfTypeId() {
		return shipmentGatewayConfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfTypeId(ShipmentGatewayConfigType newShipmentGatewayConfTypeId) {
		shipmentGatewayConfTypeId = newShipmentGatewayConfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productStoreShipmentMeths() {
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
	public String getShipmentGatewayConfigId() {
		return shipmentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfigId(String newShipmentGatewayConfigId) {
		shipmentGatewayConfigId = newShipmentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID:
				return getShipmentGatewayConfigId();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION:
				return getDescription();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				if (resolve) return getShipmentGatewayConfTypeId();
				return basicGetShipmentGatewayConfTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID:
				setShipmentGatewayConfigId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				setShipmentGatewayConfTypeId((ShipmentGatewayConfigType)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID:
				setShipmentGatewayConfigId(SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				setShipmentGatewayConfTypeId((ShipmentGatewayConfigType)null);
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
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID:
				return SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? shipmentGatewayConfigId != null : !SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(shipmentGatewayConfigId);
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				return shipmentGatewayConfTypeId != null;
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
		result.append(" (shipmentGatewayConfigId: ");
		result.append(shipmentGatewayConfigId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayConfigImpl
