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
package org.abchip.mimo.database.definition;

import java.util.List;

import org.abchip.mimo.database.query.StatementWriter;
import org.eclipse.datatools.modelbase.sql.constraints.Index;

import org.eclipse.datatools.modelbase.sql.schema.Schema;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDefinitionWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DefinitionWriter extends StatementWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableFromRequired="true" tableToRequired="true" isCreateRelativeRecordNumberRequired="true"
	 * @generated
	 */
	String copyTableData(Table tableFrom, Table tableTo, boolean isCreateRelativeRecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String countRecords(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" schemaRequired="true"
	 * @generated
	 */
	String createLabel(String name, SchemaDef schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createLabel(Schema schema, String name, TableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createLabelForFields(Schema schema, String name, TableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" schemaRequired="true"
	 * @generated
	 */
	String createSchema(String name, SchemaDef schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createTable(Schema schema, String name, TableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" viewRequired="true"
	 * @generated
	 */
	String createView(Schema schema, String name, ViewDef view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" nameRequired="true" indexRequired="true"
	 * @generated
	 */
	String createIndex(Table table, String name, IndexDef index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" ignoreFailOnNonEmptyRequired="true"
	 * @generated
	 */
	String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String dropTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" viewRequired="true"
	 * @generated
	 */
	String dropView(ViewTable view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true"
	 * @generated
	 */
	String dropIndex(Index index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String deleteData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String hasLogicals(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String insertData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" fieldNamesMany="true"
	 * @generated
	 */
	String insertData(Table table, List<String> fieldNames);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true" newNameRequired="true"
	 * @generated
	 */
	String renameIndex(Index index, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" newNameRequired="true"
	 * @generated
	 */
	String renameTable(Table table, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String resetIdentity(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String selectData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String truncateTable(Table table);

} // DefinitionWriter
