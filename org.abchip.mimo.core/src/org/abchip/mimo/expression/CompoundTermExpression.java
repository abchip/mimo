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

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Compound Term Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.expression.CompoundTermExpression#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getCompoundTermExpression()
 * @model abstract="true"
 * @generated
 */
public interface CompoundTermExpression extends TermExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.abchip.mimo.expression.ExpressionPackage#getCompoundTermExpression_Elements()
	 * @model containment="true"
	 * @generated
	 */
	List<Expression> getElements();

} // CompoundTermExpression
