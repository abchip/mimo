/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import org.abchip.mimo.biz.product.inventory.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InventoryFactoryImpl extends EFactoryImpl implements InventoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InventoryFactory init() {
		try {
			InventoryFactory theInventoryFactory = (InventoryFactory)EPackage.Registry.INSTANCE.getEFactory(InventoryPackage.eNS_URI);
			if (theInventoryFactory != null) {
				return theInventoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InventoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InventoryPackage.INVENTORY_ITEM: return (EObject)createInventoryItem();
			case InventoryPackage.INVENTORY_ITEM_ATTRIBUTE: return (EObject)createInventoryItemAttribute();
			case InventoryPackage.INVENTORY_ITEM_DETAIL: return (EObject)createInventoryItemDetail();
			case InventoryPackage.INVENTORY_ITEM_LABEL: return (EObject)createInventoryItemLabel();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL: return (EObject)createInventoryItemLabelAppl();
			case InventoryPackage.INVENTORY_ITEM_LABEL_TYPE: return (EObject)createInventoryItemLabelType();
			case InventoryPackage.INVENTORY_ITEM_STATUS: return (EObject)createInventoryItemStatus();
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES: return (EObject)createInventoryItemTempRes();
			case InventoryPackage.INVENTORY_ITEM_TYPE: return (EObject)createInventoryItemType();
			case InventoryPackage.INVENTORY_ITEM_TYPE_ATTR: return (EObject)createInventoryItemTypeAttr();
			case InventoryPackage.INVENTORY_ITEM_VARIANCE: return (EObject)createInventoryItemVariance();
			case InventoryPackage.INVENTORY_TRANSFER: return (EObject)createInventoryTransfer();
			case InventoryPackage.LOT: return (EObject)createLot();
			case InventoryPackage.PHYSICAL_INVENTORY: return (EObject)createPhysicalInventory();
			case InventoryPackage.VARIANCE_REASON: return (EObject)createVarianceReason();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem createInventoryItem() {
		InventoryItemImpl inventoryItem = new InventoryItemImpl();
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemAttribute createInventoryItemAttribute() {
		InventoryItemAttributeImpl inventoryItemAttribute = new InventoryItemAttributeImpl();
		return inventoryItemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemDetail createInventoryItemDetail() {
		InventoryItemDetailImpl inventoryItemDetail = new InventoryItemDetailImpl();
		return inventoryItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemLabel createInventoryItemLabel() {
		InventoryItemLabelImpl inventoryItemLabel = new InventoryItemLabelImpl();
		return inventoryItemLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemLabelAppl createInventoryItemLabelAppl() {
		InventoryItemLabelApplImpl inventoryItemLabelAppl = new InventoryItemLabelApplImpl();
		return inventoryItemLabelAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemLabelType createInventoryItemLabelType() {
		InventoryItemLabelTypeImpl inventoryItemLabelType = new InventoryItemLabelTypeImpl();
		return inventoryItemLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemStatus createInventoryItemStatus() {
		InventoryItemStatusImpl inventoryItemStatus = new InventoryItemStatusImpl();
		return inventoryItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemTempRes createInventoryItemTempRes() {
		InventoryItemTempResImpl inventoryItemTempRes = new InventoryItemTempResImpl();
		return inventoryItemTempRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType createInventoryItemType() {
		InventoryItemTypeImpl inventoryItemType = new InventoryItemTypeImpl();
		return inventoryItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemTypeAttr createInventoryItemTypeAttr() {
		InventoryItemTypeAttrImpl inventoryItemTypeAttr = new InventoryItemTypeAttrImpl();
		return inventoryItemTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemVariance createInventoryItemVariance() {
		InventoryItemVarianceImpl inventoryItemVariance = new InventoryItemVarianceImpl();
		return inventoryItemVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryTransfer createInventoryTransfer() {
		InventoryTransferImpl inventoryTransfer = new InventoryTransferImpl();
		return inventoryTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lot createLot() {
		LotImpl lot = new LotImpl();
		return lot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory createPhysicalInventory() {
		PhysicalInventoryImpl physicalInventory = new PhysicalInventoryImpl();
		return physicalInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarianceReason createVarianceReason() {
		VarianceReasonImpl varianceReason = new VarianceReasonImpl();
		return varianceReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryPackage getInventoryPackage() {
		return (InventoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InventoryPackage getPackage() {
		return InventoryPackage.eINSTANCE;
	}

} //InventoryFactoryImpl
