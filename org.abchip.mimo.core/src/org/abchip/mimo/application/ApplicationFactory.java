/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationFactory eINSTANCE = org.abchip.mimo.application.impl.ApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Paths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paths</em>'.
	 * @generated
	 */
	ApplicationPaths createApplicationPaths();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	ApplicationComponent createApplicationComponent();

	/**
	 * Returns a new object of class '<em>Logs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logs</em>'.
	 * @generated
	 */
	ApplicationLogs createApplicationLogs();

	/**
	 * Returns a new object of class '<em>Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Entry</em>'.
	 * @generated
	 */
	ApplicationLogEntry createApplicationLogEntry();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	ApplicationModule createApplicationModule();

	/**
	 * Returns a new object of class '<em>Service Command Provider Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Command Provider Reg</em>'.
	 * @generated
	 */
	ServiceCommandProviderReg createServiceCommandProviderReg();

	/**
	 * Returns a new object of class '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Config</em>'.
	 * @generated
	 */
	ServiceConfig createServiceConfig();

	/**
	 * Returns a new object of class '<em>Service Hook Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Hook Reg</em>'.
	 * @generated
	 */
	ServiceHookReg createServiceHookReg();

	/**
	 * Returns a new object of class '<em>Service Executor Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Executor Reg</em>'.
	 * @generated
	 */
	ServiceExecutorReg createServiceExecutorReg();

	/**
	 * Returns a new object of class '<em>Service Factory Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Factory Reg</em>'.
	 * @generated
	 */
	ServiceFactoryReg createServiceFactoryReg();

	/**
	 * Returns a new object of class '<em>Service Registry Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry Reg</em>'.
	 * @generated
	 */
	ServiceRegistryReg createServiceRegistryReg();

	/**
	 * Returns a new object of class '<em>Service Registry Entry Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry Entry Reg</em>'.
	 * @generated
	 */
	ServiceRegistryEntryReg createServiceRegistryEntryReg();

	/**
	 * Returns a new object of class '<em>Service Servlet Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Servlet Reg</em>'.
	 * @generated
	 */
	ServiceServletReg createServiceServletReg();

	/**
	 * Returns a new object of class '<em>Service Tester Reg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Tester Reg</em>'.
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
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory
