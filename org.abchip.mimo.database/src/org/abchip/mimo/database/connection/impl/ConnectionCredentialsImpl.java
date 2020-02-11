/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection.impl;

import org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl;
import org.abchip.mimo.database.connection.ConnectionCredentials;
import org.abchip.mimo.database.connection.DatabaseConnectionPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Credentials</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectionCredentialsImpl extends AuthenticationUserPasswordImpl implements ConnectionCredentials {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseConnectionPackage.Literals.CONNECTION_CREDENTIALS;
	}

} // ConnectionCredentialsImpl
