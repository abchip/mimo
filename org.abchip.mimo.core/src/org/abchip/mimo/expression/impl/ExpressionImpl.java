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
package org.abchip.mimo.expression.impl;

import org.abchip.mimo.context.UnexpectedConditionException;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.expression.ArithmeticExpression;
import org.abchip.mimo.expression.ArithmeticOperator;
import org.abchip.mimo.expression.AssignmentExpression;
import org.abchip.mimo.expression.AtomicTermExpression;
import org.abchip.mimo.expression.BlockExpression;
import org.abchip.mimo.expression.BooleanExpression;
import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionPackage;
import org.abchip.mimo.expression.ExpressionType;
import org.abchip.mimo.expression.ExpressionVisitor;
import org.abchip.mimo.expression.FunctionTermExpression;
import org.abchip.mimo.expression.LogicalExpression;
import org.abchip.mimo.expression.QualifiedTermExpression;
import org.abchip.mimo.expression.RelationalExpression;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends EntityImpl implements Expression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(ExpressionVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ExpressionType getExpressionType();


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		
		ToStringExpression expressionStringBuilderImpl =  new ToStringExpression();
		accept(expressionStringBuilderImpl);

		return expressionStringBuilderImpl.getResult();
	}
		
	private class ToStringExpression extends ExpressionVisitorImpl {

		protected StringBuffer result = new StringBuffer();

		public String getResult() {
			return result.toString();
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
				result.append(" and ");
				break;
			case NOT:
				result.append(" not ");
				expression.getLeftOperand().accept(this);
				break;
			case OR:
				expression.getLeftOperand().accept(this);
				result.append(" or ");
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
				result.append(" = ");
				break;
			case GREATER_THAN:
				result.append(" > ");
				break;
			case GREATER_THAN_EQUAL:
				result.append(" >= ");
				break;
			case LESS_THAN:
				result.append(" < ");
				break;
			case LESS_THAN_EQUAL:
				result.append(" <= ");
				break;
			case NOT_EQUAL:
				result.append(" <> ");
				break;
			}

			if (expression.getRightOperand() != null)
				expression.getRightOperand().accept(this);

			return false;
		}

		@Override
		public boolean visit(ArithmeticExpression expression) {

			if (expression.getOperator() == ArithmeticOperator.SIGN_MINUS) {
				result.append("-");
				expression.getLeftOperand().accept(this);
				if (expression.getRightOperand() != null)
					throw new UnexpectedConditionException("kdsf43g77q35n4v5");
			} else if (expression.getOperator() == ArithmeticOperator.SIGN_PLUS) {
				result.append("+");
				expression.getLeftOperand().accept(this);
				if (expression.getRightOperand() != null)
					throw new UnexpectedConditionException("kdsf43g77q35v5gt");
			} else {
				expression.getLeftOperand().accept(this);

				switch (expression.getOperator()) {

				case DIVIDE:
					result.append("/");
					break;
				case MINUS:
					result.append("-");
					break;
				case MODULAR:
					result.append("%");
					break;
				case MULT:
					result.append("*");
					break;
				case PLUS:
					result.append("+");
					break;
				case POWER:
					result.append("**");
					break;
				case SIGN_MINUS:
				case SIGN_PLUS:
					throw new UnexpectedConditionException("mct8734034vn7q35n4v5");
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
				result.append(" = ");
				break;
			case DIVIDE_ASSIGN:
				result.append(" /= ");
				break;
			case MINUS_ASSIGN:
				result.append(" -= ");
				break;
			case PLUS_ASSIGN:
				result.append(" += ");
				break;
			case POWER_ASSIGN:
				result.append(" **= ");
				break;
			case TIMES_ASSIGN:
				result.append(" *= ");
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

			switch (expression.getType()) {
			case STRING:
				String value = expression.getValue().replaceAll("\"", "\"\"");
				result.append("\"" + value + "\"");
				break;
			case BOOLEAN:
			case DATE:
			case FLOATING:
			case INTEGER:
			case NAME:
			case TIME:
			case TIMESTAMP:
				result.append(expression.getValue());			
				break;
			}

			return false;
		}

		@Override
		public boolean visit(BlockExpression expression) {

			result.append("(");
			expression.getExpression().accept(this);
			result.append(")");

			return false;
		}

		@Override
		public boolean visit(FunctionTermExpression expression) {

			result.append(expression.getValue());

			result.append("(");
			boolean first = true;
			for (Expression child : expression.getElements()) {
				if (!first)
					result.append(": ");
				child.accept(this);
				first = false;
			}
			result.append(")");
			
			return false;
		}

		@Override
		public boolean visit(QualifiedTermExpression expression) {

			result.append(" " + expression.getValue());

			if (!result.toString().contains("."))
				for (Expression child : expression.getElements()) {
					result.append(".");
					child.accept(this);
				}

			return false;
		}
	}
} // ExpressionImpl
