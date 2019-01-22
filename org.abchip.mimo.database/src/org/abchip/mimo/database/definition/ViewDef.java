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
 * A representation of the model object '<em><b>View Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.ViewDef#getQuerySelect <em>Query Select</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getViewDef()
 * @model
 * @generated
 */
public interface ViewDef extends TableDef {
	/**
	 * Returns the value of the '<em><b>Query Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Select</em>' attribute.
	 * @see #setQuerySelect(String)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getViewDef_QuerySelect()
	 * @model
	 * @generated
	 */
	String getQuerySelect();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.ViewDef#getQuerySelect <em>Query Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Select</em>' attribute.
	 * @see #getQuerySelect()
	 * @generated
	 */
	void setQuerySelect(String value);

} // ViewDef
