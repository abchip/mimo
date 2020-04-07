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
	 * Returns a new object of class '<em>Http Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Service Config</em>'.
	 * @generated
	 */
	HttpServiceConfig createHttpServiceConfig();

	/**
	 * Returns a new object of class '<em>Service Command Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Command Provider</em>'.
	 * @generated
	 */
	ServiceCommandProvider createServiceCommandProvider();

	/**
	 * Returns a new object of class '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Config</em>'.
	 * @generated
	 */
	ServiceConfig createServiceConfig();

	/**
	 * Returns a new object of class '<em>Service Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Hook</em>'.
	 * @generated
	 */
	ServiceHook createServiceHook();

	/**
	 * Returns a new object of class '<em>Service Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Executor</em>'.
	 * @generated
	 */
	ServiceExecutor createServiceExecutor();

	/**
	 * Returns a new object of class '<em>Service Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Factory</em>'.
	 * @generated
	 */
	ServiceFactory createServiceFactory();

	/**
	 * Returns a new object of class '<em>Service Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry</em>'.
	 * @generated
	 */
	ServiceRegistry createServiceRegistry();

	/**
	 * Returns a new object of class '<em>Service Registry Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry Entry</em>'.
	 * @generated
	 */
	ServiceRegistryEntry createServiceRegistryEntry();

	/**
	 * Returns a new object of class '<em>Service Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Servlet</em>'.
	 * @generated
	 */
	ServiceServlet createServiceServlet();

	/**
	 * Returns a new object of class '<em>Service Tester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Tester</em>'.
	 * @generated
	 */
	ServiceTester createServiceTester();

	/**
	 * Returns a new object of class '<em>Socket Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socket Config</em>'.
	 * @generated
	 */
	SocketConfig createSocketConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory
