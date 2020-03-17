/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
	 * @model required="true" contextIdRequired="true"
	 * @generated
	 */
	Context createChildContext(String contextId);

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
	 * @model klassRequired="true" filterRequired="true"
	 * @generated
	 */
	<T> List<T> getAll(Class<T> klass, String filter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getInstallArea();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.java.JavaURL" exceptions="org.abchip.mimo.java.JavaIOException" pathRequired="true"
	 * @generated
	 */
	URL getResource(String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.java.JavaURL" exceptions="org.abchip.mimo.java.JavaIOException" pathRequired="true"
	 * @generated
	 */
	List<URL> getResources(String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	String locateBundle(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" objectRequired="true" dictionaryDataType="org.abchip.mimo.java.JavaDictionary&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	void set(String name, Object object, boolean remoteExport, Dictionary<String, String> dictionary);

} // ContextRoot
