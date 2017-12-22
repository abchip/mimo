/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.classification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.mining.classification.ClassificationPackage#getEvaluator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Evaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" classificationRequired="true"
	 * @generated
	 */
	void evaluate(Object object, Object classification);

	void printConfusionMatrix();

} // Evaluator
