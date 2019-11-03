/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.return_.ReturnItem;
import org.abchip.mimo.biz.order.return_.ReturnItemType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getExpectedItemStatus <em>Expected Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnPrice <em>Return Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnQuantity <em>Return Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnReasonId <em>Return Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemImpl extends BizEntityTypedImpl<ReturnItemType> implements ReturnItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getExpectedItemStatus() <em>Expected Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedItemStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_ITEM_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedItemStatus() <em>Expected Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedItemStatus()
	 * @generated
	 * @ordered
	 */
	protected String expectedItemStatus = EXPECTED_ITEM_STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getReceivedQuantity() <em>Received Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RECEIVED_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedQuantity() <em>Received Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal receivedQuantity = RECEIVED_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemResponseId() <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemResponseId() <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemResponseId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemResponseId = RETURN_ITEM_RESPONSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemTypeId() <em>Return Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemTypeId() <em>Return Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemTypeId = RETURN_ITEM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnPrice() <em>Return Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RETURN_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnPrice() <em>Return Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal returnPrice = RETURN_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnQuantity() <em>Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RETURN_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnQuantity() <em>Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal returnQuantity = RETURN_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnReasonId() <em>Return Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnReasonId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_REASON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnReasonId() <em>Return Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnReasonId()
	 * @generated
	 * @ordered
	 */
	protected String returnReasonId = RETURN_REASON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnTypeId = RETURN_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedItemStatus() {
		return expectedItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedItemStatus(String newExpectedItemStatus) {
		String oldExpectedItemStatus = expectedItemStatus;
		expectedItemStatus = newExpectedItemStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS, oldExpectedItemStatus, expectedItemStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReceivedQuantity() {
		return receivedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedQuantity(BigDecimal newReceivedQuantity) {
		BigDecimal oldReceivedQuantity = receivedQuantity;
		receivedQuantity = newReceivedQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY, oldReceivedQuantity, receivedQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_ID, oldReturnId, returnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemResponseId() {
		return returnItemResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemResponseId(String newReturnItemResponseId) {
		String oldReturnItemResponseId = returnItemResponseId;
		returnItemResponseId = newReturnItemResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID, oldReturnItemResponseId, returnItemResponseId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID, oldReturnItemSeqId, returnItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemTypeId() {
		return returnItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemTypeId(String newReturnItemTypeId) {
		String oldReturnItemTypeId = returnItemTypeId;
		returnItemTypeId = newReturnItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID, oldReturnItemTypeId, returnItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnPrice(BigDecimal newReturnPrice) {
		BigDecimal oldReturnPrice = returnPrice;
		returnPrice = newReturnPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_PRICE, oldReturnPrice, returnPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReturnQuantity() {
		return returnQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnQuantity(BigDecimal newReturnQuantity) {
		BigDecimal oldReturnQuantity = returnQuantity;
		returnQuantity = newReturnQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_QUANTITY, oldReturnQuantity, returnQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnReasonId() {
		return returnReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnReasonId(String newReturnReasonId) {
		String oldReturnReasonId = returnReasonId;
		returnReasonId = newReturnReasonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_REASON_ID, oldReturnReasonId, returnReasonId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnTypeId() {
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(String newReturnTypeId) {
		String oldReturnTypeId = returnTypeId;
		returnTypeId = newReturnTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID, oldReturnTypeId, returnTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				return getReturnId();
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				return getDescription();
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				return getExpectedItemStatus();
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				return getOrderId();
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				return getProductId();
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				return getReceivedQuantity();
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				return getReturnItemResponseId();
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				return getReturnItemTypeId();
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				return getReturnPrice();
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				return getReturnQuantity();
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				return getReturnReasonId();
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				return getReturnTypeId();
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				return getStatusId();
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
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				setExpectedItemStatus((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				setReceivedQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				setReturnPrice((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				setReturnQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				setReturnReasonId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				setReturnTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				setStatusId((String)newValue);
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
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				setExpectedItemStatus(EXPECTED_ITEM_STATUS_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				setReceivedQuantity(RECEIVED_QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId(RETURN_ITEM_RESPONSE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId(RETURN_ITEM_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				setReturnPrice(RETURN_PRICE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				setReturnQuantity(RETURN_QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				setReturnReasonId(RETURN_REASON_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				setReturnTypeId(RETURN_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				return EXPECTED_ITEM_STATUS_EDEFAULT == null ? expectedItemStatus != null : !EXPECTED_ITEM_STATUS_EDEFAULT.equals(expectedItemStatus);
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				return RECEIVED_QUANTITY_EDEFAULT == null ? receivedQuantity != null : !RECEIVED_QUANTITY_EDEFAULT.equals(receivedQuantity);
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				return RETURN_ITEM_RESPONSE_ID_EDEFAULT == null ? returnItemResponseId != null : !RETURN_ITEM_RESPONSE_ID_EDEFAULT.equals(returnItemResponseId);
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				return RETURN_ITEM_TYPE_ID_EDEFAULT == null ? returnItemTypeId != null : !RETURN_ITEM_TYPE_ID_EDEFAULT.equals(returnItemTypeId);
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				return RETURN_PRICE_EDEFAULT == null ? returnPrice != null : !RETURN_PRICE_EDEFAULT.equals(returnPrice);
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				return RETURN_QUANTITY_EDEFAULT == null ? returnQuantity != null : !RETURN_QUANTITY_EDEFAULT.equals(returnQuantity);
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				return RETURN_REASON_ID_EDEFAULT == null ? returnReasonId != null : !RETURN_REASON_ID_EDEFAULT.equals(returnReasonId);
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				return RETURN_TYPE_ID_EDEFAULT == null ? returnTypeId != null : !RETURN_TYPE_ID_EDEFAULT.equals(returnTypeId);
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(" (returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", description: ");
		result.append(description);
		result.append(", expectedItemStatus: ");
		result.append(expectedItemStatus);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", receivedQuantity: ");
		result.append(receivedQuantity);
		result.append(", returnItemResponseId: ");
		result.append(returnItemResponseId);
		result.append(", returnItemTypeId: ");
		result.append(returnItemTypeId);
		result.append(", returnPrice: ");
		result.append(returnPrice);
		result.append(", returnQuantity: ");
		result.append(returnQuantity);
		result.append(", returnReasonId: ");
		result.append(returnReasonId);
		result.append(", returnTypeId: ");
		result.append(returnTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ReturnItemImpl
