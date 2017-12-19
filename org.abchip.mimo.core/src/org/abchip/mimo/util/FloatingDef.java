/**
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
package org.abchip.mimo.util;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.FloatingDef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.util.UtilPackage#getFloatingDef()
 * @model superTypes="org.abchip.mimo.util.DataDef&lt;org.eclipse.emf.ecore.EFloatObject&gt;"
 * @generated
 */
public interface FloatingDef extends DataDef<Float> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.util.FloatingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.FloatingType
	 * @see #setType(FloatingType)
	 * @see org.abchip.mimo.util.UtilPackage#getFloatingDef_Type()
	 * @model required="true"
	 * @generated
	 */
	FloatingType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.FloatingDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.FloatingType
	 * @see #getType()
	 * @generated
	 */
	void setType(FloatingType value);

} // FloatingDef
