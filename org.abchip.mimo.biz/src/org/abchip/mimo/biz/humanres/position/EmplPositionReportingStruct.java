/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position Reporting Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo <em>Empl Position Id Reporting To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy <em>Empl Position Id Managed By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getPrimaryFlag <em>Primary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct()
 * @model annotation="mimo-ent-frame title='EmplPosition Reporting Structure'"
 * @generated
 */
public interface EmplPositionReportingStruct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Primary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Flag</em>' attribute.
	 * @see #setPrimaryFlag(String)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_PrimaryFlag()
	 * @model
	 * @generated
	 */
	String getPrimaryFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getPrimaryFlag <em>Primary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Flag</em>' attribute.
	 * @see #getPrimaryFlag()
	 * @generated
	 */
	void setPrimaryFlag(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position Id Managed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Id Managed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Id Managed By</em>' reference.
	 * @see #setEmplPositionIdManagedBy(EmplPosition)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_EmplPositionIdManagedBy()
	 * @model keys="emplPositionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPosition getEmplPositionIdManagedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy <em>Empl Position Id Managed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id Managed By</em>' reference.
	 * @see #getEmplPositionIdManagedBy()
	 * @generated
	 */
	void setEmplPositionIdManagedBy(EmplPosition value);

	/**
	 * Returns the value of the '<em><b>Empl Position Id Reporting To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Id Reporting To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Id Reporting To</em>' reference.
	 * @see #setEmplPositionIdReportingTo(EmplPosition)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_EmplPositionIdReportingTo()
	 * @model keys="emplPositionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPosition getEmplPositionIdReportingTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo <em>Empl Position Id Reporting To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id Reporting To</em>' reference.
	 * @see #getEmplPositionIdReportingTo()
	 * @generated
	 */
	void setEmplPositionIdReportingTo(EmplPosition value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionReportingStruct_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplPositionReportingStruct
