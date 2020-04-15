/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationFactory;
import org.abchip.mimo.application.ApplicationLogEntry;
import org.abchip.mimo.application.ApplicationLogLevel;
import org.abchip.mimo.application.ApplicationLogs;
import org.abchip.mimo.application.ApplicationModule;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.application.ModuleStatus;
import org.abchip.mimo.application.ServiceCommandProviderReg;
import org.abchip.mimo.application.ServiceConfig;
import org.abchip.mimo.application.ServiceExecutorReg;
import org.abchip.mimo.application.ServiceFactoryReg;
import org.abchip.mimo.application.ServiceHookReg;
import org.abchip.mimo.application.ServiceReg;
import org.abchip.mimo.application.ServiceRegistryReg;
import org.abchip.mimo.application.ServiceRegistryEntryReg;
import org.abchip.mimo.application.ServiceServletReg;
import org.abchip.mimo.application.ServiceStatus;
import org.abchip.mimo.application.ServiceTesterReg;
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
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.impl.ServicePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationPathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLogsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationModuleEClass = null;

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
	private EEnum applicationLogLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleStatusEEnum = null;

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
	private EDataType applicationBundleEDataType = null;

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
	 * @see org.abchip.mimo.application.ApplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationPackageImpl() {
		super(eNS_URI, ApplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationPackage init() {
		if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApplicationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApplicationPackageImpl theApplicationPackage = registeredApplicationPackage instanceof ApplicationPackageImpl ? (ApplicationPackageImpl)registeredApplicationPackage : new ApplicationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);

		// Create package meta-data objects
		theApplicationPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theAuthenticationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theServicePackage.createPackageContents();

		// Initialize created meta-data
		theApplicationPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theAuthenticationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
		return theApplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_AdminKey() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Plugin() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Commands() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Components() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Config() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Context() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_ContextDescription() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Hooks() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Logs() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Paths() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_ResourceMapping() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Text() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getApplicationBundle() {
		return applicationBundleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationPaths() {
		return applicationPathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationPaths_Data() {
		return (EAttribute)applicationPathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationPaths_Logs() {
		return (EAttribute)applicationPathsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationPaths_Work() {
		return (EAttribute)applicationPathsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Config() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Context() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Hooks() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Commands() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Modules() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationComponent_Name() {
		return (EAttribute)applicationComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationComponent_Status() {
		return (EAttribute)applicationComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationLogs() {
		return applicationLogsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationLogs_Entries() {
		return (EReference)applicationLogsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationLogs_Level() {
		return (EAttribute)applicationLogsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationLogEntry() {
		return applicationLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationLogEntry_Package() {
		return (EAttribute)applicationLogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationLogEntry_Level() {
		return (EAttribute)applicationLogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationModule() {
		return applicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationModule_Name() {
		return (EAttribute)applicationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationModule_Services() {
		return (EReference)applicationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationModule_Status() {
		return (EAttribute)applicationModuleEClass.getEStructuralFeatures().get(2);
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
	public EEnum getApplicationLogLevel() {
		return applicationLogLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentStatus() {
		return componentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModuleStatus() {
		return moduleStatusEEnum;
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
	public ApplicationFactory getApplicationFactory() {
		return (ApplicationFactory)getEFactoryInstance();
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
		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__ADMIN_KEY);
		createEAttribute(applicationEClass, APPLICATION__PLUGIN);
		createEReference(applicationEClass, APPLICATION__COMMANDS);
		createEReference(applicationEClass, APPLICATION__COMPONENTS);
		createEReference(applicationEClass, APPLICATION__CONFIG);
		createEReference(applicationEClass, APPLICATION__CONTEXT);
		createEReference(applicationEClass, APPLICATION__CONTEXT_DESCRIPTION);
		createEReference(applicationEClass, APPLICATION__HOOKS);
		createEReference(applicationEClass, APPLICATION__LOGS);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEReference(applicationEClass, APPLICATION__PATHS);
		createEReference(applicationEClass, APPLICATION__RESOURCE_MAPPING);
		createEAttribute(applicationEClass, APPLICATION__TEXT);

		applicationPathsEClass = createEClass(APPLICATION_PATHS);
		createEAttribute(applicationPathsEClass, APPLICATION_PATHS__DATA);
		createEAttribute(applicationPathsEClass, APPLICATION_PATHS__LOGS);
		createEAttribute(applicationPathsEClass, APPLICATION_PATHS__WORK);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__CONFIG);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__CONTEXT);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__HOOKS);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__COMMANDS);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__MODULES);
		createEAttribute(applicationComponentEClass, APPLICATION_COMPONENT__NAME);
		createEAttribute(applicationComponentEClass, APPLICATION_COMPONENT__STATUS);

		applicationLogsEClass = createEClass(APPLICATION_LOGS);
		createEReference(applicationLogsEClass, APPLICATION_LOGS__ENTRIES);
		createEAttribute(applicationLogsEClass, APPLICATION_LOGS__LEVEL);

		applicationLogEntryEClass = createEClass(APPLICATION_LOG_ENTRY);
		createEAttribute(applicationLogEntryEClass, APPLICATION_LOG_ENTRY__PACKAGE);
		createEAttribute(applicationLogEntryEClass, APPLICATION_LOG_ENTRY__LEVEL);

		applicationModuleEClass = createEClass(APPLICATION_MODULE);
		createEAttribute(applicationModuleEClass, APPLICATION_MODULE__NAME);
		createEReference(applicationModuleEClass, APPLICATION_MODULE__SERVICES);
		createEAttribute(applicationModuleEClass, APPLICATION_MODULE__STATUS);

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
		applicationLogLevelEEnum = createEEnum(APPLICATION_LOG_LEVEL);
		componentStatusEEnum = createEEnum(COMPONENT_STATUS);
		moduleStatusEEnum = createEEnum(MODULE_STATUS);
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		applicationBundleEDataType = createEDataType(APPLICATION_BUNDLE);
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
		ResourcePackage theResourcePackage = (ResourcePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		applicationComponentEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		applicationLogEntryEClass.getESuperTypes().add(theEntityPackage.getEntity());
		applicationModuleEClass.getESuperTypes().add(theEntityPackage.getEntity());
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
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_AdminKey(), ecorePackage.getEString(), "adminKey", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Plugin(), ecorePackage.getEString(), "plugin", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Commands(), this.getServiceCommandProviderReg(), null, "commands", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Components(), this.getApplicationComponent(), null, "components", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Config(), this.getServiceConfig(), null, "config", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Context(), theContextPackage.getContextRoot(), null, "context", null, 0, 1, Application.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ContextDescription(), theContextPackage.getContextDescription(), null, "contextDescription", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Hooks(), this.getServiceHookReg(), null, "hooks", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Logs(), this.getApplicationLogs(), null, "logs", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Paths(), this.getApplicationPaths(), null, "paths", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ResourceMapping(), theResourcePackage.getResourceMapping(), null, "resourceMapping", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Text(), ecorePackage.getEString(), "text", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(applicationEClass, this.getApplicationComponent(), "getActiveComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationEClass, this.getApplicationBundle(), "getBundle", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationEClass, ecorePackage.getEString(), "getInstallArea", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(applicationEClass, ecorePackage.getEString(), "locateBundle", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationPathsEClass, ApplicationPaths.class, "ApplicationPaths", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationPaths_Data(), ecorePackage.getEString(), "data", null, 1, 1, ApplicationPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationPaths_Logs(), ecorePackage.getEString(), "logs", null, 1, 1, ApplicationPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationPaths_Work(), ecorePackage.getEString(), "work", null, 1, 1, ApplicationPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationComponentEClass, ApplicationComponent.class, "ApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationComponent_Config(), this.getServiceConfig(), null, "config", null, 0, 1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Context(), theContextPackage.getContext(), null, "context", null, 0, 1, ApplicationComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Hooks(), this.getServiceHookReg(), null, "hooks", null, 0, -1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Commands(), this.getServiceCommandProviderReg(), null, "commands", null, 0, -1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Modules(), this.getApplicationModule(), null, "modules", null, 0, -1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationComponent_Status(), this.getComponentStatus(), "status", "ACT", 1, 1, ApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationLogsEClass, ApplicationLogs.class, "ApplicationLogs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationLogs_Entries(), this.getApplicationLogEntry(), null, "entries", null, 0, -1, ApplicationLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationLogs_Level(), this.getApplicationLogLevel(), "level", "WARN", 1, 1, ApplicationLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationLogEntryEClass, ApplicationLogEntry.class, "ApplicationLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationLogEntry_Package(), ecorePackage.getEString(), "package", null, 1, 1, ApplicationLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationLogEntry_Level(), this.getApplicationLogLevel(), "level", "WARN", 1, 1, ApplicationLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationModuleEClass, ApplicationModule.class, "ApplicationModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationModule_Services(), this.getServiceReg(), null, "services", null, 0, -1, ApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationModule_Status(), this.getModuleStatus(), "status", "ACT", 1, 1, ApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEEnum(applicationLogLevelEEnum, ApplicationLogLevel.class, "ApplicationLogLevel");
		addEEnumLiteral(applicationLogLevelEEnum, ApplicationLogLevel.ERROR);
		addEEnumLiteral(applicationLogLevelEEnum, ApplicationLogLevel.WARNING);
		addEEnumLiteral(applicationLogLevelEEnum, ApplicationLogLevel.INFO);
		addEEnumLiteral(applicationLogLevelEEnum, ApplicationLogLevel.DEBUG);
		addEEnumLiteral(applicationLogLevelEEnum, ApplicationLogLevel.TRACE);

		initEEnum(componentStatusEEnum, ComponentStatus.class, "ComponentStatus");
		addEEnumLiteral(componentStatusEEnum, ComponentStatus.ACTIVE);
		addEEnumLiteral(componentStatusEEnum, ComponentStatus.STOPPED);
		addEEnumLiteral(componentStatusEEnum, ComponentStatus.TESTING);

		initEEnum(moduleStatusEEnum, ModuleStatus.class, "ModuleStatus");
		addEEnumLiteral(moduleStatusEEnum, ModuleStatus.ACTIVE);
		addEEnumLiteral(moduleStatusEEnum, ModuleStatus.STOPPED);
		addEEnumLiteral(moduleStatusEEnum, ModuleStatus.TESTING);

		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.STOPPED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.TESTING);

		// Initialize data types
		initEDataType(applicationBundleEDataType, Bundle.class, "ApplicationBundle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ApplicationPackageImpl
