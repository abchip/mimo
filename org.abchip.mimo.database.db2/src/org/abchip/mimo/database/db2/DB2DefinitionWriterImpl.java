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
package org.abchip.mimo.database.db2;

import org.abchip.mimo.database.DatabaseManager;
import org.abchip.mimo.database.base.BaseDefinitionWriterImpl;
import org.abchip.mimo.database.definition.IndexColumnDef;
import org.abchip.mimo.database.definition.IndexDef;
import org.abchip.mimo.database.definition.OrderingType;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.DataDef;
import org.abchip.mimo.util.DecimalDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;

public class DB2DefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public DB2DefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String dropSchema(Schema schema) {
		return dropSchema(schema, false);
	}

	@Override
	public String createTable(Schema schema, String name, TableDef table) {

		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		String pkey_name = null;

		boolean first = true;
		for (TableColumnDef column : table.getColumns()) {
			if (!first)
				result.append(", ");
			else
				first = false;

			DataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataDefType()) {

			case IDENTITY:
				result.append(getNameInSQLFormat(column) + " INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");
				pkey_name = getNameInSQLFormat(column);
				break;
			case CHARACTER:
				CharacterDef characterDef = (CharacterDef) columnDef;
				if (characterDef.isVarying())
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + characterDef.getLength() + ") DEFAULT '' NOT NULL");
				else if (characterDef.getLength() <= 254)
					result.append(getNameInSQLFormat(column) + " CHAR(" + characterDef.getLength() + ") DEFAULT '' NOT NULL");
				else
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + characterDef.getLength() + ") DEFAULT '' NOT NULL");
				break;
			case DECIMAL:
				DecimalDef decimalDef = (DecimalDef) columnDef;
				if (decimalDef.getPrecision() > 31)
					result.append(getNameInSQLFormat(column) + " DECFLOAT(34) DEFAULT 0 NOT NULL");
				else if (decimalDef.getScale() != 0)
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getPrecision() + ", " + decimalDef.getScale() + ") DEFAULT 0 NOT NULL");
				else
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getPrecision() + ", 0) DEFAULT 0 NOT NULL");
				break;
			case DATETIME:
				result.append(getNameInSQLFormat(column) + " TIMESTAMP NOT NULL");
				break;
			case BINARY:
				result.append(getNameInSQLFormat(column) + " SMALLINT");
				break;
			default:
				result.append(getNameInSQLFormat(column) + " " + columnDef.getDataDefType().getName().toUpperCase());
			}
		}
		if (pkey_name != null)
			result.append(", PRIMARY KEY (" + pkey_name + ")");
		result.append(")");
		return result.toString();
	}

	@Override
	public String truncateTable(Table table) {
		return "TRUNCATE TABLE " + getQualifiedNameInSQLFormat(table) + " IGNORE DELETE TRIGGERS" + " DROP STORAGE" + " IMMEDIATE";
	}

	public String createIndex(Table table, String indexName, IndexDef index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if (index.isUnique())
			result.append("UNIQUE ");

		result.append("INDEX " + getQualifiedNameInSQLFormat(asTable(table.getSchema().getName(), indexName)));
		result.append(" ON " + getQualifiedNameInSQLFormat(table) + " (");

		boolean first = true;

		for (IndexColumnDef column : index.getColumns()) {

			if (!first)
				result.append(", ");

			result.append(getNameInSQLFormat(column));

			if (column.getOrdering() == OrderingType.DESCEND)
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}

	// TODO ?!?
	private Table asTable(final String schemaName, final String indexName) {
		return new TableImpl() {
			public Schema getSchema() {
				return new SchemaImpl() {
					public String getName() {
						return schemaName;
					}
				};
			}

			public String getName() {
				return indexName;
			}
		};
	}

	@Override
	public String dropIndex(Index index) {
		return "DROP INDEX " + getQualifiedNameInSQLFormat(asTable(index.getSchema().getName(), index.getName()));
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {

		if (!ignoreFailOnNonEmpty)
			return "DROP SCHEMA " + getNameInSQLFormat(schema) + " RESTRICT";
		else {
			String sql = "begin " + "  declare l_errschema varchar(128) default 'ERRORSCHEMA';" + "  declare l_errtab varchar(128) default '" + schema.getName() + "';"
					+ "  CALL SYSPROC.ADMIN_DROP_SCHEMA('" + schema.getName() + "', NULL, l_errschema, l_errtab);" + " end";

			return sql;
		}
	}

	private String quoted(String s) {
		return "'" + s.replace("'", "''") + "'";
	}

	@Override
	public String createLabel(String name, SchemaDef schema) {
		String label = schema.getLabel();
		if (label != null && label.trim() != "")
			return "COMMENT ON SCHEMA  " + name + " IS " + quoted(label);
		else
			return null;
	}

	@Override
	public String createLabel(Schema schema, String name, TableDef table) {
		String label = schema.getLabel();
		if (label != null && label.trim() != "") {
			return "COMMENT ON TABLE " + getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " IS " + quoted(label);
		} else {
			return null;
		}
	}

	@Override
	public String createLabelForFields(Schema schema, String name, TableDef table) {
		StringBuffer result = new StringBuffer();
		for (TableColumnDef column : table.getColumns()) {
			String label = column.getLabel();
			if (label != null && label.trim() != "") {
				if (result.length() > 0)
					result.append(", ");
				result.append(getNameInSQLFormat(column)).append(" IS ").append(quoted(label));
			}
		}

		if (result.length() > 0) {
			return "COMMENT ON " + getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + "(" + result.toString() + ")";
		} else {
			return null;
		}
	}

	@Override
	public String hasLogicals(Table table) {
		return "SELECT * FROM SYSCAT.TABDEP WHERE BSCHEMA = '" + table.getSchema().getName().trim() + "' AND BNAME = '" + table.getName().trim() + "'";
	}

	@Override
	public String copyTableData(Table tableFrom, Table tableTo, boolean isCreateRelativeRecordNumber) {
		String fields = fields(tableTo, isCreateRelativeRecordNumber);

		return "INSERT INTO " + getQualifiedNameInSQLFormat(tableTo) + "(" + fields + ")" + " SELECT " + fields + " FROM " + getQualifiedNameInSQLFormat(tableFrom);
	}

	@SuppressWarnings("unchecked")
	private String fields(Table tableTo, boolean isCreateRelativeRecordNumber) {
		int columnsSize = 0;
		EList<ENamedElement> columns = tableTo.getColumns();
		if (isCreateRelativeRecordNumber)
			columnsSize = columns.size() - 2;
		else
			columnsSize = columns.size() - 1;

		String fields = "";
		for (int i = 0; i <= columnsSize; i++) {
			fields += columns.get(i).getName();
			if (i != columnsSize) {
				fields += ", ";
			}
		}
		return fields;
	}

	@Override
	public String renameTable(Table table, String newName) {
		return "RENAME TABLE " + getQualifiedNameInSQLFormat(table) + " TO " + getNameInSQLFormat(newName);
	}

	@Override
	public String renameIndex(Index index, String newName) {
		return "RENAME INDEX " + getQualifiedNameInSQLFormat(asTable(index.getSchema().getName(), index.getName())) + " TO " + getNameInSQLFormat(newName);
	}

	@Override
	public String resetIdentity(Table table) {
		return "ALTER TABLE " + getQualifiedNameInSQLFormat(table) + " ALTER COLUMN " + DatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME + " RESTART WITH 1";
	}
}