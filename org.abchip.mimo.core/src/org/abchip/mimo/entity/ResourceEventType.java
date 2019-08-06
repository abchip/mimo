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
	 * The '<em><b>PRESAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESAVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESAVE(10, "PRESAVE", "Pre Save"), /**
	 * The '<em><b>POSTSAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTSAVE_VALUE
	 * @generated
	 * @ordered
	 */
	POSTSAVE(20, "POSTSAVE", "Post Save"), /**
	 * The '<em><b>PREDLT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDLT_VALUE
	 * @generated
	 * @ordered
	 */
	PREDLT(60, "PREDLT", "Pre Delete"), /**
	 * The '<em><b>POSTDLT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTDLT_VALUE
	 * @generated
	 * @ordered
	 */
	POSTDLT(70, "POSTDLT", "Post Delete"), /**
	 * The '<em><b>PRERNM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRERNM_VALUE
	 * @generated
	 * @ordered
	 */
	PRERNM(80, "PRERNM", "Pre Rename"), /**
	 * The '<em><b>POSTRNM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTRNM_VALUE
	 * @generated
	 * @ordered
	 */
	POSTRNM(90, "POSTRNM", "Post Rename");

	/**
	 * The '<em><b>PRESAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESAVE
	 * @model literal="Pre Save"
	 * @generated
	 * @ordered
	 */
	public static final int PRESAVE_VALUE = 10;

	/**
	 * The '<em><b>POSTSAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSTSAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTSAVE
	 * @model literal="Post Save"
	 * @generated
	 * @ordered
	 */
	public static final int POSTSAVE_VALUE = 20;

	/**
	 * The '<em><b>PREDLT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREDLT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDLT
	 * @model literal="Pre Delete"
	 * @generated
	 * @ordered
	 */
	public static final int PREDLT_VALUE = 60;

	/**
	 * The '<em><b>POSTDLT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSTDLT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTDLT
	 * @model literal="Post Delete"
	 * @generated
	 * @ordered
	 */
	public static final int POSTDLT_VALUE = 70;

	/**
	 * The '<em><b>PRERNM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRERNM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRERNM
	 * @model literal="Pre Rename"
	 * @generated
	 * @ordered
	 */
	public static final int PRERNM_VALUE = 80;

	/**
	 * The '<em><b>POSTRNM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSTRNM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTRNM
	 * @model literal="Post Rename"
	 * @generated
	 * @ordered
	 */
	public static final int POSTRNM_VALUE = 90;

	/**
	 * An array of all the '<em><b>Resource Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceEventType[] VALUES_ARRAY = new ResourceEventType[] {
			PRESAVE,
			POSTSAVE,
			PREDLT,
			POSTDLT,
			PRERNM,
			POSTRNM,
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
			case PRESAVE_VALUE: return PRESAVE;
			case POSTSAVE_VALUE: return POSTSAVE;
			case PREDLT_VALUE: return PREDLT;
			case POSTDLT_VALUE: return POSTDLT;
			case PRERNM_VALUE: return PRERNM;
			case POSTRNM_VALUE: return POSTRNM;
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
