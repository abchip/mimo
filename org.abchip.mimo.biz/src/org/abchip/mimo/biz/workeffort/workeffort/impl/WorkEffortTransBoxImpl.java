/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Trans Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getToActivityId <em>To Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getTransitionId <em>Transition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getProcessWorkEffortId <em>Process Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortTransBoxImpl extends BizEntityImpl implements WorkEffortTransBox {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getToActivityId() <em>To Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToActivityId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToActivityId() <em>To Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToActivityId()
	 * @generated
	 * @ordered
	 */
	protected String toActivityId = TO_ACTIVITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionId() <em>Transition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionId() <em>Transition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionId()
	 * @generated
	 * @ordered
	 */
	protected String transitionId = TRANSITION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessWorkEffortId() <em>Process Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort processWorkEffortId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortTransBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getProcessWorkEffortId() {
		if (processWorkEffortId != null && ((EObject)processWorkEffortId).eIsProxy()) {
			InternalEObject oldProcessWorkEffortId = (InternalEObject)processWorkEffortId;
			processWorkEffortId = (WorkEffort)eResolveProxy(oldProcessWorkEffortId);
			if (processWorkEffortId != oldProcessWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID, oldProcessWorkEffortId, processWorkEffortId));
			}
		}
		return processWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetProcessWorkEffortId() {
		return processWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessWorkEffortId(WorkEffort newProcessWorkEffortId) {
		WorkEffort oldProcessWorkEffortId = processWorkEffortId;
		processWorkEffortId = newProcessWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID, oldProcessWorkEffortId, processWorkEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToActivityId() {
		return toActivityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToActivityId(String newToActivityId) {
		String oldToActivityId = toActivityId;
		toActivityId = newToActivityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID, oldToActivityId, toActivityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionId() {
		return transitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionId(String newTransitionId) {
		String oldTransitionId = transitionId;
		transitionId = newTransitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TRANSITION_ID, oldTransitionId, transitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID:
				return getToActivityId();
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TRANSITION_ID:
				return getTransitionId();
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID:
				if (resolve) return getProcessWorkEffortId();
				return basicGetProcessWorkEffortId();
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
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID:
				setToActivityId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TRANSITION_ID:
				setTransitionId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID:
				setProcessWorkEffortId((WorkEffort)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID:
				setToActivityId(TO_ACTIVITY_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TRANSITION_ID:
				setTransitionId(TRANSITION_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID:
				setProcessWorkEffortId((WorkEffort)null);
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
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID:
				return TO_ACTIVITY_ID_EDEFAULT == null ? toActivityId != null : !TO_ACTIVITY_ID_EDEFAULT.equals(toActivityId);
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__TRANSITION_ID:
				return TRANSITION_ID_EDEFAULT == null ? transitionId != null : !TRANSITION_ID_EDEFAULT.equals(transitionId);
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID:
				return processWorkEffortId != null;
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
		result.append(" (toActivityId: ");
		result.append(toActivityId);
		result.append(", transitionId: ");
		result.append(transitionId);
		result.append(')');
		return result.toString();
	}

} //WorkEffortTransBoxImpl
