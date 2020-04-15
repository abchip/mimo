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

import org.abchip.mimo.service.ServiceCommandProviderReg;
import org.abchip.mimo.service.ServiceConfig;
import org.abchip.mimo.service.ServiceExecutorReg;
import org.abchip.mimo.service.ServiceFactory;
import org.abchip.mimo.service.ServiceFactoryReg;
import org.abchip.mimo.service.ServiceHookReg;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServicePackage;

import org.abchip.mimo.service.ServiceReg;
import org.abchip.mimo.service.ServiceRegistryEntryReg;
import org.abchip.mimo.service.ServiceRegistryReg;
import org.abchip.mimo.service.ServiceServletReg;
import org.abchip.mimo.service.ServiceStatus;
import org.abchip.mimo.service.ServiceTesterReg;
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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCommandProviderRegEClass = null;
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
	private EClass serviceHookRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceExecutorRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFactoryRegEClass = null;
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
	private EClass serviceRegistryRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegistryEntryRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceServletRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTesterRegEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

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
	public EClass getServiceCommandProviderReg() {
		return serviceCommandProviderRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceCommandProviderReg_InterfaceName() {
		return (EAttribute)serviceCommandProviderRegEClass.getEStructuralFeatures().get(0);
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
	public EClass getServiceHookReg() {
		return serviceHookRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceExecutorReg() {
		return serviceExecutorRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceExecutorReg_InterfaceName() {
		return (EAttribute)serviceExecutorRegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceExecutorReg_RemoteExport() {
		return (EAttribute)serviceExecutorRegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceReg() {
		return serviceRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceReg_ClassName() {
		return (EAttribute)serviceRegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceReg_Status() {
		return (EAttribute)serviceRegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceFactoryReg() {
		return serviceFactoryRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceFactoryReg_InterfaceName() {
		return (EAttribute)serviceFactoryRegEClass.getEStructuralFeatures().get(0);
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
	public EClass getServiceRegistryReg() {
		return serviceRegistryRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceRegistryReg_Entries() {
		return (EReference)serviceRegistryRegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRegistryReg_InterfaceName() {
		return (EAttribute)serviceRegistryRegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRegistryEntryReg() {
		return serviceRegistryEntryRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRegistryEntryReg_InterfaceName() {
		return (EAttribute)serviceRegistryEntryRegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRegistryEntryReg_Name() {
		return (EAttribute)serviceRegistryEntryRegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRegistryEntryReg_Vendor() {
		return (EAttribute)serviceRegistryEntryRegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRegistryEntryReg_Version() {
		return (EAttribute)serviceRegistryEntryRegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceServletReg() {
		return serviceServletRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceServletReg_Alias() {
		return (EAttribute)serviceServletRegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceServletReg_InterfaceName() {
		return (EAttribute)serviceServletRegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceTesterReg() {
		return serviceTesterRegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceTesterReg_InterfaceName() {
		return (EAttribute)serviceTesterRegEClass.getEStructuralFeatures().get(0);
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
		serviceCommandProviderRegEClass = createEClass(SERVICE_COMMAND_PROVIDER_REG);
		createEAttribute(serviceCommandProviderRegEClass, SERVICE_COMMAND_PROVIDER_REG__INTERFACE_NAME);

		serviceConfigEClass = createEClass(SERVICE_CONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__ENTITIES);

		serviceHookRegEClass = createEClass(SERVICE_HOOK_REG);

		serviceExecutorRegEClass = createEClass(SERVICE_EXECUTOR_REG);
		createEAttribute(serviceExecutorRegEClass, SERVICE_EXECUTOR_REG__INTERFACE_NAME);
		createEAttribute(serviceExecutorRegEClass, SERVICE_EXECUTOR_REG__REMOTE_EXPORT);

		serviceRegEClass = createEClass(SERVICE_REG);
		createEAttribute(serviceRegEClass, SERVICE_REG__CLASS_NAME);
		createEAttribute(serviceRegEClass, SERVICE_REG__STATUS);

		serviceFactoryRegEClass = createEClass(SERVICE_FACTORY_REG);
		createEAttribute(serviceFactoryRegEClass, SERVICE_FACTORY_REG__INTERFACE_NAME);

		serviceManagerEClass = createEClass(SERVICE_MANAGER);

		serviceRegistryRegEClass = createEClass(SERVICE_REGISTRY_REG);
		createEReference(serviceRegistryRegEClass, SERVICE_REGISTRY_REG__ENTRIES);
		createEAttribute(serviceRegistryRegEClass, SERVICE_REGISTRY_REG__INTERFACE_NAME);

		serviceRegistryEntryRegEClass = createEClass(SERVICE_REGISTRY_ENTRY_REG);
		createEAttribute(serviceRegistryEntryRegEClass, SERVICE_REGISTRY_ENTRY_REG__INTERFACE_NAME);
		createEAttribute(serviceRegistryEntryRegEClass, SERVICE_REGISTRY_ENTRY_REG__NAME);
		createEAttribute(serviceRegistryEntryRegEClass, SERVICE_REGISTRY_ENTRY_REG__VENDOR);
		createEAttribute(serviceRegistryEntryRegEClass, SERVICE_REGISTRY_ENTRY_REG__VERSION);

		serviceServletRegEClass = createEClass(SERVICE_SERVLET_REG);
		createEAttribute(serviceServletRegEClass, SERVICE_SERVLET_REG__ALIAS);
		createEAttribute(serviceServletRegEClass, SERVICE_SERVLET_REG__INTERFACE_NAME);

		serviceTesterRegEClass = createEClass(SERVICE_TESTER_REG);
		createEAttribute(serviceTesterRegEClass, SERVICE_TESTER_REG__INTERFACE_NAME);

		// Create enums
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);
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
		serviceCommandProviderRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceConfigEClass.getESuperTypes().add(theEntityPackage.getEntity());
		serviceHookRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceExecutorRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceRegEClass.getESuperTypes().add(theEntityPackage.getEntity());
		serviceFactoryRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceRegistryRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceRegistryEntryRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceServletRegEClass.getESuperTypes().add(this.getServiceReg());
		serviceTesterRegEClass.getESuperTypes().add(this.getServiceReg());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceCommandProviderRegEClass, ServiceCommandProviderReg.class, "ServiceCommandProviderReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCommandProviderReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.eclipse.osgi.framework.console.CommandProvider", 1, 1, ServiceCommandProviderReg.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigEClass, ServiceConfig.class, "ServiceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConfig_Entities(), theEntityPackage.getEntity(), null, "entities", null, 1, -1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceHookRegEClass, ServiceHookReg.class, "ServiceHookReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceExecutorRegEClass, ServiceExecutorReg.class, "ServiceExecutorReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceExecutorReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, ServiceExecutorReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceExecutorReg_RemoteExport(), ecorePackage.getEBoolean(), "remoteExport", null, 1, 1, ServiceExecutorReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRegEClass, ServiceReg.class, "ServiceReg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceReg_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, ServiceReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReg_Status(), this.getServiceStatus(), "status", null, 1, 1, ServiceReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(serviceRegEClass, ecorePackage.getEString(), "getInterfaceName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceFactoryRegEClass, ServiceFactoryReg.class, "ServiceFactoryReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceFactoryReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.abchip.mimo.context.Factory", 1, 1, ServiceFactoryReg.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceManagerEClass, ServiceManager.class, "ServiceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRegistryRegEClass, ServiceRegistryReg.class, "ServiceRegistryReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceRegistryReg_Entries(), this.getServiceRegistryEntryReg(), null, "entries", null, 0, -1, ServiceRegistryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, ServiceRegistryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRegistryEntryRegEClass, ServiceRegistryEntryReg.class, "ServiceRegistryEntryReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRegistryEntryReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, ServiceRegistryEntryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntryReg_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceRegistryEntryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntryReg_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, ServiceRegistryEntryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntryReg_Version(), ecorePackage.getEString(), "version", null, 0, 1, ServiceRegistryEntryReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceServletRegEClass, ServiceServletReg.class, "ServiceServletReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceServletReg_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, ServiceServletReg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceServletReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", "javax.servlet.Servlet", 1, 1, ServiceServletReg.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTesterRegEClass, ServiceTesterReg.class, "ServiceTesterReg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceTesterReg_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.abchip.mimo.tester.TestSuiteLauncher", 1, 1, ServiceTesterReg.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.STOPPED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.TESTING);
	}

} //ServicePackageImpl
