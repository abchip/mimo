/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.application;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.abchip.mimo.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/application";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = org.abchip.mimo.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMMANDS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPONENTS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONFIG = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Context Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT_DESCRIPTION = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOOKS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PORT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationComponentImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONFIG = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONTEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__HOOKS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__COMMANDS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__MODULES = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.ApplicationManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.ApplicationManager
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationManager()
	 * @generated
	 */
	int APPLICATION_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationModuleImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationModule()
	 * @generated
	 */
	int APPLICATION_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__SERVICES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceRefImpl <em>Service Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceRefImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRef()
	 * @generated
	 */
	int SERVICE_REF = 8;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__CLASS_NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__STATUS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceCommandProviderImpl <em>Service Command Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceCommandProviderImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceCommandProvider()
	 * @generated
	 */
	int SERVICE_COMMAND_PROVIDER = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceConfigImpl <em>Service Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceConfigImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceConfig()
	 * @generated
	 */
	int SERVICE_CONFIG = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceHookImpl <em>Service Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceHookImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceHook()
	 * @generated
	 */
	int SERVICE_HOOK = 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceExecutorImpl <em>Service Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceExecutorImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceExecutor()
	 * @generated
	 */
	int SERVICE_EXECUTOR = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceResourceListenerImpl <em>Service Resource Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceResourceListenerImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceResourceListener()
	 * @generated
	 */
	int SERVICE_RESOURCE_LISTENER = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceRegistryImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRegistry()
	 * @generated
	 */
	int SERVICE_REGISTRY = 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl <em>Service Registry Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceRegistryEntryImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRegistryEntry()
	 * @generated
	 */
	int SERVICE_REGISTRY_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Command Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__STATUS = SERVICE_REF__STATUS;

	/**
	 * The number of structural features of the '<em>Service Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__REMOTE_EXPORT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Resource Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__ENTRIES = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__NAME = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__VENDOR = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__VERSION = SERVICE_REF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Registry Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ServiceTesterImpl <em>Service Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ServiceTesterImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceTester()
	 * @generated
	 */
	int SERVICE_TESTER = 12;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.ServiceStatus <em>Service Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.ServiceStatus
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 13;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.abchip.mimo.application.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.Application#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.abchip.mimo.application.Application#getCommands()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.Application#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.abchip.mimo.application.Application#getComponents()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.abchip.mimo.application.Application#getConfig()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Config();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.abchip.mimo.application.Application#getContext()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getContextDescription <em>Context Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Description</em>'.
	 * @see org.abchip.mimo.application.Application#getContextDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ContextDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.Application#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.abchip.mimo.application.Application#getHooks()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Hooks();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.application.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.Application#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.application.Application#getPort()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.Application#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.application.Application#getText()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.ApplicationComponent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getConfig()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Config();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.ApplicationComponent#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getContext()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ApplicationComponent#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getHooks()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Hooks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ApplicationComponent#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getCommands()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ApplicationComponent#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getModules()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Modules();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getName()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EAttribute getApplicationComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.application.ApplicationManager
	 * @generated
	 */
	EClass getApplicationManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.abchip.mimo.application.ApplicationModule
	 * @generated
	 */
	EClass getApplicationModule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.application.ApplicationModule#getName()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EAttribute getApplicationModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ApplicationModule#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.abchip.mimo.application.ApplicationModule#getServices()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EReference getApplicationModule_Services();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceCommandProvider <em>Service Command Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Command Provider</em>'.
	 * @see org.abchip.mimo.application.ServiceCommandProvider
	 * @generated
	 */
	EClass getServiceCommandProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceCommandProvider#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceCommandProvider#getInterfaceName()
	 * @see #getServiceCommandProvider()
	 * @generated
	 */
	EAttribute getServiceCommandProvider_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceConfig <em>Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Config</em>'.
	 * @see org.abchip.mimo.application.ServiceConfig
	 * @generated
	 */
	EClass getServiceConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ServiceConfig#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.abchip.mimo.application.ServiceConfig#getEntities()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Entities();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceHook <em>Service Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Hook</em>'.
	 * @see org.abchip.mimo.application.ServiceHook
	 * @generated
	 */
	EClass getServiceHook();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceExecutor <em>Service Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Executor</em>'.
	 * @see org.abchip.mimo.application.ServiceExecutor
	 * @generated
	 */
	EClass getServiceExecutor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceExecutor#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceExecutor#getInterfaceName()
	 * @see #getServiceExecutor()
	 * @generated
	 */
	EAttribute getServiceExecutor_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceExecutor#isRemoteExport <em>Remote Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Export</em>'.
	 * @see org.abchip.mimo.application.ServiceExecutor#isRemoteExport()
	 * @see #getServiceExecutor()
	 * @generated
	 */
	EAttribute getServiceExecutor_RemoteExport();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref</em>'.
	 * @see org.abchip.mimo.application.ServiceRef
	 * @generated
	 */
	EClass getServiceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRef#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.abchip.mimo.application.ServiceRef#getClassName()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRef#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.application.ServiceRef#getStatus()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceResourceListener <em>Service Resource Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource Listener</em>'.
	 * @see org.abchip.mimo.application.ServiceResourceListener
	 * @generated
	 */
	EClass getServiceResourceListener();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceResourceListener#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceResourceListener#getInterfaceName()
	 * @see #getServiceResourceListener()
	 * @generated
	 */
	EAttribute getServiceResourceListener_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistry
	 * @generated
	 */
	EClass getServiceRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ServiceRegistry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistry#getEntries()
	 * @see #getServiceRegistry()
	 * @generated
	 */
	EReference getServiceRegistry_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRegistry#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistry#getInterfaceName()
	 * @see #getServiceRegistry()
	 * @generated
	 */
	EAttribute getServiceRegistry_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceRegistryEntry <em>Service Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry Entry</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistryEntry
	 * @generated
	 */
	EClass getServiceRegistryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRegistryEntry#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistryEntry#getInterfaceName()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRegistryEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistryEntry#getName()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRegistryEntry#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistryEntry#getVendor()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceRegistryEntry#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.abchip.mimo.application.ServiceRegistryEntry#getVersion()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Version();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ServiceTester <em>Service Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Tester</em>'.
	 * @see org.abchip.mimo.application.ServiceTester
	 * @generated
	 */
	EClass getServiceTester();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ServiceTester#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.application.ServiceTester#getInterfaceName()
	 * @see #getServiceTester()
	 * @generated
	 */
	EAttribute getServiceTester_InterfaceName();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.application.ServiceStatus <em>Service Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Status</em>'.
	 * @see org.abchip.mimo.application.ServiceStatus
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
	ApplicationFactory getApplicationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMMANDS = eINSTANCE.getApplication_Commands();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMPONENTS = eINSTANCE.getApplication_Components();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONFIG = eINSTANCE.getApplication_Config();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTEXT = eINSTANCE.getApplication_Context();

		/**
		 * The meta object literal for the '<em><b>Context Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTEXT_DESCRIPTION = eINSTANCE.getApplication_ContextDescription();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HOOKS = eINSTANCE.getApplication_Hooks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PORT = eINSTANCE.getApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TEXT = eINSTANCE.getApplication_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationComponentImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__CONFIG = eINSTANCE.getApplicationComponent_Config();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__CONTEXT = eINSTANCE.getApplicationComponent_Context();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__HOOKS = eINSTANCE.getApplicationComponent_Hooks();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__COMMANDS = eINSTANCE.getApplicationComponent_Commands();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__MODULES = eINSTANCE.getApplicationComponent_Modules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_COMPONENT__NAME = eINSTANCE.getApplicationComponent_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.ApplicationManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.ApplicationManager
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationManager()
		 * @generated
		 */
		EClass APPLICATION_MANAGER = eINSTANCE.getApplicationManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationModuleImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationModule()
		 * @generated
		 */
		EClass APPLICATION_MODULE = eINSTANCE.getApplicationModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MODULE__NAME = eINSTANCE.getApplicationModule_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODULE__SERVICES = eINSTANCE.getApplicationModule_Services();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceCommandProviderImpl <em>Service Command Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceCommandProviderImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceCommandProvider()
		 * @generated
		 */
		EClass SERVICE_COMMAND_PROVIDER = eINSTANCE.getServiceCommandProvider();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMMAND_PROVIDER__INTERFACE_NAME = eINSTANCE.getServiceCommandProvider_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceConfigImpl <em>Service Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceConfigImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceConfig()
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
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceHookImpl <em>Service Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceHookImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceHook()
		 * @generated
		 */
		EClass SERVICE_HOOK = eINSTANCE.getServiceHook();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceExecutorImpl <em>Service Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceExecutorImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceExecutor()
		 * @generated
		 */
		EClass SERVICE_EXECUTOR = eINSTANCE.getServiceExecutor();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR__INTERFACE_NAME = eINSTANCE.getServiceExecutor_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Remote Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR__REMOTE_EXPORT = eINSTANCE.getServiceExecutor_RemoteExport();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceRefImpl <em>Service Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceRefImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRef()
		 * @generated
		 */
		EClass SERVICE_REF = eINSTANCE.getServiceRef();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__CLASS_NAME = eINSTANCE.getServiceRef_ClassName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__STATUS = eINSTANCE.getServiceRef_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceResourceListenerImpl <em>Service Resource Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceResourceListenerImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceResourceListener()
		 * @generated
		 */
		EClass SERVICE_RESOURCE_LISTENER = eINSTANCE.getServiceResourceListener();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE_LISTENER__INTERFACE_NAME = eINSTANCE.getServiceResourceListener_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceRegistryImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRegistry()
		 * @generated
		 */
		EClass SERVICE_REGISTRY = eINSTANCE.getServiceRegistry();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REGISTRY__ENTRIES = eINSTANCE.getServiceRegistry_Entries();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY__INTERFACE_NAME = eINSTANCE.getServiceRegistry_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl <em>Service Registry Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceRegistryEntryImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceRegistryEntry()
		 * @generated
		 */
		EClass SERVICE_REGISTRY_ENTRY = eINSTANCE.getServiceRegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__INTERFACE_NAME = eINSTANCE.getServiceRegistryEntry_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__NAME = eINSTANCE.getServiceRegistryEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__VENDOR = eINSTANCE.getServiceRegistryEntry_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__VERSION = eINSTANCE.getServiceRegistryEntry_Version();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ServiceTesterImpl <em>Service Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ServiceTesterImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceTester()
		 * @generated
		 */
		EClass SERVICE_TESTER = eINSTANCE.getServiceTester();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TESTER__INTERFACE_NAME = eINSTANCE.getServiceTester_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.ServiceStatus <em>Service Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.ServiceStatus
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

	}

} //ApplicationPackage
