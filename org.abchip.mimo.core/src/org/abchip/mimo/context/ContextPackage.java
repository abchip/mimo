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
package org.abchip.mimo.context;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.util.UtilPackage;
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
	 * The number of structural features of the '<em>Authentication User Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.CapabilityImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 4;

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
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = UtilPackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.ContextDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextDescriptionImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextDescription()
	 * @generated
	 */
	int CONTEXT_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Resource Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__RESOURCE_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Resource Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY = 3;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.ContextProvider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.ContextProvider
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 7;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.EntityLocker
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getEntityLocker()
	 * @generated
	 */
	int ENTITY_LOCKER = 8;

	/**
	 * The number of structural features of the '<em>Entity Locker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LOCKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.ExceptionManager <em>Exception Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.ExceptionManager
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getExceptionManager()
	 * @generated
	 */
	int EXCEPTION_MANAGER = 9;

	/**
	 * The number of structural features of the '<em>Exception Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.IdentityImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 10;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.LockManager <em>Lock Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.LockManager
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockManager()
	 * @generated
	 */
	int LOCK_MANAGER = 11;

	/**
	 * The number of structural features of the '<em>Lock Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.Logger <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.Logger
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 12;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageDescriptionImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDescription()
	 * @generated
	 */
	int MESSAGE_DESCRIPTION = 13;

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
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageDataFieldImpl <em>Message Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageDataFieldImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageDataField()
	 * @generated
	 */
	int MESSAGE_DATA_FIELD = 14;

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
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.MessageFileImpl <em>Message File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.MessageFileImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageFile()
	 * @generated
	 */
	int MESSAGE_FILE = 15;

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
	 * The meta object id for the '{@link org.abchip.mimo.context.impl.UserProfileImpl <em>User Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.UserProfileImpl
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserProfile()
	 * @generated
	 */
	int USER_PROFILE = 16;

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
	 * The meta object id for the '{@link org.abchip.mimo.context.CapabilityRight <em>Capability Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.CapabilityRight
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getCapabilityRight()
	 * @generated
	 */
	int CAPABILITY_RIGHT = 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.LockType <em>Lock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.LockType
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLockType()
	 * @generated
	 */
	int LOCK_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.context.UserClass <em>User Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.UserClass
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getUserClass()
	 * @generated
	 */
	int USER_CLASS = 19;

	/**
	 * The meta object id for the '<em>Message Variable List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageVariableList()
	 * @generated
	 */
	int MESSAGE_VARIABLE_LIST = 20;

	/**
	 * The meta object id for the '<em>Message Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.context.MessageException
	 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getMessageException()
	 * @generated
	 */
	int MESSAGE_EXCEPTION = 21;


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
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.abchip.mimo.context.Context
	 * @generated
	 */
	EClass getContext();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getName()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.context.ContextDescription#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getResources()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_Resources();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getResourceRoot <em>Resource Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Root</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getResourceRoot()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_ResourceRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.context.ContextDescription#getResourceTemporary <em>Resource Temporary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Temporary</em>'.
	 * @see org.abchip.mimo.context.ContextDescription#getResourceTemporary()
	 * @see #getContextDescription()
	 * @generated
	 */
	EAttribute getContextDescription_ResourceTemporary();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Locker</em>'.
	 * @see org.abchip.mimo.context.EntityLocker
	 * @generated
	 */
	EClass getEntityLocker();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.abchip.mimo.context.Identity
	 * @generated
	 */
	EClass getIdentity();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.context.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.abchip.mimo.context.Logger
	 * @generated
	 */
	EClass getLogger();

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
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.ContextImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__NAME = eINSTANCE.getContextDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__RESOURCES = eINSTANCE.getContextDescription_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__RESOURCE_ROOT = eINSTANCE.getContextDescription_ResourceRoot();

		/**
		 * The meta object literal for the '<em><b>Resource Temporary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY = eINSTANCE.getContextDescription_ResourceTemporary();

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
		 * The meta object literal for the '{@link org.abchip.mimo.context.EntityLocker <em>Entity Locker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.EntityLocker
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getEntityLocker()
		 * @generated
		 */
		EClass ENTITY_LOCKER = eINSTANCE.getEntityLocker();

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
		 * The meta object literal for the '{@link org.abchip.mimo.context.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.impl.IdentityImpl
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

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
		 * The meta object literal for the '{@link org.abchip.mimo.context.Logger <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.context.Logger
		 * @see org.abchip.mimo.context.impl.ContextPackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

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
