/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.ProductPromoRule;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getBillbackFactor <em>Billback Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getProductPromoRules <em>Product Promo Rules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getPromoName <em>Promo Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getPromoText <em>Promo Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isRequireCode <em>Require Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isShowToCustomer <em>Show To Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerOrder <em>Use Limit Per Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerPromotion <em>Use Limit Per Promotion</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isUserEntered <em>User Entered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoImpl extends BizEntityImpl implements ProductPromo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBillbackFactor() {
		return (BigDecimal)eGet(PromoPackage.Literals.PRODUCT_PROMO__BILLBACK_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillbackFactor(BigDecimal newBillbackFactor) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__BILLBACK_FACTOR, newBillbackFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(PromoPackage.Literals.PRODUCT_PROMO__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(PromoPackage.Literals.PRODUCT_PROMO__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(PromoPackage.Literals.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(PromoPackage.Literals.PRODUCT_PROMO__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOverrideOrgPartyId() {
		return (Party)eGet(PromoPackage.Literals.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideOrgPartyId(Party newOverrideOrgPartyId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID, newOverrideOrgPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductPromoRule> getProductPromoRules() {
		return (List<ProductPromoRule>)eGet(PromoPackage.Literals.PRODUCT_PROMO__PRODUCT_PROMO_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromoName() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO__PROMO_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromoName(String newPromoName) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__PROMO_NAME, newPromoName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromoText() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO__PROMO_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromoText(String newPromoText) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__PROMO_TEXT, newPromoText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCode() {
		return (Boolean)eGet(PromoPackage.Literals.PRODUCT_PROMO__REQUIRE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCode(boolean newRequireCode) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__REQUIRE_CODE, newRequireCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowToCustomer() {
		return (Boolean)eGet(PromoPackage.Literals.PRODUCT_PROMO__SHOW_TO_CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowToCustomer(boolean newShowToCustomer) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__SHOW_TO_CUSTOMER, newShowToCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerCustomer() {
		return (Long)eGet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerCustomer(long newUseLimitPerCustomer) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER, newUseLimitPerCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerOrder() {
		return (Long)eGet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerOrder(long newUseLimitPerOrder) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_ORDER, newUseLimitPerOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerPromotion() {
		return (Long)eGet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerPromotion(long newUseLimitPerPromotion) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION, newUseLimitPerPromotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUserEntered() {
		return (Boolean)eGet(PromoPackage.Literals.PRODUCT_PROMO__USER_ENTERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserEntered(boolean newUserEntered) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__USER_ENTERED, newUserEntered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO__PRODUCT_PROMO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO__PRODUCT_PROMO_ID, newProductPromoId);
	}

} //ProductPromoImpl
