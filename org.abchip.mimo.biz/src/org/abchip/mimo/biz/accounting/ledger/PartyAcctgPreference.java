/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Acctg Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUomId <em>Base Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getCogsMethodId <em>Cogs Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isEnableAccounting <em>Enable Accounting</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getErrorGlJournalId <em>Error Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMethId <em>Invoice Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber <em>Last Invoice Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastOrderNumber <em>Last Order Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber <em>Last Quote Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnumId <em>Old Invoice Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnumId <em>Old Order Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnumId <em>Old Quote Sequence Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix <em>Order Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMethId <em>Order Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix <em>Quote Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMethId <em>Quote Seq Cust Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethodId <em>Refund Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getTaxFormId <em>Tax Form Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference()
 * @model annotation="mimo-ent-frame title='Party (organization) accounting preferences'"
 * @generated
 */
public interface PartyAcctgPreference extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Enable Accounting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Accounting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Accounting</em>' attribute.
	 * @see #setEnableAccounting(boolean)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_EnableAccounting()
	 * @model
	 * @generated
	 */
	boolean isEnableAccounting();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isEnableAccounting <em>Enable Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Accounting</em>' attribute.
	 * @see #isEnableAccounting()
	 * @generated
	 */
	void setEnableAccounting(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Currency Uom Id</em>' reference.
	 * @see #setBaseCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_BaseCurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getBaseCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUomId <em>Base Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Currency Uom Id</em>' reference.
	 * @see #getBaseCurrencyUomId()
	 * @generated
	 */
	void setBaseCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Cogs Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogs Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogs Method Id</em>' reference.
	 * @see #setCogsMethodId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_CogsMethodId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getCogsMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getCogsMethodId <em>Cogs Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogs Method Id</em>' reference.
	 * @see #getCogsMethodId()
	 * @generated
	 */
	void setCogsMethodId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year Start Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year Start Day</em>' attribute.
	 * @see #setFiscalYearStartDay(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_FiscalYearStartDay()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFiscalYearStartDay();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year Start Day</em>' attribute.
	 * @see #getFiscalYearStartDay()
	 * @generated
	 */
	void setFiscalYearStartDay(long value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year Start Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year Start Month</em>' attribute.
	 * @see #setFiscalYearStartMonth(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_FiscalYearStartMonth()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFiscalYearStartMonth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year Start Month</em>' attribute.
	 * @see #getFiscalYearStartMonth()
	 * @generated
	 */
	void setFiscalYearStartMonth(long value);

	/**
	 * Returns the value of the '<em><b>Invoice Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id Prefix</em>' attribute.
	 * @see #setInvoiceIdPrefix(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_InvoiceIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getInvoiceIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id Prefix</em>' attribute.
	 * @see #getInvoiceIdPrefix()
	 * @generated
	 */
	void setInvoiceIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Seq Cust Meth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Seq Cust Meth Id</em>' reference.
	 * @see #setInvoiceSeqCustMethId(CustomMethod)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_InvoiceSeqCustMethId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getInvoiceSeqCustMethId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMethId <em>Invoice Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Seq Cust Meth Id</em>' reference.
	 * @see #getInvoiceSeqCustMethId()
	 * @generated
	 */
	void setInvoiceSeqCustMethId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Last Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Invoice Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Invoice Number</em>' attribute.
	 * @see #setLastInvoiceNumber(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastInvoiceNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastInvoiceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber <em>Last Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Invoice Number</em>' attribute.
	 * @see #getLastInvoiceNumber()
	 * @generated
	 */
	void setLastInvoiceNumber(long value);

	/**
	 * Returns the value of the '<em><b>Last Invoice Restart Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Invoice Restart Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Invoice Restart Date</em>' attribute.
	 * @see #setLastInvoiceRestartDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastInvoiceRestartDate()
	 * @model
	 * @generated
	 */
	Date getLastInvoiceRestartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Invoice Restart Date</em>' attribute.
	 * @see #getLastInvoiceRestartDate()
	 * @generated
	 */
	void setLastInvoiceRestartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Order Number</em>' attribute.
	 * @see #setLastOrderNumber(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastOrderNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastOrderNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastOrderNumber <em>Last Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Order Number</em>' attribute.
	 * @see #getLastOrderNumber()
	 * @generated
	 */
	void setLastOrderNumber(long value);

	/**
	 * Returns the value of the '<em><b>Last Quote Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Quote Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Quote Number</em>' attribute.
	 * @see #setLastQuoteNumber(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastQuoteNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastQuoteNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber <em>Last Quote Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Quote Number</em>' attribute.
	 * @see #getLastQuoteNumber()
	 * @generated
	 */
	void setLastQuoteNumber(long value);

	/**
	 * Returns the value of the '<em><b>Old Invoice Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Invoice Sequence Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Invoice Sequence Enum Id</em>' reference.
	 * @see #setOldInvoiceSequenceEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldInvoiceSequenceEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldInvoiceSequenceEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnumId <em>Old Invoice Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Invoice Sequence Enum Id</em>' reference.
	 * @see #getOldInvoiceSequenceEnumId()
	 * @generated
	 */
	void setOldInvoiceSequenceEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Old Order Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Order Sequence Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Order Sequence Enum Id</em>' reference.
	 * @see #setOldOrderSequenceEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldOrderSequenceEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldOrderSequenceEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnumId <em>Old Order Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Order Sequence Enum Id</em>' reference.
	 * @see #getOldOrderSequenceEnumId()
	 * @generated
	 */
	void setOldOrderSequenceEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Old Quote Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Quote Sequence Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Quote Sequence Enum Id</em>' reference.
	 * @see #setOldQuoteSequenceEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldQuoteSequenceEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldQuoteSequenceEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnumId <em>Old Quote Sequence Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Quote Sequence Enum Id</em>' reference.
	 * @see #getOldQuoteSequenceEnumId()
	 * @generated
	 */
	void setOldQuoteSequenceEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Order Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id Prefix</em>' attribute.
	 * @see #setOrderIdPrefix(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OrderIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getOrderIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix <em>Order Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id Prefix</em>' attribute.
	 * @see #getOrderIdPrefix()
	 * @generated
	 */
	void setOrderIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Order Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Seq Cust Meth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Seq Cust Meth Id</em>' reference.
	 * @see #setOrderSeqCustMethId(CustomMethod)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OrderSeqCustMethId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getOrderSeqCustMethId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMethId <em>Order Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Seq Cust Meth Id</em>' reference.
	 * @see #getOrderSeqCustMethId()
	 * @generated
	 */
	void setOrderSeqCustMethId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id Prefix</em>' attribute.
	 * @see #setQuoteIdPrefix(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_QuoteIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getQuoteIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix <em>Quote Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id Prefix</em>' attribute.
	 * @see #getQuoteIdPrefix()
	 * @generated
	 */
	void setQuoteIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Use Invoice Id For Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Invoice Id For Returns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Invoice Id For Returns</em>' attribute.
	 * @see #setUseInvoiceIdForReturns(boolean)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_UseInvoiceIdForReturns()
	 * @model
	 * @generated
	 */
	boolean isUseInvoiceIdForReturns();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Invoice Id For Returns</em>' attribute.
	 * @see #isUseInvoiceIdForReturns()
	 * @generated
	 */
	void setUseInvoiceIdForReturns(boolean value);

	/**
	 * Returns the value of the '<em><b>Quote Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Seq Cust Meth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Seq Cust Meth Id</em>' reference.
	 * @see #setQuoteSeqCustMethId(CustomMethod)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_QuoteSeqCustMethId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getQuoteSeqCustMethId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMethId <em>Quote Seq Cust Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Seq Cust Meth Id</em>' reference.
	 * @see #getQuoteSeqCustMethId()
	 * @generated
	 */
	void setQuoteSeqCustMethId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Refund Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refund Payment Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund Payment Method Id</em>' reference.
	 * @see #setRefundPaymentMethodId(PaymentMethod)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_RefundPaymentMethodId()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getRefundPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethodId <em>Refund Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund Payment Method Id</em>' reference.
	 * @see #getRefundPaymentMethodId()
	 * @generated
	 */
	void setRefundPaymentMethodId(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Tax Form Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Form Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Form Id</em>' reference.
	 * @see #setTaxFormId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_TaxFormId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getTaxFormId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getTaxFormId <em>Tax Form Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Form Id</em>' reference.
	 * @see #getTaxFormId()
	 * @generated
	 */
	void setTaxFormId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Error Gl Journal Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Gl Journal Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Gl Journal Id</em>' reference.
	 * @see #setErrorGlJournalId(GlJournal)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyAcctgPreference_ErrorGlJournalId()
	 * @model keys="glJournalId"
	 *        annotation="mimo-ent-slot help='Journal to which all the failed automatic transaction are assigned.\n                If the error journal is set, if the GL posting fails for some reason the triggering operation (finalizing an invoice or payment or whatever) would NOT roll back, instead the partial GL post would be placed into the error journal.'"
	 * @generated
	 */
	GlJournal getErrorGlJournalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getErrorGlJournalId <em>Error Gl Journal Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Gl Journal Id</em>' reference.
	 * @see #getErrorGlJournalId()
	 * @generated
	 */
	void setErrorGlJournalId(GlJournal value);

} // PartyAcctgPreference
