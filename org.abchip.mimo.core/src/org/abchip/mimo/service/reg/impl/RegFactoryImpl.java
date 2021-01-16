/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.reg.impl;

import org.abchip.mimo.service.reg.*;

import org.eclipse.emf.ecore.EClass;
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
public class RegFactoryImpl extends EFactoryImpl implements RegFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegFactory init() {
		try {
			RegFactory theRegFactory = (RegFactory)EPackage.Registry.INSTANCE.getEFactory(RegPackage.eNS_URI);
			if (theRegFactory != null) {
				return theRegFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegFactoryImpl() {
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
			case RegPackage.SERVICE_COMMAND_PROVIDER_REG: return (EObject)createServiceCommandProviderReg();
			case RegPackage.SERVICE_HOOK_REG: return (EObject)createServiceHookReg();
			case RegPackage.SERVICE_EXECUTOR_REG: return (EObject)createServiceExecutorReg();
			case RegPackage.SERVICE_FACTORY_REG: return (EObject)createServiceFactoryReg();
			case RegPackage.SERVICE_REGISTRY_REG: return (EObject)createServiceRegistryReg();
			case RegPackage.SERVICE_REGISTRY_ENTRY_REG: return (EObject)createServiceRegistryEntryReg();
			case RegPackage.SERVICE_SERVLET_REG: return (EObject)createServiceServletReg();
			case RegPackage.SERVICE_TESTER_REG: return (EObject)createServiceTesterReg();
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
	@Override
	public RegPackage getRegPackage() {
		return (RegPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegPackage getPackage() {
		return RegPackage.eINSTANCE;
	}

} //RegFactoryImpl
