/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining;

import java.util.List;
import org.abchip.mimo.context.Context;

import org.abchip.mimo.entity.Entity;

import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.mining.MiningPackage#getMiningManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MiningManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" klassRequired="true" objectRequired="true"
	 * @generated
	 */
	<E extends Entity> List<Classification<E>> classify(Context context, Class<E> klass, Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true" objectRequired="true"
	 * @generated
	 */
	Classifier lookupClassifier(Class<?> klass, Class<?> object);

} // MiningManager
