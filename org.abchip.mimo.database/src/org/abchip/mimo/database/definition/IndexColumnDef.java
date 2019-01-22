/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Column Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.IndexColumnDef#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.IndexColumnDef#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.IndexColumnDef#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexColumnDef()
 * @model
 * @generated
 */
public interface IndexColumnDef extends DatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexColumnDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.IndexColumnDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.definition.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.abchip.mimo.database.definition.OrderingType
	 * @see #setOrdering(OrderingType)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexColumnDef_Ordering()
	 * @model required="true"
	 * @generated
	 */
	OrderingType getOrdering();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.IndexColumnDef#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.abchip.mimo.database.definition.OrderingType
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(OrderingType value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getIndexColumnDef_Sequence()
	 * @model required="true"
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.IndexColumnDef#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

} // IndexColumnDef
