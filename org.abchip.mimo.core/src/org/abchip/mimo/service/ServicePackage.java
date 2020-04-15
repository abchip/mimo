/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = org.abchip.mimo.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceConfigImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceConfig()
	 * @generated
	 */
	int SERVICE_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__ENTITIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceExecutor <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceExecutor
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceExecutor()
	 * @generated
	 */
	int SERVICE_EXECUTOR = 1;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceManager
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceManager()
	 * @generated
	 */
	int SERVICE_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceStatus
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.abchip.mimo.service.ServiceConfig
	 * @generated
	 */
	EClass getServiceConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.service.ServiceConfig#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.abchip.mimo.service.ServiceConfig#getEntities()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Entities();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see org.abchip.mimo.service.ServiceExecutor
	 * @generated
	 */
	EClass getServiceExecutor();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.service.ServiceManager
	 * @generated
	 */
	EClass getServiceManager();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.service.ServiceStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.abchip.mimo.service.ServiceStatus
	 * @generated
	 */
	EEnum getServiceStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceConfigImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceConfig()
		 * @generated
		 */
		EClass SERVICE_CONFIG = eINSTANCE.getServiceConfig();
		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__ENTITIES = eINSTANCE.getServiceConfig_Entities();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceExecutor <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceExecutor
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceExecutor()
		 * @generated
		 */
		EClass SERVICE_EXECUTOR = eINSTANCE.getServiceExecutor();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceManager
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceManager()
		 * @generated
		 */
		EClass SERVICE_MANAGER = eINSTANCE.getServiceManager();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceStatus
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

	}

} //ServicePackage
