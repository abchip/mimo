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

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductFeaturePrice;
import org.abchip.mimo.biz.product.price.ProductPriceType;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeaturePriceImpl extends BizEntityImpl implements ProductFeaturePrice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getProductPriceTypeId() <em>Product Price Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductPriceType productPriceTypeId;

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
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeaturePriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_FEATURE_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		createdByUserLogin = newCreatedByUserLogin;
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
		createdDate = newCreatedDate;
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
		currencyUomId = newCurrencyUomId;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
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
		lastModifiedDate = newLastModifiedDate;
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
		price = newPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		productFeatureId = newProductFeatureId;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceType getProductPriceTypeId() {
		if (productPriceTypeId != null && ((EObject)productPriceTypeId).eIsProxy()) {
			InternalEObject oldProductPriceTypeId = (InternalEObject)productPriceTypeId;
			productPriceTypeId = (ProductPriceType)eResolveProxy(oldProductPriceTypeId);
			if (productPriceTypeId != oldProductPriceTypeId) {
			}
		}
		return productPriceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPriceType basicGetProductPriceTypeId() {
		return productPriceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceTypeId(ProductPriceType newProductPriceTypeId) {
		productPriceTypeId = newProductPriceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case PricePackage.PRODUCT_FEATURE_PRICE__FROM_DATE:
				return getFromDate();
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_DATE:
				return getCreatedDate();
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PricePackage.PRODUCT_FEATURE_PRICE__PRICE:
				return getPrice();
			case PricePackage.PRODUCT_FEATURE_PRICE__THRU_DATE:
				return getThruDate();
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID:
				if (resolve) return getProductPriceTypeId();
				return basicGetProductPriceTypeId();
			case PricePackage.PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
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
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__PRICE:
				setPrice((BigDecimal)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId((ProductPriceType)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
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
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId((ProductPriceType)null);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
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
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case PricePackage.PRODUCT_FEATURE_PRICE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PricePackage.PRODUCT_FEATURE_PRICE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case PricePackage.PRODUCT_FEATURE_PRICE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PricePackage.PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID:
				return productPriceTypeId != null;
			case PricePackage.PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case PricePackage.PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case PricePackage.PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
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
		result.append(" (productFeatureId: ");
		result.append(productFeatureId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", price: ");
		result.append(price);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductFeaturePriceImpl
