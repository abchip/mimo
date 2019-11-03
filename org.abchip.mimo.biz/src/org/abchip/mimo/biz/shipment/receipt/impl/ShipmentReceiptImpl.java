/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt.impl;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.receipt.ReceiptPackage;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getQuantityAccepted <em>Quantity Accepted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReceivedByUserLoginId <em>Received By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getRejectionId <em>Rejection Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentReceiptImpl extends BizEntityImpl implements ShipmentReceipt {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReceiptId() <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiptId() <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected String receiptId = RECEIPT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatetimeReceived() <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetimeReceived() <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeReceived()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeReceived = DATETIME_RECEIVED_EDEFAULT;

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
	 * The default value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected String itemDescription = ITEM_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityAccepted() <em>Quantity Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_ACCEPTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityAccepted() <em>Quantity Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityAccepted()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityAccepted = QUANTITY_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityRejected() <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityRejected()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityRejected() <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityRejected()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityRejected = QUANTITY_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedByUserLoginId() <em>Received By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedByUserLoginId() <em>Received By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String receivedByUserLoginId = RECEIVED_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectionId() <em>Rejection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String REJECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectionId() <em>Rejection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionId()
	 * @generated
	 * @ordered
	 */
	protected String rejectionId = REJECTION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getShipmentPackageSeqId() <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentPackageSeqId() <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentPackageSeqId = SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReceiptPackage.Literals.SHIPMENT_RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeReceived() {
		return datetimeReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeReceived(Date newDatetimeReceived) {
		Date oldDatetimeReceived = datetimeReceived;
		datetimeReceived = newDatetimeReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__DATETIME_RECEIVED, oldDatetimeReceived, datetimeReceived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDescription(String newItemDescription) {
		String oldItemDescription = itemDescription;
		itemDescription = newItemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION, oldItemDescription, itemDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityAccepted() {
		return quantityAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityAccepted(BigDecimal newQuantityAccepted) {
		BigDecimal oldQuantityAccepted = quantityAccepted;
		quantityAccepted = newQuantityAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED, oldQuantityAccepted, quantityAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityRejected() {
		return quantityRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityRejected(BigDecimal newQuantityRejected) {
		BigDecimal oldQuantityRejected = quantityRejected;
		quantityRejected = newQuantityRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED, oldQuantityRejected, quantityRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceiptId() {
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiptId(String newReceiptId) {
		String oldReceiptId = receiptId;
		receiptId = newReceiptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__RECEIPT_ID, oldReceiptId, receiptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceivedByUserLoginId() {
		return receivedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedByUserLoginId(String newReceivedByUserLoginId) {
		String oldReceivedByUserLoginId = receivedByUserLoginId;
		receivedByUserLoginId = newReceivedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID, oldReceivedByUserLoginId, receivedByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRejectionId() {
		return rejectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRejectionId(String newRejectionId) {
		String oldRejectionId = rejectionId;
		rejectionId = newRejectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID, oldRejectionId, rejectionId));
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
		String oldReturnId = returnId;
		returnId = newReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID, oldReturnId, returnId));
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
		String oldReturnItemSeqId = returnItemSeqId;
		returnItemSeqId = newReturnItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID, oldReturnItemSeqId, returnItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID, oldShipmentId, shipmentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID, oldShipmentItemSeqId, shipmentItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentPackageSeqId() {
		return shipmentPackageSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentPackageSeqId(String newShipmentPackageSeqId) {
		String oldShipmentPackageSeqId = shipmentPackageSeqId;
		shipmentPackageSeqId = newShipmentPackageSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID, oldShipmentPackageSeqId, shipmentPackageSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIPT_ID:
				return getReceiptId();
			case ReceiptPackage.SHIPMENT_RECEIPT__DATETIME_RECEIVED:
				return getDatetimeReceived();
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				return getItemDescription();
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				return getOrderId();
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				return getProductId();
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				return getQuantityAccepted();
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				return getQuantityRejected();
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				return getReceivedByUserLoginId();
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				return getRejectionId();
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				return getReturnId();
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				return getShipmentId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				return getShipmentPackageSeqId();
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
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIPT_ID:
				setReceiptId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__DATETIME_RECEIVED:
				setDatetimeReceived((Date)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				setItemDescription((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				setQuantityAccepted((BigDecimal)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				setQuantityRejected((BigDecimal)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				setReceivedByUserLoginId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				setRejectionId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId((String)newValue);
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
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIPT_ID:
				setReceiptId(RECEIPT_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__DATETIME_RECEIVED:
				setDatetimeReceived(DATETIME_RECEIVED_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				setItemDescription(ITEM_DESCRIPTION_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				setQuantityAccepted(QUANTITY_ACCEPTED_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				setQuantityRejected(QUANTITY_REJECTED_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				setReceivedByUserLoginId(RECEIVED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				setRejectionId(REJECTION_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId(SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT);
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
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIPT_ID:
				return RECEIPT_ID_EDEFAULT == null ? receiptId != null : !RECEIPT_ID_EDEFAULT.equals(receiptId);
			case ReceiptPackage.SHIPMENT_RECEIPT__DATETIME_RECEIVED:
				return DATETIME_RECEIVED_EDEFAULT == null ? datetimeReceived != null : !DATETIME_RECEIVED_EDEFAULT.equals(datetimeReceived);
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				return ITEM_DESCRIPTION_EDEFAULT == null ? itemDescription != null : !ITEM_DESCRIPTION_EDEFAULT.equals(itemDescription);
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				return QUANTITY_ACCEPTED_EDEFAULT == null ? quantityAccepted != null : !QUANTITY_ACCEPTED_EDEFAULT.equals(quantityAccepted);
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				return QUANTITY_REJECTED_EDEFAULT == null ? quantityRejected != null : !QUANTITY_REJECTED_EDEFAULT.equals(quantityRejected);
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				return RECEIVED_BY_USER_LOGIN_ID_EDEFAULT == null ? receivedByUserLoginId != null : !RECEIVED_BY_USER_LOGIN_ID_EDEFAULT.equals(receivedByUserLoginId);
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				return REJECTION_ID_EDEFAULT == null ? rejectionId != null : !REJECTION_ID_EDEFAULT.equals(rejectionId);
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				return SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT == null ? shipmentPackageSeqId != null : !SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT.equals(shipmentPackageSeqId);
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
		result.append(" (receiptId: ");
		result.append(receiptId);
		result.append(", datetimeReceived: ");
		result.append(datetimeReceived);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", itemDescription: ");
		result.append(itemDescription);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", quantityAccepted: ");
		result.append(quantityAccepted);
		result.append(", quantityRejected: ");
		result.append(quantityRejected);
		result.append(", receivedByUserLoginId: ");
		result.append(receivedByUserLoginId);
		result.append(", rejectionId: ");
		result.append(rejectionId);
		result.append(", returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", shipmentId: ");
		result.append(shipmentId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(", shipmentPackageSeqId: ");
		result.append(shipmentPackageSeqId);
		result.append(')');
		return result.toString();
	}

} //ShipmentReceiptImpl
