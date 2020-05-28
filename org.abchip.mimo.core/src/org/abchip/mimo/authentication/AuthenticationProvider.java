/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

import org.abchip.mimo.context.Context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.authentication.AuthenticationPackage#getAuthenticationProvider()
 * @model abstract="true"
 * @generated
 */
public interface AuthenticationProvider {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.authentication.AuthenticationException" contextRequired="true"
	 * @generated
	 */
	String getRedirectLocation(Context context) throws AuthenticationException;
} // AuthenticationProvider
