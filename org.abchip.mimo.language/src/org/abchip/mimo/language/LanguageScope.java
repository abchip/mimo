/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 * A representation of the literals of the enumeration '<em><b>Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageScope()
 * @model
 * @generated
 */
public enum LanguageScope implements Enumerator {
	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(10, "I", "Individual"), /**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(20, "M", "Macrolanguage"), /**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(30, "C", "Collections"), /**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(40, "R", "Reserved"), /**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(50, "S", "Specials"), /**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(60, "D", "Dialects");

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I
	 * @model literal="Individual"
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 10;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model literal="Macrolanguage"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 20;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model literal="Collections"
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 30;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #R
	 * @model literal="Reserved"
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 40;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model literal="Specials"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 50;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model literal="Dialects"
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 60;

	/**
	 * An array of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageScope[] VALUES_ARRAY =
		new LanguageScope[] {
			I,
			M,
			C,
			R,
			S,
			D,
		};

	/**
	 * A public read-only list of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageScope get(int value) {
		switch (value) {
			case I_VALUE: return I;
			case M_VALUE: return M;
			case C_VALUE: return C;
			case R_VALUE: return R;
			case S_VALUE: return S;
			case D_VALUE: return D;
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
	private LanguageScope(int value, String name, String literal) {
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
	
} //LanguageScope
