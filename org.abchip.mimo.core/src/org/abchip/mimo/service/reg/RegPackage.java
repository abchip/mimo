/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.reg;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.service.reg.RegFactory
 * @model kind="package"
 * @generated
 */
public interface RegPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/service/reg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-service-reg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegPackage eINSTANCE = org.abchip.mimo.service.reg.impl.RegPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegImpl <em>Service Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceReg()
	 * @generated
	 */
	int SERVICE_REG = 3;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REG__CLASS_NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REG__STATUS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceCommandProviderRegImpl <em>Service Command Provider Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceCommandProviderRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceCommandProviderReg()
	 * @generated
	 */
	int SERVICE_COMMAND_PROVIDER_REG = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Command Provider Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceHookRegImpl <em>Service Hook Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceHookRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceHookReg()
	 * @generated
	 */
	int SERVICE_HOOK_REG = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The number of structural features of the '<em>Service Hook Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl <em>Service Executor Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceExecutorReg()
	 * @generated
	 */
	int SERVICE_EXECUTOR_REG = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_REG__REMOTE_EXPORT = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Executor Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceFactoryRegImpl <em>Service Factory Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceFactoryRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceFactoryReg()
	 * @generated
	 */
	int SERVICE_FACTORY_REG = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACTORY_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACTORY_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACTORY_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Factory Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACTORY_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegistryRegImpl <em>Service Registry Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceRegistryRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceRegistryReg()
	 * @generated
	 */
	int SERVICE_REGISTRY_REG = 5;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_REG__ENTRIES = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Registry Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegistryEntryRegImpl <em>Service Registry Entry Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceRegistryEntryRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceRegistryEntryReg()
	 * @generated
	 */
	int SERVICE_REGISTRY_ENTRY_REG = 6;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__NAME = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__VENDOR = SERVICE_REG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG__VERSION = SERVICE_REG_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Registry Entry Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceServletRegImpl <em>Service Servlet Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceServletRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceServletReg()
	 * @generated
	 */
	int SERVICE_SERVLET_REG = 7;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVLET_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVLET_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVLET_REG__ALIAS = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVLET_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Servlet Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVLET_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.reg.impl.ServiceTesterRegImpl <em>Service Tester Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.reg.impl.ServiceTesterRegImpl
	 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceTesterReg()
	 * @generated
	 */
	int SERVICE_TESTER_REG = 8;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_REG__CLASS_NAME = SERVICE_REG__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_REG__STATUS = SERVICE_REG__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_REG__INTERFACE_NAME = SERVICE_REG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Tester Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_REG_FEATURE_COUNT = SERVICE_REG_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceCommandProviderReg <em>Service Command Provider Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Command Provider Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceCommandProviderReg
	 * @generated
	 */
	EClass getServiceCommandProviderReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceCommandProviderReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceCommandProviderReg#getInterfaceName()
	 * @see #getServiceCommandProviderReg()
	 * @generated
	 */
	EAttribute getServiceCommandProviderReg_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceHookReg <em>Service Hook Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Hook Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceHookReg
	 * @generated
	 */
	EClass getServiceHookReg();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceExecutorReg <em>Service Executor Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Executor Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceExecutorReg
	 * @generated
	 */
	EClass getServiceExecutorReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceExecutorReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceExecutorReg#getInterfaceName()
	 * @see #getServiceExecutorReg()
	 * @generated
	 */
	EAttribute getServiceExecutorReg_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceExecutorReg#isRemoteExport <em>Remote Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Export</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceExecutorReg#isRemoteExport()
	 * @see #getServiceExecutorReg()
	 * @generated
	 */
	EAttribute getServiceExecutorReg_RemoteExport();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceReg <em>Service Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceReg
	 * @generated
	 */
	EClass getServiceReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceReg#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceReg#getClassName()
	 * @see #getServiceReg()
	 * @generated
	 */
	EAttribute getServiceReg_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceReg#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceReg#getStatus()
	 * @see #getServiceReg()
	 * @generated
	 */
	EAttribute getServiceReg_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceFactoryReg <em>Service Factory Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Factory Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceFactoryReg
	 * @generated
	 */
	EClass getServiceFactoryReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceFactoryReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceFactoryReg#getInterfaceName()
	 * @see #getServiceFactoryReg()
	 * @generated
	 */
	EAttribute getServiceFactoryReg_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceRegistryReg <em>Service Registry Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryReg
	 * @generated
	 */
	EClass getServiceRegistryReg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.service.reg.ServiceRegistryReg#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryReg#getEntries()
	 * @see #getServiceRegistryReg()
	 * @generated
	 */
	EReference getServiceRegistryReg_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceRegistryReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryReg#getInterfaceName()
	 * @see #getServiceRegistryReg()
	 * @generated
	 */
	EAttribute getServiceRegistryReg_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg <em>Service Registry Entry Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry Entry Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryEntryReg
	 * @generated
	 */
	EClass getServiceRegistryEntryReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getInterfaceName()
	 * @see #getServiceRegistryEntryReg()
	 * @generated
	 */
	EAttribute getServiceRegistryEntryReg_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getName()
	 * @see #getServiceRegistryEntryReg()
	 * @generated
	 */
	EAttribute getServiceRegistryEntryReg_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getVendor()
	 * @see #getServiceRegistryEntryReg()
	 * @generated
	 */
	EAttribute getServiceRegistryEntryReg_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceRegistryEntryReg#getVersion()
	 * @see #getServiceRegistryEntryReg()
	 * @generated
	 */
	EAttribute getServiceRegistryEntryReg_Version();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceServletReg <em>Service Servlet Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Servlet Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceServletReg
	 * @generated
	 */
	EClass getServiceServletReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceServletReg#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceServletReg#getAlias()
	 * @see #getServiceServletReg()
	 * @generated
	 */
	EAttribute getServiceServletReg_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceServletReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceServletReg#getInterfaceName()
	 * @see #getServiceServletReg()
	 * @generated
	 */
	EAttribute getServiceServletReg_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.reg.ServiceTesterReg <em>Service Tester Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Tester Reg</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceTesterReg
	 * @generated
	 */
	EClass getServiceTesterReg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.reg.ServiceTesterReg#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.abchip.mimo.service.reg.ServiceTesterReg#getInterfaceName()
	 * @see #getServiceTesterReg()
	 * @generated
	 */
	EAttribute getServiceTesterReg_InterfaceName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegFactory getRegFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceCommandProviderRegImpl <em>Service Command Provider Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceCommandProviderRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceCommandProviderReg()
		 * @generated
		 */
		EClass SERVICE_COMMAND_PROVIDER_REG = eINSTANCE.getServiceCommandProviderReg();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMMAND_PROVIDER_REG__INTERFACE_NAME = eINSTANCE.getServiceCommandProviderReg_InterfaceName();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceHookRegImpl <em>Service Hook Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceHookRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceHookReg()
		 * @generated
		 */
		EClass SERVICE_HOOK_REG = eINSTANCE.getServiceHookReg();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl <em>Service Executor Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceExecutorReg()
		 * @generated
		 */
		EClass SERVICE_EXECUTOR_REG = eINSTANCE.getServiceExecutorReg();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR_REG__INTERFACE_NAME = eINSTANCE.getServiceExecutorReg_InterfaceName();
		/**
		 * The meta object literal for the '<em><b>Remote Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR_REG__REMOTE_EXPORT = eINSTANCE.getServiceExecutorReg_RemoteExport();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegImpl <em>Service Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceReg()
		 * @generated
		 */
		EClass SERVICE_REG = eINSTANCE.getServiceReg();
		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REG__CLASS_NAME = eINSTANCE.getServiceReg_ClassName();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REG__STATUS = eINSTANCE.getServiceReg_Status();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceFactoryRegImpl <em>Service Factory Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceFactoryRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceFactoryReg()
		 * @generated
		 */
		EClass SERVICE_FACTORY_REG = eINSTANCE.getServiceFactoryReg();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FACTORY_REG__INTERFACE_NAME = eINSTANCE.getServiceFactoryReg_InterfaceName();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegistryRegImpl <em>Service Registry Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceRegistryRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceRegistryReg()
		 * @generated
		 */
		EClass SERVICE_REGISTRY_REG = eINSTANCE.getServiceRegistryReg();
		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REGISTRY_REG__ENTRIES = eINSTANCE.getServiceRegistryReg_Entries();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_REG__INTERFACE_NAME = eINSTANCE.getServiceRegistryReg_InterfaceName();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceRegistryEntryRegImpl <em>Service Registry Entry Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceRegistryEntryRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceRegistryEntryReg()
		 * @generated
		 */
		EClass SERVICE_REGISTRY_ENTRY_REG = eINSTANCE.getServiceRegistryEntryReg();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY_REG__INTERFACE_NAME = eINSTANCE.getServiceRegistryEntryReg_InterfaceName();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY_REG__NAME = eINSTANCE.getServiceRegistryEntryReg_Name();
		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY_REG__VENDOR = eINSTANCE.getServiceRegistryEntryReg_Vendor();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY_REG__VERSION = eINSTANCE.getServiceRegistryEntryReg_Version();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceServletRegImpl <em>Service Servlet Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceServletRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceServletReg()
		 * @generated
		 */
		EClass SERVICE_SERVLET_REG = eINSTANCE.getServiceServletReg();
		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SERVLET_REG__ALIAS = eINSTANCE.getServiceServletReg_Alias();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SERVLET_REG__INTERFACE_NAME = eINSTANCE.getServiceServletReg_InterfaceName();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.reg.impl.ServiceTesterRegImpl <em>Service Tester Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.reg.impl.ServiceTesterRegImpl
		 * @see org.abchip.mimo.service.reg.impl.RegPackageImpl#getServiceTesterReg()
		 * @generated
		 */
		EClass SERVICE_TESTER_REG = eINSTANCE.getServiceTesterReg();
		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TESTER_REG__INTERFACE_NAME = eINSTANCE.getServiceTesterReg_InterfaceName();

	}

} //RegPackage
