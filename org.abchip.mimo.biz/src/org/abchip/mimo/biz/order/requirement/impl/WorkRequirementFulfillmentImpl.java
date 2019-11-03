/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.order.requirement.WorkReqFulfType;
import org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String requirementId = REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkReqFulfTypeId() <em>Work Req Fulf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_REQ_FULF_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkReqFulfTypeId() <em>Work Req Fulf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 * @ordered
	 */
	protected String workReqFulfTypeId = WORK_REQ_FULF_TYPE_ID_EDEFAULT;

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
	public String getRequirementId() {
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementId(String newRequirementId) {
		String oldRequirementId = requirementId;
		requirementId = newRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT_ID, oldRequirementId, requirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkReqFulfTypeId() {
		return workReqFulfTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkReqFulfTypeId(String newWorkReqFulfTypeId) {
		String oldWorkReqFulfTypeId = workReqFulfTypeId;
		workReqFulfTypeId = newWorkReqFulfTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID, oldWorkReqFulfTypeId, workReqFulfTypeId));
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
				return getRequirementId();
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				return getWorkEffortId();
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				return getWorkReqFulfTypeId();
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
				setRequirementId((String)newValue);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				setWorkReqFulfTypeId((String)newValue);
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
				setRequirementId(REQUIREMENT_ID_EDEFAULT);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				setWorkReqFulfTypeId(WORK_REQ_FULF_TYPE_ID_EDEFAULT);
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
				return REQUIREMENT_ID_EDEFAULT == null ? requirementId != null : !REQUIREMENT_ID_EDEFAULT.equals(requirementId);
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE_ID:
				return WORK_REQ_FULF_TYPE_ID_EDEFAULT == null ? workReqFulfTypeId != null : !WORK_REQ_FULF_TYPE_ID_EDEFAULT.equals(workReqFulfTypeId);
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
		result.append(" (requirementId: ");
		result.append(requirementId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(", workReqFulfTypeId: ");
		result.append(workReqFulfTypeId);
		result.append(')');
		return result.toString();
	}

} //WorkRequirementFulfillmentImpl
