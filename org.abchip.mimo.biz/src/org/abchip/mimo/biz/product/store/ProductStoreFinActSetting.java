/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.content.survey.Survey;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Fin Act Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountCodeLength <em>Account Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountValidDays <em>Account Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isAllowAuthToNegative <em>Allow Auth To Negative</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAuthValidDays <em>Auth Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getMinBalance <em>Min Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPinCodeLength <em>Pin Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveySendTo <em>Purch Survey Send To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchaseSurveyId <em>Purchase Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishThreshold <em>Replenish Threshold</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isRequirePinCode <em>Require Pin Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isValidateGCFinAcct <em>Validate GC Fin Acct</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting()
 * @model annotation="mimo-ent-frame title='Allows financial account, such as gift certificate or calling cards, to be configured at store level' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreFinActSetting extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Account Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Code Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Code Length</em>' attribute.
	 * @see #setAccountCodeLength(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_AccountCodeLength()
	 * @model annotation="mimo-ent-slot help='length of auto-generated account code'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAccountCodeLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountCodeLength <em>Account Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Code Length</em>' attribute.
	 * @see #getAccountCodeLength()
	 * @generated
	 */
	void setAccountCodeLength(long value);

	/**
	 * Returns the value of the '<em><b>Account Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Valid Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Valid Days</em>' attribute.
	 * @see #setAccountValidDays(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_AccountValidDays()
	 * @model annotation="mimo-ent-slot help='number of days an account of this type would be valid for'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAccountValidDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountValidDays <em>Account Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Valid Days</em>' attribute.
	 * @see #getAccountValidDays()
	 * @generated
	 */
	void setAccountValidDays(long value);

	/**
	 * Returns the value of the '<em><b>Allow Auth To Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Auth To Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Auth To Negative</em>' attribute.
	 * @see #setAllowAuthToNegative(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_AllowAuthToNegative()
	 * @model
	 * @generated
	 */
	boolean isAllowAuthToNegative();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isAllowAuthToNegative <em>Allow Auth To Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Auth To Negative</em>' attribute.
	 * @see #isAllowAuthToNegative()
	 * @generated
	 */
	void setAllowAuthToNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>Auth Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Valid Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Valid Days</em>' attribute.
	 * @see #setAuthValidDays(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_AuthValidDays()
	 * @model annotation="mimo-ent-slot help='number of days an authorization of this type would be valid for'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAuthValidDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAuthValidDays <em>Auth Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Valid Days</em>' attribute.
	 * @see #getAuthValidDays()
	 * @generated
	 */
	void setAuthValidDays(long value);

	/**
	 * Returns the value of the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Id</em>' reference.
	 * @see #setFinAccountTypeId(FinAccountType)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_FinAccountTypeId()
	 * @model keys="finAccountTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FinAccountType getFinAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getFinAccountTypeId <em>Fin Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type Id</em>' reference.
	 * @see #getFinAccountTypeId()
	 * @generated
	 */
	void setFinAccountTypeId(FinAccountType value);

	/**
	 * Returns the value of the '<em><b>Min Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Balance</em>' attribute.
	 * @see #setMinBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_MinBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getMinBalance <em>Min Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Balance</em>' attribute.
	 * @see #getMinBalance()
	 * @generated
	 */
	void setMinBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pin Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Code Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Code Length</em>' attribute.
	 * @see #setPinCodeLength(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_PinCodeLength()
	 * @model annotation="mimo-ent-slot help='length of auto-generated pin code, if it is required'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPinCodeLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPinCodeLength <em>Pin Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Code Length</em>' attribute.
	 * @see #getPinCodeLength()
	 * @generated
	 */
	void setPinCodeLength(long value);

	/**
	 * Returns the value of the '<em><b>Purch Survey Copy Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purch Survey Copy Me</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purch Survey Copy Me</em>' attribute.
	 * @see #setPurchSurveyCopyMe(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_PurchSurveyCopyMe()
	 * @model annotation="mimo-ent-slot help='Whether the BCC on ProductStoreEmailSetting should be copied for email notifications'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPurchSurveyCopyMe();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purch Survey Copy Me</em>' attribute.
	 * @see #getPurchSurveyCopyMe()
	 * @generated
	 */
	void setPurchSurveyCopyMe(String value);

	/**
	 * Returns the value of the '<em><b>Purch Survey Send To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purch Survey Send To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purch Survey Send To</em>' attribute.
	 * @see #setPurchSurveySendTo(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_PurchSurveySendTo()
	 * @model annotation="mimo-ent-slot help='Field name on the purchase survey with the send to email address'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPurchSurveySendTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveySendTo <em>Purch Survey Send To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purch Survey Send To</em>' attribute.
	 * @see #getPurchSurveySendTo()
	 * @generated
	 */
	void setPurchSurveySendTo(String value);

	/**
	 * Returns the value of the '<em><b>Purchase Survey Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Survey Id</em>' reference.
	 * @see #setPurchaseSurveyId(Survey)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_PurchaseSurveyId()
	 * @model keys="surveyId"
	 *        annotation="mimo-ent-slot help='This survey is typically used to collect information such as name of buyer, recipient, email, message, etc. and is quite flexible'"
	 * @generated
	 */
	Survey getPurchaseSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchaseSurveyId <em>Purchase Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Survey Id</em>' reference.
	 * @see #getPurchaseSurveyId()
	 * @generated
	 */
	void setPurchaseSurveyId(Survey value);

	/**
	 * Returns the value of the '<em><b>Replenish Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Method Enum Id</em>' reference.
	 * @see #setReplenishMethodEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ReplenishMethodEnumId()
	 * @model keys="enumId"
	 *        annotation="mimo-ent-slot help='Replenish Method for Replenish Account. Can be FARP_TOP_OFF or FARP_REPLENISH_LEVEL. Default FARP_TOP_OFF.'"
	 * @generated
	 */
	Enumeration getReplenishMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Method Enum Id</em>' reference.
	 * @see #getReplenishMethodEnumId()
	 * @generated
	 */
	void setReplenishMethodEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Replenish Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Threshold</em>' attribute.
	 * @see #setReplenishThreshold(BigDecimal)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ReplenishThreshold()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReplenishThreshold();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishThreshold <em>Replenish Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Threshold</em>' attribute.
	 * @see #getReplenishThreshold()
	 * @generated
	 */
	void setReplenishThreshold(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Require Pin Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Pin Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Pin Code</em>' attribute.
	 * @see #setRequirePinCode(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_RequirePinCode()
	 * @model
	 * @generated
	 */
	boolean isRequirePinCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isRequirePinCode <em>Require Pin Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Pin Code</em>' attribute.
	 * @see #isRequirePinCode()
	 * @generated
	 */
	void setRequirePinCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Validate GC Fin Acct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate GC Fin Acct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate GC Fin Acct</em>' attribute.
	 * @see #setValidateGCFinAcct(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ValidateGCFinAcct()
	 * @model annotation="mimo-ent-slot help='determines whether the store should validate gift card numbers against the gift certificate codes stored in FinAccount.\n              Set to N if using external gift card provider.'"
	 * @generated
	 */
	boolean isValidateGCFinAcct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isValidateGCFinAcct <em>Validate GC Fin Acct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate GC Fin Acct</em>' attribute.
	 * @see #isValidateGCFinAcct()
	 * @generated
	 */
	void setValidateGCFinAcct(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ProductStoreId()
	 * @model keys="productStoreId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

} // ProductStoreFinActSetting
