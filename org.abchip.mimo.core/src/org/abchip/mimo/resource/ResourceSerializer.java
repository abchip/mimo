/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.List;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.ResourceSerializer#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceSerializer()
 * @model abstract="true"
 * @generated
 */
public interface ResourceSerializer<E extends Entity> {
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
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceSerializer_Frame()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	Frame<E> getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceSerializer#getFrame <em>Frame</em>}' reference.
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
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" contentDataType="org.abchip.mimo.java.JavaInputStream" contentRequired="true" appendRequired="true"
	 * @generated
	 */
	void load(InputStream content, boolean append) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" contentRequired="true" appendRequired="true"
	 * @generated
	 */
	void load(String content, boolean append) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" outputStreamDataType="org.abchip.mimo.java.JavaOutputStream" outputStreamRequired="true"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isEmpty();

} // ResourceSerializer
