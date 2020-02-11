/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFactoryImpl extends EFactoryImpl implements TestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestFactory init() {
		try {
			TestFactory theTestFactory = (TestFactory)EPackage.Registry.INSTANCE.getEFactory(TestPackage.eNS_URI);
			if (theTestFactory != null) {
				return theTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestPackage.TEST_FIELD_TYPE: return (EObject)createTestFieldType();
			case TestPackage.TESTING: return (EObject)createTesting();
			case TestPackage.TESTING_CRYPTO: return (EObject)createTestingCrypto();
			case TestPackage.TESTING_ITEM: return (EObject)createTestingItem();
			case TestPackage.TESTING_NODE: return (EObject)createTestingNode();
			case TestPackage.TESTING_NODE_MEMBER: return (EObject)createTestingNodeMember();
			case TestPackage.TESTING_REMOVE_ALL: return (EObject)createTestingRemoveAll();
			case TestPackage.TESTING_STATUS: return (EObject)createTestingStatus();
			case TestPackage.TESTING_SUBTYPE: return (EObject)createTestingSubtype();
			case TestPackage.TESTING_TYPE: return (EObject)createTestingType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestFieldType createTestFieldType() {
		TestFieldTypeImpl testFieldType = new TestFieldTypeImpl();
		return testFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing createTesting() {
		TestingImpl testing = new TestingImpl();
		return testing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingCrypto createTestingCrypto() {
		TestingCryptoImpl testingCrypto = new TestingCryptoImpl();
		return testingCrypto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingItem createTestingItem() {
		TestingItemImpl testingItem = new TestingItemImpl();
		return testingItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingNode createTestingNode() {
		TestingNodeImpl testingNode = new TestingNodeImpl();
		return testingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingNodeMember createTestingNodeMember() {
		TestingNodeMemberImpl testingNodeMember = new TestingNodeMemberImpl();
		return testingNodeMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingRemoveAll createTestingRemoveAll() {
		TestingRemoveAllImpl testingRemoveAll = new TestingRemoveAllImpl();
		return testingRemoveAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingStatus createTestingStatus() {
		TestingStatusImpl testingStatus = new TestingStatusImpl();
		return testingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingSubtype createTestingSubtype() {
		TestingSubtypeImpl testingSubtype = new TestingSubtypeImpl();
		return testingSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingType createTestingType() {
		TestingTypeImpl testingType = new TestingTypeImpl();
		return testingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestPackage getTestPackage() {
		return (TestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestPackage getPackage() {
		return TestPackage.eINSTANCE;
	}

} //TestFactoryImpl
