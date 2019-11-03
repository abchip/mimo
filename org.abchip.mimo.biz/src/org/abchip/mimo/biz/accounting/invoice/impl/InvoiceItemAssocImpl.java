/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getInvoiceIdFrom <em>Invoice Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getInvoiceItemSeqIdFrom <em>Invoice Item Seq Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getInvoiceIdTo <em>Invoice Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getInvoiceItemSeqIdTo <em>Invoice Item Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemAssocImpl extends BizEntityTypedImpl<InvoiceItemAssocType> implements InvoiceItemAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getInvoiceIdFrom() <em>Invoice Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceIdFrom() <em>Invoice Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String invoiceIdFrom = INVOICE_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceItemSeqIdFrom() <em>Invoice Item Seq Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemSeqIdFrom() <em>Invoice Item Seq Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqIdFrom = INVOICE_ITEM_SEQ_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceIdTo() <em>Invoice Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceIdTo() <em>Invoice Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdTo()
	 * @generated
	 * @ordered
	 */
	protected String invoiceIdTo = INVOICE_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceItemSeqIdTo() <em>Invoice Item Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemSeqIdTo() <em>Invoice Item Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqIdTo()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqIdTo = INVOICE_ITEM_SEQ_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceItemAssocTypeId() <em>Invoice Item Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_ASSOC_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemAssocTypeId() <em>Invoice Item Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemAssocTypeId = INVOICE_ITEM_ASSOC_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
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
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceIdFrom() {
		return invoiceIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceIdFrom(String newInvoiceIdFrom) {
		String oldInvoiceIdFrom = invoiceIdFrom;
		invoiceIdFrom = newInvoiceIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_FROM, oldInvoiceIdFrom, invoiceIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceIdTo() {
		return invoiceIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceIdTo(String newInvoiceIdTo) {
		String oldInvoiceIdTo = invoiceIdTo;
		invoiceIdTo = newInvoiceIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_TO, oldInvoiceIdTo, invoiceIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqIdFrom() {
		return invoiceItemSeqIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqIdFrom(String newInvoiceItemSeqIdFrom) {
		String oldInvoiceItemSeqIdFrom = invoiceItemSeqIdFrom;
		invoiceItemSeqIdFrom = newInvoiceItemSeqIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM, oldInvoiceItemSeqIdFrom, invoiceItemSeqIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqIdTo() {
		return invoiceItemSeqIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqIdTo(String newInvoiceItemSeqIdTo) {
		String oldInvoiceItemSeqIdTo = invoiceItemSeqIdTo;
		invoiceItemSeqIdTo = newInvoiceItemSeqIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO, oldInvoiceItemSeqIdTo, invoiceItemSeqIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemAssocTypeId() {
		return invoiceItemAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemAssocTypeId(String newInvoiceItemAssocTypeId) {
		String oldInvoiceItemAssocTypeId = invoiceItemAssocTypeId;
		invoiceItemAssocTypeId = newInvoiceItemAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID, oldInvoiceItemAssocTypeId, invoiceItemAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_FROM:
				return getInvoiceIdFrom();
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM:
				return getInvoiceItemSeqIdFrom();
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_TO:
				return getInvoiceIdTo();
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO:
				return getInvoiceItemSeqIdTo();
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID:
				return getInvoiceItemAssocTypeId();
			case InvoicePackage.INVOICE_ITEM_ASSOC__FROM_DATE:
				return getFromDate();
			case InvoicePackage.INVOICE_ITEM_ASSOC__AMOUNT:
				return getAmount();
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_FROM:
				return getPartyIdFrom();
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_TO:
				return getPartyIdTo();
			case InvoicePackage.INVOICE_ITEM_ASSOC__QUANTITY:
				return getQuantity();
			case InvoicePackage.INVOICE_ITEM_ASSOC__THRU_DATE:
				return getThruDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_FROM:
				setInvoiceIdFrom((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM:
				setInvoiceItemSeqIdFrom((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_TO:
				setInvoiceIdTo((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO:
				setInvoiceItemSeqIdTo((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID:
				setInvoiceItemAssocTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
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
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_FROM:
				setInvoiceIdFrom(INVOICE_ID_FROM_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM:
				setInvoiceItemSeqIdFrom(INVOICE_ITEM_SEQ_ID_FROM_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_TO:
				setInvoiceIdTo(INVOICE_ID_TO_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO:
				setInvoiceItemSeqIdTo(INVOICE_ITEM_SEQ_ID_TO_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID:
				setInvoiceItemAssocTypeId(INVOICE_ITEM_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_FROM:
				return INVOICE_ID_FROM_EDEFAULT == null ? invoiceIdFrom != null : !INVOICE_ID_FROM_EDEFAULT.equals(invoiceIdFrom);
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM:
				return INVOICE_ITEM_SEQ_ID_FROM_EDEFAULT == null ? invoiceItemSeqIdFrom != null : !INVOICE_ITEM_SEQ_ID_FROM_EDEFAULT.equals(invoiceItemSeqIdFrom);
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ID_TO:
				return INVOICE_ID_TO_EDEFAULT == null ? invoiceIdTo != null : !INVOICE_ID_TO_EDEFAULT.equals(invoiceIdTo);
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO:
				return INVOICE_ITEM_SEQ_ID_TO_EDEFAULT == null ? invoiceItemSeqIdTo != null : !INVOICE_ITEM_SEQ_ID_TO_EDEFAULT.equals(invoiceItemSeqIdTo);
			case InvoicePackage.INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID:
				return INVOICE_ITEM_ASSOC_TYPE_ID_EDEFAULT == null ? invoiceItemAssocTypeId != null : !INVOICE_ITEM_ASSOC_TYPE_ID_EDEFAULT.equals(invoiceItemAssocTypeId);
			case InvoicePackage.INVOICE_ITEM_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case InvoicePackage.INVOICE_ITEM_ASSOC__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case InvoicePackage.INVOICE_ITEM_ASSOC__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case InvoicePackage.INVOICE_ITEM_ASSOC__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InvoicePackage.INVOICE_ITEM_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (invoiceIdFrom: ");
		result.append(invoiceIdFrom);
		result.append(", invoiceItemSeqIdFrom: ");
		result.append(invoiceItemSeqIdFrom);
		result.append(", invoiceIdTo: ");
		result.append(invoiceIdTo);
		result.append(", invoiceItemSeqIdTo: ");
		result.append(invoiceItemSeqIdTo);
		result.append(", invoiceItemAssocTypeId: ");
		result.append(invoiceItemAssocTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", amount: ");
		result.append(amount);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //InvoiceItemAssocImpl
