/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.impl;

import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguagePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageExpressionImpl#getExpressionRow <em>Expression Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageExpressionImpl extends MinimalEObjectImpl.Container implements LanguageExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.LANGUAGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getExpressionRow() {
		return (Object)eGet(LanguagePackage.Literals.LANGUAGE_EXPRESSION__EXPRESSION_ROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionRow(Object newExpressionRow) {
		eSet(LanguagePackage.Literals.LANGUAGE_EXPRESSION__EXPRESSION_ROW, newExpressionRow);
	}

} //LanguageExpressionImpl
