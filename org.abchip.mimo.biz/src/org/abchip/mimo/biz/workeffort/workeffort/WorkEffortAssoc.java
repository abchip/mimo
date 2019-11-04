/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom <em>Work Effort Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo <em>Work Effort Id To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc()
 * @model
 * @generated
 */
public interface WorkEffortAssoc extends BizEntityTyped<WorkEffortAssocType> {
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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Assoc Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Assoc Type Id</em>' reference.
	 * @see #setWorkEffortAssocTypeId(WorkEffortAssocType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortAssocTypeId()
	 * @model keys="workEffortAssocTypeId"
	 * @generated
	 */
	WorkEffortAssocType getWorkEffortAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Assoc Type Id</em>' reference.
	 * @see #getWorkEffortAssocTypeId()
	 * @generated
	 */
	void setWorkEffortAssocTypeId(WorkEffortAssocType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id From</em>' attribute.
	 * @see #setWorkEffortIdFrom(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortIdFrom()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWorkEffortIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom <em>Work Effort Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id From</em>' attribute.
	 * @see #getWorkEffortIdFrom()
	 * @generated
	 */
	void setWorkEffortIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id To</em>' reference.
	 * @see #setWorkEffortIdTo(WorkEffort)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortIdTo()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffortIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo <em>Work Effort Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id To</em>' reference.
	 * @see #getWorkEffortIdTo()
	 * @generated
	 */
	void setWorkEffortIdTo(WorkEffort value);

} // WorkEffortAssoc
