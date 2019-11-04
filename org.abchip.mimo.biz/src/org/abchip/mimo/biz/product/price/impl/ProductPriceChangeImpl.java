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

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceChange;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getProductPriceChangeId <em>Product Price Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getOldPrice <em>Old Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl#getChangedByUserLogin <em>Changed By User Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceChangeImpl extends BizEntityImpl implements ProductPriceChange {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPriceChangeId() <em>Product Price Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceChangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_CHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceChangeId() <em>Product Price Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceChangeId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceChangeId = PRODUCT_PRICE_CHANGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedDate() <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedDate() <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedDate()
	 * @generated
	 * @ordered
	 */
	protected Date changedDate = CHANGED_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getOldPrice() <em>Old Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OLD_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldPrice() <em>Old Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oldPrice = OLD_PRICE_EDEFAULT;

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
	 * The cached value of the '{@link #getChangedByUserLogin() <em>Changed By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changedByUserLogin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangedByUserLogin() {
		if (changedByUserLogin != null && ((EObject)changedByUserLogin).eIsProxy()) {
			InternalEObject oldChangedByUserLogin = (InternalEObject)changedByUserLogin;
			changedByUserLogin = (UserLogin)eResolveProxy(oldChangedByUserLogin);
			if (changedByUserLogin != oldChangedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN, oldChangedByUserLogin, changedByUserLogin));
			}
		}
		return changedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangedByUserLogin() {
		return changedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedByUserLogin(UserLogin newChangedByUserLogin) {
		UserLogin oldChangedByUserLogin = changedByUserLogin;
		changedByUserLogin = newChangedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN, oldChangedByUserLogin, changedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangedDate() {
		return changedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedDate(Date newChangedDate) {
		Date oldChangedDate = changedDate;
		changedDate = newChangedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_DATE, oldChangedDate, changedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldPrice() {
		return oldPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPrice(BigDecimal newOldPrice) {
		BigDecimal oldOldPrice = oldPrice;
		oldPrice = newOldPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__OLD_PRICE, oldOldPrice, oldPrice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceChangeId() {
		return productPriceChangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceChangeId(String newProductPriceChangeId) {
		String oldProductPriceChangeId = productPriceChangeId;
		productPriceChangeId = newProductPriceChangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID, oldProductPriceChangeId, productPriceChangeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID, oldProductPricePurposeId, productPricePurposeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID, oldProductPriceTypeId, productPriceTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID, oldProductStoreGroupId, productStoreGroupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_CHANGE__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID:
				return getProductPriceChangeId();
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_DATE:
				return getChangedDate();
			case PricePackage.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case PricePackage.PRODUCT_PRICE_CHANGE__FROM_DATE:
				return getFromDate();
			case PricePackage.PRODUCT_PRICE_CHANGE__OLD_PRICE:
				return getOldPrice();
			case PricePackage.PRODUCT_PRICE_CHANGE__PRICE:
				return getPrice();
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_ID:
				return getProductId();
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID:
				return getProductPricePurposeId();
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID:
				return getProductPriceTypeId();
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID:
				return getProductStoreGroupId();
			case PricePackage.PRODUCT_PRICE_CHANGE__THRU_DATE:
				return getThruDate();
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN:
				if (resolve) return getChangedByUserLogin();
				return basicGetChangedByUserLogin();
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
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID:
				setProductPriceChangeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_DATE:
				setChangedDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__OLD_PRICE:
				setOldPrice((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRICE:
				setPrice((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN:
				setChangedByUserLogin((UserLogin)newValue);
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
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID:
				setProductPriceChangeId(PRODUCT_PRICE_CHANGE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_DATE:
				setChangedDate(CHANGED_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__OLD_PRICE:
				setOldPrice(OLD_PRICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId(PRODUCT_PRICE_PURPOSE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId(PRODUCT_PRICE_TYPE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId(PRODUCT_STORE_GROUP_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN:
				setChangedByUserLogin((UserLogin)null);
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
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID:
				return PRODUCT_PRICE_CHANGE_ID_EDEFAULT == null ? productPriceChangeId != null : !PRODUCT_PRICE_CHANGE_ID_EDEFAULT.equals(productPriceChangeId);
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_DATE:
				return CHANGED_DATE_EDEFAULT == null ? changedDate != null : !CHANGED_DATE_EDEFAULT.equals(changedDate);
			case PricePackage.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case PricePackage.PRODUCT_PRICE_CHANGE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PricePackage.PRODUCT_PRICE_CHANGE__OLD_PRICE:
				return OLD_PRICE_EDEFAULT == null ? oldPrice != null : !OLD_PRICE_EDEFAULT.equals(oldPrice);
			case PricePackage.PRODUCT_PRICE_CHANGE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID:
				return PRODUCT_PRICE_PURPOSE_ID_EDEFAULT == null ? productPricePurposeId != null : !PRODUCT_PRICE_PURPOSE_ID_EDEFAULT.equals(productPricePurposeId);
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID:
				return PRODUCT_PRICE_TYPE_ID_EDEFAULT == null ? productPriceTypeId != null : !PRODUCT_PRICE_TYPE_ID_EDEFAULT.equals(productPriceTypeId);
			case PricePackage.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID:
				return PRODUCT_STORE_GROUP_ID_EDEFAULT == null ? productStoreGroupId != null : !PRODUCT_STORE_GROUP_ID_EDEFAULT.equals(productStoreGroupId);
			case PricePackage.PRODUCT_PRICE_CHANGE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PricePackage.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN:
				return changedByUserLogin != null;
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
		result.append(" (productPriceChangeId: ");
		result.append(productPriceChangeId);
		result.append(", changedDate: ");
		result.append(changedDate);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", oldPrice: ");
		result.append(oldPrice);
		result.append(", price: ");
		result.append(price);
		result.append(", productId: ");
		result.append(productId);
		result.append(", productPricePurposeId: ");
		result.append(productPricePurposeId);
		result.append(", productPriceTypeId: ");
		result.append(productPriceTypeId);
		result.append(", productStoreGroupId: ");
		result.append(productStoreGroupId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductPriceChangeImpl
