/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.database.CatalogMetaData;
import org.abchip.mimo.database.SearchStrategy;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public class BaseCatalogMetaDataConnectionImpl implements CatalogMetaData {

	private CatalogMetaData catalogMetaData;
	
	public BaseCatalogMetaDataConnectionImpl(CatalogMetaData catalogMetaData) {
		this.catalogMetaData = catalogMetaData;
	}
	
	@Override
	public Index getIndex(String schema, String table, String index) {
		
		return catalogMetaData.getIndex(schema, table, index);
	}

	@Override
	public Schema getSchema(String schema) {
		
		return catalogMetaData.getSchema(schema);
	}

	@Override
	public List<Schema> getAllSchemas() {	
		return catalogMetaData.getAllSchemas();
	}
	
	@Override
	public List<Schema> getCurrentSchemas() {
		
		List<Schema> schemas = new ArrayList<Schema>();
		
		// TODO
//		for(String resource: connection.getContext().getContextDescription().getResources()) {
//			schemas.add(getSchema(resource));
//		}
		
		return schemas;
	}
	
	@Override
	public Table getTable(String schema, String table) {
		
		return catalogMetaData.getTable(schema, table);
	}

	@Override
	public Table getTable(String tableName) {
		
		List<Schema> schemas = null;
		switch (getSearchStrategy()) {
		case ALL:
			schemas = getAllSchemas();
			break;
		case CURRENT:
			schemas = getCurrentSchemas();
			break;
		}

		for (Schema schema : schemas) {
			Table table = getTable(schema.getName(), tableName);
			if (table != null)
				return table;
		}

		return null;
	}

	@Override
	public ViewTable getView(String schema, String table) {
		
		return catalogMetaData.getView(schema, table);
	}

	@Override
	public ViewTable getView(String tableName) {

		List<Schema> schemas = null;
		switch (getSearchStrategy()) {
		case ALL:
			schemas = getAllSchemas();
			break;
		case CURRENT:
			schemas = getCurrentSchemas();
			break;
		}

		for (Schema schema : schemas) {
			ViewTable view = getView(schema.getName(), tableName);
			if (view != null)
				return view;
		}

		return null;
	}

	@Override
	public SearchStrategy getSearchStrategy() {
		return catalogMetaData.getSearchStrategy();
	}
}