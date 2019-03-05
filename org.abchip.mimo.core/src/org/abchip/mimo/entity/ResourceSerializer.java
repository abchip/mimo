/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Serializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.ResourceSerializer#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.ResourceSerializer#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.ResourceSerializer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getResourceSerializer()
 * @model abstract="true"
 * @generated
 */
public interface ResourceSerializer<E extends EntityNameable> {
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
	 * @see org.abchip.mimo.entity.EntityPackage#getResourceSerializer_ContextProvider()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	ContextProvider getContextProvider();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.ResourceSerializer#getContextProvider <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Provider</em>' reference.
	 * @see #getContextProvider()
	 * @generated
	 */
	void setContextProvider(ContextProvider value);

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
	 * @see org.abchip.mimo.entity.EntityPackage#getResourceSerializer_Frame()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	Frame<E> getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.ResourceSerializer#getFrame <em>Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame<E> value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getResourceSerializer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.ResourceSerializer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceSerializer
