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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.CatalogGenerationStrategy;
import org.abchip.mimo.database.CatalogMetaData;
import org.abchip.mimo.database.DatabaseContainer;
import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.Statement;
import org.abchip.mimo.database.query.AliasResolver;
import org.abchip.mimo.database.query.QueryParser;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class BaseConnectionImpl implements Connection {

	private Context context;
	private DatabaseContainer databaseContainer;
	private CatalogMetaData catalogMetaData;

	private QueryParser queryParser;
	private AliasResolver aliasResolver;

	private String virtualCatalog;
	private BaseCatalogConnection currentCatalogConnection;
	private List<BaseCatalogConnection> catalogConnections;

	public BaseConnectionImpl(DatabaseContainer databaseContainer, Context context) {

		this.context = context;
		this.databaseContainer = databaseContainer;
		this.queryParser = context.get(QueryParser.class);

		this.catalogConnections = new ArrayList<BaseCatalogConnection>();
	}

	@Override
	public void close() throws SQLException {

		for (BaseCatalogConnection catalogConnection : catalogConnections)
			catalogConnection.close();

		this.catalogConnections.clear();
		this.currentCatalogConnection = null;
		this.virtualCatalog = null;

		this.context.close();
	}

	@Override
	public BaseStatementImpl createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_) throws SQLException {
		return createStatement(native_, false);
	}

	@SuppressWarnings("resource")
	@Override
	public BaseStatementImpl createStatement(boolean native_, boolean updatable) throws SQLException {

		java.sql.Statement sqlStatement = null;
		if (updatable)
			// connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			sqlStatement = getRawConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		else
			sqlStatement = getRawConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		BaseStatementImpl statement = new BaseStatementImpl(this, sqlStatement, native_);
		return statement;

	}

	@SuppressWarnings("resource")
	@Override
	public Statement createStatementCursorInsensitive(boolean native_) throws SQLException {

		java.sql.Statement sqlStatement = null;
		sqlStatement = getRawConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		BaseStatementImpl statement = new BaseStatementImpl(this, sqlStatement, native_);
		return statement;
	}
	
	@Override
	public String getCatalog() throws SQLException {
		return virtualCatalog;
	}

	private BaseCatalogConnection getCatalogConnection() throws SQLException {

		if (currentCatalogConnection != null)
			return currentCatalogConnection;

		if (getCatalog() == null) {

			CatalogContainer catalogContainer = this.databaseContainer.getDefaultCatalogContainer();

			// search on connected catalog
			for (BaseCatalogConnection catalogConnection : catalogConnections)
				if (catalogConnection.getCatalogContainer().equals(catalogContainer))
					return catalogConnection;

			currentCatalogConnection = new BaseCatalogConnection(catalogContainer);
			catalogConnections.add(currentCatalogConnection);
		} else {

			// search on connected catalog
			for (BaseCatalogConnection catalogConnection : catalogConnections)
				if (getCatalog().equals(catalogConnection.getCatalogContainer().getName()))
					return catalogConnection;

			for (CatalogContainer catalogContainer : this.databaseContainer.getCatalogContainers())
				if (getCatalog().equals(catalogContainer.getName())) {

					currentCatalogConnection = new BaseCatalogConnection(catalogContainer);
					catalogConnections.add(currentCatalogConnection);

					break;
				}
		}

		return currentCatalogConnection;
	}

	@Override
	public CatalogGenerationStrategy getCatalogGenerationStrategy() {
		try {
			return getCatalogConnection().getCatalogGenerationStrategy();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public CatalogMetaData getCatalogMetaData() {

		if (this.catalogMetaData == null) {
			synchronized (this) {
				if (this.catalogMetaData == null) {
					try {
						catalogMetaData = new BaseCatalogMetaDataConnectionImpl(this, getCatalogConnection().getCatalogMetaData());
					} catch (SQLException e) {
						e.printStackTrace();
						return null;
					}
				}
			}
		}

		return catalogMetaData;
	}

	@Override
	public Context getContext() {
		return context;
	}

	@Override
	public ContextDescription getContextDescription() {
		if (this.context != null)
			return this.context.getContextDescription();
		else
			return null;
	}
	
	private java.sql.Connection getRawConnection() throws SQLException {
		return getCatalogConnection().getRawConnection();
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql) throws SQLException {
		return prepareStatement(sql, false);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_) throws SQLException {
		return prepareStatement(sql, native_, false);
	}

	@SuppressWarnings("resource")
	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_, boolean updatable) throws SQLException {

		if (!native_)
			sql = translate(sql);

		PreparedStatement sqlPreparedStatement = null;
		if (updatable)
			sqlPreparedStatement = getRawConnection().prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
		else
			sqlPreparedStatement = getRawConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		BasePreparedStatementImpl statement = new BasePreparedStatementImpl(this, sqlPreparedStatement, native_);

		return statement;
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {

		if (catalog != null && catalog.equals(virtualCatalog))
			return;

		virtualCatalog = catalog;
		currentCatalogConnection = null;

		getRawConnection();

	}

	@Override
	public String translate(String sql) throws SQLException {

		try {
			SQLQueryParseResult query = queryParser.parseQuery(sql);
			BaseCatalogConnection connection = getCatalogConnection();

			if (aliasResolver == null)
				aliasResolver = context.get(AliasResolver.class);

			if (aliasResolver != null)
				aliasResolver.resolveQuery(this, query);

			sql = connection.getQueryWriter().writeQuery(query.getQueryStatement());
		} catch (Exception e) {
			throw new SQLException("Invalid query", "X", -84, e);
		}

		return sql;
	}

	@Override
	public void close(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception e) {
		}
	}

	@Override
	public void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
		}
	}
}