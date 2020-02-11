/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceAttributes <em>Invoice Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceItems <em>Invoice Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceNotes <em>Invoice Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Invoice extends BizEntityTyped<InvoiceType> {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' reference.
	 * @see #setBillingAccountId(BillingAccount)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_BillingAccountId()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getBillingAccountId <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' reference.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' reference.
	 * @see #setContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Invoice Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceAttribute> getInvoiceAttributes();

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
	 * Returns the value of the '<em><b>Invoice Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Items</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceItems()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceItem> getInvoiceItems();

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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Invoice Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.invoice.InvoiceNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceNote> getInvoiceNotes();

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
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #setRecurrenceInfoId(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_RecurrenceInfoId()
	 * @model keys="recurrenceInfoId"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(RecurrenceInfo value);

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
	 * @model annotation="mimo-ent-format length='60'"
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
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' reference.
	 * @see #setInvoiceTypeId(InvoiceType)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoice_InvoiceTypeId()
	 * @model keys="invoiceTypeId"
	 * @generated
	 */
	InvoiceType getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId <em>Invoice Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' reference.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(InvoiceType value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
