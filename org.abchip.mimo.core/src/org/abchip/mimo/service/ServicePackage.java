/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityPackage;
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
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUEST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceConfigImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceConfig()
	 * @generated
	 */
	int SERVICE_CONFIG = 1;

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
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceMappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceMappingImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMapping()
	 * @generated
	 */
	int SERVICE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING__RULES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceMappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceMappingRuleImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingRule()
	 * @generated
	 */
	int SERVICE_MAPPING_RULE = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_RULE__PROVIDER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_RULE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceMappingRuleByPackageImpl <em>Mapping Rule By Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceMappingRuleByPackageImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingRuleByPackage()
	 * @generated
	 */
	int SERVICE_MAPPING_RULE_BY_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_RULE_BY_PACKAGE__PROVIDER = SERVICE_MAPPING_RULE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_RULE_BY_PACKAGE__PACKAGE = SERVICE_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule By Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MAPPING_RULE_BY_PACKAGE_FEATURE_COUNT = SERVICE_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceMessageImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMessage()
	 * @generated
	 */
	int SERVICE_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE__CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceProviderImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 7;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceProviderRegistry <em>Provider Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceProviderRegistry
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceProviderRegistry()
	 * @generated
	 */
	int SERVICE_PROVIDER_REGISTRY = 8;

	/**
	 * The number of structural features of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceRequestImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceRequest()
	 * @generated
	 */
	int SERVICE_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__CONTEXT = SERVICE_MESSAGE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__TENANT = SERVICE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_FEATURE_COUNT = SERVICE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.impl.ServiceResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.impl.ServiceResponseImpl
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceResponse()
	 * @generated
	 */
	int SERVICE_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESPONSE__CONTEXT = SERVICE_MESSAGE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESPONSE_FEATURE_COUNT = SERVICE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceMappingType <em>Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceMappingType
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingType()
	 * @generated
	 */
	int SERVICE_MAPPING_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.service.ServiceStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceStatus
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 12;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.service.ServiceException
	 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceException()
	 * @generated
	 */
	int SERVICE_EXCEPTION = 13;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.abchip.mimo.service.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.service.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.service.Service#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see org.abchip.mimo.service.Service#getRequest()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Request();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.service.ServiceManager
	 * @generated
	 */
	EClass getServiceManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.abchip.mimo.service.ServiceMapping
	 * @generated
	 */
	EClass getServiceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.service.ServiceMapping#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.abchip.mimo.service.ServiceMapping#getRules()
	 * @see #getServiceMapping()
	 * @generated
	 */
	EReference getServiceMapping_Rules();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see org.abchip.mimo.service.ServiceMappingRule
	 * @generated
	 */
	EClass getServiceMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.ServiceMappingRule#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.abchip.mimo.service.ServiceMappingRule#getProvider()
	 * @see #getServiceMappingRule()
	 * @generated
	 */
	EAttribute getServiceMappingRule_Provider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceMappingRuleByPackage <em>Mapping Rule By Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule By Package</em>'.
	 * @see org.abchip.mimo.service.ServiceMappingRuleByPackage
	 * @generated
	 */
	EClass getServiceMappingRuleByPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.ServiceMappingRuleByPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.abchip.mimo.service.ServiceMappingRuleByPackage#getPackage()
	 * @see #getServiceMappingRuleByPackage()
	 * @generated
	 */
	EAttribute getServiceMappingRuleByPackage_Package();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.abchip.mimo.service.ServiceMessage
	 * @generated
	 */
	EClass getServiceMessage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.service.ServiceMessage#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.abchip.mimo.service.ServiceMessage#getContext()
	 * @see #getServiceMessage()
	 * @generated
	 */
	EReference getServiceMessage_Context();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.abchip.mimo.service.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceProviderRegistry <em>Provider Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Registry</em>'.
	 * @see org.abchip.mimo.service.ServiceProviderRegistry
	 * @generated
	 */
	EClass getServiceProviderRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.abchip.mimo.service.ServiceRequest
	 * @generated
	 */
	EClass getServiceRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.service.ServiceRequest#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.abchip.mimo.service.ServiceRequest#getTenant()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EAttribute getServiceRequest_Tenant();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.service.ServiceResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.abchip.mimo.service.ServiceResponse
	 * @generated
	 */
	EClass getServiceResponse();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.service.ServiceMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Type</em>'.
	 * @see org.abchip.mimo.service.ServiceMappingType
	 * @generated
	 */
	EEnum getServiceMappingType();

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
	 * Returns the meta object for data type '{@link org.abchip.mimo.service.ServiceException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.abchip.mimo.service.ServiceException
	 * @model instanceClass="org.abchip.mimo.service.ServiceException"
	 * @generated
	 */
	EDataType getServiceException();

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
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REQUEST = eINSTANCE.getService_Request();

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
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceManager
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceManager()
		 * @generated
		 */
		EClass SERVICE_MANAGER = eINSTANCE.getServiceManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceMappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceMappingImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMapping()
		 * @generated
		 */
		EClass SERVICE_MAPPING = eINSTANCE.getServiceMapping();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MAPPING__RULES = eINSTANCE.getServiceMapping_Rules();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceMappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceMappingRuleImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingRule()
		 * @generated
		 */
		EClass SERVICE_MAPPING_RULE = eINSTANCE.getServiceMappingRule();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MAPPING_RULE__PROVIDER = eINSTANCE.getServiceMappingRule_Provider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceMappingRuleByPackageImpl <em>Mapping Rule By Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceMappingRuleByPackageImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingRuleByPackage()
		 * @generated
		 */
		EClass SERVICE_MAPPING_RULE_BY_PACKAGE = eINSTANCE.getServiceMappingRuleByPackage();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MAPPING_RULE_BY_PACKAGE__PACKAGE = eINSTANCE.getServiceMappingRuleByPackage_Package();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceMessageImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMessage()
		 * @generated
		 */
		EClass SERVICE_MESSAGE = eINSTANCE.getServiceMessage();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MESSAGE__CONTEXT = eINSTANCE.getServiceMessage_Context();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceProviderImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceProviderRegistry <em>Provider Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceProviderRegistry
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceProviderRegistry()
		 * @generated
		 */
		EClass SERVICE_PROVIDER_REGISTRY = eINSTANCE.getServiceProviderRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceRequestImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceRequest()
		 * @generated
		 */
		EClass SERVICE_REQUEST = eINSTANCE.getServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REQUEST__TENANT = eINSTANCE.getServiceRequest_Tenant();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.impl.ServiceResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.impl.ServiceResponseImpl
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceResponse()
		 * @generated
		 */
		EClass SERVICE_RESPONSE = eINSTANCE.getServiceResponse();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceMappingType <em>Mapping Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceMappingType
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceMappingType()
		 * @generated
		 */
		EEnum SERVICE_MAPPING_TYPE = eINSTANCE.getServiceMappingType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.service.ServiceStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceStatus
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.service.ServiceException
		 * @see org.abchip.mimo.service.impl.ServicePackageImpl#getServiceException()
		 * @generated
		 */
		EDataType SERVICE_EXCEPTION = eINSTANCE.getServiceException();

	}

} //ServicePackage
