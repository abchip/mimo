/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
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
 *   <li>{@link org.abchip.mimo.entity.Frame#isEnum <em>Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSlotsNumber <em>Slots Number</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getRoutesNumber <em>Routes Number</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSuperNames <em>Super Names</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getTextFormula <em>Text Formula</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFrame()
 * @model abstract="true"
 * @generated
 */
public interface Frame<E extends Entity> extends EntityIdentifiable {

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
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Frame<? super E> ako();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	E createEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	E createProxy(String name);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Keys()
	 * @model
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
	 * Returns the value of the '<em><b>Slots Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots Number</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_SlotsNumber()
	 * @model changeable="false"
	 * @generated
	 */
	int getSlotsNumber();

	/**
	 * Returns the value of the '<em><b>Routes Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes Number</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_RoutesNumber()
	 * @model changeable="false"
	 * @generated
	 */
	int getRoutesNumber();

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
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#getTextFormula <em>Text Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Formula</em>' attribute.
	 * @see #getTextFormula()
	 * @generated
	 */
	void setTextFormula(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<Frame<? super E>> getSuperFrames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" entityRequired="true" slotNameRequired="true" resolveRequired="true"
	 * @generated
	 */
	Object getValue(Entity entity, String slotName, boolean resolve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true" slotNameRequired="true" valueRequired="true"
	 * @generated
	 */
	void setValue(Entity entity, String slotName, Object value);

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
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Increment</em>' attribute.
	 * @see #setAutoIncrement(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_AutoIncrement()
	 * @model
	 * @generated
	 */
	boolean isAutoIncrement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#isAutoIncrement <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Increment</em>' attribute.
	 * @see #isAutoIncrement()
	 * @generated
	 */
	void setAutoIncrement(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Enum()
	 * @model
	 * @generated
	 */
	boolean isEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#isEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #isEnum()
	 * @generated
	 */
	void setEnum(boolean value);
} // Frame
