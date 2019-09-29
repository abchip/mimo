/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parse Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.DefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.DefinitionParseResult#getErrorList <em>Error List</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDefinitionParseResult()
 * @model
 * @generated
 */
public interface DefinitionParseResult {
	/**
	 * Returns the value of the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Statement</em>' reference.
	 * @see #setDefinitionStatement(DefinitionStatement)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDefinitionParseResult_DefinitionStatement()
	 * @model
	 * @generated
	 */
	DefinitionStatement getDefinitionStatement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.DefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Statement</em>' reference.
	 * @see #getDefinitionStatement()
	 * @generated
	 */
	void setDefinitionStatement(DefinitionStatement value);

	/**
	 * Returns the value of the '<em><b>Error List</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.database.definition.DefinitionParseError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' reference list.
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDefinitionParseResult_ErrorList()
	 * @model
	 * @generated
	 */
	List<DefinitionParseError> getErrorList();

} // DefinitionParseResult
