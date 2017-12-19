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
package org.abchip.mimo.database.jtds;

import org.abchip.mimo.database.base.BaseDefinitionWriterImpl;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.DataDef;
import org.abchip.mimo.util.DecimalDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JTDSDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public JTDSDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String createTable(Schema schema, String name,  TableDef table) {
		
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (TableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			String columnName = getNameInSQLFormat(column);

			DataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataDefType()) {

			case IDENTITY:
				result.append(columnName + " INT PRIMARY KEY IDENTITY");
				break;
			case CHARACTER:
				CharacterDef characterDef = (CharacterDef)columnDef;
				if(characterDef.isVarying()) {
					if (characterDef.getLength() > 8000)
						result.append(columnName + " TEXT");
					else
						result.append(columnName + " VARCHAR(" + characterDef.getLength() + ")");
				}
				else
					result.append(columnName + " CHAR(" + characterDef.getLength() + ")");					

				break;
			case DECIMAL:
				DecimalDef decimalDef = (DecimalDef)columnDef;
				if (decimalDef.getScale() != 0)
					result.append(columnName + " DECIMAL(" + decimalDef.getPrecision() + ", " + decimalDef.getScale() + ")");
				else
					result.append(columnName + " DECIMAL(" + decimalDef.getPrecision() + ",  0)");
				break;
			default:
				result.append(columnName + " " + columnDef.getDataDefType().getName().toUpperCase());
			}
			first = false;
		}
		result.append(")");
		return result.toString();
	}
	
	@Override
	public String deleteData(Table table) {
		return "TRUNCATE TABLE " + getQualifiedNameInSQLFormat(table);
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
	public String copyTableData(Table tableFrom, Table tableTo,	boolean isCreateRelativeRecordNumber) {
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
