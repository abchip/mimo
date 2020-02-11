/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.query.StatementWriter#getNameHelper <em>Name Helper</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getStatementWriter()
 * @model abstract="true"
 * @generated
 */
public interface StatementWriter {
	/**
	 * Returns the value of the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Helper</em>' reference.
	 * @see #setNameHelper(NameHelper)
	 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getStatementWriter_NameHelper()
	 * @model
	 * @generated
	 */
	NameHelper getNameHelper();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.query.StatementWriter#getNameHelper <em>Name Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Helper</em>' reference.
	 * @see #getNameHelper()
	 * @generated
	 */
	void setNameHelper(NameHelper value);

} // StatementWriter
