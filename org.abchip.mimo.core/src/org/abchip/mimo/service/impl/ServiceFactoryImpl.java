/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

import org.abchip.mimo.service.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init() {
		try {
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null) {
				return theServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactoryImpl() {
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
			case ServicePackage.SERVICE_COMMAND_PROVIDER_REG: return (EObject)createServiceCommandProviderReg();
			case ServicePackage.SERVICE_CONFIG: return (EObject)createServiceConfig();
			case ServicePackage.SERVICE_HOOK_REG: return (EObject)createServiceHookReg();
			case ServicePackage.SERVICE_EXECUTOR_REG: return (EObject)createServiceExecutorReg();
			case ServicePackage.SERVICE_FACTORY_REG: return (EObject)createServiceFactoryReg();
			case ServicePackage.SERVICE_REGISTRY_REG: return (EObject)createServiceRegistryReg();
			case ServicePackage.SERVICE_REGISTRY_ENTRY_REG: return (EObject)createServiceRegistryEntryReg();
			case ServicePackage.SERVICE_SERVLET_REG: return (EObject)createServiceServletReg();
			case ServicePackage.SERVICE_TESTER_REG: return (EObject)createServiceTesterReg();
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
			case ServicePackage.SERVICE_STATUS:
				return createServiceStatusFromString(eDataType, initialValue);
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
			case ServicePackage.SERVICE_STATUS:
				return convertServiceStatusToString(eDataType, instanceValue);
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
	public ServiceCommandProviderReg createServiceCommandProviderReg() {
		ServiceCommandProviderRegImpl serviceCommandProviderReg = new ServiceCommandProviderRegImpl();
		return serviceCommandProviderReg;
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
	public ServiceHookReg createServiceHookReg() {
		ServiceHookRegImpl serviceHookReg = new ServiceHookRegImpl();
		return serviceHookReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceExecutorReg createServiceExecutorReg() {
		ServiceExecutorRegImpl serviceExecutorReg = new ServiceExecutorRegImpl();
		return serviceExecutorReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFactoryReg createServiceFactoryReg() {
		ServiceFactoryRegImpl serviceFactoryReg = new ServiceFactoryRegImpl();
		return serviceFactoryReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRegistryReg createServiceRegistryReg() {
		ServiceRegistryRegImpl serviceRegistryReg = new ServiceRegistryRegImpl();
		return serviceRegistryReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRegistryEntryReg createServiceRegistryEntryReg() {
		ServiceRegistryEntryRegImpl serviceRegistryEntryReg = new ServiceRegistryEntryRegImpl();
		return serviceRegistryEntryReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceServletReg createServiceServletReg() {
		ServiceServletRegImpl serviceServletReg = new ServiceServletRegImpl();
		return serviceServletReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceTesterReg createServiceTesterReg() {
		ServiceTesterRegImpl serviceTesterReg = new ServiceTesterRegImpl();
		return serviceTesterReg;
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
	@Override
	public ServicePackage getServicePackage() {
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage() {
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryRegImpl
