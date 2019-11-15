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
 * A representation of the model object '<em><b>Index Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.IndexDef#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.IndexDef#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.IndexDef#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexDef()
 * @model
 * @generated
 */
public interface IndexDef extends DatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Clustered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clustered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clustered</em>' attribute.
	 * @see #setClustered(boolean)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexDef_Clustered()
	 * @model
	 * @generated
	 */
	boolean isClustered();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.IndexDef#isClustered <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clustered</em>' attribute.
	 * @see #isClustered()
	 * @generated
	 */
	void setClustered(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.database.definition.IndexColumnDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexDef_Columns()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<IndexColumnDef> getColumns();

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
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexDef_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.IndexDef#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // IndexDef
