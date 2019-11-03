/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom Conversion Dated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo <em>Uom Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale <em>Decimal Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId <em>Purpose Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode <em>Rounding Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated()
 * @model
 * @generated
 */
public interface UomConversionDated extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_ConversionFactor()
	 * @model
	 * @generated
	 */
	double getConversionFactor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor <em>Conversion Factor</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_DecimalScale()
	 * @model
	 * @generated
	 */
	long getDecimalScale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Scale</em>' attribute.
	 * @see #getDecimalScale()
	 * @generated
	 */
	void setDecimalScale(long value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_RoundingMode()
	 * @model
	 * @generated
	 */
	String getRoundingMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Mode</em>' attribute.
	 * @see #getRoundingMode()
	 * @generated
	 */
	void setRoundingMode(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_UomId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id To</em>' attribute.
	 * @see #setUomIdTo(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_UomIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo <em>Uom Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id To</em>' attribute.
	 * @see #getUomIdTo()
	 * @generated
	 */
	void setUomIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' attribute.
	 * @see #setCustomMethodId(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_CustomMethodId()
	 * @model annotation="mimo-ent-domain frame='CustomMethod'"
	 * @generated
	 */
	String getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' attribute.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Purpose Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Enum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Enum Id</em>' attribute.
	 * @see #setPurposeEnumId(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomConversionDated_PurposeEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getPurposeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId <em>Purpose Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Enum Id</em>' attribute.
	 * @see #getPurposeEnumId()
	 * @generated
	 */
	void setPurposeEnumId(String value);

} // UomConversionDated
