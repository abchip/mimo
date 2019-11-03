/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceAttributes <em>Invoice Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceItems <em>Invoice Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceNotes <em>Invoice Notes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Invoice extends BizEntityTyped<InvoiceType> {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' attribute.
	 * @see #setBillingAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_BillingAccountId()
	 * @model annotation="mimo-ent-domain frame='BillingAccount'"
	 * @generated
	 */
	String getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getBillingAccountId <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' attribute.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_ContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(Date)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceDate()
	 * @model
	 * @generated
	 */
	Date getInvoiceDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Message</em>' attribute.
	 * @see #setInvoiceMessage(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceMessage()
	 * @model
	 * @generated
	 */
	String getInvoiceMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Message</em>' attribute.
	 * @see #getInvoiceMessage()
	 * @generated
	 */
	void setInvoiceMessage(String value);

	/**
	 * Returns the value of the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Date</em>' attribute.
	 * @see #setPaidDate(Date)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_PaidDate()
	 * @model
	 * @generated
	 */
	Date getPaidDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date</em>' attribute.
	 * @see #getPaidDate()
	 * @generated
	 */
	void setPaidDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_PartyIdFrom()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #setRecurrenceInfoId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_RecurrenceInfoId()
	 * @model annotation="mimo-ent-domain frame='RecurrenceInfo'"
	 * @generated
	 */
	String getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_ReferenceNumber()
	 * @model
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_RoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceAttribute'"
	 * @generated
	 */
	List<String> getInvoiceAttributes();

	/**
	 * Returns the value of the '<em><b>Invoice Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem'"
	 * @generated
	 */
	List<String> getInvoiceItems();

	/**
	 * Returns the value of the '<em><b>Invoice Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Notes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceNotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceNote'"
	 * @generated
	 */
	List<String> getInvoiceNotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='invoiceId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceTerm' route='invoiceId'"
	 * @generated
	 */
	List<String> invoiceTerms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentApplication' route='invoiceId'"
	 * @generated
	 */
	List<String> paymentApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TimeEntry' route='invoiceId'"
	 * @generated
	 */
	List<String> timeEntries();

	/**
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #setInvoiceTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceTypeId()
	 * @model annotation="mimo-ent-domain frame='InvoiceType'"
	 * @generated
	 */
	String getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

} // Invoice
