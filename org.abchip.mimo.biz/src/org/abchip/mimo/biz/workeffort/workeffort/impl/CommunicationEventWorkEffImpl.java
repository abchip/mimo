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
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Work Eff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.CommunicationEventWorkEffImpl#getDescription <em>Description</em>}</li>
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
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
		CommunicationEvent oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				return getDescription();
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				setDescription((String)newValue);
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventWorkEffImpl
