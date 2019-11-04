/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Ship Grp Inv Res</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getCreatedDatetime <em>Created Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getCurrentPromisedDate <em>Current Promised Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getOldPickStartDate <em>Old Pick Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#isPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getPromisedDatetime <em>Promised Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getQuantityNotAvailable <em>Quantity Not Available</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getReservedDatetime <em>Reserved Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGrpInvResImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemShipGrpInvResImpl extends BizEntityImpl implements OrderItemShipGrpInvRes {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getCreatedDatetime() <em>Created Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDatetime() <em>Created Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date createdDatetime = CREATED_DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPromisedDate() <em>Current Promised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPromisedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CURRENT_PROMISED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPromisedDate() <em>Current Promised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPromisedDate()
	 * @generated
	 * @ordered
	 */
	protected Date currentPromisedDate = CURRENT_PROMISED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldPickStartDate() <em>Old Pick Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPickStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date OLD_PICK_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldPickStartDate() <em>Old Pick Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPickStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date oldPickStartDate = OLD_PICK_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriority()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIORITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriority()
	 * @generated
	 * @ordered
	 */
	protected boolean priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromisedDatetime() <em>Promised Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromisedDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROMISED_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromisedDatetime() <em>Promised Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromisedDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date promisedDatetime = PROMISED_DATETIME_EDEFAULT;

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
	 * The default value of the '{@link #getQuantityNotAvailable() <em>Quantity Not Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNotAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_NOT_AVAILABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityNotAvailable() <em>Quantity Not Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNotAvailable()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityNotAvailable = QUANTITY_NOT_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserveOrderEnumId() <em>Reserve Order Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveOrderEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE_ORDER_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserveOrderEnumId() <em>Reserve Order Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveOrderEnumId()
	 * @generated
	 * @ordered
	 */
	protected String reserveOrderEnumId = RESERVE_ORDER_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedDatetime() <em>Reserved Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERVED_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservedDatetime() <em>Reserved Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date reservedDatetime = RESERVED_DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected long sequenceId = SEQUENCE_ID_EDEFAULT;

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
	protected OrderItemShipGrpInvResImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDatetime(Date newCreatedDatetime) {
		Date oldCreatedDatetime = createdDatetime;
		createdDatetime = newCreatedDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME, oldCreatedDatetime, createdDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCurrentPromisedDate() {
		return currentPromisedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPromisedDate(Date newCurrentPromisedDate) {
		Date oldCurrentPromisedDate = currentPromisedDate;
		currentPromisedDate = newCurrentPromisedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE, oldCurrentPromisedDate, currentPromisedDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOldPickStartDate() {
		return oldPickStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPickStartDate(Date newOldPickStartDate) {
		Date oldOldPickStartDate = oldPickStartDate;
		oldPickStartDate = newOldPickStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE, oldOldPickStartDate, oldPickStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(boolean newPriority) {
		boolean oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPromisedDatetime() {
		return promisedDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromisedDatetime(Date newPromisedDatetime) {
		Date oldPromisedDatetime = promisedDatetime;
		promisedDatetime = newPromisedDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME, oldPromisedDatetime, promisedDatetime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityNotAvailable() {
		return quantityNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityNotAvailable(BigDecimal newQuantityNotAvailable) {
		BigDecimal oldQuantityNotAvailable = quantityNotAvailable;
		quantityNotAvailable = newQuantityNotAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE, oldQuantityNotAvailable, quantityNotAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserveOrderEnumId() {
		return reserveOrderEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveOrderEnumId(String newReserveOrderEnumId) {
		String oldReserveOrderEnumId = reserveOrderEnumId;
		reserveOrderEnumId = newReserveOrderEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID, oldReserveOrderEnumId, reserveOrderEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservedDatetime() {
		return reservedDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedDatetime(Date newReservedDatetime) {
		Date oldReservedDatetime = reservedDatetime;
		reservedDatetime = newReservedDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME, oldReservedDatetime, reservedDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceId() {
		return sequenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(long newSequenceId) {
		long oldSequenceId = sequenceId;
		sequenceId = newSequenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID, oldSequenceId, sequenceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME:
				return getCreatedDatetime();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE:
				return getCurrentPromisedDate();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE:
				return getOldPickStartDate();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY:
				return isPriority();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME:
				return getPromisedDatetime();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE:
				return getQuantityNotAvailable();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID:
				return getReserveOrderEnumId();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME:
				return getReservedDatetime();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID:
				return getSequenceId();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID:
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
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME:
				setCreatedDatetime((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE:
				setCurrentPromisedDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE:
				setOldPickStartDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY:
				setPriority((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME:
				setPromisedDatetime((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE:
				setQuantityNotAvailable((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID:
				setReserveOrderEnumId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME:
				setReservedDatetime((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID:
				setSequenceId((Long)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID:
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
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME:
				setCreatedDatetime(CREATED_DATETIME_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE:
				setCurrentPromisedDate(CURRENT_PROMISED_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE:
				setOldPickStartDate(OLD_PICK_START_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME:
				setPromisedDatetime(PROMISED_DATETIME_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE:
				setQuantityNotAvailable(QUANTITY_NOT_AVAILABLE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID:
				setReserveOrderEnumId(RESERVE_ORDER_ENUM_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME:
				setReservedDatetime(RESERVED_DATETIME_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID:
				setSequenceId(SEQUENCE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID:
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
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME:
				return CREATED_DATETIME_EDEFAULT == null ? createdDatetime != null : !CREATED_DATETIME_EDEFAULT.equals(createdDatetime);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE:
				return CURRENT_PROMISED_DATE_EDEFAULT == null ? currentPromisedDate != null : !CURRENT_PROMISED_DATE_EDEFAULT.equals(currentPromisedDate);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE:
				return OLD_PICK_START_DATE_EDEFAULT == null ? oldPickStartDate != null : !OLD_PICK_START_DATE_EDEFAULT.equals(oldPickStartDate);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME:
				return PROMISED_DATETIME_EDEFAULT == null ? promisedDatetime != null : !PROMISED_DATETIME_EDEFAULT.equals(promisedDatetime);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE:
				return QUANTITY_NOT_AVAILABLE_EDEFAULT == null ? quantityNotAvailable != null : !QUANTITY_NOT_AVAILABLE_EDEFAULT.equals(quantityNotAvailable);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID:
				return RESERVE_ORDER_ENUM_ID_EDEFAULT == null ? reserveOrderEnumId != null : !RESERVE_ORDER_ENUM_ID_EDEFAULT.equals(reserveOrderEnumId);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME:
				return RESERVED_DATETIME_EDEFAULT == null ? reservedDatetime != null : !RESERVED_DATETIME_EDEFAULT.equals(reservedDatetime);
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID:
				return sequenceId != SEQUENCE_ID_EDEFAULT;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID:
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
		result.append(" (shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", createdDatetime: ");
		result.append(createdDatetime);
		result.append(", currentPromisedDate: ");
		result.append(currentPromisedDate);
		result.append(", oldPickStartDate: ");
		result.append(oldPickStartDate);
		result.append(", priority: ");
		result.append(priority);
		result.append(", promisedDatetime: ");
		result.append(promisedDatetime);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", quantityNotAvailable: ");
		result.append(quantityNotAvailable);
		result.append(", reserveOrderEnumId: ");
		result.append(reserveOrderEnumId);
		result.append(", reservedDatetime: ");
		result.append(reservedDatetime);
		result.append(", sequenceId: ");
		result.append(sequenceId);
		result.append(')');
		return result.toString();
	}

} //OrderItemShipGrpInvResImpl
