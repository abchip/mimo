/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.BinaryDef#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.data.BinaryDef#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.data.DataPackage#getBinaryDef()
 * @model superTypes="org.abchip.mimo.data.DataDef&lt;org.eclipse.emf.ecore.EByteArray&gt;"
 * @generated
 */
public interface BinaryDef extends DataDef<byte[]> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.data.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.data.BinaryType
	 * @see #setType(BinaryType)
	 * @see org.abchip.mimo.data.DataPackage#getBinaryDef_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.BinaryDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.data.BinaryType
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
	 * @see org.abchip.mimo.data.DataPackage#getBinaryDef_Unsigned()
	 * @model
	 * @generated
	 */
	boolean isUnsigned();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.BinaryDef#isUnsigned <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned</em>' attribute.
	 * @see #isUnsigned()
	 * @generated
	 */
	void setUnsigned(boolean value);

} // BinaryDef
