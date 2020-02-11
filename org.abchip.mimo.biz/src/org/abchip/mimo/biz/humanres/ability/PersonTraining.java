/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

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
public interface PersonTraining extends BizEntityTyped<TrainingClassType> {
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
	 * @model annotation="mimo-ent-format length='60'"
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
	 * Returns the value of the '<em><b>Approver Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approver Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Id</em>' reference.
	 * @see #setApproverId(Person)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_ApproverId()
	 * @model keys="partyId"
	 * @generated
	 */
	Person getApproverId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getApproverId <em>Approver Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Id</em>' reference.
	 * @see #getApproverId()
	 * @generated
	 */
	void setApproverId(Person value);

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Training Class Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Class Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Class Type Id</em>' reference.
	 * @see #setTrainingClassTypeId(TrainingClassType)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_TrainingClassTypeId()
	 * @model keys="trainingClassTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TrainingClassType getTrainingClassTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingClassTypeId <em>Training Class Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Class Type Id</em>' reference.
	 * @see #getTrainingClassTypeId()
	 * @generated
	 */
	void setTrainingClassTypeId(TrainingClassType value);

	/**
	 * Returns the value of the '<em><b>Training Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Request Id</em>' reference.
	 * @see #setTrainingRequestId(TrainingRequest)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_TrainingRequestId()
	 * @model keys="trainingRequestId"
	 * @generated
	 */
	TrainingRequest getTrainingRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getTrainingRequestId <em>Training Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Request Id</em>' reference.
	 * @see #getTrainingRequestId()
	 * @generated
	 */
	void setTrainingRequestId(TrainingRequest value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' reference.
	 * @see #setWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPersonTraining_WorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PersonTraining#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

} // PersonTraining
