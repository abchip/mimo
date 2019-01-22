/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assignment Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.expression.AssignmentExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.abchip.mimo.expression.AssignmentExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.expression.AssignmentExpression#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.expression.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.abchip.mimo.expression.AssignmentOperator
	 * @see #setOperator(AssignmentOperator)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getAssignmentExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	AssignmentOperator getOperator();

	/**
	 * Sets the value of the '
	 * {@link org.abchip.mimo.expression.AssignmentExpression#getOperator
	 * <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Operator</em>' attribute.
	 * @see org.abchip.mimo.expression.AssignmentOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(TermExpression)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getAssignmentExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TermExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.expression.AssignmentExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(TermExpression value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(Expression)
	 * @see org.abchip.mimo.expression.ExpressionPackage#getAssignmentExpression_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOperand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.expression.AssignmentExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression value);

} // AssignmentExpression
