/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.abchip.mimo.core.base.expr.filter;

import org.abchip.mimo.core.base.expr.antlr.AntLRExpressionBuilder;
import org.abchip.mimo.expression.ArithmeticExpression;
import org.abchip.mimo.expression.AssignmentExpression;
import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.PredicateExpression;
import org.abchip.mimo.expression.TermExpression;

public class FilterExpressionParserImpl implements ExpressionParser {

	private AntLRExpressionBuilder expressionBuilder;

	public FilterExpressionParserImpl() {
		expressionBuilder = new AntLRExpressionBuilder(new FilterExpressionHelper());
	}

	@Override
	public AssignmentExpression parseAssignment(String expression) {
		return expressionBuilder.buildAsAssignment(expression);
	}

	@Override
	public PredicateExpression parsePredicate(String expression) {
		return expressionBuilder.buildAsPredicate(expression);
	}

	@Override
	public ArithmeticExpression parseArithmetic(String expression) {
		return expressionBuilder.buildAsArithmetic(expression);
	}

	@Override
	public TermExpression parseTerm(String expression) {
		return expressionBuilder.buildAsTerm(expression);
	}

	@Override
	public Expression parseExpression(String expression) {
		return expressionBuilder.buildAsExpression(expression);
	}
}