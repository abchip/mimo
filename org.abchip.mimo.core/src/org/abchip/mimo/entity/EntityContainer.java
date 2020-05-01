/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.List;
import org.abchip.mimo.resource.ResourceException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.EntityContainer#getContents <em>Contents</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityContainer()
 * @model
 * @generated
 */
public interface EntityContainer extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.entity.EntityIdentifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityContainer_Contents()
	 * @model containment="true" resolveProxies="true" changeable="false"
	 * @generated
	 */
	List<EntityIdentifiable> getContents();

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
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityContainer_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	EntityIdentifiable add(String frame) throws ResourceException;

} // EntityContainer
