/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.method.CustomMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo <em>Uom Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale <em>Decimal Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode <em>Rounding Mode</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion()
 * @model annotation="mimo-ent-frame title='Unit Of Measure Conversion Type'"
 * @generated
 */
public interface UomConversion extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(double)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_ConversionFactor()
	 * @model
	 * @generated
	 */
	double getConversionFactor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(double value);

	/**
	 * Returns the value of the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Scale</em>' attribute.
	 * @see #setDecimalScale(long)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_DecimalScale()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDecimalScale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Scale</em>' attribute.
	 * @see #getDecimalScale()
	 * @generated
	 */
	void setDecimalScale(long value);

	/**
	 * Returns the value of the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounding Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding Mode</em>' attribute.
	 * @see #setRoundingMode(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_RoundingMode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoundingMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Mode</em>' attribute.
	 * @see #getRoundingMode()
	 * @generated
	 */
	void setRoundingMode(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' reference.
	 * @see #setUomId(Uom)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_UomId()
	 * @model keys="uomId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id To</em>' reference.
	 * @see #setUomIdTo(Uom)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_UomIdTo()
	 * @model keys="uomId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getUomIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo <em>Uom Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id To</em>' reference.
	 * @see #getUomIdTo()
	 * @generated
	 */
	void setUomIdTo(Uom value);

	/**
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' reference.
	 * @see #setCustomMethodId(CustomMethod)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversion_CustomMethodId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' reference.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(CustomMethod value);

} // UomConversion
