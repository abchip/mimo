/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.data;

import java.util.List;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.DataDef#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.data.DataPackage#getDataDef()
 * @model abstract="true"
 * @generated
 */
public interface DataDef<D> extends Entity {
	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' attribute list.
	 * @see org.abchip.mimo.data.DataPackage#getDataDef_Formulas()
	 * @model
	 * @generated
	 */
	List<String> getFormulas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DataDefType getDataDefType();

} // DataDef
