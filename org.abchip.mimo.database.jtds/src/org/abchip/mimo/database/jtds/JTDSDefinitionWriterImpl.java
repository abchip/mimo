/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.jtds;

import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.data.StringDef;
import org.abchip.mimo.database.base.BaseDefinitionWriterImpl;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JTDSDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public JTDSDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String createTable(Schema schema, String name, TableDef table) {

		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (TableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			String columnName = getNameInSQLFormat(column);

			DataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataType()) {
			case IDENTITY:
				result.append(columnName + " INT PRIMARY KEY IDENTITY");
				break;
			case NUMERIC:
				NumericDef numericDef = (NumericDef) columnDef;
				switch (numericDef.getType()) {
				case BIG_DECIMAL:
					if (numericDef.getScale() != 0)
						result.append(columnName + " DECIMAL(" + numericDef.getPrecision() + ", " + numericDef.getScale() + ")");
					else
						result.append(columnName + " DECIMAL(" + numericDef.getPrecision() + ",  0)");
					break;
				case BYTE:
				case DOUBLE:
				case FLOAT:
				case INTEGER:
				case LONG:
				case SHORT:
					result.append(getNameInSQLFormat(column) + " " + columnDef.getDataType().getName().toUpperCase());
					break;
				}

				break;
			case STRING:
				StringDef stringDef = (StringDef) columnDef;
				if (stringDef.isVarying()) {
					if (stringDef.getLength() > 8000)
						result.append(columnName + " TEXT");
					else
						result.append(columnName + " VARCHAR(" + stringDef.getLength() + ")");
				} else
					result.append(columnName + " CHAR(" + stringDef.getLength() + ")");
				break;
			case BINARY:
			case BOOLEAN:
			case DATE_TIME:
			case ENUM:
			case OBJECT:
			case ENTITY:
				result.append(getNameInSQLFormat(column) + " " + columnDef.getDataType().getName().toUpperCase());
				break;
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
	public String createLabelForFields(Schema schema, String name, TableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hasLogicals(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String copyTableData(Table tableFrom, Table tableTo, boolean isCreateRelativeRecordNumber) {
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
