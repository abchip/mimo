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
package org.abchip.mimo.expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Expression Parser</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getExpressionParser()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExpressionParser {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	Expression parseExpression(String expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	ArithmeticExpression parseArithmetic(String expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	AssignmentExpression parseAssignment(String expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	PredicateExpression parsePredicate(String expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	TermExpression parseTerm(String expression);

} // ExpressionParser
