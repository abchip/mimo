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

import org.abchip.mimo.entity.Cardinality;
import org.abchip.mimo.entity.Default;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Facet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.Nameable;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceEvent;
import org.abchip.mimo.entity.ResourceEventType;
import org.abchip.mimo.entity.ResourceListener;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceNotifier;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.ResourceType;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.Textable;

import org.abchip.mimo.expression.ExpressionPackage;

import org.abchip.mimo.expression.impl.ExpressionPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.net.NetPackage;
import org.abchip.mimo.net.impl.NetPackageImpl;
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
	private EClass entityEClass = null;

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
	private EClass entityNameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityWriterEClass = null;

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
	private EClass frameManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSerializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityProviderRegistryEClass = null;

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
	private EClass textableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(registeredPackage instanceof ExpressionPackageImpl ? registeredPackage : ExpressionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetPackage.eNS_URI);
		NetPackageImpl theNetPackage = (NetPackageImpl)(registeredPackage instanceof NetPackageImpl ? registeredPackage : NetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theEntityPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theNetPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theEntityPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theNetPackage.initializePackageContents();
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
	public EClass getEntity() {
		return entityEClass;
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
	public EClass getEntityNameable() {
		return entityNameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityReader() {
		return entityReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityReader_ContextProvider() {
		return (EReference)entityReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityReader_Notifier() {
		return (EReference)entityReaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityReader_Frame() {
		return (EReference)entityReaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityWriter() {
		return entityWriterEClass;
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
	public EAttribute getFrame_Name() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrame_Slots() {
		return (EReference)frameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrame_SuperNames() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameManager() {
		return frameManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Text() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceEvent() {
		return resourceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceListener() {
		return resourceListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceNotifier() {
		return resourceNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSerializer() {
		return resourceSerializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceSerializer_ContextProvider() {
		return (EReference)resourceSerializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceSerializer_Frame() {
		return (EReference)resourceSerializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityProvider() {
		return entityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityProviderRegistry() {
		return entityProviderRegistryEClass;
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
	public EAttribute getSlot_Name() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Transient() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Volatile() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_DefaultValue() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextable() {
		return textableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceEventType() {
		return resourceEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceScope() {
		return resourceScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceType() {
		return resourceTypeEEnum;
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

		entityEClass = createEClass(ENTITY);

		entityIteratorEClass = createEClass(ENTITY_ITERATOR);

		entityNameableEClass = createEClass(ENTITY_NAMEABLE);

		entityProviderEClass = createEClass(ENTITY_PROVIDER);

		entityProviderRegistryEClass = createEClass(ENTITY_PROVIDER_REGISTRY);

		entityReaderEClass = createEClass(ENTITY_READER);
		createEReference(entityReaderEClass, ENTITY_READER__CONTEXT_PROVIDER);
		createEReference(entityReaderEClass, ENTITY_READER__NOTIFIER);
		createEReference(entityReaderEClass, ENTITY_READER__FRAME);

		entityWriterEClass = createEClass(ENTITY_WRITER);

		facetEClass = createEClass(FACET);

		frameEClass = createEClass(FRAME);
		createEAttribute(frameEClass, FRAME__ABSTRACT);
		createEAttribute(frameEClass, FRAME__NAME);
		createEReference(frameEClass, FRAME__SLOTS);
		createEAttribute(frameEClass, FRAME__SUPER_NAMES);

		frameManagerEClass = createEClass(FRAME_MANAGER);

		nameableEClass = createEClass(NAMEABLE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__TEXT);

		resourceEventEClass = createEClass(RESOURCE_EVENT);

		resourceListenerEClass = createEClass(RESOURCE_LISTENER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);

		resourceNotifierEClass = createEClass(RESOURCE_NOTIFIER);

		resourceSerializerEClass = createEClass(RESOURCE_SERIALIZER);
		createEReference(resourceSerializerEClass, RESOURCE_SERIALIZER__CONTEXT_PROVIDER);
		createEReference(resourceSerializerEClass, RESOURCE_SERIALIZER__FRAME);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__CARDINALITY);
		createEAttribute(slotEClass, SLOT__DEFAULT_VALUE);
		createEAttribute(slotEClass, SLOT__NAME);
		createEAttribute(slotEClass, SLOT__TRANSIENT);
		createEAttribute(slotEClass, SLOT__VOLATILE);

		textableEClass = createEClass(TEXTABLE);

		// Create enums
		resourceEventTypeEEnum = createEEnum(RESOURCE_EVENT_TYPE);
		resourceScopeEEnum = createEEnum(RESOURCE_SCOPE);
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters
		ETypeParameter entityIteratorEClass_E = addETypeParameter(entityIteratorEClass, "E");
		ETypeParameter entityReaderEClass_E = addETypeParameter(entityReaderEClass, "E");
		ETypeParameter entityWriterEClass_E = addETypeParameter(entityWriterEClass, "E");
		ETypeParameter frameEClass_E = addETypeParameter(frameEClass, "E");
		ETypeParameter resourceEventEClass_E = addETypeParameter(resourceEventEClass, "E");
		ETypeParameter resourceListenerEClass_E = addETypeParameter(resourceListenerEClass, "E");
		ETypeParameter resourceNotifierEClass_E = addETypeParameter(resourceNotifierEClass, "E");
		ETypeParameter resourceSerializerEClass_E = addETypeParameter(resourceSerializerEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getEntity());
		entityIteratorEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityNameable());
		entityReaderEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityNameable());
		entityWriterEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntity());
		frameEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityNameable());
		resourceEventEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityNameable());
		resourceListenerEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntityNameable());
		resourceNotifierEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getEntity());
		resourceSerializerEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		cardinalityEClass.getESuperTypes().add(this.getEntity());
		defaultEClass.getESuperTypes().add(this.getEntity());
		g1 = createEGenericType(theUtilPackage.getJavaIterator());
		EGenericType g2 = createEGenericType(entityIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theUtilPackage.getJavaIterable());
		g2 = createEGenericType(entityIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theUtilPackage.getJavaCloseable());
		entityIteratorEClass.getEGenericSuperTypes().add(g1);
		entityNameableEClass.getESuperTypes().add(this.getEntity());
		entityNameableEClass.getESuperTypes().add(this.getNameable());
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getEntityProvider());
		g1.getETypeArguments().add(g2);
		entityProviderRegistryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(entityWriterEClass_E);
		g1.getETypeArguments().add(g2);
		entityWriterEClass.getEGenericSuperTypes().add(g1);
		facetEClass.getESuperTypes().add(this.getEntity());
		frameEClass.getESuperTypes().add(this.getEntityNameable());
		resourceEClass.getESuperTypes().add(this.getEntityNameable());
		resourceEClass.getESuperTypes().add(this.getTextable());
		resourceManagerEClass.getESuperTypes().add(this.getEntityProvider());
		resourceSerializerEClass.getESuperTypes().add(theUtilPackage.getJavaCloseable());
		slotEClass.getESuperTypes().add(this.getEntityNameable());

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

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(entityEClass, null, "isa", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(entityIteratorEClass, EntityIterator.class, "EntityIterator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityIteratorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityIteratorEClass, ecorePackage.getEBoolean(), "hasNext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityIteratorEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityIteratorEClass_E);
		initEOperation(op, g1);

		addEOperation(entityIteratorEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityNameableEClass, EntityNameable.class, "EntityNameable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityNameableEClass, ecorePackage.getEString(), "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityNameableEClass, theUtilPackage.getJavaURI(), "getURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityProviderEClass, EntityProvider.class, "EntityProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resources", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resources", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resources", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityProviderEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(entityProviderRegistryEClass, EntityProviderRegistry.class, "EntityProviderRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityReaderEClass, EntityReader.class, "EntityReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityReader_ContextProvider(), theContextPackage.getContextProvider(), null, "contextProvider", null, 1, 1, EntityReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResourceNotifier());
		g2 = createEGenericType(entityReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getEntityReader_Notifier(), g1, null, "notifier", null, 0, 1, EntityReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(entityReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getEntityReader_Frame(), g1, null, "frame", null, 1, 1, EntityReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(entityReaderEClass, ecorePackage.getEBoolean(), "exists", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityIterator());
		g2 = createEGenericType(entityReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityReaderEClass, null, "findByExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionPackage.getPredicateExpression(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityIterator());
		g2 = createEGenericType(entityReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(entityReaderEClass, null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityReaderEClass_E);
		initEOperation(op, g1);

		initEClass(entityWriterEClass, EntityWriter.class, "EntityWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(entityWriterEClass, null, "copy", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		initEOperation(op, g1);

		op = addEOperation(entityWriterEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityWriterEClass, ecorePackage.getEString(), "getResourceName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityWriterEClass, null, "rename", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(facetEClass, Facet.class, "Facet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameEClass, Frame.class, "Frame", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrame_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_Name(), ecorePackage.getEString(), "name", null, 1, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_Slots(), this.getSlot(), null, "slots", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_SuperNames(), ecorePackage.getEString(), "superNames", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(frameEClass, null, "ako", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, null, "getEntityClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(frameEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, this.getSlot(), "getSlot", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(frameEClass, this.getSlot(), "getSlotName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(frameEClass, null, "getSuperFrames", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(frameEClass, ecorePackage.getEJavaObject(), "getValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(frameEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSlot(), "slot", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(frameEClass, null, "unsetValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(frameEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSlot(), "slot", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(frameManagerEClass, FrameManager.class, "FrameManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(frameManagerEClass, null, "createEntity", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(frameManagerEClass, null, "createEntity", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(frameManagerEClass, null, "getFrameReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(this.getFrame());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(t1);
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = addEOperation(frameManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(frameManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Text(), ecorePackage.getEString(), "text", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resourceEClass, this.getResourceType(), "getResourceType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEventEClass, ResourceEvent.class, "ResourceEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(resourceEventEClass, theContextPackage.getContextProvider(), "getContextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, this.getResourceEventType(), "getEventType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getNewName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getOldName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getResourceName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceEventEClass, null, "getSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEventEClass_E);
		initEOperation(op, g1);

		initEClass(resourceListenerEClass, ResourceListener.class, "ResourceListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceListenerEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceManagerEClass, ResourceManager.class, "ResourceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntityProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntityProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntityProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getEntityReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getEntityWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceNotifierEClass, ResourceNotifier.class, "ResourceNotifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceNotifierEClass, null, "fireEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceNotifierEClass, null, "getListeners", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceNotifierEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceSerializerEClass, ResourceSerializer.class, "ResourceSerializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceSerializer_ContextProvider(), theContextPackage.getContextProvider(), null, "contextProvider", null, 1, 1, ResourceSerializer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getFrame());
		g2 = createEGenericType(resourceSerializerEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceSerializer_Frame(), g1, null, "frame", null, 1, 1, ResourceSerializer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resourceSerializerEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceSerializerEClass, null, "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		addEParameter(op, g1, "entities", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceSerializerEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceSerializerEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaInputStream(), "inputStream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = addEOperation(resourceSerializerEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaOutputStream(), "outputStream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = addEOperation(resourceSerializerEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceSerializerEClass, null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		initEClass(slotEClass, Slot.class, "Slot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Name(), ecorePackage.getEString(), "name", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(slotEClass, this.getEntity(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nsPrefix", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textableEClass, Textable.class, "Textable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(textableEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceEventTypeEEnum, ResourceEventType.class, "ResourceEventType");
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRESAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POSTSAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PREDLT);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POSTDLT);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRERNM);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POSTRNM);

		initEEnum(resourceScopeEEnum, ResourceScope.class, "ResourceScope");
		addEEnumLiteral(resourceScopeEEnum, ResourceScope.ALL);
		addEEnumLiteral(resourceScopeEEnum, ResourceScope.CTX);
		addEEnumLiteral(resourceScopeEEnum, ResourceScope.USER);
		addEEnumLiteral(resourceScopeEEnum, ResourceScope.ROOT);

		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROD);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.TEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.TEMP);

		initEEnum(serializationTypeEEnum, SerializationType.class, "SerializationType");
		addEEnumLiteral(serializationTypeEEnum, SerializationType.XMI);
		addEEnumLiteral(serializationTypeEEnum, SerializationType.JSON);
	}

} //EntityPackageImpl
