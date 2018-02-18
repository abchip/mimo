/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import java.io.IOException;
import java.net.URL;
import java.util.Dictionary;
import java.util.List;

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
	 * @model klassRequired="true" filterRequired="true"
	 * @generated
	 */
	<T> T get(Class<T> klass, String filter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<T> List<T> getAll(Class<T> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.util.JavaURL" exceptions="org.abchip.mimo.util.JavaIOException" contextRequired="true" pathRequired="true"
	 * @generated
	 */
	URL getResource(Class<?> context, String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.util.JavaURL" exceptions="org.abchip.mimo.util.JavaIOException" contextRequired="true" pathRequired="true"
	 * @generated
	 */
	List<URL> getResources(Class<?> context, String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Class<?> loadClass(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" objectRequired="true" dictionaryDataType="org.abchip.mimo.util.JavaDictionary&lt;org.eclipse.emf.ecore.EString, ?&gt;"
	 * @generated
	 */
	void set(String name, Object object, Dictionary<String, ?> dictionary);

} // ContextRoot
