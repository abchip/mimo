/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingClassTypeId <em>Training Class Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getApproverId <em>Approver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingRequestId <em>Training Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining()
 * @model
 * @generated
 */
public interface PersonTraining extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' attribute.
	 * @see #setApprovalStatus(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_ApprovalStatus()
	 * @model
	 * @generated
	 */
	String getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' attribute.
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(String value);

	/**
	 * Returns the value of the '<em><b>Approver Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approver Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Id</em>' attribute.
	 * @see #setApproverId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_ApproverId()
	 * @model annotation="mimo-ent-domain frame='Person'"
	 * @generated
	 */
	String getApproverId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getApproverId <em>Approver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Id</em>' attribute.
	 * @see #getApproverId()
	 * @generated
	 */
	void setApproverId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Training Class Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Class Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Class Type Id</em>' attribute.
	 * @see #setTrainingClassTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_TrainingClassTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='TrainingClassType'"
	 * @generated
	 */
	String getTrainingClassTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingClassTypeId <em>Training Class Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Class Type Id</em>' attribute.
	 * @see #getTrainingClassTypeId()
	 * @generated
	 */
	void setTrainingClassTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Training Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Request Id</em>' attribute.
	 * @see #setTrainingRequestId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_TrainingRequestId()
	 * @model annotation="mimo-ent-domain frame='TrainingRequest'"
	 * @generated
	 */
	String getTrainingRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingRequestId <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Request Id</em>' attribute.
	 * @see #getTrainingRequestId()
	 * @generated
	 */
	void setTrainingRequestId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_WorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

} // PersonTraining
