/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.shipment.issuance.ItemIssuance;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getInventoryItemDetailSeqId <em>Inventory Item Detail Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getAccountingQuantityDiff <em>Accounting Quantity Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getAvailableToPromiseDiff <em>Available To Promise Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getQuantityOnHandDiff <em>Quantity On Hand Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemDetailImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemDetailImpl extends BizEntityImpl implements InventoryItemDetail {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getInventoryItemDetailSeqId() <em>Inventory Item Detail Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemDetailSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_DETAIL_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemDetailSeqId() <em>Inventory Item Detail Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemDetailSeqId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemDetailSeqId = INVENTORY_ITEM_DETAIL_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountingQuantityDiff() <em>Accounting Quantity Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingQuantityDiff()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACCOUNTING_QUANTITY_DIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountingQuantityDiff() <em>Accounting Quantity Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingQuantityDiff()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal accountingQuantityDiff = ACCOUNTING_QUANTITY_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableToPromiseDiff() <em>Available To Promise Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseDiff()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVAILABLE_TO_PROMISE_DIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableToPromiseDiff() <em>Available To Promise Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseDiff()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal availableToPromiseDiff = AVAILABLE_TO_PROMISE_DIFF_EDEFAULT;

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
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintHistSeqId() <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintHistSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINT_HIST_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintHistSeqId() <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintHistSeqId()
	 * @generated
	 * @ordered
	 */
	protected String maintHistSeqId = MAINT_HIST_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityOnHandDiff() <em>Quantity On Hand Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandDiff()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_ON_HAND_DIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityOnHandDiff() <em>Quantity On Hand Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandDiff()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityOnHandDiff = QUANTITY_ON_HAND_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected String returnId = RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemSeqId = RETURN_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipGroupSeqId = SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentId = SHIPMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentItemSeqId() <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentItemSeqId() <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentItemSeqId = SHIPMENT_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitCost = UNIT_COST_EDEFAULT;

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
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected ItemIssuance itemIssuanceId;

	/**
	 * The cached value of the '{@link #getReceiptId() <em>Receipt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentReceipt receiptId;

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
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration reasonEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAccountingQuantityDiff() {
		return accountingQuantityDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingQuantityDiff(BigDecimal newAccountingQuantityDiff) {
		accountingQuantityDiff = newAccountingQuantityDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseDiff() {
		return availableToPromiseDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseDiff(BigDecimal newAvailableToPromiseDiff) {
		availableToPromiseDiff = newAvailableToPromiseDiff;
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
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveDate(Date newEffectiveDate) {
		effectiveDate = newEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemDetailSeqId() {
		return inventoryItemDetailSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemDetailSeqId(String newInventoryItemDetailSeqId) {
		inventoryItemDetailSeqId = newInventoryItemDetailSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuanceId() {
		if (itemIssuanceId != null && ((EObject)itemIssuanceId).eIsProxy()) {
			InternalEObject oldItemIssuanceId = (InternalEObject)itemIssuanceId;
			itemIssuanceId = (ItemIssuance)eResolveProxy(oldItemIssuanceId);
			if (itemIssuanceId != oldItemIssuanceId) {
			}
		}
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIssuance basicGetItemIssuanceId() {
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(ItemIssuance newItemIssuanceId) {
		itemIssuanceId = newItemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaintHistSeqId() {
		return maintHistSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintHistSeqId(String newMaintHistSeqId) {
		maintHistSeqId = newMaintHistSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		orderId = newOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		orderItemSeqId = newOrderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandDiff() {
		return quantityOnHandDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandDiff(BigDecimal newQuantityOnHandDiff) {
		quantityOnHandDiff = newQuantityOnHandDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnumId() {
		if (reasonEnumId != null && ((EObject)reasonEnumId).eIsProxy()) {
			InternalEObject oldReasonEnumId = (InternalEObject)reasonEnumId;
			reasonEnumId = (Enumeration)eResolveProxy(oldReasonEnumId);
			if (reasonEnumId != oldReasonEnumId) {
			}
		}
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(Enumeration newReasonEnumId) {
		reasonEnumId = newReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceipt getReceiptId() {
		if (receiptId != null && ((EObject)receiptId).eIsProxy()) {
			InternalEObject oldReceiptId = (InternalEObject)receiptId;
			receiptId = (ShipmentReceipt)eResolveProxy(oldReceiptId);
			if (receiptId != oldReceiptId) {
			}
		}
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentReceipt basicGetReceiptId() {
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiptId(ShipmentReceipt newReceiptId) {
		receiptId = newReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		returnId = newReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return returnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		returnItemSeqId = newReturnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return shipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		shipGroupSeqId = newShipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		shipmentId = newShipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentItemSeqId() {
		return shipmentItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentItemSeqId(String newShipmentItemSeqId) {
		shipmentItemSeqId = newShipmentItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitCost() {
		return unitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitCost(BigDecimal newUnitCost) {
		unitCost = newUnitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		workEffortId = newWorkEffortId;
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
		inventoryItemId = newInventoryItemId;
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
		physicalInventoryId = newPhysicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID:
				return getInventoryItemDetailSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF:
				return getAccountingQuantityDiff();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF:
				return getAvailableToPromiseDiff();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__DESCRIPTION:
				return getDescription();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE:
				return getEffectiveDate();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID:
				return getFixedAssetId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID:
				return getMaintHistSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ID:
				return getOrderId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF:
				return getQuantityOnHandDiff();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ID:
				return getReturnId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ID:
				return getShipmentId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__UNIT_COST:
				return getUnitCost();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE_ID:
				if (resolve) return getItemIssuanceId();
				return basicGetItemIssuanceId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RECEIPT_ID:
				if (resolve) return getReceiptId();
				return basicGetReceiptId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY_ID:
				if (resolve) return getPhysicalInventoryId();
				return basicGetPhysicalInventoryId();
			case InventoryPackage.INVENTORY_ITEM_DETAIL__REASON_ENUM_ID:
				if (resolve) return getReasonEnumId();
				return basicGetReasonEnumId();
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
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID:
				setInventoryItemDetailSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF:
				setAccountingQuantityDiff((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF:
				setAvailableToPromiseDiff((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE:
				setEffectiveDate((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF:
				setQuantityOnHandDiff((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__UNIT_COST:
				setUnitCost((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID:
				setInventoryItemDetailSeqId(INVENTORY_ITEM_DETAIL_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF:
				setAccountingQuantityDiff(ACCOUNTING_QUANTITY_DIFF_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF:
				setAvailableToPromiseDiff(AVAILABLE_TO_PROMISE_DIFF_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId(MAINT_HIST_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF:
				setQuantityOnHandDiff(QUANTITY_ON_HAND_DIFF_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__UNIT_COST:
				setUnitCost(UNIT_COST_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)null);
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
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID:
				return INVENTORY_ITEM_DETAIL_SEQ_ID_EDEFAULT == null ? inventoryItemDetailSeqId != null : !INVENTORY_ITEM_DETAIL_SEQ_ID_EDEFAULT.equals(inventoryItemDetailSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF:
				return ACCOUNTING_QUANTITY_DIFF_EDEFAULT == null ? accountingQuantityDiff != null : !ACCOUNTING_QUANTITY_DIFF_EDEFAULT.equals(accountingQuantityDiff);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF:
				return AVAILABLE_TO_PROMISE_DIFF_EDEFAULT == null ? availableToPromiseDiff != null : !AVAILABLE_TO_PROMISE_DIFF_EDEFAULT.equals(availableToPromiseDiff);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID:
				return MAINT_HIST_SEQ_ID_EDEFAULT == null ? maintHistSeqId != null : !MAINT_HIST_SEQ_ID_EDEFAULT.equals(maintHistSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF:
				return QUANTITY_ON_HAND_DIFF_EDEFAULT == null ? quantityOnHandDiff != null : !QUANTITY_ON_HAND_DIFF_EDEFAULT.equals(quantityOnHandDiff);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__UNIT_COST:
				return UNIT_COST_EDEFAULT == null ? unitCost != null : !UNIT_COST_EDEFAULT.equals(unitCost);
			case InventoryPackage.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__WORK_EFFORT_ID:
				return workEffortId != null;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE_ID:
				return itemIssuanceId != null;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__RECEIPT_ID:
				return receiptId != null;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY_ID:
				return physicalInventoryId != null;
			case InventoryPackage.INVENTORY_ITEM_DETAIL__REASON_ENUM_ID:
				return reasonEnumId != null;
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
		result.append(" (inventoryItemDetailSeqId: ");
		result.append(inventoryItemDetailSeqId);
		result.append(", accountingQuantityDiff: ");
		result.append(accountingQuantityDiff);
		result.append(", availableToPromiseDiff: ");
		result.append(availableToPromiseDiff);
		result.append(", description: ");
		result.append(description);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", maintHistSeqId: ");
		result.append(maintHistSeqId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", quantityOnHandDiff: ");
		result.append(quantityOnHandDiff);
		result.append(", returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", shipmentId: ");
		result.append(shipmentId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(", unitCost: ");
		result.append(unitCost);
		result.append(')');
		return result.toString();
	}

} //InventoryItemDetailImpl
