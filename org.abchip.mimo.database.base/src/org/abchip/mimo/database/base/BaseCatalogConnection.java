/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import java.sql.Connection;
import java.sql.SQLException;

import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.CatalogGenerationStrategy;
import org.abchip.mimo.database.CatalogMetaData;
import org.abchip.mimo.database.DatabaseCoreRuntimeException;
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.query.QueryWriter;

public class BaseCatalogConnection {

	private Connection rawConnection;

	private CatalogContainer catalogContainer;

	private QueryWriter queryWriter;
	private DefinitionWriter definitionWriter;

	protected BaseCatalogConnection(CatalogContainer catalogContainer) {
		this.catalogContainer = catalogContainer;
		this.queryWriter = catalogContainer.getCatalogContext().get(QueryWriter.class);
		this.definitionWriter = catalogContainer.getCatalogContext().get(DefinitionWriter.class);
	}

	public CatalogContainer getCatalogContainer() {
		return this.catalogContainer;
	}

	public QueryWriter getQueryWriter() {
		return queryWriter;
	}

	public DefinitionWriter getDefinitionWriter() {
		return definitionWriter;
	}

	public CatalogMetaData getCatalogMetaData() {
		return catalogContainer.getMetaData();
	}

	public CatalogGenerationStrategy getCatalogGenerationStrategy() {
		return catalogContainer.getGenerationStrategy();
	}

	protected synchronized Connection getRawConnection() throws SQLException {

		if (rawConnection == null || rawConnection.isClosed()) {

			this.rawConnection = catalogContainer.createConnection(Connection.class);
			if (this.rawConnection == null)
				throw new DatabaseCoreRuntimeException("Raw connection is null: " + this);

			this.rawConnection.setCatalog(catalogContainer.getConnectionConfig().getCatalog());
		}

		return rawConnection;
	}

	public void close() {

		if (this.rawConnection != null)
			try {
				this.rawConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
