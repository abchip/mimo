/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getTerminationReasonId <em>Termination Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getTerminationTypeId <em>Termination Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.Employment#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment()
 * @model
 * @generated
 */
public interface Employment extends BizEntity {
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
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' attribute.
	 * @see #setPartyIdFrom(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_PartyIdFrom()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' attribute.
	 * @see #setPartyIdTo(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_PartyIdTo()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getPartyIdTo <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' attribute.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' attribute.
	 * @see #setRoleTypeIdFrom(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_RoleTypeIdFrom()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getRoleTypeIdFrom <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id From</em>' attribute.
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 */
	void setRoleTypeIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' attribute.
	 * @see #setRoleTypeIdTo(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_RoleTypeIdTo()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getRoleTypeIdTo <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' attribute.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Termination Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Reason Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Reason Id</em>' attribute.
	 * @see #setTerminationReasonId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_TerminationReasonId()
	 * @model annotation="mimo-ent-domain frame='TerminationReason'"
	 * @generated
	 */
	String getTerminationReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getTerminationReasonId <em>Termination Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Reason Id</em>' attribute.
	 * @see #getTerminationReasonId()
	 * @generated
	 */
	void setTerminationReasonId(String value);

	/**
	 * Returns the value of the '<em><b>Termination Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Type Id</em>' attribute.
	 * @see #setTerminationTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_TerminationTypeId()
	 * @model annotation="mimo-ent-domain frame='TerminationType'"
	 * @generated
	 */
	String getTerminationTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getTerminationTypeId <em>Termination Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Type Id</em>' attribute.
	 * @see #getTerminationTypeId()
	 * @generated
	 */
	void setTerminationTypeId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmployment_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.Employment#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // Employment
