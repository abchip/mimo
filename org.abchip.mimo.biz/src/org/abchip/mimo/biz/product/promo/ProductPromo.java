/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getBillbackFactor <em>Billback Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getProductPromoRules <em>Product Promo Rules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getPromoName <em>Promo Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getPromoText <em>Promo Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#isRequireCode <em>Require Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#isShowToCustomer <em>Show To Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerOrder <em>Use Limit Per Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerPromotion <em>Use Limit Per Promotion</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromo#isUserEntered <em>User Entered</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo()
 * @model annotation="mimo-ent-frame title='Product Promotion' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromo extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Billback Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billback Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billback Factor</em>' attribute.
	 * @see #setBillbackFactor(BigDecimal)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_BillbackFactor()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBillbackFactor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getBillbackFactor <em>Billback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billback Factor</em>' attribute.
	 * @see #getBillbackFactor()
	 * @generated
	 */
	void setBillbackFactor(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Override Org Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Org Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Org Party Id</em>' reference.
	 * @see #setOverrideOrgPartyId(Party)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_OverrideOrgPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOverrideOrgPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getOverrideOrgPartyId <em>Override Org Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Org Party Id</em>' reference.
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 */
	void setOverrideOrgPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rules</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.promo.ProductPromoRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rules</em>' reference list.
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_ProductPromoRules()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductPromoRule> getProductPromoRules();

	/**
	 * Returns the value of the '<em><b>Promo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promo Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promo Name</em>' attribute.
	 * @see #setPromoName(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_PromoName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPromoName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getPromoName <em>Promo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promo Name</em>' attribute.
	 * @see #getPromoName()
	 * @generated
	 */
	void setPromoName(String value);

	/**
	 * Returns the value of the '<em><b>Promo Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promo Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promo Text</em>' attribute.
	 * @see #setPromoText(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_PromoText()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getPromoText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getPromoText <em>Promo Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promo Text</em>' attribute.
	 * @see #getPromoText()
	 * @generated
	 */
	void setPromoText(String value);

	/**
	 * Returns the value of the '<em><b>Require Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Code</em>' attribute.
	 * @see #setRequireCode(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_RequireCode()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequireCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#isRequireCode <em>Require Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Code</em>' attribute.
	 * @see #isRequireCode()
	 * @generated
	 */
	void setRequireCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Show To Customer</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show To Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show To Customer</em>' attribute.
	 * @see #setShowToCustomer(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_ShowToCustomer()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isShowToCustomer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#isShowToCustomer <em>Show To Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show To Customer</em>' attribute.
	 * @see #isShowToCustomer()
	 * @generated
	 */
	void setShowToCustomer(boolean value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_UseLimitPerCustomer()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseLimitPerCustomer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limit Per Customer</em>' attribute.
	 * @see #getUseLimitPerCustomer()
	 * @generated
	 */
	void setUseLimitPerCustomer(long value);

	/**
	 * Returns the value of the '<em><b>Use Limit Per Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Limit Per Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Limit Per Order</em>' attribute.
	 * @see #setUseLimitPerOrder(long)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_UseLimitPerOrder()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseLimitPerOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerOrder <em>Use Limit Per Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limit Per Order</em>' attribute.
	 * @see #getUseLimitPerOrder()
	 * @generated
	 */
	void setUseLimitPerOrder(long value);

	/**
	 * Returns the value of the '<em><b>Use Limit Per Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Limit Per Promotion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Limit Per Promotion</em>' attribute.
	 * @see #setUseLimitPerPromotion(long)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_UseLimitPerPromotion()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseLimitPerPromotion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getUseLimitPerPromotion <em>Use Limit Per Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limit Per Promotion</em>' attribute.
	 * @see #getUseLimitPerPromotion()
	 * @generated
	 */
	void setUseLimitPerPromotion(long value);

	/**
	 * Returns the value of the '<em><b>User Entered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Entered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Entered</em>' attribute.
	 * @see #setUserEntered(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_UserEntered()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUserEntered();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#isUserEntered <em>User Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Entered</em>' attribute.
	 * @see #isUserEntered()
	 * @generated
	 */
	void setUserEntered(boolean value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromo_ProductPromoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromo#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

} // ProductPromo
