/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.price.ProductPriceType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getCustomPriceCalcService <em>Custom Price Calc Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getPriceWithTax <em>Price With Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getPriceWithoutTax <em>Price Without Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#isTaxInPrice <em>Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getTermUomId <em>Term Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceImpl extends BizEntityTypedImpl<ProductPriceType> implements ProductPrice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPriceTypeId() <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceTypeId() <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceTypeId = PRODUCT_PRICE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPricePurposeId() <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPricePurposeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_PURPOSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPricePurposeId() <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPricePurposeId()
	 * @generated
	 * @ordered
	 */
	protected String productPricePurposeId = PRODUCT_PRICE_PURPOSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStoreGroupId() <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreGroupId() <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreGroupId = PRODUCT_STORE_GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomPriceCalcService() <em>Custom Price Calc Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomPriceCalcService()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_PRICE_CALC_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomPriceCalcService() <em>Custom Price Calc Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomPriceCalcService()
	 * @generated
	 * @ordered
	 */
	protected String customPriceCalcService = CUSTOM_PRICE_CALC_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceWithTax() <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_WITH_TAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceWithTax() <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal priceWithTax = PRICE_WITH_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceWithoutTax() <em>Price Without Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithoutTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_WITHOUT_TAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceWithoutTax() <em>Price Without Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithoutTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal priceWithoutTax = PRICE_WITHOUT_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxAmount = TAX_AMOUNT_EDEFAULT;

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
	 * The default value of the '{@link #isTaxInPrice() <em>Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxInPrice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_IN_PRICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaxInPrice() <em>Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxInPrice()
	 * @generated
	 * @ordered
	 */
	protected boolean taxInPrice = TAX_IN_PRICE_EDEFAULT;

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
	 * The default value of the '{@link #getTermUomId() <em>Term Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermUomId() <em>Term Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermUomId()
	 * @generated
	 * @ordered
	 */
	protected String termUomId = TERM_UOM_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomPriceCalcService() {
		return customPriceCalcService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomPriceCalcService(String newCustomPriceCalcService) {
		String oldCustomPriceCalcService = customPriceCalcService;
		customPriceCalcService = newCustomPriceCalcService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE, oldCustomPriceCalcService, customPriceCalcService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(BigDecimal newPrice) {
		BigDecimal oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceWithTax() {
		return priceWithTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceWithTax(BigDecimal newPriceWithTax) {
		BigDecimal oldPriceWithTax = priceWithTax;
		priceWithTax = newPriceWithTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRICE_WITH_TAX, oldPriceWithTax, priceWithTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceWithoutTax() {
		return priceWithoutTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceWithoutTax(BigDecimal newPriceWithoutTax) {
		BigDecimal oldPriceWithoutTax = priceWithoutTax;
		priceWithoutTax = newPriceWithoutTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRICE_WITHOUT_TAX, oldPriceWithoutTax, priceWithoutTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupId() {
		return productStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupId(String newProductStoreGroupId) {
		String oldProductStoreGroupId = productStoreGroupId;
		productStoreGroupId = newProductStoreGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID, oldProductStoreGroupId, productStoreGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAmount(BigDecimal newTaxAmount) {
		BigDecimal oldTaxAmount = taxAmount;
		taxAmount = newTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TAX_AMOUNT, oldTaxAmount, taxAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxInPrice() {
		return taxInPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxInPrice(boolean newTaxInPrice) {
		boolean oldTaxInPrice = taxInPrice;
		taxInPrice = newTaxInPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TAX_IN_PRICE, oldTaxInPrice, taxInPrice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermUomId() {
		return termUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermUomId(String newTermUomId) {
		String oldTermUomId = termUomId;
		termUomId = newTermUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__TERM_UOM_ID, oldTermUomId, termUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceTypeId() {
		return productPriceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceTypeId(String newProductPriceTypeId) {
		String oldProductPriceTypeId = productPriceTypeId;
		productPriceTypeId = newProductPriceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID, oldProductPriceTypeId, productPriceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPricePurposeId() {
		return productPricePurposeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurposeId(String newProductPricePurposeId) {
		String oldProductPricePurposeId = productPricePurposeId;
		productPricePurposeId = newProductPricePurposeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID, oldProductPricePurposeId, productPricePurposeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE__PRODUCT_ID:
				return getProductId();
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID:
				return getProductPriceTypeId();
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID:
				return getProductPricePurposeId();
			case PricePackage.PRODUCT_PRICE__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case PricePackage.PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID:
				return getProductStoreGroupId();
			case PricePackage.PRODUCT_PRICE__FROM_DATE:
				return getFromDate();
			case PricePackage.PRODUCT_PRICE__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case PricePackage.PRODUCT_PRICE__CREATED_DATE:
				return getCreatedDate();
			case PricePackage.PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE:
				return getCustomPriceCalcService();
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PricePackage.PRODUCT_PRICE__PRICE:
				return getPrice();
			case PricePackage.PRODUCT_PRICE__PRICE_WITH_TAX:
				return getPriceWithTax();
			case PricePackage.PRODUCT_PRICE__PRICE_WITHOUT_TAX:
				return getPriceWithoutTax();
			case PricePackage.PRODUCT_PRICE__TAX_AMOUNT:
				return getTaxAmount();
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case PricePackage.PRODUCT_PRICE__TAX_IN_PRICE:
				return isTaxInPrice();
			case PricePackage.PRODUCT_PRICE__TAX_PERCENTAGE:
				return getTaxPercentage();
			case PricePackage.PRODUCT_PRICE__TERM_UOM_ID:
				return getTermUomId();
			case PricePackage.PRODUCT_PRICE__THRU_DATE:
				return getThruDate();
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
			case PricePackage.PRODUCT_PRICE__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE:
				setCustomPriceCalcService((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE:
				setPrice((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE_WITH_TAX:
				setPriceWithTax((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE_WITHOUT_TAX:
				setPriceWithoutTax((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AMOUNT:
				setTaxAmount((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_IN_PRICE:
				setTaxInPrice((Boolean)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__TERM_UOM_ID:
				setTermUomId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE__THRU_DATE:
				setThruDate((Date)newValue);
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
			case PricePackage.PRODUCT_PRICE__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId(PRODUCT_PRICE_TYPE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId(PRODUCT_PRICE_PURPOSE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId(PRODUCT_STORE_GROUP_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE:
				setCustomPriceCalcService(CUSTOM_PRICE_CALC_SERVICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE_WITH_TAX:
				setPriceWithTax(PRICE_WITH_TAX_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__PRICE_WITHOUT_TAX:
				setPriceWithoutTax(PRICE_WITHOUT_TAX_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_IN_PRICE:
				setTaxInPrice(TAX_IN_PRICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__TERM_UOM_ID:
				setTermUomId(TERM_UOM_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case PricePackage.PRODUCT_PRICE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID:
				return PRODUCT_PRICE_TYPE_ID_EDEFAULT == null ? productPriceTypeId != null : !PRODUCT_PRICE_TYPE_ID_EDEFAULT.equals(productPriceTypeId);
			case PricePackage.PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID:
				return PRODUCT_PRICE_PURPOSE_ID_EDEFAULT == null ? productPricePurposeId != null : !PRODUCT_PRICE_PURPOSE_ID_EDEFAULT.equals(productPricePurposeId);
			case PricePackage.PRODUCT_PRICE__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case PricePackage.PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID:
				return PRODUCT_STORE_GROUP_ID_EDEFAULT == null ? productStoreGroupId != null : !PRODUCT_STORE_GROUP_ID_EDEFAULT.equals(productStoreGroupId);
			case PricePackage.PRODUCT_PRICE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PricePackage.PRODUCT_PRICE__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case PricePackage.PRODUCT_PRICE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PricePackage.PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE:
				return CUSTOM_PRICE_CALC_SERVICE_EDEFAULT == null ? customPriceCalcService != null : !CUSTOM_PRICE_CALC_SERVICE_EDEFAULT.equals(customPriceCalcService);
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case PricePackage.PRODUCT_PRICE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PricePackage.PRODUCT_PRICE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case PricePackage.PRODUCT_PRICE__PRICE_WITH_TAX:
				return PRICE_WITH_TAX_EDEFAULT == null ? priceWithTax != null : !PRICE_WITH_TAX_EDEFAULT.equals(priceWithTax);
			case PricePackage.PRODUCT_PRICE__PRICE_WITHOUT_TAX:
				return PRICE_WITHOUT_TAX_EDEFAULT == null ? priceWithoutTax != null : !PRICE_WITHOUT_TAX_EDEFAULT.equals(priceWithoutTax);
			case PricePackage.PRODUCT_PRICE__TAX_AMOUNT:
				return TAX_AMOUNT_EDEFAULT == null ? taxAmount != null : !TAX_AMOUNT_EDEFAULT.equals(taxAmount);
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case PricePackage.PRODUCT_PRICE__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case PricePackage.PRODUCT_PRICE__TAX_IN_PRICE:
				return taxInPrice != TAX_IN_PRICE_EDEFAULT;
			case PricePackage.PRODUCT_PRICE__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
			case PricePackage.PRODUCT_PRICE__TERM_UOM_ID:
				return TERM_UOM_ID_EDEFAULT == null ? termUomId != null : !TERM_UOM_ID_EDEFAULT.equals(termUomId);
			case PricePackage.PRODUCT_PRICE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", productPriceTypeId: ");
		result.append(productPriceTypeId);
		result.append(", productPricePurposeId: ");
		result.append(productPricePurposeId);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", productStoreGroupId: ");
		result.append(productStoreGroupId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", customPriceCalcService: ");
		result.append(customPriceCalcService);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", price: ");
		result.append(price);
		result.append(", priceWithTax: ");
		result.append(priceWithTax);
		result.append(", priceWithoutTax: ");
		result.append(priceWithoutTax);
		result.append(", taxAmount: ");
		result.append(taxAmount);
		result.append(", taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", taxInPrice: ");
		result.append(taxInPrice);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(", termUomId: ");
		result.append(termUomId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductPriceImpl
