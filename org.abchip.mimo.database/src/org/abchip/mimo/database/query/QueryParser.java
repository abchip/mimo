/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.query;

import java.io.InputStream;

import java.sql.SQLException;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getQueryParser()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QueryParser extends StatementParser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.database.query.SQLQueryParseResult" exceptions="org.abchip.mimo.database.DatabaseException" streamDataType="org.abchip.mimo.java.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	SQLQueryParseResult parseQuery(InputStream stream) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.database.query.SQLQueryParseResult" exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	SQLQueryParseResult parseQuery(String sql) throws SQLException;

} // QueryParser
