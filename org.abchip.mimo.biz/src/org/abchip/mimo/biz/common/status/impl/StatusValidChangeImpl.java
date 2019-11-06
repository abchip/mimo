/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status.impl;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.status.StatusPackage;
import org.abchip.mimo.biz.common.status.StatusValidChange;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Valid Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl#getTransitionName <em>Transition Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl#getStatusIdTo <em>Status Id To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusValidChangeImpl extends BizEntityImpl implements StatusValidChange {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EXPRESSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String conditionExpression = CONDITION_EXPRESSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected String transitionName = TRANSITION_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getStatusIdTo() <em>Status Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIdTo()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusIdTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusValidChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.STATUS_VALID_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionExpression(String newConditionExpression) {
		conditionExpression = newConditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionName() {
		return transitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionName(String newTransitionName) {
		transitionName = newTransitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusIdTo() {
		if (statusIdTo != null && ((EObject)statusIdTo).eIsProxy()) {
			InternalEObject oldStatusIdTo = (InternalEObject)statusIdTo;
			statusIdTo = (StatusItem)eResolveProxy(oldStatusIdTo);
			if (statusIdTo != oldStatusIdTo) {
			}
		}
		return statusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusIdTo() {
		return statusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusIdTo(StatusItem newStatusIdTo) {
		statusIdTo = newStatusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatusPackage.STATUS_VALID_CHANGE__CONDITION_EXPRESSION:
				return getConditionExpression();
			case StatusPackage.STATUS_VALID_CHANGE__TRANSITION_NAME:
				return getTransitionName();
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID_TO:
				if (resolve) return getStatusIdTo();
				return basicGetStatusIdTo();
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
			case StatusPackage.STATUS_VALID_CHANGE__CONDITION_EXPRESSION:
				setConditionExpression((String)newValue);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__TRANSITION_NAME:
				setTransitionName((String)newValue);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID_TO:
				setStatusIdTo((StatusItem)newValue);
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
			case StatusPackage.STATUS_VALID_CHANGE__CONDITION_EXPRESSION:
				setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__TRANSITION_NAME:
				setTransitionName(TRANSITION_NAME_EDEFAULT);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID_TO:
				setStatusIdTo((StatusItem)null);
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
			case StatusPackage.STATUS_VALID_CHANGE__CONDITION_EXPRESSION:
				return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null : !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
			case StatusPackage.STATUS_VALID_CHANGE__TRANSITION_NAME:
				return TRANSITION_NAME_EDEFAULT == null ? transitionName != null : !TRANSITION_NAME_EDEFAULT.equals(transitionName);
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID:
				return statusId != null;
			case StatusPackage.STATUS_VALID_CHANGE__STATUS_ID_TO:
				return statusIdTo != null;
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
		result.append(" (conditionExpression: ");
		result.append(conditionExpression);
		result.append(", transitionName: ");
		result.append(transitionName);
		result.append(')');
		return result.toString();
	}

} //StatusValidChangeImpl
