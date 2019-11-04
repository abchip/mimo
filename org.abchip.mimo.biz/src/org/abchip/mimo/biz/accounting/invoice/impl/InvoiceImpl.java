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
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
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
	 * The cached value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected InvoiceType invoiceTypeId;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected BillingAccount billingAccountId;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;
	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceInfo recurrenceInfoId;

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
	public BillingAccount getBillingAccountId() {
		if (billingAccountId != null && ((EObject)billingAccountId).eIsProxy()) {
			InternalEObject oldBillingAccountId = (InternalEObject)billingAccountId;
			billingAccountId = (BillingAccount)eResolveProxy(oldBillingAccountId);
			if (billingAccountId != oldBillingAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
			}
		}
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingAccount basicGetBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		BillingAccount oldBillingAccountId = billingAccountId;
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
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
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
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
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
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		Party oldPartyIdFrom = partyIdFrom;
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
	public RecurrenceInfo getRecurrenceInfoId() {
		if (recurrenceInfoId != null && ((EObject)recurrenceInfoId).eIsProxy()) {
			InternalEObject oldRecurrenceInfoId = (InternalEObject)recurrenceInfoId;
			recurrenceInfoId = (RecurrenceInfo)eResolveProxy(oldRecurrenceInfoId);
			if (recurrenceInfoId != oldRecurrenceInfoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
			}
		}
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceInfo basicGetRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		RecurrenceInfo oldRecurrenceInfoId = recurrenceInfoId;
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
	public InvoiceType getInvoiceTypeId() {
		if (invoiceTypeId != null && ((EObject)invoiceTypeId).eIsProxy()) {
			InternalEObject oldInvoiceTypeId = (InternalEObject)invoiceTypeId;
			invoiceTypeId = (InvoiceType)eResolveProxy(oldInvoiceTypeId);
			if (invoiceTypeId != oldInvoiceTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
			}
		}
		return invoiceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType basicGetInvoiceTypeId() {
		return invoiceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceTypeId(InvoiceType newInvoiceTypeId) {
		InvoiceType oldInvoiceTypeId = invoiceTypeId;
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
			case InvoicePackage.INVOICE__DESCRIPTION:
				return getDescription();
			case InvoicePackage.INVOICE__DUE_DATE:
				return getDueDate();
			case InvoicePackage.INVOICE__INVOICE_DATE:
				return getInvoiceDate();
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				return getInvoiceMessage();
			case InvoicePackage.INVOICE__PAID_DATE:
				return getPaidDate();
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				return getReferenceNumber();
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				if (resolve) return getInvoiceTypeId();
				return basicGetInvoiceTypeId();
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case InvoicePackage.INVOICE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case InvoicePackage.INVOICE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				if (resolve) return getBillingAccountId();
				return basicGetBillingAccountId();
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				if (resolve) return getRecurrenceInfoId();
				return basicGetRecurrenceInfoId();
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
			case InvoicePackage.INVOICE__PAID_DATE:
				setPaidDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				setInvoiceTypeId((InvoiceType)newValue);
				return;
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case InvoicePackage.INVOICE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case InvoicePackage.INVOICE__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)newValue);
				return;
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)newValue);
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
			case InvoicePackage.INVOICE__PAID_DATE:
				setPaidDate(PAID_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				setInvoiceTypeId((InvoiceType)null);
				return;
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case InvoicePackage.INVOICE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case InvoicePackage.INVOICE__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)null);
				return;
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)null);
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
			case InvoicePackage.INVOICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InvoicePackage.INVOICE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case InvoicePackage.INVOICE__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? invoiceDate != null : !INVOICE_DATE_EDEFAULT.equals(invoiceDate);
			case InvoicePackage.INVOICE__INVOICE_MESSAGE:
				return INVOICE_MESSAGE_EDEFAULT == null ? invoiceMessage != null : !INVOICE_MESSAGE_EDEFAULT.equals(invoiceMessage);
			case InvoicePackage.INVOICE__PAID_DATE:
				return PAID_DATE_EDEFAULT == null ? paidDate != null : !PAID_DATE_EDEFAULT.equals(paidDate);
			case InvoicePackage.INVOICE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case InvoicePackage.INVOICE__INVOICE_TYPE_ID:
				return invoiceTypeId != null;
			case InvoicePackage.INVOICE__PARTY_ID_FROM:
				return partyIdFrom != null;
			case InvoicePackage.INVOICE__PARTY_ID:
				return partyId != null;
			case InvoicePackage.INVOICE__ROLE_TYPE_ID:
				return roleTypeId != null;
			case InvoicePackage.INVOICE__STATUS_ID:
				return statusId != null;
			case InvoicePackage.INVOICE__BILLING_ACCOUNT_ID:
				return billingAccountId != null;
			case InvoicePackage.INVOICE__CONTACT_MECH_ID:
				return contactMechId != null;
			case InvoicePackage.INVOICE__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case InvoicePackage.INVOICE__RECURRENCE_INFO_ID:
				return recurrenceInfoId != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", invoiceDate: ");
		result.append(invoiceDate);
		result.append(", invoiceMessage: ");
		result.append(invoiceMessage);
		result.append(", paidDate: ");
		result.append(paidDate);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
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
