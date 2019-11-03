/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#isRequireEmailOrParty <em>Require Email Or Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getUseLimitPerCode <em>Use Limit Per Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#isUserEntered <em>User Entered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoCodeEmails <em>Product Promo Code Emails</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoCodeParties <em>Product Promo Code Parties</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode()
 * @model
 * @generated
 */
public interface ProductPromoCode extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Limit Per Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Limit Per Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Limit Per Code</em>' attribute.
	 * @see #setUseLimitPerCode(long)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_UseLimitPerCode()
	 * @model
	 * @generated
	 */
	long getUseLimitPerCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getUseLimitPerCode <em>Use Limit Per Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limit Per Code</em>' attribute.
	 * @see #getUseLimitPerCode()
	 * @generated
	 */
	void setUseLimitPerCode(long value);

	/**
	 * Returns the value of the '<em><b>Use Limit Per Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Limit Per Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Limit Per Customer</em>' attribute.
	 * @see #setUseLimitPerCustomer(long)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_UseLimitPerCustomer()
	 * @model
	 * @generated
	 */
	long getUseLimitPerCustomer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limit Per Customer</em>' attribute.
	 * @see #getUseLimitPerCustomer()
	 * @generated
	 */
	void setUseLimitPerCustomer(long value);

	/**
	 * Returns the value of the '<em><b>User Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Entered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Entered</em>' attribute.
	 * @see #setUserEntered(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_UserEntered()
	 * @model
	 * @generated
	 */
	boolean isUserEntered();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#isUserEntered <em>User Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Entered</em>' attribute.
	 * @see #isUserEntered()
	 * @generated
	 */
	void setUserEntered(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code Emails</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Code Emails</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code Emails</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_ProductPromoCodeEmails()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoCodeEmail'"
	 * @generated
	 */
	List<String> getProductPromoCodeEmails();

	/**
	 * Returns the value of the '<em><b>Product Promo Code Parties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Code Parties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code Parties</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_ProductPromoCodeParties()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoCodeParty'"
	 * @generated
	 */
	List<String> getProductPromoCodeParties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderProductPromoCode' route='productPromoCodeId'"
	 * @generated
	 */
	List<String> orderProductPromoCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoUse' route='productPromoCodeId'"
	 * @generated
	 */
	List<String> productPromoUses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList' route='productPromoCodeId'"
	 * @generated
	 */
	List<String> shoppingLists();

	/**
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' attribute.
	 * @see #setProductPromoId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_ProductPromoId()
	 * @model annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

	/**
	 * Returns the value of the '<em><b>Require Email Or Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Email Or Party</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Email Or Party</em>' attribute.
	 * @see #setRequireEmailOrParty(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_RequireEmailOrParty()
	 * @model
	 * @generated
	 */
	boolean isRequireEmailOrParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#isRequireEmailOrParty <em>Require Email Or Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Email Or Party</em>' attribute.
	 * @see #isRequireEmailOrParty()
	 * @generated
	 */
	void setRequireEmailOrParty(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Code Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #setProductPromoCodeId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCode_ProductPromoCodeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCode#getProductPromoCodeId <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #getProductPromoCodeId()
	 * @generated
	 */
	void setProductPromoCodeId(String value);

} // ProductPromoCode
