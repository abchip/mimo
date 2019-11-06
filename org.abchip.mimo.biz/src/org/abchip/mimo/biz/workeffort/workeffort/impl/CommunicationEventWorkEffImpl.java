/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Work Eff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventWorkEffImpl extends BizEntityImpl implements CommunicationEventWorkEff {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEvent communicationEventId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventWorkEffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.COMMUNICATION_EVENT_WORK_EFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEvent getCommunicationEventId() {
		if (communicationEventId != null && ((EObject)communicationEventId).eIsProxy()) {
			InternalEObject oldCommunicationEventId = (InternalEObject)communicationEventId;
			communicationEventId = (CommunicationEvent)eResolveProxy(oldCommunicationEventId);
			if (communicationEventId != oldCommunicationEventId) {
			}
		}
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEvent basicGetCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(CommunicationEvent newCommunicationEventId) {
		communicationEventId = newCommunicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				return getDescription();
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID:
				if (resolve) return getCommunicationEventId();
				return basicGetCommunicationEventId();
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)newValue);
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)null);
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID:
				return communicationEventId != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventWorkEffImpl
