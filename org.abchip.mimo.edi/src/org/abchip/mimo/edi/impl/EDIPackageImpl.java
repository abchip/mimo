/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.edi.EDIFactory;
import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.EdiManager;

import org.abchip.mimo.edi.entity.EntityPackage;

import org.abchip.mimo.edi.entity.impl.EntityPackageImpl;

import org.abchip.mimo.edi.message.MessagePackage;

import org.abchip.mimo.edi.message.impl.MessagePackageImpl;

import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
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
	private EClass ediManagerEClass = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(registeredPackage instanceof MessagePackageImpl ? registeredPackage : MessagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);
		TransmissionPackageImpl theTransmissionPackage = (TransmissionPackageImpl)(registeredPackage instanceof TransmissionPackageImpl ? registeredPackage : TransmissionPackage.eINSTANCE);

		// Create package meta-data objects
		theEDIPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theTransmissionPackage.createPackageContents();

		// Initialize created meta-data
		theEDIPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theTransmissionPackage.initializePackageContents();

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
	public EClass getEdiManager() {
		return ediManagerEClass;
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
		ediManagerEClass = createEClass(EDI_MANAGER);
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
		MessagePackage theMessagePackage = (MessagePackage)EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);
		TransmissionPackage theTransmissionPackage = (TransmissionPackage)EPackage.Registry.INSTANCE.getEPackage(TransmissionPackage.eNS_URI);
		org.abchip.mimo.entity.EntityPackage theEntityPackage_1 = (org.abchip.mimo.entity.EntityPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.entity.EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEntityPackage);
		getESubpackages().add(theMessagePackage);
		getESubpackages().add(theTransmissionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ediManagerEClass, EdiManager.class, "EdiManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(ediManagerEClass, null, "writeMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEntityPackage.getEntityEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EDIPackageImpl
