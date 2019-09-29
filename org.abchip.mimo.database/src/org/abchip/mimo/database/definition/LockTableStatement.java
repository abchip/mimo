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
 * A representation of the model object '<em><b>Lock Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.LockTableStatement#isAllowRead <em>Allow Read</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.LockTableStatement#getShareMode <em>Share Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.LockTableStatement#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getLockTableStatement()
 * @model
 * @generated
 */
public interface LockTableStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Allow Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Read</em>' attribute.
	 * @see #setAllowRead(boolean)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getLockTableStatement_AllowRead()
	 * @model
	 * @generated
	 */
	boolean isAllowRead();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.LockTableStatement#isAllowRead <em>Allow Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Read</em>' attribute.
	 * @see #isAllowRead()
	 * @generated
	 */
	void setAllowRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Share Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.definition.ShareMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Mode</em>' attribute.
	 * @see org.abchip.mimo.database.definition.ShareMode
	 * @see #setShareMode(ShareMode)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getLockTableStatement_ShareMode()
	 * @model
	 * @generated
	 */
	ShareMode getShareMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.LockTableStatement#getShareMode <em>Share Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Mode</em>' attribute.
	 * @see org.abchip.mimo.database.definition.ShareMode
	 * @see #getShareMode()
	 * @generated
	 */
	void setShareMode(ShareMode value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' containment reference.
	 * @see #setTableName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getLockTableStatement_TableName()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.LockTableStatement#getTableName <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' containment reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QualifiedName value);

} // LockTableStatement
