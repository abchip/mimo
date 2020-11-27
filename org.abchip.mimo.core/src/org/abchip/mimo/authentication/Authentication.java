/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.authentication;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.authentication.Authentication#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthentication()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Authentication extends Entity {

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthentication_Tenant()
	 * @model
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.authentication.Authentication#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);
} // Authentication
