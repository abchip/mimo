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

import org.abchip.mimo.database.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.RenameStatement#getNewName <em>New Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.RenameStatement#getSystem <em>System</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.RenameStatement#getOriginalName <em>Original Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.RenameStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRenameStatement()
 * @model
 * @generated
 */
public interface RenameStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRenameStatement_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.RenameStatement#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRenameStatement_System()
	 * @model
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.RenameStatement#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

	/**
	 * Returns the value of the '<em><b>Original Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Name</em>' containment reference.
	 * @see #setOriginalName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRenameStatement_OriginalName()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	QualifiedName getOriginalName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.RenameStatement#getOriginalName <em>Original Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Name</em>' containment reference.
	 * @see #getOriginalName()
	 * @generated
	 */
	void setOriginalName(QualifiedName value);

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
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRenameStatement_Target()
	 * @model
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.RenameStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see org.abchip.mimo.database.definition.TargetElement
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

} // RenameStatement
