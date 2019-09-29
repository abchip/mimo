/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.mysql;

import org.abchip.mimo.database.query.QueryWriter;
import org.abchip.mimo.database.query.impl.StatementWriterImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter;
import org.eclipse.datatools.modelbase.sql.query.util.SQLSourceWriter;

public class MySQLQueryWriterImpl extends StatementWriterImpl implements QueryWriter {
	private SQLSourceWriter querySourceWriter;

	public MySQLQueryWriterImpl() {
		super();
		this.querySourceWriter = new SQLQuerySourceWriter();
	}

	@Override
	public String writeQuery(QueryStatement query) {
		return querySourceWriter.getSQL(query);
	}
}