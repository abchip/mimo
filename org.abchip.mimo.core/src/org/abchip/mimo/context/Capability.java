/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.net.URI;
import java.util.List;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.Capability#getRights <em>Rights</em>}</li>
 *   <li>{@link org.abchip.mimo.context.Capability#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getCapability()
 * @model abstract="true"
 * @generated
 */
public interface Capability extends Entity {

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute list.
	 * The list contents are of type {@link org.abchip.mimo.context.CapabilityRight}.
	 * The literals are from the enumeration {@link org.abchip.mimo.context.CapabilityRight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute list.
	 * @see org.abchip.mimo.context.CapabilityRight
	 * @see org.abchip.mimo.context.ContextPackage#getCapability_Rights()
	 * @model
	 * @generated
	 */
	List<CapabilityRight> getRights();

	/**
	 * Returns the value of the '<em><b>Entity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity URI</em>' attribute.
	 * @see #setEntityURI(URI)
	 * @see org.abchip.mimo.context.ContextPackage#getCapability_EntityURI()
	 * @model dataType="org.abchip.mimo.util.JavaURI" required="true"
	 * @generated
	 */
	URI getEntityURI();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.Capability#getEntityURI <em>Entity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity URI</em>' attribute.
	 * @see #getEntityURI()
	 * @generated
	 */
	void setEntityURI(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getEntityName();

} // Capability
