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

import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionPackage;
import org.abchip.mimo.expression.ExpressionType;
import org.abchip.mimo.expression.ExpressionVisitor;
import org.abchip.mimo.expression.QualifiedTermExpression;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Qualified Term Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class QualifiedTermExpressionImpl extends CompoundTermExpressionImpl implements QualifiedTermExpression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedTermExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.QUALIFIED_TERM_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void accept(ExpressionVisitor visitor) {

		if (visitor.visit(this))
			for (Expression child : getElements())
				child.accept(visitor);

		visitor.endVisit(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ExpressionType getExpressionType() {
		return ExpressionType.QUALIFIED;
	}

} // QualifiedTermExpressionImpl
