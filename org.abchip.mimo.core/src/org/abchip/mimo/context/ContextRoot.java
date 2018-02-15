/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import java.util.Dictionary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getContextRoot()
 * @model abstract="true"
 * @generated
 */
public interface ContextRoot extends Context {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" objectRequired="true" dictionaryDataType="org.abchip.mimo.util.JavaDictionary&lt;org.eclipse.emf.ecore.EString, ?&gt;"
	 * @generated
	 */
	void set(String name, Object object, Dictionary<String, ?> dictionary);

} // ContextRoot
