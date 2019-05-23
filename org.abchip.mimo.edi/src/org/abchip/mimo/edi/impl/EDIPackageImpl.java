/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.edi.EDIFactory;
import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.EdiFrameSetup;

import org.abchip.mimo.edi.EntityCondition;
import org.abchip.mimo.edi.EntityEvent;
import org.abchip.mimo.edi.Message;
import org.abchip.mimo.edi.MessageBody;
import org.abchip.mimo.edi.MessageStatus;
import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDIPackageImpl extends EPackageImpl implements EDIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ediFrameSetupEClass = null;

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
	private EEnum entityConditionEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityEventEEnum = null;

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
	 * @see org.abchip.mimo.edi.EDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EDIPackageImpl() {
		super(eNS_URI, EDIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EDIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EDIPackage init() {
		if (isInited) return (EDIPackage)EPackage.Registry.INSTANCE.getEPackage(EDIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEDIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EDIPackageImpl theEDIPackage = registeredEDIPackage instanceof EDIPackageImpl ? (EDIPackageImpl)registeredEDIPackage : new EDIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEDIPackage.createPackageContents();

		// Initialize created meta-data
		theEDIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEDIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EDIPackage.eNS_URI, theEDIPackage);
		return theEDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdiFrameSetup() {
		return ediFrameSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_Name() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_EntityCondition() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_EntityEvent() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(2);
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
	public EReference getMessage_Body() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Event() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Sender() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Status() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
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
	public EEnum getEntityCondition() {
		return entityConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntityEvent() {
		return entityEventEEnum;
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
	public EDIFactory getEDIFactory() {
		return (EDIFactory)getEFactoryInstance();
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
		ediFrameSetupEClass = createEClass(EDI_FRAME_SETUP);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__NAME);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__ENTITY_CONDITION);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__ENTITY_EVENT);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_ID);
		createEReference(messageEClass, MESSAGE__BODY);
		createEAttribute(messageEClass, MESSAGE__EVENT);
		createEReference(messageEClass, MESSAGE__SENDER);
		createEAttribute(messageEClass, MESSAGE__STATUS);

		messageBodyEClass = createEClass(MESSAGE_BODY);

		// Create enums
		entityConditionEEnum = createEEnum(ENTITY_CONDITION);
		entityEventEEnum = createEEnum(ENTITY_EVENT);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ediFrameSetupEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		messageEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		messageBodyEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(ediFrameSetupEClass, EdiFrameSetup.class, "EdiFrameSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdiFrameSetup_Name(), ecorePackage.getEString(), "name", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_EntityCondition(), this.getEntityCondition(), "entityCondition", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_EntityEvent(), this.getEntityEvent(), "entityEvent", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_MessageId(), ecorePackage.getEString(), "messageId", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Body(), this.getMessageBody(), null, "body", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Event(), this.getEntityEvent(), "event", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Sender(), theEntityPackage.getEntityName(), null, "sender", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Status(), this.getMessageStatus(), "status", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBodyEClass, MessageBody.class, "MessageBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(entityConditionEEnum, EntityCondition.class, "EntityCondition");
		addEEnumLiteral(entityConditionEEnum, EntityCondition.ALL);
		addEEnumLiteral(entityConditionEEnum, EntityCondition.SELECTED);
		addEEnumLiteral(entityConditionEEnum, EntityCondition.SCRIPT);

		initEEnum(entityEventEEnum, EntityEvent.class, "EntityEvent");
		addEEnumLiteral(entityEventEEnum, EntityEvent.ALL);
		addEEnumLiteral(entityEventEEnum, EntityEvent.CREATE);
		addEEnumLiteral(entityEventEEnum, EntityEvent.UPDATE);
		addEEnumLiteral(entityEventEEnum, EntityEvent.DELETE);

		initEEnum(messageStatusEEnum, MessageStatus.class, "MessageStatus");
		addEEnumLiteral(messageStatusEEnum, MessageStatus.TRASMITTED);
		addEEnumLiteral(messageStatusEEnum, MessageStatus.ERROR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent
		createMimoentAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentAnnotations() {
		String source = "mimo-ent";
		addAnnotation
		  (getEdiFrameSetup_Name(),
		   source,
		   new String[] {
			   "frame", "frame"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //EDIPackageImpl
