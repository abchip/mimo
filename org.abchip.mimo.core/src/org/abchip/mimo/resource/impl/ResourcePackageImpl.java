/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;

import org.abchip.mimo.authentication.AuthenticationPackage;

import org.abchip.mimo.authentication.impl.AuthenticationPackageImpl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.data.DataPackage;

import org.abchip.mimo.data.impl.DataPackageImpl;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.java.impl.JavaPackageImpl;

import org.abchip.mimo.networking.NetworkingPackage;

import org.abchip.mimo.networking.impl.NetworkingPackageImpl;

import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceEvent;
import org.abchip.mimo.resource.ResourceEventType;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.resource.ResourceMappingRule;
import org.abchip.mimo.resource.ResourceMappingRuleByFrame;
import org.abchip.mimo.resource.ResourceMappingRuleByPackage;
import org.abchip.mimo.resource.ResourceMappingType;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

import org.abchip.mimo.service.ServicePackage;

import org.abchip.mimo.service.impl.ServicePackageImpl;

import org.abchip.mimo.service.reg.RegPackage;

import org.abchip.mimo.service.reg.impl.RegPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePackageImpl extends EPackageImpl implements ResourcePackage {
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
	private EClass resourceConfigEClass = null;

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
	private EClass resourceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMappingRuleByFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMappingRuleByPackageEClass = null;

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
	private EClass resourceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReaderEClass = null;

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
	private EClass resourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceWriterEClass = null;

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
	private EEnum resourceMappingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serializationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceExceptionEDataType = null;

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
	 * @see org.abchip.mimo.resource.ResourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcePackageImpl() {
		super(eNS_URI, ResourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcePackage init() {
		if (isInited) return (ResourcePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourcePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourcePackageImpl theResourcePackage = registeredResourcePackage instanceof ResourcePackageImpl ? (ResourcePackageImpl)registeredResourcePackage : new ResourcePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI);
		AuthenticationPackageImpl theAuthenticationPackage = (AuthenticationPackageImpl)(registeredPackage instanceof AuthenticationPackageImpl ? registeredPackage : AuthenticationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegPackage.eNS_URI);
		RegPackageImpl theRegPackage = (RegPackageImpl)(registeredPackage instanceof RegPackageImpl ? registeredPackage : RegPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcePackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theAuthenticationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theRegPackage.createPackageContents();

		// Initialize created meta-data
		theResourcePackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theAuthenticationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theRegPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcePackage.eNS_URI, theResourcePackage);
		return theResourcePackage;
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
	public EReference getResource_ResourceConfig() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_ResourceSet() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Tenant() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceConfig() {
		return resourceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_LockSupport() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_OrderSupport() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_PageSize() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(2);
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
	public EClass getResourceMapping() {
		return resourceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceMapping_Rules() {
		return (EReference)resourceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceMappingRule() {
		return resourceMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceMappingRule_Provider() {
		return (EAttribute)resourceMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceMappingRuleByFrame() {
		return resourceMappingRuleByFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceMappingRuleByFrame_Frame() {
		return (EAttribute)resourceMappingRuleByFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceMappingRuleByPackage() {
		return resourceMappingRuleByPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceMappingRuleByPackage_Package() {
		return (EAttribute)resourceMappingRuleByPackageEClass.getEStructuralFeatures().get(0);
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
	public EClass getResourceProvider() {
		return resourceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceProviderRegistry() {
		return resourceProviderRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceReader() {
		return resourceReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceReader_Notifier() {
		return (EReference)resourceReaderEClass.getEStructuralFeatures().get(0);
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
	public EReference getResourceSerializer_Frame() {
		return (EReference)resourceSerializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSet() {
		return resourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceWriter() {
		return resourceWriterEClass;
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
	public EEnum getResourceMappingType() {
		return resourceMappingTypeEEnum;
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
	public EDataType getResourceException() {
		return resourceExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceFactory getResourceFactory() {
		return (ResourceFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__RESOURCE_CONFIG);
		createEReference(resourceEClass, RESOURCE__RESOURCE_SET);
		createEAttribute(resourceEClass, RESOURCE__TENANT);

		resourceConfigEClass = createEClass(RESOURCE_CONFIG);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__LOCK_SUPPORT);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__ORDER_SUPPORT);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__PAGE_SIZE);

		resourceEventEClass = createEClass(RESOURCE_EVENT);

		resourceListenerEClass = createEClass(RESOURCE_LISTENER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);

		resourceMappingEClass = createEClass(RESOURCE_MAPPING);
		createEReference(resourceMappingEClass, RESOURCE_MAPPING__RULES);

		resourceMappingRuleEClass = createEClass(RESOURCE_MAPPING_RULE);
		createEAttribute(resourceMappingRuleEClass, RESOURCE_MAPPING_RULE__PROVIDER);

		resourceMappingRuleByFrameEClass = createEClass(RESOURCE_MAPPING_RULE_BY_FRAME);
		createEAttribute(resourceMappingRuleByFrameEClass, RESOURCE_MAPPING_RULE_BY_FRAME__FRAME);

		resourceMappingRuleByPackageEClass = createEClass(RESOURCE_MAPPING_RULE_BY_PACKAGE);
		createEAttribute(resourceMappingRuleByPackageEClass, RESOURCE_MAPPING_RULE_BY_PACKAGE__PACKAGE);

		resourceNotifierEClass = createEClass(RESOURCE_NOTIFIER);

		resourceProviderEClass = createEClass(RESOURCE_PROVIDER);

		resourceProviderRegistryEClass = createEClass(RESOURCE_PROVIDER_REGISTRY);

		resourceReaderEClass = createEClass(RESOURCE_READER);
		createEReference(resourceReaderEClass, RESOURCE_READER__NOTIFIER);

		resourceSerializerEClass = createEClass(RESOURCE_SERIALIZER);
		createEReference(resourceSerializerEClass, RESOURCE_SERIALIZER__FRAME);

		resourceSetEClass = createEClass(RESOURCE_SET);

		resourceWriterEClass = createEClass(RESOURCE_WRITER);

		// Create enums
		resourceEventTypeEEnum = createEEnum(RESOURCE_EVENT_TYPE);
		resourceMappingTypeEEnum = createEEnum(RESOURCE_MAPPING_TYPE);
		serializationTypeEEnum = createEEnum(SERIALIZATION_TYPE);

		// Create data types
		resourceExceptionEDataType = createEDataType(RESOURCE_EXCEPTION);
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
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters
		ETypeParameter resourceEClass_E = addETypeParameter(resourceEClass, "E");
		ETypeParameter resourceEventEClass_E = addETypeParameter(resourceEventEClass, "E");
		ETypeParameter resourceListenerEClass_E = addETypeParameter(resourceListenerEClass, "E");
		ETypeParameter resourceNotifierEClass_E = addETypeParameter(resourceNotifierEClass, "E");
		ETypeParameter resourceReaderEClass_E = addETypeParameter(resourceReaderEClass, "E");
		ETypeParameter resourceSerializerEClass_E = addETypeParameter(resourceSerializerEClass, "E");
		ETypeParameter resourceWriterEClass_E = addETypeParameter(resourceWriterEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceEventEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceListenerEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceNotifierEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceReaderEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		resourceSerializerEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		resourceWriterEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceConfigEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceMappingEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceMappingRuleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceMappingRuleByFrameEClass.getESuperTypes().add(this.getResourceMappingRule());
		resourceMappingRuleByPackageEClass.getESuperTypes().add(this.getResourceMappingRule());
		g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getResourceProvider());
		g1.getETypeArguments().add(g2);
		resourceProviderRegistryEClass.getEGenericSuperTypes().add(g1);
		resourceSetEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(resourceWriterEClass_E);
		g1.getETypeArguments().add(g2);
		resourceWriterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_ResourceConfig(), this.getResourceConfig(), null, "resourceConfig", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ResourceSet(), this.getResourceSet(), null, "resourceSet", null, 1, 1, Resource.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Tenant(), ecorePackage.getEString(), "tenant", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(resourceEClass, null, "attach", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceEClass, null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceEClass, null, "createProxy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceEClass, null, "detach", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		addEOperation(resourceEClass, theContextPackage.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceEClass, null, "getFrame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(resourceEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "sequence", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, ecorePackage.getEString(), "nextSequence", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceEClass, null, "read", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, null, "read", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		initEClass(resourceConfigEClass, ResourceConfig.class, "ResourceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConfig_LockSupport(), ecorePackage.getEBoolean(), "lockSupport", null, 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceConfig_OrderSupport(), ecorePackage.getEBoolean(), "orderSupport", null, 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceConfig_PageSize(), ecorePackage.getEInt(), "pageSize", "100", 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEventEClass, ResourceEvent.class, "ResourceEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(resourceEventEClass, theContextPackage.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, this.getResourceEventType(), "getEventType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getNewName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getOldName", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(resourceManagerEClass, null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
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
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceMappingEClass, ResourceMapping.class, "ResourceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMapping_Rules(), this.getResourceMappingRule(), null, "rules", null, 0, -1, ResourceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMappingRuleEClass, ResourceMappingRule.class, "ResourceMappingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceMappingRule_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, ResourceMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resourceMappingRuleEClass, this.getResourceMappingType(), "getMappingType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceMappingRuleByFrameEClass, ResourceMappingRuleByFrame.class, "ResourceMappingRuleByFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceMappingRuleByFrame_Frame(), ecorePackage.getEString(), "frame", null, 1, 1, ResourceMappingRuleByFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMappingRuleByPackageEClass, ResourceMappingRuleByPackage.class, "ResourceMappingRuleByPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceMappingRuleByPackage_Package(), ecorePackage.getEString(), "package", null, 1, 1, ResourceMappingRuleByPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(resourceProviderEClass, ResourceProvider.class, "ResourceProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceProviderRegistryEClass, ResourceProviderRegistry.class, "ResourceProviderRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceProviderRegistryEClass, this.getResourceProvider(), "getResourceProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceProviderRegistryEClass, this.getResourceProvider(), "getResourceProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceProviderRegistryEClass, this.getResourceProvider(), "getResourceProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceReaderEClass, ResourceReader.class, "ResourceReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResourceNotifier());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceReader_Notifier(), g1, null, "notifier", null, 0, 1, ResourceReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		addEOperation(resourceReaderEClass, theContextPackage.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, null, "getFrame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(resourceReaderEClass, ecorePackage.getEString(), "getTenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "sequence", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceSerializerEClass, ResourceSerializer.class, "ResourceSerializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theEntityPackage.getFrame());
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
		addEParameter(op, theJavaPackage.getJavaInputStream(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "append", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		op = addEOperation(resourceSerializerEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "append", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		op = addEOperation(resourceSerializerEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaOutputStream(), "outputStream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		op = addEOperation(resourceSerializerEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		op = addEOperation(resourceSerializerEClass, null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		addEOperation(resourceSerializerEClass, ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceSetEClass, ResourceSet.class, "ResourceSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(resourceSetEClass, theContextPackage.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceSetEClass, null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frameId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenantId", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceWriterEClass, ResourceWriter.class, "ResourceWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceWriterEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceWriterEClass, null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceWriterEClass, null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		op = addEOperation(resourceWriterEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getResourceException());

		// Initialize enums and add enum literals
		initEEnum(resourceEventTypeEEnum, ResourceEventType.class, "ResourceEventType");
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.BEFORE_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.AFTER_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.BEFORE_DELETE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.AFTER_DELETE);

		initEEnum(resourceMappingTypeEEnum, ResourceMappingType.class, "ResourceMappingType");
		addEEnumLiteral(resourceMappingTypeEEnum, ResourceMappingType.BY_FRAME);
		addEEnumLiteral(resourceMappingTypeEEnum, ResourceMappingType.BY_PACKAGE);

		initEEnum(serializationTypeEEnum, SerializationType.class, "SerializationType");
		addEEnumLiteral(serializationTypeEEnum, SerializationType.XMI);
		addEEnumLiteral(serializationTypeEEnum, SerializationType.MIMO);

		// Initialize data types
		initEDataType(resourceExceptionEDataType, ResourceException.class, "ResourceException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ResourcePackageImpl
