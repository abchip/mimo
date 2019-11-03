/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceAttributes <em>Invoice Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceItems <em>Invoice Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceNotes <em>Invoice Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends BizEntityTypedImpl<InvoiceType> implements Invoice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountId = BILLING_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INVOICE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected Date invoiceDate = INVOICE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceMessage() <em>Invoice Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceMessage() <em>Invoice Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceMessage()
	 * @generated
	 * @ordered
	 */
	protected String invoiceMessage = INVOICE_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceTypeId = INVOICE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAID_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected Date paidDate = PAID_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_INFO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected String recurrenceInfoId = RECURRENCE_INFO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoiceAttributes() <em>Invoice Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invoiceAttributes;
	/**
	 * The cached value of the '{@link #getInvoiceItems() <em>Invoice Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invoiceItems;
	/**
	 * The cached value of the '{@link #getInvoiceNotes() <em>Invoice Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invoiceNotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(String newBillingAccountId) {
		String oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceDate(Date newInvoiceDate) {
		Date oldInvoiceDate = invoiceDate;
		invoiceDate = newInvoiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__INVOICE_DATE, oldInvoiceDate, invoiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceMessage() {
		return invoiceMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceMessage(String newInvoiceMessage) {
		String oldInvoiceMessage = invoiceMessage;
		invoiceMessage = newInvoiceMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__INVOICE_MESSAGE, oldInvoiceMessage, invoiceMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaidDate() {
		return paidDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaidDate(Date newPaidDate) {
		Date oldPaidDate = paidDate;
		paidDate = newPaidDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__PAID_DATE, oldPaidDate, paidDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(String newRecurrenceInfoId) {
		String oldRecurrenceInfoId = recurrenceInfoId;
		recurrenceInfoId = newRecurrenceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInvoiceAttributes() {
		if (invoiceAttributes == null) {
			invoiceAttributes = new EDataTypeUniqueEList<String>(String.class, this, InvoicePackage.INVOICE__INVOICE_ATTRIBUTES);
		}
		return invoiceAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInvoiceItems() {
		if (invoiceItems == null) {
			invoiceItems = new EDataTypeUniqueEList<String>(String.class, this, InvoicePackage.INVOICE__INVOICE_ITEMS);
		}
		return invoiceItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInvoiceNotes() {
		if (invoiceNotes == null) {
			invoiceNotes = new EDataTypeUniqueEList<String>(String.class, this, InvoicePackage.INVOICE__INVOICE_NOTES);
		}
		return invoiceNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceTerms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentApplications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> timeEntries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceTypeId() {
		return invoiceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceTypeId(String newInvoiceTypeId) {
		String oldInvoiceTypeId = invoiceTypeId;
		invoiceTypeId = newInvoiceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE__INVOICE_ID:
				return getInvoiceId();
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				return getBillingAccountId();
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				return getContactMechId();
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case InvoicePackage.INVOICE__DESCRIPTION:
				return getDescription();
			case InvoicePackage.INVOICE__DUE_DATE:
				return getDueDate();
			case InvoicePackage.INVOICE__INVOICE_DATE:
				return getInvoiceDate();
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				return getInvoiceMessage();
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				return getInvoiceTypeId();
			case InvoicePackage.INVOICE__PAID_DATE:
				return getPaidDate();
			case InvoicePackage.INVOICE__PARTY_ID:
				return getPartyId();
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				return getPartyIdFrom();
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				return getRecurrenceInfoId();
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				return getReferenceNumber();
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				return getRoleTypeId();
			case InvoicePackage.INVOICE__STATUS_ID:
				return getStatusId();
			case InvoicePackage.INVOICE__INVOICE_ATTRIBUTES:
				return getInvoiceAttributes();
			case InvoicePackage.INVOICE__INVOICE_ITEMS:
				return getInvoiceItems();
			case InvoicePackage.INVOICE__INVOICE_NOTES:
				return getInvoiceNotes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvoicePackage.INVOICE__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				setBillingAccountId((String)newValue);
				return;
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case InvoicePackage.INVOICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InvoicePackage.INVOICE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_DATE:
				setInvoiceDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				setInvoiceMessage((String)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				setInvoiceTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE__PAID_DATE:
				setPaidDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((String)newValue);
				return;
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_ATTRIBUTES:
				getInvoiceAttributes().clear();
				getInvoiceAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_ITEMS:
				getInvoiceItems().clear();
				getInvoiceItems().addAll((Collection<? extends String>)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_NOTES:
				getInvoiceNotes().clear();
				getInvoiceNotes().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				setBillingAccountId(BILLING_ACCOUNT_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__INVOICE_DATE:
				setInvoiceDate(INVOICE_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				setInvoiceMessage(INVOICE_MESSAGE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				setInvoiceTypeId(INVOICE_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__PAID_DATE:
				setPaidDate(PAID_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				setRecurrenceInfoId(RECURRENCE_INFO_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__INVOICE_ATTRIBUTES:
				getInvoiceAttributes().clear();
				return;
			case InvoicePackage.INVOICE__INVOICE_ITEMS:
				getInvoiceItems().clear();
				return;
			case InvoicePackage.INVOICE__INVOICE_NOTES:
				getInvoiceNotes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				return BILLING_ACCOUNT_ID_EDEFAULT == null ? billingAccountId != null : !BILLING_ACCOUNT_ID_EDEFAULT.equals(billingAccountId);
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case InvoicePackage.INVOICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InvoicePackage.INVOICE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case InvoicePackage.INVOICE__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? invoiceDate != null : !INVOICE_DATE_EDEFAULT.equals(invoiceDate);
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				return INVOICE_MESSAGE_EDEFAULT == null ? invoiceMessage != null : !INVOICE_MESSAGE_EDEFAULT.equals(invoiceMessage);
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				return INVOICE_TYPE_ID_EDEFAULT == null ? invoiceTypeId != null : !INVOICE_TYPE_ID_EDEFAULT.equals(invoiceTypeId);
			case InvoicePackage.INVOICE__PAID_DATE:
				return PAID_DATE_EDEFAULT == null ? paidDate != null : !PAID_DATE_EDEFAULT.equals(paidDate);
			case InvoicePackage.INVOICE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				return RECURRENCE_INFO_ID_EDEFAULT == null ? recurrenceInfoId != null : !RECURRENCE_INFO_ID_EDEFAULT.equals(recurrenceInfoId);
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case InvoicePackage.INVOICE__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case InvoicePackage.INVOICE__INVOICE_ATTRIBUTES:
				return invoiceAttributes != null && !invoiceAttributes.isEmpty();
			case InvoicePackage.INVOICE__INVOICE_ITEMS:
				return invoiceItems != null && !invoiceItems.isEmpty();
			case InvoicePackage.INVOICE__INVOICE_NOTES:
				return invoiceNotes != null && !invoiceNotes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (invoiceId: ");
		result.append(invoiceId);
		result.append(", billingAccountId: ");
		result.append(billingAccountId);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", description: ");
		result.append(description);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", invoiceDate: ");
		result.append(invoiceDate);
		result.append(", invoiceMessage: ");
		result.append(invoiceMessage);
		result.append(", invoiceTypeId: ");
		result.append(invoiceTypeId);
		result.append(", paidDate: ");
		result.append(paidDate);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", recurrenceInfoId: ");
		result.append(recurrenceInfoId);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", invoiceAttributes: ");
		result.append(invoiceAttributes);
		result.append(", invoiceItems: ");
		result.append(invoiceItems);
		result.append(", invoiceNotes: ");
		result.append(invoiceNotes);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
