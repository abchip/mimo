/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.ElectronicText#getTextData <em>Text Data</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getElectronicText()
 * @model
 * @generated
 */
public interface ElectronicText extends DataResource {
	/**
	 * Returns the value of the '<em><b>Text Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Data</em>' attribute.
	 * @see #setTextData(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getElectronicText_TextData()
	 * @model
	 * @generated
	 */
	String getTextData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.ElectronicText#getTextData <em>Text Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Data</em>' attribute.
	 * @see #getTextData()
	 * @generated
	 */
	void setTextData(String value);

} // ElectronicText
