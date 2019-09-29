/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.test.runner;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.database.DatabaseManager;
import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.ConnectionManager;
import org.abchip.mimo.database.definition.DatabaseDefinitionFactory;
import org.abchip.mimo.database.definition.DatabaseObjectDef;
import org.abchip.mimo.database.definition.IndexColumnDef;
import org.abchip.mimo.database.definition.IndexDef;
import org.abchip.mimo.database.definition.OrderingType;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.database.definition.ViewDef;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.base.BaseTestHelper;
import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.Files;
import org.abchip.mimo.util.UtilFactory;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.osgi.framework.console.CommandInterpreter;

@Test(entity = "Definition")
public class TestDatabaseDefinition {

	@Inject
	private ConnectionManager connectionManager;
	@Inject
	private DatabaseManager databaseManager;
	@Inject
	private Files files;

	@TestStarted
	public void main() throws SQLException, IOException {

		String catalog = null;
		String schemaName = "MIMO_TEST";

		// connect to default catalog
		Connection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);

		SchemaDef schemaDef = DatabaseDefinitionFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);

		// tables
		for (URL tableURL: connection.getContext().getResources(this.getClass(), "/resources/schemas/" + schemaName + "/tables")) {
			String fileName = files.getBaseName(tableURL.getFile());

			DatabaseObjectDef file = (DatabaseObjectDef) BaseTestHelper.load(tableURL);

			SQLObject sqlObject = null;
			try {
				TableDef tableDef = (TableDef) file;
				sqlObject = databaseManager.createTable(connection, schema, fileName, tableDef);
				System.out.println(sqlObject);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		// views
		for (URL viewURL: connection.getContext().getResources(this.getClass(), "/resources/schemas/" + schemaName + "/views")) {
			String fileName = files.getBaseName(viewURL.getFile());

			DatabaseObjectDef file = (DatabaseObjectDef) BaseTestHelper.load(viewURL);

			SQLObject sqlObject = null;
			try {
				ViewDef viewDef = (ViewDef) file;
				sqlObject = databaseManager.createView(connection, schema, fileName, viewDef);
				System.out.println(sqlObject);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		// indices
		for (URL indexURL: connection.getContext().getResources(this.getClass(), "/resources/schemas/" + schemaName + "/indices")) {
			String fileName = files.getBaseName(indexURL.getFile());

			DatabaseObjectDef file = (DatabaseObjectDef) BaseTestHelper.load(indexURL);

			SQLObject sqlObject = null;
			try {
				IndexDef indexDef = (IndexDef) file;

				Table table = null;
				if (connection.getCatalogGenerationStrategy().isCreateIndexOnView()) {
					table = connection.getCatalogMetaData().getView(schemaName, fileName);

					if (table != null) {
						sqlObject = databaseManager.createIndex(connection, table, fileName, indexDef);
						System.out.println(sqlObject);
					}
				} else {
					// TODO
				}
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		connection.close();
		System.out.println("Creazione schema completata");
	}

	public Object _testDDL(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		String schemaName = "MIMO_TEST";
		String tableName = "MIMO_TABLE";
		String indexName = "MIMO_INDEX";

		Connection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);

		SchemaDef schemaDef = DatabaseDefinitionFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);

		TableDef tableDef = DatabaseDefinitionFactory.eINSTANCE.createTableDef();

		for (int i = 1; i <= 3; i++) {
			TableColumnDef column = DatabaseDefinitionFactory.eINSTANCE.createTableColumnDef();
			CharacterDef characterDef = UtilFactory.eINSTANCE.createCharacterDef();
			characterDef.setLength(10);
			column.setDefinition(characterDef);
			column.setName("COL" + i);
			tableDef.getColumns().add(column);
		}

		Table table = databaseManager.createTable(connection, schema, tableName, tableDef);

		IndexDef indexDef = DatabaseDefinitionFactory.eINSTANCE.createIndexDef();

		IndexColumnDef indexColumn = DatabaseDefinitionFactory.eINSTANCE.createIndexColumnDef();
		indexColumn.setName("COL2");
		indexColumn.setSequence(1);
		indexColumn.setOrdering(OrderingType.ASCEND);

		indexDef.getColumns().add(indexColumn);

		databaseManager.createIndex(connection, table, indexName, indexDef);

		connection.close();

		return null;
	}

	@SuppressWarnings("unchecked")
	public Object _copyDDL(CommandInterpreter interpreter) throws SQLException {

		String catalogFrom = interpreter.nextArgument();
		String cataloTo = interpreter.nextArgument();
		String schemaName = interpreter.nextArgument();

		Connection connectionTo = connectionManager.createConnection(cataloTo);

		Schema schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaName);
		if (schemaTo != null)
			databaseManager.dropSchema(connectionTo, schemaTo, true);

		Connection connectionFrom = connectionManager.createConnection(catalogFrom);
		Schema schemaFrom = connectionFrom.getCatalogMetaData().getSchema(schemaName);

		SchemaDef schemaDef = null; // connectionTo.getContext().getAdapter(schemaFrom, SchemaDef.class);
		databaseManager.createSchema(connectionTo, schemaFrom.getName(), schemaDef);
		// TODO
		schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaFrom.getName());

		for (Table table : (List<Table>) schemaFrom.getTables())
			if (table instanceof ViewTable) {
				ViewDef viewDef = null; // connectionTo.getContext().getAdapter(table, ViewDef.class);
				databaseManager.createView(connectionTo, schemaTo, table.getName(), viewDef);
			} else {
				TableDef tableDef = null; // connectionTo.getContext().getAdapter(table, TableDef.class);
				databaseManager.createTable(connectionTo, schemaTo, table.getName(), tableDef);
			}

		for (Index index : (List<Index>) schemaFrom.getIndices()) {
			IndexDef indexDef = null; // connectionTo.getContext().getAdapter(index, IndexDef.class);
			Table tableTo = connectionTo.getCatalogMetaData().getTable(schemaTo.getName(), index.getName());
			databaseManager.createIndex(connectionTo, tableTo, index.getName(), indexDef);
		}

		return null;
	}
}