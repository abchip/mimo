/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database;

import java.sql.SQLException;

import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.definition.IndexDef;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.database.definition.ViewDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;

import org.eclipse.datatools.modelbase.sql.schema.Schema;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DatabaseManager {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static final String TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME = "QASRRN";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static final int TABLE_COLUMN_RELATIVE_RECORD_NUMBER_LENGTH = 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" tableRequired="true" nameRequired="true" indexRequired="true"
	 * @generated
	 */
	Index createIndex(Connection connection, Table table, String name, IndexDef index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" nameRequired="true"
	 * @generated
	 */
	Schema createSchema(Connection connection, String name, SchemaDef schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	Table createTable(Connection connection, Schema schema, String name, TableDef table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	ViewTable createView(Connection connection, Schema schema, String name, ViewDef view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" indexRequired="true"
	 * @generated
	 */
	void dropIndex(Connection connection, Index index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" schemaRequired="true" ignoreFailOnNonEmptyRequired="true"
	 * @generated
	 */
	void dropSchema(Connection connection, Schema schema, boolean ignoreFailOnNonEmpty) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" tableRequired="true"
	 * @generated
	 */
	void dropTable(Connection connection, Table table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" viewRequired="true"
	 * @generated
	 */
	void dropView(Connection connection, ViewTable view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.database.DatabaseException" tableRequired="true"
	 * @generated
	 */
	boolean hasLogicals(Connection connection, Table table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" indexRequired="true"
	 * @generated
	 */
	void renameIndex(Connection connection, Index index, String newName) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" tableRequired="true"
	 * @generated
	 */
	void renameTable(Connection connection, Table table, String newName) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

} // DatabaseManager
