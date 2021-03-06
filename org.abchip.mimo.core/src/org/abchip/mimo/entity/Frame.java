/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity;

import java.util.List;
import org.eclipse.emf.ecore.EClassifier;

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
 *   <li>{@link org.abchip.mimo.entity.Frame#getAko <em>Ako</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#isEnum <em>Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#isHasToString <em>Has To String</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getSuperNames <em>Super Names</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Frame#getTextFormula <em>Text Formula</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFrame()
 * @model abstract="true"
 * @generated
 */
public interface Frame<E extends Entity> extends EntityIdentifiable {

	public final static String NS_PREFIX_FRAME = EntityPackage.eNS_PREFIX + "-frame";
	public final static String NS_PREFIX_FRAME_TYPE = NS_PREFIX_FRAME + "-type";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Keys()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	List<String> getKeys();

	/**
	 * Returns the value of the '<em><b>Has To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has To String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has To String</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_HasToString()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isHasToString();

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
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	List<String> getSuperNames();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<String> getAllKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<Slot> getAllKeySlots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<Slot> getAllSlots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EClassifier getEClassifier();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<Frame<? super E>> getSuperFrames();

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
	 * Returns the value of the '<em><b>Ako</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ako</em>' reference.
	 * @see #setAko(Frame)
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Ako()
	 * @model
	 * @generated
	 */
	Frame<? super E> getAko();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Frame#getAko <em>Ako</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ako</em>' reference.
	 * @see #getAko()
	 * @generated
	 */
	void setAko(Frame<? super E> value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see org.abchip.mimo.entity.EntityPackage#getFrame_Enum()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isEnum();
} // Frame
