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
package org.abchip.mimo.database.test.runner;

import java.sql.SQLException;

import javax.inject.Inject;

import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Connection")
public class TestDatabaseConnection {

	@Inject
	private Connection connection;
	@Inject
	public TestAsserter testAsserter;
	
	@TestStarted
	public void main() throws SQLException {		
		testAsserter.assertNotNull("Connection not null", connection);
	}
}