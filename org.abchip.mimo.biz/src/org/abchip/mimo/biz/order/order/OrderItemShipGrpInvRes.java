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
import org.abchip.mimo.biz.product.inventory.InventoryItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Ship Grp Inv Res</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getCreatedDatetime <em>Created Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getCurrentPromisedDate <em>Current Promised Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOldPickStartDate <em>Old Pick Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getPromisedDatetime <em>Promised Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getQuantityNotAvailable <em>Quantity Not Available</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getReservedDatetime <em>Reserved Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getSequenceId <em>Sequence Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes()
 * @model annotation="mimo-ent-frame title='Order Item Inventory Reservation'"
 * @generated
 */
public interface OrderItemShipGrpInvRes extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Created Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Datetime</em>' attribute.
	 * @see #setCreatedDatetime(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_CreatedDatetime()
	 * @model
	 * @generated
	 */
	Date getCreatedDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getCreatedDatetime <em>Created Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Datetime</em>' attribute.
	 * @see #getCreatedDatetime()
	 * @generated
	 */
	void setCreatedDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Current Promised Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Promised Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Promised Date</em>' attribute.
	 * @see #setCurrentPromisedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_CurrentPromisedDate()
	 * @model
	 * @generated
	 */
	Date getCurrentPromisedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getCurrentPromisedDate <em>Current Promised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Promised Date</em>' attribute.
	 * @see #getCurrentPromisedDate()
	 * @generated
	 */
	void setCurrentPromisedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' reference.
	 * @see #setInventoryItemId(InventoryItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_InventoryItemId()
	 * @model keys="inventoryItemId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getInventoryItemId <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' reference.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Old Pick Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Pick Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Pick Start Date</em>' attribute.
	 * @see #setOldPickStartDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_OldPickStartDate()
	 * @model
	 * @generated
	 */
	Date getOldPickStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOldPickStartDate <em>Old Pick Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Pick Start Date</em>' attribute.
	 * @see #getOldPickStartDate()
	 * @generated
	 */
	void setOldPickStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_Priority()
	 * @model annotation="mimo-ent-slot help='Sets priority for Inventory Reservation'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_OrderId()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOrderId <em>Order Id</em>}' reference.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_OrderItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Promised Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promised Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promised Datetime</em>' attribute.
	 * @see #setPromisedDatetime(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_PromisedDatetime()
	 * @model
	 * @generated
	 */
	Date getPromisedDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getPromisedDatetime <em>Promised Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promised Datetime</em>' attribute.
	 * @see #getPromisedDatetime()
	 * @generated
	 */
	void setPromisedDatetime(Date value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Not Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Not Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Not Available</em>' attribute.
	 * @see #setQuantityNotAvailable(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_QuantityNotAvailable()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityNotAvailable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getQuantityNotAvailable <em>Quantity Not Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Not Available</em>' attribute.
	 * @see #getQuantityNotAvailable()
	 * @generated
	 */
	void setQuantityNotAvailable(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserve Order Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Order Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Order Enum Id</em>' attribute.
	 * @see #setReserveOrderEnumId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_ReserveOrderEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReserveOrderEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Order Enum Id</em>' attribute.
	 * @see #getReserveOrderEnumId()
	 * @generated
	 */
	void setReserveOrderEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Reserved Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Datetime</em>' attribute.
	 * @see #setReservedDatetime(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_ReservedDatetime()
	 * @model
	 * @generated
	 */
	Date getReservedDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getReservedDatetime <em>Reserved Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Datetime</em>' attribute.
	 * @see #getReservedDatetime()
	 * @generated
	 */
	void setReservedDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(long)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_SequenceId()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(long value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGrpInvRes_ShipGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

} // OrderItemShipGrpInvRes
