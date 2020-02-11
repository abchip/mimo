/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions <em>Main Uom Conversions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom()
 * @model annotation="mimo-ent-frame title='Unit Of Measure' dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface Uom extends BizEntityTyped<UomType> {
	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_Abbreviation()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Main Uom Conversions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.common.uom.UomConversion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Uom Conversions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Uom Conversions</em>' reference list.
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_MainUomConversions()
	 * @model derived="true"
	 * @generated
	 */
	List<UomConversion> getMainUomConversions();

	/**
	 * Returns the value of the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Code</em>' attribute.
	 * @see #setNumericCode(long)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_NumericCode()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumericCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Code</em>' attribute.
	 * @see #getNumericCode()
	 * @generated
	 */
	void setNumericCode(long value);

	/**
	 * Returns the value of the '<em><b>Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Type Id</em>' reference.
	 * @see #setUomTypeId(UomType)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_UomTypeId()
	 * @model keys="uomTypeId"
	 * @generated
	 */
	UomType getUomTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Type Id</em>' reference.
	 * @see #getUomTypeId()
	 * @generated
	 */
	void setUomTypeId(UomType value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_UomId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

} // Uom
