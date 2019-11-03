/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteName <em>Quote Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteAttributes <em>Quote Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteCoefficients <em>Quote Coefficients</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteItems <em>Quote Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteNotes <em>Quote Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteWorkEfforts <em>Quote Work Efforts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Quote extends BizEntityTyped<QuoteType> {
	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_IssueDate()
	 * @model
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

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
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' attribute.
	 * @see #setQuoteId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteId <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' attribute.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Name</em>' attribute.
	 * @see #setQuoteName(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteName()
	 * @model
	 * @generated
	 */
	String getQuoteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteName <em>Quote Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Name</em>' attribute.
	 * @see #getQuoteName()
	 * @generated
	 */
	void setQuoteName(String value);

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
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteTypeId()
	 * @model annotation="mimo-ent-domain frame='QuoteType'"
	 * @generated
	 */
	String getQuoteTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteTypeId <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Type Id</em>' attribute.
	 * @see #getQuoteTypeId()
	 * @generated
	 */
	void setQuoteTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum Id</em>' attribute.
	 * @see #setSalesChannelEnumId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_SalesChannelEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum Id</em>' attribute.
	 * @see #getSalesChannelEnumId()
	 * @generated
	 */
	void setSalesChannelEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(Date)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_ValidFromDate()
	 * @model
	 * @generated
	 */
	Date getValidFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Date</em>' attribute.
	 * @see #getValidFromDate()
	 * @generated
	 */
	void setValidFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Valid Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Thru Date</em>' attribute.
	 * @see #setValidThruDate(Date)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_ValidThruDate()
	 * @model
	 * @generated
	 */
	Date getValidThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Thru Date</em>' attribute.
	 * @see #getValidThruDate()
	 * @generated
	 */
	void setValidThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Quote Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAttribute'"
	 * @generated
	 */
	List<String> getQuoteAttributes();

	/**
	 * Returns the value of the '<em><b>Quote Coefficients</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Coefficients</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Coefficients</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteCoefficients()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteCoefficient'"
	 * @generated
	 */
	List<String> getQuoteCoefficients();

	/**
	 * Returns the value of the '<em><b>Quote Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteItem'"
	 * @generated
	 */
	List<String> getQuoteItems();

	/**
	 * Returns the value of the '<em><b>Quote Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Notes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteNotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteNote'"
	 * @generated
	 */
	List<String> getQuoteNotes();

	/**
	 * Returns the value of the '<em><b>Quote Work Efforts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Work Efforts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Work Efforts</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuote_QuoteWorkEfforts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteWorkEffort'"
	 * @generated
	 */
	List<String> getQuoteWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAdjustment' route='quoteId'"
	 * @generated
	 */
	List<String> quoteAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityQuote' route='quoteId'"
	 * @generated
	 */
	List<String> salesOpportunityQuotes();

} // Quote
