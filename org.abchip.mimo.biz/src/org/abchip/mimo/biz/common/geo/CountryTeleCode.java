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
 * A representation of the model object '<em><b>Country Tele Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryTeleCode#getTeleCode <em>Tele Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryTeleCode()
 * @model annotation="mimo-ent-frame title='Telephone Country Code'"
 * @generated
 */
public interface CountryTeleCode extends CountryCode {
	/**
	 * Returns the value of the '<em><b>Tele Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tele Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tele Code</em>' attribute.
	 * @see #setTeleCode(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryTeleCode_TeleCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTeleCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryTeleCode#getTeleCode <em>Tele Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tele Code</em>' attribute.
	 * @see #getTeleCode()
	 * @generated
	 */
	void setTeleCode(String value);

} // CountryTeleCode
