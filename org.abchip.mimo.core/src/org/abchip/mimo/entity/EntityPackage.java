/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.util.UtilPackage;
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
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ISA = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY___ISA = ENTITY___ISA;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY___IS_MANDATORY = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Multiple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY___IS_MULTIPLE = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT___ISA = ENTITY___ISA;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT___CLEAR = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT___IS_EMPTY = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ISA = ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER__CONTENTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER__NAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER___ISA = ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTAINER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityInfoImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityInfo()
	 * @generated
	 */
	int ENTITY_INFO = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__CREATED_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__CREATED_TX_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__LAST_UPDATED_STAMP = 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO__LAST_UPDATED_TX_STAMP = 3;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.EntityIterator
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIterator()
	 * @generated
	 */
	int ENTITY_ITERATOR = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityNameableImpl <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityNameableImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityNameable()
	 * @generated
	 */
	int ENTITY_NAMEABLE = 8;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE___ISA = ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE___GET_NAME = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE___GET_URI = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE___IS_PROXY = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAMEABLE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.EntityEnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.EntityEnumImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityEnum()
	 * @generated
	 */
	int ENTITY_ENUM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM__NAME = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM__TEXT = ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM___ISA = ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM___GET_NAME = ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM___GET_URI = ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM___IS_PROXY = ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM___GET_TEXT = ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENUM_OPERATION_COUNT = ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR_FEATURE_COUNT = UtilPackage.JAVA_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR___HAS_NEXT = UtilPackage.JAVA_ITERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR___NEXT = UtilPackage.JAVA_ITERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR___REMOVE = UtilPackage.JAVA_ITERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ITERATOR_OPERATION_COUNT = UtilPackage.JAVA_ITERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FacetImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.FrameImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.FrameManager <em>Frame Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.FrameManager
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getFrameManager()
	 * @generated
	 */
	int FRAME_MANAGER = 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Nameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Nameable
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 14;

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
	int ENTITY_TYPED_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED___ISA = ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED___GET_NAME = ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED___GET_URI = ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED___IS_PROXY = ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED___GET_TYPE = ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPED_OPERATION_COUNT = ENTITY_NAMEABLE_OPERATION_COUNT + 1;

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
	int ENTITY_TYPE__SLOTS = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___ISA = ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_NAME = ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_URI = ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___IS_PROXY = ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_FRAME = ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_TYPE_ID = ENTITY_NAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___HAS_TABLE = ENTITY_NAMEABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_TEXT = ENTITY_NAMEABLE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = ENTITY_NAMEABLE_OPERATION_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET___ISA = ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ABSTRACT = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__AUTO_INCREMENT = ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__KEYS = ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SLOTS = ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slots Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SLOTS_NUMBER = ENTITY_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Routes Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ROUTES_NUMBER = ENTITY_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Super Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SUPER_NAMES = ENTITY_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TEXT_FORMULA = ENTITY_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___ISA = ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___GET_NAME = ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___GET_URI = ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___IS_PROXY = ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Ako</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___AKO = ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___CREATE_ENTITY = ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___GET_SLOT__STRING = ENTITY_NAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super Frames</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___GET_SUPER_FRAMES = ENTITY_NAMEABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___GET_VALUE__ENTITY_STRING_BOOLEAN = ENTITY_NAMEABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___SET_VALUE__ENTITY_STRING_OBJECT = ENTITY_NAMEABLE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = ENTITY_NAMEABLE_OPERATION_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Frame Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER___CREATE_PROXY__FRAME_STRING = 0;

	/**
	 * The operation id for the '<em>Create Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER___CREATE_PROXY__CLASS_STRING = 1;

	/**
	 * The operation id for the '<em>Get Frame Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER___GET_FRAME_READER__CONTEXTPROVIDER = 2;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER___GET_FRAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER___GET_FRAME__CLASS = 4;

	/**
	 * The number of operations of the '<em>Frame Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE___GET_NAME = 0;

	/**
	 * The number of operations of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.impl.SlotImpl
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 15;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__CARDINALITY = ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__CONTAINMENT = ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DEFAULT_VALUE = ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DERIVED = ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DOMAIN = ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__GROUP = ENTITY_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__KEY = ENTITY_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = ENTITY_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ROUTE = ENTITY_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__TEXT = ENTITY_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = ENTITY_NAMEABLE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___ISA = ENTITY_NAMEABLE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___GET_NAME = ENTITY_NAMEABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___GET_URI = ENTITY_NAMEABLE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_PROXY = ENTITY_NAMEABLE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___GET_TEXT = ENTITY_NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___GET_VALUE__STRING = ENTITY_NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_BOOLEAN = ENTITY_NAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_DATE = ENTITY_NAMEABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_ENUM = ENTITY_NAMEABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_NUMERIC = ENTITY_NAMEABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___IS_STRING = ENTITY_NAMEABLE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = ENTITY_NAMEABLE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.Textable
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getTextable()
	 * @generated
	 */
	int TEXTABLE = 16;

	/**
	 * The number of structural features of the '<em>Textable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTABLE___GET_TEXT = 0;

	/**
	 * The number of operations of the '<em>Textable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.entity.SerializationType <em>Serialization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.entity.SerializationType
	 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getSerializationType()
	 * @generated
	 */
	int SERIALIZATION_TYPE = 17;


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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Cardinality#isMandatory() <em>Is Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mandatory</em>' operation.
	 * @see org.abchip.mimo.entity.Cardinality#isMandatory()
	 * @generated
	 */
	EOperation getCardinality__IsMandatory();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Cardinality#isMultiple() <em>Is Multiple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiple</em>' operation.
	 * @see org.abchip.mimo.entity.Cardinality#isMultiple()
	 * @generated
	 */
	EOperation getCardinality__IsMultiple();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Default#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see org.abchip.mimo.entity.Default#clear()
	 * @generated
	 */
	EOperation getDefault__Clear();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Default#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.abchip.mimo.entity.Default#isEmpty()
	 * @generated
	 */
	EOperation getDefault__IsEmpty();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Entity#isa() <em>Isa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Isa</em>' operation.
	 * @see org.abchip.mimo.entity.Entity#isa()
	 * @generated
	 */
	EOperation getEntity__Isa();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see org.abchip.mimo.entity.EntityIterator
	 * @generated
	 */
	EClass getEntityIterator();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityIterator#hasNext() <em>Has Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Next</em>' operation.
	 * @see org.abchip.mimo.entity.EntityIterator#hasNext()
	 * @generated
	 */
	EOperation getEntityIterator__HasNext();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityIterator#next() <em>Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Next</em>' operation.
	 * @see org.abchip.mimo.entity.EntityIterator#next()
	 * @generated
	 */
	EOperation getEntityIterator__Next();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityIterator#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.abchip.mimo.entity.EntityIterator#remove()
	 * @generated
	 */
	EOperation getEntityIterator__Remove();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityNameable#getURI() <em>Get URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get URI</em>' operation.
	 * @see org.abchip.mimo.entity.EntityNameable#getURI()
	 * @generated
	 */
	EOperation getEntityNameable__GetURI();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityNameable#isProxy() <em>Is Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Proxy</em>' operation.
	 * @see org.abchip.mimo.entity.EntityNameable#isProxy()
	 * @generated
	 */
	EOperation getEntityNameable__IsProxy();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityTyped#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.abchip.mimo.entity.EntityTyped#getType()
	 * @generated
	 */
	EOperation getEntityTyped__GetType();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityType#getFrame() <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see org.abchip.mimo.entity.EntityType#getFrame()
	 * @generated
	 */
	EOperation getEntityType__GetFrame();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityType#getTypeId() <em>Get Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Id</em>' operation.
	 * @see org.abchip.mimo.entity.EntityType#getTypeId()
	 * @generated
	 */
	EOperation getEntityType__GetTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityType#hasTable() <em>Has Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Table</em>' operation.
	 * @see org.abchip.mimo.entity.EntityType#hasTable()
	 * @generated
	 */
	EOperation getEntityType__HasTable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.EntityType#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see org.abchip.mimo.entity.EntityType#getText()
	 * @generated
	 */
	EOperation getEntityType__GetText();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#getSlotsNumber <em>Slots Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slots Number</em>'.
	 * @see org.abchip.mimo.entity.Frame#getSlotsNumber()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_SlotsNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Frame#getRoutesNumber <em>Routes Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routes Number</em>'.
	 * @see org.abchip.mimo.entity.Frame#getRoutesNumber()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_RoutesNumber();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#ako() <em>Ako</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ako</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#ako()
	 * @generated
	 */
	EOperation getFrame__Ako();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#createEntity() <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#createEntity()
	 * @generated
	 */
	EOperation getFrame__CreateEntity();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#getSlot(java.lang.String) <em>Get Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slot</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#getSlot(java.lang.String)
	 * @generated
	 */
	EOperation getFrame__GetSlot__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#getSuperFrames() <em>Get Super Frames</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super Frames</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#getSuperFrames()
	 * @generated
	 */
	EOperation getFrame__GetSuperFrames();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#getValue(org.abchip.mimo.entity.Entity, java.lang.String, boolean) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#getValue(org.abchip.mimo.entity.Entity, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getFrame__GetValue__Entity_String_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Frame#setValue(org.abchip.mimo.entity.Entity, java.lang.String, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see org.abchip.mimo.entity.Frame#setValue(org.abchip.mimo.entity.Entity, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getFrame__SetValue__Entity_String_Object();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.FrameManager#createProxy(org.abchip.mimo.entity.Frame, java.lang.String) <em>Create Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proxy</em>' operation.
	 * @see org.abchip.mimo.entity.FrameManager#createProxy(org.abchip.mimo.entity.Frame, java.lang.String)
	 * @generated
	 */
	EOperation getFrameManager__CreateProxy__Frame_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.FrameManager#createProxy(java.lang.Class, java.lang.String) <em>Create Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proxy</em>' operation.
	 * @see org.abchip.mimo.entity.FrameManager#createProxy(java.lang.Class, java.lang.String)
	 * @generated
	 */
	EOperation getFrameManager__CreateProxy__Class_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.FrameManager#getFrameReader(org.abchip.mimo.context.ContextProvider) <em>Get Frame Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame Reader</em>' operation.
	 * @see org.abchip.mimo.entity.FrameManager#getFrameReader(org.abchip.mimo.context.ContextProvider)
	 * @generated
	 */
	EOperation getFrameManager__GetFrameReader__ContextProvider();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.FrameManager#getFrame(java.lang.String) <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see org.abchip.mimo.entity.FrameManager#getFrame(java.lang.String)
	 * @generated
	 */
	EOperation getFrameManager__GetFrame__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.FrameManager#getFrame(java.lang.Class) <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see org.abchip.mimo.entity.FrameManager#getFrame(java.lang.Class)
	 * @generated
	 */
	EOperation getFrameManager__GetFrame__Class();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Nameable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see org.abchip.mimo.entity.Nameable#getName()
	 * @generated
	 */
	EOperation getNameable__GetName();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.entity.Slot#isRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see org.abchip.mimo.entity.Slot#isRoute()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Route();

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
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getSlot__GetValue__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#isBoolean() <em>Is Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Boolean</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#isBoolean()
	 * @generated
	 */
	EOperation getSlot__IsBoolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#isDate() <em>Is Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#isDate()
	 * @generated
	 */
	EOperation getSlot__IsDate();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#isEnum() <em>Is Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enum</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#isEnum()
	 * @generated
	 */
	EOperation getSlot__IsEnum();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#isNumeric() <em>Is Numeric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Numeric</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#isNumeric()
	 * @generated
	 */
	EOperation getSlot__IsNumeric();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Slot#isString() <em>Is String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is String</em>' operation.
	 * @see org.abchip.mimo.entity.Slot#isString()
	 * @generated
	 */
	EOperation getSlot__IsString();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textable</em>'.
	 * @see org.abchip.mimo.entity.Textable
	 * @generated
	 */
	EClass getTextable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.entity.Textable#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see org.abchip.mimo.entity.Textable#getText()
	 * @generated
	 */
	EOperation getTextable__GetText();

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
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY___IS_MANDATORY = eINSTANCE.getCardinality__IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY___IS_MULTIPLE = eINSTANCE.getCardinality__IsMultiple();

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
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT___CLEAR = eINSTANCE.getDefault__Clear();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT___IS_EMPTY = eINSTANCE.getDefault__IsEmpty();

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
		 * The meta object literal for the '<em><b>Isa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ISA = eINSTANCE.getEntity__Isa();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.EntityIterator <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.EntityIterator
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getEntityIterator()
		 * @generated
		 */
		EClass ENTITY_ITERATOR = eINSTANCE.getEntityIterator();

		/**
		 * The meta object literal for the '<em><b>Has Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_ITERATOR___HAS_NEXT = eINSTANCE.getEntityIterator__HasNext();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_ITERATOR___NEXT = eINSTANCE.getEntityIterator__Next();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_ITERATOR___REMOVE = eINSTANCE.getEntityIterator__Remove();

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
		 * The meta object literal for the '<em><b>Get URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_NAMEABLE___GET_URI = eINSTANCE.getEntityNameable__GetURI();

		/**
		 * The meta object literal for the '<em><b>Is Proxy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_NAMEABLE___IS_PROXY = eINSTANCE.getEntityNameable__IsProxy();

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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPED___GET_TYPE = eINSTANCE.getEntityTyped__GetType();

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
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_FRAME = eINSTANCE.getEntityType__GetFrame();

		/**
		 * The meta object literal for the '<em><b>Get Type Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_TYPE_ID = eINSTANCE.getEntityType__GetTypeId();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___HAS_TABLE = eINSTANCE.getEntityType__HasTable();

		/**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_TEXT = eINSTANCE.getEntityType__GetText();

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
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__KEYS = eINSTANCE.getFrame_Keys();

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
		 * The meta object literal for the '<em><b>Slots Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SLOTS_NUMBER = eINSTANCE.getFrame_SlotsNumber();

		/**
		 * The meta object literal for the '<em><b>Routes Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__ROUTES_NUMBER = eINSTANCE.getFrame_RoutesNumber();

		/**
		 * The meta object literal for the '<em><b>Super Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SUPER_NAMES = eINSTANCE.getFrame_SuperNames();

		/**
		 * The meta object literal for the '<em><b>Text Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__TEXT_FORMULA = eINSTANCE.getFrame_TextFormula();

		/**
		 * The meta object literal for the '<em><b>Ako</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___AKO = eINSTANCE.getFrame__Ako();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___CREATE_ENTITY = eINSTANCE.getFrame__CreateEntity();

		/**
		 * The meta object literal for the '<em><b>Get Slot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___GET_SLOT__STRING = eINSTANCE.getFrame__GetSlot__String();

		/**
		 * The meta object literal for the '<em><b>Get Super Frames</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___GET_SUPER_FRAMES = eINSTANCE.getFrame__GetSuperFrames();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___GET_VALUE__ENTITY_STRING_BOOLEAN = eINSTANCE.getFrame__GetValue__Entity_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___SET_VALUE__ENTITY_STRING_OBJECT = eINSTANCE.getFrame__SetValue__Entity_String_Object();

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
		 * The meta object literal for the '<em><b>Create Proxy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME_MANAGER___CREATE_PROXY__FRAME_STRING = eINSTANCE.getFrameManager__CreateProxy__Frame_String();

		/**
		 * The meta object literal for the '<em><b>Create Proxy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME_MANAGER___CREATE_PROXY__CLASS_STRING = eINSTANCE.getFrameManager__CreateProxy__Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Frame Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME_MANAGER___GET_FRAME_READER__CONTEXTPROVIDER = eINSTANCE.getFrameManager__GetFrameReader__ContextProvider();

		/**
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME_MANAGER___GET_FRAME__STRING = eINSTANCE.getFrameManager__GetFrame__String();

		/**
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME_MANAGER___GET_FRAME__CLASS = eINSTANCE.getFrameManager__GetFrame__Class();

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
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMEABLE___GET_NAME = eINSTANCE.getNameable__GetName();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__NAME = eINSTANCE.getSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__ROUTE = eINSTANCE.getSlot_Route();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__TEXT = eINSTANCE.getSlot_Text();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___GET_VALUE__STRING = eINSTANCE.getSlot__GetValue__String();

		/**
		 * The meta object literal for the '<em><b>Is Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___IS_BOOLEAN = eINSTANCE.getSlot__IsBoolean();

		/**
		 * The meta object literal for the '<em><b>Is Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___IS_DATE = eINSTANCE.getSlot__IsDate();

		/**
		 * The meta object literal for the '<em><b>Is Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___IS_ENUM = eINSTANCE.getSlot__IsEnum();

		/**
		 * The meta object literal for the '<em><b>Is Numeric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___IS_NUMERIC = eINSTANCE.getSlot__IsNumeric();

		/**
		 * The meta object literal for the '<em><b>Is String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___IS_STRING = eINSTANCE.getSlot__IsString();

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
		 * The meta object literal for the '{@link org.abchip.mimo.entity.Textable <em>Textable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.entity.Textable
		 * @see org.abchip.mimo.entity.impl.EntityPackageImpl#getTextable()
		 * @generated
		 */
		EClass TEXTABLE = eINSTANCE.getTextable();

		/**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTABLE___GET_TEXT = eINSTANCE.getTextable__GetText();

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
