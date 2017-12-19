/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.database.connection;

import java.sql.SQLException;
import org.abchip.mimo.context.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#getConnectionManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConnectionManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" contextRequired="true"
	 * @generated
	 */
	Connection createConnection(Context context) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	Connection createConnection(String catalog) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	Connection createConnection(String user, String password) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	Connection createConnection(String catalog, String user, String password) throws SQLException;

} // ConnectionManager
