/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Biz Login Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.BizPackage#getBizLoginType()
 * @model
 * @generated
 */
public enum BizLoginType implements Enumerator {
	/**
	 * The '<em><b>External Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_KEY(10, "ExternalKey", "EXTK"),

	/**
	 * The '<em><b>Json Web Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_WEB_TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_WEB_TOKEN(20, "JsonWebToken", "JWT");

	/**
	 * The '<em><b>External Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_KEY
	 * @model name="ExternalKey" literal="EXTK"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_KEY_VALUE = 10;

	/**
	 * The '<em><b>Json Web Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Json Web Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSON_WEB_TOKEN
	 * @model name="JsonWebToken" literal="JWT"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_WEB_TOKEN_VALUE = 20;

	/**
	 * An array of all the '<em><b>Login Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BizLoginType[] VALUES_ARRAY =
		new BizLoginType[] {
			EXTERNAL_KEY,
			JSON_WEB_TOKEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Login Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BizLoginType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Login Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BizLoginType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BizLoginType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Login Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BizLoginType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BizLoginType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Login Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BizLoginType get(int value) {
		switch (value) {
			case EXTERNAL_KEY_VALUE: return EXTERNAL_KEY;
			case JSON_WEB_TOKEN_VALUE: return JSON_WEB_TOKEN;
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
	private BizLoginType(int value, String name, String literal) {
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
	
} //BizLoginType