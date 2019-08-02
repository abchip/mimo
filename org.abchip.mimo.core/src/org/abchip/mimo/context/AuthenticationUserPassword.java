/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication User Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserPassword#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserPassword#getPassword <em>Password</em>}</li>
 *   <li>{@link org.abchip.mimo.context.AuthenticationUserPassword#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserPassword()
 * @model
 * @generated
 */
public interface AuthenticationUserPassword extends Authentication {
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
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserPassword_User()
	 * @model required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserPassword#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserPassword_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserPassword#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.abchip.mimo.context.ContextPackage#getAuthenticationUserPassword_Tenant()
	 * @model
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.AuthenticationUserPassword#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

} // AuthenticationUserPassword
