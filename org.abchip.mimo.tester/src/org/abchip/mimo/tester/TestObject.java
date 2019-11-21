/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getStringProperty <em>String Property</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getIntegerProperty <em>Integer Property</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getObjectReference <em>Object Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getObjectReferences <em>Object References</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.TestObject#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.tester.TesterPackage#getTestObject()
 * @model
 * @generated
 */
public interface TestObject extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>String Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Property</em>' attribute.
	 * @see #setStringProperty(String)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_StringProperty()
	 * @model
	 * @generated
	 */
	String getStringProperty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestObject#getStringProperty <em>String Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Property</em>' attribute.
	 * @see #getStringProperty()
	 * @generated
	 */
	void setStringProperty(String value);

	/**
	 * Returns the value of the '<em><b>Integer Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Property</em>' attribute.
	 * @see #setIntegerProperty(int)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_IntegerProperty()
	 * @model
	 * @generated
	 */
	int getIntegerProperty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestObject#getIntegerProperty <em>Integer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Property</em>' attribute.
	 * @see #getIntegerProperty()
	 * @generated
	 */
	void setIntegerProperty(int value);

	/**
	 * Returns the value of the '<em><b>Object Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Reference</em>' reference.
	 * @see #setObjectReference(TestObject)
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_ObjectReference()
	 * @model
	 * @generated
	 */
	TestObject getObjectReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.tester.TestObject#getObjectReference <em>Object Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Reference</em>' reference.
	 * @see #getObjectReference()
	 * @generated
	 */
	void setObjectReference(TestObject value);

	/**
	 * Returns the value of the '<em><b>Object References</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.tester.TestObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object References</em>' reference list.
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_ObjectReferences()
	 * @model
	 * @generated
	 */
	List<TestObject> getObjectReferences();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.abchip.mimo.tester.TesterPackage#getTestObject_Values()
	 * @model
	 * @generated
	 */
	List<String> getValues();

} // QTestObject
