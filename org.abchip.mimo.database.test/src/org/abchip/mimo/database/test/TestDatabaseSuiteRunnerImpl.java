/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 */
package org.abchip.mimo.database.test;

import java.sql.SQLException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.ConnectionManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;


@Test(category = "Database")
public class TestDatabaseSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	private Connection connection;

	public TestDatabaseSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category);
	}

	@TestStarted
	private void init() throws SQLException {

		ConnectionManager connectionManager = getContext().get(ConnectionManager.class);
		Connection connection = connectionManager.createConnection(getContext());

		getContext().set(Connection.class, connection);
	}

	@TestStopped
	private void close() throws SQLException {
		
		if (connection == null)
			return;

		connection.close();
	}
}