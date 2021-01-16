/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageType()
 * @model
 * @generated
 */
public enum LanguageType implements Enumerator {
	/**
	 * The '<em><b>Living</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVING_VALUE
	 * @generated
	 * @ordered
	 */
	LIVING(10, "Living", "L"), /**
	 * The '<em><b>Extinct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTINCT_VALUE
	 * @generated
	 * @ordered
	 */
	EXTINCT(20, "Extinct", "E"), /**
	 * The '<em><b>Ancient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCIENT_VALUE
	 * @generated
	 * @ordered
	 */
	ANCIENT(30, "Ancient", "A"), /**
	 * The '<em><b>Historical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORICAL(40, "Historical", "H"), /**
	 * The '<em><b>Constructed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTED(50, "Constructed", "C");

	/**
	 * The '<em><b>Living</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Living</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVING
	 * @model name="Living" literal="L"
	 * @generated
	 * @ordered
	 */
	public static final int LIVING_VALUE = 10;

	/**
	 * The '<em><b>Extinct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extinct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTINCT
	 * @model name="Extinct" literal="E"
	 * @generated
	 * @ordered
	 */
	public static final int EXTINCT_VALUE = 20;

	/**
	 * The '<em><b>Ancient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ancient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANCIENT
	 * @model name="Ancient" literal="A"
	 * @generated
	 * @ordered
	 */
	public static final int ANCIENT_VALUE = 30;

	/**
	 * The '<em><b>Historical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Historical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL
	 * @model name="Historical" literal="H"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_VALUE = 40;

	/**
	 * The '<em><b>Constructed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constructed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTED
	 * @model name="Constructed" literal="C"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTED_VALUE = 50;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageType[] VALUES_ARRAY =
		new LanguageType[] {
			LIVING,
			EXTINCT,
			ANCIENT,
			HISTORICAL,
			CONSTRUCTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType get(int value) {
		switch (value) {
			case LIVING_VALUE: return LIVING;
			case EXTINCT_VALUE: return EXTINCT;
			case ANCIENT_VALUE: return ANCIENT;
			case HISTORICAL_VALUE: return HISTORICAL;
			case CONSTRUCTED_VALUE: return CONSTRUCTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LanguageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LanguageType
