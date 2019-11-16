/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemVariance;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.product.inventory.VarianceReason;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Variance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getAvailableToPromiseVar <em>Available To Promise Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getQuantityOnHandVar <em>Quantity On Hand Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemVarianceImpl extends BizEntityImpl implements InventoryItemVariance {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getAvailableToPromiseVar() <em>Available To Promise Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseVar()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVAILABLE_TO_PROMISE_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableToPromiseVar() <em>Available To Promise Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseVar()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal availableToPromiseVar = AVAILABLE_TO_PROMISE_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityOnHandVar() <em>Quantity On Hand Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandVar()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_ON_HAND_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityOnHandVar() <em>Quantity On Hand Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandVar()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityOnHandVar = QUANTITY_ON_HAND_VAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected PhysicalInventory physicalInventoryId;

	/**
	 * The cached value of the '{@link #getVarianceReasonId() <em>Variance Reason Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonId()
	 * @generated
	 * @ordered
	 */
	protected VarianceReason varianceReasonId;

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
	protected InventoryItemVarianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseVar() {
		return availableToPromiseVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseVar(BigDecimal newAvailableToPromiseVar) {
		BigDecimal oldAvailableToPromiseVar = availableToPromiseVar;
		availableToPromiseVar = newAvailableToPromiseVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR, oldAvailableToPromiseVar, availableToPromiseVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandVar() {
		return quantityOnHandVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandVar(BigDecimal newQuantityOnHandVar) {
		BigDecimal oldQuantityOnHandVar = quantityOnHandVar;
		quantityOnHandVar = newQuantityOnHandVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR, oldQuantityOnHandVar, quantityOnHandVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory getPhysicalInventoryId() {
		if (physicalInventoryId != null && ((EObject)physicalInventoryId).eIsProxy()) {
			InternalEObject oldPhysicalInventoryId = (InternalEObject)physicalInventoryId;
			physicalInventoryId = (PhysicalInventory)eResolveProxy(oldPhysicalInventoryId);
			if (physicalInventoryId != oldPhysicalInventoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID, oldPhysicalInventoryId, physicalInventoryId));
			}
		}
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalInventory basicGetPhysicalInventoryId() {
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(PhysicalInventory newPhysicalInventoryId) {
		PhysicalInventory oldPhysicalInventoryId = physicalInventoryId;
		physicalInventoryId = newPhysicalInventoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID, oldPhysicalInventoryId, physicalInventoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarianceReason getVarianceReasonId() {
		if (varianceReasonId != null && ((EObject)varianceReasonId).eIsProxy()) {
			InternalEObject oldVarianceReasonId = (InternalEObject)varianceReasonId;
			varianceReasonId = (VarianceReason)eResolveProxy(oldVarianceReasonId);
			if (varianceReasonId != oldVarianceReasonId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID, oldVarianceReasonId, varianceReasonId));
			}
		}
		return varianceReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarianceReason basicGetVarianceReasonId() {
		return varianceReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarianceReasonId(VarianceReason newVarianceReasonId) {
		VarianceReason oldVarianceReasonId = varianceReasonId;
		varianceReasonId = newVarianceReasonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID, oldVarianceReasonId, varianceReasonId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR:
				return getAvailableToPromiseVar();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__COMMENTS:
				return getComments();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR:
				return getQuantityOnHandVar();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID:
				if (resolve) return getPhysicalInventoryId();
				return basicGetPhysicalInventoryId();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID:
				if (resolve) return getVarianceReasonId();
				return basicGetVarianceReasonId();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID:
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
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR:
				setAvailableToPromiseVar((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__COMMENTS:
				setComments((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR:
				setQuantityOnHandVar((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID:
				setVarianceReasonId((VarianceReason)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID:
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
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR:
				setAvailableToPromiseVar(AVAILABLE_TO_PROMISE_VAR_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR:
				setQuantityOnHandVar(QUANTITY_ON_HAND_VAR_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID:
				setVarianceReasonId((VarianceReason)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID:
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
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR:
				return AVAILABLE_TO_PROMISE_VAR_EDEFAULT == null ? availableToPromiseVar != null : !AVAILABLE_TO_PROMISE_VAR_EDEFAULT.equals(availableToPromiseVar);
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR:
				return QUANTITY_ON_HAND_VAR_EDEFAULT == null ? quantityOnHandVar != null : !QUANTITY_ON_HAND_VAR_EDEFAULT.equals(quantityOnHandVar);
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID:
				return physicalInventoryId != null;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID:
				return varianceReasonId != null;
			case InventoryPackage.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID:
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
		result.append(" (availableToPromiseVar: ");
		result.append(availableToPromiseVar);
		result.append(", comments: ");
		result.append(comments);
		result.append(", quantityOnHandVar: ");
		result.append(quantityOnHandVar);
		result.append(')');
		return result.toString();
	}

} //InventoryItemVarianceImpl
