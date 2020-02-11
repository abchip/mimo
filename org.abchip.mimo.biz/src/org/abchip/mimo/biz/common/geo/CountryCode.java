/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryAbbr <em>Country Abbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryNumber <em>Country Number</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCode()
 * @model annotation="mimo-ent-frame title='ISO Country Code'"
 * @generated
 */
public interface CountryCode extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Country Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Abbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Abbr</em>' attribute.
	 * @see #setCountryAbbr(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCode_CountryAbbr()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCountryAbbr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryAbbr <em>Country Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Abbr</em>' attribute.
	 * @see #getCountryAbbr()
	 * @generated
	 */
	void setCountryAbbr(String value);

	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Name</em>' attribute.
	 * @see #setCountryName(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCode_CountryName()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getCountryName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryName <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Name</em>' attribute.
	 * @see #getCountryName()
	 * @generated
	 */
	void setCountryName(String value);

	/**
	 * Returns the value of the '<em><b>Country Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Number</em>' attribute.
	 * @see #setCountryNumber(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCode_CountryNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCountryNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryNumber <em>Country Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Number</em>' attribute.
	 * @see #getCountryNumber()
	 * @generated
	 */
	void setCountryNumber(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryCode_CountryCode()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

} // CountryCode
