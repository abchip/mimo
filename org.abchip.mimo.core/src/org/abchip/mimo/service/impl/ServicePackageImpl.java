/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

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

import org.abchip.mimo.resource.ResourcePackage;

import org.abchip.mimo.resource.impl.ResourcePackageImpl;

import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceConfig;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceFactory;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceMapping;
import org.abchip.mimo.service.ServiceMappingRule;
import org.abchip.mimo.service.ServiceMappingRuleByPackage;
import org.abchip.mimo.service.ServiceMappingType;
import org.abchip.mimo.service.ServiceMessage;
import org.abchip.mimo.service.ServiceMethodRequest;
import org.abchip.mimo.service.ServiceMethodResponse;
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.ServiceProvider;
import org.abchip.mimo.service.ServiceProviderRegistry;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.ServiceStatus;

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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMappingRuleByPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceMappingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceExceptionEDataType = null;

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
	 * @see org.abchip.mimo.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServicePackageImpl theServicePackage = registeredServicePackage instanceof ServicePackageImpl ? (ServicePackageImpl)registeredServicePackage : new ServicePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegPackage.eNS_URI);
		RegPackageImpl theRegPackage = (RegPackageImpl)(registeredPackage instanceof RegPackageImpl ? registeredPackage : RegPackage.eINSTANCE);

		// Create package meta-data objects
		theServicePackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theAuthenticationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theRegPackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theAuthenticationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theRegPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Request() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceConfig() {
		return serviceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceConfig_Entities() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceManager() {
		return serviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMapping() {
		return serviceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceMapping_Rules() {
		return (EReference)serviceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMappingRule() {
		return serviceMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMappingRule_Provider() {
		return (EAttribute)serviceMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMappingRuleByPackage() {
		return serviceMappingRuleByPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMappingRuleByPackage_Package() {
		return (EAttribute)serviceMappingRuleByPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMessage() {
		return serviceMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMethodRequest() {
		return serviceMethodRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceMethodRequest_Entity() {
		return (EReference)serviceMethodRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMethodResponse() {
		return serviceMethodResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMethodResponse_Result() {
		return (EAttribute)serviceMethodResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceProvider() {
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceProviderRegistry() {
		return serviceProviderRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRequest() {
		return serviceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRequest_Locale() {
		return (EAttribute)serviceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRequest_Tenant() {
		return (EAttribute)serviceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceRequest_Context() {
		return (EReference)serviceRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceResponse() {
		return serviceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceResponse_Error() {
		return (EAttribute)serviceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceResponse_ErrorMessage() {
		return (EAttribute)serviceResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceResponse_ResponseMessage() {
		return (EAttribute)serviceResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceResponse_SuccessMessage() {
		return (EAttribute)serviceResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceMappingType() {
		return serviceMappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getServiceException() {
		return serviceExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__REQUEST);

		serviceConfigEClass = createEClass(SERVICE_CONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__ENTITIES);

		serviceManagerEClass = createEClass(SERVICE_MANAGER);

		serviceMappingEClass = createEClass(SERVICE_MAPPING);
		createEReference(serviceMappingEClass, SERVICE_MAPPING__RULES);

		serviceMappingRuleEClass = createEClass(SERVICE_MAPPING_RULE);
		createEAttribute(serviceMappingRuleEClass, SERVICE_MAPPING_RULE__PROVIDER);

		serviceMappingRuleByPackageEClass = createEClass(SERVICE_MAPPING_RULE_BY_PACKAGE);
		createEAttribute(serviceMappingRuleByPackageEClass, SERVICE_MAPPING_RULE_BY_PACKAGE__PACKAGE);

		serviceMessageEClass = createEClass(SERVICE_MESSAGE);

		serviceMethodRequestEClass = createEClass(SERVICE_METHOD_REQUEST);
		createEReference(serviceMethodRequestEClass, SERVICE_METHOD_REQUEST__ENTITY);

		serviceMethodResponseEClass = createEClass(SERVICE_METHOD_RESPONSE);
		createEAttribute(serviceMethodResponseEClass, SERVICE_METHOD_RESPONSE__RESULT);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);

		serviceProviderRegistryEClass = createEClass(SERVICE_PROVIDER_REGISTRY);

		serviceRequestEClass = createEClass(SERVICE_REQUEST);
		createEAttribute(serviceRequestEClass, SERVICE_REQUEST__LOCALE);
		createEAttribute(serviceRequestEClass, SERVICE_REQUEST__TENANT);
		createEReference(serviceRequestEClass, SERVICE_REQUEST__CONTEXT);

		serviceResponseEClass = createEClass(SERVICE_RESPONSE);
		createEAttribute(serviceResponseEClass, SERVICE_RESPONSE__ERROR);
		createEAttribute(serviceResponseEClass, SERVICE_RESPONSE__ERROR_MESSAGE);
		createEAttribute(serviceResponseEClass, SERVICE_RESPONSE__RESPONSE_MESSAGE);
		createEAttribute(serviceResponseEClass, SERVICE_RESPONSE__SUCCESS_MESSAGE);

		// Create enums
		serviceMappingTypeEEnum = createEEnum(SERVICE_MAPPING_TYPE);
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		serviceExceptionEDataType = createEDataType(SERVICE_EXCEPTION);
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
		RegPackage theRegPackage = (RegPackage)EPackage.Registry.INSTANCE.getEPackage(RegPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRegPackage);

		// Create type parameters
		ETypeParameter serviceEClass_R = addETypeParameter(serviceEClass, "R");
		ETypeParameter serviceEClass_V = addETypeParameter(serviceEClass, "V");
		ETypeParameter serviceMethodRequestEClass_E = addETypeParameter(serviceMethodRequestEClass, "E");
		ETypeParameter serviceMethodRequestEClass_T = addETypeParameter(serviceMethodRequestEClass, "T");
		ETypeParameter serviceMethodResponseEClass_T = addETypeParameter(serviceMethodResponseEClass, "T");
		ETypeParameter serviceRequestEClass_V = addETypeParameter(serviceRequestEClass, "V");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getServiceRequest());
		EGenericType g2 = createEGenericType(serviceEClass_V);
		g1.getETypeArguments().add(g2);
		serviceEClass_R.getEBounds().add(g1);
		g1 = createEGenericType(this.getServiceResponse());
		serviceEClass_V.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		serviceMethodRequestEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getServiceResponse());
		serviceRequestEClass_V.getEBounds().add(g1);

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		serviceConfigEClass.getESuperTypes().add(theEntityPackage.getEntity());
		serviceMappingEClass.getESuperTypes().add(theEntityPackage.getEntity());
		serviceMappingRuleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		serviceMappingRuleByPackageEClass.getESuperTypes().add(this.getServiceMappingRule());
		serviceMessageEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(this.getServiceMethodResponse());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(serviceMethodRequestEClass_T);
		g2.getETypeArguments().add(g3);
		serviceMethodRequestEClass.getEGenericSuperTypes().add(g1);
		serviceMethodResponseEClass.getESuperTypes().add(this.getServiceResponse());
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getServiceProvider());
		g1.getETypeArguments().add(g2);
		serviceProviderRegistryEClass.getEGenericSuperTypes().add(g1);
		serviceRequestEClass.getESuperTypes().add(this.getServiceMessage());
		serviceResponseEClass.getESuperTypes().add(this.getServiceMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(serviceEClass_R);
		initEReference(getService_Request(), g1, null, "request", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigEClass, ServiceConfig.class, "ServiceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConfig_Entities(), theEntityPackage.getEntity(), null, "entities", null, 1, -1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceManagerEClass, ServiceManager.class, "ServiceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(serviceManagerEClass, null, "getService", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		ETypeParameter t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getService());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "getService", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getService());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "getService", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "serviceId", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getService());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "submit", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(theJavaPackage.getJavaFuture());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		op = addEOperation(serviceManagerEClass, null, "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t2);
		initEOperation(op, g1);

		initEClass(serviceMappingEClass, ServiceMapping.class, "ServiceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceMapping_Rules(), this.getServiceMappingRule(), null, "rules", null, 0, -1, ServiceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMappingRuleEClass, ServiceMappingRule.class, "ServiceMappingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMappingRule_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, ServiceMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(serviceMappingRuleEClass, this.getServiceMappingType(), "getMappingType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceMappingRuleByPackageEClass, ServiceMappingRuleByPackage.class, "ServiceMappingRuleByPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMappingRuleByPackage_Package(), ecorePackage.getEString(), "package", null, 1, 1, ServiceMappingRuleByPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMessageEClass, ServiceMessage.class, "ServiceMessage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceMethodRequestEClass, ServiceMethodRequest.class, "ServiceMethodRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(serviceMethodRequestEClass_E);
		initEReference(getServiceMethodRequest_Entity(), g1, null, "entity", null, 1, 1, ServiceMethodRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMethodResponseEClass, ServiceMethodResponse.class, "ServiceMethodResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(serviceMethodResponseEClass_T);
		initEAttribute(getServiceMethodResponse_Result(), g1, "result", null, 0, 1, ServiceMethodResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(serviceProviderEClass, null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(serviceProviderEClass, null, "submit", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getServiceException());
		g1 = createEGenericType(theJavaPackage.getJavaFuture());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(serviceProviderRegistryEClass, ServiceProviderRegistry.class, "ServiceProviderRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(serviceProviderRegistryEClass, this.getServiceProvider(), "getServiceProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(serviceProviderRegistryEClass, this.getServiceProvider(), "getServiceProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "V");
		g1 = createEGenericType(this.getServiceResponse());
		t1.getEBounds().add(g1);
		t2 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getServiceRequest());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceRequestEClass, ServiceRequest.class, "ServiceRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRequest_Locale(), ecorePackage.getEString(), "locale", null, 1, 1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRequest_Tenant(), ecorePackage.getEString(), "tenant", null, 0, 1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceRequest_Context(), theContextPackage.getContext(), null, "context", null, 0, 1, ServiceRequest.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(serviceRequestEClass, ecorePackage.getEString(), "getServiceName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(serviceRequestEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(serviceRequestEClass, ecorePackage.getEBoolean(), "isPrepared", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(serviceRequestEClass, null, "getResponse", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(serviceRequestEClass_V);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(serviceRequestEClass, null, "buildResponse", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(serviceRequestEClass_V);
		initEOperation(op, g1);

		initEClass(serviceResponseEClass, ServiceResponse.class, "ServiceResponse", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceResponse_Error(), ecorePackage.getEBoolean(), "error", null, 1, 1, ServiceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceResponse_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, ServiceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceResponse_ResponseMessage(), ecorePackage.getEString(), "responseMessage", null, 0, 1, ServiceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceResponse_SuccessMessage(), ecorePackage.getEString(), "successMessage", null, 0, 1, ServiceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceMappingTypeEEnum, ServiceMappingType.class, "ServiceMappingType");
		addEEnumLiteral(serviceMappingTypeEEnum, ServiceMappingType.BY_PACKAGE);

		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.STOPPED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.TESTING);

		// Initialize data types
		initEDataType(serviceExceptionEDataType, ServiceException.class, "ServiceException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ServicePackageImpl
