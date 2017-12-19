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

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prepared Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#getPreparedStatement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PreparedStatement extends Statement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	void addBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	void clearParameters() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	boolean execute() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.database.connection.DatabaseResultSet" required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	ResultSet executeQuery() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	int executeUpdate() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.database.connection.DatabaseResultSetMetaData" required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	ResultSetMetaData getMetaData() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setDate(int position, Date value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setInt(int position, int value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" positionRequired="true" valueType="org.abchip.mimo.util.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void setNumber(int position, Number value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setString(int position, String value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setObject(int position, Object value) throws SQLException;

} // PreparedStatement
