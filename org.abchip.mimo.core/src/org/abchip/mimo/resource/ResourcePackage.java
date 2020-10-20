/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.ContextPackage;

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
 * @see org.abchip.mimo.resource.ResourceFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/resource";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-resource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcePackage eINSTANCE = org.abchip.mimo.resource.impl.ResourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.LoadSeedImpl <em>Load Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.LoadSeedImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getLoadSeed()
	 * @generated
	 */
	int LOAD_SEED = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Seed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__SEED_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__UPDATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.LoadSeedsImpl <em>Load Seeds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.LoadSeedsImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getLoadSeeds()
	 * @generated
	 */
	int LOAD_SEEDS = 1;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__PATTERN = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__UPDATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Seeds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Resource Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_SET = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TENANT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceConfigImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceConfig()
	 * @generated
	 */
	int RESOURCE_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Lock Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG__LOCK_SUPPORT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG__ORDER_SUPPORT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG__PAGE_SIZE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceEvent <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceEvent
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceListener <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceListener
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceListener()
	 * @generated
	 */
	int RESOURCE_LISTENER = 5;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceManager
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceMappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceMappingImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMapping()
	 * @generated
	 */
	int RESOURCE_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING__RULES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRule()
	 * @generated
	 */
	int RESOURCE_MAPPING_RULE = 8;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE__PROVIDER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleByFrameImpl <em>Mapping Rule By Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleByFrameImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRuleByFrame()
	 * @generated
	 */
	int RESOURCE_MAPPING_RULE_BY_FRAME = 9;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_FRAME__PROVIDER = RESOURCE_MAPPING_RULE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_FRAME__FRAME = RESOURCE_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule By Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_FRAME_FEATURE_COUNT = RESOURCE_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleByPackageImpl <em>Mapping Rule By Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleByPackageImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRuleByPackage()
	 * @generated
	 */
	int RESOURCE_MAPPING_RULE_BY_PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_PACKAGE__PROVIDER = RESOURCE_MAPPING_RULE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_PACKAGE__PACKAGE = RESOURCE_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule By Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_RULE_BY_PACKAGE_FEATURE_COUNT = RESOURCE_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceNotifierImpl <em>Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceNotifierImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceNotifier()
	 * @generated
	 */
	int RESOURCE_NOTIFIER = 11;

	/**
	 * The number of structural features of the '<em>Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceProviderImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProvider()
	 * @generated
	 */
	int RESOURCE_PROVIDER = 12;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceProviderRegistry <em>Provider Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceProviderRegistry
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProviderRegistry()
	 * @generated
	 */
	int RESOURCE_PROVIDER_REGISTRY = 13;

	/**
	 * The number of structural features of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceReaderImpl <em>Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceReaderImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceReader()
	 * @generated
	 */
	int RESOURCE_READER = 14;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__NOTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceSerializerImpl <em>Serializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceSerializerImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceSerializer()
	 * @generated
	 */
	int RESOURCE_SERIALIZER = 15;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER__FRAME = 0;

	/**
	 * The number of structural features of the '<em>Serializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceSetImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceSet()
	 * @generated
	 */
	int RESOURCE_SET = 16;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceWriter <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceWriter
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceWriter()
	 * @generated
	 */
	int RESOURCE_WRITER = 17;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__NOTIFIER = RESOURCE_READER__NOTIFIER;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER_FEATURE_COUNT = RESOURCE_READER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceEventType
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 18;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceMappingType <em>Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceMappingType
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingType()
	 * @generated
	 */
	int RESOURCE_MAPPING_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.SerializationType <em>Serialization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.SerializationType
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getSerializationType()
	 * @generated
	 */
	int SERIALIZATION_TYPE = 20;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceException
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceException()
	 * @generated
	 */
	int RESOURCE_EXCEPTION = 21;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.LoadSeed <em>Load Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Seed</em>'.
	 * @see org.abchip.mimo.resource.LoadSeed
	 * @generated
	 */
	EClass getLoadSeed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.LoadSeed#getSeedId <em>Seed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Id</em>'.
	 * @see org.abchip.mimo.resource.LoadSeed#getSeedId()
	 * @see #getLoadSeed()
	 * @generated
	 */
	EAttribute getLoadSeed_SeedId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.LoadSeed#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.abchip.mimo.resource.LoadSeed#isUpdate()
	 * @see #getLoadSeed()
	 * @generated
	 */
	EAttribute getLoadSeed_Update();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.LoadSeeds <em>Load Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Seeds</em>'.
	 * @see org.abchip.mimo.resource.LoadSeeds
	 * @generated
	 */
	EClass getLoadSeeds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.LoadSeeds#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.abchip.mimo.resource.LoadSeeds#getPattern()
	 * @see #getLoadSeeds()
	 * @generated
	 */
	EAttribute getLoadSeeds_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.LoadSeeds#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.abchip.mimo.resource.LoadSeeds#isUpdate()
	 * @see #getLoadSeeds()
	 * @generated
	 */
	EAttribute getLoadSeeds_Update();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.abchip.mimo.resource.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.resource.Resource#getResourceConfig <em>Resource Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Config</em>'.
	 * @see org.abchip.mimo.resource.Resource#getResourceConfig()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceConfig();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.resource.Resource#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Set</em>'.
	 * @see org.abchip.mimo.resource.Resource#getResourceSet()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceSet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.Resource#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.abchip.mimo.resource.Resource#getTenant()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Tenant();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.abchip.mimo.resource.ResourceConfig
	 * @generated
	 */
	EClass getResourceConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceConfig#isLockSupport <em>Lock Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Support</em>'.
	 * @see org.abchip.mimo.resource.ResourceConfig#isLockSupport()
	 * @see #getResourceConfig()
	 * @generated
	 */
	EAttribute getResourceConfig_LockSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceConfig#isOrderSupport <em>Order Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Support</em>'.
	 * @see org.abchip.mimo.resource.ResourceConfig#isOrderSupport()
	 * @see #getResourceConfig()
	 * @generated
	 */
	EAttribute getResourceConfig_OrderSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceConfig#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see org.abchip.mimo.resource.ResourceConfig#getPageSize()
	 * @see #getResourceConfig()
	 * @generated
	 */
	EAttribute getResourceConfig_PageSize();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.abchip.mimo.resource.ResourceEvent
	 * @generated
	 */
	EClass getResourceEvent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see org.abchip.mimo.resource.ResourceListener
	 * @generated
	 */
	EClass getResourceListener();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.resource.ResourceManager
	 * @generated
	 */
	EClass getResourceManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.abchip.mimo.resource.ResourceMapping
	 * @generated
	 */
	EClass getResourceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.resource.ResourceMapping#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.abchip.mimo.resource.ResourceMapping#getRules()
	 * @see #getResourceMapping()
	 * @generated
	 */
	EReference getResourceMapping_Rules();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRule
	 * @generated
	 */
	EClass getResourceMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceMappingRule#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRule#getProvider()
	 * @see #getResourceMappingRule()
	 * @generated
	 */
	EAttribute getResourceMappingRule_Provider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceMappingRuleByFrame <em>Mapping Rule By Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule By Frame</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRuleByFrame
	 * @generated
	 */
	EClass getResourceMappingRuleByFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceMappingRuleByFrame#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRuleByFrame#getFrame()
	 * @see #getResourceMappingRuleByFrame()
	 * @generated
	 */
	EAttribute getResourceMappingRuleByFrame_Frame();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceMappingRuleByPackage <em>Mapping Rule By Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule By Package</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRuleByPackage
	 * @generated
	 */
	EClass getResourceMappingRuleByPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceMappingRuleByPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingRuleByPackage#getPackage()
	 * @see #getResourceMappingRuleByPackage()
	 * @generated
	 */
	EAttribute getResourceMappingRuleByPackage_Package();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifier</em>'.
	 * @see org.abchip.mimo.resource.ResourceNotifier
	 * @generated
	 */
	EClass getResourceNotifier();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.abchip.mimo.resource.ResourceProvider
	 * @generated
	 */
	EClass getResourceProvider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceProviderRegistry <em>Provider Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Registry</em>'.
	 * @see org.abchip.mimo.resource.ResourceProviderRegistry
	 * @generated
	 */
	EClass getResourceProviderRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reader</em>'.
	 * @see org.abchip.mimo.resource.ResourceReader
	 * @generated
	 */
	EClass getResourceReader();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.resource.ResourceReader#getNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notifier</em>'.
	 * @see org.abchip.mimo.resource.ResourceReader#getNotifier()
	 * @see #getResourceReader()
	 * @generated
	 */
	EReference getResourceReader_Notifier();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceSerializer <em>Serializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializer</em>'.
	 * @see org.abchip.mimo.resource.ResourceSerializer
	 * @generated
	 */
	EClass getResourceSerializer();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.resource.ResourceSerializer#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frame</em>'.
	 * @see org.abchip.mimo.resource.ResourceSerializer#getFrame()
	 * @see #getResourceSerializer()
	 * @generated
	 */
	EReference getResourceSerializer_Frame();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.abchip.mimo.resource.ResourceSet
	 * @generated
	 */
	EClass getResourceSet();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.abchip.mimo.resource.ResourceWriter
	 * @generated
	 */
	EClass getResourceWriter();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see org.abchip.mimo.resource.ResourceEventType
	 * @generated
	 */
	EEnum getResourceEventType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.resource.ResourceMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Type</em>'.
	 * @see org.abchip.mimo.resource.ResourceMappingType
	 * @generated
	 */
	EEnum getResourceMappingType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.resource.SerializationType <em>Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Serialization Type</em>'.
	 * @see org.abchip.mimo.resource.SerializationType
	 * @generated
	 */
	EEnum getSerializationType();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.resource.ResourceException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.abchip.mimo.resource.ResourceException
	 * @model instanceClass="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EDataType getResourceException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceFactory getResourceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.LoadSeedImpl <em>Load Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.LoadSeedImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getLoadSeed()
		 * @generated
		 */
		EClass LOAD_SEED = eINSTANCE.getLoadSeed();

		/**
		 * The meta object literal for the '<em><b>Seed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEED__SEED_ID = eINSTANCE.getLoadSeed_SeedId();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEED__UPDATE = eINSTANCE.getLoadSeed_Update();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.LoadSeedsImpl <em>Load Seeds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.LoadSeedsImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getLoadSeeds()
		 * @generated
		 */
		EClass LOAD_SEEDS = eINSTANCE.getLoadSeeds();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEEDS__PATTERN = eINSTANCE.getLoadSeeds_Pattern();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEEDS__UPDATE = eINSTANCE.getLoadSeeds_Update();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Resource Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_CONFIG = eINSTANCE.getResource_ResourceConfig();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_SET = eINSTANCE.getResource_ResourceSet();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TENANT = eINSTANCE.getResource_Tenant();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceConfigImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceConfig()
		 * @generated
		 */
		EClass RESOURCE_CONFIG = eINSTANCE.getResourceConfig();

		/**
		 * The meta object literal for the '<em><b>Lock Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONFIG__LOCK_SUPPORT = eINSTANCE.getResourceConfig_LockSupport();

		/**
		 * The meta object literal for the '<em><b>Order Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONFIG__ORDER_SUPPORT = eINSTANCE.getResourceConfig_OrderSupport();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONFIG__PAGE_SIZE = eINSTANCE.getResourceConfig_PageSize();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceEvent <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceEvent
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEvent()
		 * @generated
		 */
		EClass RESOURCE_EVENT = eINSTANCE.getResourceEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceListener <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceListener
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceListener()
		 * @generated
		 */
		EClass RESOURCE_LISTENER = eINSTANCE.getResourceListener();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceManager
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceManager()
		 * @generated
		 */
		EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceMappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceMappingImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMapping()
		 * @generated
		 */
		EClass RESOURCE_MAPPING = eINSTANCE.getResourceMapping();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MAPPING__RULES = eINSTANCE.getResourceMapping_Rules();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRule()
		 * @generated
		 */
		EClass RESOURCE_MAPPING_RULE = eINSTANCE.getResourceMappingRule();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MAPPING_RULE__PROVIDER = eINSTANCE.getResourceMappingRule_Provider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleByFrameImpl <em>Mapping Rule By Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleByFrameImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRuleByFrame()
		 * @generated
		 */
		EClass RESOURCE_MAPPING_RULE_BY_FRAME = eINSTANCE.getResourceMappingRuleByFrame();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MAPPING_RULE_BY_FRAME__FRAME = eINSTANCE.getResourceMappingRuleByFrame_Frame();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceMappingRuleByPackageImpl <em>Mapping Rule By Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceMappingRuleByPackageImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingRuleByPackage()
		 * @generated
		 */
		EClass RESOURCE_MAPPING_RULE_BY_PACKAGE = eINSTANCE.getResourceMappingRuleByPackage();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MAPPING_RULE_BY_PACKAGE__PACKAGE = eINSTANCE.getResourceMappingRuleByPackage_Package();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceNotifierImpl <em>Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceNotifierImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceNotifier()
		 * @generated
		 */
		EClass RESOURCE_NOTIFIER = eINSTANCE.getResourceNotifier();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceProviderImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProvider()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER = eINSTANCE.getResourceProvider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceProviderRegistry <em>Provider Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceProviderRegistry
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProviderRegistry()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER_REGISTRY = eINSTANCE.getResourceProviderRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceReaderImpl <em>Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceReaderImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceReader()
		 * @generated
		 */
		EClass RESOURCE_READER = eINSTANCE.getResourceReader();

		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_READER__NOTIFIER = eINSTANCE.getResourceReader_Notifier();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceSerializerImpl <em>Serializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceSerializerImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceSerializer()
		 * @generated
		 */
		EClass RESOURCE_SERIALIZER = eINSTANCE.getResourceSerializer();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERIALIZER__FRAME = eINSTANCE.getResourceSerializer_Frame();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceSetImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceSet()
		 * @generated
		 */
		EClass RESOURCE_SET = eINSTANCE.getResourceSet();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceWriter <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceWriter
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceWriter()
		 * @generated
		 */
		EClass RESOURCE_WRITER = eINSTANCE.getResourceWriter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceEventType
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEventType()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_TYPE = eINSTANCE.getResourceEventType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceMappingType <em>Mapping Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceMappingType
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceMappingType()
		 * @generated
		 */
		EEnum RESOURCE_MAPPING_TYPE = eINSTANCE.getResourceMappingType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.SerializationType <em>Serialization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.SerializationType
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getSerializationType()
		 * @generated
		 */
		EEnum SERIALIZATION_TYPE = eINSTANCE.getSerializationType();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceException
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceException()
		 * @generated
		 */
		EDataType RESOURCE_EXCEPTION = eINSTANCE.getResourceException();

	}

} //ResourcePackage
