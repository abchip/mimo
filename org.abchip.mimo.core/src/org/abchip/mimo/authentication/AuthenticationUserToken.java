/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication User Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationUserToken#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationUserToken#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationUserToken#getIdToken <em>Id Token</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationUserToken#getPicture <em>Picture</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationUserToken#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken()
 * @model
 * @generated
 */
public interface AuthenticationUserToken extends Authentication {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken_Provider()
	 * @model required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

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
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken_AccessToken()
	 * @model required="true"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Id Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Token</em>' attribute.
	 * @see #setIdToken(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken_IdToken()
	 * @model required="true"
	 * @generated
	 */
	String getIdToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getIdToken <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Token</em>' attribute.
	 * @see #getIdToken()
	 * @generated
	 */
	void setIdToken(String value);

	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken_Picture()
	 * @model
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationUserToken_User()
	 * @model required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // AuthenticationUserToken
