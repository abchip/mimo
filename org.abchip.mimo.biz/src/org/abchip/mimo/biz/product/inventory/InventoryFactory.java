/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage
 * @generated
 */
public interface InventoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryFactory eINSTANCE = org.abchip.mimo.biz.product.inventory.impl.InventoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	InventoryItem createInventoryItem();

	/**
	 * Returns a new object of class '<em>Item Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Attribute</em>'.
	 * @generated
	 */
	InventoryItemAttribute createInventoryItemAttribute();

	/**
	 * Returns a new object of class '<em>Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Detail</em>'.
	 * @generated
	 */
	InventoryItemDetail createInventoryItemDetail();

	/**
	 * Returns a new object of class '<em>Item Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Label</em>'.
	 * @generated
	 */
	InventoryItemLabel createInventoryItemLabel();

	/**
	 * Returns a new object of class '<em>Item Label Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Label Appl</em>'.
	 * @generated
	 */
	InventoryItemLabelAppl createInventoryItemLabelAppl();

	/**
	 * Returns a new object of class '<em>Item Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Label Type</em>'.
	 * @generated
	 */
	InventoryItemLabelType createInventoryItemLabelType();

	/**
	 * Returns a new object of class '<em>Item Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Status</em>'.
	 * @generated
	 */
	InventoryItemStatus createInventoryItemStatus();

	/**
	 * Returns a new object of class '<em>Item Temp Res</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Temp Res</em>'.
	 * @generated
	 */
	InventoryItemTempRes createInventoryItemTempRes();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	InventoryItemType createInventoryItemType();

	/**
	 * Returns a new object of class '<em>Item Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Attr</em>'.
	 * @generated
	 */
	InventoryItemTypeAttr createInventoryItemTypeAttr();

	/**
	 * Returns a new object of class '<em>Item Variance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Variance</em>'.
	 * @generated
	 */
	InventoryItemVariance createInventoryItemVariance();

	/**
	 * Returns a new object of class '<em>Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer</em>'.
	 * @generated
	 */
	InventoryTransfer createInventoryTransfer();

	/**
	 * Returns a new object of class '<em>Lot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lot</em>'.
	 * @generated
	 */
	Lot createLot();

	/**
	 * Returns a new object of class '<em>Physical Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Inventory</em>'.
	 * @generated
	 */
	PhysicalInventory createPhysicalInventory();

	/**
	 * Returns a new object of class '<em>Variance Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variance Reason</em>'.
	 * @generated
	 */
	VarianceReason createVarianceReason();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InventoryPackage getInventoryPackage();

} //InventoryFactory
