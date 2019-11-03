/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Item Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom <em>Invoice Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom <em>Invoice Item Seq Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo <em>Invoice Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo <em>Invoice Item Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc()
 * @model
 * @generated
 */
public interface InvoiceItemAssoc extends BizEntityTyped<InvoiceItemAssocType> {
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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id From</em>' attribute.
	 * @see #setInvoiceIdFrom(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_InvoiceIdFrom()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom <em>Invoice Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id From</em>' attribute.
	 * @see #getInvoiceIdFrom()
	 * @generated
	 */
	void setInvoiceIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id To</em>' attribute.
	 * @see #setInvoiceIdTo(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_InvoiceIdTo()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo <em>Invoice Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id To</em>' attribute.
	 * @see #getInvoiceIdTo()
	 * @generated
	 */
	void setInvoiceIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id From</em>' attribute.
	 * @see #setInvoiceItemSeqIdFrom(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_InvoiceItemSeqIdFrom()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom <em>Invoice Item Seq Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id From</em>' attribute.
	 * @see #getInvoiceItemSeqIdFrom()
	 * @generated
	 */
	void setInvoiceItemSeqIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id To</em>' attribute.
	 * @see #setInvoiceItemSeqIdTo(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_InvoiceItemSeqIdTo()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo <em>Invoice Item Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id To</em>' attribute.
	 * @see #getInvoiceItemSeqIdTo()
	 * @generated
	 */
	void setInvoiceItemSeqIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' attribute.
	 * @see #setPartyIdFrom(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_PartyIdFrom()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' attribute.
	 * @see #setPartyIdTo(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_PartyIdTo()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdTo <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' attribute.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Assoc Type Id</em>' attribute.
	 * @see #setInvoiceItemAssocTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemAssoc_InvoiceItemAssocTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItemAssocType'"
	 * @generated
	 */
	String getInvoiceItemAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Assoc Type Id</em>' attribute.
	 * @see #getInvoiceItemAssocTypeId()
	 * @generated
	 */
	void setInvoiceItemAssocTypeId(String value);

} // InvoiceItemAssoc
