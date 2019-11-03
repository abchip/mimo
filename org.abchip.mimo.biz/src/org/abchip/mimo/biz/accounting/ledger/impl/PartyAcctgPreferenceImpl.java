/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getBaseCurrencyUomId() <em>Base Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseCurrencyUomId() <em>Base Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String baseCurrencyUomId = BASE_CURRENCY_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCogsMethodId() <em>Cogs Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogsMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String COGS_METHOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCogsMethodId() <em>Cogs Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogsMethodId()
	 * @generated
	 * @ordered
	 */
	protected String cogsMethodId = COGS_METHOD_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnableAccounting() <em>Enable Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAccounting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_ACCOUNTING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnableAccounting() <em>Enable Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAccounting()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAccounting = ENABLE_ACCOUNTING_EDEFAULT;
	/**
	 * The default value of the '{@link #getErrorGlJournalId() <em>Error Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_GL_JOURNAL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getErrorGlJournalId() <em>Error Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected String errorGlJournalId = ERROR_GL_JOURNAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFiscalYearStartDay() <em>Fiscal Year Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final long FISCAL_YEAR_START_DAY_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getFiscalYearStartDay() <em>Fiscal Year Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearStartDay()
	 * @generated
	 * @ordered
	 */
	protected long fiscalYearStartDay = FISCAL_YEAR_START_DAY_EDEFAULT;
	/**
	 * The default value of the '{@link #getFiscalYearStartMonth() <em>Fiscal Year Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearStartMonth()
	 * @generated
	 * @ordered
	 */
	protected static final long FISCAL_YEAR_START_MONTH_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getFiscalYearStartMonth() <em>Fiscal Year Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearStartMonth()
	 * @generated
	 * @ordered
	 */
	protected long fiscalYearStartMonth = FISCAL_YEAR_START_MONTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceIdPrefix() <em>Invoice Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceIdPrefix() <em>Invoice Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected String invoiceIdPrefix = INVOICE_ID_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceSeqCustMethId() <em>Invoice Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_SEQ_CUST_METH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceSeqCustMethId() <em>Invoice Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceSeqCustMethId = INVOICE_SEQ_CUST_METH_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastInvoiceNumber() <em>Last Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_INVOICE_NUMBER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLastInvoiceNumber() <em>Last Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected long lastInvoiceNumber = LAST_INVOICE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastInvoiceRestartDate() <em>Last Invoice Restart Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInvoiceRestartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_INVOICE_RESTART_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastInvoiceRestartDate() <em>Last Invoice Restart Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInvoiceRestartDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastInvoiceRestartDate = LAST_INVOICE_RESTART_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastOrderNumber() <em>Last Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_ORDER_NUMBER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLastOrderNumber() <em>Last Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected long lastOrderNumber = LAST_ORDER_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastQuoteNumber() <em>Last Quote Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastQuoteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_QUOTE_NUMBER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLastQuoteNumber() <em>Last Quote Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastQuoteNumber()
	 * @generated
	 * @ordered
	 */
	protected long lastQuoteNumber = LAST_QUOTE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getOldInvoiceSequenceEnumId() <em>Old Invoice Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldInvoiceSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_INVOICE_SEQUENCE_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOldInvoiceSequenceEnumId() <em>Old Invoice Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldInvoiceSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected String oldInvoiceSequenceEnumId = OLD_INVOICE_SEQUENCE_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOldOrderSequenceEnumId() <em>Old Order Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldOrderSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_ORDER_SEQUENCE_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOldOrderSequenceEnumId() <em>Old Order Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldOrderSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected String oldOrderSequenceEnumId = OLD_ORDER_SEQUENCE_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOldQuoteSequenceEnumId() <em>Old Quote Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldQuoteSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_QUOTE_SEQUENCE_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOldQuoteSequenceEnumId() <em>Old Quote Sequence Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldQuoteSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected String oldQuoteSequenceEnumId = OLD_QUOTE_SEQUENCE_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrderIdPrefix() <em>Order Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderIdPrefix() <em>Order Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected String orderIdPrefix = ORDER_ID_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrderSeqCustMethId() <em>Order Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_SEQ_CUST_METH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderSeqCustMethId() <em>Order Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected String orderSeqCustMethId = ORDER_SEQ_CUST_METH_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuoteIdPrefix() <em>Quote Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ID_PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuoteIdPrefix() <em>Quote Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected String quoteIdPrefix = QUOTE_ID_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuoteSeqCustMethId() <em>Quote Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_SEQ_CUST_METH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuoteSeqCustMethId() <em>Quote Seq Cust Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected String quoteSeqCustMethId = QUOTE_SEQ_CUST_METH_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRefundPaymentMethodId() <em>Refund Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFUND_PAYMENT_METHOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefundPaymentMethodId() <em>Refund Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected String refundPaymentMethodId = REFUND_PAYMENT_METHOD_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxFormId() <em>Tax Form Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxFormId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_FORM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxFormId() <em>Tax Form Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxFormId()
	 * @generated
	 * @ordered
	 */
	protected String taxFormId = TAX_FORM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isUseInvoiceIdForReturns() <em>Use Invoice Id For Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInvoiceIdForReturns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_INVOICE_ID_FOR_RETURNS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseInvoiceIdForReturns() <em>Use Invoice Id For Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInvoiceIdForReturns()
	 * @generated
	 * @ordered
	 */
	protected boolean useInvoiceIdForReturns = USE_INVOICE_ID_FOR_RETURNS_EDEFAULT;

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
	public String getBaseCurrencyUomId() {
		return baseCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCurrencyUomId(String newBaseCurrencyUomId) {
		String oldBaseCurrencyUomId = baseCurrencyUomId;
		baseCurrencyUomId = newBaseCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID, oldBaseCurrencyUomId, baseCurrencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCogsMethodId() {
		return cogsMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCogsMethodId(String newCogsMethodId) {
		String oldCogsMethodId = cogsMethodId;
		cogsMethodId = newCogsMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID, oldCogsMethodId, cogsMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAccounting() {
		return enableAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAccounting(boolean newEnableAccounting) {
		boolean oldEnableAccounting = enableAccounting;
		enableAccounting = newEnableAccounting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING, oldEnableAccounting, enableAccounting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartDay() {
		return fiscalYearStartDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartDay(long newFiscalYearStartDay) {
		long oldFiscalYearStartDay = fiscalYearStartDay;
		fiscalYearStartDay = newFiscalYearStartDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY, oldFiscalYearStartDay, fiscalYearStartDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartMonth() {
		return fiscalYearStartMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartMonth(long newFiscalYearStartMonth) {
		long oldFiscalYearStartMonth = fiscalYearStartMonth;
		fiscalYearStartMonth = newFiscalYearStartMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH, oldFiscalYearStartMonth, fiscalYearStartMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceIdPrefix() {
		return invoiceIdPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceIdPrefix(String newInvoiceIdPrefix) {
		String oldInvoiceIdPrefix = invoiceIdPrefix;
		invoiceIdPrefix = newInvoiceIdPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX, oldInvoiceIdPrefix, invoiceIdPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceSeqCustMethId() {
		return invoiceSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceSeqCustMethId(String newInvoiceSeqCustMethId) {
		String oldInvoiceSeqCustMethId = invoiceSeqCustMethId;
		invoiceSeqCustMethId = newInvoiceSeqCustMethId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID, oldInvoiceSeqCustMethId, invoiceSeqCustMethId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastInvoiceNumber() {
		return lastInvoiceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceNumber(long newLastInvoiceNumber) {
		long oldLastInvoiceNumber = lastInvoiceNumber;
		lastInvoiceNumber = newLastInvoiceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER, oldLastInvoiceNumber, lastInvoiceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInvoiceRestartDate() {
		return lastInvoiceRestartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceRestartDate(Date newLastInvoiceRestartDate) {
		Date oldLastInvoiceRestartDate = lastInvoiceRestartDate;
		lastInvoiceRestartDate = newLastInvoiceRestartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE, oldLastInvoiceRestartDate, lastInvoiceRestartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastOrderNumber() {
		return lastOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOrderNumber(long newLastOrderNumber) {
		long oldLastOrderNumber = lastOrderNumber;
		lastOrderNumber = newLastOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER, oldLastOrderNumber, lastOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastQuoteNumber() {
		return lastQuoteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastQuoteNumber(long newLastQuoteNumber) {
		long oldLastQuoteNumber = lastQuoteNumber;
		lastQuoteNumber = newLastQuoteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER, oldLastQuoteNumber, lastQuoteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldInvoiceSequenceEnumId() {
		return oldInvoiceSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldInvoiceSequenceEnumId(String newOldInvoiceSequenceEnumId) {
		String oldOldInvoiceSequenceEnumId = oldInvoiceSequenceEnumId;
		oldInvoiceSequenceEnumId = newOldInvoiceSequenceEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID, oldOldInvoiceSequenceEnumId, oldInvoiceSequenceEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldOrderSequenceEnumId() {
		return oldOrderSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldOrderSequenceEnumId(String newOldOrderSequenceEnumId) {
		String oldOldOrderSequenceEnumId = oldOrderSequenceEnumId;
		oldOrderSequenceEnumId = newOldOrderSequenceEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID, oldOldOrderSequenceEnumId, oldOrderSequenceEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldQuoteSequenceEnumId() {
		return oldQuoteSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuoteSequenceEnumId(String newOldQuoteSequenceEnumId) {
		String oldOldQuoteSequenceEnumId = oldQuoteSequenceEnumId;
		oldQuoteSequenceEnumId = newOldQuoteSequenceEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID, oldOldQuoteSequenceEnumId, oldQuoteSequenceEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderIdPrefix() {
		return orderIdPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderIdPrefix(String newOrderIdPrefix) {
		String oldOrderIdPrefix = orderIdPrefix;
		orderIdPrefix = newOrderIdPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX, oldOrderIdPrefix, orderIdPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderSeqCustMethId() {
		return orderSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSeqCustMethId(String newOrderSeqCustMethId) {
		String oldOrderSeqCustMethId = orderSeqCustMethId;
		orderSeqCustMethId = newOrderSeqCustMethId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID, oldOrderSeqCustMethId, orderSeqCustMethId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteIdPrefix() {
		return quoteIdPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteIdPrefix(String newQuoteIdPrefix) {
		String oldQuoteIdPrefix = quoteIdPrefix;
		quoteIdPrefix = newQuoteIdPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX, oldQuoteIdPrefix, quoteIdPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteSeqCustMethId() {
		return quoteSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteSeqCustMethId(String newQuoteSeqCustMethId) {
		String oldQuoteSeqCustMethId = quoteSeqCustMethId;
		quoteSeqCustMethId = newQuoteSeqCustMethId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID, oldQuoteSeqCustMethId, quoteSeqCustMethId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefundPaymentMethodId() {
		return refundPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPaymentMethodId(String newRefundPaymentMethodId) {
		String oldRefundPaymentMethodId = refundPaymentMethodId;
		refundPaymentMethodId = newRefundPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID, oldRefundPaymentMethodId, refundPaymentMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxFormId() {
		return taxFormId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxFormId(String newTaxFormId) {
		String oldTaxFormId = taxFormId;
		taxFormId = newTaxFormId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID, oldTaxFormId, taxFormId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseInvoiceIdForReturns() {
		return useInvoiceIdForReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseInvoiceIdForReturns(boolean newUseInvoiceIdForReturns) {
		boolean oldUseInvoiceIdForReturns = useInvoiceIdForReturns;
		useInvoiceIdForReturns = newUseInvoiceIdForReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS, oldUseInvoiceIdForReturns, useInvoiceIdForReturns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyPrefDocTypeTpls() {
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
	public String getErrorGlJournalId() {
		return errorGlJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorGlJournalId(String newErrorGlJournalId) {
		String oldErrorGlJournalId = errorGlJournalId;
		errorGlJournalId = newErrorGlJournalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID, oldErrorGlJournalId, errorGlJournalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				return getPartyId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				return getBaseCurrencyUomId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				return getCogsMethodId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				return isEnableAccounting();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				return getErrorGlJournalId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				return getFiscalYearStartDay();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				return getFiscalYearStartMonth();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				return getInvoiceIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				return getInvoiceSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				return getLastInvoiceNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				return getLastInvoiceRestartDate();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				return getLastOrderNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				return getLastQuoteNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				return getOldInvoiceSequenceEnumId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				return getOldOrderSequenceEnumId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				return getOldQuoteSequenceEnumId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				return getOrderIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				return getOrderSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				return getQuoteIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				return getQuoteSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				return getRefundPaymentMethodId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				return getTaxFormId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				return isUseInvoiceIdForReturns();
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				setBaseCurrencyUomId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				setCogsMethodId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				setEnableAccounting((Boolean)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				setErrorGlJournalId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				setFiscalYearStartDay((Long)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				setFiscalYearStartMonth((Long)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				setInvoiceIdPrefix((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				setInvoiceSeqCustMethId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				setLastInvoiceNumber((Long)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				setLastInvoiceRestartDate((Date)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				setLastOrderNumber((Long)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				setLastQuoteNumber((Long)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				setOldInvoiceSequenceEnumId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				setOldOrderSequenceEnumId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				setOldQuoteSequenceEnumId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				setOrderIdPrefix((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				setOrderSeqCustMethId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				setQuoteIdPrefix((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				setQuoteSeqCustMethId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				setRefundPaymentMethodId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				setTaxFormId((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				setUseInvoiceIdForReturns((Boolean)newValue);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				setBaseCurrencyUomId(BASE_CURRENCY_UOM_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				setCogsMethodId(COGS_METHOD_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				setEnableAccounting(ENABLE_ACCOUNTING_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				setErrorGlJournalId(ERROR_GL_JOURNAL_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				setFiscalYearStartDay(FISCAL_YEAR_START_DAY_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				setFiscalYearStartMonth(FISCAL_YEAR_START_MONTH_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				setInvoiceIdPrefix(INVOICE_ID_PREFIX_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				setInvoiceSeqCustMethId(INVOICE_SEQ_CUST_METH_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				setLastInvoiceNumber(LAST_INVOICE_NUMBER_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				setLastInvoiceRestartDate(LAST_INVOICE_RESTART_DATE_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				setLastOrderNumber(LAST_ORDER_NUMBER_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				setLastQuoteNumber(LAST_QUOTE_NUMBER_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				setOldInvoiceSequenceEnumId(OLD_INVOICE_SEQUENCE_ENUM_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				setOldOrderSequenceEnumId(OLD_ORDER_SEQUENCE_ENUM_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				setOldQuoteSequenceEnumId(OLD_QUOTE_SEQUENCE_ENUM_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				setOrderIdPrefix(ORDER_ID_PREFIX_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				setOrderSeqCustMethId(ORDER_SEQ_CUST_METH_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				setQuoteIdPrefix(QUOTE_ID_PREFIX_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				setQuoteSeqCustMethId(QUOTE_SEQ_CUST_METH_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				setRefundPaymentMethodId(REFUND_PAYMENT_METHOD_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				setTaxFormId(TAX_FORM_ID_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				setUseInvoiceIdForReturns(USE_INVOICE_ID_FOR_RETURNS_EDEFAULT);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				return BASE_CURRENCY_UOM_ID_EDEFAULT == null ? baseCurrencyUomId != null : !BASE_CURRENCY_UOM_ID_EDEFAULT.equals(baseCurrencyUomId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				return COGS_METHOD_ID_EDEFAULT == null ? cogsMethodId != null : !COGS_METHOD_ID_EDEFAULT.equals(cogsMethodId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				return enableAccounting != ENABLE_ACCOUNTING_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				return ERROR_GL_JOURNAL_ID_EDEFAULT == null ? errorGlJournalId != null : !ERROR_GL_JOURNAL_ID_EDEFAULT.equals(errorGlJournalId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				return fiscalYearStartDay != FISCAL_YEAR_START_DAY_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				return fiscalYearStartMonth != FISCAL_YEAR_START_MONTH_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				return INVOICE_ID_PREFIX_EDEFAULT == null ? invoiceIdPrefix != null : !INVOICE_ID_PREFIX_EDEFAULT.equals(invoiceIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				return INVOICE_SEQ_CUST_METH_ID_EDEFAULT == null ? invoiceSeqCustMethId != null : !INVOICE_SEQ_CUST_METH_ID_EDEFAULT.equals(invoiceSeqCustMethId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				return lastInvoiceNumber != LAST_INVOICE_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				return LAST_INVOICE_RESTART_DATE_EDEFAULT == null ? lastInvoiceRestartDate != null : !LAST_INVOICE_RESTART_DATE_EDEFAULT.equals(lastInvoiceRestartDate);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				return lastOrderNumber != LAST_ORDER_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				return lastQuoteNumber != LAST_QUOTE_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				return OLD_INVOICE_SEQUENCE_ENUM_ID_EDEFAULT == null ? oldInvoiceSequenceEnumId != null : !OLD_INVOICE_SEQUENCE_ENUM_ID_EDEFAULT.equals(oldInvoiceSequenceEnumId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				return OLD_ORDER_SEQUENCE_ENUM_ID_EDEFAULT == null ? oldOrderSequenceEnumId != null : !OLD_ORDER_SEQUENCE_ENUM_ID_EDEFAULT.equals(oldOrderSequenceEnumId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				return OLD_QUOTE_SEQUENCE_ENUM_ID_EDEFAULT == null ? oldQuoteSequenceEnumId != null : !OLD_QUOTE_SEQUENCE_ENUM_ID_EDEFAULT.equals(oldQuoteSequenceEnumId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				return ORDER_ID_PREFIX_EDEFAULT == null ? orderIdPrefix != null : !ORDER_ID_PREFIX_EDEFAULT.equals(orderIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				return ORDER_SEQ_CUST_METH_ID_EDEFAULT == null ? orderSeqCustMethId != null : !ORDER_SEQ_CUST_METH_ID_EDEFAULT.equals(orderSeqCustMethId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				return QUOTE_ID_PREFIX_EDEFAULT == null ? quoteIdPrefix != null : !QUOTE_ID_PREFIX_EDEFAULT.equals(quoteIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				return QUOTE_SEQ_CUST_METH_ID_EDEFAULT == null ? quoteSeqCustMethId != null : !QUOTE_SEQ_CUST_METH_ID_EDEFAULT.equals(quoteSeqCustMethId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				return REFUND_PAYMENT_METHOD_ID_EDEFAULT == null ? refundPaymentMethodId != null : !REFUND_PAYMENT_METHOD_ID_EDEFAULT.equals(refundPaymentMethodId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				return TAX_FORM_ID_EDEFAULT == null ? taxFormId != null : !TAX_FORM_ID_EDEFAULT.equals(taxFormId);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				return useInvoiceIdForReturns != USE_INVOICE_ID_FOR_RETURNS_EDEFAULT;
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", baseCurrencyUomId: ");
		result.append(baseCurrencyUomId);
		result.append(", cogsMethodId: ");
		result.append(cogsMethodId);
		result.append(", enableAccounting: ");
		result.append(enableAccounting);
		result.append(", errorGlJournalId: ");
		result.append(errorGlJournalId);
		result.append(", fiscalYearStartDay: ");
		result.append(fiscalYearStartDay);
		result.append(", fiscalYearStartMonth: ");
		result.append(fiscalYearStartMonth);
		result.append(", invoiceIdPrefix: ");
		result.append(invoiceIdPrefix);
		result.append(", invoiceSeqCustMethId: ");
		result.append(invoiceSeqCustMethId);
		result.append(", lastInvoiceNumber: ");
		result.append(lastInvoiceNumber);
		result.append(", lastInvoiceRestartDate: ");
		result.append(lastInvoiceRestartDate);
		result.append(", lastOrderNumber: ");
		result.append(lastOrderNumber);
		result.append(", lastQuoteNumber: ");
		result.append(lastQuoteNumber);
		result.append(", oldInvoiceSequenceEnumId: ");
		result.append(oldInvoiceSequenceEnumId);
		result.append(", oldOrderSequenceEnumId: ");
		result.append(oldOrderSequenceEnumId);
		result.append(", oldQuoteSequenceEnumId: ");
		result.append(oldQuoteSequenceEnumId);
		result.append(", orderIdPrefix: ");
		result.append(orderIdPrefix);
		result.append(", orderSeqCustMethId: ");
		result.append(orderSeqCustMethId);
		result.append(", quoteIdPrefix: ");
		result.append(quoteIdPrefix);
		result.append(", quoteSeqCustMethId: ");
		result.append(quoteSeqCustMethId);
		result.append(", refundPaymentMethodId: ");
		result.append(refundPaymentMethodId);
		result.append(", taxFormId: ");
		result.append(taxFormId);
		result.append(", useInvoiceIdForReturns: ");
		result.append(useInvoiceIdForReturns);
		result.append(')');
		return result.toString();
	}

} //PartyAcctgPreferenceImpl
