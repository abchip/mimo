/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getShipmentReceiptId <em>Shipment Receipt Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling()
 * @model
 * @generated
 */
public interface OrderItemBilling extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_InvoiceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_InvoiceItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Item Issuance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Issuance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #setItemIssuanceId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_ItemIssuanceId()
	 * @model annotation="mimo-ent-domain frame='ItemIssuance'"
	 * @generated
	 */
	String getItemIssuanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getItemIssuanceId <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #getItemIssuanceId()
	 * @generated
	 */
	void setItemIssuanceId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_OrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getOrderId <em>Order Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_OrderItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipment Receipt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Receipt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Receipt Id</em>' attribute.
	 * @see #setShipmentReceiptId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemBilling_ShipmentReceiptId()
	 * @model annotation="mimo-ent-domain frame='ShipmentReceipt'"
	 * @generated
	 */
	String getShipmentReceiptId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemBilling#getShipmentReceiptId <em>Shipment Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Receipt Id</em>' attribute.
	 * @see #getShipmentReceiptId()
	 * @generated
	 */
	void setShipmentReceiptId(String value);

} // OrderItemBilling
