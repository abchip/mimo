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
import org.abchip.mimo.biz.humanres.ability.ResponsibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getResponsibilityTypeId <em>Responsibility Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility()
 * @model
 * @generated
 */
public interface EmplPositionResponsibility extends BizEntity {
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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Id</em>' reference.
	 * @see #setEmplPositionId(EmplPosition)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility_EmplPositionId()
	 * @model keys="emplPositionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPosition getEmplPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getEmplPositionId <em>Empl Position Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id</em>' reference.
	 * @see #getEmplPositionId()
	 * @generated
	 */
	void setEmplPositionId(EmplPosition value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Responsibility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility Type Id</em>' reference.
	 * @see #setResponsibilityTypeId(ResponsibilityType)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility_ResponsibilityTypeId()
	 * @model keys="responsibilityTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ResponsibilityType getResponsibilityTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getResponsibilityTypeId <em>Responsibility Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility Type Id</em>' reference.
	 * @see #getResponsibilityTypeId()
	 * @generated
	 */
	void setResponsibilityTypeId(ResponsibilityType value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPositionResponsibility_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplPositionResponsibility
