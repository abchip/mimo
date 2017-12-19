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
package org.abchip.mimo.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = org.abchip.mimo.expression.impl.ExpressionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Array Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Expression</em>'.
	 * @generated
	 */
	ArrayExpression createArrayExpression();

	/**
	 * Returns a new object of class '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Expression</em>'.
	 * @generated
	 */
	AssignmentExpression createAssignmentExpression();

	/**
	 * Returns a new object of class '<em>Atomic Term Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Term Expression</em>'.
	 * @generated
	 */
	AtomicTermExpression createAtomicTermExpression();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Block Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Expression</em>'.
	 * @generated
	 */
	BlockExpression createBlockExpression();

	/**
	 * Returns a new object of class '<em>Function Term Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Term Expression</em>'.
	 * @generated
	 */
	FunctionTermExpression createFunctionTermExpression();

	/**
	 * Returns a new object of class '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression</em>'.
	 * @generated
	 */
	LogicalExpression createLogicalExpression();

	/**
	 * Returns a new object of class '<em>Qualified Term Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Term Expression</em>'.
	 * @generated
	 */
	QualifiedTermExpression createQualifiedTermExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
