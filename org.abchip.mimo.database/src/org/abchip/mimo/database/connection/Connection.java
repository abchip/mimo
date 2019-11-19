/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.database.CatalogGenerationStrategy;
import org.abchip.mimo.database.CatalogMetaData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#getConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	void close() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close(Statement stmt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rsDataType="org.abchip.mimo.database.connection.DatabaseResultSet"
	 * @generated
	 */
	void close(ResultSet rs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	Statement createStatement() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" nativeRequired="true"
	 * @generated
	 */
	Statement createStatement(boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" nativeRequired="true" updatableRequired="true"
	 * @generated
	 */
	Statement createStatement(boolean native_, boolean updatable) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" nativeRequired="true"
	 * @generated
	 */
	Statement createStatementCursorInsensitive(boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	String getCatalog() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	CatalogGenerationStrategy getCatalogGenerationStrategy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	CatalogMetaData getCatalogMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	PreparedStatement prepareStatement(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true" nativeRequired="true"
	 * @generated
	 */
	PreparedStatement prepareStatement(String sql, boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true" nativeRequired="true" updatableRequired="true"
	 * @generated
	 */
	PreparedStatement prepareStatement(String sql, boolean native_, boolean updatable) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException"
	 * @generated
	 */
	void setCatalog(String catalog) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	String translate(String sql) throws SQLException;

} // Connection
