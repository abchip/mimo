/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Expression Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getFromTempExprId <em>From Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getToTempExprId <em>To Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getExprAssocType <em>Expr Assoc Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpressionAssoc()
 * @model
 * @generated
 */
public interface TemporalExpressionAssoc extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Temp Expr Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Temp Expr Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Temp Expr Id</em>' attribute.
	 * @see #setFromTempExprId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpressionAssoc_FromTempExprId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='TemporalExpression'"
	 * @generated
	 */
	String getFromTempExprId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getFromTempExprId <em>From Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Temp Expr Id</em>' attribute.
	 * @see #getFromTempExprId()
	 * @generated
	 */
	void setFromTempExprId(String value);

	/**
	 * Returns the value of the '<em><b>To Temp Expr Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Temp Expr Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Temp Expr Id</em>' attribute.
	 * @see #setToTempExprId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpressionAssoc_ToTempExprId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='TemporalExpression'"
	 * @generated
	 */
	String getToTempExprId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getToTempExprId <em>To Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Temp Expr Id</em>' attribute.
	 * @see #getToTempExprId()
	 * @generated
	 */
	void setToTempExprId(String value);

	/**
	 * Returns the value of the '<em><b>Expr Assoc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr Assoc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr Assoc Type</em>' attribute.
	 * @see #setExprAssocType(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getTemporalExpressionAssoc_ExprAssocType()
	 * @model
	 * @generated
	 */
	String getExprAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc#getExprAssocType <em>Expr Assoc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr Assoc Type</em>' attribute.
	 * @see #getExprAssocType()
	 * @generated
	 */
	void setExprAssocType(String value);

} // TemporalExpressionAssoc
