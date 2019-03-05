/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.util.UtilPackage;
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
 * @see org.abchip.mimo.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-ent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityPackage eINSTANCE = org.abchip.mimo.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.CardinalityImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MAX = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MIN = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.DefaultImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT__VALUE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT__VALUES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityIterator
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIterator()
	 * @generated
	 */
	int ENTITY_ITERATOR = 3;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR_FEATURE_COUNT = UtilPackage.JAVA_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityNameableImpl <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityNameableImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityNameable()
	 * @generated
	 */
	int ENTITY_NAMEABLE = 4;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityReaderImpl <em>Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityReaderImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityReader()
	 * @generated
	 */
	int ENTITY_READER = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityWriter <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityWriter
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityWriter()
	 * @generated
	 */
	int ENTITY_WRITER = 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FacetImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Frame <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Frame
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.FrameManager <em>Frame Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.FrameManager
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrameManager()
	 * @generated
	 */
	int FRAME_MANAGER = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Nameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Nameable
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.ResourceImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceEvent <em>Resource Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceEvent
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceListener <em>Resource Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceListener
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceListener()
	 * @generated
	 */
	int RESOURCE_LISTENER = 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceManager <em>Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceManager
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.ResourceNotifierImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceNotifier()
	 * @generated
	 */
	int RESOURCE_NOTIFIER = 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityProviderImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityProvider()
	 * @generated
	 */
	int ENTITY_PROVIDER = 5;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityProviderRegistry <em>Provider Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityProviderRegistry
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityProviderRegistry()
	 * @generated
	 */
	int ENTITY_PROVIDER_REGISTRY = 6;

	/**
	 * The number of structural features of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PROVIDER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_READER__CONTEXT_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_READER__NOTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_READER__FRAME = 2;

	/**
	 * The number of structural features of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_READER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_WRITER__CONTEXT_PROVIDER = ENTITY_READER__CONTEXT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_WRITER__NOTIFIER = ENTITY_READER__NOTIFIER;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_WRITER__FRAME = ENTITY_READER__FRAME;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_WRITER_FEATURE_COUNT = ENTITY_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Frame Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TEXT = ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Resource Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = ENTITY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.ResourceSerializerImpl <em>Resource Serializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.ResourceSerializerImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceSerializer()
	 * @generated
	 */
	int RESOURCE_SERIALIZER = 18;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER__CONTEXT_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER__FRAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource Serializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERIALIZER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Slot <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Slot
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 19;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Textable
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getTextable()
	 * @generated
	 */
	int TEXTABLE = 20;

	/**
	 * The number of structural features of the '<em>Textable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceEventType <em>Resource Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceEventType
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceScope <em>Resource Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceScope
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceScope()
	 * @generated
	 */
	int RESOURCE_SCOPE = 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.ResourceType
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 23;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.SerializationType <em>Serialization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.SerializationType
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSerializationType()
	 * @generated
	 */
	int SERIALIZATION_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.abchip.mimo.entity.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Cardinality#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.abchip.mimo.entity.Cardinality#getMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Cardinality#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.abchip.mimo.entity.Cardinality#getMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Min();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default</em>'.
	 * @see org.abchip.mimo.entity.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Default#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.abchip.mimo.entity.Default#getValue()
	 * @see #getDefault()
	 * @generated
	 */
	EAttribute getDefault_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.entity.Default#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.abchip.mimo.entity.Default#getValues()
	 * @see #getDefault()
	 * @generated
	 */
	EAttribute getDefault_Values();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.abchip.mimo.entity.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see org.abchip.mimo.entity.EntityIterator
	 * @generated
	 */
	EClass getEntityIterator();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityNameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.abchip.mimo.entity.EntityNameable
	 * @generated
	 */
	EClass getEntityNameable();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reader</em>'.
	 * @see org.abchip.mimo.entity.EntityReader
	 * @generated
	 */
	EClass getEntityReader();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.EntityReader#getContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Provider</em>'.
	 * @see org.abchip.mimo.entity.EntityReader#getContextProvider()
	 * @see #getEntityReader()
	 * @generated
	 */
	EReference getEntityReader_ContextProvider();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.EntityReader#getNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notifier</em>'.
	 * @see org.abchip.mimo.entity.EntityReader#getNotifier()
	 * @see #getEntityReader()
	 * @generated
	 */
	EReference getEntityReader_Notifier();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.EntityReader#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frame</em>'.
	 * @see org.abchip.mimo.entity.EntityReader#getFrame()
	 * @see #getEntityReader()
	 * @generated
	 */
	EReference getEntityReader_Frame();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.abchip.mimo.entity.EntityWriter
	 * @generated
	 */
	EClass getEntityWriter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see org.abchip.mimo.entity.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.abchip.mimo.entity.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.FrameManager <em>Frame Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Manager</em>'.
	 * @see org.abchip.mimo.entity.FrameManager
	 * @generated
	 */
	EClass getFrameManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.abchip.mimo.entity.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.abchip.mimo.entity.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Resource#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.entity.Resource#getText()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.ResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Event</em>'.
	 * @see org.abchip.mimo.entity.ResourceEvent
	 * @generated
	 */
	EClass getResourceEvent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.ResourceListener <em>Resource Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Listener</em>'.
	 * @see org.abchip.mimo.entity.ResourceListener
	 * @generated
	 */
	EClass getResourceListener();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.ResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Manager</em>'.
	 * @see org.abchip.mimo.entity.ResourceManager
	 * @generated
	 */
	EClass getResourceManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.ResourceNotifier <em>Resource Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Notifier</em>'.
	 * @see org.abchip.mimo.entity.ResourceNotifier
	 * @generated
	 */
	EClass getResourceNotifier();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.ResourceSerializer <em>Resource Serializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Serializer</em>'.
	 * @see org.abchip.mimo.entity.ResourceSerializer
	 * @generated
	 */
	EClass getResourceSerializer();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.ResourceSerializer#getContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Provider</em>'.
	 * @see org.abchip.mimo.entity.ResourceSerializer#getContextProvider()
	 * @see #getResourceSerializer()
	 * @generated
	 */
	EReference getResourceSerializer_ContextProvider();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.ResourceSerializer#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frame</em>'.
	 * @see org.abchip.mimo.entity.ResourceSerializer#getFrame()
	 * @see #getResourceSerializer()
	 * @generated
	 */
	EReference getResourceSerializer_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.ResourceSerializer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.ResourceSerializer#getName()
	 * @see #getResourceSerializer()
	 * @generated
	 */
	EAttribute getResourceSerializer_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.abchip.mimo.entity.EntityProvider
	 * @generated
	 */
	EClass getEntityProvider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityProviderRegistry <em>Provider Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Registry</em>'.
	 * @see org.abchip.mimo.entity.EntityProviderRegistry
	 * @generated
	 */
	EClass getEntityProviderRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see org.abchip.mimo.entity.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textable</em>'.
	 * @see org.abchip.mimo.entity.Textable
	 * @generated
	 */
	EClass getTextable();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.entity.ResourceEventType <em>Resource Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Event Type</em>'.
	 * @see org.abchip.mimo.entity.ResourceEventType
	 * @generated
	 */
	EEnum getResourceEventType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.entity.ResourceScope <em>Resource Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Scope</em>'.
	 * @see org.abchip.mimo.entity.ResourceScope
	 * @generated
	 */
	EEnum getResourceScope();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.entity.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.abchip.mimo.entity.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.entity.SerializationType <em>Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Serialization Type</em>'.
	 * @see org.abchip.mimo.entity.SerializationType
	 * @generated
	 */
	EEnum getSerializationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityFactory getEntityFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.CardinalityImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MAX = eINSTANCE.getCardinality_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MIN = eINSTANCE.getCardinality_Min();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.DefaultImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT__VALUE = eINSTANCE.getDefault_Value();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT__VALUES = eINSTANCE.getDefault_Values();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.EntityIterator
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIterator()
		 * @generated
		 */
		EClass ENTITY_ITERATOR = eINSTANCE.getEntityIterator();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityNameableImpl <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityNameableImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityNameable()
		 * @generated
		 */
		EClass ENTITY_NAMEABLE = eINSTANCE.getEntityNameable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityReaderImpl <em>Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityReaderImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityReader()
		 * @generated
		 */
		EClass ENTITY_READER = eINSTANCE.getEntityReader();

		/**
		 * The meta object literal for the '<em><b>Context Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_READER__CONTEXT_PROVIDER = eINSTANCE.getEntityReader_ContextProvider();

		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_READER__NOTIFIER = eINSTANCE.getEntityReader_Notifier();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_READER__FRAME = eINSTANCE.getEntityReader_Frame();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.EntityWriter <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.EntityWriter
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityWriter()
		 * @generated
		 */
		EClass ENTITY_WRITER = eINSTANCE.getEntityWriter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.FacetImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.Frame <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.Frame
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.FrameManager <em>Frame Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.FrameManager
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrameManager()
		 * @generated
		 */
		EClass FRAME_MANAGER = eINSTANCE.getFrameManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.Nameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.Nameable
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.ResourceImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TEXT = eINSTANCE.getResource_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceEvent <em>Resource Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceEvent
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceEvent()
		 * @generated
		 */
		EClass RESOURCE_EVENT = eINSTANCE.getResourceEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceListener <em>Resource Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceListener
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceListener()
		 * @generated
		 */
		EClass RESOURCE_LISTENER = eINSTANCE.getResourceListener();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceManager <em>Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceManager
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceManager()
		 * @generated
		 */
		EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.ResourceNotifierImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceNotifier()
		 * @generated
		 */
		EClass RESOURCE_NOTIFIER = eINSTANCE.getResourceNotifier();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.ResourceSerializerImpl <em>Resource Serializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.ResourceSerializerImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceSerializer()
		 * @generated
		 */
		EClass RESOURCE_SERIALIZER = eINSTANCE.getResourceSerializer();

		/**
		 * The meta object literal for the '<em><b>Context Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERIALIZER__CONTEXT_PROVIDER = eINSTANCE.getResourceSerializer_ContextProvider();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERIALIZER__FRAME = eINSTANCE.getResourceSerializer_Frame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SERIALIZER__NAME = eINSTANCE.getResourceSerializer_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityProviderImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityProvider()
		 * @generated
		 */
		EClass ENTITY_PROVIDER = eINSTANCE.getEntityProvider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.EntityProviderRegistry <em>Provider Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.EntityProviderRegistry
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityProviderRegistry()
		 * @generated
		 */
		EClass ENTITY_PROVIDER_REGISTRY = eINSTANCE.getEntityProviderRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.Slot <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.Slot
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.Textable
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getTextable()
		 * @generated
		 */
		EClass TEXTABLE = eINSTANCE.getTextable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceEventType <em>Resource Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceEventType
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceEventType()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_TYPE = eINSTANCE.getResourceEventType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceScope <em>Resource Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceScope
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceScope()
		 * @generated
		 */
		EEnum RESOURCE_SCOPE = eINSTANCE.getResourceScope();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.ResourceType
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.SerializationType <em>Serialization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.SerializationType
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSerializationType()
		 * @generated
		 */
		EEnum SERIALIZATION_TYPE = eINSTANCE.getSerializationType();

	}

} //EntityPackage
