/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Find#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFind()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.entity.FindResponse&lt;E&gt;&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.entity.FindResponse&lt;E&gt;&gt;"
 * @generated
 */
public interface Find<E extends EntityIdentifiable> extends ServiceRequest<FindResponse<E>>, Callable<FindResponse<E>> {

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Frame()
	 * @model required="true"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);
} // Find
