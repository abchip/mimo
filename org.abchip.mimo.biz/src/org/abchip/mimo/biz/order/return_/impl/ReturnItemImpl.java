/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnItem;
import org.abchip.mimo.biz.order.return_.ReturnItemResponse;
import org.abchip.mimo.biz.order.return_.ReturnItemType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.ReturnReason;
import org.abchip.mimo.biz.order.return_.ReturnType;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnPrice <em>Return Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnQuantity <em>Return Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnReasonId <em>Return Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getExpectedItemStatus <em>Expected Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl#getProductId <em>Product Id</em>}</li>
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
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeader returnId;

	/**
	 * The cached value of the '{@link #getReturnReasonId() <em>Return Reason Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnReasonId()
	 * @generated
	 * @ordered
	 */
	protected ReturnReason returnReasonId;

	/**
	 * The cached value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnType returnTypeId;

	/**
	 * The cached value of the '{@link #getReturnItemTypeId() <em>Return Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnItemType returnItemTypeId;

	/**
	 * The cached value of the '{@link #getReturnItemResponseId() <em>Return Item Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemResponseId()
	 * @generated
	 * @ordered
	 */
	protected ReturnItemResponse returnItemResponseId;

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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getExpectedItemStatus() <em>Expected Item Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedItemStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem expectedItemStatus;

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
	public StatusItem getExpectedItemStatus() {
		if (expectedItemStatus != null && ((EObject)expectedItemStatus).eIsProxy()) {
			InternalEObject oldExpectedItemStatus = (InternalEObject)expectedItemStatus;
			expectedItemStatus = (StatusItem)eResolveProxy(oldExpectedItemStatus);
			if (expectedItemStatus != oldExpectedItemStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS, oldExpectedItemStatus, expectedItemStatus));
			}
		}
		return expectedItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetExpectedItemStatus() {
		return expectedItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedItemStatus(StatusItem newExpectedItemStatus) {
		StatusItem oldExpectedItemStatus = expectedItemStatus;
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
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__ORDER_ID, oldOrderId, orderId));
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__PRODUCT_ID, oldProductId, productId));
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
		Product oldProductId = productId;
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
	public ReturnHeader getReturnId() {
		if (returnId != null && ((EObject)returnId).eIsProxy()) {
			InternalEObject oldReturnId = (InternalEObject)returnId;
			returnId = (ReturnHeader)eResolveProxy(oldReturnId);
			if (returnId != oldReturnId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__RETURN_ID, oldReturnId, returnId));
			}
		}
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeader basicGetReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		ReturnHeader oldReturnId = returnId;
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
	public ReturnItemResponse getReturnItemResponseId() {
		if (returnItemResponseId != null && ((EObject)returnItemResponseId).eIsProxy()) {
			InternalEObject oldReturnItemResponseId = (InternalEObject)returnItemResponseId;
			returnItemResponseId = (ReturnItemResponse)eResolveProxy(oldReturnItemResponseId);
			if (returnItemResponseId != oldReturnItemResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID, oldReturnItemResponseId, returnItemResponseId));
			}
		}
		return returnItemResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnItemResponse basicGetReturnItemResponseId() {
		return returnItemResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemResponseId(ReturnItemResponse newReturnItemResponseId) {
		ReturnItemResponse oldReturnItemResponseId = returnItemResponseId;
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
	public ReturnItemType getReturnItemTypeId() {
		if (returnItemTypeId != null && ((EObject)returnItemTypeId).eIsProxy()) {
			InternalEObject oldReturnItemTypeId = (InternalEObject)returnItemTypeId;
			returnItemTypeId = (ReturnItemType)eResolveProxy(oldReturnItemTypeId);
			if (returnItemTypeId != oldReturnItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID, oldReturnItemTypeId, returnItemTypeId));
			}
		}
		return returnItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnItemType basicGetReturnItemTypeId() {
		return returnItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemTypeId(ReturnItemType newReturnItemTypeId) {
		ReturnItemType oldReturnItemTypeId = returnItemTypeId;
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
	public ReturnReason getReturnReasonId() {
		if (returnReasonId != null && ((EObject)returnReasonId).eIsProxy()) {
			InternalEObject oldReturnReasonId = (InternalEObject)returnReasonId;
			returnReasonId = (ReturnReason)eResolveProxy(oldReturnReasonId);
			if (returnReasonId != oldReturnReasonId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__RETURN_REASON_ID, oldReturnReasonId, returnReasonId));
			}
		}
		return returnReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnReason basicGetReturnReasonId() {
		return returnReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnReasonId(ReturnReason newReturnReasonId) {
		ReturnReason oldReturnReasonId = returnReasonId;
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
	public ReturnType getReturnTypeId() {
		if (returnTypeId != null && ((EObject)returnTypeId).eIsProxy()) {
			InternalEObject oldReturnTypeId = (InternalEObject)returnTypeId;
			returnTypeId = (ReturnType)eResolveProxy(oldReturnTypeId);
			if (returnTypeId != oldReturnTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID, oldReturnTypeId, returnTypeId));
			}
		}
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType basicGetReturnTypeId() {
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(ReturnType newReturnTypeId) {
		ReturnType oldReturnTypeId = returnTypeId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ITEM__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				return getDescription();
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				return getReceivedQuantity();
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				return getReturnPrice();
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				return getReturnQuantity();
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				if (resolve) return getReturnId();
				return basicGetReturnId();
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				if (resolve) return getReturnReasonId();
				return basicGetReturnReasonId();
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				if (resolve) return getReturnTypeId();
				return basicGetReturnTypeId();
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				if (resolve) return getReturnItemTypeId();
				return basicGetReturnItemTypeId();
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				if (resolve) return getReturnItemResponseId();
				return basicGetReturnItemResponseId();
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				if (resolve) return getExpectedItemStatus();
				return basicGetExpectedItemStatus();
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				setReceivedQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				setReturnPrice((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				setReturnQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				setReturnId((ReturnHeader)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				setReturnReasonId((ReturnReason)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				setReturnTypeId((ReturnType)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId((ReturnItemType)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId((ReturnItemResponse)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				setExpectedItemStatus((StatusItem)newValue);
				return;
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				setReceivedQuantity(RECEIVED_QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				setReturnPrice(RETURN_PRICE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				setReturnQuantity(RETURN_QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				setReturnId((ReturnHeader)null);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				setReturnReasonId((ReturnReason)null);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				setReturnTypeId((ReturnType)null);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId((ReturnItemType)null);
				return;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId((ReturnItemResponse)null);
				return;
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				setExpectedItemStatus((StatusItem)null);
				return;
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				setProductId((Product)null);
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
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReturnPackage.RETURN_ITEM__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case ReturnPackage.RETURN_ITEM__RECEIVED_QUANTITY:
				return RECEIVED_QUANTITY_EDEFAULT == null ? receivedQuantity != null : !RECEIVED_QUANTITY_EDEFAULT.equals(receivedQuantity);
			case ReturnPackage.RETURN_ITEM__RETURN_PRICE:
				return RETURN_PRICE_EDEFAULT == null ? returnPrice != null : !RETURN_PRICE_EDEFAULT.equals(returnPrice);
			case ReturnPackage.RETURN_ITEM__RETURN_QUANTITY:
				return RETURN_QUANTITY_EDEFAULT == null ? returnQuantity != null : !RETURN_QUANTITY_EDEFAULT.equals(returnQuantity);
			case ReturnPackage.RETURN_ITEM__RETURN_ID:
				return returnId != null;
			case ReturnPackage.RETURN_ITEM__RETURN_REASON_ID:
				return returnReasonId != null;
			case ReturnPackage.RETURN_ITEM__RETURN_TYPE_ID:
				return returnTypeId != null;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_TYPE_ID:
				return returnItemTypeId != null;
			case ReturnPackage.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID:
				return returnItemResponseId != null;
			case ReturnPackage.RETURN_ITEM__ORDER_ID:
				return orderId != null;
			case ReturnPackage.RETURN_ITEM__STATUS_ID:
				return statusId != null;
			case ReturnPackage.RETURN_ITEM__EXPECTED_ITEM_STATUS:
				return expectedItemStatus != null;
			case ReturnPackage.RETURN_ITEM__PRODUCT_ID:
				return productId != null;
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
		result.append(" (returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", description: ");
		result.append(description);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", receivedQuantity: ");
		result.append(receivedQuantity);
		result.append(", returnPrice: ");
		result.append(returnPrice);
		result.append(", returnQuantity: ");
		result.append(returnQuantity);
		result.append(')');
		return result.toString();
	}

} //ReturnItemImpl
