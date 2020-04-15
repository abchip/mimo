/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.service.ServicePackage
 * @generated
 */
public interface ServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceFactory eINSTANCE = org.abchip.mimo.service.impl.ServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Command Provider Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Provider Reg</em>'.
	 * @generated
	 */
	ServiceCommandProviderReg createServiceCommandProviderReg();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	ServiceConfig createServiceConfig();

	/**
	 * Returns a new object of class '<em>Hook Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Reg</em>'.
	 * @generated
	 */
	ServiceHookReg createServiceHookReg();

	/**
	 * Returns a new object of class '<em>Executor Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executor Reg</em>'.
	 * @generated
	 */
	ServiceExecutorReg createServiceExecutorReg();

	/**
	 * Returns a new object of class '<em>Factory Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Reg</em>'.
	 * @generated
	 */
	ServiceFactoryReg createServiceFactoryReg();

	/**
	 * Returns a new object of class '<em>Registry Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Reg</em>'.
	 * @generated
	 */
	ServiceRegistryReg createServiceRegistryReg();

	/**
	 * Returns a new object of class '<em>Registry Entry Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Entry Reg</em>'.
	 * @generated
	 */
	ServiceRegistryEntryReg createServiceRegistryEntryReg();

	/**
	 * Returns a new object of class '<em>Servlet Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servlet Reg</em>'.
	 * @generated
	 */
	ServiceServletReg createServiceServletReg();

	/**
	 * Returns a new object of class '<em>Tester Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tester Reg</em>'.
	 * @generated
	 */
	ServiceTesterReg createServiceTesterReg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePackage getServicePackage();

} //ServiceFactoryReg
