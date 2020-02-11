/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PersonTraining;
import org.abchip.mimo.biz.humanres.ability.TrainingClassType;
import org.abchip.mimo.biz.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingClassTypeId <em>Training Class Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApproverId <em>Approver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingRequestId <em>Training Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonTrainingImpl extends BizEntityTypedImpl<TrainingClassType> implements PersonTraining {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonTrainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PERSON_TRAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprovalStatus() {
		return (String)eGet(AbilityPackage.Literals.PERSON_TRAINING__APPROVAL_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalStatus(String newApprovalStatus) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__APPROVAL_STATUS, newApprovalStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getApproverId() {
		return (Person)eGet(AbilityPackage.Literals.PERSON_TRAINING__APPROVER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverId(Person newApproverId) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__APPROVER_ID, newApproverId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(AbilityPackage.Literals.PERSON_TRAINING__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(AbilityPackage.Literals.PERSON_TRAINING__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return (String)eGet(AbilityPackage.Literals.PERSON_TRAINING__REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__REASON, newReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(AbilityPackage.Literals.PERSON_TRAINING__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingClassType getTrainingClassTypeId() {
		return (TrainingClassType)eGet(AbilityPackage.Literals.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingClassTypeId(TrainingClassType newTrainingClassTypeId) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID, newTrainingClassTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingRequest getTrainingRequestId() {
		return (TrainingRequest)eGet(AbilityPackage.Literals.PERSON_TRAINING__TRAINING_REQUEST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingRequestId(TrainingRequest newTrainingRequestId) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__TRAINING_REQUEST_ID, newTrainingRequestId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		return (WorkEffort)eGet(AbilityPackage.Literals.PERSON_TRAINING__WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		eSet(AbilityPackage.Literals.PERSON_TRAINING__WORK_EFFORT_ID, newWorkEffortId);
	}

} //PersonTrainingImpl
