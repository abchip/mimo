/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Rate Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getMinItemPrice <em>Min Item Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getMinPurchase <em>Min Purchase</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#isTaxPromotions <em>Tax Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#isTaxShipping <em>Tax Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityRateProductImpl extends BizEntityImpl implements TaxAuthorityRateProduct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthorityRateSeqId = TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT;
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
	 * The default value of the '{@link #isIsTaxInShippingPrice() <em>Is Tax In Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTaxInShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TAX_IN_SHIPPING_PRICE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsTaxInShippingPrice() <em>Is Tax In Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTaxInShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected boolean isTaxInShippingPrice = IS_TAX_IN_SHIPPING_PRICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinItemPrice() <em>Min Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItemPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_ITEM_PRICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMinItemPrice() <em>Min Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItemPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minItemPrice = MIN_ITEM_PRICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinPurchase() <em>Min Purchase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPurchase()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_PURCHASE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMinPurchase() <em>Min Purchase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPurchase()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minPurchase = MIN_PURCHASE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthPartyId = TAX_AUTH_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PERCENTAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxPercentage = TAX_PERCENTAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #isTaxPromotions() <em>Tax Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxPromotions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_PROMOTIONS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTaxPromotions() <em>Tax Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxPromotions()
	 * @generated
	 * @ordered
	 */
	protected boolean taxPromotions = TAX_PROMOTIONS_EDEFAULT;
	/**
	 * The default value of the '{@link #isTaxShipping() <em>Tax Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxShipping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_SHIPPING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTaxShipping() <em>Tax Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxShipping()
	 * @generated
	 * @ordered
	 */
	protected boolean taxShipping = TAX_SHIPPING_EDEFAULT;
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
	 * The default value of the '{@link #getTitleTransferEnumId() <em>Title Transfer Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleTransferEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_TRANSFER_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitleTransferEnumId() <em>Title Transfer Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleTransferEnumId()
	 * @generated
	 * @ordered
	 */
	protected String titleTransferEnumId = TITLE_TRANSFER_ENUM_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTaxAuthorityRateTypeId() <em>Tax Authority Rate Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected TaxAuthorityRateType taxAuthorityRateTypeId;
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
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityRateProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTaxInShippingPrice() {
		return isTaxInShippingPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTaxInShippingPrice(boolean newIsTaxInShippingPrice) {
		boolean oldIsTaxInShippingPrice = isTaxInShippingPrice;
		isTaxInShippingPrice = newIsTaxInShippingPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE, oldIsTaxInShippingPrice, isTaxInShippingPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinItemPrice() {
		return minItemPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItemPrice(BigDecimal newMinItemPrice) {
		BigDecimal oldMinItemPrice = minItemPrice;
		minItemPrice = newMinItemPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE, oldMinItemPrice, minItemPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinPurchase() {
		return minPurchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinPurchase(BigDecimal newMinPurchase) {
		BigDecimal oldMinPurchase = minPurchase;
		minPurchase = newMinPurchase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE, oldMinPurchase, minPurchase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		ProductCategory oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		String oldTaxAuthPartyId = taxAuthPartyId;
		taxAuthPartyId = newTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxPercentage() {
		return taxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		BigDecimal oldTaxPercentage = taxPercentage;
		taxPercentage = newTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxPromotions() {
		return taxPromotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPromotions(boolean newTaxPromotions) {
		boolean oldTaxPromotions = taxPromotions;
		taxPromotions = newTaxPromotions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS, oldTaxPromotions, taxPromotions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxShipping() {
		return taxShipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxShipping(boolean newTaxShipping) {
		boolean oldTaxShipping = taxShipping;
		taxShipping = newTaxShipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING, oldTaxShipping, taxShipping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleTransferEnumId() {
		return titleTransferEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleTransferEnumId(String newTitleTransferEnumId) {
		String oldTitleTransferEnumId = titleTransferEnumId;
		titleTransferEnumId = newTitleTransferEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID, oldTitleTransferEnumId, titleTransferEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItems() {
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
	public List<String> orderAdjustments() {
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
	public List<String> returnAdjustments() {
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
	public TaxAuthorityRateType getTaxAuthorityRateTypeId() {
		if (taxAuthorityRateTypeId != null && ((EObject)taxAuthorityRateTypeId).eIsProxy()) {
			InternalEObject oldTaxAuthorityRateTypeId = (InternalEObject)taxAuthorityRateTypeId;
			taxAuthorityRateTypeId = (TaxAuthorityRateType)eResolveProxy(oldTaxAuthorityRateTypeId);
			if (taxAuthorityRateTypeId != oldTaxAuthorityRateTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID, oldTaxAuthorityRateTypeId, taxAuthorityRateTypeId));
			}
		}
		return taxAuthorityRateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAuthorityRateType basicGetTaxAuthorityRateTypeId() {
		return taxAuthorityRateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateTypeId(TaxAuthorityRateType newTaxAuthorityRateTypeId) {
		TaxAuthorityRateType oldTaxAuthorityRateTypeId = taxAuthorityRateTypeId;
		taxAuthorityRateTypeId = newTaxAuthorityRateTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID, oldTaxAuthorityRateTypeId, taxAuthorityRateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthorityRateSeqId() {
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(String newTaxAuthorityRateSeqId) {
		String oldTaxAuthorityRateSeqId = taxAuthorityRateSeqId;
		taxAuthorityRateSeqId = newTaxAuthorityRateSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID:
				return getTaxAuthorityRateSeqId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION:
				return getDescription();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE:
				return getFromDate();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE:
				return isIsTaxInShippingPrice();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE:
				return getMinItemPrice();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE:
				return getMinPurchase();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE:
				return getTaxPercentage();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS:
				return isTaxPromotions();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING:
				return isTaxShipping();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE:
				return getThruDate();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID:
				return getTitleTransferEnumId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID:
				if (resolve) return getTaxAuthorityRateTypeId();
				return basicGetTaxAuthorityRateTypeId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
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
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE:
				setIsTaxInShippingPrice((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE:
				setMinItemPrice((BigDecimal)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE:
				setMinPurchase((BigDecimal)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS:
				setTaxPromotions((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING:
				setTaxShipping((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID:
				setTitleTransferEnumId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID:
				setTaxAuthorityRateTypeId((TaxAuthorityRateType)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
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
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId(TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE:
				setIsTaxInShippingPrice(IS_TAX_IN_SHIPPING_PRICE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE:
				setMinItemPrice(MIN_ITEM_PRICE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE:
				setMinPurchase(MIN_PURCHASE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS:
				setTaxPromotions(TAX_PROMOTIONS_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING:
				setTaxShipping(TAX_SHIPPING_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID:
				setTitleTransferEnumId(TITLE_TRANSFER_ENUM_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID:
				setTaxAuthorityRateTypeId((TaxAuthorityRateType)null);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
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
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID:
				return TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT == null ? taxAuthorityRateSeqId != null : !TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT.equals(taxAuthorityRateSeqId);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE:
				return isTaxInShippingPrice != IS_TAX_IN_SHIPPING_PRICE_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE:
				return MIN_ITEM_PRICE_EDEFAULT == null ? minItemPrice != null : !MIN_ITEM_PRICE_EDEFAULT.equals(minItemPrice);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE:
				return MIN_PURCHASE_EDEFAULT == null ? minPurchase != null : !MIN_PURCHASE_EDEFAULT.equals(minPurchase);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS:
				return taxPromotions != TAX_PROMOTIONS_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING:
				return taxShipping != TAX_SHIPPING_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID:
				return TITLE_TRANSFER_ENUM_ID_EDEFAULT == null ? titleTransferEnumId != null : !TITLE_TRANSFER_ENUM_ID_EDEFAULT.equals(titleTransferEnumId);
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID:
				return taxAuthorityRateTypeId != null;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID:
				return productStoreId != null;
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
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
		result.append(" (taxAuthorityRateSeqId: ");
		result.append(taxAuthorityRateSeqId);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", isTaxInShippingPrice: ");
		result.append(isTaxInShippingPrice);
		result.append(", minItemPrice: ");
		result.append(minItemPrice);
		result.append(", minPurchase: ");
		result.append(minPurchase);
		result.append(", taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(", taxPromotions: ");
		result.append(taxPromotions);
		result.append(", taxShipping: ");
		result.append(taxShipping);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", titleTransferEnumId: ");
		result.append(titleTransferEnumId);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityRateProductImpl
