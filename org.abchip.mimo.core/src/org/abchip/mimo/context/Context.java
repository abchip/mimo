/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends ContextProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" clazzRequired="true"
	 * @generated
	 */
	<T> T get(Class<T> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model adaptableRequired="true" adapterRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> T getAdapter(Object adaptable, Class<T> adapter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	void inject(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" qualifierRequired="true" ABounds="org.abchip.mimo.java.JavaAnnotation"
	 * @generated
	 */
	<A extends Annotation> void invoke(Object object, Class<A> qualifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<T> T make(Class<T> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factoryRequired="true" adapterTypeRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> void registerAdapterFactory(AdapterFactory factory, Class<T> adapterType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" objectRequired="true"
	 * @generated
	 */
	<T> void set(Class<T> klass, T object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" objectRequired="true"
	 * @generated
	 */
	void set(String name, Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.java.JavaURL" exceptions="org.abchip.mimo.java.JavaIOException" contextRequired="true" pathRequired="true"
	 * @generated
	 */
	URL getResource(Class<?> context, String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.java.JavaURL" exceptions="org.abchip.mimo.java.JavaIOException" contextRequired="true" pathRequired="true"
	 * @generated
	 */
	List<URL> getResources(Class<?> context, String path) throws IOException;

} // Context
