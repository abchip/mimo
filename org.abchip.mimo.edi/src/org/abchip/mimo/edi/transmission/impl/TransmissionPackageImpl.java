/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.edi.EDIPackage;

import org.abchip.mimo.edi.entity.EntityPackage;

import org.abchip.mimo.edi.entity.impl.EntityPackageImpl;

import org.abchip.mimo.edi.impl.EDIPackageImpl;

import org.abchip.mimo.edi.message.MessagePackage;

import org.abchip.mimo.edi.message.impl.MessagePackageImpl;

import org.abchip.mimo.edi.transmission.Transmission;
import org.abchip.mimo.edi.transmission.TransmissionFactory;
import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.edi.transmission.TransmissionType;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransmissionPackageImpl extends EPackageImpl implements TransmissionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionTypeEClass = null;

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
	 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransmissionPackageImpl() {
		super(eNS_URI, TransmissionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransmissionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransmissionPackage init() {
		if (isInited) return (TransmissionPackage)EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTransmissionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TransmissionPackageImpl theTransmissionPackage = registeredTransmissionPackage instanceof TransmissionPackageImpl ? (TransmissionPackageImpl)registeredTransmissionPackage : new TransmissionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDIPackage.eNS_URI);
		EDIPackageImpl theEDIPackage = (EDIPackageImpl)(registeredPackage instanceof EDIPackageImpl ? registeredPackage : EDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(registeredPackage instanceof MessagePackageImpl ? registeredPackage : MessagePackage.eINSTANCE);

		// Create package meta-data objects
		theTransmissionPackage.createPackageContents();
		theEDIPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theMessagePackage.createPackageContents();

		// Initialize created meta-data
		theTransmissionPackage.initializePackageContents();
		theEDIPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theMessagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransmissionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransmissionPackage.eNS_URI, theTransmissionPackage);
		return theTransmissionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransmission() {
		return transmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmission_TransmissionId() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmission_TransmissionType() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransmissionType() {
		return transmissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmissionType_Name() {
		return (EAttribute)transmissionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionFactory getTransmissionFactory() {
		return (TransmissionFactory)getEFactoryInstance();
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
		transmissionEClass = createEClass(TRANSMISSION);
		createEAttribute(transmissionEClass, TRANSMISSION__TRANSMISSION_ID);
		createEAttribute(transmissionEClass, TRANSMISSION__TRANSMISSION_TYPE);

		transmissionTypeEClass = createEClass(TRANSMISSION_TYPE);
		createEAttribute(transmissionTypeEClass, TRANSMISSION_TYPE__NAME);
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
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getTransmissionType());
		g1.getETypeArguments().add(g2);
		transmissionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		transmissionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getTransmission());
		g1.getETypeArguments().add(g2);
		transmissionTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		transmissionTypeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(transmissionEClass, Transmission.class, "Transmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransmission_TransmissionId(), ecorePackage.getEString(), "transmissionId", null, 1, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmission_TransmissionType(), ecorePackage.getEString(), "transmissionType", null, 1, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transmissionEClass, ecorePackage.getEString(), "messageTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transmissionTypeEClass, TransmissionType.class, "TransmissionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransmissionType_Name(), ecorePackage.getEString(), "name", null, 1, 1, TransmissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transmissionTypeEClass, ecorePackage.getEString(), "transmissions", 0, -1, IS_UNIQUE, IS_ORDERED);

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
		  (transmissionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getTransmission_TransmissionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (transmissionTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
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
		  (transmissionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "MessageType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getTransmission_TransmissionType(),
		   source,
		   new String[] {
			   "frame", "TransmissionType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (transmissionTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Transmission",
			   "route", "transmissionType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //TransmissionPackageImpl
