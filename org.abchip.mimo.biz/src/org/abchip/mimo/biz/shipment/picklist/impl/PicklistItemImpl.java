/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.shipment.picklist.PicklistItem;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getItemStatusId <em>Item Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicklistItemImpl extends BizEntityImpl implements PicklistItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected static final String PICKLIST_BIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected String picklistBinId = PICKLIST_BIN_ID_EDEFAULT;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getItemStatusId() <em>Item Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem itemStatusId;

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
	protected PicklistItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicklistPackage.Literals.PICKLIST_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemStatusId() {
		if (itemStatusId != null && ((EObject)itemStatusId).eIsProxy()) {
			InternalEObject oldItemStatusId = (InternalEObject)itemStatusId;
			itemStatusId = (StatusItem)eResolveProxy(oldItemStatusId);
			if (itemStatusId != oldItemStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID, oldItemStatusId, itemStatusId));
			}
		}
		return itemStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetItemStatusId() {
		return itemStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemStatusId(StatusItem newItemStatusId) {
		StatusItem oldItemStatusId = itemStatusId;
		itemStatusId = newItemStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID, oldItemStatusId, itemStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_ITEM__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__ORDER_ID, oldOrderId, orderId));
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
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicklistBinId() {
		return picklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistBinId(String newPicklistBinId) {
		String oldPicklistBinId = picklistBinId;
		picklistBinId = newPicklistBinId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__PICKLIST_BIN_ID, oldPicklistBinId, picklistBinId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__QUANTITY, oldQuantity, quantity));
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
		String oldShipGroupSeqId = shipGroupSeqId;
		shipGroupSeqId = newShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_ITEM__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicklistPackage.PICKLIST_ITEM__PICKLIST_BIN_ID:
				return getPicklistBinId();
			case PicklistPackage.PICKLIST_ITEM__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case PicklistPackage.PICKLIST_ITEM__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case PicklistPackage.PICKLIST_ITEM__QUANTITY:
				return getQuantity();
			case PicklistPackage.PICKLIST_ITEM__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID:
				if (resolve) return getItemStatusId();
				return basicGetItemStatusId();
			case PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID:
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
			case PicklistPackage.PICKLIST_ITEM__PICKLIST_BIN_ID:
				setPicklistBinId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID:
				setItemStatusId((StatusItem)newValue);
				return;
			case PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID:
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
			case PicklistPackage.PICKLIST_ITEM__PICKLIST_BIN_ID:
				setPicklistBinId(PICKLIST_BIN_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_ITEM__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_ITEM__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID:
				setItemStatusId((StatusItem)null);
				return;
			case PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID:
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
			case PicklistPackage.PICKLIST_ITEM__PICKLIST_BIN_ID:
				return PICKLIST_BIN_ID_EDEFAULT == null ? picklistBinId != null : !PICKLIST_BIN_ID_EDEFAULT.equals(picklistBinId);
			case PicklistPackage.PICKLIST_ITEM__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case PicklistPackage.PICKLIST_ITEM__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case PicklistPackage.PICKLIST_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case PicklistPackage.PICKLIST_ITEM__ORDER_ID:
				return orderId != null;
			case PicklistPackage.PICKLIST_ITEM__ITEM_STATUS_ID:
				return itemStatusId != null;
			case PicklistPackage.PICKLIST_ITEM__INVENTORY_ITEM_ID:
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
		result.append(" (picklistBinId: ");
		result.append(picklistBinId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //PicklistItemImpl
