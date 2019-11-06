/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.ProductPromoCode;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#isRequireEmailOrParty <em>Require Email Or Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getUseLimitPerCode <em>Use Limit Per Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#isUserEntered <em>User Entered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getProductPromoCodeEmails <em>Product Promo Code Emails</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodeImpl#getProductPromoCodeParties <em>Product Promo Code Parties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoCodeImpl extends BizEntityImpl implements ProductPromoCode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoCodeId = PRODUCT_PROMO_CODE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isRequireEmailOrParty() <em>Require Email Or Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireEmailOrParty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_EMAIL_OR_PARTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireEmailOrParty() <em>Require Email Or Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireEmailOrParty()
	 * @generated
	 * @ordered
	 */
	protected boolean requireEmailOrParty = REQUIRE_EMAIL_OR_PARTY_EDEFAULT;

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
	 * The default value of the '{@link #getUseLimitPerCode() <em>Use Limit Per Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerCode()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_LIMIT_PER_CODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseLimitPerCode() <em>Use Limit Per Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerCode()
	 * @generated
	 * @ordered
	 */
	protected long useLimitPerCode = USE_LIMIT_PER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLimitPerCustomer() <em>Use Limit Per Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_LIMIT_PER_CUSTOMER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseLimitPerCustomer() <em>Use Limit Per Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerCustomer()
	 * @generated
	 * @ordered
	 */
	protected long useLimitPerCustomer = USE_LIMIT_PER_CUSTOMER_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserEntered() <em>User Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserEntered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_ENTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserEntered() <em>User Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserEntered()
	 * @generated
	 * @ordered
	 */
	protected boolean userEntered = USER_ENTERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

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
	 * The cached value of the '{@link #getProductPromoCodeEmails() <em>Product Promo Code Emails</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeEmails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPromoCodeEmails;

	/**
	 * The cached value of the '{@link #getProductPromoCodeParties() <em>Product Promo Code Parties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeParties()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPromoCodeParties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_CODE;
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
	public long getUseLimitPerCode() {
		return useLimitPerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerCode(long newUseLimitPerCode) {
		useLimitPerCode = newUseLimitPerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerCustomer() {
		return useLimitPerCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerCustomer(long newUseLimitPerCustomer) {
		useLimitPerCustomer = newUseLimitPerCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUserEntered() {
		return userEntered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserEntered(boolean newUserEntered) {
		userEntered = newUserEntered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductPromoCodeEmails() {
		if (productPromoCodeEmails == null) {
			productPromoCodeEmails = new BasicInternalEList<String>(String.class);
		}
		return productPromoCodeEmails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductPromoCodeParties() {
		if (productPromoCodeParties == null) {
			productPromoCodeParties = new BasicInternalEList<String>(String.class);
		}
		return productPromoCodeParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderProductPromoCodes() {
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
	public List<String> productPromoUses() {
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
	public List<String> shoppingLists() {
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
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		productPromoId = newProductPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireEmailOrParty() {
		return requireEmailOrParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireEmailOrParty(boolean newRequireEmailOrParty) {
		requireEmailOrParty = newRequireEmailOrParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoCodeId() {
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCodeId(String newProductPromoCodeId) {
		productPromoCodeId = newProductPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID:
				return getProductPromoCodeId();
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_DATE:
				return getCreatedDate();
			case PromoPackage.PRODUCT_PROMO_CODE__FROM_DATE:
				return getFromDate();
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PromoPackage.PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY:
				return isRequireEmailOrParty();
			case PromoPackage.PRODUCT_PROMO_CODE__THRU_DATE:
				return getThruDate();
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE:
				return getUseLimitPerCode();
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER:
				return getUseLimitPerCustomer();
			case PromoPackage.PRODUCT_PROMO_CODE__USER_ENTERED:
				return isUserEntered();
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS:
				return getProductPromoCodeEmails();
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES:
				return getProductPromoCodeParties();
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
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY:
				setRequireEmailOrParty((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE:
				setUseLimitPerCode((Long)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER:
				setUseLimitPerCustomer((Long)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USER_ENTERED:
				setUserEntered((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS:
				getProductPromoCodeEmails().clear();
				getProductPromoCodeEmails().addAll((Collection<? extends String>)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES:
				getProductPromoCodeParties().clear();
				getProductPromoCodeParties().addAll((Collection<? extends String>)newValue);
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
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId(PRODUCT_PROMO_CODE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY:
				setRequireEmailOrParty(REQUIRE_EMAIL_OR_PARTY_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE:
				setUseLimitPerCode(USE_LIMIT_PER_CODE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER:
				setUseLimitPerCustomer(USE_LIMIT_PER_CUSTOMER_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__USER_ENTERED:
				setUserEntered(USER_ENTERED_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS:
				getProductPromoCodeEmails().clear();
				return;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES:
				getProductPromoCodeParties().clear();
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
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID:
				return PRODUCT_PROMO_CODE_ID_EDEFAULT == null ? productPromoCodeId != null : !PRODUCT_PROMO_CODE_ID_EDEFAULT.equals(productPromoCodeId);
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PromoPackage.PRODUCT_PROMO_CODE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PromoPackage.PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY:
				return requireEmailOrParty != REQUIRE_EMAIL_OR_PARTY_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_CODE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE:
				return useLimitPerCode != USE_LIMIT_PER_CODE_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER:
				return useLimitPerCustomer != USE_LIMIT_PER_CUSTOMER_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_CODE__USER_ENTERED:
				return userEntered != USER_ENTERED_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_ID:
				return productPromoId != null;
			case PromoPackage.PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case PromoPackage.PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS:
				return productPromoCodeEmails != null && !productPromoCodeEmails.isEmpty();
			case PromoPackage.PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES:
				return productPromoCodeParties != null && !productPromoCodeParties.isEmpty();
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
		result.append(" (productPromoCodeId: ");
		result.append(productPromoCodeId);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", requireEmailOrParty: ");
		result.append(requireEmailOrParty);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useLimitPerCode: ");
		result.append(useLimitPerCode);
		result.append(", useLimitPerCustomer: ");
		result.append(useLimitPerCustomer);
		result.append(", userEntered: ");
		result.append(userEntered);
		result.append(", productPromoCodeEmails: ");
		result.append(productPromoCodeEmails);
		result.append(", productPromoCodeParties: ");
		result.append(productPromoCodeParties);
		result.append(')');
		return result.toString();
	}

} //ProductPromoCodeImpl
