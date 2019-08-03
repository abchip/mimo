/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.edi.EDIFactory
 * @model kind="package"
 * @generated
 */
public interface EDIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/edi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDIPackage eINSTANCE = org.abchip.mimo.edi.impl.EDIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.impl.EdiFrameSetupImpl <em>Edi Frame Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.impl.EdiFrameSetupImpl
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEdiFrameSetup()
	 * @generated
	 */
	int EDI_FRAME_SETUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__ENTITY_CONDITION = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__ENTITY_EVENT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edi Frame Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.EntityCondition <em>Entity Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.EntityCondition
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityCondition()
	 * @generated
	 */
	int ENTITY_CONDITION = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.EntityEvent <em>Entity Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityEvent()
	 * @generated
	 */
	int ENTITY_EVENT = 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.EdiFrameSetup <em>Edi Frame Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edi Frame Setup</em>'.
	 * @see org.abchip.mimo.edi.EdiFrameSetup
	 * @generated
	 */
	EClass getEdiFrameSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.EdiFrameSetup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.edi.EdiFrameSetup#getName()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Condition</em>'.
	 * @see org.abchip.mimo.edi.EdiFrameSetup#getEntityCondition()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_EntityCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Event</em>'.
	 * @see org.abchip.mimo.edi.EdiFrameSetup#getEntityEvent()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_EntityEvent();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.EntityCondition <em>Entity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Condition</em>'.
	 * @see org.abchip.mimo.edi.EntityCondition
	 * @generated
	 */
	EEnum getEntityCondition();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.EntityEvent <em>Entity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Event</em>'.
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @generated
	 */
	EEnum getEntityEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDIFactory getEDIFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.impl.EdiFrameSetupImpl <em>Edi Frame Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.impl.EdiFrameSetupImpl
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEdiFrameSetup()
		 * @generated
		 */
		EClass EDI_FRAME_SETUP = eINSTANCE.getEdiFrameSetup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__NAME = eINSTANCE.getEdiFrameSetup_Name();

		/**
		 * The meta object literal for the '<em><b>Entity Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__ENTITY_CONDITION = eINSTANCE.getEdiFrameSetup_EntityCondition();

		/**
		 * The meta object literal for the '<em><b>Entity Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__ENTITY_EVENT = eINSTANCE.getEdiFrameSetup_EntityEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.EntityCondition <em>Entity Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.EntityCondition
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityCondition()
		 * @generated
		 */
		EEnum ENTITY_CONDITION = eINSTANCE.getEntityCondition();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.EntityEvent <em>Entity Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.EntityEvent
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityEvent()
		 * @generated
		 */
		EEnum ENTITY_EVENT = eINSTANCE.getEntityEvent();

	}

} //EDIPackage
