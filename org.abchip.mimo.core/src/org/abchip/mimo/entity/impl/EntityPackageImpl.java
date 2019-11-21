/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.data.DataPackage;

import org.abchip.mimo.data.impl.DataPackageImpl;

import org.abchip.mimo.entity.Cardinality;
import org.abchip.mimo.entity.Default;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityState;
import org.abchip.mimo.entity.EntityType;
import org.abchip.mimo.entity.EntityTyped;
import org.abchip.mimo.entity.Facet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.Slot;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.java.impl.JavaPackageImpl;
import org.abchip.mimo.resource.ResourcePackage;

import org.abchip.mimo.resource.impl.ResourcePackageImpl;

import org.abchip.mimo.util.UtilPackage;

import org.abchip.mimo.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

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
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityIdentifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serializationTypeEEnum = null;

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
	 * @see org.abchip.mimo.entity.EntityPackage#eNS_URI
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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theEntityPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theEntityPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

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
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Max() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Min() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefault_Value() {
		return (EAttribute)defaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefault_Values() {
		return (EAttribute)defaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomain_Frame() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomain_Route() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityContainer() {
		return entityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityContainer_Contents() {
		return (EReference)entityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityContainer_Name() {
		return (EAttribute)entityContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityEnum() {
		return entityEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityEnum_Name() {
		return (EAttribute)entityEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityEnum_Text() {
		return (EAttribute)entityEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityInfo() {
		return entityInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityInfo_CreatedStamp() {
		return (EAttribute)entityInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityInfo_CreatedTxStamp() {
		return (EAttribute)entityInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityInfo_LastUpdatedStamp() {
		return (EAttribute)entityInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityInfo_LastUpdatedTxStamp() {
		return (EAttribute)entityInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityIdentifiable() {
		return entityIdentifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityIterator() {
		return entityIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityTyped() {
		return entityTypedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Slots() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_Abstract() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_AutoIncrement() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_Enum() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_Keys() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_HasToString() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_Name() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrame_Slots() {
		return (EReference)frameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_SlotsNumber() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_RoutesNumber() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_SuperNames() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_TextFormula() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlot_Cardinality() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Containment() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_DefaultValue() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Derived() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlot_Domain() {
		return (EReference)slotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Group() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Key() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Name() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Route() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Text() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_ToString() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntityState() {
		return entityStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSerializationType() {
		return serializationTypeEEnum;
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
		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__MAX);
		createEAttribute(cardinalityEClass, CARDINALITY__MIN);

		defaultEClass = createEClass(DEFAULT);
		createEAttribute(defaultEClass, DEFAULT__VALUE);
		createEAttribute(defaultEClass, DEFAULT__VALUES);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__FRAME);
		createEAttribute(domainEClass, DOMAIN__ROUTE);

		entityEClass = createEClass(ENTITY);

		entityContainerEClass = createEClass(ENTITY_CONTAINER);
		createEReference(entityContainerEClass, ENTITY_CONTAINER__CONTENTS);
		createEAttribute(entityContainerEClass, ENTITY_CONTAINER__NAME);

		entityEnumEClass = createEClass(ENTITY_ENUM);
		createEAttribute(entityEnumEClass, ENTITY_ENUM__NAME);
		createEAttribute(entityEnumEClass, ENTITY_ENUM__TEXT);

		entityInfoEClass = createEClass(ENTITY_INFO);
		createEAttribute(entityInfoEClass, ENTITY_INFO__CREATED_STAMP);
		createEAttribute(entityInfoEClass, ENTITY_INFO__CREATED_TX_STAMP);
		createEAttribute(entityInfoEClass, ENTITY_INFO__LAST_UPDATED_STAMP);
		createEAttribute(entityInfoEClass, ENTITY_INFO__LAST_UPDATED_TX_STAMP);

		entityIdentifiableEClass = createEClass(ENTITY_IDENTIFIABLE);

		entityIteratorEClass = createEClass(ENTITY_ITERATOR);

		entityTypedEClass = createEClass(ENTITY_TYPED);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__SLOTS);

		facetEClass = createEClass(FACET);

		frameEClass = createEClass(FRAME);
		createEAttribute(frameEClass, FRAME__ABSTRACT);
		createEAttribute(frameEClass, FRAME__AUTO_INCREMENT);
		createEAttribute(frameEClass, FRAME__ENUM);
		createEAttribute(frameEClass, FRAME__KEYS);
		createEAttribute(frameEClass, FRAME__HAS_TO_STRING);
		createEAttribute(frameEClass, FRAME__NAME);
		createEReference(frameEClass, FRAME__SLOTS);
		createEAttribute(frameEClass, FRAME__SLOTS_NUMBER);
		createEAttribute(frameEClass, FRAME__ROUTES_NUMBER);
		createEAttribute(frameEClass, FRAME__SUPER_NAMES);
		createEAttribute(frameEClass, FRAME__TEXT_FORMULA);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__CARDINALITY);
		createEAttribute(slotEClass, SLOT__CONTAINMENT);
		createEAttribute(slotEClass, SLOT__DEFAULT_VALUE);
		createEAttribute(slotEClass, SLOT__DERIVED);
		createEReference(slotEClass, SLOT__DOMAIN);
		createEAttribute(slotEClass, SLOT__GROUP);
		createEAttribute(slotEClass, SLOT__KEY);
		createEAttribute(slotEClass, SLOT__NAME);
		createEAttribute(slotEClass, SLOT__ROUTE);
		createEAttribute(slotEClass, SLOT__TEXT);
		createEAttribute(slotEClass, SLOT__TO_STRING);

		// Create enums
		entityStateEEnum = createEEnum(ENTITY_STATE);
		serializationTypeEEnum = createEEnum(SERIALIZATION_TYPE);
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
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters
		ETypeParameter entityIteratorEClass_E = addETypeParameter(entityIteratorEClass, "E");
		ETypeParameter entityTypedEClass_T = addETypeParameter(entityTypedEClass, "T");
		ETypeParameter entityTypeEClass_E = addETypeParameter(entityTypeEClass, "E");
		ETypeParameter frameEClass_E = addETypeParameter(frameEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getEntity());
		entityIteratorEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityType());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		entityTypedEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityTyped());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		entityTypeEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntity());
		frameEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		cardinalityEClass.getESuperTypes().add(this.getEntity());
		defaultEClass.getESuperTypes().add(this.getEntity());
		domainEClass.getESuperTypes().add(this.getEntity());
		entityContainerEClass.getESuperTypes().add(this.getEntity());
		entityEnumEClass.getESuperTypes().add(this.getEntityIdentifiable());
		entityIdentifiableEClass.getESuperTypes().add(this.getEntity());
		g1 = createEGenericType(theJavaPackage.getJavaIterator());
		g2 = createEGenericType(entityIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theJavaPackage.getJavaIterable());
		g2 = createEGenericType(entityIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theJavaPackage.getJavaCloseable());
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		entityTypedEClass.getESuperTypes().add(this.getEntityIdentifiable());
		entityTypeEClass.getESuperTypes().add(this.getEntityIdentifiable());
		facetEClass.getESuperTypes().add(this.getEntity());
		frameEClass.getESuperTypes().add(this.getEntityIdentifiable());
		slotEClass.getESuperTypes().add(this.getEntityIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_Max(), ecorePackage.getEInt(), "max", "1", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(cardinalityEClass, ecorePackage.getEBoolean(), "isMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cardinalityEClass, ecorePackage.getEBoolean(), "isMultiple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefault_Value(), ecorePackage.getEString(), "value", null, 0, 1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefault_Values(), ecorePackage.getEString(), "values", null, 0, -1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(defaultEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(defaultEClass, ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Frame(), ecorePackage.getEString(), "frame", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Route(), ecorePackage.getEString(), "route", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(entityEClass, null, "isa", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(entityContainerEClass, EntityContainer.class, "EntityContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityContainer_Contents(), this.getEntityIdentifiable(), null, "contents", null, 0, -1, EntityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, EntityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEnumEClass, EntityEnum.class, "EntityEnum", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityEnum_Name(), ecorePackage.getEString(), "name", null, 1, 1, EntityEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityEnum_Text(), ecorePackage.getEString(), "text", null, 1, 1, EntityEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityInfoEClass, EntityInfo.class, "EntityInfo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityInfo_CreatedStamp(), ecorePackage.getEDate(), "createdStamp", null, 0, 1, EntityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityInfo_CreatedTxStamp(), ecorePackage.getEDate(), "createdTxStamp", null, 0, 1, EntityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityInfo_LastUpdatedStamp(), ecorePackage.getEDate(), "lastUpdatedStamp", null, 0, 1, EntityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityInfo_LastUpdatedTxStamp(), ecorePackage.getEDate(), "lastUpdatedTxStamp", null, 0, 1, EntityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityIdentifiableEClass, EntityIdentifiable.class, "EntityIdentifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityIdentifiableEClass, ecorePackage.getEString(), "getID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityIdentifiableEClass, theJavaPackage.getJavaURI(), "getURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityIdentifiableEClass, this.getEntityState(), "getState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityIteratorEClass, EntityIterator.class, "EntityIterator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityIteratorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityIteratorEClass, ecorePackage.getEBoolean(), "hasNext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityIteratorEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityIteratorEClass_E);
		initEOperation(op, g1);

		addEOperation(entityIteratorEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityTypedEClass, EntityTyped.class, "EntityTyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(entityTypedEClass, null, "getType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityTypedEClass_T);
		initEOperation(op, g1);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_Slots(), this.getSlot(), null, "slots", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(entityTypeEClass, null, "getFrame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(entityTypeEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(entityTypeEClass, ecorePackage.getEString(), "getTypeId", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityTypeEClass, ecorePackage.getEBoolean(), "hasTable", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityTypeEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(facetEClass, Facet.class, "Facet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameEClass, Frame.class, "Frame", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrame_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_AutoIncrement(), ecorePackage.getEBoolean(), "autoIncrement", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_Enum(), ecorePackage.getEBoolean(), "enum", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_HasToString(), ecorePackage.getEBoolean(), "hasToString", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_Name(), ecorePackage.getEString(), "name", null, 1, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_Slots(), this.getSlot(), null, "slots", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_SlotsNumber(), ecorePackage.getEInt(), "slotsNumber", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_RoutesNumber(), ecorePackage.getEInt(), "routesNumber", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_SuperNames(), ecorePackage.getEString(), "superNames", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_TextFormula(), ecorePackage.getEString(), "textFormula", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(frameEClass, null, "ako", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(frameEClass_E);
		g2.setELowerBound(g3);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, null, "createEntity", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(frameEClass_E);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, null, "createProxy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(frameEClass_E);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, this.getSlot(), "getSlot", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(frameEClass, null, "getSuperFrames", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(frameEClass_E);
		g2.setELowerBound(g3);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, ecorePackage.getEJavaObject(), "getValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntity(), "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "slotName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "resolve", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(frameEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntity(), "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "slotName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_Domain(), this.getDomain(), null, "domain", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Group(), ecorePackage.getEString(), "group", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Name(), ecorePackage.getEString(), "name", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Route(), ecorePackage.getEBoolean(), "route", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Text(), ecorePackage.getEString(), "text", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_ToString(), ecorePackage.getEBoolean(), "toString", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(slotEClass, this.getEntity(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nsPrefix", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(slotEClass, ecorePackage.getEBoolean(), "isBoolean", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(slotEClass, ecorePackage.getEBoolean(), "isDate", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(slotEClass, ecorePackage.getEBoolean(), "isEnum", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(slotEClass, ecorePackage.getEBoolean(), "isNumeric", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(slotEClass, ecorePackage.getEBoolean(), "isString", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityStateEEnum, EntityState.class, "EntityState");
		addEEnumLiteral(entityStateEEnum, EntityState.TRANSIENT);
		addEEnumLiteral(entityStateEEnum, EntityState.PROXY);
		addEEnumLiteral(entityStateEEnum, EntityState.RESOLVED);
		addEEnumLiteral(entityStateEEnum, EntityState.DIRTY);

		initEEnum(serializationTypeEEnum, SerializationType.class, "SerializationType");
		addEEnumLiteral(serializationTypeEEnum, SerializationType.XML_METADATA_INTERCHANGE);
		addEEnumLiteral(serializationTypeEEnum, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
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
		  (getEntityInfo_CreatedStamp(),
		   source,
		   new String[] {
			   "group", "info"
		   });
		addAnnotation
		  (getEntityInfo_CreatedTxStamp(),
		   source,
		   new String[] {
			   "group", "info"
		   });
		addAnnotation
		  (getEntityInfo_LastUpdatedStamp(),
		   source,
		   new String[] {
			   "group", "info"
		   });
		addAnnotation
		  (getEntityInfo_LastUpdatedTxStamp(),
		   source,
		   new String[] {
			   "group", "info"
		   });
		addAnnotation
		  (entityIdentifiableEClass.getEOperations().get(2),
		   source,
		   new String[] {
		   });
	}

} //EntityPackageImpl
