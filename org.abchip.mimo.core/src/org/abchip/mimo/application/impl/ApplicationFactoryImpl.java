/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.application.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.APPLICATION: return (EObject)createApplication();
			case ApplicationPackage.APPLICATION_PATHS: return (EObject)createApplicationPaths();
			case ApplicationPackage.APPLICATION_COMPONENT: return (EObject)createApplicationComponent();
			case ApplicationPackage.APPLICATION_LOGS: return (EObject)createApplicationLogs();
			case ApplicationPackage.APPLICATION_LOG_ENTRY: return (EObject)createApplicationLogEntry();
			case ApplicationPackage.APPLICATION_MODULE: return (EObject)createApplicationModule();
			case ApplicationPackage.SERVICE_COMMAND_PROVIDER: return (EObject)createServiceCommandProvider();
			case ApplicationPackage.SERVICE_CONFIG: return (EObject)createServiceConfig();
			case ApplicationPackage.SERVICE_HOOK: return (EObject)createServiceHook();
			case ApplicationPackage.SERVICE_EXECUTOR: return (EObject)createServiceExecutor();
			case ApplicationPackage.SERVICE_FACTORY: return (EObject)createServiceFactory();
			case ApplicationPackage.SERVICE_REGISTRY: return (EObject)createServiceRegistry();
			case ApplicationPackage.SERVICE_REGISTRY_ENTRY: return (EObject)createServiceRegistryEntry();
			case ApplicationPackage.SERVICE_SERVLET: return (EObject)createServiceServlet();
			case ApplicationPackage.SERVICE_TESTER: return (EObject)createServiceTester();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.APPLICATION_LOG_LEVEL:
				return createApplicationLogLevelFromString(eDataType, initialValue);
			case ApplicationPackage.COMPONENT_STATUS:
				return createComponentStatusFromString(eDataType, initialValue);
			case ApplicationPackage.MODULE_STATUS:
				return createModuleStatusFromString(eDataType, initialValue);
			case ApplicationPackage.SERVICE_STATUS:
				return createServiceStatusFromString(eDataType, initialValue);
			case ApplicationPackage.APPLICATION_BUNDLE:
				return createApplicationBundleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.APPLICATION_LOG_LEVEL:
				return convertApplicationLogLevelToString(eDataType, instanceValue);
			case ApplicationPackage.COMPONENT_STATUS:
				return convertComponentStatusToString(eDataType, instanceValue);
			case ApplicationPackage.MODULE_STATUS:
				return convertModuleStatusToString(eDataType, instanceValue);
			case ApplicationPackage.SERVICE_STATUS:
				return convertServiceStatusToString(eDataType, instanceValue);
			case ApplicationPackage.APPLICATION_BUNDLE:
				return convertApplicationBundleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationPaths createApplicationPaths() {
		ApplicationPathsImpl applicationPaths = new ApplicationPathsImpl();
		return applicationPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationComponent createApplicationComponent() {
		ApplicationComponentImpl applicationComponent = new ApplicationComponentImpl();
		return applicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLogs createApplicationLogs() {
		ApplicationLogsImpl applicationLogs = new ApplicationLogsImpl();
		return applicationLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLogEntry createApplicationLogEntry() {
		ApplicationLogEntryImpl applicationLogEntry = new ApplicationLogEntryImpl();
		return applicationLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationModule createApplicationModule() {
		ApplicationModuleImpl applicationModule = new ApplicationModuleImpl();
		return applicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCommandProvider createServiceCommandProvider() {
		ServiceCommandProviderImpl serviceCommandProvider = new ServiceCommandProviderImpl();
		return serviceCommandProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceConfig createServiceConfig() {
		ServiceConfigImpl serviceConfig = new ServiceConfigImpl();
		return serviceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceHook createServiceHook() {
		ServiceHookImpl serviceHook = new ServiceHookImpl();
		return serviceHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceExecutor createServiceExecutor() {
		ServiceExecutorImpl serviceExecutor = new ServiceExecutorImpl();
		return serviceExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFactory createServiceFactory() {
		ServiceFactoryImpl serviceFactory = new ServiceFactoryImpl();
		return serviceFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRegistry createServiceRegistry() {
		ServiceRegistryImpl serviceRegistry = new ServiceRegistryImpl();
		return serviceRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRegistryEntry createServiceRegistryEntry() {
		ServiceRegistryEntryImpl serviceRegistryEntry = new ServiceRegistryEntryImpl();
		return serviceRegistryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceServlet createServiceServlet() {
		ServiceServletImpl serviceServlet = new ServiceServletImpl();
		return serviceServlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceTester createServiceTester() {
		ServiceTesterImpl serviceTester = new ServiceTesterImpl();
		return serviceTester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLogLevel createApplicationLogLevelFromString(EDataType eDataType, String initialValue) {
		ApplicationLogLevel result = ApplicationLogLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationLogLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStatus createComponentStatusFromString(EDataType eDataType, String initialValue) {
		ComponentStatus result = ComponentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleStatus createModuleStatusFromString(EDataType eDataType, String initialValue) {
		ModuleStatus result = ModuleStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus createServiceStatusFromString(EDataType eDataType, String initialValue) {
		ServiceStatus result = ServiceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createApplicationBundleFromString(EDataType eDataType, String initialValue) {
		return (Bundle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationBundleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl
