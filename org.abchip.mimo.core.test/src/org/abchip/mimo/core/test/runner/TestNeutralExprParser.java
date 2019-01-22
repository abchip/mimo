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
package org.abchip.mimo.core.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.ExpressionParserRegistry;
import org.abchip.mimo.expression.ExpressionWriter;
import org.abchip.mimo.expression.ExpressionWriterRegistry;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.base.BaseTestHelper;

@Test(category = "Expression")
public class TestNeutralExprParser {

	@Inject
	private ExpressionParserRegistry expressionParserRegistry;
	
	@Inject
	private ExpressionWriterRegistry expressionWriterRegistry;

	@Inject
	public transient TestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		ExpressionParser expressionParser = expressionParserRegistry.lookup("MIMO");
		if(expressionParser == null)
			return;
		
		ExpressionWriter rpgExpressionWriter = expressionWriterRegistry.lookup("MIMO");
		ExpressionWriter normalizedExpressionWriter = expressionWriterRegistry.lookup("MIMO");
		
		String preparedExpr = null;

		for (String expression : BaseTestHelper.readTextResource(this, "/resources/rpg/expressions.txt")) {
			try{
				
				//Normalize expression for test input
				preparedExpr = rpgExpressionWriter.writeExpression(expressionParser.parseExpression(expression));
				
				// Build normalized expr
				normalizedExpressionWriter.writeExpression(expressionParser.parseExpression(preparedExpr));
								
			} catch(Exception exc) {
				testAsserter.fail("In: \"" + expression + "\" Norm: \"" + preparedExpr + "\" Error: \"" +exc.getMessage() + "\"");
			}
		}
	}
}