/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

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
 * @see org.abchip.mimo.edi.message.MessageFactory
 * @model kind="package"
 * @generated
 */
public interface MessagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "message";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/biz/edi/message";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-edi-message";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagePackage eINSTANCE = org.abchip.mimo.edi.message.impl.MessagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.impl.MessageImpl
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_TYPE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frame Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FRAME_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BODY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EVENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sender Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.impl.MessageBodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.impl.MessageBodyImpl
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageBody()
	 * @generated
	 */
	int MESSAGE_BODY = 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BODY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.impl.MessageReceivedImpl <em>Received</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.impl.MessageReceivedImpl
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageReceived()
	 * @generated
	 */
	int MESSAGE_RECEIVED = 2;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__MESSAGE_ID = MESSAGE__MESSAGE_ID;

	/**
	 * The feature id for the '<em><b>Message Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__MESSAGE_TYPE_ID = MESSAGE__MESSAGE_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Frame Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__FRAME_ID = MESSAGE__FRAME_ID;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__BODY = MESSAGE__BODY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__EVENT = MESSAGE__EVENT;

	/**
	 * The feature id for the '<em><b>Sender Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__SENDER_ID = MESSAGE__SENDER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__STATUS = MESSAGE__STATUS;

	/**
	 * The number of structural features of the '<em>Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.impl.MessageSentImpl <em>Sent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.impl.MessageSentImpl
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageSent()
	 * @generated
	 */
	int MESSAGE_SENT = 3;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__MESSAGE_ID = MESSAGE__MESSAGE_ID;

	/**
	 * The feature id for the '<em><b>Message Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__MESSAGE_TYPE_ID = MESSAGE__MESSAGE_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Frame Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__FRAME_ID = MESSAGE__FRAME_ID;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__BODY = MESSAGE__BODY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__EVENT = MESSAGE__EVENT;

	/**
	 * The feature id for the '<em><b>Sender Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__SENDER_ID = MESSAGE__SENDER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT__STATUS = MESSAGE__STATUS;

	/**
	 * The number of structural features of the '<em>Sent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENT_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.impl.MessageTypeImpl
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.message.MessageStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.message.MessageStatus
	 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageStatus()
	 * @generated
	 */
	int MESSAGE_STATUS = 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.message.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.abchip.mimo.edi.message.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getMessageId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getMessageTypeId <em>Message Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type Id</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getMessageTypeId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getFrameId <em>Frame Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Id</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getFrameId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_FrameId();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.edi.message.Message#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getBody()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getSenderId <em>Sender Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender Id</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getSenderId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SenderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.message.Message#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.edi.message.Message#getStatus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.message.MessageBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.abchip.mimo.edi.message.MessageBody
	 * @generated
	 */
	EClass getMessageBody();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.message.MessageReceived <em>Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Received</em>'.
	 * @see org.abchip.mimo.edi.message.MessageReceived
	 * @generated
	 */
	EClass getMessageReceived();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.message.MessageSent <em>Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sent</em>'.
	 * @see org.abchip.mimo.edi.message.MessageSent
	 * @generated
	 */
	EClass getMessageSent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.message.MessageType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.edi.message.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.edi.message.MessageStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.abchip.mimo.edi.message.MessageStatus
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
	MessageFactory getMessageFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.impl.MessageImpl
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_ID = eINSTANCE.getMessage_MessageId();

		/**
		 * The meta object literal for the '<em><b>Message Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_TYPE_ID = eINSTANCE.getMessage_MessageTypeId();

		/**
		 * The meta object literal for the '<em><b>Frame Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FRAME_ID = eINSTANCE.getMessage_FrameId();

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
		 * The meta object literal for the '<em><b>Sender Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SENDER_ID = eINSTANCE.getMessage_SenderId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__STATUS = eINSTANCE.getMessage_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.impl.MessageBodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.impl.MessageBodyImpl
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageBody()
		 * @generated
		 */
		EClass MESSAGE_BODY = eINSTANCE.getMessageBody();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.impl.MessageReceivedImpl <em>Received</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.impl.MessageReceivedImpl
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageReceived()
		 * @generated
		 */
		EClass MESSAGE_RECEIVED = eINSTANCE.getMessageReceived();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.impl.MessageSentImpl <em>Sent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.impl.MessageSentImpl
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageSent()
		 * @generated
		 */
		EClass MESSAGE_SENT = eINSTANCE.getMessageSent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.impl.MessageTypeImpl
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.message.MessageStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.message.MessageStatus
		 * @see org.abchip.mimo.edi.message.impl.MessagePackageImpl#getMessageStatus()
		 * @generated
		 */
		EEnum MESSAGE_STATUS = eINSTANCE.getMessageStatus();

	}

} //MessagePackage
