/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
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
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getResourceSerializer()
 * @model abstract="true" superTypes="org.abchip.mimo.util.JavaCloseable"
 * @generated
 */
public interface ResourceSerializer<E extends Entity> extends Closeable {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	void add(E entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entitiesRequired="true" entitiesMany="true"
	 * @generated
	 */
	void addAll(List<E> entities);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.util.JavaIOException" inputStreamDataType="org.abchip.mimo.util.JavaInputStream" inputStreamRequired="true"
	 * @generated
	 */
	void load(InputStream inputStream) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.util.JavaIOException" outputStreamDataType="org.abchip.mimo.util.JavaOutputStream" outputStreamRequired="true"
	 * @generated
	 */
	void save(OutputStream outputStream) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	E get();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<E> getAll();

} // ResourceSerializer
