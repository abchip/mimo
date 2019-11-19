/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.data;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.DatetimeDef#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.data.DatetimeDef#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.abchip.mimo.data.DatetimeDef#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.data.DataPackage#getDatetimeDef()
 * @model superTypes="org.abchip.mimo.data.DataDef&lt;org.eclipse.emf.ecore.EDate&gt;"
 * @generated
 */
public interface DatetimeDef extends DataDef<Date> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.data.DatetimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.data.DatetimeType
	 * @see #setType(DatetimeType)
	 * @see org.abchip.mimo.data.DataPackage#getDatetimeDef_Type()
	 * @model required="true"
	 * @generated
	 */
	DatetimeType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.DatetimeDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.data.DatetimeType
	 * @see #getType()
	 * @generated
	 */
	void setType(DatetimeType value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.data.DateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see org.abchip.mimo.data.DateFormat
	 * @see #setDateFormat(DateFormat)
	 * @see org.abchip.mimo.data.DataPackage#getDatetimeDef_DateFormat()
	 * @model
	 * @generated
	 */
	DateFormat getDateFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.DatetimeDef#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see org.abchip.mimo.data.DateFormat
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(DateFormat value);

	/**
	 * Returns the value of the '<em><b>Time Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.data.TimeFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Format</em>' attribute.
	 * @see org.abchip.mimo.data.TimeFormat
	 * @see #setTimeFormat(TimeFormat)
	 * @see org.abchip.mimo.data.DataPackage#getDatetimeDef_TimeFormat()
	 * @model
	 * @generated
	 */
	TimeFormat getTimeFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.DatetimeDef#getTimeFormat <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Format</em>' attribute.
	 * @see org.abchip.mimo.data.TimeFormat
	 * @see #getTimeFormat()
	 * @generated
	 */
	void setTimeFormat(TimeFormat value);

} // DatetimeDef
