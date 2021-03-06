/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.java.JavaPackage;
import org.abchip.mimo.service.ServicePackage;
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
	int ENTITY = 3;

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
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.DomainImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityContainerImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityContainer()
	 * @generated
	 */
	int ENTITY_CONTAINER = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityIdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityIdentifiableImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIdentifiable()
	 * @generated
	 */
	int ENTITY_IDENTIFIABLE = 7;

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
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FRAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ROUTE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_IDENTIFIABLE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER__CONTENTS = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER__NAME = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityEnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityEnumImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityEnum()
	 * @generated
	 */
	int ENTITY_ENUM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM__NAME = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM__TEXT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityInfoImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityInfo()
	 * @generated
	 */
	int ENTITY_INFO = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__CREATED_STAMP = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__CREATED_TX_STAMP = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__LAST_UPDATED_STAMP = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__LAST_UPDATED_TX_STAMP = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityIterator
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIterator()
	 * @generated
	 */
	int ENTITY_ITERATOR = 8;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR_FEATURE_COUNT = JavaPackage.JAVA_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityTypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityTypedImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityTyped()
	 * @generated
	 */
	int ENTITY_TYPED = 9;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityTypeImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SLOTS = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FindImpl <em>Find</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FindImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFind()
	 * @generated
	 */
	int FIND = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__FRAME = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__FILTER = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__FIELDS = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__ORDER = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__LIMIT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND__PROXY = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Find</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FindResponseImpl <em>Find Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FindResponseImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFindResponse()
	 * @generated
	 */
	int FIND_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_RESPONSE__ENTITIES = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Find Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FrameImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 13;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ABSTRACT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__AUTO_INCREMENT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ako</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__AKO = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ENUM = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__KEYS = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__HAS_TO_STRING = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SLOTS = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Super Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SUPER_NAMES = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TEXT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Text Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TEXT_FORMULA = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.SlotImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 14;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__CARDINALITY = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__CONTAINMENT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DATA_DEF = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DEFAULT_VALUE = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DERIVED = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DOMAIN = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__GROUP = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__KEY = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__TEXT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__TRANSIENT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__TO_STRING = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityState <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityState
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityState()
	 * @generated
	 */
	int ENTITY_STATE = 15;

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
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.abchip.mimo.entity.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Domain#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.entity.Domain#getFrame()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Domain#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see org.abchip.mimo.entity.Domain#getRoute()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Route();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.abchip.mimo.entity.EntityContainer
	 * @generated
	 */
	EClass getEntityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.entity.EntityContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.abchip.mimo.entity.EntityContainer#getContents()
	 * @see #getEntityContainer()
	 * @generated
	 */
	EReference getEntityContainer_Contents();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.EntityContainer#getName()
	 * @see #getEntityContainer()
	 * @generated
	 */
	EAttribute getEntityContainer_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.abchip.mimo.entity.EntityEnum
	 * @generated
	 */
	EClass getEntityEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.EntityEnum#getName()
	 * @see #getEntityEnum()
	 * @generated
	 */
	EAttribute getEntityEnum_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityEnum#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.entity.EntityEnum#getText()
	 * @see #getEntityEnum()
	 * @generated
	 */
	EAttribute getEntityEnum_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see org.abchip.mimo.entity.EntityInfo
	 * @generated
	 */
	EClass getEntityInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityInfo#getCreatedStamp <em>Created Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Stamp</em>'.
	 * @see org.abchip.mimo.entity.EntityInfo#getCreatedStamp()
	 * @see #getEntityInfo()
	 * @generated
	 */
	EAttribute getEntityInfo_CreatedStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityInfo#getCreatedTxStamp <em>Created Tx Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Tx Stamp</em>'.
	 * @see org.abchip.mimo.entity.EntityInfo#getCreatedTxStamp()
	 * @see #getEntityInfo()
	 * @generated
	 */
	EAttribute getEntityInfo_CreatedTxStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedStamp <em>Last Updated Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated Stamp</em>'.
	 * @see org.abchip.mimo.entity.EntityInfo#getLastUpdatedStamp()
	 * @see #getEntityInfo()
	 * @generated
	 */
	EAttribute getEntityInfo_LastUpdatedStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated Tx Stamp</em>'.
	 * @see org.abchip.mimo.entity.EntityInfo#getLastUpdatedTxStamp()
	 * @see #getEntityInfo()
	 * @generated
	 */
	EAttribute getEntityInfo_LastUpdatedTxStamp();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityIdentifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.abchip.mimo.entity.EntityIdentifiable
	 * @generated
	 */
	EClass getEntityIdentifiable();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see org.abchip.mimo.entity.EntityTyped
	 * @generated
	 */
	EClass getEntityTyped();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.entity.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.entity.EntityType#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see org.abchip.mimo.entity.EntityType#getSlots()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Slots();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Find <em>Find</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find</em>'.
	 * @see org.abchip.mimo.entity.Find
	 * @generated
	 */
	EClass getFind();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.entity.Find#getFrame()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.abchip.mimo.entity.Find#getFilter()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fields</em>'.
	 * @see org.abchip.mimo.entity.Find#getFields()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.abchip.mimo.entity.Find#getOrder()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.abchip.mimo.entity.Find#getLimit()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Limit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Find#isProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.abchip.mimo.entity.Find#isProxy()
	 * @see #getFind()
	 * @generated
	 */
	EAttribute getFind_Proxy();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.FindResponse <em>Find Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Response</em>'.
	 * @see org.abchip.mimo.entity.FindResponse
	 * @generated
	 */
	EClass getFindResponse();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.entity.FindResponse#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.abchip.mimo.entity.FindResponse#getEntities()
	 * @see #getFindResponse()
	 * @generated
	 */
	EReference getFindResponse_Entities();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.abchip.mimo.entity.Frame#isAbstract()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#isAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see org.abchip.mimo.entity.Frame#isAutoIncrement()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_AutoIncrement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.entity.Frame#getAko <em>Ako</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ako</em>'.
	 * @see org.abchip.mimo.entity.Frame#getAko()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Ako();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#isEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see org.abchip.mimo.entity.Frame#isEnum()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Enum();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.entity.Frame#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see org.abchip.mimo.entity.Frame#getKeys()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Keys();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#isHasToString <em>Has To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has To String</em>'.
	 * @see org.abchip.mimo.entity.Frame#isHasToString()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_HasToString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.Frame#getName()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.entity.Frame#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see org.abchip.mimo.entity.Frame#getSlots()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Slots();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.entity.Frame#getSuperNames <em>Super Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Super Names</em>'.
	 * @see org.abchip.mimo.entity.Frame#getSuperNames()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_SuperNames();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.entity.Frame#getText()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#getTextFormula <em>Text Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Formula</em>'.
	 * @see org.abchip.mimo.entity.Frame#getTextFormula()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_TextFormula();

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
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.entity.Slot#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.abchip.mimo.entity.Slot#getCardinality()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.abchip.mimo.entity.Slot#isContainment()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Containment();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.entity.Slot#getDataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Def</em>'.
	 * @see org.abchip.mimo.entity.Slot#getDataDef()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_DataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.abchip.mimo.entity.Slot#getDefaultValue()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.abchip.mimo.entity.Slot#isDerived()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Derived();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.entity.Slot#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.entity.Slot#getDomain()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.abchip.mimo.entity.Slot#getGroup()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.abchip.mimo.entity.Slot#isKey()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.entity.Slot#getName()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.entity.Slot#getText()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.abchip.mimo.entity.Slot#isTransient()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isToString <em>To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To String</em>'.
	 * @see org.abchip.mimo.entity.Slot#isToString()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_ToString();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.entity.EntityState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see org.abchip.mimo.entity.EntityState
	 * @generated
	 */
	EEnum getEntityState();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.DomainImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__FRAME = eINSTANCE.getDomain_Frame();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__ROUTE = eINSTANCE.getDomain_Route();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityContainerImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityContainer()
		 * @generated
		 */
		EClass ENTITY_CONTAINER = eINSTANCE.getEntityContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONTAINER__CONTENTS = eINSTANCE.getEntityContainer_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CONTAINER__NAME = eINSTANCE.getEntityContainer_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityEnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityEnumImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityEnum()
		 * @generated
		 */
		EClass ENTITY_ENUM = eINSTANCE.getEntityEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ENUM__NAME = eINSTANCE.getEntityEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ENUM__TEXT = eINSTANCE.getEntityEnum_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityInfoImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityInfo()
		 * @generated
		 */
		EClass ENTITY_INFO = eINSTANCE.getEntityInfo();

		/**
		 * The meta object literal for the '<em><b>Created Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_INFO__CREATED_STAMP = eINSTANCE.getEntityInfo_CreatedStamp();

		/**
		 * The meta object literal for the '<em><b>Created Tx Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_INFO__CREATED_TX_STAMP = eINSTANCE.getEntityInfo_CreatedTxStamp();

		/**
		 * The meta object literal for the '<em><b>Last Updated Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_INFO__LAST_UPDATED_STAMP = eINSTANCE.getEntityInfo_LastUpdatedStamp();

		/**
		 * The meta object literal for the '<em><b>Last Updated Tx Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_INFO__LAST_UPDATED_TX_STAMP = eINSTANCE.getEntityInfo_LastUpdatedTxStamp();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityIdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityIdentifiableImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIdentifiable()
		 * @generated
		 */
		EClass ENTITY_IDENTIFIABLE = eINSTANCE.getEntityIdentifiable();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityTypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityTypedImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityTyped()
		 * @generated
		 */
		EClass ENTITY_TYPED = eINSTANCE.getEntityTyped();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.EntityTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.EntityTypeImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SLOTS = eINSTANCE.getEntityType_Slots();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.FindImpl <em>Find</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.FindImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFind()
		 * @generated
		 */
		EClass FIND = eINSTANCE.getFind();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__FRAME = eINSTANCE.getFind_Frame();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__FILTER = eINSTANCE.getFind_Filter();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__FIELDS = eINSTANCE.getFind_Fields();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__ORDER = eINSTANCE.getFind_Order();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__LIMIT = eINSTANCE.getFind_Limit();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND__PROXY = eINSTANCE.getFind_Proxy();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.FindResponseImpl <em>Find Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.FindResponseImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFindResponse()
		 * @generated
		 */
		EClass FIND_RESPONSE = eINSTANCE.getFindResponse();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_RESPONSE__ENTITIES = eINSTANCE.getFindResponse_Entities();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.FrameImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__ABSTRACT = eINSTANCE.getFrame_Abstract();

		/**
		 * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__AUTO_INCREMENT = eINSTANCE.getFrame_AutoIncrement();

		/**
		 * The meta object literal for the '<em><b>Ako</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__AKO = eINSTANCE.getFrame_Ako();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__ENUM = eINSTANCE.getFrame_Enum();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__KEYS = eINSTANCE.getFrame_Keys();

		/**
		 * The meta object literal for the '<em><b>Has To String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__HAS_TO_STRING = eINSTANCE.getFrame_HasToString();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__NAME = eINSTANCE.getFrame_Name();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__SLOTS = eINSTANCE.getFrame_Slots();

		/**
		 * The meta object literal for the '<em><b>Super Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SUPER_NAMES = eINSTANCE.getFrame_SuperNames();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__TEXT = eINSTANCE.getFrame_Text();

		/**
		 * The meta object literal for the '<em><b>Text Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__TEXT_FORMULA = eINSTANCE.getFrame_TextFormula();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.impl.SlotImpl
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__CARDINALITY = eINSTANCE.getSlot_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__CONTAINMENT = eINSTANCE.getSlot_Containment();

		/**
		 * The meta object literal for the '<em><b>Data Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__DATA_DEF = eINSTANCE.getSlot_DataDef();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__DEFAULT_VALUE = eINSTANCE.getSlot_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__DERIVED = eINSTANCE.getSlot_Derived();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__DOMAIN = eINSTANCE.getSlot_Domain();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__GROUP = eINSTANCE.getSlot_Group();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__KEY = eINSTANCE.getSlot_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__NAME = eINSTANCE.getSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__TEXT = eINSTANCE.getSlot_Text();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__TRANSIENT = eINSTANCE.getSlot_Transient();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__TO_STRING = eINSTANCE.getSlot_ToString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.entity.EntityState <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.EntityState
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityState()
		 * @generated
		 */
		EEnum ENTITY_STATE = eINSTANCE.getEntityState();

	}

} //EntityPackage
