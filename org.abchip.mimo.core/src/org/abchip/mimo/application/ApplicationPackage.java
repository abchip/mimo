/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.service.ServicePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Admin Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ADMIN_KEY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PLUGIN = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMMANDS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPONENTS = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Context Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT_DESCRIPTION = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOOKS = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LOGS = EntityPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PATHS = EntityPackage.ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resource Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCE_MAPPING = EntityPackage.ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SERVICE_MAPPING = EntityPackage.ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEXT = EntityPackage.ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '<em>Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Bundle
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationBundle()
	 * @generated
	 */
	int APPLICATION_BUNDLE = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationPathsImpl <em>Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationPathsImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationPaths()
	 * @generated
	 */
	int APPLICATION_PATHS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PATHS__DATA = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PATHS__LOGS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PATHS__WORK = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PATHS_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationComponentImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__HOOKS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__COMMANDS = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__MODULES = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__STATUS = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationLogsImpl <em>Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationLogsImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogs()
	 * @generated
	 */
	int APPLICATION_LOGS = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOGS__ENTRIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOGS__LEVEL = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOGS_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationLogEntryImpl <em>Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationLogEntryImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogEntry()
	 * @generated
	 */
	int APPLICATION_LOG_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOG_ENTRY__PACKAGE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOG_ENTRY__LEVEL = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LOG_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ApplicationModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ApplicationModuleImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationModule()
	 * @generated
	 */
	int APPLICATION_MODULE = 5;

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
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__STATUS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.ResetLogImpl <em>Reset Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.ResetLogImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getResetLog()
	 * @generated
	 */
	int RESET_LOG = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_LOG__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The number of structural features of the '<em>Reset Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_LOG_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.impl.SetLogImpl <em>Set Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.impl.SetLogImpl
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getSetLog()
	 * @generated
	 */
	int SET_LOG = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LOG__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Log Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LOG__LOG_PATTERN = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LOG__LOG_LEVEL = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LOG_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.ApplicationLogLevel <em>Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogLevel()
	 * @generated
	 */
	int APPLICATION_LOG_LEVEL = 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.ComponentStatus <em>Component Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.ComponentStatus
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getComponentStatus()
	 * @generated
	 */
	int COMPONENT_STATUS = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.application.ModuleStatus <em>Module Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.application.ModuleStatus
	 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getModuleStatus()
	 * @generated
	 */
	int MODULE_STATUS = 10;

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.Application#getAdminKey <em>Admin Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Key</em>'.
	 * @see org.abchip.mimo.application.Application#getAdminKey()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_AdminKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.Application#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin</em>'.
	 * @see org.abchip.mimo.application.Application#getPlugin()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Plugin();

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
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logs</em>'.
	 * @see org.abchip.mimo.application.Application#getLogs()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Logs();

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
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paths</em>'.
	 * @see org.abchip.mimo.application.Application#getPaths()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Paths();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getResourceMapping <em>Resource Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Mapping</em>'.
	 * @see org.abchip.mimo.application.Application#getResourceMapping()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ResourceMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.application.Application#getServiceMapping <em>Service Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Mapping</em>'.
	 * @see org.abchip.mimo.application.Application#getServiceMapping()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ServiceMapping();

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
	 * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bundle</em>'.
	 * @see org.osgi.framework.Bundle
	 * @model instanceClass="org.osgi.framework.Bundle"
	 * @generated
	 */
	EDataType getApplicationBundle();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paths</em>'.
	 * @see org.abchip.mimo.application.ApplicationPaths
	 * @generated
	 */
	EClass getApplicationPaths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationPaths#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.abchip.mimo.application.ApplicationPaths#getData()
	 * @see #getApplicationPaths()
	 * @generated
	 */
	EAttribute getApplicationPaths_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationPaths#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logs</em>'.
	 * @see org.abchip.mimo.application.ApplicationPaths#getLogs()
	 * @see #getApplicationPaths()
	 * @generated
	 */
	EAttribute getApplicationPaths_Logs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationPaths#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see org.abchip.mimo.application.ApplicationPaths#getWork()
	 * @see #getApplicationPaths()
	 * @generated
	 */
	EAttribute getApplicationPaths_Work();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationComponent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.application.ApplicationComponent#getStatus()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EAttribute getApplicationComponent_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logs</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogs
	 * @generated
	 */
	EClass getApplicationLogs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.application.ApplicationLogs#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogs#getEntries()
	 * @see #getApplicationLogs()
	 * @generated
	 */
	EReference getApplicationLogs_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationLogs#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogs#getLevel()
	 * @see #getApplicationLogs()
	 * @generated
	 */
	EAttribute getApplicationLogs_Level();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ApplicationLogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Entry</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogEntry
	 * @generated
	 */
	EClass getApplicationLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationLogEntry#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogEntry#getPackage()
	 * @see #getApplicationLogEntry()
	 * @generated
	 */
	EAttribute getApplicationLogEntry_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationLogEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogEntry#getLevel()
	 * @see #getApplicationLogEntry()
	 * @generated
	 */
	EAttribute getApplicationLogEntry_Level();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.ApplicationModule#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.application.ApplicationModule#getStatus()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EAttribute getApplicationModule_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.ResetLog <em>Reset Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Log</em>'.
	 * @see org.abchip.mimo.application.ResetLog
	 * @generated
	 */
	EClass getResetLog();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.application.SetLog <em>Set Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Log</em>'.
	 * @see org.abchip.mimo.application.SetLog
	 * @generated
	 */
	EClass getSetLog();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.SetLog#getLogPattern <em>Log Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Pattern</em>'.
	 * @see org.abchip.mimo.application.SetLog#getLogPattern()
	 * @see #getSetLog()
	 * @generated
	 */
	EAttribute getSetLog_LogPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.application.SetLog#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.abchip.mimo.application.SetLog#getLogLevel()
	 * @see #getSetLog()
	 * @generated
	 */
	EAttribute getSetLog_LogLevel();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.application.ApplicationLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Level</em>'.
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @generated
	 */
	EEnum getApplicationLogLevel();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.application.ComponentStatus <em>Component Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Status</em>'.
	 * @see org.abchip.mimo.application.ComponentStatus
	 * @generated
	 */
	EEnum getComponentStatus();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.application.ModuleStatus <em>Module Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Status</em>'.
	 * @see org.abchip.mimo.application.ModuleStatus
	 * @generated
	 */
	EEnum getModuleStatus();

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
		 * The meta object literal for the '<em><b>Admin Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ADMIN_KEY = eINSTANCE.getApplication_AdminKey();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PLUGIN = eINSTANCE.getApplication_Plugin();

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
		 * The meta object literal for the '<em><b>Logs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LOGS = eINSTANCE.getApplication_Logs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PATHS = eINSTANCE.getApplication_Paths();

		/**
		 * The meta object literal for the '<em><b>Resource Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESOURCE_MAPPING = eINSTANCE.getApplication_ResourceMapping();

		/**
		 * The meta object literal for the '<em><b>Service Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SERVICE_MAPPING = eINSTANCE.getApplication_ServiceMapping();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TEXT = eINSTANCE.getApplication_Text();

		/**
		 * The meta object literal for the '<em>Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Bundle
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationBundle()
		 * @generated
		 */
		EDataType APPLICATION_BUNDLE = eINSTANCE.getApplicationBundle();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationPathsImpl <em>Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationPathsImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationPaths()
		 * @generated
		 */
		EClass APPLICATION_PATHS = eINSTANCE.getApplicationPaths();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_PATHS__DATA = eINSTANCE.getApplicationPaths_Data();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_PATHS__LOGS = eINSTANCE.getApplicationPaths_Logs();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_PATHS__WORK = eINSTANCE.getApplicationPaths_Work();

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
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_COMPONENT__STATUS = eINSTANCE.getApplicationComponent_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationLogsImpl <em>Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationLogsImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogs()
		 * @generated
		 */
		EClass APPLICATION_LOGS = eINSTANCE.getApplicationLogs();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LOGS__ENTRIES = eINSTANCE.getApplicationLogs_Entries();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LOGS__LEVEL = eINSTANCE.getApplicationLogs_Level();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ApplicationLogEntryImpl <em>Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ApplicationLogEntryImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogEntry()
		 * @generated
		 */
		EClass APPLICATION_LOG_ENTRY = eINSTANCE.getApplicationLogEntry();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LOG_ENTRY__PACKAGE = eINSTANCE.getApplicationLogEntry_Package();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LOG_ENTRY__LEVEL = eINSTANCE.getApplicationLogEntry_Level();

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
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MODULE__STATUS = eINSTANCE.getApplicationModule_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.ResetLogImpl <em>Reset Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.ResetLogImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getResetLog()
		 * @generated
		 */
		EClass RESET_LOG = eINSTANCE.getResetLog();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.impl.SetLogImpl <em>Set Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.impl.SetLogImpl
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getSetLog()
		 * @generated
		 */
		EClass SET_LOG = eINSTANCE.getSetLog();

		/**
		 * The meta object literal for the '<em><b>Log Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LOG__LOG_PATTERN = eINSTANCE.getSetLog_LogPattern();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LOG__LOG_LEVEL = eINSTANCE.getSetLog_LogLevel();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.ApplicationLogLevel <em>Log Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.ApplicationLogLevel
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getApplicationLogLevel()
		 * @generated
		 */
		EEnum APPLICATION_LOG_LEVEL = eINSTANCE.getApplicationLogLevel();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.ComponentStatus <em>Component Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.ComponentStatus
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getComponentStatus()
		 * @generated
		 */
		EEnum COMPONENT_STATUS = eINSTANCE.getComponentStatus();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.application.ModuleStatus <em>Module Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.application.ModuleStatus
		 * @see org.abchip.mimo.application.impl.ApplicationPackageImpl#getModuleStatus()
		 * @generated
		 */
		EEnum MODULE_STATUS = eINSTANCE.getModuleStatus();

	}

} //ApplicationPackage
