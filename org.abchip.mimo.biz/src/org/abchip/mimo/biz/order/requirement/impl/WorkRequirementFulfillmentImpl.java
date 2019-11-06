/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.requirement.Requirement;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.order.requirement.WorkReqFulfType;
import org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Requirement Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.WorkRequirementFulfillmentImpl#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkRequirementFulfillmentImpl extends BizEntityTypedImpl<WorkReqFulfType> implements WorkRequirementFulfillment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getRequirementId() <em>Requirement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirementId;

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
	 * The cached value of the '{@link #getWorkReqFulfTypeId() <em>Work Req Fulf Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 * @ordered
	 */
	protected WorkReqFulfType workReqFulfTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkRequirementFulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.WORK_REQUIREMENT_FULFILLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getRequirementId() {
		if (requirementId != null && ((EObject)requirementId).eIsProxy()) {
			InternalEObject oldRequirementId = (InternalEObject)requirementId;
			requirementId = (Requirement)eResolveProxy(oldRequirementId);
			if (requirementId != oldRequirementId) {
			}
		}
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirementId() {
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementId(Requirement newRequirementId) {
		requirementId = newRequirementId;
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
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkReqFulfType getWorkReqFulfTypeId() {
		if (workReqFulfTypeId != null && ((EObject)workReqFulfTypeId).eIsProxy()) {
			InternalEObject oldWorkReqFulfTypeId = (InternalEObject)workReqFulfTypeId;
			workReqFulfTypeId = (WorkReqFulfType)eResolveProxy(oldWorkReqFulfTypeId);
			if (workReqFulfTypeId != oldWorkReqFulfTypeId) {
			}
		}
		return workReqFulfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkReqFulfType basicGetWorkReqFulfTypeId() {
		return workReqFulfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkReqFulfTypeId(WorkReqFulfType newWorkReqFulfTypeId) {
		workReqFulfTypeId = newWorkReqFulfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID:
				if (resolve) return getRequirementId();
				return basicGetRequirementId();
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				if (resolve) return getWorkReqFulfTypeId();
				return basicGetWorkReqFulfTypeId();
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
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID:
				setRequirementId((Requirement)newValue);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				setWorkReqFulfTypeId((WorkReqFulfType)newValue);
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
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID:
				setRequirementId((Requirement)null);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				setWorkReqFulfTypeId((WorkReqFulfType)null);
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
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID:
				return requirementId != null;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				return workEffortId != null;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				return workReqFulfTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkRequirementFulfillmentImpl
