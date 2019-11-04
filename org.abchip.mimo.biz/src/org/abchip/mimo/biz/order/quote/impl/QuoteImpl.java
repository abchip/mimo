/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.QuoteType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteName <em>Quote Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getValidThruDate <em>Valid Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteAttributes <em>Quote Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteCoefficients <em>Quote Coefficients</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteItems <em>Quote Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteNotes <em>Quote Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl#getQuoteWorkEfforts <em>Quote Work Efforts</em>}</li>
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
	 * The default value of the '{@link #getQuoteId() <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteId() <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected String quoteId = QUOTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected Date issueDate = ISSUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteName() <em>Quote Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteName() <em>Quote Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteName()
	 * @generated
	 * @ordered
	 */
	protected String quoteName = QUOTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date validFromDate = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidThruDate() <em>Valid Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidThruDate() <em>Valid Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date validThruDate = VALID_THRU_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getSalesChannelEnumId() <em>Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesChannelEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration salesChannelEnumId;

	/**
	 * The cached value of the '{@link #getQuoteAttributes() <em>Quote Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteAttributes;

	/**
	 * The cached value of the '{@link #getQuoteCoefficients() <em>Quote Coefficients</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteCoefficients()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteCoefficients;

	/**
	 * The cached value of the '{@link #getQuoteItems() <em>Quote Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteItems;

	/**
	 * The cached value of the '{@link #getQuoteNotes() <em>Quote Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteNotes;

	/**
	 * The cached value of the '{@link #getQuoteWorkEfforts() <em>Quote Work Efforts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteWorkEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteWorkEfforts;

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
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueDate(Date newIssueDate) {
		Date oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__ISSUE_DATE, oldIssueDate, issueDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteId() {
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(String newQuoteId) {
		String oldQuoteId = quoteId;
		quoteId = newQuoteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__QUOTE_ID, oldQuoteId, quoteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteName() {
		return quoteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteName(String newQuoteName) {
		String oldQuoteName = quoteName;
		quoteName = newQuoteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__QUOTE_NAME, oldQuoteName, quoteName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__QUOTE_TYPE_ID, oldQuoteTypeId, quoteTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__QUOTE_TYPE_ID, oldQuoteTypeId, quoteTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		if (salesChannelEnumId != null && ((EObject)salesChannelEnumId).eIsProxy()) {
			InternalEObject oldSalesChannelEnumId = (InternalEObject)salesChannelEnumId;
			salesChannelEnumId = (Enumeration)eResolveProxy(oldSalesChannelEnumId);
			if (salesChannelEnumId != oldSalesChannelEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID, oldSalesChannelEnumId, salesChannelEnumId));
			}
		}
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetSalesChannelEnumId() {
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		Enumeration oldSalesChannelEnumId = salesChannelEnumId;
		salesChannelEnumId = newSalesChannelEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID, oldSalesChannelEnumId, salesChannelEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromDate(Date newValidFromDate) {
		Date oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidThruDate() {
		return validThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidThruDate(Date newValidThruDate) {
		Date oldValidThruDate = validThruDate;
		validThruDate = newValidThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE__VALID_THRU_DATE, oldValidThruDate, validThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteAttributes() {
		if (quoteAttributes == null) {
			quoteAttributes = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE__QUOTE_ATTRIBUTES);
		}
		return quoteAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteCoefficients() {
		if (quoteCoefficients == null) {
			quoteCoefficients = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE__QUOTE_COEFFICIENTS);
		}
		return quoteCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteItems() {
		if (quoteItems == null) {
			quoteItems = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE__QUOTE_ITEMS);
		}
		return quoteItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteNotes() {
		if (quoteNotes == null) {
			quoteNotes = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE__QUOTE_NOTES);
		}
		return quoteNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteWorkEfforts() {
		if (quoteWorkEfforts == null) {
			quoteWorkEfforts = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE__QUOTE_WORK_EFFORTS);
		}
		return quoteWorkEfforts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteAdjustments() {
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
	public List<String> salesOpportunityQuotes() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuotePackage.QUOTE__QUOTE_ID:
				return getQuoteId();
			case QuotePackage.QUOTE__DESCRIPTION:
				return getDescription();
			case QuotePackage.QUOTE__ISSUE_DATE:
				return getIssueDate();
			case QuotePackage.QUOTE__QUOTE_NAME:
				return getQuoteName();
			case QuotePackage.QUOTE__VALID_FROM_DATE:
				return getValidFromDate();
			case QuotePackage.QUOTE__VALID_THRU_DATE:
				return getValidThruDate();
			case QuotePackage.QUOTE__QUOTE_TYPE_ID:
				if (resolve) return getQuoteTypeId();
				return basicGetQuoteTypeId();
			case QuotePackage.QUOTE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case QuotePackage.QUOTE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case QuotePackage.QUOTE__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case QuotePackage.QUOTE__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID:
				if (resolve) return getSalesChannelEnumId();
				return basicGetSalesChannelEnumId();
			case QuotePackage.QUOTE__QUOTE_ATTRIBUTES:
				return getQuoteAttributes();
			case QuotePackage.QUOTE__QUOTE_COEFFICIENTS:
				return getQuoteCoefficients();
			case QuotePackage.QUOTE__QUOTE_ITEMS:
				return getQuoteItems();
			case QuotePackage.QUOTE__QUOTE_NOTES:
				return getQuoteNotes();
			case QuotePackage.QUOTE__QUOTE_WORK_EFFORTS:
				return getQuoteWorkEfforts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuotePackage.QUOTE__QUOTE_ID:
				setQuoteId((String)newValue);
				return;
			case QuotePackage.QUOTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QuotePackage.QUOTE__ISSUE_DATE:
				setIssueDate((Date)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_NAME:
				setQuoteName((String)newValue);
				return;
			case QuotePackage.QUOTE__VALID_FROM_DATE:
				setValidFromDate((Date)newValue);
				return;
			case QuotePackage.QUOTE__VALID_THRU_DATE:
				setValidThruDate((Date)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_TYPE_ID:
				setQuoteTypeId((QuoteType)newValue);
				return;
			case QuotePackage.QUOTE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case QuotePackage.QUOTE__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case QuotePackage.QUOTE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case QuotePackage.QUOTE__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID:
				setSalesChannelEnumId((Enumeration)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_ATTRIBUTES:
				getQuoteAttributes().clear();
				getQuoteAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_COEFFICIENTS:
				getQuoteCoefficients().clear();
				getQuoteCoefficients().addAll((Collection<? extends String>)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_ITEMS:
				getQuoteItems().clear();
				getQuoteItems().addAll((Collection<? extends String>)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_NOTES:
				getQuoteNotes().clear();
				getQuoteNotes().addAll((Collection<? extends String>)newValue);
				return;
			case QuotePackage.QUOTE__QUOTE_WORK_EFFORTS:
				getQuoteWorkEfforts().clear();
				getQuoteWorkEfforts().addAll((Collection<? extends String>)newValue);
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
			case QuotePackage.QUOTE__QUOTE_ID:
				setQuoteId(QUOTE_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QuotePackage.QUOTE__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
				return;
			case QuotePackage.QUOTE__QUOTE_NAME:
				setQuoteName(QUOTE_NAME_EDEFAULT);
				return;
			case QuotePackage.QUOTE__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case QuotePackage.QUOTE__VALID_THRU_DATE:
				setValidThruDate(VALID_THRU_DATE_EDEFAULT);
				return;
			case QuotePackage.QUOTE__QUOTE_TYPE_ID:
				setQuoteTypeId((QuoteType)null);
				return;
			case QuotePackage.QUOTE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case QuotePackage.QUOTE__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case QuotePackage.QUOTE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case QuotePackage.QUOTE__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID:
				setSalesChannelEnumId((Enumeration)null);
				return;
			case QuotePackage.QUOTE__QUOTE_ATTRIBUTES:
				getQuoteAttributes().clear();
				return;
			case QuotePackage.QUOTE__QUOTE_COEFFICIENTS:
				getQuoteCoefficients().clear();
				return;
			case QuotePackage.QUOTE__QUOTE_ITEMS:
				getQuoteItems().clear();
				return;
			case QuotePackage.QUOTE__QUOTE_NOTES:
				getQuoteNotes().clear();
				return;
			case QuotePackage.QUOTE__QUOTE_WORK_EFFORTS:
				getQuoteWorkEfforts().clear();
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
			case QuotePackage.QUOTE__QUOTE_ID:
				return QUOTE_ID_EDEFAULT == null ? quoteId != null : !QUOTE_ID_EDEFAULT.equals(quoteId);
			case QuotePackage.QUOTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QuotePackage.QUOTE__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
			case QuotePackage.QUOTE__QUOTE_NAME:
				return QUOTE_NAME_EDEFAULT == null ? quoteName != null : !QUOTE_NAME_EDEFAULT.equals(quoteName);
			case QuotePackage.QUOTE__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case QuotePackage.QUOTE__VALID_THRU_DATE:
				return VALID_THRU_DATE_EDEFAULT == null ? validThruDate != null : !VALID_THRU_DATE_EDEFAULT.equals(validThruDate);
			case QuotePackage.QUOTE__QUOTE_TYPE_ID:
				return quoteTypeId != null;
			case QuotePackage.QUOTE__PARTY_ID:
				return partyId != null;
			case QuotePackage.QUOTE__STATUS_ID:
				return statusId != null;
			case QuotePackage.QUOTE__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case QuotePackage.QUOTE__PRODUCT_STORE_ID:
				return productStoreId != null;
			case QuotePackage.QUOTE__SALES_CHANNEL_ENUM_ID:
				return salesChannelEnumId != null;
			case QuotePackage.QUOTE__QUOTE_ATTRIBUTES:
				return quoteAttributes != null && !quoteAttributes.isEmpty();
			case QuotePackage.QUOTE__QUOTE_COEFFICIENTS:
				return quoteCoefficients != null && !quoteCoefficients.isEmpty();
			case QuotePackage.QUOTE__QUOTE_ITEMS:
				return quoteItems != null && !quoteItems.isEmpty();
			case QuotePackage.QUOTE__QUOTE_NOTES:
				return quoteNotes != null && !quoteNotes.isEmpty();
			case QuotePackage.QUOTE__QUOTE_WORK_EFFORTS:
				return quoteWorkEfforts != null && !quoteWorkEfforts.isEmpty();
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
		result.append(" (quoteId: ");
		result.append(quoteId);
		result.append(", description: ");
		result.append(description);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(", quoteName: ");
		result.append(quoteName);
		result.append(", validFromDate: ");
		result.append(validFromDate);
		result.append(", validThruDate: ");
		result.append(validThruDate);
		result.append(", quoteAttributes: ");
		result.append(quoteAttributes);
		result.append(", quoteCoefficients: ");
		result.append(quoteCoefficients);
		result.append(", quoteItems: ");
		result.append(quoteItems);
		result.append(", quoteNotes: ");
		result.append(quoteNotes);
		result.append(", quoteWorkEfforts: ");
		result.append(quoteWorkEfforts);
		result.append(')');
		return result.toString();
	}

} //QuoteImpl
