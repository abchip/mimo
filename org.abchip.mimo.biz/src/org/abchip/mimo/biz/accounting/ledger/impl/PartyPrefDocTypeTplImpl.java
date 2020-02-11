/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenId(String newCustomScreenId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID, newCustomScreenId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceType getInvoiceTypeId() {
		return (InvoiceType)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceTypeId(InvoiceType newInvoiceTypeId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID, newInvoiceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrderTypeId() {
		return (OrderType)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(OrderType newOrderTypeId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID, newOrderTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyPrefDocTypeTplId() {
		return (String)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyPrefDocTypeTplId(String newPartyPrefDocTypeTplId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID, newPartyPrefDocTypeTplId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType getQuoteTypeId() {
		return (QuoteType)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteTypeId(QuoteType newQuoteTypeId) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID, newQuoteTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(LedgerPackage.Literals.PARTY_PREF_DOC_TYPE_TPL__THRU_DATE, newThruDate);
	}

} //PartyPrefDocTypeTplImpl
