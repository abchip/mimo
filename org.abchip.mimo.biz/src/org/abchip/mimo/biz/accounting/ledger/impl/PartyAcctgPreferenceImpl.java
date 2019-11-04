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

import org.abchip.mimo.biz.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Acctg Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#isEnableAccounting <em>Enable Accounting</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceNumber <em>Last Invoice Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastOrderNumber <em>Last Order Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastQuoteNumber <em>Last Quote Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderIdPrefix <em>Order Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteIdPrefix <em>Quote Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#isUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getTaxFormId <em>Tax Form Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getCogsMethodId <em>Cogs Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getBaseCurrencyUomId <em>Base Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceSeqCustMethId <em>Invoice Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteSeqCustMethId <em>Quote Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderSeqCustMethId <em>Order Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getRefundPaymentMethodId <em>Refund Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getErrorGlJournalId <em>Error Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldInvoiceSequenceEnumId <em>Old Invoice Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldQuoteSequenceEnumId <em>Old Quote Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldOrderSequenceEnumId <em>Old Order Sequence Enum Id</em>}</li>
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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
	/**
	 * The cached value of the '{@link #getTaxFormId() <em>Tax Form Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxFormId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration taxFormId;
	/**
	 * The cached value of the '{@link #getCogsMethodId() <em>Cogs Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogsMethodId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration cogsMethodId;
	/**
	 * The cached value of the '{@link #getBaseCurrencyUomId() <em>Base Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom baseCurrencyUomId;
	/**
	 * The cached value of the '{@link #getInvoiceSeqCustMethId() <em>Invoice Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod invoiceSeqCustMethId;
	/**
	 * The cached value of the '{@link #getQuoteSeqCustMethId() <em>Quote Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod quoteSeqCustMethId;
	/**
	 * The cached value of the '{@link #getOrderSeqCustMethId() <em>Order Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderSeqCustMethId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod orderSeqCustMethId;
	/**
	 * The cached value of the '{@link #getRefundPaymentMethodId() <em>Refund Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod refundPaymentMethodId;
	/**
	 * The cached value of the '{@link #getErrorGlJournalId() <em>Error Gl Journal Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected GlJournal errorGlJournalId;
	/**
	 * The cached value of the '{@link #getOldInvoiceSequenceEnumId() <em>Old Invoice Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldInvoiceSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration oldInvoiceSequenceEnumId;
	/**
	 * The cached value of the '{@link #getOldQuoteSequenceEnumId() <em>Old Quote Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldQuoteSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration oldQuoteSequenceEnumId;
	/**
	 * The cached value of the '{@link #getOldOrderSequenceEnumId() <em>Old Order Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldOrderSequenceEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration oldOrderSequenceEnumId;

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
	public Uom getBaseCurrencyUomId() {
		if (baseCurrencyUomId != null && ((EObject)baseCurrencyUomId).eIsProxy()) {
			InternalEObject oldBaseCurrencyUomId = (InternalEObject)baseCurrencyUomId;
			baseCurrencyUomId = (Uom)eResolveProxy(oldBaseCurrencyUomId);
			if (baseCurrencyUomId != oldBaseCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID, oldBaseCurrencyUomId, baseCurrencyUomId));
			}
		}
		return baseCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetBaseCurrencyUomId() {
		return baseCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCurrencyUomId(Uom newBaseCurrencyUomId) {
		Uom oldBaseCurrencyUomId = baseCurrencyUomId;
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
	public Enumeration getCogsMethodId() {
		if (cogsMethodId != null && ((EObject)cogsMethodId).eIsProxy()) {
			InternalEObject oldCogsMethodId = (InternalEObject)cogsMethodId;
			cogsMethodId = (Enumeration)eResolveProxy(oldCogsMethodId);
			if (cogsMethodId != oldCogsMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID, oldCogsMethodId, cogsMethodId));
			}
		}
		return cogsMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetCogsMethodId() {
		return cogsMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCogsMethodId(Enumeration newCogsMethodId) {
		Enumeration oldCogsMethodId = cogsMethodId;
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
	public CustomMethod getInvoiceSeqCustMethId() {
		if (invoiceSeqCustMethId != null && ((EObject)invoiceSeqCustMethId).eIsProxy()) {
			InternalEObject oldInvoiceSeqCustMethId = (InternalEObject)invoiceSeqCustMethId;
			invoiceSeqCustMethId = (CustomMethod)eResolveProxy(oldInvoiceSeqCustMethId);
			if (invoiceSeqCustMethId != oldInvoiceSeqCustMethId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID, oldInvoiceSeqCustMethId, invoiceSeqCustMethId));
			}
		}
		return invoiceSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetInvoiceSeqCustMethId() {
		return invoiceSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceSeqCustMethId(CustomMethod newInvoiceSeqCustMethId) {
		CustomMethod oldInvoiceSeqCustMethId = invoiceSeqCustMethId;
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
	public Enumeration getOldInvoiceSequenceEnumId() {
		if (oldInvoiceSequenceEnumId != null && ((EObject)oldInvoiceSequenceEnumId).eIsProxy()) {
			InternalEObject oldOldInvoiceSequenceEnumId = (InternalEObject)oldInvoiceSequenceEnumId;
			oldInvoiceSequenceEnumId = (Enumeration)eResolveProxy(oldOldInvoiceSequenceEnumId);
			if (oldInvoiceSequenceEnumId != oldOldInvoiceSequenceEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID, oldOldInvoiceSequenceEnumId, oldInvoiceSequenceEnumId));
			}
		}
		return oldInvoiceSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetOldInvoiceSequenceEnumId() {
		return oldInvoiceSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldInvoiceSequenceEnumId(Enumeration newOldInvoiceSequenceEnumId) {
		Enumeration oldOldInvoiceSequenceEnumId = oldInvoiceSequenceEnumId;
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
	public Enumeration getOldOrderSequenceEnumId() {
		if (oldOrderSequenceEnumId != null && ((EObject)oldOrderSequenceEnumId).eIsProxy()) {
			InternalEObject oldOldOrderSequenceEnumId = (InternalEObject)oldOrderSequenceEnumId;
			oldOrderSequenceEnumId = (Enumeration)eResolveProxy(oldOldOrderSequenceEnumId);
			if (oldOrderSequenceEnumId != oldOldOrderSequenceEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID, oldOldOrderSequenceEnumId, oldOrderSequenceEnumId));
			}
		}
		return oldOrderSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetOldOrderSequenceEnumId() {
		return oldOrderSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldOrderSequenceEnumId(Enumeration newOldOrderSequenceEnumId) {
		Enumeration oldOldOrderSequenceEnumId = oldOrderSequenceEnumId;
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
	public Enumeration getOldQuoteSequenceEnumId() {
		if (oldQuoteSequenceEnumId != null && ((EObject)oldQuoteSequenceEnumId).eIsProxy()) {
			InternalEObject oldOldQuoteSequenceEnumId = (InternalEObject)oldQuoteSequenceEnumId;
			oldQuoteSequenceEnumId = (Enumeration)eResolveProxy(oldOldQuoteSequenceEnumId);
			if (oldQuoteSequenceEnumId != oldOldQuoteSequenceEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID, oldOldQuoteSequenceEnumId, oldQuoteSequenceEnumId));
			}
		}
		return oldQuoteSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetOldQuoteSequenceEnumId() {
		return oldQuoteSequenceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuoteSequenceEnumId(Enumeration newOldQuoteSequenceEnumId) {
		Enumeration oldOldQuoteSequenceEnumId = oldQuoteSequenceEnumId;
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
	public CustomMethod getOrderSeqCustMethId() {
		if (orderSeqCustMethId != null && ((EObject)orderSeqCustMethId).eIsProxy()) {
			InternalEObject oldOrderSeqCustMethId = (InternalEObject)orderSeqCustMethId;
			orderSeqCustMethId = (CustomMethod)eResolveProxy(oldOrderSeqCustMethId);
			if (orderSeqCustMethId != oldOrderSeqCustMethId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID, oldOrderSeqCustMethId, orderSeqCustMethId));
			}
		}
		return orderSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetOrderSeqCustMethId() {
		return orderSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSeqCustMethId(CustomMethod newOrderSeqCustMethId) {
		CustomMethod oldOrderSeqCustMethId = orderSeqCustMethId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID, oldPartyId, partyId));
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
	public CustomMethod getQuoteSeqCustMethId() {
		if (quoteSeqCustMethId != null && ((EObject)quoteSeqCustMethId).eIsProxy()) {
			InternalEObject oldQuoteSeqCustMethId = (InternalEObject)quoteSeqCustMethId;
			quoteSeqCustMethId = (CustomMethod)eResolveProxy(oldQuoteSeqCustMethId);
			if (quoteSeqCustMethId != oldQuoteSeqCustMethId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID, oldQuoteSeqCustMethId, quoteSeqCustMethId));
			}
		}
		return quoteSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetQuoteSeqCustMethId() {
		return quoteSeqCustMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteSeqCustMethId(CustomMethod newQuoteSeqCustMethId) {
		CustomMethod oldQuoteSeqCustMethId = quoteSeqCustMethId;
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
	public PaymentMethod getRefundPaymentMethodId() {
		if (refundPaymentMethodId != null && ((EObject)refundPaymentMethodId).eIsProxy()) {
			InternalEObject oldRefundPaymentMethodId = (InternalEObject)refundPaymentMethodId;
			refundPaymentMethodId = (PaymentMethod)eResolveProxy(oldRefundPaymentMethodId);
			if (refundPaymentMethodId != oldRefundPaymentMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID, oldRefundPaymentMethodId, refundPaymentMethodId));
			}
		}
		return refundPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetRefundPaymentMethodId() {
		return refundPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPaymentMethodId(PaymentMethod newRefundPaymentMethodId) {
		PaymentMethod oldRefundPaymentMethodId = refundPaymentMethodId;
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
	public Enumeration getTaxFormId() {
		if (taxFormId != null && ((EObject)taxFormId).eIsProxy()) {
			InternalEObject oldTaxFormId = (InternalEObject)taxFormId;
			taxFormId = (Enumeration)eResolveProxy(oldTaxFormId);
			if (taxFormId != oldTaxFormId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID, oldTaxFormId, taxFormId));
			}
		}
		return taxFormId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetTaxFormId() {
		return taxFormId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxFormId(Enumeration newTaxFormId) {
		Enumeration oldTaxFormId = taxFormId;
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
	public GlJournal getErrorGlJournalId() {
		if (errorGlJournalId != null && ((EObject)errorGlJournalId).eIsProxy()) {
			InternalEObject oldErrorGlJournalId = (InternalEObject)errorGlJournalId;
			errorGlJournalId = (GlJournal)eResolveProxy(oldErrorGlJournalId);
			if (errorGlJournalId != oldErrorGlJournalId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID, oldErrorGlJournalId, errorGlJournalId));
			}
		}
		return errorGlJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlJournal basicGetErrorGlJournalId() {
		return errorGlJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorGlJournalId(GlJournal newErrorGlJournalId) {
		GlJournal oldErrorGlJournalId = errorGlJournalId;
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				return isEnableAccounting();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				return getFiscalYearStartDay();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				return getFiscalYearStartMonth();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				return getInvoiceIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				return getLastInvoiceNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				return getLastInvoiceRestartDate();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				return getLastOrderNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				return getLastQuoteNumber();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				return getOrderIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				return getQuoteIdPrefix();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				return isUseInvoiceIdForReturns();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				if (resolve) return getTaxFormId();
				return basicGetTaxFormId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				if (resolve) return getCogsMethodId();
				return basicGetCogsMethodId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				if (resolve) return getBaseCurrencyUomId();
				return basicGetBaseCurrencyUomId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				if (resolve) return getInvoiceSeqCustMethId();
				return basicGetInvoiceSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				if (resolve) return getQuoteSeqCustMethId();
				return basicGetQuoteSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				if (resolve) return getOrderSeqCustMethId();
				return basicGetOrderSeqCustMethId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				if (resolve) return getRefundPaymentMethodId();
				return basicGetRefundPaymentMethodId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				if (resolve) return getErrorGlJournalId();
				return basicGetErrorGlJournalId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				if (resolve) return getOldInvoiceSequenceEnumId();
				return basicGetOldInvoiceSequenceEnumId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				if (resolve) return getOldQuoteSequenceEnumId();
				return basicGetOldQuoteSequenceEnumId();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				if (resolve) return getOldOrderSequenceEnumId();
				return basicGetOldOrderSequenceEnumId();
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				setEnableAccounting((Boolean)newValue);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				setOrderIdPrefix((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				setQuoteIdPrefix((String)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				setUseInvoiceIdForReturns((Boolean)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				setTaxFormId((Enumeration)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				setCogsMethodId((Enumeration)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				setBaseCurrencyUomId((Uom)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				setInvoiceSeqCustMethId((CustomMethod)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				setQuoteSeqCustMethId((CustomMethod)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				setOrderSeqCustMethId((CustomMethod)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				setRefundPaymentMethodId((PaymentMethod)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				setErrorGlJournalId((GlJournal)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				setOldInvoiceSequenceEnumId((Enumeration)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				setOldQuoteSequenceEnumId((Enumeration)newValue);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				setOldOrderSequenceEnumId((Enumeration)newValue);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				setEnableAccounting(ENABLE_ACCOUNTING_EDEFAULT);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				setOrderIdPrefix(ORDER_ID_PREFIX_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				setQuoteIdPrefix(QUOTE_ID_PREFIX_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				setUseInvoiceIdForReturns(USE_INVOICE_ID_FOR_RETURNS_EDEFAULT);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				setTaxFormId((Enumeration)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				setCogsMethodId((Enumeration)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				setBaseCurrencyUomId((Uom)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				setInvoiceSeqCustMethId((CustomMethod)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				setQuoteSeqCustMethId((CustomMethod)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				setOrderSeqCustMethId((CustomMethod)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				setRefundPaymentMethodId((PaymentMethod)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				setErrorGlJournalId((GlJournal)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				setOldInvoiceSequenceEnumId((Enumeration)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				setOldQuoteSequenceEnumId((Enumeration)null);
				return;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				setOldOrderSequenceEnumId((Enumeration)null);
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
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING:
				return enableAccounting != ENABLE_ACCOUNTING_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY:
				return fiscalYearStartDay != FISCAL_YEAR_START_DAY_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH:
				return fiscalYearStartMonth != FISCAL_YEAR_START_MONTH_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX:
				return INVOICE_ID_PREFIX_EDEFAULT == null ? invoiceIdPrefix != null : !INVOICE_ID_PREFIX_EDEFAULT.equals(invoiceIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER:
				return lastInvoiceNumber != LAST_INVOICE_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE:
				return LAST_INVOICE_RESTART_DATE_EDEFAULT == null ? lastInvoiceRestartDate != null : !LAST_INVOICE_RESTART_DATE_EDEFAULT.equals(lastInvoiceRestartDate);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER:
				return lastOrderNumber != LAST_ORDER_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER:
				return lastQuoteNumber != LAST_QUOTE_NUMBER_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX:
				return ORDER_ID_PREFIX_EDEFAULT == null ? orderIdPrefix != null : !ORDER_ID_PREFIX_EDEFAULT.equals(orderIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX:
				return QUOTE_ID_PREFIX_EDEFAULT == null ? quoteIdPrefix != null : !QUOTE_ID_PREFIX_EDEFAULT.equals(quoteIdPrefix);
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS:
				return useInvoiceIdForReturns != USE_INVOICE_ID_FOR_RETURNS_EDEFAULT;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__PARTY_ID:
				return partyId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__TAX_FORM_ID:
				return taxFormId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID:
				return cogsMethodId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID:
				return baseCurrencyUomId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID:
				return invoiceSeqCustMethId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID:
				return quoteSeqCustMethId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID:
				return orderSeqCustMethId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID:
				return refundPaymentMethodId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID:
				return errorGlJournalId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID:
				return oldInvoiceSequenceEnumId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID:
				return oldQuoteSequenceEnumId != null;
			case LedgerPackage.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID:
				return oldOrderSequenceEnumId != null;
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
		result.append(" (enableAccounting: ");
		result.append(enableAccounting);
		result.append(", fiscalYearStartDay: ");
		result.append(fiscalYearStartDay);
		result.append(", fiscalYearStartMonth: ");
		result.append(fiscalYearStartMonth);
		result.append(", invoiceIdPrefix: ");
		result.append(invoiceIdPrefix);
		result.append(", lastInvoiceNumber: ");
		result.append(lastInvoiceNumber);
		result.append(", lastInvoiceRestartDate: ");
		result.append(lastInvoiceRestartDate);
		result.append(", lastOrderNumber: ");
		result.append(lastOrderNumber);
		result.append(", lastQuoteNumber: ");
		result.append(lastQuoteNumber);
		result.append(", orderIdPrefix: ");
		result.append(orderIdPrefix);
		result.append(", quoteIdPrefix: ");
		result.append(quoteIdPrefix);
		result.append(", useInvoiceIdForReturns: ");
		result.append(useInvoiceIdForReturns);
		result.append(')');
		return result.toString();
	}

} //PartyAcctgPreferenceImpl
