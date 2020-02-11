/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.quote.QuoteAttribute;
import org.abchip.mimo.biz.order.quote.QuoteCoefficient;
import org.abchip.mimo.biz.order.quote.QuoteItem;
import org.abchip.mimo.biz.order.quote.QuoteNote;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.QuoteType;
import org.abchip.mimo.biz.order.quote.QuoteWorkEffort;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteAttributes <em>Quote Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteCoefficients <em>Quote Coefficients</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteItems <em>Quote Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteName <em>Quote Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteNotes <em>Quote Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteWorkEfforts <em>Quote Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getValidThruDate <em>Valid Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteImpl extends BizEntityTypedImpl<QuoteType> implements Quote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(QuotePackage.Literals.QUOTE__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(QuotePackage.Literals.QUOTE__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(QuotePackage.Literals.QUOTE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(QuotePackage.Literals.QUOTE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssueDate() {
		return (Date)eGet(QuotePackage.Literals.QUOTE__ISSUE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueDate(Date newIssueDate) {
		eSet(QuotePackage.Literals.QUOTE__ISSUE_DATE, newIssueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(QuotePackage.Literals.QUOTE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(QuotePackage.Literals.QUOTE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(QuotePackage.Literals.QUOTE__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(QuotePackage.Literals.QUOTE__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteAttribute> getQuoteAttributes() {
		return (List<QuoteAttribute>)eGet(QuotePackage.Literals.QUOTE__QUOTE_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteCoefficient> getQuoteCoefficients() {
		return (List<QuoteCoefficient>)eGet(QuotePackage.Literals.QUOTE__QUOTE_COEFFICIENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteItem> getQuoteItems() {
		return (List<QuoteItem>)eGet(QuotePackage.Literals.QUOTE__QUOTE_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteId() {
		return (String)eGet(QuotePackage.Literals.QUOTE__QUOTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(String newQuoteId) {
		eSet(QuotePackage.Literals.QUOTE__QUOTE_ID, newQuoteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteName() {
		return (String)eGet(QuotePackage.Literals.QUOTE__QUOTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteName(String newQuoteName) {
		eSet(QuotePackage.Literals.QUOTE__QUOTE_NAME, newQuoteName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteNote> getQuoteNotes() {
		return (List<QuoteNote>)eGet(QuotePackage.Literals.QUOTE__QUOTE_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType getQuoteTypeId() {
		return (QuoteType)eGet(QuotePackage.Literals.QUOTE__QUOTE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteTypeId(QuoteType newQuoteTypeId) {
		eSet(QuotePackage.Literals.QUOTE__QUOTE_TYPE_ID, newQuoteTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteWorkEffort> getQuoteWorkEfforts() {
		return (List<QuoteWorkEffort>)eGet(QuotePackage.Literals.QUOTE__QUOTE_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		return (Enumeration)eGet(QuotePackage.Literals.QUOTE__SALES_CHANNEL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		eSet(QuotePackage.Literals.QUOTE__SALES_CHANNEL_ENUM_ID, newSalesChannelEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(QuotePackage.Literals.QUOTE__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(QuotePackage.Literals.QUOTE__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidFromDate() {
		return (Date)eGet(QuotePackage.Literals.QUOTE__VALID_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromDate(Date newValidFromDate) {
		eSet(QuotePackage.Literals.QUOTE__VALID_FROM_DATE, newValidFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidThruDate() {
		return (Date)eGet(QuotePackage.Literals.QUOTE__VALID_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidThruDate(Date newValidThruDate) {
		eSet(QuotePackage.Literals.QUOTE__VALID_THRU_DATE, newValidThruDate);
	}

} //QuoteImpl
