/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Date;
import org.abchip.mimo.biz.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Acctg Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getBaseCurrencyUomId <em>Base Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getCogsMethodId <em>Cogs Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#isEnableAccounting <em>Enable Accounting</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getErrorGlJournalId <em>Error Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceSeqCustMethId <em>Invoice Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceNumber <em>Last Invoice Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastOrderNumber <em>Last Order Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastQuoteNumber <em>Last Quote Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldInvoiceSequenceEnumId <em>Old Invoice Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldOrderSequenceEnumId <em>Old Order Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldQuoteSequenceEnumId <em>Old Quote Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderIdPrefix <em>Order Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderSeqCustMethId <em>Order Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteIdPrefix <em>Quote Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteSeqCustMethId <em>Quote Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getRefundPaymentMethodId <em>Refund Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getTaxFormId <em>Tax Form Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#isUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyAcctgPreferenceImpl extends BizEntityImpl implements PartyAcctgPreference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyAcctgPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAccounting() {
		return (Boolean)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAccounting(boolean newEnableAccounting) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING, newEnableAccounting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getBaseCurrencyUomId() {
		return (Uom)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCurrencyUomId(Uom newBaseCurrencyUomId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID, newBaseCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getCogsMethodId() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCogsMethodId(Enumeration newCogsMethodId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID, newCogsMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartDay() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartDay(long newFiscalYearStartDay) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY, newFiscalYearStartDay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartMonth() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartMonth(long newFiscalYearStartMonth) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH, newFiscalYearStartMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceIdPrefix(String newInvoiceIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX, newInvoiceIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getInvoiceSeqCustMethId() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceSeqCustMethId(CustomMethod newInvoiceSeqCustMethId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID, newInvoiceSeqCustMethId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastInvoiceNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceNumber(long newLastInvoiceNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER, newLastInvoiceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInvoiceRestartDate() {
		return (Date)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceRestartDate(Date newLastInvoiceRestartDate) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE, newLastInvoiceRestartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastOrderNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOrderNumber(long newLastOrderNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER, newLastOrderNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastQuoteNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastQuoteNumber(long newLastQuoteNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER, newLastQuoteNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldInvoiceSequenceEnumId() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldInvoiceSequenceEnumId(Enumeration newOldInvoiceSequenceEnumId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID, newOldInvoiceSequenceEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldOrderSequenceEnumId() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldOrderSequenceEnumId(Enumeration newOldOrderSequenceEnumId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID, newOldOrderSequenceEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldQuoteSequenceEnumId() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuoteSequenceEnumId(Enumeration newOldQuoteSequenceEnumId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID, newOldQuoteSequenceEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderIdPrefix(String newOrderIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX, newOrderIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getOrderSeqCustMethId() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSeqCustMethId(CustomMethod newOrderSeqCustMethId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID, newOrderSeqCustMethId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteIdPrefix(String newQuoteIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX, newQuoteIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseInvoiceIdForReturns() {
		return (Boolean)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseInvoiceIdForReturns(boolean newUseInvoiceIdForReturns) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS, newUseInvoiceIdForReturns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getQuoteSeqCustMethId() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteSeqCustMethId(CustomMethod newQuoteSeqCustMethId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID, newQuoteSeqCustMethId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getRefundPaymentMethodId() {
		return (PaymentMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPaymentMethodId(PaymentMethod newRefundPaymentMethodId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID, newRefundPaymentMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTaxFormId() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxFormId(Enumeration newTaxFormId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID, newTaxFormId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlJournal getErrorGlJournalId() {
		return (GlJournal)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorGlJournalId(GlJournal newErrorGlJournalId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID, newErrorGlJournalId);
	}

} //PartyAcctgPreferenceImpl
