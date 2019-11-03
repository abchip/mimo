/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntityTyped;

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
public interface ReturnItem extends BizEntityTyped<ReturnItemType> {
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
	 * @model
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
	 * Returns the value of the '<em><b>Expected Item Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Item Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Item Status</em>' attribute.
	 * @see #setExpectedItemStatus(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ExpectedItemStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getExpectedItemStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Item Status</em>' attribute.
	 * @see #getExpectedItemStatus()
	 * @generated
	 */
	void setExpectedItemStatus(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #setReturnItemResponseId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnItemResponseId()
	 * @model annotation="mimo-ent-domain frame='ReturnItemResponse'"
	 * @generated
	 */
	String getReturnItemResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemResponseId <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #getReturnItemResponseId()
	 * @generated
	 */
	void setReturnItemResponseId(String value);

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
	 * @model annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Return Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Type Id</em>' attribute.
	 * @see #setReturnItemTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnItemTypeId()
	 * @model annotation="mimo-ent-domain frame='ReturnItemType'"
	 * @generated
	 */
	String getReturnItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemTypeId <em>Return Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Type Id</em>' attribute.
	 * @see #getReturnItemTypeId()
	 * @generated
	 */
	void setReturnItemTypeId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Return Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Reason Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Reason Id</em>' attribute.
	 * @see #setReturnReasonId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnReasonId()
	 * @model annotation="mimo-ent-domain frame='ReturnReason'"
	 * @generated
	 */
	String getReturnReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnReasonId <em>Return Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Reason Id</em>' attribute.
	 * @see #getReturnReasonId()
	 * @generated
	 */
	void setReturnReasonId(String value);

	/**
	 * Returns the value of the '<em><b>Return Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Id</em>' attribute.
	 * @see #setReturnTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_ReturnTypeId()
	 * @model annotation="mimo-ent-domain frame='ReturnType'"
	 * @generated
	 */
	String getReturnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnTypeId <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Id</em>' attribute.
	 * @see #getReturnTypeId()
	 * @generated
	 */
	void setReturnTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItem_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // ReturnItem
