/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.mining.MiningFactory;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.MiningPackage;

import org.abchip.mimo.mining.classification.ClassificationPackage;

import org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl;

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
public class MiningPackageImpl extends EPackageImpl implements MiningPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningManagerEClass = null;

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
	 * @see org.abchip.mimo.mining.MiningPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiningPackageImpl() {
		super(eNS_URI, MiningFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MiningPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiningPackage init() {
		if (isInited) return (MiningPackage)EPackage.Registry.INSTANCE.getEPackage(MiningPackage.eNS_URI);

		// Obtain or create and register package
		MiningPackageImpl theMiningPackage = (MiningPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiningPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiningPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);

		// Create package meta-data objects
		theMiningPackage.createPackageContents();
		theClassificationPackage.createPackageContents();

		// Initialize created meta-data
		theMiningPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiningPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiningPackage.eNS_URI, theMiningPackage);
		return theMiningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningManager() {
		return miningManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFactory getMiningFactory() {
		return (MiningFactory)getEFactoryInstance();
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
		miningManagerEClass = createEClass(MINING_MANAGER);
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
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theClassificationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(miningManagerEClass, MiningManager.class, "MiningManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(miningManagerEClass, null, "classify", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		EGenericType g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theClassificationPackage.getClassification());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Create resource
		createResource(eNS_URI);
	}

} //MiningPackageImpl
