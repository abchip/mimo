/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.humanres.ability.SkillType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Skill Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl#getEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl#getEstimatedNumPeople <em>Estimated Num People</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSkillStandardImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortSkillStandardImpl extends BizEntityImpl implements WorkEffortSkillStandard {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedCost = ESTIMATED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected double estimatedDuration = ESTIMATED_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedNumPeople() <em>Estimated Num People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedNumPeople()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_NUM_PEOPLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedNumPeople() <em>Estimated Num People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedNumPeople()
	 * @generated
	 * @ordered
	 */
	protected double estimatedNumPeople = ESTIMATED_NUM_PEOPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected SkillType skillTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortSkillStandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_SKILL_STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCost(BigDecimal newEstimatedCost) {
		BigDecimal oldEstimatedCost = estimatedCost;
		estimatedCost = newEstimatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST, oldEstimatedCost, estimatedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedDuration() {
		return estimatedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDuration(double newEstimatedDuration) {
		double oldEstimatedDuration = estimatedDuration;
		estimatedDuration = newEstimatedDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION, oldEstimatedDuration, estimatedDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedNumPeople() {
		return estimatedNumPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedNumPeople(double newEstimatedNumPeople) {
		double oldEstimatedNumPeople = estimatedNumPeople;
		estimatedNumPeople = newEstimatedNumPeople;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE, oldEstimatedNumPeople, estimatedNumPeople));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		if (skillTypeId != null && ((EObject)skillTypeId).eIsProxy()) {
			InternalEObject oldSkillTypeId = (InternalEObject)skillTypeId;
			skillTypeId = (SkillType)eResolveProxy(oldSkillTypeId);
			if (skillTypeId != oldSkillTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID, oldSkillTypeId, skillTypeId));
			}
		}
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType basicGetSkillTypeId() {
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		SkillType oldSkillTypeId = skillTypeId;
		skillTypeId = newSkillTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID, oldSkillTypeId, skillTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		WorkEffort oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST:
				return getEstimatedCost();
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION:
				return getEstimatedDuration();
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE:
				return getEstimatedNumPeople();
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID:
				if (resolve) return getSkillTypeId();
				return basicGetSkillTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST:
				setEstimatedCost((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION:
				setEstimatedDuration((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE:
				setEstimatedNumPeople((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION:
				setEstimatedDuration(ESTIMATED_DURATION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE:
				setEstimatedNumPeople(ESTIMATED_NUM_PEOPLE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST:
				return ESTIMATED_COST_EDEFAULT == null ? estimatedCost != null : !ESTIMATED_COST_EDEFAULT.equals(estimatedCost);
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION:
				return estimatedDuration != ESTIMATED_DURATION_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE:
				return estimatedNumPeople != ESTIMATED_NUM_PEOPLE_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID:
				return skillTypeId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (estimatedCost: ");
		result.append(estimatedCost);
		result.append(", estimatedDuration: ");
		result.append(estimatedDuration);
		result.append(", estimatedNumPeople: ");
		result.append(estimatedNumPeople);
		result.append(')');
		return result.toString();
	}

} //WorkEffortSkillStandardImpl
