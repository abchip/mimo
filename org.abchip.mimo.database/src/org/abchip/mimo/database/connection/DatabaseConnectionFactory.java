/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage
 * @generated
 */
public interface DatabaseConnectionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseConnectionFactory eINSTANCE = org.abchip.mimo.database.connection.impl.DatabaseConnectionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connection Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Config</em>'.
	 * @generated
	 */
	ConnectionConfig createConnectionConfig();

	/**
	 * Returns a new object of class '<em>Connection Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Credentials</em>'.
	 * @generated
	 */
	ConnectionCredentials createConnectionCredentials();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatabaseConnectionPackage getDatabaseConnectionPackage();

} //DatabaseConnectionFactory
