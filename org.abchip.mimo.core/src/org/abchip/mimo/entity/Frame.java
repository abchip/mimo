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

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Frame</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Frame#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#isAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSuperNames <em>Super Names</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getTextFormula <em>Text Formula</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFrame()
 * @model abstract="true"
 * @generated
 */
public interface Frame<E extends Entity> extends EntityNameable {

	public final static String NS_PREFIX_FRAME = EntityPackage.eNS_PREFIX + "-frame";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Name()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Frame<? super E> ako();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Keys()
	 * @model changeable="false"
	 * @generated
	 */
	List<String> getKeys();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Slot getSlot(String name);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.entity.Slot}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Slots()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	List<Slot> getSlots();

	/**
	 * Returns the value of the '<em><b>Super Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Names</em>' attribute list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_SuperNames()
	 * @model changeable="false"
	 * @generated
	 */
	List<String> getSuperNames();

	/**
	 * Returns the value of the '<em><b>Text Formula</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Formula</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text Formula</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_TextFormula()
	 * @model changeable="false"
	 * @generated
	 */
	String getTextFormula();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<Frame<? super E>> getSuperFrames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" entityRequired="true" slotNameRequired="true"
	 * @generated
	 */
	Object getValue(Entity entity, String slotName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true" slotRequired="true"
	 * @generated
	 */
	void unsetValue(Entity entity, Slot slot);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Abstract()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Returns the value of the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Increment</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_AutoIncrement()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isAutoIncrement();
} // Frame
