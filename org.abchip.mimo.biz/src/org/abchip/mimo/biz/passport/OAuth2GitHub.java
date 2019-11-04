/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Git Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub()
 * @model
 * @generated
 */
public interface OAuth2GitHub extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_ProductStoreId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #setClientId(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_ClientId()
	 * @model
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Returns the value of the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Secret</em>' attribute.
	 * @see #setClientSecret(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_ClientSecret()
	 * @model
	 * @generated
	 */
	String getClientSecret();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Secret</em>' attribute.
	 * @see #getClientSecret()
	 * @generated
	 */
	void setClientSecret(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_IconUrl()
	 * @model
	 * @generated
	 */
	String getIconUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getIconUrl <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Url</em>' attribute.
	 * @see #getIconUrl()
	 * @generated
	 */
	void setIconUrl(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_LocalRedirectUri()
	 * @model
	 * @generated
	 */
	String getLocalRedirectUri();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getLocalRedirectUri <em>Local Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Redirect Uri</em>' attribute.
	 * @see #getLocalRedirectUri()
	 * @generated
	 */
	void setLocalRedirectUri(String value);

	/**
	 * Returns the value of the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Url</em>' attribute.
	 * @see #setReturnUrl(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_ReturnUrl()
	 * @model
	 * @generated
	 */
	String getReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Url</em>' attribute.
	 * @see #getReturnUrl()
	 * @generated
	 */
	void setReturnUrl(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getOAuth2GitHub_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // OAuth2GitHub