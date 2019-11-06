/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabel;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabelType;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelImpl#getInventoryItemLabelId <em>Inventory Item Label Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelImpl#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemLabelImpl extends BizEntityTypedImpl<InventoryItemLabelType> implements InventoryItemLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getInventoryItemLabelId() <em>Inventory Item Label Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_LABEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelId() <em>Inventory Item Label Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemLabelId = INVENTORY_ITEM_LABEL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getInventoryItemLabelTypeId() <em>Inventory Item Label Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemLabelType inventoryItemLabelTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_LABEL;
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
	public InventoryItemLabelType getInventoryItemLabelTypeId() {
		if (inventoryItemLabelTypeId != null && ((EObject)inventoryItemLabelTypeId).eIsProxy()) {
			InternalEObject oldInventoryItemLabelTypeId = (InternalEObject)inventoryItemLabelTypeId;
			inventoryItemLabelTypeId = (InventoryItemLabelType)eResolveProxy(oldInventoryItemLabelTypeId);
			if (inventoryItemLabelTypeId != oldInventoryItemLabelTypeId) {
			}
		}
		return inventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemLabelType basicGetInventoryItemLabelTypeId() {
		return inventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelTypeId(InventoryItemLabelType newInventoryItemLabelTypeId) {
		inventoryItemLabelTypeId = newInventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItemLabelAppls() {
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
	public String getInventoryItemLabelId() {
		return inventoryItemLabelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelId(String newInventoryItemLabelId) {
		inventoryItemLabelId = newInventoryItemLabelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID:
				return getInventoryItemLabelId();
			case InventoryPackage.INVENTORY_ITEM_LABEL__DESCRIPTION:
				return getDescription();
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE_ID:
				if (resolve) return getInventoryItemLabelTypeId();
				return basicGetInventoryItemLabelTypeId();
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
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId((InventoryItemLabelType)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId(INVENTORY_ITEM_LABEL_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId((InventoryItemLabelType)null);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID:
				return INVENTORY_ITEM_LABEL_ID_EDEFAULT == null ? inventoryItemLabelId != null : !INVENTORY_ITEM_LABEL_ID_EDEFAULT.equals(inventoryItemLabelId);
			case InventoryPackage.INVENTORY_ITEM_LABEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE_ID:
				return inventoryItemLabelTypeId != null;
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
		result.append(" (inventoryItemLabelId: ");
		result.append(inventoryItemLabelId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InventoryItemLabelImpl
