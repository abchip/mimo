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
import org.abchip.mimo.expression.ArrayExpression;
import org.abchip.mimo.expression.AssignmentExpression;
import org.abchip.mimo.expression.AssignmentOperator;
import org.abchip.mimo.expression.AtomicTermExpression;
import org.abchip.mimo.expression.BlockExpression;
import org.abchip.mimo.expression.BooleanExpression;
import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionFactory;
import org.abchip.mimo.expression.ExpressionType;
import org.abchip.mimo.expression.FunctionTermExpression;
import org.abchip.mimo.expression.LogicalExpression;
import org.abchip.mimo.expression.PredicateExpression;
import org.abchip.mimo.expression.QualifiedTermExpression;
import org.abchip.mimo.expression.RelationalExpression;
import org.abchip.mimo.expression.TermExpression;
import org.antlr.runtime.tree.Tree;

public class BaseExpressionBuilder {

	private BaseExpressionHelper expressionHelper;

	private static final String[] ASS_STR_OP = { "**=", "*=", "+=", "-=", "/=", "=" };
	private static final AssignmentOperator[] ASS_OP = { AssignmentOperator.POWER_ASSIGN, AssignmentOperator.TIMES_ASSIGN, AssignmentOperator.PLUS_ASSIGN, AssignmentOperator.MINUS_ASSIGN,
			AssignmentOperator.DIVIDE_ASSIGN, AssignmentOperator.ASSIGN };

	public BaseExpressionBuilder(BaseExpressionHelper expressionHelper) {
		this.expressionHelper = expressionHelper;
	}

	public Expression buildAsExpression(String expression) {

		Expression Expression = null;

		Tree tree = this.expressionHelper.parse(expression);
		switch (this.expressionHelper.getExpressionType(tree)) {
		case ARITHMETIC:
			return Expression = buildAsArithmetic(tree);
		case ASSIGNMENT:
			return Expression = buildAsAssignment(expression);
		case ATOMIC:
		case QUALIFIED:
		case FUNCTION:
			return Expression = buildAsTerm(tree);
		case BLOCK:
			return Expression = buildAsBlock(tree);
		case ARRAY:
			return Expression = buildAsArray(tree);			
		case BOOLEAN:
		case LOGICAL:
		case RELATIONAL:
			return Expression = buildAsPredicate(tree);
		}

		return Expression;
	}

	public AssignmentExpression buildAsAssignment(String expression) {

		AssignmentExpression ast = ExpressionFactory.eINSTANCE.createAssignmentExpression();

		String leftString = null;
		String rightString = null;

		// Find the leftmost assignment operator position in expression
		
		boolean found = false;
		int position = -1;
		int operator = -1;
		for (int i = 0; i < ASS_STR_OP.length; i++) {
			int p = expression.indexOf(ASS_STR_OP[i]);

			if (p > 0 ) {
				
				if (position < 0) {
					position = p;
					operator = i;					
					
				} else {
					if (p<position) {
						position=p;						
					}
				}
				found = true;
			}
		}

		if (found) {
			leftString = expression.substring(0, position);
			rightString = expression.substring(position + ASS_STR_OP[operator].length());			
			ast.setOperator(ASS_OP[operator]);
		} else{
			throw new RuntimeException("Attempted to analyze as assignment an incompatible expression");
		}

		// TODO remove and change parser
		// if (leftString.startsWith("&"))
		// leftString = removeFirstChar(leftString);

		// left side
		TermExpression leftExpression = buildAsTerm(leftString);
		ast.setLeftOperand(leftExpression);

		// TODO remove and change parser
		// if (rightString.startsWith("&"))
		// rightString = removeFirstChar(rightString);
		
		Tree rightAntAst = expressionHelper.parse(rightString);
		ExpressionType rightExpType = expressionHelper.getExpressionType(rightAntAst);

		if (rightExpType == null)
			throw new RuntimeException("Invalid assignment expression: " + expression);

		Expression rightExpression = null;

		// right side
		switch (rightExpType) {
		case ARRAY:		
		case ASSIGNMENT:
			throw new RuntimeException("Invalid assignment expression: " + expression);
		case ARITHMETIC:
			rightExpression = buildAsArithmetic(rightAntAst);
			break;
		case ATOMIC:
		case QUALIFIED:
		case FUNCTION:
			rightExpression = buildAsTerm(rightAntAst);
			break;
		case BLOCK:
			rightExpression = buildAsBlock(rightAntAst);
			break;
		case LOGICAL:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		case RELATIONAL:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		case BOOLEAN:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		}

		ast.setRightOperand(rightExpression);
		
		return ast;
	}

