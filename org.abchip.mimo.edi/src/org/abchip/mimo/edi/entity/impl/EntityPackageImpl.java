/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.entity.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityCondition;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.entity.EntityFactory;
import org.abchip.mimo.edi.entity.EntityPackage;

import org.abchip.mimo.edi.impl.EDIPackageImpl;
import org.abchip.mimo.edi.message.MessagePackage;

import org.abchip.mimo.edi.message.impl.MessagePackageImpl;

import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityPackageImpl extends EPackageImpl implements EntityPackage {
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
	private EEnum entityConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityEventEEnum = null;

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
	 * @see org.abchip.mimo.edi.entity.EntityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntityPackageImpl() {
		super(eNS_URI, EntityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EntityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntityPackage init() {
		if (isInited) return (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEntityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EntityPackageImpl theEntityPackage = registeredEntityPackage instanceof EntityPackageImpl ? (EntityPackageImpl)registeredEntityPackage : new EntityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDIPackage.eNS_URI);
		EDIPackageImpl theEDIPackage = (EDIPackageImpl)(registeredPackage instanceof EDIPackageImpl ? registeredPackage : EDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(registeredPackage instanceof MessagePackageImpl ? registeredPackage : MessagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);
		TransmissionPackageImpl theTransmissionPackage = (TransmissionPackageImpl)(registeredPackage instanceof TransmissionPackageImpl ? registeredPackage : TransmissionPackage.eINSTANCE);

		// Create package meta-data objects
		theEntityPackage.createPackageContents();
		theEDIPackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theTransmissionPackage.createPackageContents();

		// Initialize created meta-data
		theEntityPackage.initializePackageContents();
		theEDIPackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theTransmissionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, theEntityPackage);
		return theEntityPackage;
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
	public EAttribute getEdiFrameSetup_MessageType() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_Frame() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_EntityCondition() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_EntityEvent() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdiFrameSetup_Encrypt() {
		return (EAttribute)ediFrameSetupEClass.getEStructuralFeatures().get(4);
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
	public EntityFactory getEntityFactory() {
		return (EntityFactory)getEFactoryInstance();
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
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__MESSAGE_TYPE);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__FRAME);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__ENTITY_CONDITION);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__ENTITY_EVENT);
		createEAttribute(ediFrameSetupEClass, EDI_FRAME_SETUP__ENCRYPT);

		// Create enums
		entityConditionEEnum = createEEnum(ENTITY_CONDITION);
		entityEventEEnum = createEEnum(ENTITY_EVENT);
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
		org.abchip.mimo.entity.EntityPackage theEntityPackage_1 = (org.abchip.mimo.entity.EntityPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.entity.EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ediFrameSetupEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(ediFrameSetupEClass, EdiFrameSetup.class, "EdiFrameSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdiFrameSetup_MessageType(), ecorePackage.getEString(), "messageType", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_Frame(), ecorePackage.getEString(), "frame", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_EntityCondition(), this.getEntityCondition(), "entityCondition", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_EntityEvent(), this.getEntityEvent(), "entityEvent", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdiFrameSetup_Encrypt(), ecorePackage.getEBoolean(), "encrypt", null, 1, 1, EdiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
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
		  (getEdiFrameSetup_MessageType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getEdiFrameSetup_Frame(),
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
		  (getEdiFrameSetup_MessageType(),
		   source,
		   new String[] {
			   "frame", "MessageType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getEdiFrameSetup_Frame(),
		   source,
		   new String[] {
			   "frame", "Frame"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //EntityPackageImpl
