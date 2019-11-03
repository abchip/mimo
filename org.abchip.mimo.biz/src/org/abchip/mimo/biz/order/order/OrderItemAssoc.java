/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToOrderId <em>To Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToOrderItemSeqId <em>To Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderItemAssocTypeId <em>Order Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc()
 * @model
 * @generated
 */
public interface OrderItemAssoc extends BizEntityTyped<OrderItemAssocType> {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_OrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Assoc Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Assoc Type Id</em>' attribute.
	 * @see #setOrderItemAssocTypeId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_OrderItemAssocTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemAssocType'"
	 * @generated
	 */
	String getOrderItemAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderItemAssocTypeId <em>Order Item Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Assoc Type Id</em>' attribute.
	 * @see #getOrderItemAssocTypeId()
	 * @generated
	 */
	void setOrderItemAssocTypeId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_OrderItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_ShipGroupSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>To Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Order Id</em>' attribute.
	 * @see #setToOrderId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_ToOrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getToOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToOrderId <em>To Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Order Id</em>' attribute.
	 * @see #getToOrderId()
	 * @generated
	 */
	void setToOrderId(String value);

	/**
	 * Returns the value of the '<em><b>To Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Order Item Seq Id</em>' attribute.
	 * @see #setToOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_ToOrderItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getToOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToOrderItemSeqId <em>To Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Order Item Seq Id</em>' attribute.
	 * @see #getToOrderItemSeqId()
	 * @generated
	 */
	void setToOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>To Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Ship Group Seq Id</em>' attribute.
	 * @see #setToShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemAssoc_ToShipGroupSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getToShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemAssoc#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Ship Group Seq Id</em>' attribute.
	 * @see #getToShipGroupSeqId()
	 * @generated
	 */
	void setToShipGroupSeqId(String value);

} // OrderItemAssoc
