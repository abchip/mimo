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

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Entity {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(ExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // Expression
