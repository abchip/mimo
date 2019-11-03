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
 * A representation of the model object '<em><b>Order Adjustment Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentBilling()
 * @model
 * @generated
 */
public interface OrderAdjustmentBilling extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentBilling_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getAmount <em>Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentBilling_InvoiceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getInvoiceId <em>Invoice Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentBilling_InvoiceItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Id</em>' attribute.
	 * @see #setOrderAdjustmentId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentBilling_OrderAdjustmentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment'"
	 * @generated
	 */
	String getOrderAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentBilling#getOrderAdjustmentId <em>Order Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Id</em>' attribute.
	 * @see #getOrderAdjustmentId()
	 * @generated
	 */
	void setOrderAdjustmentId(String value);

} // OrderAdjustmentBilling
