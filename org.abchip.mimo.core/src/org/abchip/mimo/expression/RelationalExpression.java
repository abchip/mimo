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
 * <em><b>Relational Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.expression.RelationalExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.abchip.mimo.expression.RelationalExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.expression.RelationalExpression#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends PredicateExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.expression.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.abchip.mimo.expression.RelationalOperator
	 * @see #setOperator(RelationalOperator)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getRelationalExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	RelationalOperator getOperator();

	/**
	 * Sets the value of the '
	 * {@link org.abchip.mimo.expression.RelationalExpression#getOperator
	 * <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Operator</em>' attribute.
	 * @see org.abchip.mimo.expression.RelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(Expression)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getRelationalExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.expression.RelationalExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(Expression)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getRelationalExpression_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOperand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.expression.RelationalExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression value);

} // RelationalExpression
