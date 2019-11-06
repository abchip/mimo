/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayConfigTypeImpl extends BizEntityTypeImpl<ShipmentGatewayConfig> implements ShipmentGatewayConfigType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentGatewayConfTypeId() <em>Shipment Gateway Conf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_GATEWAY_CONF_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentGatewayConfTypeId() <em>Shipment Gateway Conf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentGatewayConfTypeId = SHIPMENT_GATEWAY_CONF_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentGatewayConfigType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_CONFIG_TYPE;
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
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfigType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ShipmentGatewayConfigType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentGatewayConfigType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ShipmentGatewayConfigType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childShipmentGatewayConfigTypes() {
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
	public List<String> shipmentGatewayConfigs() {
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
	public String getShipmentGatewayConfTypeId() {
		return shipmentGatewayConfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfTypeId(String newShipmentGatewayConfTypeId) {
		shipmentGatewayConfTypeId = newShipmentGatewayConfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				return getShipmentGatewayConfTypeId();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION:
				return getDescription();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE:
				return isHasTable();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				setShipmentGatewayConfTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ShipmentGatewayConfigType)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				setShipmentGatewayConfTypeId(SHIPMENT_GATEWAY_CONF_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ShipmentGatewayConfigType)null);
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
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID:
				return SHIPMENT_GATEWAY_CONF_TYPE_ID_EDEFAULT == null ? shipmentGatewayConfTypeId != null : !SHIPMENT_GATEWAY_CONF_TYPE_ID_EDEFAULT.equals(shipmentGatewayConfTypeId);
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (shipmentGatewayConfTypeId: ");
		result.append(shipmentGatewayConfTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayConfigTypeImpl
