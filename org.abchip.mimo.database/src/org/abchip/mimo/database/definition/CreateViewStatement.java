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
 * A representation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.CreateViewStatement#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateViewStatement#getFields <em>Fields</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.CreateViewStatement#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateViewStatement()
 * @model
 * @generated
 */
public interface CreateViewStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>View Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' containment reference.
	 * @see #setViewName(QualifiedName)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateViewStatement_ViewName()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	QualifiedName getViewName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateViewStatement#getViewName <em>View Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' containment reference.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateViewStatement_Fields()
	 * @model required="true"
	 * @generated
	 */
	List<String> getFields();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getCreateViewStatement_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.CreateViewStatement#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

} // CreateViewStatement
