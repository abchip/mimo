/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.EntityReader#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityReader#getNotifier <em>Notifier</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityReader#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityReader()
 * @model abstract="true"
 * @generated
 */
public interface EntityReader<E extends EntityNameable> {
	/**
	 * Returns the value of the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Provider</em>' reference.
	 * @see #setContextProvider(ContextProvider)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityReader_ContextProvider()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	ContextProvider getContextProvider();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityReader#getContextProvider <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Provider</em>' reference.
	 * @see #getContextProvider()
	 * @generated
	 */
	void setContextProvider(ContextProvider value);

	/**
	 * Returns the value of the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifier</em>' reference.
	 * @see #setNotifier(ResourceNotifier)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityReader_Notifier()
	 * @model
	 * @generated
	 */
	ResourceNotifier<E> getNotifier();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityReader#getNotifier <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifier</em>' reference.
	 * @see #getNotifier()
	 * @generated
	 */
	void setNotifier(ResourceNotifier<E> value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' reference.
	 * @see #setFrame(Frame)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityReader_Frame()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	Frame<E> getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityReader#getFrame <em>Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame<E> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	boolean exists(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EntityIterator<E> find(String filter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EntityIterator<E> find(String filter, int nrElem);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	E lookup(String name);
} // Resource
