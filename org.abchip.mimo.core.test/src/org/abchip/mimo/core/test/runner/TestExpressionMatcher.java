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
package org.abchip.mimo.core.test.runner;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.ExpressionParserRegistry;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.base.BaseTestHelper;


@Test(entity = "Expression")
public class TestExpressionMatcher {

	@Inject
	private ExpressionParserRegistry expressionParserRegistry;

	@Inject
	public transient TestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		ExpressionParser expressionParser = expressionParserRegistry.lookup("MIMO");
		if(expressionParser == null)
			return;
		
		String input = null;
		String pattern = null;
		@SuppressWarnings("unused")
		Expression expression = null;
		StringTokenizer tokenizer = null;
				

		for (String line : BaseTestHelper.readTextResource(this, "/resources/neutral/expr_match.txt")) {
			
			tokenizer = new StringTokenizer(line, "##");
			input = tokenizer.nextToken();
			pattern = tokenizer.nextToken();
			boolean match = false;
			
			try {

				expression = expressionParser.parseExpression(input);
// TODO				
//				match = expression.match(pattern);
				testAsserter.assertTrue("Expression: " + input + "Pattern: " + pattern, match);
				
			} catch (Exception exc){
					testAsserter.fail("Failed: " + input + "Msg: " + exc.getMessage());
			}
		}
	}
}