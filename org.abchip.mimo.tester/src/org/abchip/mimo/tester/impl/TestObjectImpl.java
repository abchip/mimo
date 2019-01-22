/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester.impl;

import java.util.Collection;
import java.util.List;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.abchip.mimo.tester.TestObject;

import org.abchip.mimo.tester.TesterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.impl.TestObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.impl.TestObjectImpl#getStringProperty <em>String Property</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.impl.TestObjectImpl#getIntegerProperty <em>Integer Property</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.impl.TestObjectImpl#getObjectReference <em>Object Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.tester.impl.TestObjectImpl#getObjectReferences <em>Object References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestObjectImpl extends EntityNameableImpl implements TestObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringProperty() <em>String Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringProperty() <em>String Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProperty()
	 * @generated
	 * @ordered
	 */
	protected String stringProperty = STRING_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegerProperty() <em>Integer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerProperty()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEGER_PROPERTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntegerProperty() <em>Integer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerProperty()
	 * @generated
	 * @ordered
	 */
	protected int integerProperty = INTEGER_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectReference() <em>Object Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectReference()
	 * @generated
	 * @ordered
	 */
	protected TestObject objectReference;

	/**
	 * The cached value of the '{@link #getObjectReferences() <em>Object References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<TestObject> objectReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesterPackage.Literals.TEST_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesterPackage.TEST_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringProperty() {
		return stringProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringProperty(String newStringProperty) {
		String oldStringProperty = stringProperty;
		stringProperty = newStringProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesterPackage.TEST_OBJECT__STRING_PROPERTY, oldStringProperty, stringProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntegerProperty() {
		return integerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerProperty(int newIntegerProperty) {
		int oldIntegerProperty = integerProperty;
		integerProperty = newIntegerProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesterPackage.TEST_OBJECT__INTEGER_PROPERTY, oldIntegerProperty, integerProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestObject getObjectReference() {
		if (objectReference != null && ((EObject)objectReference).eIsProxy()) {
			InternalEObject oldObjectReference = (InternalEObject)objectReference;
			objectReference = (TestObject)eResolveProxy(oldObjectReference);
			if (objectReference != oldObjectReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesterPackage.TEST_OBJECT__OBJECT_REFERENCE, oldObjectReference, objectReference));
			}
		}
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestObject basicGetObjectReference() {
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectReference(TestObject newObjectReference) {
		TestObject oldObjectReference = objectReference;
		objectReference = newObjectReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesterPackage.TEST_OBJECT__OBJECT_REFERENCE, oldObjectReference, objectReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TestObject> getObjectReferences() {
		if (objectReferences == null) {
			objectReferences = new EObjectResolvingEList<TestObject>(TestObject.class, this, TesterPackage.TEST_OBJECT__OBJECT_REFERENCES);
		}
		return objectReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TesterPackage.TEST_OBJECT__NAME:
				return getName();
			case TesterPackage.TEST_OBJECT__STRING_PROPERTY:
				return getStringProperty();
			case TesterPackage.TEST_OBJECT__INTEGER_PROPERTY:
				return getIntegerProperty();
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCE:
				if (resolve) return getObjectReference();
				return basicGetObjectReference();
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCES:
				return getObjectReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TesterPackage.TEST_OBJECT__NAME:
				setName((String)newValue);
				return;
			case TesterPackage.TEST_OBJECT__STRING_PROPERTY:
				setStringProperty((String)newValue);
				return;
			case TesterPackage.TEST_OBJECT__INTEGER_PROPERTY:
				setIntegerProperty((Integer)newValue);
				return;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCE:
				setObjectReference((TestObject)newValue);
				return;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCES:
				getObjectReferences().clear();
				getObjectReferences().addAll((Collection<? extends TestObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TesterPackage.TEST_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TesterPackage.TEST_OBJECT__STRING_PROPERTY:
				setStringProperty(STRING_PROPERTY_EDEFAULT);
				return;
			case TesterPackage.TEST_OBJECT__INTEGER_PROPERTY:
				setIntegerProperty(INTEGER_PROPERTY_EDEFAULT);
				return;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCE:
				setObjectReference((TestObject)null);
				return;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCES:
				getObjectReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TesterPackage.TEST_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TesterPackage.TEST_OBJECT__STRING_PROPERTY:
				return STRING_PROPERTY_EDEFAULT == null ? stringProperty != null : !STRING_PROPERTY_EDEFAULT.equals(stringProperty);
			case TesterPackage.TEST_OBJECT__INTEGER_PROPERTY:
				return integerProperty != INTEGER_PROPERTY_EDEFAULT;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCE:
				return objectReference != null;
			case TesterPackage.TEST_OBJECT__OBJECT_REFERENCES:
				return objectReferences != null && !objectReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", stringProperty: ");
		result.append(stringProperty);
		result.append(", integerProperty: ");
		result.append(integerProperty);
		result.append(')');
		return result.toString();
	}

} //TestObjectImpl
