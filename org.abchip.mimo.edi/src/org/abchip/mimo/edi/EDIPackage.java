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
	 * The meta object id for the '{@link org.abchip.mimo.edi.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.impl.MessageImpl
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FRAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_ID = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BODY = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EVENT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__STATUS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.impl.MessageBodyImpl <em>Message Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.impl.MessageBodyImpl
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessageBody()
	 * @generated
	 */
	int MESSAGE_BODY = 2;

	/**
	 * The number of structural features of the '<em>Message Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BODY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.EntityCondition <em>Entity Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.EntityCondition
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityCondition()
	 * @generated
	 */
	int ENTITY_CONDITION = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.EntityEvent <em>Entity Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEntityEvent()
	 * @generated
	 */
	int ENTITY_EVENT = 4;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.MessageStatus <em>Message Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.MessageStatus
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessageStatus()
	 * @generated
	 */
	int MESSAGE_STATUS = 5;


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
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.abchip.mimo.edi.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.Message#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.edi.Message#getFrame()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.Message#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.edi.Message#getMessageId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageId();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.edi.Message#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.abchip.mimo.edi.Message#getBody()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.Message#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.abchip.mimo.edi.Message#getEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.edi.Message#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.abchip.mimo.edi.Message#getSender()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Sender();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.Message#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.edi.Message#getStatus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.MessageBody <em>Message Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Body</em>'.
	 * @see org.abchip.mimo.edi.MessageBody
	 * @generated
	 */
	EClass getMessageBody();

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
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.MessageStatus <em>Message Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Status</em>'.
	 * @see org.abchip.mimo.edi.MessageStatus
	 * @generated
	 */
	EEnum getMessageStatus();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.impl.MessageImpl
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FRAME = eINSTANCE.getMessage_Frame();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_ID = eINSTANCE.getMessage_MessageId();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__BODY = eINSTANCE.getMessage_Body();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__EVENT = eINSTANCE.getMessage_Event();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__STATUS = eINSTANCE.getMessage_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.impl.MessageBodyImpl <em>Message Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.impl.MessageBodyImpl
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessageBody()
		 * @generated
		 */
		EClass MESSAGE_BODY = eINSTANCE.getMessageBody();

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

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.MessageStatus <em>Message Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.MessageStatus
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getMessageStatus()
		 * @generated
		 */
		EEnum MESSAGE_STATUS = eINSTANCE.getMessageStatus();

	}

} //EDIPackage
