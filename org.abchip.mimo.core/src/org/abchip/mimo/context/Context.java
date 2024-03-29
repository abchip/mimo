/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.lang.annotation.Annotation;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.service.ServiceManager;

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
public interface Context extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E createProxy(Class<E> klass, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E createProxy(String frame, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

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
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ContextDescription getContextDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Frame<E> getFrame(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Frame<E> getFrame(String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ResourceManager getResourceManager();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ServiceManager getServiceManager();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTenant();

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
	 * @model required="true" frameRequired="true"
	 * @generated
	 */
	<E extends Entity> E make(Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true"
	 * @generated
	 */
	<E extends Entity> E make(String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E make(Class<E> klass, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E make(Frame<E> frame, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true" idRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> E make(String frame, String id);

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
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(ContextListener listener);

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

} // Context