	public PredicateExpression buildAsPredicate(String expression) throws RuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		PredicateExpression predicateExpression = buildAsPredicate(antAst);
		
		return predicateExpression;
	}

	private PredicateExpression buildAsPredicate(Tree node) throws RuntimeException {

		switch (expressionHelper.getExpressionType(node)) {
		case ARRAY:		
		case ARITHMETIC:
		case ASSIGNMENT:
			throw new RuntimeException("Attempted to analyze as predicate an incompatible expression: " + node);
		case BLOCK:
			return buildAsPredicate(node.getChild(0));
		case ATOMIC:
			TermExpression termExpression = (TermExpression) buildChildExpression(node);
			BooleanExpression booleanExpression = ExpressionFactory.eINSTANCE.createBooleanExpression();
			booleanExpression.setOperand(termExpression);

			return booleanExpression;
		case QUALIFIED:
		case FUNCTION:
			termExpression = (TermExpression) buildChildExpression(node);
			booleanExpression = ExpressionFactory.eINSTANCE.createBooleanExpression();
			booleanExpression.setOperand(termExpression);			
			
			return booleanExpression;
		case LOGICAL:
			return (PredicateExpression) buildChildExpression(node);
		case RELATIONAL:
			return (PredicateExpression) buildChildExpression(node);
		case BOOLEAN:
			return (PredicateExpression) buildChildExpression(node);
		}

		throw new RuntimeException("Attempted to analyze as predicate an incompatible expression: " + node);
	}

	public ArithmeticExpression buildAsArithmetic(String expression) throws RuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		return buildAsArithmetic(antAst);
	}

	public ArithmeticExpression buildAsArithmetic(Tree node) {

		switch (expressionHelper.getExpressionType(node)) {
		case ARRAY:		
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
		case ASSIGNMENT:
		case ATOMIC:
		case QUALIFIED:
		case FUNCTION:
			throw new RuntimeException("Attempted to analyze as arithmetic an incompatible expression: " + node);

		case ARITHMETIC:
			return (ArithmeticExpression) buildChildExpression(node);
		case BLOCK:
			return (ArithmeticExpression) buildAsBlock(node.getChild(0));
		}

		return null;
	}

	public ArrayExpression buildAsArray(Tree node) {

		switch (expressionHelper.getExpressionType(node)) {
		case BLOCK:
		case ARITHMETIC:
		case ASSIGNMENT:
		case ATOMIC:
		case FUNCTION:
		case QUALIFIED:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			throw new RuntimeException("Invalid block expression: " + node);
		case ARRAY:
			return (ArrayExpression) buildChildExpression(node);
		}

		throw new RuntimeException("Attempted to analyze as block an incompatible expression: " + node);
	}

	public BlockExpression buildAsBlock(Tree node) {

		switch (expressionHelper.getExpressionType(node)) {
		case ARRAY:
		case ARITHMETIC:
		case ASSIGNMENT:
		case ATOMIC:
		case FUNCTION:
		case QUALIFIED:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			throw new RuntimeException("Invalid block expression: " + node);
		case BLOCK:
			return (BlockExpression) buildChildExpression(node);
		}

		throw new RuntimeException("Attempted to analyze as block an incompatible expression: " + node);
	}

	public TermExpression buildAsTerm(String expression) throws RuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		TermExpression ast = buildAsTerm(antAst);

		return ast;
	}

	private TermExpression buildAsTerm(Tree node) throws RuntimeException {

		switch (expressionHelper.getExpressionType(node)) {
		case ARRAY:		
		case ARITHMETIC:
		case ASSIGNMENT:
		case LOGICAL:
		case RELATIONAL:
		case BLOCK:
			throw new RuntimeException("Attempted to analyze as term an incompatible expression: " + node);

		case ATOMIC:
			return (TermExpression) buildChildExpression(node);
		case FUNCTION:
		case QUALIFIED:
			return (TermExpression) buildChildExpression(node);
		case BOOLEAN:

			TermExpression booleanExpression = ExpressionFactory.eINSTANCE.createAtomicTermExpression();
			booleanExpression.setValue(node.getText());
			
			return booleanExpression;

		}

		throw new RuntimeException("Invalid term expression: " + node);
	}

	public Expression buildChildExpression(Tree node) {

		Expression expression = null;

		ExpressionType expressionType = expressionHelper.getExpressionType(node);
		switch (expressionType) {
		case ARITHMETIC:
			ArithmeticExpression arithmeticExpression = ExpressionFactory.eINSTANCE.createArithmeticExpression();

			if (node.getChild(0) != null)
				arithmeticExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			arithmeticExpression.setOperator(expressionHelper.getArithmeticOperator(node));
			if (node.getChild(1) != null)
				arithmeticExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = arithmeticExpression;
			break;

		case ATOMIC:
			AtomicTermExpression atomicTermExpression = ExpressionFactory.eINSTANCE.createAtomicTermExpression();

			atomicTermExpression.setType(expressionHelper.getTermType(node));
			String text = expressionHelper.normalizeText(node.getText());
			atomicTermExpression.setValue(text);

			expression = atomicTermExpression;
			break;
		case ARRAY:
			ArrayExpression arrayExpression = ExpressionFactory.eINSTANCE.createArrayExpression();

			for(int i=0; i<node.getChildCount(); i++) 
				arrayExpression.getExpression().add(buildChildExpression(node.getChild(i)));

			expression = arrayExpression;
			break;			
		case BLOCK:
			BlockExpression blockExpression = ExpressionFactory.eINSTANCE.createBlockExpression();

			if (node.getChildCount() > 0)
				blockExpression.setExpression(buildChildExpression(node.getChild(0)));

			expression = blockExpression;
			break;
		case QUALIFIED:
			QualifiedTermExpression qualifiedTermExpression = ExpressionFactory.eINSTANCE.createQualifiedTermExpression();

			qualifiedTermExpression.setValue(expressionHelper.getFunctionName(node));

			for (int i = 0; i < node.getChildCount(); i++)
				qualifiedTermExpression.getElements().add(buildChildExpression(node.getChild(i)));

			expression = qualifiedTermExpression;
			break;
		case FUNCTION:
			FunctionTermExpression functionTermExpression = ExpressionFactory.eINSTANCE.createFunctionTermExpression();

			functionTermExpression.setValue(expressionHelper.getFunctionName(node));

			for (int i = 0; i < node.getChildCount(); i++)
				functionTermExpression.getElements().add(buildChildExpression(node.getChild(i)));

			expression = functionTermExpression;
			break;

		case LOGICAL:
			LogicalExpression logicalExpression = ExpressionFactory.eINSTANCE.createLogicalExpression();

			if (node.getChild(0) != null)
				logicalExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			logicalExpression.setOperator(expressionHelper.getLogicalOperator(node));
			if (node.getChild(1) != null)
				logicalExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = logicalExpression;
			break;
		case RELATIONAL:
			RelationalExpression relationalExpression = ExpressionFactory.eINSTANCE.createRelationalExpression();

			if (node.getChild(0) != null)
				relationalExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			relationalExpression.setOperator(expressionHelper.getRelationalOperator(node));
			if (node.getChild(1) != null)
				relationalExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = relationalExpression;
			break;
		case BOOLEAN:
			BooleanExpression booleanExpression = ExpressionFactory.eINSTANCE.createBooleanExpression();
			if (node.getChild(0) != null)
				booleanExpression.setOperand(buildChildExpression(node.getChild(0)));
			else
				throw new RuntimeException("Invalid AST node: " + node);
		case ASSIGNMENT:
			throw new RuntimeException("Invalid AST node: " + node);
		}
		
		return expression;
	}

	public static String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}
}