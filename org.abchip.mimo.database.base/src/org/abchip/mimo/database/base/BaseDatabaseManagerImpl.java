/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.database.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.DatabaseContainer;
import org.abchip.mimo.database.DatabaseCoreRuntimeException;
import org.abchip.mimo.database.DatabaseManager;
import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.Statement;
import org.abchip.mimo.database.definition.DatabaseDefinitionFactory;
import org.abchip.mimo.database.definition.DefinitionParser;
import org.abchip.mimo.database.definition.DefinitionParserRegistry;
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.definition.IndexDef;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.database.definition.ViewDef;
import org.abchip.mimo.database.query.QueryParser;
import org.abchip.mimo.database.query.QueryParserRegistry;
import org.abchip.mimo.database.query.QueryWriter;
import org.abchip.mimo.util.IdentityDef;
import org.abchip.mimo.util.UtilFactory;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.query.QuerySelect;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.ResultColumn;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelFactory;
import org.eclipse.datatools.modelbase.sql.query.TableExpression;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionColumn;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BaseDatabaseManagerImpl implements DatabaseManager {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private DefinitionParserRegistry definitionParserRegistry;
	@Inject
	private QueryParserRegistry queryParserRegistry;
	@Inject
	private DatabaseContainer databaseContainer;

	private boolean started;
	
	protected DatabaseContainer getDatabaseContainer() {
		return this.databaseContainer;
	}

	@Override
	public void start() {

		if (isStarted())
			throw new DatabaseCoreRuntimeException("Database Manager already started: " + this.databaseContainer);

		// database context
		DefinitionParser definitionParser = this.definitionParserRegistry.lookupByVendorVersion(databaseContainer.getVendor(), databaseContainer.getVersion());
		contextRoot.set(DefinitionParser.class, definitionParser);
		QueryParser queryParser = this.queryParserRegistry.lookupByVendorVersion(databaseContainer.getVendor(), databaseContainer.getVersion());
		contextRoot.set(QueryParser.class, queryParser);

		// database loader
		BaseDatabaseLoader databaseStarter = contextRoot.make(BaseDatabaseLoader.class);
		databaseStarter.loadDatabase(databaseContainer);
		
		this.started = false;
	}

	@Override
	public boolean isStarted() {
		return this.started;
	}


	@Override
	public Schema createSchema(Connection connection, String name, SchemaDef schemaDef) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;

		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			statement = connection.createStatement(true);
			
			// definition
			String command = definitionWriter.createSchema(name, schemaDef);
			statement.execute(command);
			
			// label
			String sql = definitionWriter.createLabel(name, schemaDef);
			executeWithoutErrors(statement, sql);

		} finally {
			if (statement != null)
				statement.close();
		}

		Schema schema = getCatalogContainer(connection).loadSchema(name);
		return schema;
	}

	private void executeWithoutErrors(Statement statement, String sql) {
		try {
			if(sql != null)
				statement.execute(sql);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public Table createTable(Connection connection, Schema schema, String name, TableDef tableDef) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {

			// relative record number support
			if (catalogContainer.getGenerationStrategy().isCreateRelativeRecordNumber()) {
				tableDef = (TableDef) EcoreUtil.copy((EObject) tableDef);

				TableColumnDef pkTableComColumnDef = DatabaseDefinitionFactory.eINSTANCE.createTableColumnDef();
				IdentityDef identityDef = UtilFactory.eINSTANCE.createIdentityDef();
				pkTableComColumnDef.setDefinition(identityDef);

				pkTableComColumnDef.setName(TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME);

				tableDef.getColumns().add(pkTableComColumnDef);
			}

			statement = connection.createStatement(true);
			
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			
			// definition
			String command = definitionWriter.createTable(schema, name, tableDef);
			statement.execute(command);
			
			// label
			command = definitionWriter.createLabel(schema, name, tableDef);
			executeWithoutErrors(statement, command);

			command = definitionWriter.createLabelForFields(schema, name, tableDef);
			executeWithoutErrors(statement, command);
			
		} finally {
			if (statement != null)
				statement.close();
		}

		Table table = catalogContainer.loadTable(schema, name);
		return table;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public ViewTable createView(Connection connection, Schema schema, String name, ViewDef viewDef) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		boolean copy = false;

		Statement statement = null;
		try {

			SQLQueryParseResult query = connection.getContext().get(QueryParser.class).parseQuery(viewDef.getQuerySelect());
			QueryStatement queryStatement = query.getQueryStatement();
			QuerySelectStatement querySelectStatement = (QuerySelectStatement) queryStatement;
			QuerySelect querySelect = (QuerySelect) querySelectStatement.getQueryExpr().getQuery();
			List<TableExpression> tableExpressions = StatementHelper.getTablesForStatement(queryStatement);

			// complete column definition
			if (viewDef.getColumns().isEmpty()) {

				if (!copy) {
					viewDef = (ViewDef) EcoreUtil.copy((EObject) viewDef);
					copy = true;
				}

				for (ValueExpressionColumn expressionColumn : (List<ValueExpressionColumn>) querySelect.getColumnList()) {
					TableColumnDef tableColumnDef = DatabaseDefinitionFactory.eINSTANCE.createTableColumnDef();
					tableColumnDef.setName(expressionColumn.getName());
					viewDef.getColumns().add(tableColumnDef);
				}
			}

			// relative record number support
			if (catalogContainer.getGenerationStrategy().isCreateRelativeRecordNumber()) {

				if (!copy) {
					viewDef = (ViewDef) EcoreUtil.copy((EObject) viewDef);
					copy = true;
				}

				TableColumnDef pkTableComColumnDef = DatabaseDefinitionFactory.eINSTANCE.createTableColumnDef();
				IdentityDef identityDef = UtilFactory.eINSTANCE.createIdentityDef();
				pkTableComColumnDef.setDefinition(identityDef);

				pkTableComColumnDef.setName(TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME);

				viewDef.getColumns().add(pkTableComColumnDef);

				String fieldName = TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME;

				// column list
				querySelect.getColumnList().add(StatementHelper.createColumnExpression(fieldName));

				// result column
				ResultColumn resultColumn = SQLQueryModelFactory.eINSTANCE.createResultColumn();
				ValueExpressionColumn columnExpr = StatementHelper.createColumnExpression(fieldName);

				// select table as..
				if (tableExpressions.get(0).getTableCorrelation() != null)
					columnExpr.setTableExpr(tableExpressions.get(0).getTableCorrelation().getTableExpr());

				resultColumn.setValueExpr(columnExpr);

				querySelect.getSelectClause().add(resultColumn);

			}

			for (TableExpression tableExpression : tableExpressions)
				if (tableExpression instanceof TableInDatabase) {
					TableInDatabase tableInDatabase = (TableInDatabase) tableExpression;
					Schema tableSchema = tableInDatabase.getDatabaseTable().getSchema();
					tableSchema.setName(schema.getName());
				}

			// rewrite query
			// TODO connection.getContext().get(QueryWriter.class);
			// ERROR: get the last inject writer from OSGIContainer
			QueryWriter queryWriter = catalogContainer.getCatalogContext().get(QueryWriter.class);
			String sqlQuerySelect = queryWriter.writeQuery(querySelectStatement);

			if (!copy) {
				viewDef = (ViewDef) EcoreUtil.copy((EObject) viewDef);
				copy = true;
			}
			viewDef.setQuerySelect(sqlQuerySelect);

			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			statement = connection.createStatement(true);
			
			// definition
			String command = definitionWriter.createView(schema, name, viewDef);
			statement.execute(command);
			
			// label
			command = definitionWriter.createLabel(schema, name, viewDef);
			executeWithoutErrors(statement, command);

		} finally {
			if (statement != null)
				statement.close();
		}

		ViewTable view = getCatalogContainer(connection).loadView(schema, name);
		return view;
	}

	@Override
	public Index createIndex(Connection connection, Table table, String name, IndexDef indexDef) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.createIndex(table, name, indexDef);

			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		Index index = getCatalogContainer(connection).loadIndex(table, name);
		return index;
	}

	@Override
	public void dropSchema(Connection connection, Schema schema, boolean ignoreFailOnNonEmpty) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.dropSchema(schema, ignoreFailOnNonEmpty);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			catalogContainer.removeSchema(schema);
			
			if (statement != null)
				statement.close();
		}
	}

	@Override
	public void dropTable(Connection connection, Table table) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.dropTable(table);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeTable(table);
	}

	@Override
	public void dropView(Connection connection, ViewTable view) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.dropView(view);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeView(view);
	}

	@Override
	public void dropIndex(Connection connection, Index index) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.dropIndex(index);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeIndex(index);
	}

	@Override
	public boolean hasLogicals(Connection connection, Table table) throws SQLException {
		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		ResultSet resultSet = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.hasLogicals(table);

			statement = connection.createStatementCursorInsensitive(true);
			resultSet = statement.executeQuery(command);
			return resultSet.next();
		} finally {
			if (resultSet != null)
				resultSet.close();
			
			if (statement != null)
				statement.close();
		}
	}
	
	private CatalogContainer getCatalogContainer(Connection connection) throws SQLException {
		return getCatalogContainer(connection.getCatalog());
	}

	protected CatalogContainer getCatalogContainer(String catalogName) throws SQLException {

		CatalogContainer catalogContainer = null;

		if (catalogName == null || catalogName.isEmpty())
			catalogContainer = this.databaseContainer.getDefaultCatalogContainer();
		else
			for (CatalogContainer tempContainer : this.databaseContainer.getCatalogContainers())
				if (catalogName.equals(tempContainer.getName())) {
					catalogContainer = tempContainer;
					break;
				}

		return catalogContainer;
	}

	@Override
	public void renameTable(Connection connection, Table table, String newName) throws SQLException {

		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.renameTable(table, newName);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);

			getCatalogContainer(connection).loadTable(table.getSchema(), newName);
			getCatalogContainer(connection).removeTable(table);
			
		} finally {
			if (statement != null)
				statement.close();
		}
	}

	@Override
	public void renameIndex(Connection connection, Index index, String newName)	throws SQLException {
		CatalogContainer catalogContainer = getCatalogContainer(connection);

		Statement statement = null;
		try {
			DefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
			String command = definitionWriter.renameIndex(index, newName);

			statement = connection.createStatement(true);
			statement.setQueryTimeout(60);
			statement.execute(command);

			getCatalogContainer(connection).loadIndex(index.getTable(), newName);
			getCatalogContainer(connection).removeIndex(index);
		} finally {
			if (statement != null)
				statement.close();
		}
	}
}