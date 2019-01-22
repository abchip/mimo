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
package org.abchip.mimo.util;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.BinaryDef#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.util.BinaryDef#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.util.UtilPackage#getBinaryDef()
 * @model
 * @generated
 */
public interface BinaryDef {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.util.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.BinaryType
	 * @see #setType(BinaryType)
	 * @see org.abchip.mimo.util.UtilPackage#getBinaryDef_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.BinaryDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.BinaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryType value);

	/**
	 * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned</em>' attribute.
	 * @see #setUnsigned(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getBinaryDef_Unsigned()
	 * @model
	 * @generated
	 */
	boolean isUnsigned();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.BinaryDef#isUnsigned <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned</em>' attribute.
	 * @see #isUnsigned()
	 * @generated
	 */
	void setUnsigned(boolean value);

} // BinaryDef
