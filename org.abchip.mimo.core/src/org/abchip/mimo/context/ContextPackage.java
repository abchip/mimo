/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.abchip.mimo.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-ctx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = org.abchip.mimo.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.AdapterFactory <em>Adapter Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.AdapterFactory
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAdapterFactory()
	 * @generated
	 */
	int ADAPTER_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Adapter Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FACTORY___GET_ADAPTER__CONTEXT_OBJECT_CLASS = 0;

	/**
	 * The number of operations of the '<em>Adapter Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FACTORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.Authentication <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.Authentication
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.AuthenticationManager <em>Authentication Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.AuthenticationManager
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationManager()
	 * @generated
	 */
	int AUTHENTICATION_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Authentication Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MANAGER___AUTHENTICATE__AUTHENTICATION = 0;

	/**
	 * The number of operations of the '<em>Authentication Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl <em>Authentication User Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationUserPassword()
	 * @generated
	 */
	int AUTHENTICATION_USER_PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__USER = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__PASSWORD = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__TENANT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Authentication User Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD___ISA = AUTHENTICATION___ISA;

	/**
	 * The number of operations of the '<em>Authentication User Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl <em>Authentication User Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.AuthenticationUserTokenImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationUserToken()
	 * @generated
	 */
	int AUTHENTICATION_USER_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__PROVIDER = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__ID_TOKEN = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__PICTURE = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__USER = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Authentication User Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN___ISA = AUTHENTICATION___ISA;

	/**
	 * The number of operations of the '<em>Authentication User Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.AuthenticationAnonymousImpl <em>Authentication Anonymous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.AuthenticationAnonymousImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationAnonymous()
	 * @generated
	 */
	int AUTHENTICATION_ANONYMOUS = 5;

	/**
	 * The number of structural features of the '<em>Authentication Anonymous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ANONYMOUS_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ANONYMOUS___ISA = AUTHENTICATION___ISA;

	/**
	 * The number of operations of the '<em>Authentication Anonymous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ANONYMOUS_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.CapabilityImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 6;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RIGHTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ENTITY_URI = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Entity Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___GET_ENTITY_NAME = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.ContextRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextRootImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextRoot()
	 * @generated
	 */
	int CONTEXT_ROOT = 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.ContextDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextDescriptionImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextDescription()
	 * @generated
	 */
	int CONTEXT_DESCRIPTION = 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.ContextProvider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.ContextProvider
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 9;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER___GET_CONTEXT = 0;

	/**
	 * The operation id for the '<em>Get Context Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER___GET_CONTEXT_DESCRIPTION = 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_OPERATION_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CONTEXT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_CONTEXT = CONTEXT_PROVIDER___GET_CONTEXT;

	/**
	 * The operation id for the '<em>Get Context Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_CONTEXT_DESCRIPTION = CONTEXT_PROVIDER___GET_CONTEXT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___CLOSE = CONTEXT_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET__CLASS = CONTEXT_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_ADAPTER__OBJECT_CLASS = CONTEXT_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Inject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___INJECT__OBJECT = CONTEXT_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Closed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___IS_CLOSED = CONTEXT_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___INVOKE__OBJECT_CLASS = CONTEXT_PROVIDER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Make</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___MAKE__CLASS = CONTEXT_PROVIDER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Adapter Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___REGISTER_ADAPTER_FACTORY__ADAPTERFACTORY_CLASS = CONTEXT_PROVIDER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___SET__CLASS_OBJECT = CONTEXT_PROVIDER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___SET__STRING_OBJECT = CONTEXT_PROVIDER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_RESOURCE__CLASS_STRING = CONTEXT_PROVIDER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_RESOURCES__CLASS_STRING = CONTEXT_PROVIDER_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = CONTEXT_PROVIDER_OPERATION_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__ANONYMOUS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__DATA_PATH = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__ID = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__PICTURE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__TENANT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__USER = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Is Tenant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION___IS_TENANT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_CONTEXT = CONTEXT___GET_CONTEXT;

	/**
	 * The operation id for the '<em>Get Context Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_CONTEXT_DESCRIPTION = CONTEXT___GET_CONTEXT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___CLOSE = CONTEXT___CLOSE;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET__CLASS = CONTEXT___GET__CLASS;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_ADAPTER__OBJECT_CLASS = CONTEXT___GET_ADAPTER__OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Inject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___INJECT__OBJECT = CONTEXT___INJECT__OBJECT;

	/**
	 * The operation id for the '<em>Is Closed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___IS_CLOSED = CONTEXT___IS_CLOSED;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___INVOKE__OBJECT_CLASS = CONTEXT___INVOKE__OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Make</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___MAKE__CLASS = CONTEXT___MAKE__CLASS;

	/**
	 * The operation id for the '<em>Register Adapter Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___REGISTER_ADAPTER_FACTORY__ADAPTERFACTORY_CLASS = CONTEXT___REGISTER_ADAPTER_FACTORY__ADAPTERFACTORY_CLASS;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___SET__CLASS_OBJECT = CONTEXT___SET__CLASS_OBJECT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___SET__STRING_OBJECT = CONTEXT___SET__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_RESOURCE__CLASS_STRING = CONTEXT___GET_RESOURCE__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_RESOURCES__CLASS_STRING = CONTEXT___GET_RESOURCES__CLASS_STRING;

	/**
	 * The operation id for the '<em>Create Child Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___CREATE_CHILD_CONTEXT__STRING = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Child Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___CREATE_CHILD_CONTEXT__CONTEXTDESCRIPTION = CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET__CLASS_STRING = CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_ALL__CLASS = CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___GET_ALL__CLASS_STRING = CONTEXT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Load Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___LOAD_CLASS__STRING = CONTEXT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT___SET__STRING_OBJECT_BOOLEAN_DICTIONARY = CONTEXT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ROOT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.EntityLocker
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getEntityLocker()
	 * @generated
	 */
	int ENTITY_LOCKER = 11;

	/**
	 * The number of structural features of the '<em>Entity Locker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER___GET_ADDRESS = 0;

	/**
	 * The operation id for the '<em>Is Locked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER___IS_LOCKED__LOCKTYPE = 1;

	/**
	 * The operation id for the '<em>Lock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER___LOCK__LOCKTYPE = 2;

	/**
	 * The operation id for the '<em>Try Lock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER___TRY_LOCK__LONG_LOCKTYPE = 3;

	/**
	 * The operation id for the '<em>Unlock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER___UNLOCK__LOCKTYPE = 4;

	/**
	 * The number of operations of the '<em>Entity Locker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.ExceptionManager <em>Exception Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.ExceptionManager
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getExceptionManager()
	 * @generated
	 */
	int EXCEPTION_MANAGER = 12;

	/**
	 * The number of structural features of the '<em>Exception Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Prepare Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM = 0;

	/**
	 * The operation id for the '<em>Prepare Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT = 1;

	/**
	 * The operation id for the '<em>Prepare Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT_1 = 2;

	/**
	 * The operation id for the '<em>Prepare Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_STRING_STRING_STRING_OBJECT = 3;

	/**
	 * The number of operations of the '<em>Exception Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.IdentityImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 13;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Java Principal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY___GET_JAVA_PRINCIPAL = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.LockManager <em>Lock Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.LockManager
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockManager()
	 * @generated
	 */
	int LOCK_MANAGER = 14;

	/**
	 * The number of structural features of the '<em>Lock Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Locker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_URI = 0;

	/**
	 * The operation id for the '<em>Get Locker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_ENTITYNAMEABLE = 1;

	/**
	 * The operation id for the '<em>Get Concurrent Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER___GET_CONCURRENT_MAP__CONTEXTPROVIDER_STRING = 2;

	/**
	 * The operation id for the '<em>Get Queue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER___GET_QUEUE__CONTEXTPROVIDER_STRING = 3;

	/**
	 * The number of operations of the '<em>Lock Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.Logger <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.Logger
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 15;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Debug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___DEBUG__STRING = 0;

	/**
	 * The operation id for the '<em>Debug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___DEBUG__THROWABLE = 1;

	/**
	 * The operation id for the '<em>Debug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___DEBUG__STRING_THROWABLE = 2;

	/**
	 * The operation id for the '<em>Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___ERROR__STRING = 3;

	/**
	 * The operation id for the '<em>Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___ERROR__THROWABLE = 4;

	/**
	 * The operation id for the '<em>Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___ERROR__STRING_THROWABLE = 5;

	/**
	 * The operation id for the '<em>Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___INFO__STRING = 6;

	/**
	 * The operation id for the '<em>Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___INFO__THROWABLE = 7;

	/**
	 * The operation id for the '<em>Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___INFO__STRING_THROWABLE = 8;

	/**
	 * The operation id for the '<em>Warning</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___WARNING__STRING = 9;

	/**
	 * The operation id for the '<em>Warning</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___WARNING__THROWABLE = 10;

	/**
	 * The operation id for the '<em>Warning</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___WARNING__STRING_THROWABLE = 11;

	/**
	 * The number of operations of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageDescriptionImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDescription()
	 * @generated
	 */
	int MESSAGE_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__SEVERITY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_HELP = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_TEXT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION___GET_TEXT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageDataFieldImpl <em>Message Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageDataFieldImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDataField()
	 * @generated
	 */
	int MESSAGE_DATA_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__OUTPUT_MASK = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__DEFINITION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Message Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageFileImpl <em>Message File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageFileImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageFile()
	 * @generated
	 */
	int MESSAGE_FILE = 18;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__MESSAGES = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___ISA = EntityPackage.ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___GET_NAME = EntityPackage.ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___GET_URI = EntityPackage.ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___IS_PROXY = EntityPackage.ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___GET_TEXT = EntityPackage.ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE___LOOKUP__STRING = EntityPackage.ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_OPERATION_COUNT = EntityPackage.ENTITY_NAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.Registry <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.Registry
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getRegistry()
	 * @generated
	 */
	int REGISTRY = 19;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY___LOOKUP__STRING = 0;

	/**
	 * The operation id for the '<em>List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY___LIST = 1;

	/**
	 * The operation id for the '<em>Lookup By Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY___LOOKUP_BY_PORT__INT = 2;

	/**
	 * The operation id for the '<em>Lookup By Vendor Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY___LOOKUP_BY_VENDOR_VERSION__STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.RegistryFactory <em>Registry Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.RegistryFactory
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getRegistryFactory()
	 * @generated
	 */
	int REGISTRY_FACTORY = 20;

	/**
	 * The number of structural features of the '<em>Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FACTORY___CREATE_REGISTRY__CLASS = 0;

	/**
	 * The number of operations of the '<em>Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FACTORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.UserProfileImpl <em>User Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.UserProfileImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserProfile()
	 * @generated
	 */
	int USER_PROFILE = 21;

	/**
	 * The feature id for the '<em><b>Job Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__JOB_DESCRIPTION = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__USER_CLASS = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE___ISA = EntityPackage.ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE___GET_NAME = EntityPackage.ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE___GET_URI = EntityPackage.ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE___IS_PROXY = EntityPackage.ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE___GET_TEXT = EntityPackage.ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_OPERATION_COUNT = EntityPackage.ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.CapabilityRight <em>Capability Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.CapabilityRight
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapabilityRight()
	 * @generated
	 */
	int CAPABILITY_RIGHT = 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.LockType <em>Lock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.LockType
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockType()
	 * @generated
	 */
	int LOCK_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.UserClass <em>User Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.UserClass
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserClass()
	 * @generated
	 */
	int USER_CLASS = 24;

	/**
	 * The meta object id for the '<em>Message Variable List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageVariableList()
	 * @generated
	 */
	int MESSAGE_VARIABLE_LIST = 25;

	/**
	 * The meta object id for the '<em>Message Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.MessageException
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageException()
	 * @generated
	 */
	int MESSAGE_EXCEPTION = 26;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.AdapterFactory <em>Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Factory</em>'.
	 * @see org.abchip.mimo.context.AdapterFactory
	 * @generated
	 */
	EClass getAdapterFactory();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.AdapterFactory#getAdapter(org.abchip.mimo.context.Context, java.lang.Object, java.lang.Class) <em>Get Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Adapter</em>' operation.
	 * @see org.abchip.mimo.context.AdapterFactory#getAdapter(org.abchip.mimo.context.Context, java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getAdapterFactory__GetAdapter__Context_Object_Class();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see org.abchip.mimo.context.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.AuthenticationManager <em>Authentication Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Manager</em>'.
	 * @see org.abchip.mimo.context.AuthenticationManager
	 * @generated
	 */
	EClass getAuthenticationManager();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.AuthenticationManager#authenticate(org.abchip.mimo.context.Authentication) <em>Authenticate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authenticate</em>' operation.
	 * @see org.abchip.mimo.context.AuthenticationManager#authenticate(org.abchip.mimo.context.Authentication)
	 * @generated
	 */
	EOperation getAuthenticationManager__Authenticate__Authentication();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.AuthenticationUserPassword <em>Authentication User Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication User Password</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserPassword
	 * @generated
	 */
	EClass getAuthenticationUserPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserPassword#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserPassword#getUser()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_User();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserPassword#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserPassword#getPassword()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserPassword#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserPassword#getTenant()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_Tenant();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.AuthenticationUserToken <em>Authentication User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication User Token</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken
	 * @generated
	 */
	EClass getAuthenticationUserToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserToken#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken#getProvider()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserToken#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken#getAccessToken()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserToken#getIdToken <em>Id Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Token</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken#getIdToken()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_IdToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserToken#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken#getPicture()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_Picture();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.AuthenticationUserToken#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.context.AuthenticationUserToken#getUser()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_User();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.AuthenticationAnonymous <em>Authentication Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Anonymous</em>'.
	 * @see org.abchip.mimo.context.AuthenticationAnonymous
	 * @generated
	 */
	EClass getAuthenticationAnonymous();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.abchip.mimo.context.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.context.Capability#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rights</em>'.
	 * @see org.abchip.mimo.context.Capability#getRights()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Rights();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.Capability#getEntityURI <em>Entity URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity URI</em>'.
	 * @see org.abchip.mimo.context.Capability#getEntityURI()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_EntityURI();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Capability#getEntityName() <em>Get Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Name</em>' operation.
	 * @see org.abchip.mimo.context.Capability#getEntityName()
	 * @generated
	 */
	EOperation getCapability__GetEntityName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.abchip.mimo.context.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see org.abchip.mimo.context.Context#close()
	 * @generated
	 */
	EOperation getContext__Close();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#get(java.lang.Class) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.abchip.mimo.context.Context#get(java.lang.Class)
	 * @generated
	 */
	EOperation getContext__Get__Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#getAdapter(java.lang.Object, java.lang.Class) <em>Get Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Adapter</em>' operation.
	 * @see org.abchip.mimo.context.Context#getAdapter(java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getContext__GetAdapter__Object_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#inject(java.lang.Object) <em>Inject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inject</em>' operation.
	 * @see org.abchip.mimo.context.Context#inject(java.lang.Object)
	 * @generated
	 */
	EOperation getContext__Inject__Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#isClosed() <em>Is Closed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Closed</em>' operation.
	 * @see org.abchip.mimo.context.Context#isClosed()
	 * @generated
	 */
	EOperation getContext__IsClosed();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#invoke(java.lang.Object, java.lang.Class) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see org.abchip.mimo.context.Context#invoke(java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getContext__Invoke__Object_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#make(java.lang.Class) <em>Make</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make</em>' operation.
	 * @see org.abchip.mimo.context.Context#make(java.lang.Class)
	 * @generated
	 */
	EOperation getContext__Make__Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#registerAdapterFactory(org.abchip.mimo.context.AdapterFactory, java.lang.Class) <em>Register Adapter Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Adapter Factory</em>' operation.
	 * @see org.abchip.mimo.context.Context#registerAdapterFactory(org.abchip.mimo.context.AdapterFactory, java.lang.Class)
	 * @generated
	 */
	EOperation getContext__RegisterAdapterFactory__AdapterFactory_Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#set(java.lang.Class, java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see org.abchip.mimo.context.Context#set(java.lang.Class, java.lang.Object)
	 * @generated
	 */
	EOperation getContext__Set__Class_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#set(java.lang.String, java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see org.abchip.mimo.context.Context#set(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getContext__Set__String_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#getResource(java.lang.Class, java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see org.abchip.mimo.context.Context#getResource(java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getContext__GetResource__Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Context#getResources(java.lang.Class, java.lang.String) <em>Get Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resources</em>' operation.
	 * @see org.abchip.mimo.context.Context#getResources(java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getContext__GetResources__Class_String();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.ContextRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.abchip.mimo.context.ContextRoot
	 * @generated
	 */
	EClass getContextRoot();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#createChildContext(java.lang.String) <em>Create Child Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Child Context</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#createChildContext(java.lang.String)
	 * @generated
	 */
	EOperation getContextRoot__CreateChildContext__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#createChildContext(org.abchip.mimo.context.ContextDescription) <em>Create Child Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Child Context</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#createChildContext(org.abchip.mimo.context.ContextDescription)
	 * @generated
	 */
	EOperation getContextRoot__CreateChildContext__ContextDescription();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#get(java.lang.Class, java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#get(java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getContextRoot__Get__Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#getAll(java.lang.Class) <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#getAll(java.lang.Class)
	 * @generated
	 */
	EOperation getContextRoot__GetAll__Class();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#getAll(java.lang.Class, java.lang.String) <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#getAll(java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getContextRoot__GetAll__Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#loadClass(java.lang.String) <em>Load Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Class</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#loadClass(java.lang.String)
	 * @generated
	 */
	EOperation getContextRoot__LoadClass__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextRoot#set(java.lang.String, java.lang.Object, boolean, java.util.Dictionary) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see org.abchip.mimo.context.ContextRoot#set(java.lang.String, java.lang.Object, boolean, java.util.Dictionary)
	 * @generated
	 */
	EOperation getContextRoot__Set__String_Object_boolean_Dictionary();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.ContextDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.abchip.mimo.context.ContextDescription
	 * @generated
	 */
	EClass getContextDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#isAnonymous()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Anonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getDataPath()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getId()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getPicture()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Picture();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getTenant()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Tenant();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getUser()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_User();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextDescription#isTenant() <em>Is Tenant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Tenant</em>' operation.
	 * @see org.abchip.mimo.context.ContextDescription#isTenant()
	 * @generated
	 */
	EOperation getContextDescription__IsTenant();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.ContextProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.abchip.mimo.context.ContextProvider
	 * @generated
	 */
	EClass getContextProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextProvider#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see org.abchip.mimo.context.ContextProvider#getContext()
	 * @generated
	 */
	EOperation getContextProvider__GetContext();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ContextProvider#getContextDescription() <em>Get Context Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Description</em>' operation.
	 * @see org.abchip.mimo.context.ContextProvider#getContextDescription()
	 * @generated
	 */
	EOperation getContextProvider__GetContextDescription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Locker</em>'.
	 * @see org.abchip.mimo.context.EntityLocker
	 * @generated
	 */
	EClass getEntityLocker();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.EntityLocker#getAddress() <em>Get Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Address</em>' operation.
	 * @see org.abchip.mimo.context.EntityLocker#getAddress()
	 * @generated
	 */
	EOperation getEntityLocker__GetAddress();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.EntityLocker#isLocked(org.abchip.mimo.context.LockType) <em>Is Locked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Locked</em>' operation.
	 * @see org.abchip.mimo.context.EntityLocker#isLocked(org.abchip.mimo.context.LockType)
	 * @generated
	 */
	EOperation getEntityLocker__IsLocked__LockType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.EntityLocker#lock(org.abchip.mimo.context.LockType) <em>Lock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lock</em>' operation.
	 * @see org.abchip.mimo.context.EntityLocker#lock(org.abchip.mimo.context.LockType)
	 * @generated
	 */
	EOperation getEntityLocker__Lock__LockType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.EntityLocker#tryLock(long, org.abchip.mimo.context.LockType) <em>Try Lock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Try Lock</em>' operation.
	 * @see org.abchip.mimo.context.EntityLocker#tryLock(long, org.abchip.mimo.context.LockType)
	 * @generated
	 */
	EOperation getEntityLocker__TryLock__long_LockType();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.EntityLocker#unlock(org.abchip.mimo.context.LockType) <em>Unlock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unlock</em>' operation.
	 * @see org.abchip.mimo.context.EntityLocker#unlock(org.abchip.mimo.context.LockType)
	 * @generated
	 */
	EOperation getEntityLocker__Unlock__LockType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.ExceptionManager <em>Exception Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Manager</em>'.
	 * @see org.abchip.mimo.context.ExceptionManager
	 * @generated
	 */
	EClass getExceptionManager();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum) <em>Prepare Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Exception</em>' operation.
	 * @see org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum)
	 * @generated
	 */
	EOperation getExceptionManager__PrepareException__ContextProvider_Enum();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum, java.lang.Object) <em>Prepare Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Exception</em>' operation.
	 * @see org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum, java.lang.Object)
	 * @generated
	 */
	EOperation getExceptionManager__PrepareException__ContextProvider_Enum_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum, java.lang.Object[]) <em>Prepare Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Exception</em>' operation.
	 * @see org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.Enum, java.lang.Object[])
	 * @generated
	 */
	EOperation getExceptionManager__PrepareException__ContextProvider_Enum_Object_1();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]) <em>Prepare Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Exception</em>' operation.
	 * @see org.abchip.mimo.context.ExceptionManager#prepareException(org.abchip.mimo.context.ContextProvider, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getExceptionManager__PrepareException__ContextProvider_String_String_String_Object();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.abchip.mimo.context.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Identity#getJavaPrincipal() <em>Get Java Principal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Java Principal</em>' operation.
	 * @see org.abchip.mimo.context.Identity#getJavaPrincipal()
	 * @generated
	 */
	EOperation getIdentity__GetJavaPrincipal();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.LockManager <em>Lock Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Manager</em>'.
	 * @see org.abchip.mimo.context.LockManager
	 * @generated
	 */
	EClass getLockManager();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.LockManager#getLocker(org.abchip.mimo.context.ContextProvider, java.net.URI) <em>Get Locker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locker</em>' operation.
	 * @see org.abchip.mimo.context.LockManager#getLocker(org.abchip.mimo.context.ContextProvider, java.net.URI)
	 * @generated
	 */
	EOperation getLockManager__GetLocker__ContextProvider_URI();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.LockManager#getLocker(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.EntityNameable) <em>Get Locker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locker</em>' operation.
	 * @see org.abchip.mimo.context.LockManager#getLocker(org.abchip.mimo.context.ContextProvider, org.abchip.mimo.entity.EntityNameable)
	 * @generated
	 */
	EOperation getLockManager__GetLocker__ContextProvider_EntityNameable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.LockManager#getConcurrentMap(org.abchip.mimo.context.ContextProvider, java.lang.String) <em>Get Concurrent Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Concurrent Map</em>' operation.
	 * @see org.abchip.mimo.context.LockManager#getConcurrentMap(org.abchip.mimo.context.ContextProvider, java.lang.String)
	 * @generated
	 */
	EOperation getLockManager__GetConcurrentMap__ContextProvider_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.LockManager#getQueue(org.abchip.mimo.context.ContextProvider, java.lang.String) <em>Get Queue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Queue</em>' operation.
	 * @see org.abchip.mimo.context.LockManager#getQueue(org.abchip.mimo.context.ContextProvider, java.lang.String)
	 * @generated
	 */
	EOperation getLockManager__GetQueue__ContextProvider_String();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.abchip.mimo.context.Logger
	 * @generated
	 */
	EClass getLogger();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#debug(java.lang.String) <em>Debug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Debug</em>' operation.
	 * @see org.abchip.mimo.context.Logger#debug(java.lang.String)
	 * @generated
	 */
	EOperation getLogger__Debug__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#debug(java.lang.Throwable) <em>Debug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Debug</em>' operation.
	 * @see org.abchip.mimo.context.Logger#debug(java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Debug__Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#debug(java.lang.String, java.lang.Throwable) <em>Debug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Debug</em>' operation.
	 * @see org.abchip.mimo.context.Logger#debug(java.lang.String, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Debug__String_Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#error(java.lang.String) <em>Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Error</em>' operation.
	 * @see org.abchip.mimo.context.Logger#error(java.lang.String)
	 * @generated
	 */
	EOperation getLogger__Error__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#error(java.lang.Throwable) <em>Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Error</em>' operation.
	 * @see org.abchip.mimo.context.Logger#error(java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Error__Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#error(java.lang.String, java.lang.Throwable) <em>Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Error</em>' operation.
	 * @see org.abchip.mimo.context.Logger#error(java.lang.String, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Error__String_Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#info(java.lang.String) <em>Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Info</em>' operation.
	 * @see org.abchip.mimo.context.Logger#info(java.lang.String)
	 * @generated
	 */
	EOperation getLogger__Info__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#info(java.lang.Throwable) <em>Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Info</em>' operation.
	 * @see org.abchip.mimo.context.Logger#info(java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Info__Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#info(java.lang.String, java.lang.Throwable) <em>Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Info</em>' operation.
	 * @see org.abchip.mimo.context.Logger#info(java.lang.String, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Info__String_Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#warning(java.lang.String) <em>Warning</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Warning</em>' operation.
	 * @see org.abchip.mimo.context.Logger#warning(java.lang.String)
	 * @generated
	 */
	EOperation getLogger__Warning__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#warning(java.lang.Throwable) <em>Warning</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Warning</em>' operation.
	 * @see org.abchip.mimo.context.Logger#warning(java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Warning__Throwable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Logger#warning(java.lang.String, java.lang.Throwable) <em>Warning</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Warning</em>' operation.
	 * @see org.abchip.mimo.context.Logger#warning(java.lang.String, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Warning__String_Throwable();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.MessageDescription <em>Message Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Description</em>'.
	 * @see org.abchip.mimo.context.MessageDescription
	 * @generated
	 */
	EClass getMessageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.context.MessageDescription#getName()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageDescription#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.abchip.mimo.context.MessageDescription#getSeverity()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageDescription#getMessageHelp <em>Message Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Help</em>'.
	 * @see org.abchip.mimo.context.MessageDescription#getMessageHelp()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageDescription#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Text</em>'.
	 * @see org.abchip.mimo.context.MessageDescription#getMessageText()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.context.MessageDescription#getMessageDataFields <em>Message Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Data Fields</em>'.
	 * @see org.abchip.mimo.context.MessageDescription#getMessageDataFields()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EReference getMessageDescription_MessageDataFields();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.MessageDataField <em>Message Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Data Field</em>'.
	 * @see org.abchip.mimo.context.MessageDataField
	 * @generated
	 */
	EClass getMessageDataField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageDataField#getOutputMask <em>Output Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Mask</em>'.
	 * @see org.abchip.mimo.context.MessageDataField#getOutputMask()
	 * @see #getMessageDataField()
	 * @generated
	 */
	EAttribute getMessageDataField_OutputMask();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.context.MessageDataField#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.abchip.mimo.context.MessageDataField#getDefinition()
	 * @see #getMessageDataField()
	 * @generated
	 */
	EReference getMessageDataField_Definition();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.MessageFile <em>Message File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message File</em>'.
	 * @see org.abchip.mimo.context.MessageFile
	 * @generated
	 */
	EClass getMessageFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.context.MessageFile#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.abchip.mimo.context.MessageFile#getMessages()
	 * @see #getMessageFile()
	 * @generated
	 */
	EReference getMessageFile_Messages();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.context.MessageFile#getName()
	 * @see #getMessageFile()
	 * @generated
	 */
	EAttribute getMessageFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.MessageFile#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.context.MessageFile#getText()
	 * @see #getMessageFile()
	 * @generated
	 */
	EAttribute getMessageFile_Text();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.MessageFile#lookup(java.lang.String) <em>Lookup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup</em>' operation.
	 * @see org.abchip.mimo.context.MessageFile#lookup(java.lang.String)
	 * @generated
	 */
	EOperation getMessageFile__Lookup__String();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see org.abchip.mimo.context.Registry
	 * @generated
	 */
	EClass getRegistry();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Registry#lookup(java.lang.String) <em>Lookup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup</em>' operation.
	 * @see org.abchip.mimo.context.Registry#lookup(java.lang.String)
	 * @generated
	 */
	EOperation getRegistry__Lookup__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Registry#list() <em>List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List</em>' operation.
	 * @see org.abchip.mimo.context.Registry#list()
	 * @generated
	 */
	EOperation getRegistry__List();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Registry#lookupByPort(int) <em>Lookup By Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup By Port</em>' operation.
	 * @see org.abchip.mimo.context.Registry#lookupByPort(int)
	 * @generated
	 */
	EOperation getRegistry__LookupByPort__int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.Registry#lookupByVendorVersion(java.lang.String, java.lang.String) <em>Lookup By Vendor Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup By Vendor Version</em>' operation.
	 * @see org.abchip.mimo.context.Registry#lookupByVendorVersion(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRegistry__LookupByVendorVersion__String_String();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.RegistryFactory <em>Registry Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Factory</em>'.
	 * @see org.abchip.mimo.context.RegistryFactory
	 * @generated
	 */
	EClass getRegistryFactory();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.context.RegistryFactory#createRegistry(java.lang.Class) <em>Create Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Registry</em>' operation.
	 * @see org.abchip.mimo.context.RegistryFactory#createRegistry(java.lang.Class)
	 * @generated
	 */
	EOperation getRegistryFactory__CreateRegistry__Class();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.context.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile</em>'.
	 * @see org.abchip.mimo.context.UserProfile
	 * @generated
	 */
	EClass getUserProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.UserProfile#getJobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Description</em>'.
	 * @see org.abchip.mimo.context.UserProfile#getJobDescription()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_JobDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.UserProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.context.UserProfile#getName()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.UserProfile#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.context.UserProfile#getText()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.UserProfile#getUserClass <em>User Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Class</em>'.
	 * @see org.abchip.mimo.context.UserProfile#getUserClass()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_UserClass();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.context.CapabilityRight <em>Capability Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Right</em>'.
	 * @see org.abchip.mimo.context.CapabilityRight
	 * @generated
	 */
	EEnum getCapabilityRight();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.context.LockType <em>Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Type</em>'.
	 * @see org.abchip.mimo.context.LockType
	 * @generated
	 */
	EEnum getLockType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.context.UserClass <em>User Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Class</em>'.
	 * @see org.abchip.mimo.context.UserClass
	 * @generated
	 */
	EEnum getUserClass();

	/**
	 * Returns the meta object for data type '<em>Message Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Variable List</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getMessageVariableList();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.context.MessageException <em>Message Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Exception</em>'.
	 * @see org.abchip.mimo.context.MessageException
	 * @model instanceClass="org.abchip.mimo.context.MessageException"
	 * @generated
	 */
	EDataType getMessageException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.context.AdapterFactory <em>Adapter Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.AdapterFactory
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAdapterFactory()
		 * @generated
		 */
		EClass ADAPTER_FACTORY = eINSTANCE.getAdapterFactory();

		/**
		 * The meta object literal for the '<em><b>Get Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTER_FACTORY___GET_ADAPTER__CONTEXT_OBJECT_CLASS = eINSTANCE.getAdapterFactory__GetAdapter__Context_Object_Class();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.Authentication <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.Authentication
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.AuthenticationManager <em>Authentication Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.AuthenticationManager
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationManager()
		 * @generated
		 */
		EClass AUTHENTICATION_MANAGER = eINSTANCE.getAuthenticationManager();

		/**
		 * The meta object literal for the '<em><b>Authenticate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION_MANAGER___AUTHENTICATE__AUTHENTICATION = eINSTANCE.getAuthenticationManager__Authenticate__Authentication();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl <em>Authentication User Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.AuthenticationUserPasswordImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationUserPassword()
		 * @generated
		 */
		EClass AUTHENTICATION_USER_PASSWORD = eINSTANCE.getAuthenticationUserPassword();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__USER = eINSTANCE.getAuthenticationUserPassword_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__PASSWORD = eINSTANCE.getAuthenticationUserPassword_Password();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__TENANT = eINSTANCE.getAuthenticationUserPassword_Tenant();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.AuthenticationUserTokenImpl <em>Authentication User Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.AuthenticationUserTokenImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationUserToken()
		 * @generated
		 */
		EClass AUTHENTICATION_USER_TOKEN = eINSTANCE.getAuthenticationUserToken();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__PROVIDER = eINSTANCE.getAuthenticationUserToken_Provider();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN = eINSTANCE.getAuthenticationUserToken_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Id Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__ID_TOKEN = eINSTANCE.getAuthenticationUserToken_IdToken();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__PICTURE = eINSTANCE.getAuthenticationUserToken_Picture();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__USER = eINSTANCE.getAuthenticationUserToken_User();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.AuthenticationAnonymousImpl <em>Authentication Anonymous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.AuthenticationAnonymousImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getAuthenticationAnonymous()
		 * @generated
		 */
		EClass AUTHENTICATION_ANONYMOUS = eINSTANCE.getAuthenticationAnonymous();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.CapabilityImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__RIGHTS = eINSTANCE.getCapability_Rights();

		/**
		 * The meta object literal for the '<em><b>Entity URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__ENTITY_URI = eINSTANCE.getCapability_EntityURI();

		/**
		 * The meta object literal for the '<em><b>Get Entity Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPABILITY___GET_ENTITY_NAME = eINSTANCE.getCapability__GetEntityName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.ContextImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___CLOSE = eINSTANCE.getContext__Close();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET__CLASS = eINSTANCE.getContext__Get__Class();

		/**
		 * The meta object literal for the '<em><b>Get Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_ADAPTER__OBJECT_CLASS = eINSTANCE.getContext__GetAdapter__Object_Class();

		/**
		 * The meta object literal for the '<em><b>Inject</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___INJECT__OBJECT = eINSTANCE.getContext__Inject__Object();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___IS_CLOSED = eINSTANCE.getContext__IsClosed();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___INVOKE__OBJECT_CLASS = eINSTANCE.getContext__Invoke__Object_Class();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___MAKE__CLASS = eINSTANCE.getContext__Make__Class();

		/**
		 * The meta object literal for the '<em><b>Register Adapter Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___REGISTER_ADAPTER_FACTORY__ADAPTERFACTORY_CLASS = eINSTANCE.getContext__RegisterAdapterFactory__AdapterFactory_Class();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___SET__CLASS_OBJECT = eINSTANCE.getContext__Set__Class_Object();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___SET__STRING_OBJECT = eINSTANCE.getContext__Set__String_Object();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_RESOURCE__CLASS_STRING = eINSTANCE.getContext__GetResource__Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_RESOURCES__CLASS_STRING = eINSTANCE.getContext__GetResources__Class_String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.ContextRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.ContextRootImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextRoot()
		 * @generated
		 */
		EClass CONTEXT_ROOT = eINSTANCE.getContextRoot();

		/**
		 * The meta object literal for the '<em><b>Create Child Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___CREATE_CHILD_CONTEXT__STRING = eINSTANCE.getContextRoot__CreateChildContext__String();

		/**
		 * The meta object literal for the '<em><b>Create Child Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___CREATE_CHILD_CONTEXT__CONTEXTDESCRIPTION = eINSTANCE.getContextRoot__CreateChildContext__ContextDescription();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___GET__CLASS_STRING = eINSTANCE.getContextRoot__Get__Class_String();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___GET_ALL__CLASS = eINSTANCE.getContextRoot__GetAll__Class();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___GET_ALL__CLASS_STRING = eINSTANCE.getContextRoot__GetAll__Class_String();

		/**
		 * The meta object literal for the '<em><b>Load Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___LOAD_CLASS__STRING = eINSTANCE.getContextRoot__LoadClass__String();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ROOT___SET__STRING_OBJECT_BOOLEAN_DICTIONARY = eINSTANCE.getContextRoot__Set__String_Object_boolean_Dictionary();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.ContextDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.ContextDescriptionImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextDescription()
		 * @generated
		 */
		EClass CONTEXT_DESCRIPTION = eINSTANCE.getContextDescription();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__ANONYMOUS = eINSTANCE.getContextDescription_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__DATA_PATH = eINSTANCE.getContextDescription_DataPath();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__ID = eINSTANCE.getContextDescription_Id();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__PICTURE = eINSTANCE.getContextDescription_Picture();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__TENANT = eINSTANCE.getContextDescription_Tenant();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__USER = eINSTANCE.getContextDescription_User();

		/**
		 * The meta object literal for the '<em><b>Is Tenant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_DESCRIPTION___IS_TENANT = eINSTANCE.getContextDescription__IsTenant();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.ContextProvider <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.ContextProvider
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextProvider()
		 * @generated
		 */
		EClass CONTEXT_PROVIDER = eINSTANCE.getContextProvider();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_PROVIDER___GET_CONTEXT = eINSTANCE.getContextProvider__GetContext();

		/**
		 * The meta object literal for the '<em><b>Get Context Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_PROVIDER___GET_CONTEXT_DESCRIPTION = eINSTANCE.getContextProvider__GetContextDescription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.EntityLocker
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getEntityLocker()
		 * @generated
		 */
		EClass ENTITY_LOCKER = eINSTANCE.getEntityLocker();

		/**
		 * The meta object literal for the '<em><b>Get Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_LOCKER___GET_ADDRESS = eINSTANCE.getEntityLocker__GetAddress();

		/**
		 * The meta object literal for the '<em><b>Is Locked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_LOCKER___IS_LOCKED__LOCKTYPE = eINSTANCE.getEntityLocker__IsLocked__LockType();

		/**
		 * The meta object literal for the '<em><b>Lock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_LOCKER___LOCK__LOCKTYPE = eINSTANCE.getEntityLocker__Lock__LockType();

		/**
		 * The meta object literal for the '<em><b>Try Lock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_LOCKER___TRY_LOCK__LONG_LOCKTYPE = eINSTANCE.getEntityLocker__TryLock__long_LockType();

		/**
		 * The meta object literal for the '<em><b>Unlock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_LOCKER___UNLOCK__LOCKTYPE = eINSTANCE.getEntityLocker__Unlock__LockType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.ExceptionManager <em>Exception Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.ExceptionManager
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getExceptionManager()
		 * @generated
		 */
		EClass EXCEPTION_MANAGER = eINSTANCE.getExceptionManager();

		/**
		 * The meta object literal for the '<em><b>Prepare Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM = eINSTANCE.getExceptionManager__PrepareException__ContextProvider_Enum();

		/**
		 * The meta object literal for the '<em><b>Prepare Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT = eINSTANCE.getExceptionManager__PrepareException__ContextProvider_Enum_Object();

		/**
		 * The meta object literal for the '<em><b>Prepare Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT_1 = eINSTANCE.getExceptionManager__PrepareException__ContextProvider_Enum_Object_1();

		/**
		 * The meta object literal for the '<em><b>Prepare Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_STRING_STRING_STRING_OBJECT = eINSTANCE.getExceptionManager__PrepareException__ContextProvider_String_String_String_Object();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.IdentityImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>Get Java Principal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTITY___GET_JAVA_PRINCIPAL = eINSTANCE.getIdentity__GetJavaPrincipal();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.LockManager <em>Lock Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.LockManager
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockManager()
		 * @generated
		 */
		EClass LOCK_MANAGER = eINSTANCE.getLockManager();

		/**
		 * The meta object literal for the '<em><b>Get Locker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_URI = eINSTANCE.getLockManager__GetLocker__ContextProvider_URI();

		/**
		 * The meta object literal for the '<em><b>Get Locker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_ENTITYNAMEABLE = eINSTANCE.getLockManager__GetLocker__ContextProvider_EntityNameable();

		/**
		 * The meta object literal for the '<em><b>Get Concurrent Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCK_MANAGER___GET_CONCURRENT_MAP__CONTEXTPROVIDER_STRING = eINSTANCE.getLockManager__GetConcurrentMap__ContextProvider_String();

		/**
		 * The meta object literal for the '<em><b>Get Queue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCK_MANAGER___GET_QUEUE__CONTEXTPROVIDER_STRING = eINSTANCE.getLockManager__GetQueue__ContextProvider_String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.Logger <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.Logger
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___DEBUG__STRING = eINSTANCE.getLogger__Debug__String();

		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___DEBUG__THROWABLE = eINSTANCE.getLogger__Debug__Throwable();

		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___DEBUG__STRING_THROWABLE = eINSTANCE.getLogger__Debug__String_Throwable();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___ERROR__STRING = eINSTANCE.getLogger__Error__String();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___ERROR__THROWABLE = eINSTANCE.getLogger__Error__Throwable();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___ERROR__STRING_THROWABLE = eINSTANCE.getLogger__Error__String_Throwable();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___INFO__STRING = eINSTANCE.getLogger__Info__String();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___INFO__THROWABLE = eINSTANCE.getLogger__Info__Throwable();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___INFO__STRING_THROWABLE = eINSTANCE.getLogger__Info__String_Throwable();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___WARNING__STRING = eINSTANCE.getLogger__Warning__String();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___WARNING__THROWABLE = eINSTANCE.getLogger__Warning__Throwable();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___WARNING__STRING_THROWABLE = eINSTANCE.getLogger__Warning__String_Throwable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.MessageDescriptionImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDescription()
		 * @generated
		 */
		EClass MESSAGE_DESCRIPTION = eINSTANCE.getMessageDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__NAME = eINSTANCE.getMessageDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__SEVERITY = eINSTANCE.getMessageDescription_Severity();

		/**
		 * The meta object literal for the '<em><b>Message Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_HELP = eINSTANCE.getMessageDescription_MessageHelp();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_TEXT = eINSTANCE.getMessageDescription_MessageText();

		/**
		 * The meta object literal for the '<em><b>Message Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = eINSTANCE.getMessageDescription_MessageDataFields();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.MessageDataFieldImpl <em>Message Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.MessageDataFieldImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDataField()
		 * @generated
		 */
		EClass MESSAGE_DATA_FIELD = eINSTANCE.getMessageDataField();

		/**
		 * The meta object literal for the '<em><b>Output Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA_FIELD__OUTPUT_MASK = eINSTANCE.getMessageDataField_OutputMask();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DATA_FIELD__DEFINITION = eINSTANCE.getMessageDataField_Definition();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.MessageFileImpl <em>Message File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.MessageFileImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageFile()
		 * @generated
		 */
		EClass MESSAGE_FILE = eINSTANCE.getMessageFile();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FILE__MESSAGES = eINSTANCE.getMessageFile_Messages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_FILE__NAME = eINSTANCE.getMessageFile_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_FILE__TEXT = eINSTANCE.getMessageFile_Text();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_FILE___LOOKUP__STRING = eINSTANCE.getMessageFile__Lookup__String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.Registry <em>Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.Registry
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getRegistry()
		 * @generated
		 */
		EClass REGISTRY = eINSTANCE.getRegistry();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTRY___LOOKUP__STRING = eINSTANCE.getRegistry__Lookup__String();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTRY___LIST = eINSTANCE.getRegistry__List();

		/**
		 * The meta object literal for the '<em><b>Lookup By Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTRY___LOOKUP_BY_PORT__INT = eINSTANCE.getRegistry__LookupByPort__int();

		/**
		 * The meta object literal for the '<em><b>Lookup By Vendor Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTRY___LOOKUP_BY_VENDOR_VERSION__STRING_STRING = eINSTANCE.getRegistry__LookupByVendorVersion__String_String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.RegistryFactory <em>Registry Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.RegistryFactory
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getRegistryFactory()
		 * @generated
		 */
		EClass REGISTRY_FACTORY = eINSTANCE.getRegistryFactory();

		/**
		 * The meta object literal for the '<em><b>Create Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTRY_FACTORY___CREATE_REGISTRY__CLASS = eINSTANCE.getRegistryFactory__CreateRegistry__Class();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.UserProfileImpl <em>User Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.UserProfileImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserProfile()
		 * @generated
		 */
		EClass USER_PROFILE = eINSTANCE.getUserProfile();

		/**
		 * The meta object literal for the '<em><b>Job Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__JOB_DESCRIPTION = eINSTANCE.getUserProfile_JobDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__NAME = eINSTANCE.getUserProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__TEXT = eINSTANCE.getUserProfile_Text();

		/**
		 * The meta object literal for the '<em><b>User Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__USER_CLASS = eINSTANCE.getUserProfile_UserClass();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.CapabilityRight <em>Capability Right</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.CapabilityRight
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapabilityRight()
		 * @generated
		 */
		EEnum CAPABILITY_RIGHT = eINSTANCE.getCapabilityRight();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.LockType <em>Lock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.LockType
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockType()
		 * @generated
		 */
		EEnum LOCK_TYPE = eINSTANCE.getLockType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.context.UserClass <em>User Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.UserClass
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserClass()
		 * @generated
		 */
		EEnum USER_CLASS = eINSTANCE.getUserClass();

		/**
		 * The meta object literal for the '<em>Message Variable List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageVariableList()
		 * @generated
		 */
		EDataType MESSAGE_VARIABLE_LIST = eINSTANCE.getMessageVariableList();

		/**
		 * The meta object literal for the '<em>Message Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.MessageException
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageException()
		 * @generated
		 */
		EDataType MESSAGE_EXCEPTION = eINSTANCE.getMessageException();

	}

} //ContextPackage
