/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl#getShipmentTypeId <em>Shipment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl#getShipmentTypeAttrs <em>Shipment Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentTypeImpl extends BizEntityTypeImpl<Shipment> implements ShipmentType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentTypeId() <em>Shipment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentTypeId() <em>Shipment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentTypeId = SHIPMENT_TYPE_ID_EDEFAULT;

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
	protected ShipmentType parentTypeId;

	/**
	 * The cached value of the '{@link #getShipmentTypeAttrs() <em>Shipment Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shipmentTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_TYPE__DESCRIPTION, oldDescription, description));
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
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ShipmentType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ShipmentType newParentTypeId) {
		ShipmentType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentTypeId() {
		return shipmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentTypeId(String newShipmentTypeId) {
		String oldShipmentTypeId = shipmentTypeId;
		shipmentTypeId = newShipmentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ID, oldShipmentTypeId, shipmentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShipmentTypeAttrs() {
		if (shipmentTypeAttrs == null) {
			shipmentTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS);
		}
		return shipmentTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childShipmentTypes() {
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
	public List<String> shipments() {
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
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ID:
				return getShipmentTypeId();
			case Shipment_Package.SHIPMENT_TYPE__DESCRIPTION:
				return getDescription();
			case Shipment_Package.SHIPMENT_TYPE__HAS_TABLE:
				return isHasTable();
			case Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS:
				return getShipmentTypeAttrs();
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
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ID:
				setShipmentTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ShipmentType)newValue);
				return;
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS:
				getShipmentTypeAttrs().clear();
				getShipmentTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ID:
				setShipmentTypeId(SHIPMENT_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ShipmentType)null);
				return;
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS:
				getShipmentTypeAttrs().clear();
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
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ID:
				return SHIPMENT_TYPE_ID_EDEFAULT == null ? shipmentTypeId != null : !SHIPMENT_TYPE_ID_EDEFAULT.equals(shipmentTypeId);
			case Shipment_Package.SHIPMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Shipment_Package.SHIPMENT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case Shipment_Package.SHIPMENT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case Shipment_Package.SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS:
				return shipmentTypeAttrs != null && !shipmentTypeAttrs.isEmpty();
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
		result.append(" (shipmentTypeId: ");
		result.append(shipmentTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", shipmentTypeAttrs: ");
		result.append(shipmentTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //ShipmentTypeImpl
