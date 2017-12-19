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
 * A representation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.CreateIndexStatement#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateIndexStatement#getOnTable <em>On Table</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateIndexStatement#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateIndexStatement#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateIndexStatement()
 * @model
 * @generated
 */
public interface CreateIndexStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' containment reference.
	 * @see #setIndexName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateIndexStatement_IndexName()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getIndexName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getIndexName <em>Index Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name</em>' containment reference.
	 * @see #getIndexName()
	 * @generated
	 */
	void setIndexName(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>On Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Table</em>' containment reference.
	 * @see #setOnTable(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateIndexStatement_OnTable()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getOnTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getOnTable <em>On Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Table</em>' containment reference.
	 * @see #getOnTable()
	 * @generated
	 */
	void setOnTable(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(IndexDef)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateIndexStatement_SortBy()
	 * @model containment="true"
	 * @generated
	 */
	IndexDef getSortBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(IndexDef value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateIndexStatement_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateIndexStatement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // CreateIndexStatement
