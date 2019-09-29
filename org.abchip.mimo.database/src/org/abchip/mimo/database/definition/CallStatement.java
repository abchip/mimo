/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition;

import java.util.List;

import org.abchip.mimo.database.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.CallStatement#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CallStatement#getParms <em>Parms</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCallStatement()
 * @model
 * @generated
 */
public interface CallStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Procedure Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Name</em>' containment reference.
	 * @see #setProcedureName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCallStatement_ProcedureName()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getProcedureName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CallStatement#getProcedureName <em>Procedure Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Name</em>' containment reference.
	 * @see #getProcedureName()
	 * @generated
	 */
	void setProcedureName(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Parms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parms</em>' attribute list.
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCallStatement_Parms()
	 * @model
	 * @generated
	 */
	List<String> getParms();

} // CallStatement
