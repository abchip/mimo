/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderItemChangeId <em>Order Item Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeComments <em>Change Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeDatetime <em>Change Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeTypeEnumId <em>Change Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeUserLogin <em>Change User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemChange#getUnitPrice <em>Unit Price</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange()
 * @model
 * @generated
 */
public interface OrderItemChange extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #setCancelQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_CancelQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getCancelQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getCancelQuantity <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #getCancelQuantity()
	 * @generated
	 */
	void setCancelQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Change Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Comments</em>' attribute.
	 * @see #setChangeComments(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeComments()
	 * @model
	 * @generated
	 */
	String getChangeComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeComments <em>Change Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Comments</em>' attribute.
	 * @see #getChangeComments()
	 * @generated
	 */
	void setChangeComments(String value);

	/**
	 * Returns the value of the '<em><b>Change Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Datetime</em>' attribute.
	 * @see #setChangeDatetime(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeDatetime()
	 * @model
	 * @generated
	 */
	Date getChangeDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeDatetime <em>Change Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Datetime</em>' attribute.
	 * @see #getChangeDatetime()
	 * @generated
	 */
	void setChangeDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Change Type Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Type Enum Id</em>' attribute.
	 * @see #setChangeTypeEnumId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeTypeEnumId()
	 * @model
	 * @generated
	 */
	String getChangeTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeTypeEnumId <em>Change Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type Enum Id</em>' attribute.
	 * @see #getChangeTypeEnumId()
	 * @generated
	 */
	void setChangeTypeEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Change User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change User Login</em>' attribute.
	 * @see #setChangeUserLogin(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeUserLogin <em>Change User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change User Login</em>' attribute.
	 * @see #getChangeUserLogin()
	 * @generated
	 */
	void setChangeUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Description</em>' attribute.
	 * @see #setItemDescription(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ItemDescription()
	 * @model
	 * @generated
	 */
	String getItemDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getItemDescription <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Description</em>' attribute.
	 * @see #getItemDescription()
	 * @generated
	 */
	void setItemDescription(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Change Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Change Id</em>' attribute.
	 * @see #setOrderItemChangeId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_OrderItemChangeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderItemChangeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderItemChangeId <em>Order Item Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Change Id</em>' attribute.
	 * @see #getOrderItemChangeId()
	 * @generated
	 */
	void setOrderItemChangeId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reason Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum Id</em>' attribute.
	 * @see #setReasonEnumId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ReasonEnumId()
	 * @model
	 * @generated
	 */
	String getReasonEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getReasonEnumId <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum Id</em>' attribute.
	 * @see #getReasonEnumId()
	 * @generated
	 */
	void setReasonEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_UnitPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

} // OrderItemChange
