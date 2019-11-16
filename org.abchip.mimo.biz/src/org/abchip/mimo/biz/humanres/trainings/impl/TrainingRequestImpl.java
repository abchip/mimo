/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.trainings.impl;

import org.abchip.mimo.biz.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.humanres.trainings.TrainingsPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.trainings.impl.TrainingRequestImpl#getTrainingRequestId <em>Training Request Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingRequestImpl extends BizEntityImpl implements TrainingRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTrainingRequestId() <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAINING_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainingRequestId() <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingRequestId()
	 * @generated
	 * @ordered
	 */
	protected String trainingRequestId = TRAINING_REQUEST_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrainingsPackage.Literals.TRAINING_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrainingRequestId() {
		return trainingRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingRequestId(String newTrainingRequestId) {
		String oldTrainingRequestId = trainingRequestId;
		trainingRequestId = newTrainingRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainingsPackage.TRAINING_REQUEST__TRAINING_REQUEST_ID, oldTrainingRequestId, trainingRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrainingsPackage.TRAINING_REQUEST__TRAINING_REQUEST_ID:
				return getTrainingRequestId();
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
			case TrainingsPackage.TRAINING_REQUEST__TRAINING_REQUEST_ID:
				setTrainingRequestId((String)newValue);
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
			case TrainingsPackage.TRAINING_REQUEST__TRAINING_REQUEST_ID:
				setTrainingRequestId(TRAINING_REQUEST_ID_EDEFAULT);
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
			case TrainingsPackage.TRAINING_REQUEST__TRAINING_REQUEST_ID:
				return TRAINING_REQUEST_ID_EDEFAULT == null ? trainingRequestId != null : !TRAINING_REQUEST_ID_EDEFAULT.equals(trainingRequestId);
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
		result.append(" (trainingRequestId: ");
		result.append(trainingRequestId);
		result.append(')');
		return result.toString();
	}

} //TrainingRequestImpl
