/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Capital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryCapital#getCountryCapital <em>Country Capital</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCapital()
 * @model
 * @generated
 */
public interface CountryCapital extends CountryCode {
	/**
	 * Returns the value of the '<em><b>Country Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Capital</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Capital</em>' attribute.
	 * @see #setCountryCapital(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCapital_CountryCapital()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getCountryCapital();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryCapital#getCountryCapital <em>Country Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Capital</em>' attribute.
	 * @see #getCountryCapital()
	 * @generated
	 */
	void setCountryCapital(String value);

} // CountryCapital
