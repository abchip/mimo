/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getShipmentReceiptId <em>Shipment Receipt Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling()
 * @model
 * @generated
 */
public interface ReturnItemBilling extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_InvoiceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceId <em>Invoice Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_InvoiceItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_ReturnId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_ReturnItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemBilling_ShipmentReceiptId()
	 * @model annotation="mimo-ent-domain frame='ShipmentReceipt'"
	 * @generated
	 */
	String getShipmentReceiptId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getShipmentReceiptId <em>Shipment Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Receipt Id</em>' attribute.
	 * @see #getShipmentReceiptId()
	 * @generated
	 */
	void setShipmentReceiptId(String value);

} // ReturnItemBilling
