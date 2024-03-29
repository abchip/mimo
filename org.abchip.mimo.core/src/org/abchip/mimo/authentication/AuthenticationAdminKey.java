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
 * A representation of the model object '<em><b>Authentication Admin Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.authentication.AuthenticationAdminKey#getAdminKey <em>Admin Key</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationAdminKey()
 * @model
 * @generated
 */
public interface AuthenticationAdminKey extends Authentication {
	/**
	 * Returns the value of the '<em><b>Admin Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Key</em>' attribute.
	 * @see #setAdminKey(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationAdminKey_AdminKey()
	 * @model required="true"
	 * @generated
	 */
	String getAdminKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.AuthenticationAdminKey#getAdminKey <em>Admin Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Key</em>' attribute.
	 * @see #getAdminKey()
	 * @generated
	 */
	void setAdminKey(String value);

} // AuthenticationAdminKey
