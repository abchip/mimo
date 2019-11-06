/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreFinActSetting;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Fin Act Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAccountCodeLength <em>Account Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAccountValidDays <em>Account Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isAllowAuthToNegative <em>Allow Auth To Negative</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAuthValidDays <em>Auth Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getMinBalance <em>Min Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPinCodeLength <em>Pin Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchSurveySendTo <em>Purch Survey Send To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getReplenishThreshold <em>Replenish Threshold</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isRequirePinCode <em>Require Pin Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isValidateGCFinAcct <em>Validate GC Fin Acct</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchaseSurveyId <em>Purchase Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreFinActSettingImpl extends BizEntityImpl implements ProductStoreFinActSetting {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAccountCodeLength() <em>Account Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCodeLength()
	 * @generated
	 * @ordered
	 */
	protected static final long ACCOUNT_CODE_LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAccountCodeLength() <em>Account Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCodeLength()
	 * @generated
	 * @ordered
	 */
	protected long accountCodeLength = ACCOUNT_CODE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountValidDays() <em>Account Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountValidDays()
	 * @generated
	 * @ordered
	 */
	protected static final long ACCOUNT_VALID_DAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAccountValidDays() <em>Account Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountValidDays()
	 * @generated
	 * @ordered
	 */
	protected long accountValidDays = ACCOUNT_VALID_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowAuthToNegative() <em>Allow Auth To Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAuthToNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_AUTH_TO_NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowAuthToNegative() <em>Allow Auth To Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAuthToNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean allowAuthToNegative = ALLOW_AUTH_TO_NEGATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthValidDays() <em>Auth Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthValidDays()
	 * @generated
	 * @ordered
	 */
	protected static final long AUTH_VALID_DAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAuthValidDays() <em>Auth Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthValidDays()
	 * @generated
	 * @ordered
	 */
	protected long authValidDays = AUTH_VALID_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinBalance() <em>Min Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_BALANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinBalance() <em>Min Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minBalance = MIN_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinCodeLength() <em>Pin Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCodeLength()
	 * @generated
	 * @ordered
	 */
	protected static final long PIN_CODE_LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPinCodeLength() <em>Pin Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCodeLength()
	 * @generated
	 * @ordered
	 */
	protected long pinCodeLength = PIN_CODE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchSurveyCopyMe() <em>Purch Survey Copy Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchSurveyCopyMe()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCH_SURVEY_COPY_ME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchSurveyCopyMe() <em>Purch Survey Copy Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchSurveyCopyMe()
	 * @generated
	 * @ordered
	 */
	protected String purchSurveyCopyMe = PURCH_SURVEY_COPY_ME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchSurveySendTo() <em>Purch Survey Send To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchSurveySendTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCH_SURVEY_SEND_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchSurveySendTo() <em>Purch Survey Send To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchSurveySendTo()
	 * @generated
	 * @ordered
	 */
	protected String purchSurveySendTo = PURCH_SURVEY_SEND_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplenishThreshold() <em>Replenish Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REPLENISH_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplenishThreshold() <em>Replenish Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishThreshold()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal replenishThreshold = REPLENISH_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequirePinCode() <em>Require Pin Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePinCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_PIN_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequirePinCode() <em>Require Pin Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePinCode()
	 * @generated
	 * @ordered
	 */
	protected boolean requirePinCode = REQUIRE_PIN_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidateGCFinAcct() <em>Validate GC Fin Acct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateGCFinAcct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATE_GC_FIN_ACCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidateGCFinAcct() <em>Validate GC Fin Acct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateGCFinAcct()
	 * @generated
	 * @ordered
	 */
	protected boolean validateGCFinAcct = VALIDATE_GC_FIN_ACCT_EDEFAULT;

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
	 * The cached value of the '{@link #getFinAccountTypeId() <em>Fin Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountType finAccountTypeId;

	/**
	 * The cached value of the '{@link #getPurchaseSurveyId() <em>Purchase Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseSurveyId()
	 * @generated
	 * @ordered
	 */
	protected Survey purchaseSurveyId;

	/**
	 * The cached value of the '{@link #getReplenishMethodEnumId() <em>Replenish Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishMethodEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration replenishMethodEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreFinActSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAccountCodeLength() {
		return accountCodeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCodeLength(long newAccountCodeLength) {
		accountCodeLength = newAccountCodeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAccountValidDays() {
		return accountValidDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountValidDays(long newAccountValidDays) {
		accountValidDays = newAccountValidDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowAuthToNegative() {
		return allowAuthToNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAuthToNegative(boolean newAllowAuthToNegative) {
		allowAuthToNegative = newAllowAuthToNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAuthValidDays() {
		return authValidDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthValidDays(long newAuthValidDays) {
		authValidDays = newAuthValidDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getFinAccountTypeId() {
		if (finAccountTypeId != null && ((EObject)finAccountTypeId).eIsProxy()) {
			InternalEObject oldFinAccountTypeId = (InternalEObject)finAccountTypeId;
			finAccountTypeId = (FinAccountType)eResolveProxy(oldFinAccountTypeId);
			if (finAccountTypeId != oldFinAccountTypeId) {
			}
		}
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountType basicGetFinAccountTypeId() {
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(FinAccountType newFinAccountTypeId) {
		finAccountTypeId = newFinAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinBalance() {
		return minBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinBalance(BigDecimal newMinBalance) {
		minBalance = newMinBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPinCodeLength() {
		return pinCodeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinCodeLength(long newPinCodeLength) {
		pinCodeLength = newPinCodeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchSurveyCopyMe() {
		return purchSurveyCopyMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchSurveyCopyMe(String newPurchSurveyCopyMe) {
		purchSurveyCopyMe = newPurchSurveyCopyMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchSurveySendTo() {
		return purchSurveySendTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchSurveySendTo(String newPurchSurveySendTo) {
		purchSurveySendTo = newPurchSurveySendTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey getPurchaseSurveyId() {
		if (purchaseSurveyId != null && ((EObject)purchaseSurveyId).eIsProxy()) {
			InternalEObject oldPurchaseSurveyId = (InternalEObject)purchaseSurveyId;
			purchaseSurveyId = (Survey)eResolveProxy(oldPurchaseSurveyId);
			if (purchaseSurveyId != oldPurchaseSurveyId) {
			}
		}
		return purchaseSurveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey basicGetPurchaseSurveyId() {
		return purchaseSurveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseSurveyId(Survey newPurchaseSurveyId) {
		purchaseSurveyId = newPurchaseSurveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReplenishMethodEnumId() {
		if (replenishMethodEnumId != null && ((EObject)replenishMethodEnumId).eIsProxy()) {
			InternalEObject oldReplenishMethodEnumId = (InternalEObject)replenishMethodEnumId;
			replenishMethodEnumId = (Enumeration)eResolveProxy(oldReplenishMethodEnumId);
			if (replenishMethodEnumId != oldReplenishMethodEnumId) {
			}
		}
		return replenishMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReplenishMethodEnumId() {
		return replenishMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishMethodEnumId(Enumeration newReplenishMethodEnumId) {
		replenishMethodEnumId = newReplenishMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReplenishThreshold() {
		return replenishThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishThreshold(BigDecimal newReplenishThreshold) {
		replenishThreshold = newReplenishThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePinCode() {
		return requirePinCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePinCode(boolean newRequirePinCode) {
		requirePinCode = newRequirePinCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidateGCFinAcct() {
		return validateGCFinAcct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateGCFinAcct(boolean newValidateGCFinAcct) {
		validateGCFinAcct = newValidateGCFinAcct;
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
		productStoreId = newProductStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH:
				return getAccountCodeLength();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS:
				return getAccountValidDays();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE:
				return isAllowAuthToNegative();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS:
				return getAuthValidDays();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE:
				return getMinBalance();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH:
				return getPinCodeLength();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME:
				return getPurchSurveyCopyMe();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO:
				return getPurchSurveySendTo();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD:
				return getReplenishThreshold();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE:
				return isRequirePinCode();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT:
				return isValidateGCFinAcct();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID:
				if (resolve) return getFinAccountTypeId();
				return basicGetFinAccountTypeId();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID:
				if (resolve) return getPurchaseSurveyId();
				return basicGetPurchaseSurveyId();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID:
				if (resolve) return getReplenishMethodEnumId();
				return basicGetReplenishMethodEnumId();
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
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH:
				setAccountCodeLength((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS:
				setAccountValidDays((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE:
				setAllowAuthToNegative((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS:
				setAuthValidDays((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE:
				setMinBalance((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH:
				setPinCodeLength((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME:
				setPurchSurveyCopyMe((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO:
				setPurchSurveySendTo((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD:
				setReplenishThreshold((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE:
				setRequirePinCode((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT:
				setValidateGCFinAcct((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID:
				setPurchaseSurveyId((Survey)newValue);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID:
				setReplenishMethodEnumId((Enumeration)newValue);
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
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH:
				setAccountCodeLength(ACCOUNT_CODE_LENGTH_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS:
				setAccountValidDays(ACCOUNT_VALID_DAYS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE:
				setAllowAuthToNegative(ALLOW_AUTH_TO_NEGATIVE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS:
				setAuthValidDays(AUTH_VALID_DAYS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE:
				setMinBalance(MIN_BALANCE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH:
				setPinCodeLength(PIN_CODE_LENGTH_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME:
				setPurchSurveyCopyMe(PURCH_SURVEY_COPY_ME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO:
				setPurchSurveySendTo(PURCH_SURVEY_SEND_TO_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD:
				setReplenishThreshold(REPLENISH_THRESHOLD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE:
				setRequirePinCode(REQUIRE_PIN_CODE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT:
				setValidateGCFinAcct(VALIDATE_GC_FIN_ACCT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)null);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID:
				setPurchaseSurveyId((Survey)null);
				return;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID:
				setReplenishMethodEnumId((Enumeration)null);
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
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH:
				return accountCodeLength != ACCOUNT_CODE_LENGTH_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS:
				return accountValidDays != ACCOUNT_VALID_DAYS_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE:
				return allowAuthToNegative != ALLOW_AUTH_TO_NEGATIVE_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS:
				return authValidDays != AUTH_VALID_DAYS_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE:
				return MIN_BALANCE_EDEFAULT == null ? minBalance != null : !MIN_BALANCE_EDEFAULT.equals(minBalance);
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH:
				return pinCodeLength != PIN_CODE_LENGTH_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME:
				return PURCH_SURVEY_COPY_ME_EDEFAULT == null ? purchSurveyCopyMe != null : !PURCH_SURVEY_COPY_ME_EDEFAULT.equals(purchSurveyCopyMe);
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO:
				return PURCH_SURVEY_SEND_TO_EDEFAULT == null ? purchSurveySendTo != null : !PURCH_SURVEY_SEND_TO_EDEFAULT.equals(purchSurveySendTo);
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD:
				return REPLENISH_THRESHOLD_EDEFAULT == null ? replenishThreshold != null : !REPLENISH_THRESHOLD_EDEFAULT.equals(replenishThreshold);
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE:
				return requirePinCode != REQUIRE_PIN_CODE_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT:
				return validateGCFinAcct != VALIDATE_GC_FIN_ACCT_EDEFAULT;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID:
				return productStoreId != null;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID:
				return finAccountTypeId != null;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID:
				return purchaseSurveyId != null;
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID:
				return replenishMethodEnumId != null;
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
		result.append(" (accountCodeLength: ");
		result.append(accountCodeLength);
		result.append(", accountValidDays: ");
		result.append(accountValidDays);
		result.append(", allowAuthToNegative: ");
		result.append(allowAuthToNegative);
		result.append(", authValidDays: ");
		result.append(authValidDays);
		result.append(", minBalance: ");
		result.append(minBalance);
		result.append(", pinCodeLength: ");
		result.append(pinCodeLength);
		result.append(", purchSurveyCopyMe: ");
		result.append(purchSurveyCopyMe);
		result.append(", purchSurveySendTo: ");
		result.append(purchSurveySendTo);
		result.append(", replenishThreshold: ");
		result.append(replenishThreshold);
		result.append(", requirePinCode: ");
		result.append(requirePinCode);
		result.append(", validateGCFinAcct: ");
		result.append(validateGCFinAcct);
		result.append(')');
		return result.toString();
	}

} //ProductStoreFinActSettingImpl
