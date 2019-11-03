/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.issuance.impl;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.issuance.IssuancePackage;
import org.abchip.mimo.biz.shipment.issuance.ItemIssuance;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Issuance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getIssuedByUserLoginId <em>Issued By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.impl.ItemIssuanceImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemIssuanceImpl extends BizEntityImpl implements ItemIssuance {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_ISSUANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected String itemIssuanceId = ITEM_ISSUANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CANCEL_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cancelQuantity = CANCEL_QUANTITY_EDEFAULT;

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
	 * The default value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemId = INVENTORY_ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuedByUserLoginId() <em>Issued By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuedByUserLoginId() <em>Issued By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String issuedByUserLoginId = ISSUED_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuedDateTime() <em>Issued Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuedDateTime() <em>Issued Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date issuedDateTime = ISSUED_DATE_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemIssuanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuancePackage.Literals.ITEM_ISSUANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCancelQuantity() {
		return cancelQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelQuantity(BigDecimal newCancelQuantity) {
		BigDecimal oldCancelQuantity = cancelQuantity;
		cancelQuantity = newCancelQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__CANCEL_QUANTITY, oldCancelQuantity, cancelQuantity));
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
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		String oldInventoryItemId = inventoryItemId;
		inventoryItemId = newInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuedByUserLoginId() {
		return issuedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuedByUserLoginId(String newIssuedByUserLoginId) {
		String oldIssuedByUserLoginId = issuedByUserLoginId;
		issuedByUserLoginId = newIssuedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN_ID, oldIssuedByUserLoginId, issuedByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssuedDateTime() {
		return issuedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuedDateTime(Date newIssuedDateTime) {
		Date oldIssuedDateTime = issuedDateTime;
		issuedDateTime = newIssuedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__ISSUED_DATE_TIME, oldIssuedDateTime, issuedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemIssuanceId() {
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(String newItemIssuanceId) {
		String oldItemIssuanceId = itemIssuanceId;
		itemIssuanceId = newItemIssuanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__ITEM_ISSUANCE_ID, oldItemIssuanceId, itemIssuanceId));
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
		String oldMaintHistSeqId = maintHistSeqId;
		maintHistSeqId = newMaintHistSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__MAINT_HIST_SEQ_ID, oldMaintHistSeqId, maintHistSeqId));
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
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
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
		String oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ID, oldShipmentId, shipmentId));
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
		String oldShipmentItemSeqId = shipmentItemSeqId;
		shipmentItemSeqId = newShipmentItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID, oldShipmentItemSeqId, shipmentItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItemDetails() {
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
	public List<String> inventoryTransfers() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IssuancePackage.ITEM_ISSUANCE__ITEM_ISSUANCE_ID:
				return getItemIssuanceId();
			case IssuancePackage.ITEM_ISSUANCE__CANCEL_QUANTITY:
				return getCancelQuantity();
			case IssuancePackage.ITEM_ISSUANCE__FIXED_ASSET_ID:
				return getFixedAssetId();
			case IssuancePackage.ITEM_ISSUANCE__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN_ID:
				return getIssuedByUserLoginId();
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_DATE_TIME:
				return getIssuedDateTime();
			case IssuancePackage.ITEM_ISSUANCE__MAINT_HIST_SEQ_ID:
				return getMaintHistSeqId();
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ID:
				return getOrderId();
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case IssuancePackage.ITEM_ISSUANCE__QUANTITY:
				return getQuantity();
			case IssuancePackage.ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ID:
				return getShipmentId();
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
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
			case IssuancePackage.ITEM_ISSUANCE__ITEM_ISSUANCE_ID:
				setItemIssuanceId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__CANCEL_QUANTITY:
				setCancelQuantity((BigDecimal)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN_ID:
				setIssuedByUserLoginId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_DATE_TIME:
				setIssuedDateTime((Date)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
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
			case IssuancePackage.ITEM_ISSUANCE__ITEM_ISSUANCE_ID:
				setItemIssuanceId(ITEM_ISSUANCE_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__CANCEL_QUANTITY:
				setCancelQuantity(CANCEL_QUANTITY_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN_ID:
				setIssuedByUserLoginId(ISSUED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_DATE_TIME:
				setIssuedDateTime(ISSUED_DATE_TIME_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId(MAINT_HIST_SEQ_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
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
			case IssuancePackage.ITEM_ISSUANCE__ITEM_ISSUANCE_ID:
				return ITEM_ISSUANCE_ID_EDEFAULT == null ? itemIssuanceId != null : !ITEM_ISSUANCE_ID_EDEFAULT.equals(itemIssuanceId);
			case IssuancePackage.ITEM_ISSUANCE__CANCEL_QUANTITY:
				return CANCEL_QUANTITY_EDEFAULT == null ? cancelQuantity != null : !CANCEL_QUANTITY_EDEFAULT.equals(cancelQuantity);
			case IssuancePackage.ITEM_ISSUANCE__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case IssuancePackage.ITEM_ISSUANCE__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN_ID:
				return ISSUED_BY_USER_LOGIN_ID_EDEFAULT == null ? issuedByUserLoginId != null : !ISSUED_BY_USER_LOGIN_ID_EDEFAULT.equals(issuedByUserLoginId);
			case IssuancePackage.ITEM_ISSUANCE__ISSUED_DATE_TIME:
				return ISSUED_DATE_TIME_EDEFAULT == null ? issuedDateTime != null : !ISSUED_DATE_TIME_EDEFAULT.equals(issuedDateTime);
			case IssuancePackage.ITEM_ISSUANCE__MAINT_HIST_SEQ_ID:
				return MAINT_HIST_SEQ_ID_EDEFAULT == null ? maintHistSeqId != null : !MAINT_HIST_SEQ_ID_EDEFAULT.equals(maintHistSeqId);
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case IssuancePackage.ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case IssuancePackage.ITEM_ISSUANCE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case IssuancePackage.ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case IssuancePackage.ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
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
		result.append(" (itemIssuanceId: ");
		result.append(itemIssuanceId);
		result.append(", cancelQuantity: ");
		result.append(cancelQuantity);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", issuedByUserLoginId: ");
		result.append(issuedByUserLoginId);
		result.append(", issuedDateTime: ");
		result.append(issuedDateTime);
		result.append(", maintHistSeqId: ");
		result.append(maintHistSeqId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", shipmentId: ");
		result.append(shipmentId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(')');
		return result.toString();
	}

} //ItemIssuanceImpl
