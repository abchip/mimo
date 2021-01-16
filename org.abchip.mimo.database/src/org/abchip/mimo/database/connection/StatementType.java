/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Statement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#getStatementType()
 * @model
 * @generated
 */
public enum StatementType implements Enumerator {
	/**
	 * The '<em><b>Data Manipulation Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_MANIPULATION_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_MANIPULATION_LANGUAGE(0, "DataManipulationLanguage", "DML"), /**
	 * The '<em><b>Data Definition Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_DEFINITION_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_DEFINITION_LANGUAGE(1, "DataDefinitionLanguage", "DDL"), /**
	 * The '<em><b>Data Binding Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_BINDING_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_BINDING_LANGUAGE(2, "DataBindingLanguage", "DBL");

	/**
	 * The '<em><b>Data Manipulation Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Manipulation Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_MANIPULATION_LANGUAGE
	 * @model name="DataManipulationLanguage" literal="DML"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_MANIPULATION_LANGUAGE_VALUE = 0;

	/**
	 * The '<em><b>Data Definition Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Definition Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_DEFINITION_LANGUAGE
	 * @model name="DataDefinitionLanguage" literal="DDL"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_DEFINITION_LANGUAGE_VALUE = 1;

	/**
	 * The '<em><b>Data Binding Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Binding Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_BINDING_LANGUAGE
	 * @model name="DataBindingLanguage" literal="DBL"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_BINDING_LANGUAGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatementType[] VALUES_ARRAY = new StatementType[] {
			DATA_MANIPULATION_LANGUAGE,
			DATA_DEFINITION_LANGUAGE,
			DATA_BINDING_LANGUAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(int value) {
		switch (value) {
			case DATA_MANIPULATION_LANGUAGE_VALUE: return DATA_MANIPULATION_LANGUAGE;
			case DATA_DEFINITION_LANGUAGE_VALUE: return DATA_DEFINITION_LANGUAGE;
			case DATA_BINDING_LANGUAGE_VALUE: return DATA_BINDING_LANGUAGE;
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
	private StatementType(int value, String name, String literal) {
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

} //StatementType
