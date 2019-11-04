/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTypeImpl#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTypeImpl#getInventoryItemTypeAttrs <em>Inventory Item Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemTypeImpl extends BizEntityTypeImpl<InventoryItem> implements InventoryItemType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getInventoryItemTypeId() <em>Inventory Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemTypeId() <em>Inventory Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemTypeId = INVENTORY_ITEM_TYPE_ID_EDEFAULT;

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
	protected InventoryItemType parentTypeId;

	/**
	 * The cached value of the '{@link #getInventoryItemTypeAttrs() <em>Inventory Item Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inventoryItemTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (InventoryItemType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(InventoryItemType newParentTypeId) {
		InventoryItemType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInventoryItemTypeAttrs() {
		if (inventoryItemTypeAttrs == null) {
			inventoryItemTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS);
		}
		return inventoryItemTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childInventoryItemTypes() {
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
	public List<String> defaultFacilities() {
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
	public List<String> inventoryItems() {
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
	public List<String> products() {
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
	public String getInventoryItemTypeId() {
		return inventoryItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemTypeId(String newInventoryItemTypeId) {
		String oldInventoryItemTypeId = inventoryItemTypeId;
		inventoryItemTypeId = newInventoryItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID, oldInventoryItemTypeId, inventoryItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID:
				return getInventoryItemTypeId();
			case InventoryPackage.INVENTORY_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case InventoryPackage.INVENTORY_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS:
				return getInventoryItemTypeAttrs();
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
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((InventoryItemType)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS:
				getInventoryItemTypeAttrs().clear();
				getInventoryItemTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId(INVENTORY_ITEM_TYPE_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((InventoryItemType)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS:
				getInventoryItemTypeAttrs().clear();
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
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID:
				return INVENTORY_ITEM_TYPE_ID_EDEFAULT == null ? inventoryItemTypeId != null : !INVENTORY_ITEM_TYPE_ID_EDEFAULT.equals(inventoryItemTypeId);
			case InventoryPackage.INVENTORY_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.INVENTORY_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case InventoryPackage.INVENTORY_ITEM_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case InventoryPackage.INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS:
				return inventoryItemTypeAttrs != null && !inventoryItemTypeAttrs.isEmpty();
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
		result.append(" (inventoryItemTypeId: ");
		result.append(inventoryItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", inventoryItemTypeAttrs: ");
		result.append(inventoryItemTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //InventoryItemTypeImpl
