/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate1 <em>Date1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate2 <em>Date2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getFromTemporalExpressionAssocs <em>From Temporal Expression Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger1 <em>Integer1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger2 <em>Integer2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString1 <em>String1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString2 <em>String2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprTypeId <em>Temp Expr Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface TemporalExpression extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Temp Expr Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Expr Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Expr Id</em>' attribute.
	 * @see #setTempExprId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_TempExprId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTempExprId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprId <em>Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Expr Id</em>' attribute.
	 * @see #getTempExprId()
	 * @generated
	 */
	void setTempExprId(String value);

	/**
	 * Returns the value of the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date1</em>' attribute.
	 * @see #setDate1(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_Date1()
	 * @model
	 * @generated
	 */
	Date getDate1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate1 <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date1</em>' attribute.
	 * @see #getDate1()
	 * @generated
	 */
	void setDate1(Date value);

	/**
	 * Returns the value of the '<em><b>Date2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date2</em>' attribute.
	 * @see #setDate2(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_Date2()
	 * @model
	 * @generated
	 */
	Date getDate2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDate2 <em>Date2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date2</em>' attribute.
	 * @see #getDate2()
	 * @generated
	 */
	void setDate2(Date value);

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
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Temporal Expression Assocs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Temporal Expression Assocs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Temporal Expression Assocs</em>' reference list.
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_FromTemporalExpressionAssocs()
	 * @model derived="true"
	 * @generated
	 */
	List<TemporalExpressionAssoc> getFromTemporalExpressionAssocs();

	/**
	 * Returns the value of the '<em><b>Integer1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer1</em>' attribute.
	 * @see #setInteger1(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_Integer1()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getInteger1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger1 <em>Integer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer1</em>' attribute.
	 * @see #getInteger1()
	 * @generated
	 */
	void setInteger1(long value);

	/**
	 * Returns the value of the '<em><b>Integer2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer2</em>' attribute.
	 * @see #setInteger2(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_Integer2()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getInteger2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getInteger2 <em>Integer2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer2</em>' attribute.
	 * @see #getInteger2()
	 * @generated
	 */
	void setInteger2(long value);

	/**
	 * Returns the value of the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String1</em>' attribute.
	 * @see #setString1(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_String1()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getString1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString1 <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String1</em>' attribute.
	 * @see #getString1()
	 * @generated
	 */
	void setString1(String value);

	/**
	 * Returns the value of the '<em><b>String2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String2</em>' attribute.
	 * @see #setString2(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_String2()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getString2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getString2 <em>String2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String2</em>' attribute.
	 * @see #getString2()
	 * @generated
	 */
	void setString2(String value);

	/**
	 * Returns the value of the '<em><b>Temp Expr Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Expr Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Expr Type Id</em>' attribute.
	 * @see #setTempExprTypeId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpression_TempExprTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTempExprTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpression#getTempExprTypeId <em>Temp Expr Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Expr Type Id</em>' attribute.
	 * @see #getTempExprTypeId()
	 * @generated
	 */
	void setTempExprTypeId(String value);

} // TemporalExpression
