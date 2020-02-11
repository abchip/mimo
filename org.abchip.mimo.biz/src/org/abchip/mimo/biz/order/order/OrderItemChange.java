/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.security.login.UserLogin;

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
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * @model annotation="mimo-ent-format type='comment' length='255'"
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
	 * Returns the value of the '<em><b>Change Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Type Enum Id</em>' reference.
	 * @see #setChangeTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeTypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getChangeTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeTypeEnumId <em>Change Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type Enum Id</em>' reference.
	 * @see #getChangeTypeEnumId()
	 * @generated
	 */
	void setChangeTypeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Change User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change User Login</em>' reference.
	 * @see #setChangeUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ChangeUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getChangeUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getChangeUserLogin <em>Change User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change User Login</em>' reference.
	 * @see #getChangeUserLogin()
	 * @generated
	 */
	void setChangeUserLogin(UserLogin value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * Returns the value of the '<em><b>Reason Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum Id</em>' reference.
	 * @see #setReasonEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemChange_ReasonEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getReasonEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemChange#getReasonEnumId <em>Reason Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum Id</em>' reference.
	 * @see #getReasonEnumId()
	 * @generated
	 */
	void setReasonEnumId(Enumeration value);

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
