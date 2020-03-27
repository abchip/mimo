/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Serialization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.resource.ResourcePackage#getSerializationType()
 * @model
 * @generated
 */
public enum SerializationType implements Enumerator {
	/**
	 * The '<em><b>XML Metadata Interchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_METADATA_INTERCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	XML_METADATA_INTERCHANGE(10, "XML_Metadata_Interchange", "XMI"),

	/**
	 * The '<em><b>Java Script Object Notation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT_OBJECT_NOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SCRIPT_OBJECT_NOTATION(20, "JavaScript_Object_Notation", "JSON"), /**
	 * The '<em><b>Java Script Mimo Notation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT_MIMO_NOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SCRIPT_MIMO_NOTATION(30, "JavaScript_Mimo_Notation", "MIMO");

	/**
	 * The '<em><b>XML Metadata Interchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML Metadata Interchange</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_METADATA_INTERCHANGE
	 * @model name="XML_Metadata_Interchange" literal="XMI"
	 * @generated
	 * @ordered
	 */
	public static final int XML_METADATA_INTERCHANGE_VALUE = 10;

	/**
	 * The '<em><b>Java Script Object Notation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT_OBJECT_NOTATION
	 * @model name="JavaScript_Object_Notation" literal="JSON"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SCRIPT_OBJECT_NOTATION_VALUE = 20;

	/**
	 * The '<em><b>Java Script Mimo Notation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java Script Mimo Notation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT_MIMO_NOTATION
	 * @model name="JavaScript_Mimo_Notation" literal="MIMO"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SCRIPT_MIMO_NOTATION_VALUE = 30;

	/**
	 * An array of all the '<em><b>Serialization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SerializationType[] VALUES_ARRAY =
		new SerializationType[] {
			XML_METADATA_INTERCHANGE,
			JAVA_SCRIPT_OBJECT_NOTATION,
			JAVA_SCRIPT_MIMO_NOTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Serialization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SerializationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Serialization Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SerializationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SerializationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Serialization Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SerializationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SerializationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Serialization Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SerializationType get(int value) {
		switch (value) {
			case XML_METADATA_INTERCHANGE_VALUE: return XML_METADATA_INTERCHANGE;
			case JAVA_SCRIPT_OBJECT_NOTATION_VALUE: return JAVA_SCRIPT_OBJECT_NOTATION;
			case JAVA_SCRIPT_MIMO_NOTATION_VALUE: return JAVA_SCRIPT_MIMO_NOTATION;
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
	private SerializationType(int value, String name, String literal) {
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
	
} //SerializationType
