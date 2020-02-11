/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Variance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getAvailableToPromiseVar <em>Available To Promise Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getQuantityOnHandVar <em>Quantity On Hand Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemVarianceImpl#getVarianceReasonId <em>Variance Reason Id</em>}</li>
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
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseVar(BigDecimal newAvailableToPromiseVar) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR, newAvailableToPromiseVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandVar() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandVar(BigDecimal newQuantityOnHandVar) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR, newQuantityOnHandVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory getPhysicalInventoryId() {
		return (PhysicalInventory)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(PhysicalInventory newPhysicalInventoryId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY_ID, newPhysicalInventoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarianceReason getVarianceReasonId() {
		return (VarianceReason)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarianceReasonId(VarianceReason newVarianceReasonId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__VARIANCE_REASON_ID, newVarianceReasonId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItemId() {
		return (InventoryItem)eGet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM_ID, newInventoryItemId);
	}

} //InventoryItemVarianceImpl
