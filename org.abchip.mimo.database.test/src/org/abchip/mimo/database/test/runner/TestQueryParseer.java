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

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.abchip.mimo.database.query.QueryParser;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.base.BaseTestHelper;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

@Test(entity = "DML")
public class TestQueryParseer {

	@Inject
	public transient TestAsserter testAsserter;

	@Inject
	private QueryParser queryParser;

	@TestStarted
	public void main() throws SQLException, IOException {

		if(queryParser == null)
			return;
		
		for (String sql : BaseTestHelper.readTextResource(this, "/resources/dml.txt")) {
			SQLQueryParseResult parseResult = null;
			try {
				parseResult = queryParser.parseQuery(sql);

			} catch (Exception e) {
				// e.printStackTrace();
			}
			testAsserter.assertNotNull("Test parser: " + sql, parseResult);
		}
	}
}