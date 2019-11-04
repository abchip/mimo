/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Inventory Produced</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortInventoryProducedImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortInventoryProducedImpl extends BizEntityImpl implements WorkEffortInventoryProduced {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortInventoryProducedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_INVENTORY_PRODUCED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
			}
		}
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem basicGetInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		InventoryItem oldInventoryItemId = inventoryItemId;
		inventoryItemId = newInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
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
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
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
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(')');
		return result.toString();
	}

} //WorkEffortInventoryProducedImpl
