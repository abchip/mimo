/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.store.ProductStore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Google User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.GoogleUser#getGoogleUserId <em>Google User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.GoogleUser#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.GoogleUser#getEnvPrefix <em>Env Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.GoogleUser#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.GoogleUser#getTokenType <em>Token Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser()
 * @model annotation="mimo-ent-frame help='Data Model Enhancements For Passport' title='Store GitHub access token for user'"
 * @generated
 */
public interface GoogleUser extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Google User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Google User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Google User Id</em>' attribute.
	 * @see #setGoogleUserId(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser_GoogleUserId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getGoogleUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.GoogleUser#getGoogleUserId <em>Google User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Google User Id</em>' attribute.
	 * @see #getGoogleUserId()
	 * @generated
	 */
	void setGoogleUserId(String value);

	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser_AccessToken()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.GoogleUser#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Prefix</em>' attribute.
	 * @see #setEnvPrefix(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser_EnvPrefix()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getEnvPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.GoogleUser#getEnvPrefix <em>Env Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Prefix</em>' attribute.
	 * @see #getEnvPrefix()
	 * @generated
	 */
	void setEnvPrefix(String value);

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
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.GoogleUser#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Type</em>' attribute.
	 * @see #setTokenType(String)
	 * @see org.abchip.mimo.biz.passport.PassportPackage#getGoogleUser_TokenType()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTokenType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.passport.GoogleUser#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Type</em>' attribute.
	 * @see #getTokenType()
	 * @generated
	 */
	void setTokenType(String value);

} // GoogleUser
