/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.store.ProductStore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Linked In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn()
 * @model annotation="mimo-ent-frame help='Data Model Enhancements For Passport' title='LinkedIn OAuth Login Config'"
 * @generated
 */
public interface OAuth2LinkedIn extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_ProductStoreId()
	 * @model keys="productStoreId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_ApiKey()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Url</em>' attribute.
	 * @see #setIconUrl(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_IconUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getIconUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getIconUrl <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Url</em>' attribute.
	 * @see #getIconUrl()
	 * @generated
	 */
	void setIconUrl(String value);

	/**
	 * Returns the value of the '<em><b>Live Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Live Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live Return Url</em>' attribute.
	 * @see #setLiveReturnUrl(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_LiveReturnUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLiveReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Return Url</em>' attribute.
	 * @see #getLiveReturnUrl()
	 * @generated
	 */
	void setLiveReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Redirect Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Redirect Uri</em>' attribute.
	 * @see #setLocalRedirectUri(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_LocalRedirectUri()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLocalRedirectUri();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLocalRedirectUri <em>Local Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Redirect Uri</em>' attribute.
	 * @see #getLocalRedirectUri()
	 * @generated
	 */
	void setLocalRedirectUri(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_SecretKey()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Test Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Return Url</em>' attribute.
	 * @see #setTestReturnUrl(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_TestReturnUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTestReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Return Url</em>' attribute.
	 * @see #getTestReturnUrl()
	 * @generated
	 */
	void setTestReturnUrl(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2LinkedIn_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // OAuth2LinkedIn
