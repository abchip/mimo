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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Resource Event Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * @see org.abchip.mimo.entity.EntityPackage#getResourceEventType()
 * @model
 * @generated
 */
public enum ResourceEventType implements Enumerator {
	/**
	 * The '<em><b>Before Save</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_SAVE(10, "Before_Save", "PRESAVE"), /**
	 * The '<em><b>After Save</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_SAVE(20, "After_Save", "POSTSAVE"), /**
	 * The '<em><b>Before Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_DELETE(60, "Before_Delete", "PREDLT"), /**
	 * The '<em><b>After Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_DELETE(70, "After_Delete", "POSTDLT"), /**
	 * The '<em><b>Before Rename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_RENAME_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_RENAME(80, "Before_Rename", "PRERNM"), /**
	 * The '<em><b>After Rename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_RENAME_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_RENAME(90, "After_Rename", "POSTRNM");

	/**
	 * The '<em><b>Before Save</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Save</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SAVE
	 * @model name="Before_Save" literal="PRESAVE"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_SAVE_VALUE = 10;

	/**
	 * The '<em><b>After Save</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Save</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_SAVE
	 * @model name="After_Save" literal="POSTSAVE"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_SAVE_VALUE = 20;

	/**
	 * The '<em><b>Before Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_DELETE
	 * @model name="Before_Delete" literal="PREDLT"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_DELETE_VALUE = 60;

	/**
	 * The '<em><b>After Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_DELETE
	 * @model name="After_Delete" literal="POSTDLT"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_DELETE_VALUE = 70;

	/**
	 * The '<em><b>Before Rename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Rename</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_RENAME
	 * @model name="Before_Rename" literal="PRERNM"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_RENAME_VALUE = 80;

	/**
	 * The '<em><b>After Rename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Rename</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_RENAME
	 * @model name="After_Rename" literal="POSTRNM"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_RENAME_VALUE = 90;

	/**
	 * An array of all the '<em><b>Resource Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceEventType[] VALUES_ARRAY = new ResourceEventType[] {
			BEFORE_SAVE,
			AFTER_SAVE,
			BEFORE_DELETE,
			AFTER_DELETE,
			BEFORE_RENAME,
			AFTER_RENAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceEventType get(int value) {
		switch (value) {
			case BEFORE_SAVE_VALUE: return BEFORE_SAVE;
			case AFTER_SAVE_VALUE: return AFTER_SAVE;
			case BEFORE_DELETE_VALUE: return BEFORE_DELETE;
			case AFTER_DELETE_VALUE: return AFTER_DELETE;
			case BEFORE_RENAME_VALUE: return BEFORE_RENAME;
			case AFTER_RENAME_VALUE: return AFTER_RENAME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private ResourceEventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // QResourceEventType
