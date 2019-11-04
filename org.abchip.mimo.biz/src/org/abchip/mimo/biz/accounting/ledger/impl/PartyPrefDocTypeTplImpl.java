/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.order.quote.QuoteType;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Pref Doc Type Tpl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyPrefDocTypeTplImpl extends BizEntityImpl implements PartyPrefDocTypeTpl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPartyPrefDocTypeTplId() <em>Party Pref Doc Type Tpl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyPrefDocTypeTplId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyPrefDocTypeTplId() <em>Party Pref Doc Type Tpl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyPrefDocTypeTplId()
	 * @generated
	 * @ordered
	 */
	protected String partyPrefDocTypeTplId = PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomScreenId() <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_SCREEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomScreenId() <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenId()
	 * @generated
	 * @ordered
	 */
	protected String customScreenId = CUSTOM_SCREEN_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

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
	 * The cached value of the '{@link #getQuoteTypeId() <em>Quote Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeId()
	 * @generated
	 * @ordered
	 */
	protected QuoteType quoteTypeId;

	/**
	 * The cached value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderType orderTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyPrefDocTypeTplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenId() {
		return customScreenId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenId(String newCustomScreenId) {
		String oldCustomScreenId = customScreenId;
		customScreenId = newCustomScreenId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID, oldCustomScreenId, customScreenId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE, oldFromDate, fromDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrderTypeId() {
		if (orderTypeId != null && ((EObject)orderTypeId).eIsProxy()) {
			InternalEObject oldOrderTypeId = (InternalEObject)orderTypeId;
			orderTypeId = (OrderType)eResolveProxy(oldOrderTypeId);
			if (orderTypeId != oldOrderTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID, oldOrderTypeId, orderTypeId));
			}
		}
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType basicGetOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(OrderType newOrderTypeId) {
		OrderType oldOrderTypeId = orderTypeId;
		orderTypeId = newOrderTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID, oldOrderTypeId, orderTypeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyPrefDocTypeTplId() {
		return partyPrefDocTypeTplId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyPrefDocTypeTplId(String newPartyPrefDocTypeTplId) {
		String oldPartyPrefDocTypeTplId = partyPrefDocTypeTplId;
		partyPrefDocTypeTplId = newPartyPrefDocTypeTplId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID, oldPartyPrefDocTypeTplId, partyPrefDocTypeTplId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType getQuoteTypeId() {
		if (quoteTypeId != null && ((EObject)quoteTypeId).eIsProxy()) {
			InternalEObject oldQuoteTypeId = (InternalEObject)quoteTypeId;
			quoteTypeId = (QuoteType)eResolveProxy(oldQuoteTypeId);
			if (quoteTypeId != oldQuoteTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID, oldQuoteTypeId, quoteTypeId));
			}
		}
		return quoteTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuoteType basicGetQuoteTypeId() {
		return quoteTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteTypeId(QuoteType newQuoteTypeId) {
		QuoteType oldQuoteTypeId = quoteTypeId;
		quoteTypeId = newQuoteTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID, oldQuoteTypeId, quoteTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				return getPartyPrefDocTypeTplId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				return getCustomScreenId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				return getFromDate();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
				return getThruDate();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				if (resolve) return getInvoiceTypeId();
				return basicGetInvoiceTypeId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				if (resolve) return getQuoteTypeId();
				return basicGetQuoteTypeId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				if (resolve) return getOrderTypeId();
				return basicGetOrderTypeId();
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				setPartyPrefDocTypeTplId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				setCustomScreenId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				setInvoiceTypeId((InvoiceType)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				setQuoteTypeId((QuoteType)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				setOrderTypeId((OrderType)newValue);
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				setPartyPrefDocTypeTplId(PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				setCustomScreenId(CUSTOM_SCREEN_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				setPartyId((Party)null);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				setInvoiceTypeId((InvoiceType)null);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				setQuoteTypeId((QuoteType)null);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				setOrderTypeId((OrderType)null);
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				return PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT == null ? partyPrefDocTypeTplId != null : !PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT.equals(partyPrefDocTypeTplId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				return CUSTOM_SCREEN_ID_EDEFAULT == null ? customScreenId != null : !CUSTOM_SCREEN_ID_EDEFAULT.equals(customScreenId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				return partyId != null;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				return invoiceTypeId != null;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				return quoteTypeId != null;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				return orderTypeId != null;
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
		result.append(" (partyPrefDocTypeTplId: ");
		result.append(partyPrefDocTypeTplId);
		result.append(", customScreenId: ");
		result.append(customScreenId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyPrefDocTypeTplImpl
