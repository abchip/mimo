/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.query;

import java.sql.SQLException;

import org.abchip.mimo.database.connection.Connection;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getAliasResolver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AliasResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" connectionRequired="true" queryDataType="org.abchip.mimo.database.query.SQLQueryParseResult" queryRequired="true"
	 * @generated
	 */
	void resolveQuery(Connection connection, SQLQueryParseResult query) throws SQLException;

} // AliasResolver
