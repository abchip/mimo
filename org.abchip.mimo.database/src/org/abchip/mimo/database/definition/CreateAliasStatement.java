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
package org.abchip.mimo.database.definition;

import org.abchip.mimo.database.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.CreateAliasStatement#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateAliasStatement#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateAliasStatement()
 * @model
 * @generated
 */
public interface CreateAliasStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' containment reference.
	 * @see #setAliasName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateAliasStatement_AliasName()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	QualifiedName getAliasName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateAliasStatement#getAliasName <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' containment reference.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(QualifiedName value);

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
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateAliasStatement_TableName()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	QualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateAliasStatement#getTableName <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' containment reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QualifiedName value);

} // CreateAliasStatement
