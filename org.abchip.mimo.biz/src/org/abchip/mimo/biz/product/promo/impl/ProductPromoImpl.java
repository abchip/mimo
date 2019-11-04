/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getPromoName <em>Promo Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getPromoText <em>Promo Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isRequireCode <em>Require Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isShowToCustomer <em>Show To Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerOrder <em>Use Limit Per Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getUseLimitPerPromotion <em>Use Limit Per Promotion</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#isUserEntered <em>User Entered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoImpl#getProductPromoRules <em>Product Promo Rules</em>}</li>
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
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillbackFactor() <em>Billback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillbackFactor()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BILLBACK_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillbackFactor() <em>Billback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillbackFactor()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal billbackFactor = BILLBACK_FACTOR_EDEFAULT;

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
	 * The default value of the '{@link #getPromoName() <em>Promo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromoName() <em>Promo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoName()
	 * @generated
	 * @ordered
	 */
	protected String promoName = PROMO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromoText() <em>Promo Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoText()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMO_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromoText() <em>Promo Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoText()
	 * @generated
	 * @ordered
	 */
	protected String promoText = PROMO_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireCode() <em>Require Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireCode() <em>Require Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCode()
	 * @generated
	 * @ordered
	 */
	protected boolean requireCode = REQUIRE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowToCustomer() <em>Show To Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowToCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TO_CUSTOMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowToCustomer() <em>Show To Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowToCustomer()
	 * @generated
	 * @ordered
	 */
	protected boolean showToCustomer = SHOW_TO_CUSTOMER_EDEFAULT;

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
	 * The default value of the '{@link #getUseLimitPerOrder() <em>Use Limit Per Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerOrder()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_LIMIT_PER_ORDER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseLimitPerOrder() <em>Use Limit Per Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerOrder()
	 * @generated
	 * @ordered
	 */
	protected long useLimitPerOrder = USE_LIMIT_PER_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLimitPerPromotion() <em>Use Limit Per Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerPromotion()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_LIMIT_PER_PROMOTION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseLimitPerPromotion() <em>Use Limit Per Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitPerPromotion()
	 * @generated
	 * @ordered
	 */
	protected long useLimitPerPromotion = USE_LIMIT_PER_PROMOTION_EDEFAULT;

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
	 * The cached value of the '{@link #getOverrideOrgPartyId() <em>Override Org Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party overrideOrgPartyId;

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
	 * The cached value of the '{@link #getProductPromoRules() <em>Product Promo Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPromoRules;

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
		return billbackFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillbackFactor(BigDecimal newBillbackFactor) {
		BigDecimal oldBillbackFactor = billbackFactor;
		billbackFactor = newBillbackFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__BILLBACK_FACTOR, oldBillbackFactor, billbackFactor));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
		UserLogin oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__CREATED_DATE, oldCreatedDate, createdDate));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
		UserLogin oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOverrideOrgPartyId() {
		if (overrideOrgPartyId != null && ((EObject)overrideOrgPartyId).eIsProxy()) {
			InternalEObject oldOverrideOrgPartyId = (InternalEObject)overrideOrgPartyId;
			overrideOrgPartyId = (Party)eResolveProxy(oldOverrideOrgPartyId);
			if (overrideOrgPartyId != oldOverrideOrgPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID, oldOverrideOrgPartyId, overrideOrgPartyId));
			}
		}
		return overrideOrgPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOverrideOrgPartyId() {
		return overrideOrgPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideOrgPartyId(Party newOverrideOrgPartyId) {
		Party oldOverrideOrgPartyId = overrideOrgPartyId;
		overrideOrgPartyId = newOverrideOrgPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID, oldOverrideOrgPartyId, overrideOrgPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromoName() {
		return promoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromoName(String newPromoName) {
		String oldPromoName = promoName;
		promoName = newPromoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__PROMO_NAME, oldPromoName, promoName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromoText() {
		return promoText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromoText(String newPromoText) {
		String oldPromoText = promoText;
		promoText = newPromoText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__PROMO_TEXT, oldPromoText, promoText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCode() {
		return requireCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCode(boolean newRequireCode) {
		boolean oldRequireCode = requireCode;
		requireCode = newRequireCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__REQUIRE_CODE, oldRequireCode, requireCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowToCustomer() {
		return showToCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowToCustomer(boolean newShowToCustomer) {
		boolean oldShowToCustomer = showToCustomer;
		showToCustomer = newShowToCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__SHOW_TO_CUSTOMER, oldShowToCustomer, showToCustomer));
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
		long oldUseLimitPerCustomer = useLimitPerCustomer;
		useLimitPerCustomer = newUseLimitPerCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER, oldUseLimitPerCustomer, useLimitPerCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerOrder() {
		return useLimitPerOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerOrder(long newUseLimitPerOrder) {
		long oldUseLimitPerOrder = useLimitPerOrder;
		useLimitPerOrder = newUseLimitPerOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_ORDER, oldUseLimitPerOrder, useLimitPerOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseLimitPerPromotion() {
		return useLimitPerPromotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseLimitPerPromotion(long newUseLimitPerPromotion) {
		long oldUseLimitPerPromotion = useLimitPerPromotion;
		useLimitPerPromotion = newUseLimitPerPromotion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION, oldUseLimitPerPromotion, useLimitPerPromotion));
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
		boolean oldUserEntered = userEntered;
		userEntered = newUserEntered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__USER_ENTERED, oldUserEntered, userEntered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductPromoRules() {
		if (productPromoRules == null) {
			productPromoRules = new EDataTypeUniqueEList<String>(String.class, this, PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_RULES);
		}
		return productPromoRules;
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
	public List<String> productPromoCodes() {
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
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case PromoPackage.PRODUCT_PROMO__BILLBACK_FACTOR:
				return getBillbackFactor();
			case PromoPackage.PRODUCT_PROMO__CREATED_DATE:
				return getCreatedDate();
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PromoPackage.PRODUCT_PROMO__PROMO_NAME:
				return getPromoName();
			case PromoPackage.PRODUCT_PROMO__PROMO_TEXT:
				return getPromoText();
			case PromoPackage.PRODUCT_PROMO__REQUIRE_CODE:
				return isRequireCode();
			case PromoPackage.PRODUCT_PROMO__SHOW_TO_CUSTOMER:
				return isShowToCustomer();
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER:
				return getUseLimitPerCustomer();
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_ORDER:
				return getUseLimitPerOrder();
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION:
				return getUseLimitPerPromotion();
			case PromoPackage.PRODUCT_PROMO__USER_ENTERED:
				return isUserEntered();
			case PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID:
				if (resolve) return getOverrideOrgPartyId();
				return basicGetOverrideOrgPartyId();
			case PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_RULES:
				return getProductPromoRules();
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
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__BILLBACK_FACTOR:
				setBillbackFactor((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__PROMO_NAME:
				setPromoName((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__PROMO_TEXT:
				setPromoText((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__REQUIRE_CODE:
				setRequireCode((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__SHOW_TO_CUSTOMER:
				setShowToCustomer((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER:
				setUseLimitPerCustomer((Long)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_ORDER:
				setUseLimitPerOrder((Long)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION:
				setUseLimitPerPromotion((Long)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__USER_ENTERED:
				setUserEntered((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId((Party)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_RULES:
				getProductPromoRules().clear();
				getProductPromoRules().addAll((Collection<? extends String>)newValue);
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
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__BILLBACK_FACTOR:
				setBillbackFactor(BILLBACK_FACTOR_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__PROMO_NAME:
				setPromoName(PROMO_NAME_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__PROMO_TEXT:
				setPromoText(PROMO_TEXT_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__REQUIRE_CODE:
				setRequireCode(REQUIRE_CODE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__SHOW_TO_CUSTOMER:
				setShowToCustomer(SHOW_TO_CUSTOMER_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER:
				setUseLimitPerCustomer(USE_LIMIT_PER_CUSTOMER_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_ORDER:
				setUseLimitPerOrder(USE_LIMIT_PER_ORDER_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION:
				setUseLimitPerPromotion(USE_LIMIT_PER_PROMOTION_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__USER_ENTERED:
				setUserEntered(USER_ENTERED_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId((Party)null);
				return;
			case PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_RULES:
				getProductPromoRules().clear();
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
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case PromoPackage.PRODUCT_PROMO__BILLBACK_FACTOR:
				return BILLBACK_FACTOR_EDEFAULT == null ? billbackFactor != null : !BILLBACK_FACTOR_EDEFAULT.equals(billbackFactor);
			case PromoPackage.PRODUCT_PROMO__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PromoPackage.PRODUCT_PROMO__PROMO_NAME:
				return PROMO_NAME_EDEFAULT == null ? promoName != null : !PROMO_NAME_EDEFAULT.equals(promoName);
			case PromoPackage.PRODUCT_PROMO__PROMO_TEXT:
				return PROMO_TEXT_EDEFAULT == null ? promoText != null : !PROMO_TEXT_EDEFAULT.equals(promoText);
			case PromoPackage.PRODUCT_PROMO__REQUIRE_CODE:
				return requireCode != REQUIRE_CODE_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__SHOW_TO_CUSTOMER:
				return showToCustomer != SHOW_TO_CUSTOMER_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER:
				return useLimitPerCustomer != USE_LIMIT_PER_CUSTOMER_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_ORDER:
				return useLimitPerOrder != USE_LIMIT_PER_ORDER_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION:
				return useLimitPerPromotion != USE_LIMIT_PER_PROMOTION_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__USER_ENTERED:
				return userEntered != USER_ENTERED_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO__OVERRIDE_ORG_PARTY_ID:
				return overrideOrgPartyId != null;
			case PromoPackage.PRODUCT_PROMO__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case PromoPackage.PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case PromoPackage.PRODUCT_PROMO__PRODUCT_PROMO_RULES:
				return productPromoRules != null && !productPromoRules.isEmpty();
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
		result.append(" (productPromoId: ");
		result.append(productPromoId);
		result.append(", billbackFactor: ");
		result.append(billbackFactor);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", promoName: ");
		result.append(promoName);
		result.append(", promoText: ");
		result.append(promoText);
		result.append(", requireCode: ");
		result.append(requireCode);
		result.append(", showToCustomer: ");
		result.append(showToCustomer);
		result.append(", useLimitPerCustomer: ");
		result.append(useLimitPerCustomer);
		result.append(", useLimitPerOrder: ");
		result.append(useLimitPerOrder);
		result.append(", useLimitPerPromotion: ");
		result.append(useLimitPerPromotion);
		result.append(", userEntered: ");
		result.append(userEntered);
		result.append(", productPromoRules: ");
		result.append(productPromoRules);
		result.append(')');
		return result.toString();
	}

} //ProductPromoImpl
