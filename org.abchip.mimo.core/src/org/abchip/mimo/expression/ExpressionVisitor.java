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
 * <em><b>Expression Visitor</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getExpressionVisitor()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionVisitor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(AssignmentExpression expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(ArrayExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(AtomicTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(BlockExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(BooleanExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(FunctionTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QualifiedTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(AssignmentExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(AtomicTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(BlockExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(BooleanExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(LogicalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(RelationalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(LogicalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QualifiedTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(FunctionTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(RelationalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(ArithmeticExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(ArithmeticExpression expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(ArrayExpression expression);

} // ExpressionVisitor
