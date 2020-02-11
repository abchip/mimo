/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.trainings;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.trainings.TrainingRequest#getTrainingRequestId <em>Training Request Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.trainings.TrainingsPackage#getTrainingRequest()
 * @model
 * @generated
 */
public interface TrainingRequest extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Training Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Request Id</em>' attribute.
	 * @see #setTrainingRequestId(String)
	 * @see org.abchip.mimo.biz.humanres.trainings.TrainingsPackage#getTrainingRequest_TrainingRequestId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTrainingRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.trainings.TrainingRequest#getTrainingRequestId <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Request Id</em>' attribute.
	 * @see #getTrainingRequestId()
	 * @generated
	 */
	void setTrainingRequestId(String value);

} // TrainingRequest
