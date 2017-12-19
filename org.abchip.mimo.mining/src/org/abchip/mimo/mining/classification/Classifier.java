/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.classification;

import org.abchip.mimo.context.ContextProvider;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.mining.classification.ClassificationPackage#getClassifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Classifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" klassRequired="true" objectRequired="true"
	 * @generated
	 */
	<E extends Entity> Classification<E> classify(ContextProvider contextProvider, Class<E> klass, Object object);

} // Classifier
