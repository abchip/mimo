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
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.receipt.ReceiptPackage;
import org.abchip.mimo.biz.shipment.receipt.RejectionReason;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getQuantityAccepted <em>Quantity Accepted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getRejectionId <em>Rejection Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getReceivedByUserLoginId <em>Received By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl#getShipmentId <em>Shipment Id</em>}</li>
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
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	 * The cached value of the '{@link #getRejectionId() <em>Rejection Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionId()
	 * @generated
	 * @ordered
	 */
	protected RejectionReason rejectionId;

	/**
	 * The cached value of the '{@link #getReceivedByUserLoginId() <em>Received By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin receivedByUserLoginId;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;

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
		datetimeReceived = newDatetimeReceived;
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
		itemDescription = newItemDescription;
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		productId = newProductId;
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
		quantityAccepted = newQuantityAccepted;
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
		quantityRejected = newQuantityRejected;
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
		receiptId = newReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getReceivedByUserLoginId() {
		if (receivedByUserLoginId != null && ((EObject)receivedByUserLoginId).eIsProxy()) {
			InternalEObject oldReceivedByUserLoginId = (InternalEObject)receivedByUserLoginId;
			receivedByUserLoginId = (UserLogin)eResolveProxy(oldReceivedByUserLoginId);
			if (receivedByUserLoginId != oldReceivedByUserLoginId) {
			}
		}
		return receivedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetReceivedByUserLoginId() {
		return receivedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedByUserLoginId(UserLogin newReceivedByUserLoginId) {
		receivedByUserLoginId = newReceivedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RejectionReason getRejectionId() {
		if (rejectionId != null && ((EObject)rejectionId).eIsProxy()) {
			InternalEObject oldRejectionId = (InternalEObject)rejectionId;
			rejectionId = (RejectionReason)eResolveProxy(oldRejectionId);
			if (rejectionId != oldRejectionId) {
			}
		}
		return rejectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RejectionReason basicGetRejectionId() {
		return rejectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRejectionId(RejectionReason newRejectionId) {
		rejectionId = newRejectionId;
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
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
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
		shipmentPackageSeqId = newShipmentPackageSeqId;
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
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				return getItemDescription();
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				return getQuantityAccepted();
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				return getQuantityRejected();
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				return getReturnId();
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				return getShipmentPackageSeqId();
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				if (resolve) return getRejectionId();
				return basicGetRejectionId();
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				if (resolve) return getReceivedByUserLoginId();
				return basicGetReceivedByUserLoginId();
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
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
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				setItemDescription((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				setQuantityAccepted((BigDecimal)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				setQuantityRejected((BigDecimal)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId((String)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				setRejectionId((RejectionReason)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				setReceivedByUserLoginId((UserLogin)newValue);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
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
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				setItemDescription(ITEM_DESCRIPTION_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				setQuantityAccepted(QUANTITY_ACCEPTED_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				setQuantityRejected(QUANTITY_REJECTED_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId(SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				setRejectionId((RejectionReason)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				setReceivedByUserLoginId((UserLogin)null);
				return;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				setShipmentId((Shipment)null);
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
			case ReceiptPackage.SHIPMENT_RECEIPT__ITEM_DESCRIPTION:
				return ITEM_DESCRIPTION_EDEFAULT == null ? itemDescription != null : !ITEM_DESCRIPTION_EDEFAULT.equals(itemDescription);
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_ACCEPTED:
				return QUANTITY_ACCEPTED_EDEFAULT == null ? quantityAccepted != null : !QUANTITY_ACCEPTED_EDEFAULT.equals(quantityAccepted);
			case ReceiptPackage.SHIPMENT_RECEIPT__QUANTITY_REJECTED:
				return QUANTITY_REJECTED_EDEFAULT == null ? quantityRejected != null : !QUANTITY_REJECTED_EDEFAULT.equals(quantityRejected);
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReceiptPackage.SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID:
				return SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT == null ? shipmentPackageSeqId != null : !SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT.equals(shipmentPackageSeqId);
			case ReceiptPackage.SHIPMENT_RECEIPT__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT__PRODUCT_ID:
				return productId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT__ORDER_ID:
				return orderId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT__REJECTION_ID:
				return rejectionId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID:
				return receivedByUserLoginId != null;
			case ReceiptPackage.SHIPMENT_RECEIPT__SHIPMENT_ID:
				return shipmentId != null;
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
		result.append(", itemDescription: ");
		result.append(itemDescription);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", quantityAccepted: ");
		result.append(quantityAccepted);
		result.append(", quantityRejected: ");
		result.append(quantityRejected);
		result.append(", returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(", shipmentPackageSeqId: ");
		result.append(shipmentPackageSeqId);
		result.append(')');
		return result.toString();
	}

} //ShipmentReceiptImpl
