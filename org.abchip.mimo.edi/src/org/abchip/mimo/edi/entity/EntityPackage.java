/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.entity;

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
 * @see org.abchip.mimo.edi.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/edi/entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-edi-ent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityPackage eINSTANCE = org.abchip.mimo.edi.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl <em>Edi Frame Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl
	 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEdiFrameSetup()
	 * @generated
	 */
	int EDI_FRAME_SETUP = 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__MESSAGE_TYPE = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__FRAME = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__ENTITY_CONDITION = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__ENTITY_EVENT = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP__ENCRYPT = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Edi Frame Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FRAME_SETUP_FEATURE_COUNT = org.abchip.mimo.entity.EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.entity.EntityCondition <em>Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.entity.EntityCondition
	 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEntityCondition()
	 * @generated
	 */
	int ENTITY_CONDITION = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.entity.EntityEvent <em>Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.entity.EntityEvent
	 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEntityEvent()
	 * @generated
	 */
	int ENTITY_EVENT = 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.entity.EdiFrameSetup <em>Edi Frame Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edi Frame Setup</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup
	 * @generated
	 */
	EClass getEdiFrameSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup#getMessageType()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup#getFrame()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Condition</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityCondition()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_EntityCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Event</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityEvent()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_EntityEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see org.abchip.mimo.edi.entity.EdiFrameSetup#isEncrypt()
	 * @see #getEdiFrameSetup()
	 * @generated
	 */
	EAttribute getEdiFrameSetup_Encrypt();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.entity.EntityCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition</em>'.
	 * @see org.abchip.mimo.edi.entity.EntityCondition
	 * @generated
	 */
	EEnum getEntityCondition();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.entity.EntityEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event</em>'.
	 * @see org.abchip.mimo.edi.entity.EntityEvent
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
	EntityFactory getEntityFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl <em>Edi Frame Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl
		 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEdiFrameSetup()
		 * @generated
		 */
		EClass EDI_FRAME_SETUP = eINSTANCE.getEdiFrameSetup();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__MESSAGE_TYPE = eINSTANCE.getEdiFrameSetup_MessageType();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__FRAME = eINSTANCE.getEdiFrameSetup_Frame();

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
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDI_FRAME_SETUP__ENCRYPT = eINSTANCE.getEdiFrameSetup_Encrypt();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.entity.EntityCondition <em>Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.entity.EntityCondition
		 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEntityCondition()
		 * @generated
		 */
		EEnum ENTITY_CONDITION = eINSTANCE.getEntityCondition();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.entity.EntityEvent <em>Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.entity.EntityEvent
		 * @see org.abchip.mimo.edi.entity.impl.EntityPackageImpl#getEntityEvent()
		 * @generated
		 */
		EEnum ENTITY_EVENT = eINSTANCE.getEntityEvent();

	}

} //EntityPackage
