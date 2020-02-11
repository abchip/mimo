/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnReasonId <em>Return Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItem#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ReturnItem extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expected Item Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Item Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Item Status</em>' reference.
	 * @see #setExpectedItemStatus(StatusItem)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ExpectedItemStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getExpectedItemStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Item Status</em>' reference.
	 * @see #getExpectedItemStatus()
	 * @generated
	 */
	void setExpectedItemStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ProductId()
	 * @model keys="productId"
	 *        annotation="mimo-ent-slot help='we need this field to be able to figure out net sales of a product'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Received Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Quantity</em>' attribute.
	 * @see #setReceivedQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReceivedQuantity()
	 * @model annotation="mimo-ent-slot audit='true' help='actually received from the customer'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReceivedQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Quantity</em>' attribute.
	 * @see #getReceivedQuantity()
	 * @generated
	 */
	void setReceivedQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' reference.
	 * @see #setReturnId(ReturnHeader)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnId()
	 * @model keys="returnId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnId <em>Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' reference.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Return Item Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Response Id</em>' reference.
	 * @see #setReturnItemResponseId(ReturnItemResponse)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnItemResponseId()
	 * @model keys="returnItemResponseId"
	 * @generated
	 */
	ReturnItemResponse getReturnItemResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemResponseId <em>Return Item Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Response Id</em>' reference.
	 * @see #getReturnItemResponseId()
	 * @generated
	 */
	void setReturnItemResponseId(ReturnItemResponse value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Type Id</em>' reference.
	 * @see #setReturnItemTypeId(ReturnItemType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnItemTypeId()
	 * @model keys="returnItemTypeId"
	 *        annotation="mimo-ent-slot help='what is returned: a product, a service, etc'"
	 * @generated
	 */
	ReturnItemType getReturnItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemTypeId <em>Return Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Type Id</em>' reference.
	 * @see #getReturnItemTypeId()
	 * @generated
	 */
	void setReturnItemTypeId(ReturnItemType value);

	/**
	 * Returns the value of the '<em><b>Return Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Price</em>' attribute.
	 * @see #setReturnPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnPrice()
	 * @model annotation="mimo-ent-slot audit='true'"
	 *        annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReturnPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Price</em>' attribute.
	 * @see #getReturnPrice()
	 * @generated
	 */
	void setReturnPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Quantity</em>' attribute.
	 * @see #setReturnQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnQuantity()
	 * @model annotation="mimo-ent-slot audit='true' help='promised by the customer'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReturnQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Quantity</em>' attribute.
	 * @see #getReturnQuantity()
	 * @generated
	 */
	void setReturnQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Reason Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Reason Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Reason Id</em>' reference.
	 * @see #setReturnReasonId(ReturnReason)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnReasonId()
	 * @model keys="returnReasonId"
	 *        annotation="mimo-ent-slot audit='true' help='why item is returned: did not like, wrong item, damaged, etc. etc.'"
	 * @generated
	 */
	ReturnReason getReturnReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnReasonId <em>Return Reason Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Reason Id</em>' reference.
	 * @see #getReturnReasonId()
	 * @generated
	 */
	void setReturnReasonId(ReturnReason value);

	/**
	 * Returns the value of the '<em><b>Return Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Id</em>' reference.
	 * @see #setReturnTypeId(ReturnType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnTypeId()
	 * @model keys="returnTypeId"
	 *        annotation="mimo-ent-slot audit='true' help='actually used for disbursement type: store credit, cash refund, exchange'"
	 * @generated
	 */
	ReturnType getReturnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnTypeId <em>Return Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Id</em>' reference.
	 * @see #getReturnTypeId()
	 * @generated
	 */
	void setReturnTypeId(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // ReturnItem
