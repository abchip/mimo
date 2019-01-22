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
package org.abchip.mimo.database.mysql;

import org.abchip.mimo.database.base.BaseDefinitionWriterImpl;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;


public class MySQLDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	protected MySQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {
		return dropSchema(schema);
	}
	
	@Override
	public String createLabel(String name, SchemaDef schema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabel(Schema schema, String name, TableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabelForFields(Schema schema, String name,
			TableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hasLogicals(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String copyTableData(Table tableFrom, Table tableTo,
			boolean isCreateRelativeRecordNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String renameTable(Table table, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String renameIndex(Index index, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resetIdentity(Table table) {
		// TODO Auto-generated method stub
		return null;
	}
}