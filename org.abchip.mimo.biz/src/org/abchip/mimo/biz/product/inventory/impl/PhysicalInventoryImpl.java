/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Date;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getGeneralComments <em>General Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPhysicalInventoryDate <em>Physical Inventory Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalInventoryImpl extends BizEntityImpl implements PhysicalInventory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.PHYSICAL_INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneralComments() {
		return (String)eGet(InventoryPackage.Literals.PHYSICAL_INVENTORY__GENERAL_COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralComments(String newGeneralComments) {
		eSet(InventoryPackage.Literals.PHYSICAL_INVENTORY__GENERAL_COMMENTS, newGeneralComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPhysicalInventoryDate() {
		return (Date)eGet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryDate(Date newPhysicalInventoryDate) {
		eSet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE, newPhysicalInventoryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalInventoryId() {
		return (String)eGet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(String newPhysicalInventoryId) {
		eSet(InventoryPackage.Literals.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID, newPhysicalInventoryId);
	}

} //PhysicalInventoryImpl
