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

import java.io.Closeable;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#getStatement()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.util.JavaCloseable"
 * @generated
 */
public interface Statement extends Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	boolean execute(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.database.connection.DatabaseResultSet" required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	ResultSet executeQuery(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true" generatedKeysRequired="true"
	 * @generated
	 */
	int executeUpdate(String sql, boolean generatedKeys) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	void addBatch(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	void clearBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.database.connection.StatementBatchResult" required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	int[] executeBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.database.connection.DatabaseResultSet" required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	ResultSet getGeneratedKeys() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setQueryTimeout(int seconds);

} // Statement
