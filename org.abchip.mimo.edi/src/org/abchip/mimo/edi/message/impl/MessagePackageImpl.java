/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.entity.impl.EntityPackageImpl;
import org.abchip.mimo.edi.impl.EDIPackageImpl;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageBody;
import org.abchip.mimo.edi.message.MessageFactory;
import org.abchip.mimo.edi.message.MessagePackage;
import org.abchip.mimo.edi.message.MessageReceived;
import org.abchip.mimo.edi.message.MessageSent;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.edi.message.MessageType;

import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl;
import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagePackageImpl extends EPackageImpl implements MessagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReceivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.edi.message.MessagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MessagePackageImpl() {
		super(eNS_URI, MessageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MessagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MessagePackage init() {
		if (isInited) return (MessagePackage)EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMessagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MessagePackageImpl theMessagePackage = registeredMessagePackage instanceof MessagePackageImpl ? (MessagePackageImpl)registeredMessagePackage : new MessagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDIPackage.eNS_URI);
		EDIPackageImpl theEDIPackage = (EDIPackageImpl)(registeredPackage instanceof EDIPackageImpl ? registeredPackage : EDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.edi.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.edi.entity.EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);
		TransmissionPackageImpl theTransmissionPackage = (TransmissionPackageImpl)(registeredPackage instanceof TransmissionPackageImpl ? registeredPackage : TransmissionPackage.eINSTANCE);

		// Create package meta-data objects
		theMessagePackage.createPackageContents();
		theEDIPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theTransmissionPackage.createPackageContents();

		// Initialize created meta-data
		theMessagePackage.initializePackageContents();
		theEDIPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theTransmissionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMessagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MessagePackage.eNS_URI, theMessagePackage);
		return theMessagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_MessageId() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_MessageType() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Body() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageBody() {
		return messageBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageBody_Contents() {
		return (EReference)messageBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageSent() {
		return messageSentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Event() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Status() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Sender() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_FrameId() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_EntityId() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageReceived() {
		return messageReceivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageType_Name() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageType_Text() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageType_TransmissionType() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageType_Encrypt() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageType_TransmissionOnWrite() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageStatus() {
		return messageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageFactory getMessageFactory() {
		return (MessageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_ID);
		createEAttribute(messageEClass, MESSAGE__STATUS);
		createEAttribute(messageEClass, MESSAGE__SENDER);
		createEAttribute(messageEClass, MESSAGE__FRAME_ID);
		createEAttribute(messageEClass, MESSAGE__ENTITY_ID);
		createEAttribute(messageEClass, MESSAGE__EVENT);
		createEReference(messageEClass, MESSAGE__MESSAGE_TYPE);
		createEReference(messageEClass, MESSAGE__BODY);

		messageBodyEClass = createEClass(MESSAGE_BODY);
		createEReference(messageBodyEClass, MESSAGE_BODY__CONTENTS);

		messageSentEClass = createEClass(MESSAGE_SENT);

		messageReceivedEClass = createEClass(MESSAGE_RECEIVED);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__NAME);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__TEXT);
		createEReference(messageTypeEClass, MESSAGE_TYPE__TRANSMISSION_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__ENCRYPT);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__TRANSMISSION_ON_WRITE);

		// Create enums
		messageStatusEEnum = createEEnum(MESSAGE_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage_1 = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		org.abchip.mimo.edi.entity.EntityPackage theEntityPackage = (org.abchip.mimo.edi.entity.EntityPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.edi.entity.EntityPackage.eNS_URI);
		TransmissionPackage theTransmissionPackage = (TransmissionPackage)EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getMessageType());
		g1.getETypeArguments().add(g2);
		messageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		messageEClass.getEGenericSuperTypes().add(g1);
		messageBodyEClass.getESuperTypes().add(theEntityPackage_1.getEntity());
		messageSentEClass.getESuperTypes().add(this.getMessage());
		messageReceivedEClass.getESuperTypes().add(this.getMessage());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getMessage());
		g1.getETypeArguments().add(g2);
		messageTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		messageTypeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_MessageId(), ecorePackage.getEString(), "messageId", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Status(), this.getMessageStatus(), "status", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Sender(), ecorePackage.getEString(), "sender", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_FrameId(), ecorePackage.getEString(), "frameId", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_EntityId(), ecorePackage.getEString(), "entityId", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Event(), theEntityPackage.getEntityEvent(), "event", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_MessageType(), this.getMessageType(), null, "messageType", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Body(), this.getMessageBody(), null, "body", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBodyEClass, MessageBody.class, "MessageBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageBody_Contents(), theEntityPackage_1.getEntityIdentifiable(), null, "contents", null, 0, -1, MessageBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSentEClass, MessageSent.class, "MessageSent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageReceivedEClass, MessageReceived.class, "MessageReceived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_Name(), ecorePackage.getEString(), "name", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Text(), ecorePackage.getEString(), "text", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageType_TransmissionType(), theTransmissionPackage.getTransmissionType(), null, "transmissionType", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Encrypt(), ecorePackage.getEBoolean(), "encrypt", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_TransmissionOnWrite(), ecorePackage.getEBoolean(), "transmissionOnWrite", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageStatusEEnum, MessageStatus.class, "MessageStatus");
		addEEnumLiteral(messageStatusEEnum, MessageStatus.READY);
		addEEnumLiteral(messageStatusEEnum, MessageStatus.TRASMITTED);
		addEEnumLiteral(messageStatusEEnum, MessageStatus.ERROR);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-frame</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentframeAnnotations() {
		String source = "mimo-ent-frame";
		addAnnotation
		  (messageSentEClass,
		   source,
		   new String[] {
			   "autoIncrement", "true"
		   });
		addAnnotation
		  (messageReceivedEClass,
		   source,
		   new String[] {
			   "autoIncrement", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-slot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentslotAnnotations() {
		String source = "mimo-ent-slot";
		addAnnotation
		  (getMessage_MessageId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-domain</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentdomainAnnotations() {
		String source = "mimo-ent-domain";
		addAnnotation
		  (getMessage_Sender(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getMessage_FrameId(),
		   source,
		   new String[] {
			   "frame", "Frame"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //MessagePackageImpl
