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
 * A representation of the model object '<em><b>Decimal Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.DecimalDef#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.abchip.mimo.util.DecimalDef#getScale <em>Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.util.DecimalDef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.util.UtilPackage#getDecimalDef()
 * @model superTypes="org.abchip.mimo.util.DataDef&lt;org.abchip.mimo.util.JavaNumber&gt;"
 * @generated
 */
public interface DecimalDef extends DataDef<Number> {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see org.abchip.mimo.util.UtilPackage#getDecimalDef_Precision()
	 * @model required="true"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.DecimalDef#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see org.abchip.mimo.util.UtilPackage#getDecimalDef_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.DecimalDef#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.util.DecimalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.DecimalType
	 * @see #setType(DecimalType)
	 * @see org.abchip.mimo.util.UtilPackage#getDecimalDef_Type()
	 * @model
	 * @generated
	 */
	DecimalType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.DecimalDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.util.DecimalType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecimalType value);

} // DecimalDef
