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
package org.abchip.mimo.core.base.expr;

import org.abchip.mimo.expression.ArithmeticExpression;
import org.abchip.mimo.expression.ArithmeticOperator;
import org.abchip.mimo.expression.AssignmentExpression;
import org.abchip.mimo.expression.AtomicTermExpression;
import org.abchip.mimo.expression.BlockExpression;
import org.abchip.mimo.expression.BooleanExpression;
import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.FunctionTermExpression;
import org.abchip.mimo.expression.LogicalExpression;
import org.abchip.mimo.expression.PredicateExpression;
import org.abchip.mimo.expression.QualifiedTermExpression;
import org.abchip.mimo.expression.RelationalExpression;
import org.abchip.mimo.expression.impl.ExpressionVisitorImpl;


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
public class NeutralExpressionStringBuilder extends ExpressionVisitorImpl {
	
	protected StringBuffer result = new StringBuffer();

	public String getResult() {
		return result.toString();
	}

	public NeutralExpressionStringBuilder reset() {
		result = new StringBuffer();
		return this;
	}

	@Override
	public boolean visit(BooleanExpression expression) {
		expression.getOperand().accept(this);
		return false;
	}

	@Override
	public boolean visit(LogicalExpression expression) {

		switch (expression.getOperator()) {
		case AND:
			expression.getLeftOperand().accept(this);
			result.append(" LE(AND) ");
			break;
		case NOT:
			result.append(" LE(NOT) ");
			expression.getLeftOperand().accept(this);
			break;
		case OR:
			expression.getLeftOperand().accept(this);
			result.append(" LE(OR) ");
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(RelationalExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case EQUAL:
			result.append(" RE(EQ) ");
			break;
		case GREATER_THAN:
			result.append(" RE(GT) ");
			break;
		case GREATER_THAN_EQUAL:
			result.append(" RE(GTE) ");
			break;
		case LESS_THAN:
			result.append(" RE(LT) ");
			break;
		case LESS_THAN_EQUAL:
			result.append(" RE(LTE) ");
			break;
		case NOT_EQUAL:
			result.append(" RE(NE) ");
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(ArithmeticExpression expression) {

		if (expression.getOperator() == ArithmeticOperator.SIGN_MINUS) {
			result.append(" AE(SMINUS) ");
			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new RuntimeException("Unexpected condition: kdsf43g77q35n4v5");
		} else if (expression.getOperator() == ArithmeticOperator.SIGN_PLUS) {
			result.append(" AE(SPLUS) ");
			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new RuntimeException("Unexpected condition: kdsf43g77q35v5gt");
		} else {
			expression.getLeftOperand().accept(this);

			switch (expression.getOperator()) {

			case DIVIDE:
				result.append("AE(DIV)");
				break;
			case MINUS:
				result.append("AE(MINUS)");
				break;
			case MODULAR:
				result.append("AE(MOD)");
				break;
			case MULT:
				result.append("AE(MULT)");
				break;
			case PLUS:
				result.append("AE(PLUS)");
				break;
			case POWER:
				result.append("AE(POW)");
				break;
			case SIGN_MINUS:
			case SIGN_PLUS:
				throw new RuntimeException("Unexpected condition: mct8734034vn7q35n4v5");
			}

			if (expression.getRightOperand() != null)
				expression.getRightOperand().accept(this);
		}

		return false;

	}

	@Override
	public boolean visit(AssignmentExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case ASSIGN:
			result.append(" AS(ASS) ");
			break;
		case DIVIDE_ASSIGN:
			result.append(" AS(DIV) ");
			break;
		case MINUS_ASSIGN:
			result.append(" AS(MIN) ");
			break;
		case PLUS_ASSIGN:
			result.append(" AS(PLUS) ");
			break;
		case POWER_ASSIGN:
			result.append(" AS(POW) ");
			break;
		case TIMES_ASSIGN:
			result.append(" AS(TIM) ");
			break;
		default:
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;

	}

	@Override
	public boolean visit(AtomicTermExpression expression) {

		String term = null;
		
		switch (expression.getType()) {
		case STRING:
				term = "AT(STRING)";
			break;
		case BOOLEAN:
			term = "AT(BOOL)";
			break;
		case DATE:
			term = "AT(DATE)";
			break;
		case FLOATING:
			term = "AT(FLOAT)";
			break;
		case HEXADECIMAL:
			term = "AT(HEX)";
			break;
		case INDICATOR:
			term = "AT(INDICATOR)";
			break;
		case INTEGER:
			term = "AT(INT)";
			break;
		case NAME:
			term = "AT(NAME)";
			break;
		case SPECIAL:
			term = "AT(SPECIAL(" + expression.getValue() + "))";
			break;
		default:
			term = "AT(**)";
			break;
		}
		
		result.append(" " + term + " ");

		return false;
	}

	@Override
	public boolean visit(BlockExpression expression) {

		result.append(" BE[ ");
		expression.getExpression().accept(this);
		result.append(" ] ");

		return false;
	}

	@Override
	public boolean visit(FunctionTermExpression expression) {

		result.append(" FT(" + expression.getValue() + ")");

		result.append("[");
		boolean first = true;
		for (Expression child : expression.getElements()) {
			if (!first)
				result.append(" ");
			child.accept(this);
			first = false;
		}
		result.append("]");

		return false;
	}

	@Override
	public boolean visit(QualifiedTermExpression expression) {

		result.append("QT()");

		return false;
	}

	public void visit(PredicateExpression predicateExpression) {

		if (predicateExpression instanceof RelationalExpression)
			visit((RelationalExpression) predicateExpression);
		else if (predicateExpression instanceof LogicalExpression)
			visit((LogicalExpression) predicateExpression);
		else if (predicateExpression instanceof BooleanExpression)
			visit((BooleanExpression) predicateExpression);
	}

}