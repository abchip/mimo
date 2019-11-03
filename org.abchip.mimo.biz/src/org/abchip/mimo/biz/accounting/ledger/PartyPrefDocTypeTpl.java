/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Pref Doc Type Tpl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl()
 * @model
 * @generated
 */
public interface PartyPrefDocTypeTpl extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Custom Screen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Screen Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #setCustomScreenId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_CustomScreenId()
	 * @model
	 * @generated
	 */
	String getCustomScreenId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #getCustomScreenId()
	 * @generated
	 */
	void setCustomScreenId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #setInvoiceTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_InvoiceTypeId()
	 * @model annotation="mimo-ent-domain frame='InvoiceType'"
	 * @generated
	 */
	String getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceTypeId <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Order Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type Id</em>' attribute.
	 * @see #setOrderTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_OrderTypeId()
	 * @model annotation="mimo-ent-domain frame='OrderType'"
	 * @generated
	 */
	String getOrderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getOrderTypeId <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type Id</em>' attribute.
	 * @see #getOrderTypeId()
	 * @generated
	 */
	void setOrderTypeId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Party Pref Doc Type Tpl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Pref Doc Type Tpl Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Pref Doc Type Tpl Id</em>' attribute.
	 * @see #setPartyPrefDocTypeTplId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyPrefDocTypeTplId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Pref Doc Type Tpl Id</em>' attribute.
	 * @see #getPartyPrefDocTypeTplId()
	 * @generated
	 */
	void setPartyPrefDocTypeTplId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Type Id</em>' attribute.
	 * @see #setQuoteTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_QuoteTypeId()
	 * @model annotation="mimo-ent-domain frame='QuoteType'"
	 * @generated
	 */
	String getQuoteTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getQuoteTypeId <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Type Id</em>' attribute.
	 * @see #getQuoteTypeId()
	 * @generated
	 */
	void setQuoteTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PartyPrefDocTypeTpl
