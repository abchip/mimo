/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication User Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserToken#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserToken#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserToken#getIdToken <em>Id Token</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserToken()
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
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserToken_Provider()
	 * @model required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserToken#getProvider <em>Provider</em>}' attribute.
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
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserToken_AccessToken()
	 * @model required="true"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserToken#getAccessToken <em>Access Token</em>}' attribute.
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
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserToken_IdToken()
	 * @model required="true"
	 * @generated
	 */
	String getIdToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserToken#getIdToken <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Token</em>' attribute.
	 * @see #getIdToken()
	 * @generated
	 */
	void setIdToken(String value);

} // AuthenticationUserToken
