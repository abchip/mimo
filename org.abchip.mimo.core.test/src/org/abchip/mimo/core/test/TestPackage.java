/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.core.test;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.core.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.abchip.mimo.core.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.core.test.impl.ObjectAImpl <em>Object A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.core.test.impl.ObjectAImpl
	 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getObjectA()
	 * @generated
	 */
	int OBJECT_A = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_A__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_A__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_A__OBJECT_B = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_A_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.core.test.impl.ObjectBImpl <em>Object B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.core.test.impl.ObjectBImpl
	 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getObjectB()
	 * @generated
	 */
	int OBJECT_B = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_B__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_B__ENUM1 = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_B_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.core.test.Enum1 <em>Enum1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.core.test.Enum1
	 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getEnum1()
	 * @generated
	 */
	int ENUM1 = 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.core.test.ObjectA <em>Object A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object A</em>'.
	 * @see org.abchip.mimo.core.test.ObjectA
	 * @generated
	 */
	EClass getObjectA();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.core.test.ObjectA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.core.test.ObjectA#getName()
	 * @see #getObjectA()
	 * @generated
	 */
	EAttribute getObjectA_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.core.test.ObjectA#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.core.test.ObjectA#getText()
	 * @see #getObjectA()
	 * @generated
	 */
	EAttribute getObjectA_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.core.test.ObjectA#getObjectB <em>Object B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object B</em>'.
	 * @see org.abchip.mimo.core.test.ObjectA#getObjectB()
	 * @see #getObjectA()
	 * @generated
	 */
	EReference getObjectA_ObjectB();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.core.test.ObjectB <em>Object B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object B</em>'.
	 * @see org.abchip.mimo.core.test.ObjectB
	 * @generated
	 */
	EClass getObjectB();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.core.test.ObjectB#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.core.test.ObjectB#getName()
	 * @see #getObjectB()
	 * @generated
	 */
	EAttribute getObjectB_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.core.test.ObjectB#getEnum1 <em>Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum1</em>'.
	 * @see org.abchip.mimo.core.test.ObjectB#getEnum1()
	 * @see #getObjectB()
	 * @generated
	 */
	EAttribute getObjectB_Enum1();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.core.test.Enum1 <em>Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum1</em>'.
	 * @see org.abchip.mimo.core.test.Enum1
	 * @generated
	 */
	EEnum getEnum1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.core.test.impl.ObjectAImpl <em>Object A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.core.test.impl.ObjectAImpl
		 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getObjectA()
		 * @generated
		 */
		EClass OBJECT_A = eINSTANCE.getObjectA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_A__NAME = eINSTANCE.getObjectA_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_A__TEXT = eINSTANCE.getObjectA_Text();

		/**
		 * The meta object literal for the '<em><b>Object B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_A__OBJECT_B = eINSTANCE.getObjectA_ObjectB();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.core.test.impl.ObjectBImpl <em>Object B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.core.test.impl.ObjectBImpl
		 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getObjectB()
		 * @generated
		 */
		EClass OBJECT_B = eINSTANCE.getObjectB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_B__NAME = eINSTANCE.getObjectB_Name();

		/**
		 * The meta object literal for the '<em><b>Enum1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_B__ENUM1 = eINSTANCE.getObjectB_Enum1();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.core.test.Enum1 <em>Enum1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.core.test.Enum1
		 * @see org.abchip.mimo.core.test.impl.TestPackageImpl#getEnum1()
		 * @generated
		 */
		EEnum ENUM1 = eINSTANCE.getEnum1();

	}

} //TestPackage
