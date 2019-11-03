/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

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
 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Fin Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Id</em>' attribute.
	 * @see #setFinAccountTypeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_FinAccountTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountType'"
	 * @generated
	 */
	String getFinAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getFinAccountTypeId <em>Fin Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type Id</em>' attribute.
	 * @see #getFinAccountTypeId()
	 * @generated
	 */
	void setFinAccountTypeId(String value);

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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Purchase Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Survey Id</em>' attribute.
	 * @see #setPurchaseSurveyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_PurchaseSurveyId()
	 * @model annotation="mimo-ent-domain frame='Survey'"
	 * @generated
	 */
	String getPurchaseSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchaseSurveyId <em>Purchase Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Survey Id</em>' attribute.
	 * @see #getPurchaseSurveyId()
	 * @generated
	 */
	void setPurchaseSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Replenish Method Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Method Enum Id</em>' attribute.
	 * @see #setReplenishMethodEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ReplenishMethodEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getReplenishMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Method Enum Id</em>' attribute.
	 * @see #getReplenishMethodEnumId()
	 * @generated
	 */
	void setReplenishMethodEnumId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFinActSetting_ProductStoreId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

} // ProductStoreFinActSetting
