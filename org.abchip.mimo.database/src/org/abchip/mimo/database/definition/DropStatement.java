/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
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
package org.abchip.mimo.database.definition;

import org.abchip.mimo.database.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.DropStatement#getRange <em>Range</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.DropStatement#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.DropStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDropStatement()
 * @model
 * @generated
 */
public interface DropStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.definition.DropRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see org.abchip.mimo.database.definition.DropRange
	 * @see #setRange(DropRange)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDropStatement_Range()
	 * @model
	 * @generated
	 */
	DropRange getRange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.DropStatement#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see org.abchip.mimo.database.definition.DropRange
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DropRange value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' containment reference.
	 * @see #setTargetName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDropStatement_TargetName()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getTargetName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.DropStatement#getTargetName <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' containment reference.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.definition.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see org.abchip.mimo.database.definition.TargetElement
	 * @see #setTarget(TargetElement)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDropStatement_Target()
	 * @model
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.DropStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see org.abchip.mimo.database.definition.TargetElement
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

} // DropStatement
