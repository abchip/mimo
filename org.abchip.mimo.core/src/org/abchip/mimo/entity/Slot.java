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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Slot</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Slot#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isKey <em>Key</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getSlot()
 * @model abstract="true"
 * @generated
 */
public interface Slot extends EntityNameable {

	public final static String NS_PREFIX_SLOT = EntityPackage.eNS_PREFIX + "-slot";
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Name()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Cardinality()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_DefaultValue()
	 * @model changeable="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Derived()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Domain()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Key()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isKey();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model nsPrefixRequired="true"
	 * @generated
	 */
	Entity getValue(String nsPrefix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getDataClassName();
} // Slot
