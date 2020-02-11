/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Employment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.party.party.BizPartyPackage#getEmploymentStatus()
 * @model
 * @generated
 */
public enum EmploymentStatus implements Enumerator {
	/**
	 * The '<em><b>EMPS FULLTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPS_FULLTIME_VALUE
	 * @generated
	 * @ordered
	 */
	EMPS_FULLTIME(1, "EMPS_FULLTIME", "Full-time Employed"),

	/**
	 * The '<em><b>EMPS PARTTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPS_PARTTIME_VALUE
	 * @generated
	 * @ordered
	 */
	EMPS_PARTTIME(2, "EMPS_PARTTIME", "Part-time Employed"),

	/**
	 * The '<em><b>EMPS SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPS_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	EMPS_SELF(3, "EMPS_SELF", "Self Employed");

	/**
	 * The '<em><b>EMPS FULLTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMPS FULLTIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPS_FULLTIME
	 * @model literal="Full-time Employed"
	 * @generated
	 * @ordered
	 */
	public static final int EMPS_FULLTIME_VALUE = 1;

	/**
	 * The '<em><b>EMPS PARTTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMPS PARTTIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPS_PARTTIME
	 * @model literal="Part-time Employed"
	 * @generated
	 * @ordered
	 */
	public static final int EMPS_PARTTIME_VALUE = 2;

	/**
	 * The '<em><b>EMPS SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMPS SELF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPS_SELF
	 * @model literal="Self Employed"
	 * @generated
	 * @ordered
	 */
	public static final int EMPS_SELF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Employment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EmploymentStatus[] VALUES_ARRAY =
		new EmploymentStatus[] {
			EMPS_FULLTIME,
			EMPS_PARTTIME,
			EMPS_SELF,
		};

	/**
	 * A public read-only list of all the '<em><b>Employment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EmploymentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Employment Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmploymentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmploymentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employment Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmploymentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmploymentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employment Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmploymentStatus get(int value) {
		switch (value) {
			case EMPS_FULLTIME_VALUE: return EMPS_FULLTIME;
			case EMPS_PARTTIME_VALUE: return EMPS_PARTTIME;
			case EMPS_SELF_VALUE: return EMPS_SELF;
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
	private EmploymentStatus(int value, String name, String literal) {
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
	
} //EmploymentStatus
