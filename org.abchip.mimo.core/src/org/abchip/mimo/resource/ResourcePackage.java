/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Resource Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___CREATE__ENTITYNAMEABLE_BOOLEAN = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___DELETE__ENTITYNAMEABLE = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_FRAME = EntityPackage.ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Tenant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_TENANT = EntityPackage.ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Next Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___NEXT_SEQUENCE = EntityPackage.ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___READ__STRING_STRING_BOOLEAN = EntityPackage.ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___READ__STRING_STRING_STRING_INT_BOOLEAN = EntityPackage.ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___UPDATE__ENTITYNAMEABLE = EntityPackage.ENTITY_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceConfigImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceConfig()
	 * @generated
	 */
	int RESOURCE_CONFIG = 1;

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
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIG_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceEvent <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceEvent
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Context Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT___GET_CONTEXT_PROVIDER = 0;

	/**
	 * The operation id for the '<em>Get Event Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT___GET_EVENT_TYPE = 1;

	/**
	 * The operation id for the '<em>Get New Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT___GET_NEW_NAME = 2;

	/**
	 * The operation id for the '<em>Get Old Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT___GET_OLD_NAME = 3;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT___GET_SOURCE = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceListener <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceListener
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceListener()
	 * @generated
	 */
	int RESOURCE_LISTENER = 3;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Handle Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER___HANDLE_EVENT__RESOURCEEVENT = 0;

	/**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceManager
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Resource Serializer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__CLASS_SERIALIZATIONTYPE = 0;

	/**
	 * The operation id for the '<em>Create Resource Serializer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__FRAME_SERIALIZATIONTYPE = 1;

	/**
	 * The operation id for the '<em>Create Resource Serializer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__STRING_SERIALIZATIONTYPE = 2;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS = 3;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME = 4;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING = 5;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS_STRING = 6;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME_STRING = 7;

	/**
	 * The operation id for the '<em>Get Resource Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS = 9;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME = 10;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING = 11;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS_STRING = 12;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME_STRING = 13;

	/**
	 * The operation id for the '<em>Get Resource Writer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING_STRING = 14;

	/**
	 * The operation id for the '<em>Get Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_PROVIDER__CLASS = 15;

	/**
	 * The operation id for the '<em>Get Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_PROVIDER__FRAME = 16;

	/**
	 * The operation id for the '<em>Get Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_PROVIDER__STRING = 17;

	/**
	 * The operation id for the '<em>Register Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_LISTENER__CLASS_RESOURCELISTENER = 18;

	/**
	 * The operation id for the '<em>Register Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_LISTENER__FRAME_RESOURCELISTENER = 19;

	/**
	 * The operation id for the '<em>Register Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_LISTENER__STRING_RESOURCELISTENER = 20;

	/**
	 * The operation id for the '<em>Register Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_PROVIDER__CLASS_RESOURCEPROVIDER = 21;

	/**
	 * The operation id for the '<em>Register Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_PROVIDER__FRAME_RESOURCEPROVIDER = 22;

	/**
	 * The operation id for the '<em>Register Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___REGISTER_PROVIDER__STRING_RESOURCEPROVIDER = 23;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_OPERATION_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceNotifierImpl <em>Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceNotifierImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceNotifier()
	 * @generated
	 */
	int RESOURCE_NOTIFIER = 5;

	/**
	 * The number of structural features of the '<em>Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Fire Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER___FIRE_EVENT__RESOURCEEVENT = 0;

	/**
	 * The operation id for the '<em>Get Listeners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER___GET_LISTENERS = 1;

	/**
	 * The operation id for the '<em>Register Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER___REGISTER_LISTENER__RESOURCELISTENER = 2;

	/**
	 * The number of operations of the '<em>Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceProviderImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProvider()
	 * @generated
	 */
	int RESOURCE_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___CHECK_LOGIN__AUTHENTICATIONUSERTOKEN_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS = 1;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME = 2;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING = 3;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS_STRING = 4;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME_STRING = 5;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Is Active</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___IS_ACTIVE__CONTEXTPROVIDER = 7;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONANONYMOUS = 8;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERPASSWORD = 9;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERTOKEN = 10;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER___LOGOUT__CONTEXTPROVIDER = 11;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceProviderRegistry <em>Provider Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceProviderRegistry
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceProviderRegistry()
	 * @generated
	 */
	int RESOURCE_PROVIDER_REGISTRY = 7;

	/**
	 * The number of structural features of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY___LOOKUP__STRING = ContextPackage.REGISTRY___LOOKUP__STRING;

	/**
	 * The operation id for the '<em>List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY___LIST = ContextPackage.REGISTRY___LIST;

	/**
	 * The operation id for the '<em>Lookup By Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY___LOOKUP_BY_PORT__INT = ContextPackage.REGISTRY___LOOKUP_BY_PORT__INT;

	/**
	 * The operation id for the '<em>Lookup By Vendor Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY___LOOKUP_BY_VENDOR_VERSION__STRING_STRING = ContextPackage.REGISTRY___LOOKUP_BY_VENDOR_VERSION__STRING_STRING;

	/**
	 * The number of operations of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_REGISTRY_OPERATION_COUNT = ContextPackage.REGISTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceReaderImpl <em>Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceReaderImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceReader()
	 * @generated
	 */
	int RESOURCE_READER = 8;

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
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND = 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND__STRING = 1;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND__STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND__STRING_STRING_STRING_INT = 4;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIND__STRING_STRING_STRING_INT_BOOLEAN = 5;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIRST = 6;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___FIRST__BOOLEAN = 7;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___GET_FRAME = 8;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___LOOKUP__STRING = 9;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___LOOKUP__STRING_BOOLEAN = 10;

	/**
	 * The operation id for the '<em>Get Context Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER___GET_CONTEXT_PROVIDER = 11;

	/**
	 * The number of operations of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceSerializerImpl <em>Serializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceSerializerImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceSerializer()
	 * @generated
	 */
	int RESOURCE_SERIALIZER = 9;

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
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___ADD__ENTITY = 0;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___ADD_ALL__LIST = 1;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___CLEAR = 2;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___LOAD__INPUTSTREAM_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___LOAD__STRING_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___SAVE__OUTPUTSTREAM = 5;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___GET = 6;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___GET_ALL = 7;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER___IS_EMPTY = 8;

	/**
	 * The number of operations of the '<em>Serializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceWriter <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceWriter
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceWriter()
	 * @generated
	 */
	int RESOURCE_WRITER = 10;

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
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND = RESOURCE_READER___FIND;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND__STRING = RESOURCE_READER___FIND__STRING;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND__STRING_STRING = RESOURCE_READER___FIND__STRING_STRING;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND__STRING_STRING_STRING = RESOURCE_READER___FIND__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND__STRING_STRING_STRING_INT = RESOURCE_READER___FIND__STRING_STRING_STRING_INT;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIND__STRING_STRING_STRING_INT_BOOLEAN = RESOURCE_READER___FIND__STRING_STRING_STRING_INT_BOOLEAN;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIRST = RESOURCE_READER___FIRST;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___FIRST__BOOLEAN = RESOURCE_READER___FIRST__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___GET_FRAME = RESOURCE_READER___GET_FRAME;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___LOOKUP__STRING = RESOURCE_READER___LOOKUP__STRING;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___LOOKUP__STRING_BOOLEAN = RESOURCE_READER___LOOKUP__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Context Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___GET_CONTEXT_PROVIDER = RESOURCE_READER___GET_CONTEXT_PROVIDER;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___DELETE__ENTITYNAMEABLE = RESOURCE_READER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___CREATE__ENTITYNAMEABLE = RESOURCE_READER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___CREATE__ENTITYNAMEABLE_BOOLEAN = RESOURCE_READER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Next Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___NEXT_SEQUENCE = RESOURCE_READER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER___UPDATE__ENTITYNAMEABLE = RESOURCE_READER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER_OPERATION_COUNT = RESOURCE_READER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceEventType
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 11;


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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#create(org.abchip.mimo.entity.EntityNameable, boolean) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#create(org.abchip.mimo.entity.EntityNameable, boolean)
	 * @generated
	 */
	EOperation getResource__Create__EntityNameable_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#delete(org.abchip.mimo.entity.EntityNameable) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#delete(org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getResource__Delete__EntityNameable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#getFrame() <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#getFrame()
	 * @generated
	 */
	EOperation getResource__GetFrame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#getTenant() <em>Get Tenant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tenant</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#getTenant()
	 * @generated
	 */
	EOperation getResource__GetTenant();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#nextSequence() <em>Next Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Next Sequence</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#nextSequence()
	 * @generated
	 */
	EOperation getResource__NextSequence();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#read(java.lang.String, java.lang.String, boolean) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#read(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getResource__Read__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#read(java.lang.String, java.lang.String, java.lang.String, int, boolean) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#read(java.lang.String, java.lang.String, java.lang.String, int, boolean)
	 * @generated
	 */
	EOperation getResource__Read__String_String_String_int_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.Resource#update(org.abchip.mimo.entity.EntityNameable) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.abchip.mimo.resource.Resource#update(org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getResource__Update__EntityNameable();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceEvent#getContextProvider() <em>Get Context Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceEvent#getContextProvider()
	 * @generated
	 */
	EOperation getResourceEvent__GetContextProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceEvent#getEventType() <em>Get Event Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event Type</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceEvent#getEventType()
	 * @generated
	 */
	EOperation getResourceEvent__GetEventType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceEvent#getNewName() <em>Get New Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Name</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceEvent#getNewName()
	 * @generated
	 */
	EOperation getResourceEvent__GetNewName();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceEvent#getOldName() <em>Get Old Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Old Name</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceEvent#getOldName()
	 * @generated
	 */
	EOperation getResourceEvent__GetOldName();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceEvent#getSource() <em>Get Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceEvent#getSource()
	 * @generated
	 */
	EOperation getResourceEvent__GetSource();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceListener#handleEvent(org.abchip.mimo.resource.ResourceEvent) <em>Handle Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Event</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceListener#handleEvent(org.abchip.mimo.resource.ResourceEvent)
	 * @generated
	 */
	EOperation getResourceListener__HandleEvent__ResourceEvent();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#createResourceSerializer(java.lang.Class, org.abchip.mimo.entity.SerializationType) <em>Create Resource Serializer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resource Serializer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#createResourceSerializer(java.lang.Class, org.abchip.mimo.entity.SerializationType)
	 * @generated
	 */
	EOperation getResourceManager__CreateResourceSerializer__Class_SerializationType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#createResourceSerializer(org.abchip.mimo.entity.Frame, org.abchip.mimo.entity.SerializationType) <em>Create Resource Serializer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resource Serializer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#createResourceSerializer(org.abchip.mimo.entity.Frame, org.abchip.mimo.entity.SerializationType)
	 * @generated
	 */
	EOperation getResourceManager__CreateResourceSerializer__Frame_SerializationType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#createResourceSerializer(java.lang.String, org.abchip.mimo.entity.SerializationType) <em>Create Resource Serializer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resource Serializer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#createResourceSerializer(java.lang.String, org.abchip.mimo.entity.SerializationType)
	 * @generated
	 */
	EOperation getResourceManager__CreateResourceSerializer__String_SerializationType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.Class) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.Class)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_Frame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.String) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_Frame_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String) <em>Get Resource Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Reader</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceReader(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceReader__ContextProvider_String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.Class) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.Class)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_Frame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.String) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_Frame_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String) <em>Get Resource Writer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Writer</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getResourceWriter(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetResourceWriter__ContextProvider_String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getProvider(java.lang.Class) <em>Get Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getProvider(java.lang.Class)
	 * @generated
	 */
	EOperation getResourceManager__GetProvider__Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getProvider(org.abchip.mimo.entity.Frame) <em>Get Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getProvider(org.abchip.mimo.entity.Frame)
	 * @generated
	 */
	EOperation getResourceManager__GetProvider__Frame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#getProvider(java.lang.String) <em>Get Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#getProvider(java.lang.String)
	 * @generated
	 */
	EOperation getResourceManager__GetProvider__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerListener(java.lang.Class, org.abchip.mimo.resource.ResourceListener) <em>Register Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Listener</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerListener(java.lang.Class, org.abchip.mimo.resource.ResourceListener)
	 * @generated
	 */
	EOperation getResourceManager__RegisterListener__Class_ResourceListener();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerListener(org.abchip.mimo.entity.Frame, org.abchip.mimo.resource.ResourceListener) <em>Register Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Listener</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerListener(org.abchip.mimo.entity.Frame, org.abchip.mimo.resource.ResourceListener)
	 * @generated
	 */
	EOperation getResourceManager__RegisterListener__Frame_ResourceListener();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerListener(java.lang.String, org.abchip.mimo.resource.ResourceListener) <em>Register Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Listener</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerListener(java.lang.String, org.abchip.mimo.resource.ResourceListener)
	 * @generated
	 */
	EOperation getResourceManager__RegisterListener__String_ResourceListener();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerProvider(java.lang.Class, org.abchip.mimo.resource.ResourceProvider) <em>Register Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerProvider(java.lang.Class, org.abchip.mimo.resource.ResourceProvider)
	 * @generated
	 */
	EOperation getResourceManager__RegisterProvider__Class_ResourceProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerProvider(org.abchip.mimo.entity.Frame, org.abchip.mimo.resource.ResourceProvider) <em>Register Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerProvider(org.abchip.mimo.entity.Frame, org.abchip.mimo.resource.ResourceProvider)
	 * @generated
	 */
	EOperation getResourceManager__RegisterProvider__Frame_ResourceProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceManager#registerProvider(java.lang.String, org.abchip.mimo.resource.ResourceProvider) <em>Register Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceManager#registerProvider(java.lang.String, org.abchip.mimo.resource.ResourceProvider)
	 * @generated
	 */
	EOperation getResourceManager__RegisterProvider__String_ResourceProvider();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceNotifier#fireEvent(org.abchip.mimo.resource.ResourceEvent) <em>Fire Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire Event</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceNotifier#fireEvent(org.abchip.mimo.resource.ResourceEvent)
	 * @generated
	 */
	EOperation getResourceNotifier__FireEvent__ResourceEvent();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceNotifier#getListeners() <em>Get Listeners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Listeners</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceNotifier#getListeners()
	 * @generated
	 */
	EOperation getResourceNotifier__GetListeners();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceNotifier#registerListener(org.abchip.mimo.resource.ResourceListener) <em>Register Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Listener</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceNotifier#registerListener(org.abchip.mimo.resource.ResourceListener)
	 * @generated
	 */
	EOperation getResourceNotifier__RegisterListener__ResourceListener();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#checkLogin(org.abchip.mimo.context.AuthenticationUserToken, boolean) <em>Check Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Login</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#checkLogin(org.abchip.mimo.context.AuthenticationUserToken, boolean)
	 * @generated
	 */
	EOperation getResourceProvider__CheckLogin__AuthenticationUserToken_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.Class) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.Class)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_Frame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.String)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.Frame, java.lang.String)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_Frame_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#getResource(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResourceProvider__GetResource__ContextProvider_String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#isActive(org.abchip.mimo.context.ContextProvider) <em>Is Active</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Active</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#isActive(org.abchip.mimo.context.ContextProvider)
	 * @generated
	 */
	EOperation getResourceProvider__IsActive__ContextProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationAnonymous) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationAnonymous)
	 * @generated
	 */
	EOperation getResourceProvider__Login__String_AuthenticationAnonymous();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationUserPassword) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationUserPassword)
	 * @generated
	 */
	EOperation getResourceProvider__Login__String_AuthenticationUserPassword();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationUserToken) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#login(java.lang.String, org.abchip.mimo.context.AuthenticationUserToken)
	 * @generated
	 */
	EOperation getResourceProvider__Login__String_AuthenticationUserToken();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceProvider#logout(org.abchip.mimo.context.ContextProvider) <em>Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logout</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceProvider#logout(org.abchip.mimo.context.ContextProvider)
	 * @generated
	 */
	EOperation getResourceProvider__Logout__ContextProvider();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find() <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find()
	 * @generated
	 */
	EOperation getResourceReader__Find();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find(java.lang.String) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find(java.lang.String)
	 * @generated
	 */
	EOperation getResourceReader__Find__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResourceReader__Find__String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResourceReader__Find__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String, int) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getResourceReader__Find__String_String_String_int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String, int, boolean) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#find(java.lang.String, java.lang.String, java.lang.String, int, boolean)
	 * @generated
	 */
	EOperation getResourceReader__Find__String_String_String_int_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#first() <em>First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>First</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#first()
	 * @generated
	 */
	EOperation getResourceReader__First();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#first(boolean) <em>First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>First</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#first(boolean)
	 * @generated
	 */
	EOperation getResourceReader__First__boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#getFrame() <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#getFrame()
	 * @generated
	 */
	EOperation getResourceReader__GetFrame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#lookup(java.lang.String) <em>Lookup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#lookup(java.lang.String)
	 * @generated
	 */
	EOperation getResourceReader__Lookup__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#lookup(java.lang.String, boolean) <em>Lookup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#lookup(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getResourceReader__Lookup__String_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceReader#getContextProvider() <em>Get Context Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Provider</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceReader#getContextProvider()
	 * @generated
	 */
	EOperation getResourceReader__GetContextProvider();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#add(org.abchip.mimo.entity.Entity) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#add(org.abchip.mimo.entity.Entity)
	 * @generated
	 */
	EOperation getResourceSerializer__Add__Entity();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#addAll(java.util.List) <em>Add All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#addAll(java.util.List)
	 * @generated
	 */
	EOperation getResourceSerializer__AddAll__List();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#clear()
	 * @generated
	 */
	EOperation getResourceSerializer__Clear();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#load(java.io.InputStream, boolean) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#load(java.io.InputStream, boolean)
	 * @generated
	 */
	EOperation getResourceSerializer__Load__InputStream_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#load(java.lang.String, boolean) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#load(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getResourceSerializer__Load__String_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#save(java.io.OutputStream) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#save(java.io.OutputStream)
	 * @generated
	 */
	EOperation getResourceSerializer__Save__OutputStream();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#get() <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#get()
	 * @generated
	 */
	EOperation getResourceSerializer__Get();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#getAll()
	 * @generated
	 */
	EOperation getResourceSerializer__GetAll();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceSerializer#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceSerializer#isEmpty()
	 * @generated
	 */
	EOperation getResourceSerializer__IsEmpty();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceWriter#delete(org.abchip.mimo.entity.EntityNameable) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceWriter#delete(org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getResourceWriter__Delete__EntityNameable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceWriter#create(org.abchip.mimo.entity.EntityNameable) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceWriter#create(org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getResourceWriter__Create__EntityNameable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceWriter#create(org.abchip.mimo.entity.EntityNameable, boolean) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceWriter#create(org.abchip.mimo.entity.EntityNameable, boolean)
	 * @generated
	 */
	EOperation getResourceWriter__Create__EntityNameable_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceWriter#nextSequence() <em>Next Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Next Sequence</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceWriter#nextSequence()
	 * @generated
	 */
	EOperation getResourceWriter__NextSequence();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.resource.ResourceWriter#update(org.abchip.mimo.entity.EntityNameable) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.abchip.mimo.resource.ResourceWriter#update(org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getResourceWriter__Update__EntityNameable();

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
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___CREATE__ENTITYNAMEABLE_BOOLEAN = eINSTANCE.getResource__Create__EntityNameable_boolean();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___DELETE__ENTITYNAMEABLE = eINSTANCE.getResource__Delete__EntityNameable();

		/**
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___GET_FRAME = eINSTANCE.getResource__GetFrame();

		/**
		 * The meta object literal for the '<em><b>Get Tenant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___GET_TENANT = eINSTANCE.getResource__GetTenant();

		/**
		 * The meta object literal for the '<em><b>Next Sequence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___NEXT_SEQUENCE = eINSTANCE.getResource__NextSequence();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___READ__STRING_STRING_BOOLEAN = eINSTANCE.getResource__Read__String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___READ__STRING_STRING_STRING_INT_BOOLEAN = eINSTANCE.getResource__Read__String_String_String_int_boolean();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___UPDATE__ENTITYNAMEABLE = eINSTANCE.getResource__Update__EntityNameable();

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
		 * The meta object literal for the '<em><b>Get Context Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_EVENT___GET_CONTEXT_PROVIDER = eINSTANCE.getResourceEvent__GetContextProvider();

		/**
		 * The meta object literal for the '<em><b>Get Event Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_EVENT___GET_EVENT_TYPE = eINSTANCE.getResourceEvent__GetEventType();

		/**
		 * The meta object literal for the '<em><b>Get New Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_EVENT___GET_NEW_NAME = eINSTANCE.getResourceEvent__GetNewName();

		/**
		 * The meta object literal for the '<em><b>Get Old Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_EVENT___GET_OLD_NAME = eINSTANCE.getResourceEvent__GetOldName();

		/**
		 * The meta object literal for the '<em><b>Get Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_EVENT___GET_SOURCE = eINSTANCE.getResourceEvent__GetSource();

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
		 * The meta object literal for the '<em><b>Handle Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_LISTENER___HANDLE_EVENT__RESOURCEEVENT = eINSTANCE.getResourceListener__HandleEvent__ResourceEvent();

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
		 * The meta object literal for the '<em><b>Create Resource Serializer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__CLASS_SERIALIZATIONTYPE = eINSTANCE.getResourceManager__CreateResourceSerializer__Class_SerializationType();

		/**
		 * The meta object literal for the '<em><b>Create Resource Serializer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__FRAME_SERIALIZATIONTYPE = eINSTANCE.getResourceManager__CreateResourceSerializer__Frame_SerializationType();

		/**
		 * The meta object literal for the '<em><b>Create Resource Serializer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__STRING_SERIALIZATIONTYPE = eINSTANCE.getResourceManager__CreateResourceSerializer__String_SerializationType();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_Class();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_Frame();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS_STRING = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME_STRING = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_Frame_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING_STRING = eINSTANCE.getResourceManager__GetResourceReader__ContextProvider_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_Class();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_Frame();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS_STRING = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME_STRING = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_Frame_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource Writer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING_STRING = eINSTANCE.getResourceManager__GetResourceWriter__ContextProvider_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_PROVIDER__CLASS = eINSTANCE.getResourceManager__GetProvider__Class();

		/**
		 * The meta object literal for the '<em><b>Get Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_PROVIDER__FRAME = eINSTANCE.getResourceManager__GetProvider__Frame();

		/**
		 * The meta object literal for the '<em><b>Get Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___GET_PROVIDER__STRING = eINSTANCE.getResourceManager__GetProvider__String();

		/**
		 * The meta object literal for the '<em><b>Register Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_LISTENER__CLASS_RESOURCELISTENER = eINSTANCE.getResourceManager__RegisterListener__Class_ResourceListener();

		/**
		 * The meta object literal for the '<em><b>Register Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_LISTENER__FRAME_RESOURCELISTENER = eINSTANCE.getResourceManager__RegisterListener__Frame_ResourceListener();

		/**
		 * The meta object literal for the '<em><b>Register Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_LISTENER__STRING_RESOURCELISTENER = eINSTANCE.getResourceManager__RegisterListener__String_ResourceListener();

		/**
		 * The meta object literal for the '<em><b>Register Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_PROVIDER__CLASS_RESOURCEPROVIDER = eINSTANCE.getResourceManager__RegisterProvider__Class_ResourceProvider();

		/**
		 * The meta object literal for the '<em><b>Register Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_PROVIDER__FRAME_RESOURCEPROVIDER = eINSTANCE.getResourceManager__RegisterProvider__Frame_ResourceProvider();

		/**
		 * The meta object literal for the '<em><b>Register Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_MANAGER___REGISTER_PROVIDER__STRING_RESOURCEPROVIDER = eINSTANCE.getResourceManager__RegisterProvider__String_ResourceProvider();

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
		 * The meta object literal for the '<em><b>Fire Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_NOTIFIER___FIRE_EVENT__RESOURCEEVENT = eINSTANCE.getResourceNotifier__FireEvent__ResourceEvent();

		/**
		 * The meta object literal for the '<em><b>Get Listeners</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_NOTIFIER___GET_LISTENERS = eINSTANCE.getResourceNotifier__GetListeners();

		/**
		 * The meta object literal for the '<em><b>Register Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_NOTIFIER___REGISTER_LISTENER__RESOURCELISTENER = eINSTANCE.getResourceNotifier__RegisterListener__ResourceListener();

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
		 * The meta object literal for the '<em><b>Check Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___CHECK_LOGIN__AUTHENTICATIONUSERTOKEN_BOOLEAN = eINSTANCE.getResourceProvider__CheckLogin__AuthenticationUserToken_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS = eINSTANCE.getResourceProvider__GetResource__ContextProvider_Class();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME = eINSTANCE.getResourceProvider__GetResource__ContextProvider_Frame();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING = eINSTANCE.getResourceProvider__GetResource__ContextProvider_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS_STRING = eINSTANCE.getResourceProvider__GetResource__ContextProvider_Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME_STRING = eINSTANCE.getResourceProvider__GetResource__ContextProvider_Frame_String();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING_STRING = eINSTANCE.getResourceProvider__GetResource__ContextProvider_String_String();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___IS_ACTIVE__CONTEXTPROVIDER = eINSTANCE.getResourceProvider__IsActive__ContextProvider();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONANONYMOUS = eINSTANCE.getResourceProvider__Login__String_AuthenticationAnonymous();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERPASSWORD = eINSTANCE.getResourceProvider__Login__String_AuthenticationUserPassword();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERTOKEN = eINSTANCE.getResourceProvider__Login__String_AuthenticationUserToken();

		/**
		 * The meta object literal for the '<em><b>Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PROVIDER___LOGOUT__CONTEXTPROVIDER = eINSTANCE.getResourceProvider__Logout__ContextProvider();

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
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND = eINSTANCE.getResourceReader__Find();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND__STRING = eINSTANCE.getResourceReader__Find__String();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND__STRING_STRING = eINSTANCE.getResourceReader__Find__String_String();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND__STRING_STRING_STRING = eINSTANCE.getResourceReader__Find__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND__STRING_STRING_STRING_INT = eINSTANCE.getResourceReader__Find__String_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIND__STRING_STRING_STRING_INT_BOOLEAN = eINSTANCE.getResourceReader__Find__String_String_String_int_boolean();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIRST = eINSTANCE.getResourceReader__First();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___FIRST__BOOLEAN = eINSTANCE.getResourceReader__First__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___GET_FRAME = eINSTANCE.getResourceReader__GetFrame();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___LOOKUP__STRING = eINSTANCE.getResourceReader__Lookup__String();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___LOOKUP__STRING_BOOLEAN = eINSTANCE.getResourceReader__Lookup__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Context Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_READER___GET_CONTEXT_PROVIDER = eINSTANCE.getResourceReader__GetContextProvider();

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
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___ADD__ENTITY = eINSTANCE.getResourceSerializer__Add__Entity();

		/**
		 * The meta object literal for the '<em><b>Add All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___ADD_ALL__LIST = eINSTANCE.getResourceSerializer__AddAll__List();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___CLEAR = eINSTANCE.getResourceSerializer__Clear();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___LOAD__INPUTSTREAM_BOOLEAN = eINSTANCE.getResourceSerializer__Load__InputStream_boolean();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___LOAD__STRING_BOOLEAN = eINSTANCE.getResourceSerializer__Load__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___SAVE__OUTPUTSTREAM = eINSTANCE.getResourceSerializer__Save__OutputStream();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___GET = eINSTANCE.getResourceSerializer__Get();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___GET_ALL = eINSTANCE.getResourceSerializer__GetAll();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_SERIALIZER___IS_EMPTY = eINSTANCE.getResourceSerializer__IsEmpty();

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
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_WRITER___DELETE__ENTITYNAMEABLE = eINSTANCE.getResourceWriter__Delete__EntityNameable();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_WRITER___CREATE__ENTITYNAMEABLE = eINSTANCE.getResourceWriter__Create__EntityNameable();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_WRITER___CREATE__ENTITYNAMEABLE_BOOLEAN = eINSTANCE.getResourceWriter__Create__EntityNameable_boolean();

		/**
		 * The meta object literal for the '<em><b>Next Sequence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_WRITER___NEXT_SEQUENCE = eINSTANCE.getResourceWriter__NextSequence();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_WRITER___UPDATE__ENTITYNAMEABLE = eINSTANCE.getResourceWriter__Update__EntityNameable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.ResourceEventType
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEventType()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_TYPE = eINSTANCE.getResourceEventType();

	}

} //ResourcePackage
