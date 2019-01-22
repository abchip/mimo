/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.LanguageExpression#getExpressionRow <em>Expression Row</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageExpression()
 * @model
 * @generated
 */
public interface LanguageExpression {

	/**
	 * Returns the value of the '<em><b>Expression Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Row</em>' attribute.
	 * @see #setExpressionRow(Object)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguageExpression_ExpressionRow()
	 * @model required="true"
	 * @generated
	 */
	Object getExpressionRow();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.LanguageExpression#getExpressionRow <em>Expression Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Row</em>' attribute.
	 * @see #getExpressionRow()
	 * @generated
	 */
	void setExpressionRow(Object value);
} // LanguageExpression
