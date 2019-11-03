/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl#getThruDate <em>Thru Date</em>}</li>
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
	 * The default value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected String orderTypeId = ORDER_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getQuoteTypeId() <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteTypeId() <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeId()
	 * @generated
	 * @ordered
	 */
	protected String quoteTypeId = QUOTE_TYPE_ID_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(String newOrderTypeId) {
		String oldOrderTypeId = orderTypeId;
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
	public String getQuoteTypeId() {
		return quoteTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteTypeId(String newQuoteTypeId) {
		String oldQuoteTypeId = quoteTypeId;
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				return getInvoiceTypeId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				return getOrderTypeId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				return getPartyId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				return getQuoteTypeId();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				setPartyPrefDocTypeTplId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				setCustomScreenId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				setInvoiceTypeId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				setOrderTypeId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				setQuoteTypeId((String)newValue);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				setPartyPrefDocTypeTplId(PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				setCustomScreenId(CUSTOM_SCREEN_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				setInvoiceTypeId(INVOICE_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				setOrderTypeId(ORDER_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				setQuoteTypeId(QUOTE_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
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
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID:
				return PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT == null ? partyPrefDocTypeTplId != null : !PARTY_PREF_DOC_TYPE_TPL_ID_EDEFAULT.equals(partyPrefDocTypeTplId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID:
				return CUSTOM_SCREEN_ID_EDEFAULT == null ? customScreenId != null : !CUSTOM_SCREEN_ID_EDEFAULT.equals(customScreenId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID:
				return INVOICE_TYPE_ID_EDEFAULT == null ? invoiceTypeId != null : !INVOICE_TYPE_ID_EDEFAULT.equals(invoiceTypeId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID:
				return ORDER_TYPE_ID_EDEFAULT == null ? orderTypeId != null : !ORDER_TYPE_ID_EDEFAULT.equals(orderTypeId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID:
				return QUOTE_TYPE_ID_EDEFAULT == null ? quoteTypeId != null : !QUOTE_TYPE_ID_EDEFAULT.equals(quoteTypeId);
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE:
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
		result.append(" (partyPrefDocTypeTplId: ");
		result.append(partyPrefDocTypeTplId);
		result.append(", customScreenId: ");
		result.append(customScreenId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", invoiceTypeId: ");
		result.append(invoiceTypeId);
		result.append(", orderTypeId: ");
		result.append(orderTypeId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", quoteTypeId: ");
		result.append(quoteTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyPrefDocTypeTplImpl
