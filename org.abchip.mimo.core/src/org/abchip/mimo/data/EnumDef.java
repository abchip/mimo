/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data;

import org.eclipse.emf.ecore.EEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.EnumDef#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.data.DataPackage#getEnumDef()
 * @model superTypes="org.abchip.mimo.data.DataDef&lt;org.abchip.mimo.java.JavaEnum&gt;" EBounds="org.abchip.mimo.java.JavaEnum"
 * @generated
 */
public interface EnumDef<E extends Enum<E>> extends DataDef<Enum<E>> {

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference.
	 * @see #setEnum(EEnum)
	 * @see org.abchip.mimo.data.DataPackage#getEnumDef_Enum()
	 * @model required="true"
	 * @generated
	 */
	EEnum getEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.EnumDef#getEnum <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(EEnum value);
} // EnumDef
