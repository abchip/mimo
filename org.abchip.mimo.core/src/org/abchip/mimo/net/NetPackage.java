/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.net;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.net.NetFactory
 * @model kind="package"
 * @generated
 */
public interface NetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "net";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/net";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-net";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetPackage eINSTANCE = org.abchip.mimo.net.impl.NetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.net.impl.SocketConfigImpl <em>Socket Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.net.impl.SocketConfigImpl
	 * @see org.abchip.mimo.net.impl.NetPackageImpl#getSocketConfig()
	 * @generated
	 */
	int SOCKET_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG__ADDRESS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG__PORT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Socket Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Socket Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.net.SocketConfig <em>Socket Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket Config</em>'.
	 * @see org.abchip.mimo.net.SocketConfig
	 * @generated
	 */
	EClass getSocketConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.net.SocketConfig#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.abchip.mimo.net.SocketConfig#getAddress()
	 * @see #getSocketConfig()
	 * @generated
	 */
	EAttribute getSocketConfig_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.net.SocketConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.net.SocketConfig#getPort()
	 * @see #getSocketConfig()
	 * @generated
	 */
	EAttribute getSocketConfig_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetFactory getNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.net.impl.SocketConfigImpl <em>Socket Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.net.impl.SocketConfigImpl
		 * @see org.abchip.mimo.net.impl.NetPackageImpl#getSocketConfig()
		 * @generated
		 */
		EClass SOCKET_CONFIG = eINSTANCE.getSocketConfig();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_CONFIG__ADDRESS = eINSTANCE.getSocketConfig_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_CONFIG__PORT = eINSTANCE.getSocketConfig_Port();

	}

} //NetPackage
