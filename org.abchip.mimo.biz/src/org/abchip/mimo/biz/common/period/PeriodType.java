/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.PeriodType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodLength <em>Period Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.PeriodType#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getPeriodType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PeriodType extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getPeriodType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.PeriodType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Period Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Length</em>' attribute.
	 * @see #setPeriodLength(long)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getPeriodType_PeriodLength()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPeriodLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodLength <em>Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Length</em>' attribute.
	 * @see #getPeriodLength()
	 * @generated
	 */
	void setPeriodLength(long value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' reference.
	 * @see #setUomId(Uom)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getPeriodType_UomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.PeriodType#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Period Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type Id</em>' attribute.
	 * @see #setPeriodTypeId(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getPeriodType_PeriodTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPeriodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodTypeId <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type Id</em>' attribute.
	 * @see #getPeriodTypeId()
	 * @generated
	 */
	void setPeriodTypeId(String value);

} // PeriodType
