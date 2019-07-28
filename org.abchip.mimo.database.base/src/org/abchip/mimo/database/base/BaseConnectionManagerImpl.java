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

import java.sql.SQLException;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.database.DatabaseManager;
import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.ConnectionManager;

public class BaseConnectionManagerImpl implements ConnectionManager {

	private static int connectionID = 0;

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private DatabaseManager databaseManager;

	@Override
	public Connection createConnection(Context context) throws SQLException {
		return createConnection(context, null, null, null);
	}

	@Override
	public Connection createConnection(String catalog) throws SQLException {
		return createConnection(catalog, null, null);
	}

	@Override
	public Connection createConnection(String user, String password) throws SQLException {
		return createConnection(null, user, password);
	}

	@Override
	public Connection createConnection(String catalog, String user, String password) throws SQLException {

		return createConnection(null, catalog, user, password);
	}

	private Connection createConnection(Context context, String catalog, String user, String password) throws SQLException {

		if (!(databaseManager instanceof BaseDatabaseManagerImpl))
			return null;

		BaseDatabaseManagerImpl baseDatabaseManagerImpl = (BaseDatabaseManagerImpl) databaseManager;

/*		String connectionID = nextConnectionID(baseDatabaseManagerImpl);

		CatalogContainer catalogContainer = baseDatabaseManagerImpl.getCatalogContainer(catalog);

		Context contextChild = null;

		if (context != null)
			contextChild = context.createChildContext(connectionID);
		else
			contextChild = catalogContainer.getCatalogContext().createChildContext(connectionID);*/

		Connection connection = new BaseConnectionImpl(baseDatabaseManagerImpl.getDatabaseContainer(), context);
		connection.setCatalog(catalog);

		return connection;
	}

	protected synchronized String nextConnectionID(BaseDatabaseManagerImpl baseDatabaseManagerImpl) {

		connectionID++;
		String stringID = contextRoot.getContextDescription().getId() + "/" + connectionID;

		return stringID;
	}
}