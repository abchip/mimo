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
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceDriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceDriverImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceDriver()
	 * @generated
	 */
	int RESOURCE_DRIVER = 0;

	/**
	 * The feature id for the '<em><b>Resource Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DRIVER__RESOURCE_CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DRIVER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.resource.impl.ResourceDriverConfigImpl <em>Driver Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.impl.ResourceDriverConfigImpl
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceDriverConfig()
	 * @generated
	 */
	int RESOURCE_DRIVER_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Lock Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DRIVER_CONFIG__PAGE_SIZE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driver Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DRIVER_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.abchip.mimo.resource.ResourceEventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.resource.ResourceEventType
	 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.abchip.mimo.resource.ResourceDriver
	 * @generated
	 */
	EClass getResourceDriver();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.resource.ResourceDriver#getResourceConfig <em>Resource Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Config</em>'.
	 * @see org.abchip.mimo.resource.ResourceDriver#getResourceConfig()
	 * @see #getResourceDriver()
	 * @generated
	 */
	EReference getResourceDriver_ResourceConfig();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.resource.ResourceDriverConfig <em>Driver Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Config</em>'.
	 * @see org.abchip.mimo.resource.ResourceDriverConfig
	 * @generated
	 */
	EClass getResourceDriverConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceDriverConfig#isLockSupport <em>Lock Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Support</em>'.
	 * @see org.abchip.mimo.resource.ResourceDriverConfig#isLockSupport()
	 * @see #getResourceDriverConfig()
	 * @generated
	 */
	EAttribute getResourceDriverConfig_LockSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.resource.ResourceDriverConfig#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see org.abchip.mimo.resource.ResourceDriverConfig#getPageSize()
	 * @see #getResourceDriverConfig()
	 * @generated
	 */
	EAttribute getResourceDriverConfig_PageSize();

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
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceDriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceDriverImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceDriver()
		 * @generated
		 */
		EClass RESOURCE_DRIVER = eINSTANCE.getResourceDriver();

		/**
		 * The meta object literal for the '<em><b>Resource Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DRIVER__RESOURCE_CONFIG = eINSTANCE.getResourceDriver_ResourceConfig();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.resource.impl.ResourceDriverConfigImpl <em>Driver Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.resource.impl.ResourceDriverConfigImpl
		 * @see org.abchip.mimo.resource.impl.ResourcePackageImpl#getResourceDriverConfig()
		 * @generated
		 */
		EClass RESOURCE_DRIVER_CONFIG = eINSTANCE.getResourceDriverConfig();

		/**
		 * The meta object literal for the '<em><b>Lock Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT = eINSTANCE.getResourceDriverConfig_LockSupport();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DRIVER_CONFIG__PAGE_SIZE = eINSTANCE.getResourceDriverConfig_PageSize();

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

	}

} //ResourcePackage
