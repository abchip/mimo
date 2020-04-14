/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.networking.NetworkingPackage
 * @generated
 */
public interface NetworkingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingFactory eINSTANCE = org.abchip.mimo.networking.impl.NetworkingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connection Pooling Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Pooling Config</em>'.
	 * @generated
	 */
	ConnectionPoolingConfig createConnectionPoolingConfig();

	/**
	 * Returns a new object of class '<em>Connection Pooling Route Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Pooling Route Config</em>'.
	 * @generated
	 */
	ConnectionPoolingRouteConfig createConnectionPoolingRouteConfig();

	/**
	 * Returns a new object of class '<em>Host Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Config</em>'.
	 * @generated
	 */
	HostConfig createHostConfig();

	/**
	 * Returns a new object of class '<em>Http Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Service Config</em>'.
	 * @generated
	 */
	HttpServiceConfig createHttpServiceConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkingPackage getNetworkingPackage();

} //NetworkingFactory
