/**
 * Copyright (c) 2017, 2020 ABChip and others.
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Fin Act Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAccountCodeLength <em>Account Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAccountValidDays <em>Account Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isAllowAuthToNegative <em>Allow Auth To Negative</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getAuthValidDays <em>Auth Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getMinBalance <em>Min Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPinCodeLength <em>Pin Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchSurveySendTo <em>Purch Survey Send To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getPurchaseSurveyId <em>Purchase Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#getReplenishThreshold <em>Replenish Threshold</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isRequirePinCode <em>Require Pin Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl#isValidateGCFinAcct <em>Validate GC Fin Acct</em>}</li>
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
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCodeLength(long newAccountCodeLength) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH, newAccountCodeLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAccountValidDays() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountValidDays(long newAccountValidDays) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS, newAccountValidDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowAuthToNegative() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAuthToNegative(boolean newAllowAuthToNegative) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE, newAllowAuthToNegative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAuthValidDays() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthValidDays(long newAuthValidDays) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS, newAuthValidDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getFinAccountTypeId() {
		return (FinAccountType)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(FinAccountType newFinAccountTypeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID, newFinAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinBalance() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinBalance(BigDecimal newMinBalance) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE, newMinBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPinCodeLength() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinCodeLength(long newPinCodeLength) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH, newPinCodeLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchSurveyCopyMe() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchSurveyCopyMe(String newPurchSurveyCopyMe) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME, newPurchSurveyCopyMe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchSurveySendTo() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchSurveySendTo(String newPurchSurveySendTo) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO, newPurchSurveySendTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey getPurchaseSurveyId() {
		return (Survey)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseSurveyId(Survey newPurchaseSurveyId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID, newPurchaseSurveyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReplenishMethodEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishMethodEnumId(Enumeration newReplenishMethodEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID, newReplenishMethodEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReplenishThreshold() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishThreshold(BigDecimal newReplenishThreshold) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD, newReplenishThreshold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePinCode() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePinCode(boolean newRequirePinCode) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE, newRequirePinCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidateGCFinAcct() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateGCFinAcct(boolean newValidateGCFinAcct) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT, newValidateGCFinAcct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID, newProductStoreId);
	}

} //ProductStoreFinActSettingImpl
