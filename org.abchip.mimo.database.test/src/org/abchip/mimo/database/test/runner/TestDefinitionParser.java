/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.abchip.mimo.database.definition.DefinitionParseResult;
import org.abchip.mimo.database.definition.DefinitionParser;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.base.BaseTestHelper;

@Test(entity = "DDL")
public class TestDefinitionParser {

	@Inject
	public transient TestAsserter testAsserter;

	@Inject
	private DefinitionParser definitionParser;

	@TestStarted
	public void main() throws SQLException, IOException {

		if(definitionParser == null)
			return;
		
		for (String sql : BaseTestHelper.readTextResource(this, "/resources/ddl.txt")) {

			DefinitionParseResult parseResult = null;
			try {
				parseResult = definitionParser.parseDefinition(sql);

			} catch (Exception e) {
				// e.printStackTrace();
			}
			testAsserter.assertNotNull("Test parser: " + sql, parseResult);
		}
	}
}