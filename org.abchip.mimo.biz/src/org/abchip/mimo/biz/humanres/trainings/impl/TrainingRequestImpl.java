/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.trainings.impl;

import org.abchip.mimo.biz.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.humanres.trainings.TrainingsPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(TrainingsPackage.Literals.TRAINING_REQUEST__TRAINING_REQUEST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingRequestId(String newTrainingRequestId) {
		eSet(TrainingsPackage.Literals.TRAINING_REQUEST__TRAINING_REQUEST_ID, newTrainingRequestId);
	}

} //TrainingRequestImpl
