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
package org.abchip.mimo.context;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResources <em>Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResourceRoot <em>Resource Root</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResourceTemporary <em>Resource Temporary</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getContextDescription()
 * @model
 * @generated
 */
public interface ContextDescription {
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
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Root</em>' attribute.
	 * @see #setResourceRoot(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_ResourceRoot()
	 * @model required="true"
	 * @generated
	 */
	String getResourceRoot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getResourceRoot <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Root</em>' attribute.
	 * @see #getResourceRoot()
	 * @generated
	 */
	void setResourceRoot(String value);

	/**
	 * Returns the value of the '<em><b>Resource Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Temporary</em>' attribute.
	 * @see #setResourceTemporary(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_ResourceTemporary()
	 * @model required="true"
	 * @generated
	 */
	String getResourceTemporary();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getResourceTemporary <em>Resource Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Temporary</em>' attribute.
	 * @see #getResourceTemporary()
	 * @generated
	 */
	void setResourceTemporary(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute list.
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Resources()
	 * @model
	 * @generated
	 */
	List<String> getResources();

} // ContextDescription
