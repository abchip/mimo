/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.contact.TelecomNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getContactMechId <em>Contact Mech Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech()
 * @model
 * @generated
 */
public interface WorkEffortContactMech extends BizEntity {
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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' reference.
	 * @see #setContactMechId(TelecomNumber)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(TelecomNumber value);

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getFromDate <em>From Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContactMech_WorkEffortId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

} // WorkEffortContactMech
