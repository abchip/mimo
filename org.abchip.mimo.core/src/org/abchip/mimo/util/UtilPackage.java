/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/util";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = org.abchip.mimo.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.BinaryDefImpl <em>Binary Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.BinaryDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getBinaryDef()
	 * @generated
	 */
	int BINARY_DEF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__UNSIGNED = 1;

	/**
	 * The number of structural features of the '<em>Binary Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.CharacterDefImpl <em>Character Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.CharacterDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getCharacterDef()
	 * @generated
	 */
	int CHARACTER_DEF = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.DataDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 3;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__FORMULAS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF___GET_JAVA_CLASS = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF___GET_DATA_DEF_TYPE = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__LENGTH = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__VARYING = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Character Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Classes <em>Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Classes
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getClasses()
	 * @generated
	 */
	int CLASSES = 2;

	/**
	 * The number of structural features of the '<em>Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES___GET_ALL_INTERFACES__CLASS = 0;

	/**
	 * The number of operations of the '<em>Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.DatetimeDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDatetimeDef()
	 * @generated
	 */
	int DATETIME_DEF = 4;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__DATE_FORMAT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TIME_FORMAT = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Datetime Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Datetime Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.DecimalDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDecimalDef()
	 * @generated
	 */
	int DECIMAL_DEF = 5;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__PRECISION = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__SCALE = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Decimal Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Files <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Files
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 6;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Base Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES___GET_BASE_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Clean Directory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES___CLEAN_DIRECTORY__STRING = 1;

	/**
	 * The operation id for the '<em>Delete Directory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES___DELETE_DIRECTORY__STRING = 2;

	/**
	 * The operation id for the '<em>Get Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES___GET_SEPARATOR = 3;

	/**
	 * The operation id for the '<em>Copy To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES___COPY_TO_FILE__INPUTSTREAM = 4;

	/**
	 * The number of operations of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.FloatingDefImpl <em>Floating Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.FloatingDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFloatingDef()
	 * @generated
	 */
	int FLOATING_DEF = 7;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Floating Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.IdentityDefImpl <em>Identity Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.IdentityDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getIdentityDef()
	 * @generated
	 */
	int IDENTITY_DEF = 8;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Identity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Identity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.nio.ByteBuffer <em>Java Byte Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.ByteBuffer
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaByteBuffer()
	 * @generated
	 */
	int JAVA_BYTE_BUFFER = 9;

	/**
	 * The number of structural features of the '<em>Java Byte Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BYTE_BUFFER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Byte Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BYTE_BUFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.BlockingQueue <em>Java Blocking Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.BlockingQueue
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaBlockingQueue()
	 * @generated
	 */
	int JAVA_BLOCKING_QUEUE = 10;

	/**
	 * The number of structural features of the '<em>Java Blocking Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BLOCKING_QUEUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Blocking Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BLOCKING_QUEUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.Callable <em>Java Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.Callable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCallable()
	 * @generated
	 */
	int JAVA_CALLABLE = 11;

	/**
	 * The number of structural features of the '<em>Java Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CALLABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CALLABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.nio.charset.Charset <em>Java Charset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.charset.Charset
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCharset()
	 * @generated
	 */
	int JAVA_CHARSET = 12;

	/**
	 * The number of structural features of the '<em>Java Charset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CHARSET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Charset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CHARSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.io.Closeable <em>Java Closeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Closeable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCloseable()
	 * @generated
	 */
	int JAVA_CLOSEABLE = 13;

	/**
	 * The number of structural features of the '<em>Java Closeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLOSEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Closeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLOSEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.ConcurrentMap <em>Java Concurrent Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ConcurrentMap
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaConcurrentMap()
	 * @generated
	 */
	int JAVA_CONCURRENT_MAP = 14;

	/**
	 * The number of structural features of the '<em>Java Concurrent Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCURRENT_MAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Concurrent Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCURRENT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Enum <em>Java Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Enum
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaEnum()
	 * @generated
	 */
	int JAVA_ENUM = 15;

	/**
	 * The number of structural features of the '<em>Java Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ENUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaExecutorService()
	 * @generated
	 */
	int JAVA_EXECUTOR_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>Java Executor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXECUTOR_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Executor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXECUTOR_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.io.File <em>Java File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaFile()
	 * @generated
	 */
	int JAVA_FILE = 17;

	/**
	 * The number of structural features of the '<em>Java File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Iterable <em>Java Iterable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Iterable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIterable()
	 * @generated
	 */
	int JAVA_ITERABLE = 18;

	/**
	 * The number of structural features of the '<em>Java Iterable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Iterable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.Iterator <em>Java Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIterator()
	 * @generated
	 */
	int JAVA_ITERATOR = 19;

	/**
	 * The number of structural features of the '<em>Java Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.List <em>Java List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 20;

	/**
	 * The number of structural features of the '<em>Java List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Number <em>Java Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaNumber()
	 * @generated
	 */
	int JAVA_NUMBER = 21;

	/**
	 * The number of structural features of the '<em>Java Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NUMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.security.Principal <em>Java Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.Principal
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaPrincipal()
	 * @generated
	 */
	int JAVA_PRINCIPAL = 22;

	/**
	 * The number of structural features of the '<em>Java Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PRINCIPAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PRINCIPAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Runnable <em>Java Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Runnable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaRunnable()
	 * @generated
	 */
	int JAVA_RUNNABLE = 23;

	/**
	 * The number of structural features of the '<em>Java Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RUNNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Thread <em>Java Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Thread
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThread()
	 * @generated
	 */
	int JAVA_THREAD = 25;

	/**
	 * The meta object id for the '{@link java.lang.ThreadGroup <em>Java Thread Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.ThreadGroup
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThreadGroup()
	 * @generated
	 */
	int JAVA_THREAD_GROUP = 26;

	/**
	 * The meta object id for the '{@link java.lang.management.ThreadInfo <em>Java Thread Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.management.ThreadInfo
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThreadInfo()
	 * @generated
	 */
	int JAVA_THREAD_INFO = 27;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Singleton <em>Singleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Singleton
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getSingleton()
	 * @generated
	 */
	int SINGLETON = 30;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Lists <em>Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Lists
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getLists()
	 * @generated
	 */
	int LISTS = 28;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.NumericDefImpl <em>Numeric Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.NumericDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getNumericDef()
	 * @generated
	 */
	int NUMERIC_DEF = 29;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Streams <em>Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Streams
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStreams()
	 * @generated
	 */
	int STREAMS = 31;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.StringDefImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 32;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Strings <em>Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Strings
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 33;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Thread <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Thread
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 34;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Threads <em>Threads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Threads
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreads()
	 * @generated
	 */
	int THREADS = 35;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.ThreadInfoImpl <em>Thread Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.ThreadInfoImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadInfo()
	 * @generated
	 */
	int THREAD_INFO = 36;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.ThreadManager <em>Thread Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.ThreadManager
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadManager()
	 * @generated
	 */
	int THREAD_MANAGER = 37;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.URIs
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getURIs()
	 * @generated
	 */
	int UR_IS = 38;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.BinaryType <em>Binary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.BinaryType
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.DataDefType <em>Data Def Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.DataDefType
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDataDefType()
	 * @generated
	 */
	int DATA_DEF_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.DatetimeType <em>Datetime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.DatetimeType
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.DateFormat <em>Date Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.DateFormat
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDateFormat()
	 * @generated
	 */
	int DATE_FORMAT = 42;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.DecimalType <em>Decimal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.DecimalType
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.FloatingType <em>Floating Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.FloatingType
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFloatingType()
	 * @generated
	 */
	int FLOATING_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadStatus()
	 * @generated
	 */
	int THREAD_STATUS = 45;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.TimeFormat <em>Time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.TimeFormat
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getTimeFormat()
	 * @generated
	 */
	int TIME_FORMAT = 46;

	/**
	 * The meta object id for the '<em>Java Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.annotation.Annotation
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaAnnotation()
	 * @generated
	 */
	int JAVA_ANNOTATION = 47;

	/**
	 * The meta object id for the '<em>Java Dictionary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Dictionary
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaDictionary()
	 * @generated
	 */
	int JAVA_DICTIONARY = 48;

	/**
	 * The meta object id for the '<em>Java Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaException()
	 * @generated
	 */
	int JAVA_EXCEPTION = 49;

	/**
	 * The meta object id for the '<em>Java Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaInputStream()
	 * @generated
	 */
	int JAVA_INPUT_STREAM = 50;

	/**
	 * The meta object id for the '<em>Java IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIOException()
	 * @generated
	 */
	int JAVA_IO_EXCEPTION = 51;

	/**
	 * The meta object id for the '<em>Java Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaMap()
	 * @generated
	 */
	int JAVA_MAP = 52;

	/**
	 * The meta object id for the '<em>Java Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaOutputStream()
	 * @generated
	 */
	int JAVA_OUTPUT_STREAM = 53;

	/**
	 * The meta object id for the '<em>Java Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Properties
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaProperties()
	 * @generated
	 */
	int JAVA_PROPERTIES = 54;

	/**
	 * The meta object id for the '<em>Java Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThrowable()
	 * @generated
	 */
	int JAVA_THROWABLE = 55;

	/**
	 * The meta object id for the '<em>Java Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Type
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 56;

	/**
	 * The meta object id for the '<em>Java URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaURI()
	 * @generated
	 */
	int JAVA_URI = 57;

	/**
	 * The meta object id for the '<em>Java URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaURL()
	 * @generated
	 */
	int JAVA_URL = 58;

	/**
	 * The meta object id for the '<em>Java Writer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Writer
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaWriter()
	 * @generated
	 */
	int JAVA_WRITER = 59;

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Java Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaSerializable()
	 * @generated
	 */
	int JAVA_SERIALIZABLE = 24;


	/**
	 * The number of structural features of the '<em>Java Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERIALIZABLE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_GROUP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_INFO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_INFO_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS___ADD_FIRST__LIST_OBJECT = SINGLETON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Last</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS___ADD_LAST__LIST_OBJECT = SINGLETON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS___ADD_BEFORE__LIST_OBJECT_OBJECT = SINGLETON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS___ADD_AFTER__LIST_OBJECT_OBJECT = SINGLETON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Slice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS___SLICE__LIST_INT_INT = SINGLETON_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_OPERATION_COUNT = SINGLETON_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Numeric Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>Numeric Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS___COPY__INPUTSTREAM_OUTPUTSTREAM = 0;

	/**
	 * The number of operations of the '<em>Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF___ISA = DATA_DEF___ISA;

	/**
	 * The operation id for the '<em>Get Java Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF___GET_JAVA_CLASS = DATA_DEF___GET_JAVA_CLASS;

	/**
	 * The operation id for the '<em>Get Data Def Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF___GET_DATA_DEF_TYPE = DATA_DEF___GET_DATA_DEF_TYPE;

	/**
	 * The number of operations of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_OPERATION_COUNT = DATA_DEF_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Append Chars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___APPEND_CHARS__STRING_STRING_INT_BOOLEAN = SINGLETON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___CHECK_EQUALS__STRING_STRING = SINGLETON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Escape</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___ESCAPE__STRING = SINGLETON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>First To Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___FIRST_TO_UPPER__STRING = SINGLETON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>First To Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___FIRST_TO_LOWER__STRING = SINGLETON_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Empty Trim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___IS_EMPTY_TRIM__STRING = SINGLETON_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is One Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___IS_ONE_OF__STRING_LIST = SINGLETON_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___LEFT__STRING_INT = SINGLETON_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>LSet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___LSET__STRING_INT = SINGLETON_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>LSet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___LSET__STRING_INT_STRING = SINGLETON_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Remove First Char</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___REMOVE_FIRST_CHAR__STRING = SINGLETON_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Remove Last Char</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___REMOVE_LAST_CHAR__STRING = SINGLETON_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___RIGHT__STRING_INT = SINGLETON_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>RSet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___RSET__STRING_INT = SINGLETON_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>RSet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___RSET__STRING_INT_STRING = SINGLETON_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___STRING__INT_STRING = SINGLETON_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Trim L</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___TRIM_L__STRING = SINGLETON_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Trim R</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS___TRIM_R__STRING = SINGLETON_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_OPERATION_COUNT = SINGLETON_OPERATION_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The operation id for the '<em>Check Runnable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___CHECK_RUNNABLE = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Java Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_JAVA_THREAD = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Thread ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_THREAD_ID = EntityPackage.ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Thread Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_THREAD_NAME = EntityPackage.ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Thread Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_THREAD_PRIORITY = EntityPackage.ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Thread CPU Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_THREAD_CPU_USAGE = EntityPackage.ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Thread Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_THREAD_STATUS = EntityPackage.ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Interrupted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___IS_INTERRUPTED = EntityPackage.ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Native</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___IS_NATIVE = EntityPackage.ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Suspended</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___IS_SUSPENDED = EntityPackage.ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Thread Daemon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___IS_THREAD_DAEMON = EntityPackage.ENTITY_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Threads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>List Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LIST_THREADS = SINGLETON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>List Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LIST_THREADS__STRING = SINGLETON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>List Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LIST_THREADS__THREADGROUP = SINGLETON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>List Thread Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LIST_THREAD_INFOS = SINGLETON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>List Thread Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LIST_THREAD_GROUPS = SINGLETON_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lookup Blocking Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_BLOCKING_THREAD__THREAD = SINGLETON_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Lookup Locking Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_LOCKING_THREAD__OBJECT = SINGLETON_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Lookup Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD__LONG = SINGLETON_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Lookup Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD__STRING = SINGLETON_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Lookup Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD__THREADINFO = SINGLETON_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Lookup Thread Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD_GROUP__STRING = SINGLETON_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Lookup Thread Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD_INFO__LONG = SINGLETON_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Lookup Thread Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD_INFO__STRING = SINGLETON_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Lookup Thread Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS___LOOKUP_THREAD_INFO__THREAD = SINGLETON_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Threads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS_OPERATION_COUNT = SINGLETON_OPERATION_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Thread Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thread Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_ID = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thread Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_PRIORITY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thread CPU Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_CPU_USAGE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thread Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_STATUS = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thread Runnable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_RUNNABLE = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thread Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_INTERRUPTED = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thread Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_NATIVE = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thread Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_SUSPENDED = EntityPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thread Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO__THREAD_DAEMON = EntityPackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO___ISA = EntityPackage.ENTITY___ISA;

	/**
	 * The number of operations of the '<em>Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INFO_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thread Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___CREATE_THREAD__STRING_RUNNABLE = SINGLETON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___CREATE_THREAD__STRING_RUNNABLE_BOOLEAN = SINGLETON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Current Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___CURRENT_THREAD = SINGLETON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Thread Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___GET_THREAD_INFO__THREAD = SINGLETON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>List Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___LIST_THREADS = SINGLETON_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lookup Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___LOOKUP_THREAD__LONG = SINGLETON_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Lookup Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___LOOKUP_THREAD__STRING = SINGLETON_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Release</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___RELEASE__THREAD = SINGLETON_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___START__THREAD = SINGLETON_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___STOP__THREAD = SINGLETON_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER___SUSPEND__THREAD = SINGLETON_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Thread Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER_OPERATION_COUNT = SINGLETON_OPERATION_COUNT + 11;

	/**
	 * The number of structural features of the '<em>UR Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS_FEATURE_COUNT = 0;


	/**
	 * The operation id for the '<em>Get Base Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS___GET_BASE_NAME__URI = 0;

	/**
	 * The operation id for the '<em>Parse Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS___PARSE_PARAMETER__STRING = 1;

	/**
	 * The number of operations of the '<em>UR Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.BinaryDef <em>Binary Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Def</em>'.
	 * @see org.abchip.mimo.util.BinaryDef
	 * @generated
	 */
	EClass getBinaryDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.BinaryDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.util.BinaryDef#getType()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.BinaryDef#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see org.abchip.mimo.util.BinaryDef#isUnsigned()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Unsigned();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.CharacterDef <em>Character Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Def</em>'.
	 * @see org.abchip.mimo.util.CharacterDef
	 * @generated
	 */
	EClass getCharacterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.CharacterDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.abchip.mimo.util.CharacterDef#getLength()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.CharacterDef#isVarying <em>Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varying</em>'.
	 * @see org.abchip.mimo.util.CharacterDef#isVarying()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Varying();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Classes <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classes</em>'.
	 * @see org.abchip.mimo.util.Classes
	 * @generated
	 */
	EClass getClasses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Classes#getAllInterfaces(java.lang.Class) <em>Get All Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Interfaces</em>' operation.
	 * @see org.abchip.mimo.util.Classes#getAllInterfaces(java.lang.Class)
	 * @generated
	 */
	EOperation getClasses__GetAllInterfaces__Class();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see org.abchip.mimo.util.DataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.util.DataDef#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formulas</em>'.
	 * @see org.abchip.mimo.util.DataDef#getFormulas()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Formulas();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.DataDef#getJavaClass() <em>Get Java Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Java Class</em>' operation.
	 * @see org.abchip.mimo.util.DataDef#getJavaClass()
	 * @generated
	 */
	EOperation getDataDef__GetJavaClass();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.DataDef#getDataDefType() <em>Get Data Def Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Def Type</em>' operation.
	 * @see org.abchip.mimo.util.DataDef#getDataDefType()
	 * @generated
	 */
	EOperation getDataDef__GetDataDefType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.DatetimeDef <em>Datetime Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Def</em>'.
	 * @see org.abchip.mimo.util.DatetimeDef
	 * @generated
	 */
	EClass getDatetimeDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DatetimeDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.util.DatetimeDef#getType()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DatetimeDef#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see org.abchip.mimo.util.DatetimeDef#getDateFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DatetimeDef#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see org.abchip.mimo.util.DatetimeDef#getTimeFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_TimeFormat();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.DecimalDef <em>Decimal Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Def</em>'.
	 * @see org.abchip.mimo.util.DecimalDef
	 * @generated
	 */
	EClass getDecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DecimalDef#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.abchip.mimo.util.DecimalDef#getPrecision()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DecimalDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.abchip.mimo.util.DecimalDef#getScale()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.DecimalDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.util.DecimalDef#getType()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see org.abchip.mimo.util.Files
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Files#getBaseName(java.lang.String) <em>Get Base Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Name</em>' operation.
	 * @see org.abchip.mimo.util.Files#getBaseName(java.lang.String)
	 * @generated
	 */
	EOperation getFiles__GetBaseName__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Files#cleanDirectory(java.lang.String) <em>Clean Directory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clean Directory</em>' operation.
	 * @see org.abchip.mimo.util.Files#cleanDirectory(java.lang.String)
	 * @generated
	 */
	EOperation getFiles__CleanDirectory__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Files#deleteDirectory(java.lang.String) <em>Delete Directory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Directory</em>' operation.
	 * @see org.abchip.mimo.util.Files#deleteDirectory(java.lang.String)
	 * @generated
	 */
	EOperation getFiles__DeleteDirectory__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Files#getSeparator() <em>Get Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Separator</em>' operation.
	 * @see org.abchip.mimo.util.Files#getSeparator()
	 * @generated
	 */
	EOperation getFiles__GetSeparator();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Files#copyToFile(java.io.InputStream) <em>Copy To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy To File</em>' operation.
	 * @see org.abchip.mimo.util.Files#copyToFile(java.io.InputStream)
	 * @generated
	 */
	EOperation getFiles__CopyToFile__InputStream();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.FloatingDef <em>Floating Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Def</em>'.
	 * @see org.abchip.mimo.util.FloatingDef
	 * @generated
	 */
	EClass getFloatingDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.FloatingDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.util.FloatingDef#getType()
	 * @see #getFloatingDef()
	 * @generated
	 */
	EAttribute getFloatingDef_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.IdentityDef <em>Identity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Def</em>'.
	 * @see org.abchip.mimo.util.IdentityDef
	 * @generated
	 */
	EClass getIdentityDef();

	/**
	 * Returns the meta object for class '{@link java.nio.ByteBuffer <em>Java Byte Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Byte Buffer</em>'.
	 * @see java.nio.ByteBuffer
	 * @model instanceClass="java.nio.ByteBuffer"
	 * @generated
	 */
	EClass getJavaByteBuffer();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.BlockingQueue <em>Java Blocking Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Blocking Queue</em>'.
	 * @see java.util.concurrent.BlockingQueue
	 * @model instanceClass="java.util.concurrent.BlockingQueue&lt;E&gt;"
	 * @generated
	 */
	EClass getJavaBlockingQueue();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.Callable <em>Java Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Callable</em>'.
	 * @see java.util.concurrent.Callable
	 * @model instanceClass="java.util.concurrent.Callable" typeParameters="V"
	 * @generated
	 */
	EClass getJavaCallable();

	/**
	 * Returns the meta object for class '{@link java.nio.charset.Charset <em>Java Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Charset</em>'.
	 * @see java.nio.charset.Charset
	 * @model instanceClass="java.nio.charset.Charset"
	 * @generated
	 */
	EClass getJavaCharset();

	/**
	 * Returns the meta object for class '{@link java.io.Closeable <em>Java Closeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Closeable</em>'.
	 * @see java.io.Closeable
	 * @model instanceClass="java.io.Closeable"
	 * @generated
	 */
	EClass getJavaCloseable();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.ConcurrentMap <em>Java Concurrent Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Concurrent Map</em>'.
	 * @see java.util.concurrent.ConcurrentMap
	 * @model instanceClass="java.util.concurrent.ConcurrentMap&lt;K, V&gt;"
	 * @generated
	 */
	EClass getJavaConcurrentMap();

	/**
	 * Returns the meta object for class '{@link java.lang.Enum <em>Java Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Enum</em>'.
	 * @see java.lang.Enum
	 * @model instanceClass="java.lang.Enum&lt;E&gt;"
	 * @generated
	 */
	EClass getJavaEnum();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	EClass getJavaExecutorService();

	/**
	 * Returns the meta object for class '{@link java.io.File <em>Java File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EClass getJavaFile();

	/**
	 * Returns the meta object for class '{@link java.lang.Iterable <em>Java Iterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Iterable</em>'.
	 * @see java.lang.Iterable
	 * @model instanceClass="java.lang.Iterable" typeParameters="T"
	 * @generated
	 */
	EClass getJavaIterable();

	/**
	 * Returns the meta object for class '{@link java.util.Iterator <em>Java Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="T"
	 * @generated
	 */
	EClass getJavaIterator();

	/**
	 * Returns the meta object for class '{@link java.util.List <em>Java List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EClass getJavaList();

	/**
	 * Returns the meta object for class '{@link java.lang.Number <em>Java Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EClass getJavaNumber();

	/**
	 * Returns the meta object for class '{@link java.security.Principal <em>Java Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Principal</em>'.
	 * @see java.security.Principal
	 * @model instanceClass="java.security.Principal"
	 * @generated
	 */
	EClass getJavaPrincipal();

	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Java Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	EClass getJavaRunnable();

	/**
	 * Returns the meta object for class '{@link java.lang.Thread <em>Java Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Thread</em>'.
	 * @see java.lang.Thread
	 * @model instanceClass="java.lang.Thread"
	 * @generated
	 */
	EClass getJavaThread();

	/**
	 * Returns the meta object for class '{@link java.lang.ThreadGroup <em>Java Thread Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Thread Group</em>'.
	 * @see java.lang.ThreadGroup
	 * @model instanceClass="java.lang.ThreadGroup"
	 * @generated
	 */
	EClass getJavaThreadGroup();

	/**
	 * Returns the meta object for class '{@link java.lang.management.ThreadInfo <em>Java Thread Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Thread Info</em>'.
	 * @see java.lang.management.ThreadInfo
	 * @model instanceClass="java.lang.management.ThreadInfo"
	 * @generated
	 */
	EClass getJavaThreadInfo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Lists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lists</em>'.
	 * @see org.abchip.mimo.util.Lists
	 * @generated
	 */
	EClass getLists();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Lists#addFirst(java.util.List, java.lang.Object) <em>Add First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add First</em>' operation.
	 * @see org.abchip.mimo.util.Lists#addFirst(java.util.List, java.lang.Object)
	 * @generated
	 */
	EOperation getLists__AddFirst__List_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Lists#addLast(java.util.List, java.lang.Object) <em>Add Last</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Last</em>' operation.
	 * @see org.abchip.mimo.util.Lists#addLast(java.util.List, java.lang.Object)
	 * @generated
	 */
	EOperation getLists__AddLast__List_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Lists#addBefore(java.util.List, java.lang.Object, java.lang.Object) <em>Add Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Before</em>' operation.
	 * @see org.abchip.mimo.util.Lists#addBefore(java.util.List, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getLists__AddBefore__List_Object_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Lists#addAfter(java.util.List, java.lang.Object, java.lang.Object) <em>Add After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add After</em>' operation.
	 * @see org.abchip.mimo.util.Lists#addAfter(java.util.List, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getLists__AddAfter__List_Object_Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Lists#slice(java.util.List, int, int) <em>Slice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Slice</em>' operation.
	 * @see org.abchip.mimo.util.Lists#slice(java.util.List, int, int)
	 * @generated
	 */
	EOperation getLists__Slice__List_int_int();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.NumericDef <em>Numeric Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Def</em>'.
	 * @see org.abchip.mimo.util.NumericDef
	 * @generated
	 */
	EClass getNumericDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Singleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton</em>'.
	 * @see org.abchip.mimo.util.Singleton
	 * @generated
	 */
	EClass getSingleton();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Streams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streams</em>'.
	 * @see org.abchip.mimo.util.Streams
	 * @generated
	 */
	EClass getStreams();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Streams#copy(java.io.InputStream, java.io.OutputStream) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see org.abchip.mimo.util.Streams#copy(java.io.InputStream, java.io.OutputStream)
	 * @generated
	 */
	EOperation getStreams__Copy__InputStream_OutputStream();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see org.abchip.mimo.util.StringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Strings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strings</em>'.
	 * @see org.abchip.mimo.util.Strings
	 * @generated
	 */
	EClass getStrings();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#appendChars(java.lang.String, java.lang.String, int, boolean) <em>Append Chars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Append Chars</em>' operation.
	 * @see org.abchip.mimo.util.Strings#appendChars(java.lang.String, java.lang.String, int, boolean)
	 * @generated
	 */
	EOperation getStrings__AppendChars__String_String_int_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#checkEquals(java.lang.String, java.lang.String) <em>Check Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Equals</em>' operation.
	 * @see org.abchip.mimo.util.Strings#checkEquals(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStrings__CheckEquals__String_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#escape(java.lang.String) <em>Escape</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Escape</em>' operation.
	 * @see org.abchip.mimo.util.Strings#escape(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__Escape__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#firstToUpper(java.lang.String) <em>First To Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>First To Upper</em>' operation.
	 * @see org.abchip.mimo.util.Strings#firstToUpper(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__FirstToUpper__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#firstToLower(java.lang.String) <em>First To Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>First To Lower</em>' operation.
	 * @see org.abchip.mimo.util.Strings#firstToLower(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__FirstToLower__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#isEmptyTrim(java.lang.String) <em>Is Empty Trim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty Trim</em>' operation.
	 * @see org.abchip.mimo.util.Strings#isEmptyTrim(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__IsEmptyTrim__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#isOneOf(java.lang.String, java.util.List) <em>Is One Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is One Of</em>' operation.
	 * @see org.abchip.mimo.util.Strings#isOneOf(java.lang.String, java.util.List)
	 * @generated
	 */
	EOperation getStrings__IsOneOf__String_List();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#left(java.lang.String, int) <em>Left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left</em>' operation.
	 * @see org.abchip.mimo.util.Strings#left(java.lang.String, int)
	 * @generated
	 */
	EOperation getStrings__Left__String_int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#lSet(java.lang.String, int) <em>LSet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>LSet</em>' operation.
	 * @see org.abchip.mimo.util.Strings#lSet(java.lang.String, int)
	 * @generated
	 */
	EOperation getStrings__LSet__String_int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#lSet(java.lang.String, int, java.lang.String) <em>LSet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>LSet</em>' operation.
	 * @see org.abchip.mimo.util.Strings#lSet(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getStrings__LSet__String_int_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#removeFirstChar(java.lang.String) <em>Remove First Char</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove First Char</em>' operation.
	 * @see org.abchip.mimo.util.Strings#removeFirstChar(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__RemoveFirstChar__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#removeLastChar(java.lang.String) <em>Remove Last Char</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Last Char</em>' operation.
	 * @see org.abchip.mimo.util.Strings#removeLastChar(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__RemoveLastChar__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#right(java.lang.String, int) <em>Right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right</em>' operation.
	 * @see org.abchip.mimo.util.Strings#right(java.lang.String, int)
	 * @generated
	 */
	EOperation getStrings__Right__String_int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#rSet(java.lang.String, int) <em>RSet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RSet</em>' operation.
	 * @see org.abchip.mimo.util.Strings#rSet(java.lang.String, int)
	 * @generated
	 */
	EOperation getStrings__RSet__String_int();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#rSet(java.lang.String, int, java.lang.String) <em>RSet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RSet</em>' operation.
	 * @see org.abchip.mimo.util.Strings#rSet(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getStrings__RSet__String_int_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#string(int, java.lang.String) <em>String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>String</em>' operation.
	 * @see org.abchip.mimo.util.Strings#string(int, java.lang.String)
	 * @generated
	 */
	EOperation getStrings__String__int_String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#trimL(java.lang.String) <em>Trim L</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trim L</em>' operation.
	 * @see org.abchip.mimo.util.Strings#trimL(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__TrimL__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Strings#trimR(java.lang.String) <em>Trim R</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trim R</em>' operation.
	 * @see org.abchip.mimo.util.Strings#trimR(java.lang.String)
	 * @generated
	 */
	EOperation getStrings__TrimR__String();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.abchip.mimo.util.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#checkRunnable() <em>Check Runnable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Runnable</em>' operation.
	 * @see org.abchip.mimo.util.Thread#checkRunnable()
	 * @generated
	 */
	EOperation getThread__CheckRunnable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getJavaThread() <em>Get Java Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Java Thread</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getJavaThread()
	 * @generated
	 */
	EOperation getThread__GetJavaThread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getThreadID() <em>Get Thread ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread ID</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getThreadID()
	 * @generated
	 */
	EOperation getThread__GetThreadID();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getThreadName() <em>Get Thread Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread Name</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getThreadName()
	 * @generated
	 */
	EOperation getThread__GetThreadName();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getThreadPriority() <em>Get Thread Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread Priority</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getThreadPriority()
	 * @generated
	 */
	EOperation getThread__GetThreadPriority();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getThreadCPUUsage() <em>Get Thread CPU Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread CPU Usage</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getThreadCPUUsage()
	 * @generated
	 */
	EOperation getThread__GetThreadCPUUsage();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#getThreadStatus() <em>Get Thread Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread Status</em>' operation.
	 * @see org.abchip.mimo.util.Thread#getThreadStatus()
	 * @generated
	 */
	EOperation getThread__GetThreadStatus();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#isInterrupted() <em>Is Interrupted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Interrupted</em>' operation.
	 * @see org.abchip.mimo.util.Thread#isInterrupted()
	 * @generated
	 */
	EOperation getThread__IsInterrupted();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#isNative() <em>Is Native</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Native</em>' operation.
	 * @see org.abchip.mimo.util.Thread#isNative()
	 * @generated
	 */
	EOperation getThread__IsNative();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#isSuspended() <em>Is Suspended</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Suspended</em>' operation.
	 * @see org.abchip.mimo.util.Thread#isSuspended()
	 * @generated
	 */
	EOperation getThread__IsSuspended();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Thread#isThreadDaemon() <em>Is Thread Daemon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Thread Daemon</em>' operation.
	 * @see org.abchip.mimo.util.Thread#isThreadDaemon()
	 * @generated
	 */
	EOperation getThread__IsThreadDaemon();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Threads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threads</em>'.
	 * @see org.abchip.mimo.util.Threads
	 * @generated
	 */
	EClass getThreads();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#listThreads() <em>List Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Threads</em>' operation.
	 * @see org.abchip.mimo.util.Threads#listThreads()
	 * @generated
	 */
	EOperation getThreads__ListThreads();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#listThreads(java.lang.String) <em>List Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Threads</em>' operation.
	 * @see org.abchip.mimo.util.Threads#listThreads(java.lang.String)
	 * @generated
	 */
	EOperation getThreads__ListThreads__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#listThreads(java.lang.ThreadGroup) <em>List Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Threads</em>' operation.
	 * @see org.abchip.mimo.util.Threads#listThreads(java.lang.ThreadGroup)
	 * @generated
	 */
	EOperation getThreads__ListThreads__ThreadGroup();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#listThreadInfos() <em>List Thread Infos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Thread Infos</em>' operation.
	 * @see org.abchip.mimo.util.Threads#listThreadInfos()
	 * @generated
	 */
	EOperation getThreads__ListThreadInfos();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#listThreadGroups() <em>List Thread Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Thread Groups</em>' operation.
	 * @see org.abchip.mimo.util.Threads#listThreadGroups()
	 * @generated
	 */
	EOperation getThreads__ListThreadGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupBlockingThread(java.lang.Thread) <em>Lookup Blocking Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Blocking Thread</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupBlockingThread(java.lang.Thread)
	 * @generated
	 */
	EOperation getThreads__LookupBlockingThread__Thread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupLockingThread(java.lang.Object) <em>Lookup Locking Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Locking Thread</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupLockingThread(java.lang.Object)
	 * @generated
	 */
	EOperation getThreads__LookupLockingThread__Object();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThread(long) <em>Lookup Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThread(long)
	 * @generated
	 */
	EOperation getThreads__LookupThread__long();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThread(java.lang.String) <em>Lookup Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThread(java.lang.String)
	 * @generated
	 */
	EOperation getThreads__LookupThread__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThread(java.lang.management.ThreadInfo) <em>Lookup Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThread(java.lang.management.ThreadInfo)
	 * @generated
	 */
	EOperation getThreads__LookupThread__ThreadInfo();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThreadGroup(java.lang.String) <em>Lookup Thread Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread Group</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThreadGroup(java.lang.String)
	 * @generated
	 */
	EOperation getThreads__LookupThreadGroup__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThreadInfo(long) <em>Lookup Thread Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread Info</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThreadInfo(long)
	 * @generated
	 */
	EOperation getThreads__LookupThreadInfo__long();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThreadInfo(java.lang.String) <em>Lookup Thread Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread Info</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThreadInfo(java.lang.String)
	 * @generated
	 */
	EOperation getThreads__LookupThreadInfo__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.Threads#lookupThreadInfo(java.lang.Thread) <em>Lookup Thread Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread Info</em>' operation.
	 * @see org.abchip.mimo.util.Threads#lookupThreadInfo(java.lang.Thread)
	 * @generated
	 */
	EOperation getThreads__LookupThreadInfo__Thread();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.ThreadInfo <em>Thread Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Info</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo
	 * @generated
	 */
	EClass getThreadInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#getThreadName <em>Thread Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Name</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#getThreadName()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#getThreadId <em>Thread Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Id</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#getThreadId()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#getThreadPriority <em>Thread Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Priority</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#getThreadPriority()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#getThreadCPUUsage <em>Thread CPU Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread CPU Usage</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#getThreadCPUUsage()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadCPUUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#getThreadStatus <em>Thread Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Status</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#getThreadStatus()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#isThreadRunnable <em>Thread Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Runnable</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#isThreadRunnable()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadRunnable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#isThreadInterrupted <em>Thread Interrupted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Interrupted</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#isThreadInterrupted()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadInterrupted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#isThreadNative <em>Thread Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Native</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#isThreadNative()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadNative();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#isThreadSuspended <em>Thread Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Suspended</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#isThreadSuspended()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadSuspended();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.ThreadInfo#isThreadDaemon <em>Thread Daemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Daemon</em>'.
	 * @see org.abchip.mimo.util.ThreadInfo#isThreadDaemon()
	 * @see #getThreadInfo()
	 * @generated
	 */
	EAttribute getThreadInfo_ThreadDaemon();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.ThreadManager <em>Thread Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Manager</em>'.
	 * @see org.abchip.mimo.util.ThreadManager
	 * @generated
	 */
	EClass getThreadManager();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#createThread(java.lang.String, java.lang.Runnable) <em>Create Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Thread</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#createThread(java.lang.String, java.lang.Runnable)
	 * @generated
	 */
	EOperation getThreadManager__CreateThread__String_Runnable();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#createThread(java.lang.String, java.lang.Runnable, boolean) <em>Create Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Thread</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#createThread(java.lang.String, java.lang.Runnable, boolean)
	 * @generated
	 */
	EOperation getThreadManager__CreateThread__String_Runnable_boolean();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#currentThread() <em>Current Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Thread</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#currentThread()
	 * @generated
	 */
	EOperation getThreadManager__CurrentThread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#getThreadInfo(org.abchip.mimo.util.Thread) <em>Get Thread Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread Info</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#getThreadInfo(org.abchip.mimo.util.Thread)
	 * @generated
	 */
	EOperation getThreadManager__GetThreadInfo__Thread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#listThreads() <em>List Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Threads</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#listThreads()
	 * @generated
	 */
	EOperation getThreadManager__ListThreads();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#lookupThread(long) <em>Lookup Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#lookupThread(long)
	 * @generated
	 */
	EOperation getThreadManager__LookupThread__long();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#lookupThread(java.lang.String) <em>Lookup Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup Thread</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#lookupThread(java.lang.String)
	 * @generated
	 */
	EOperation getThreadManager__LookupThread__String();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#release(org.abchip.mimo.util.Thread) <em>Release</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Release</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#release(org.abchip.mimo.util.Thread)
	 * @generated
	 */
	EOperation getThreadManager__Release__Thread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#start(org.abchip.mimo.util.Thread) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#start(org.abchip.mimo.util.Thread)
	 * @generated
	 */
	EOperation getThreadManager__Start__Thread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#stop(org.abchip.mimo.util.Thread) <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#stop(org.abchip.mimo.util.Thread)
	 * @generated
	 */
	EOperation getThreadManager__Stop__Thread();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.ThreadManager#suspend(org.abchip.mimo.util.Thread) <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.abchip.mimo.util.ThreadManager#suspend(org.abchip.mimo.util.Thread)
	 * @generated
	 */
	EOperation getThreadManager__Suspend__Thread();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Is</em>'.
	 * @see org.abchip.mimo.util.URIs
	 * @generated
	 */
	EClass getURIs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.URIs#getBaseName(java.net.URI) <em>Get Base Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Name</em>' operation.
	 * @see org.abchip.mimo.util.URIs#getBaseName(java.net.URI)
	 * @generated
	 */
	EOperation getURIs__GetBaseName__URI();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.util.URIs#parseParameter(java.lang.String) <em>Parse Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Parameter</em>' operation.
	 * @see org.abchip.mimo.util.URIs#parseParameter(java.lang.String)
	 * @generated
	 */
	EOperation getURIs__ParseParameter__String();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see org.abchip.mimo.util.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.DataDefType <em>Data Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Def Type</em>'.
	 * @see org.abchip.mimo.util.DataDefType
	 * @generated
	 */
	EEnum getDataDefType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Type</em>'.
	 * @see org.abchip.mimo.util.DatetimeType
	 * @generated
	 */
	EEnum getDatetimeType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.DateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Format</em>'.
	 * @see org.abchip.mimo.util.DateFormat
	 * @generated
	 */
	EEnum getDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decimal Type</em>'.
	 * @see org.abchip.mimo.util.DecimalType
	 * @generated
	 */
	EEnum getDecimalType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.FloatingType <em>Floating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Floating Type</em>'.
	 * @see org.abchip.mimo.util.FloatingType
	 * @generated
	 */
	EEnum getFloatingType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Status</em>'.
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @generated
	 */
	EEnum getThreadStatus();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.TimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format</em>'.
	 * @see org.abchip.mimo.util.TimeFormat
	 * @generated
	 */
	EEnum getTimeFormat();

	/**
	 * Returns the meta object for data type '{@link java.lang.annotation.Annotation <em>Java Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Annotation</em>'.
	 * @see java.lang.annotation.Annotation
	 * @model instanceClass="java.lang.annotation.Annotation"
	 * @generated
	 */
	EDataType getJavaAnnotation();

	/**
	 * Returns the meta object for data type '{@link java.util.Dictionary <em>Java Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Dictionary</em>'.
	 * @see java.util.Dictionary
	 * @model instanceClass="java.util.Dictionary" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaDictionary();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Java Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getJavaException();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Java Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getJavaInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>Java IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getJavaIOException();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Java Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaMap();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Java Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getJavaOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Java Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getJavaProperties();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Java Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getJavaThrowable();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Type <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Type</em>'.
	 * @see java.lang.reflect.Type
	 * @model instanceClass="java.lang.reflect.Type"
	 * @generated
	 */
	EDataType getJavaType();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Java URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getJavaURI();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>Java URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getJavaURL();

	/**
	 * Returns the meta object for data type '{@link java.io.Writer <em>Java Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Writer</em>'.
	 * @see java.io.Writer
	 * @model instanceClass="java.io.Writer"
	 * @generated
	 */
	EDataType getJavaWriter();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Java Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EClass getJavaSerializable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.BinaryDefImpl <em>Binary Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.BinaryDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getBinaryDef()
		 * @generated
		 */
		EClass BINARY_DEF = eINSTANCE.getBinaryDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__TYPE = eINSTANCE.getBinaryDef_Type();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__UNSIGNED = eINSTANCE.getBinaryDef_Unsigned();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.CharacterDefImpl <em>Character Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.CharacterDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getCharacterDef()
		 * @generated
		 */
		EClass CHARACTER_DEF = eINSTANCE.getCharacterDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__LENGTH = eINSTANCE.getCharacterDef_Length();

		/**
		 * The meta object literal for the '<em><b>Varying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__VARYING = eINSTANCE.getCharacterDef_Varying();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Classes <em>Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Classes
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getClasses()
		 * @generated
		 */
		EClass CLASSES = eINSTANCE.getClasses();

		/**
		 * The meta object literal for the '<em><b>Get All Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSES___GET_ALL_INTERFACES__CLASS = eINSTANCE.getClasses__GetAllInterfaces__Class();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.DataDefImpl <em>Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.DataDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDataDef()
		 * @generated
		 */
		EClass DATA_DEF = eINSTANCE.getDataDef();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEF__FORMULAS = eINSTANCE.getDataDef_Formulas();

		/**
		 * The meta object literal for the '<em><b>Get Java Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DEF___GET_JAVA_CLASS = eINSTANCE.getDataDef__GetJavaClass();

		/**
		 * The meta object literal for the '<em><b>Get Data Def Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DEF___GET_DATA_DEF_TYPE = eINSTANCE.getDataDef__GetDataDefType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.DatetimeDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDatetimeDef()
		 * @generated
		 */
		EClass DATETIME_DEF = eINSTANCE.getDatetimeDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TYPE = eINSTANCE.getDatetimeDef_Type();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__DATE_FORMAT = eINSTANCE.getDatetimeDef_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TIME_FORMAT = eINSTANCE.getDatetimeDef_TimeFormat();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.DecimalDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDecimalDef()
		 * @generated
		 */
		EClass DECIMAL_DEF = eINSTANCE.getDecimalDef();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__PRECISION = eINSTANCE.getDecimalDef_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__SCALE = eINSTANCE.getDecimalDef_Scale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__TYPE = eINSTANCE.getDecimalDef_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Files <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Files
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '<em><b>Get Base Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILES___GET_BASE_NAME__STRING = eINSTANCE.getFiles__GetBaseName__String();

		/**
		 * The meta object literal for the '<em><b>Clean Directory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILES___CLEAN_DIRECTORY__STRING = eINSTANCE.getFiles__CleanDirectory__String();

		/**
		 * The meta object literal for the '<em><b>Delete Directory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILES___DELETE_DIRECTORY__STRING = eINSTANCE.getFiles__DeleteDirectory__String();

		/**
		 * The meta object literal for the '<em><b>Get Separator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILES___GET_SEPARATOR = eINSTANCE.getFiles__GetSeparator();

		/**
		 * The meta object literal for the '<em><b>Copy To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILES___COPY_TO_FILE__INPUTSTREAM = eINSTANCE.getFiles__CopyToFile__InputStream();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.FloatingDefImpl <em>Floating Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.FloatingDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFloatingDef()
		 * @generated
		 */
		EClass FLOATING_DEF = eINSTANCE.getFloatingDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_DEF__TYPE = eINSTANCE.getFloatingDef_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.IdentityDefImpl <em>Identity Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.IdentityDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getIdentityDef()
		 * @generated
		 */
		EClass IDENTITY_DEF = eINSTANCE.getIdentityDef();

		/**
		 * The meta object literal for the '{@link java.nio.ByteBuffer <em>Java Byte Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.ByteBuffer
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaByteBuffer()
		 * @generated
		 */
		EClass JAVA_BYTE_BUFFER = eINSTANCE.getJavaByteBuffer();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.BlockingQueue <em>Java Blocking Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.BlockingQueue
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaBlockingQueue()
		 * @generated
		 */
		EClass JAVA_BLOCKING_QUEUE = eINSTANCE.getJavaBlockingQueue();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.Callable <em>Java Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.Callable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCallable()
		 * @generated
		 */
		EClass JAVA_CALLABLE = eINSTANCE.getJavaCallable();

		/**
		 * The meta object literal for the '{@link java.nio.charset.Charset <em>Java Charset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.charset.Charset
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCharset()
		 * @generated
		 */
		EClass JAVA_CHARSET = eINSTANCE.getJavaCharset();

		/**
		 * The meta object literal for the '{@link java.io.Closeable <em>Java Closeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Closeable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaCloseable()
		 * @generated
		 */
		EClass JAVA_CLOSEABLE = eINSTANCE.getJavaCloseable();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.ConcurrentMap <em>Java Concurrent Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ConcurrentMap
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaConcurrentMap()
		 * @generated
		 */
		EClass JAVA_CONCURRENT_MAP = eINSTANCE.getJavaConcurrentMap();

		/**
		 * The meta object literal for the '{@link java.lang.Enum <em>Java Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Enum
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaEnum()
		 * @generated
		 */
		EClass JAVA_ENUM = eINSTANCE.getJavaEnum();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaExecutorService()
		 * @generated
		 */
		EClass JAVA_EXECUTOR_SERVICE = eINSTANCE.getJavaExecutorService();

		/**
		 * The meta object literal for the '{@link java.io.File <em>Java File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaFile()
		 * @generated
		 */
		EClass JAVA_FILE = eINSTANCE.getJavaFile();

		/**
		 * The meta object literal for the '{@link java.lang.Iterable <em>Java Iterable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIterable()
		 * @generated
		 */
		EClass JAVA_ITERABLE = eINSTANCE.getJavaIterable();

		/**
		 * The meta object literal for the '{@link java.util.Iterator <em>Java Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIterator()
		 * @generated
		 */
		EClass JAVA_ITERATOR = eINSTANCE.getJavaIterator();

		/**
		 * The meta object literal for the '{@link java.util.List <em>Java List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaList()
		 * @generated
		 */
		EClass JAVA_LIST = eINSTANCE.getJavaList();

		/**
		 * The meta object literal for the '{@link java.lang.Number <em>Java Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaNumber()
		 * @generated
		 */
		EClass JAVA_NUMBER = eINSTANCE.getJavaNumber();

		/**
		 * The meta object literal for the '{@link java.security.Principal <em>Java Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.Principal
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaPrincipal()
		 * @generated
		 */
		EClass JAVA_PRINCIPAL = eINSTANCE.getJavaPrincipal();

		/**
		 * The meta object literal for the '{@link java.lang.Runnable <em>Java Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Runnable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaRunnable()
		 * @generated
		 */
		EClass JAVA_RUNNABLE = eINSTANCE.getJavaRunnable();

		/**
		 * The meta object literal for the '{@link java.lang.Thread <em>Java Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Thread
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThread()
		 * @generated
		 */
		EClass JAVA_THREAD = eINSTANCE.getJavaThread();

		/**
		 * The meta object literal for the '{@link java.lang.ThreadGroup <em>Java Thread Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.ThreadGroup
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThreadGroup()
		 * @generated
		 */
		EClass JAVA_THREAD_GROUP = eINSTANCE.getJavaThreadGroup();

		/**
		 * The meta object literal for the '{@link java.lang.management.ThreadInfo <em>Java Thread Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.management.ThreadInfo
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThreadInfo()
		 * @generated
		 */
		EClass JAVA_THREAD_INFO = eINSTANCE.getJavaThreadInfo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Lists <em>Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Lists
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getLists()
		 * @generated
		 */
		EClass LISTS = eINSTANCE.getLists();

		/**
		 * The meta object literal for the '<em><b>Add First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTS___ADD_FIRST__LIST_OBJECT = eINSTANCE.getLists__AddFirst__List_Object();

		/**
		 * The meta object literal for the '<em><b>Add Last</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTS___ADD_LAST__LIST_OBJECT = eINSTANCE.getLists__AddLast__List_Object();

		/**
		 * The meta object literal for the '<em><b>Add Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTS___ADD_BEFORE__LIST_OBJECT_OBJECT = eINSTANCE.getLists__AddBefore__List_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Add After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTS___ADD_AFTER__LIST_OBJECT_OBJECT = eINSTANCE.getLists__AddAfter__List_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Slice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTS___SLICE__LIST_INT_INT = eINSTANCE.getLists__Slice__List_int_int();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.NumericDefImpl <em>Numeric Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.NumericDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getNumericDef()
		 * @generated
		 */
		EClass NUMERIC_DEF = eINSTANCE.getNumericDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Singleton <em>Singleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Singleton
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getSingleton()
		 * @generated
		 */
		EClass SINGLETON = eINSTANCE.getSingleton();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Streams <em>Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Streams
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStreams()
		 * @generated
		 */
		EClass STREAMS = eINSTANCE.getStreams();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STREAMS___COPY__INPUTSTREAM_OUTPUTSTREAM = eINSTANCE.getStreams__Copy__InputStream_OutputStream();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.StringDefImpl <em>String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.StringDefImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStringDef()
		 * @generated
		 */
		EClass STRING_DEF = eINSTANCE.getStringDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Strings <em>Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Strings
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStrings()
		 * @generated
		 */
		EClass STRINGS = eINSTANCE.getStrings();

		/**
		 * The meta object literal for the '<em><b>Append Chars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___APPEND_CHARS__STRING_STRING_INT_BOOLEAN = eINSTANCE.getStrings__AppendChars__String_String_int_boolean();

		/**
		 * The meta object literal for the '<em><b>Check Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___CHECK_EQUALS__STRING_STRING = eINSTANCE.getStrings__CheckEquals__String_String();

		/**
		 * The meta object literal for the '<em><b>Escape</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___ESCAPE__STRING = eINSTANCE.getStrings__Escape__String();

		/**
		 * The meta object literal for the '<em><b>First To Upper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___FIRST_TO_UPPER__STRING = eINSTANCE.getStrings__FirstToUpper__String();

		/**
		 * The meta object literal for the '<em><b>First To Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___FIRST_TO_LOWER__STRING = eINSTANCE.getStrings__FirstToLower__String();

		/**
		 * The meta object literal for the '<em><b>Is Empty Trim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___IS_EMPTY_TRIM__STRING = eINSTANCE.getStrings__IsEmptyTrim__String();

		/**
		 * The meta object literal for the '<em><b>Is One Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___IS_ONE_OF__STRING_LIST = eINSTANCE.getStrings__IsOneOf__String_List();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___LEFT__STRING_INT = eINSTANCE.getStrings__Left__String_int();

		/**
		 * The meta object literal for the '<em><b>LSet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___LSET__STRING_INT = eINSTANCE.getStrings__LSet__String_int();

		/**
		 * The meta object literal for the '<em><b>LSet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___LSET__STRING_INT_STRING = eINSTANCE.getStrings__LSet__String_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove First Char</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___REMOVE_FIRST_CHAR__STRING = eINSTANCE.getStrings__RemoveFirstChar__String();

		/**
		 * The meta object literal for the '<em><b>Remove Last Char</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___REMOVE_LAST_CHAR__STRING = eINSTANCE.getStrings__RemoveLastChar__String();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___RIGHT__STRING_INT = eINSTANCE.getStrings__Right__String_int();

		/**
		 * The meta object literal for the '<em><b>RSet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___RSET__STRING_INT = eINSTANCE.getStrings__RSet__String_int();

		/**
		 * The meta object literal for the '<em><b>RSet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___RSET__STRING_INT_STRING = eINSTANCE.getStrings__RSet__String_int_String();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___STRING__INT_STRING = eINSTANCE.getStrings__String__int_String();

		/**
		 * The meta object literal for the '<em><b>Trim L</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___TRIM_L__STRING = eINSTANCE.getStrings__TrimL__String();

		/**
		 * The meta object literal for the '<em><b>Trim R</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRINGS___TRIM_R__STRING = eINSTANCE.getStrings__TrimR__String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Thread <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Thread
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Check Runnable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___CHECK_RUNNABLE = eINSTANCE.getThread__CheckRunnable();

		/**
		 * The meta object literal for the '<em><b>Get Java Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_JAVA_THREAD = eINSTANCE.getThread__GetJavaThread();

		/**
		 * The meta object literal for the '<em><b>Get Thread ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_THREAD_ID = eINSTANCE.getThread__GetThreadID();

		/**
		 * The meta object literal for the '<em><b>Get Thread Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_THREAD_NAME = eINSTANCE.getThread__GetThreadName();

		/**
		 * The meta object literal for the '<em><b>Get Thread Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_THREAD_PRIORITY = eINSTANCE.getThread__GetThreadPriority();

		/**
		 * The meta object literal for the '<em><b>Get Thread CPU Usage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_THREAD_CPU_USAGE = eINSTANCE.getThread__GetThreadCPUUsage();

		/**
		 * The meta object literal for the '<em><b>Get Thread Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_THREAD_STATUS = eINSTANCE.getThread__GetThreadStatus();

		/**
		 * The meta object literal for the '<em><b>Is Interrupted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___IS_INTERRUPTED = eINSTANCE.getThread__IsInterrupted();

		/**
		 * The meta object literal for the '<em><b>Is Native</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___IS_NATIVE = eINSTANCE.getThread__IsNative();

		/**
		 * The meta object literal for the '<em><b>Is Suspended</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___IS_SUSPENDED = eINSTANCE.getThread__IsSuspended();

		/**
		 * The meta object literal for the '<em><b>Is Thread Daemon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___IS_THREAD_DAEMON = eINSTANCE.getThread__IsThreadDaemon();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.Threads <em>Threads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Threads
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreads()
		 * @generated
		 */
		EClass THREADS = eINSTANCE.getThreads();

		/**
		 * The meta object literal for the '<em><b>List Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LIST_THREADS = eINSTANCE.getThreads__ListThreads();

		/**
		 * The meta object literal for the '<em><b>List Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LIST_THREADS__STRING = eINSTANCE.getThreads__ListThreads__String();

		/**
		 * The meta object literal for the '<em><b>List Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LIST_THREADS__THREADGROUP = eINSTANCE.getThreads__ListThreads__ThreadGroup();

		/**
		 * The meta object literal for the '<em><b>List Thread Infos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LIST_THREAD_INFOS = eINSTANCE.getThreads__ListThreadInfos();

		/**
		 * The meta object literal for the '<em><b>List Thread Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LIST_THREAD_GROUPS = eINSTANCE.getThreads__ListThreadGroups();

		/**
		 * The meta object literal for the '<em><b>Lookup Blocking Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_BLOCKING_THREAD__THREAD = eINSTANCE.getThreads__LookupBlockingThread__Thread();

		/**
		 * The meta object literal for the '<em><b>Lookup Locking Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_LOCKING_THREAD__OBJECT = eINSTANCE.getThreads__LookupLockingThread__Object();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD__LONG = eINSTANCE.getThreads__LookupThread__long();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD__STRING = eINSTANCE.getThreads__LookupThread__String();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD__THREADINFO = eINSTANCE.getThreads__LookupThread__ThreadInfo();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread Group</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD_GROUP__STRING = eINSTANCE.getThreads__LookupThreadGroup__String();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD_INFO__LONG = eINSTANCE.getThreads__LookupThreadInfo__long();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD_INFO__STRING = eINSTANCE.getThreads__LookupThreadInfo__String();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREADS___LOOKUP_THREAD_INFO__THREAD = eINSTANCE.getThreads__LookupThreadInfo__Thread();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.ThreadInfoImpl <em>Thread Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.ThreadInfoImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadInfo()
		 * @generated
		 */
		EClass THREAD_INFO = eINSTANCE.getThreadInfo();

		/**
		 * The meta object literal for the '<em><b>Thread Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_NAME = eINSTANCE.getThreadInfo_ThreadName();

		/**
		 * The meta object literal for the '<em><b>Thread Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_ID = eINSTANCE.getThreadInfo_ThreadId();

		/**
		 * The meta object literal for the '<em><b>Thread Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_PRIORITY = eINSTANCE.getThreadInfo_ThreadPriority();

		/**
		 * The meta object literal for the '<em><b>Thread CPU Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_CPU_USAGE = eINSTANCE.getThreadInfo_ThreadCPUUsage();

		/**
		 * The meta object literal for the '<em><b>Thread Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_STATUS = eINSTANCE.getThreadInfo_ThreadStatus();

		/**
		 * The meta object literal for the '<em><b>Thread Runnable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_RUNNABLE = eINSTANCE.getThreadInfo_ThreadRunnable();

		/**
		 * The meta object literal for the '<em><b>Thread Interrupted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_INTERRUPTED = eINSTANCE.getThreadInfo_ThreadInterrupted();

		/**
		 * The meta object literal for the '<em><b>Thread Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_NATIVE = eINSTANCE.getThreadInfo_ThreadNative();

		/**
		 * The meta object literal for the '<em><b>Thread Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_SUSPENDED = eINSTANCE.getThreadInfo_ThreadSuspended();

		/**
		 * The meta object literal for the '<em><b>Thread Daemon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_INFO__THREAD_DAEMON = eINSTANCE.getThreadInfo_ThreadDaemon();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.ThreadManager <em>Thread Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.ThreadManager
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadManager()
		 * @generated
		 */
		EClass THREAD_MANAGER = eINSTANCE.getThreadManager();

		/**
		 * The meta object literal for the '<em><b>Create Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___CREATE_THREAD__STRING_RUNNABLE = eINSTANCE.getThreadManager__CreateThread__String_Runnable();

		/**
		 * The meta object literal for the '<em><b>Create Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___CREATE_THREAD__STRING_RUNNABLE_BOOLEAN = eINSTANCE.getThreadManager__CreateThread__String_Runnable_boolean();

		/**
		 * The meta object literal for the '<em><b>Current Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___CURRENT_THREAD = eINSTANCE.getThreadManager__CurrentThread();

		/**
		 * The meta object literal for the '<em><b>Get Thread Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___GET_THREAD_INFO__THREAD = eINSTANCE.getThreadManager__GetThreadInfo__Thread();

		/**
		 * The meta object literal for the '<em><b>List Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___LIST_THREADS = eINSTANCE.getThreadManager__ListThreads();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___LOOKUP_THREAD__LONG = eINSTANCE.getThreadManager__LookupThread__long();

		/**
		 * The meta object literal for the '<em><b>Lookup Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___LOOKUP_THREAD__STRING = eINSTANCE.getThreadManager__LookupThread__String();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___RELEASE__THREAD = eINSTANCE.getThreadManager__Release__Thread();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___START__THREAD = eINSTANCE.getThreadManager__Start__Thread();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___STOP__THREAD = eINSTANCE.getThreadManager__Stop__Thread();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD_MANAGER___SUSPEND__THREAD = eINSTANCE.getThreadManager__Suspend__Thread();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.URIs
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getURIs()
		 * @generated
		 */
		EClass UR_IS = eINSTANCE.getURIs();

		/**
		 * The meta object literal for the '<em><b>Get Base Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UR_IS___GET_BASE_NAME__URI = eINSTANCE.getURIs__GetBaseName__URI();

		/**
		 * The meta object literal for the '<em><b>Parse Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UR_IS___PARSE_PARAMETER__STRING = eINSTANCE.getURIs__ParseParameter__String();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.BinaryType
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.DataDefType <em>Data Def Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.DataDefType
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDataDefType()
		 * @generated
		 */
		EEnum DATA_DEF_TYPE = eINSTANCE.getDataDefType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.DatetimeType <em>Datetime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.DatetimeType
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDatetimeType()
		 * @generated
		 */
		EEnum DATETIME_TYPE = eINSTANCE.getDatetimeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.DateFormat <em>Date Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.DateFormat
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDateFormat()
		 * @generated
		 */
		EEnum DATE_FORMAT = eINSTANCE.getDateFormat();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.DecimalType <em>Decimal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.DecimalType
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getDecimalType()
		 * @generated
		 */
		EEnum DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.FloatingType <em>Floating Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.FloatingType
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFloatingType()
		 * @generated
		 */
		EEnum FLOATING_TYPE = eINSTANCE.getFloatingType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.ThreadStatus
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadStatus()
		 * @generated
		 */
		EEnum THREAD_STATUS = eINSTANCE.getThreadStatus();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.util.TimeFormat <em>Time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.TimeFormat
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getTimeFormat()
		 * @generated
		 */
		EEnum TIME_FORMAT = eINSTANCE.getTimeFormat();

		/**
		 * The meta object literal for the '<em>Java Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.annotation.Annotation
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaAnnotation()
		 * @generated
		 */
		EDataType JAVA_ANNOTATION = eINSTANCE.getJavaAnnotation();

		/**
		 * The meta object literal for the '<em>Java Dictionary</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Dictionary
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaDictionary()
		 * @generated
		 */
		EDataType JAVA_DICTIONARY = eINSTANCE.getJavaDictionary();

		/**
		 * The meta object literal for the '<em>Java Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaException()
		 * @generated
		 */
		EDataType JAVA_EXCEPTION = eINSTANCE.getJavaException();

		/**
		 * The meta object literal for the '<em>Java Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaInputStream()
		 * @generated
		 */
		EDataType JAVA_INPUT_STREAM = eINSTANCE.getJavaInputStream();

		/**
		 * The meta object literal for the '<em>Java IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaIOException()
		 * @generated
		 */
		EDataType JAVA_IO_EXCEPTION = eINSTANCE.getJavaIOException();

		/**
		 * The meta object literal for the '<em>Java Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaMap()
		 * @generated
		 */
		EDataType JAVA_MAP = eINSTANCE.getJavaMap();

		/**
		 * The meta object literal for the '<em>Java Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaOutputStream()
		 * @generated
		 */
		EDataType JAVA_OUTPUT_STREAM = eINSTANCE.getJavaOutputStream();

		/**
		 * The meta object literal for the '<em>Java Properties</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaProperties()
		 * @generated
		 */
		EDataType JAVA_PROPERTIES = eINSTANCE.getJavaProperties();

		/**
		 * The meta object literal for the '<em>Java Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaThrowable()
		 * @generated
		 */
		EDataType JAVA_THROWABLE = eINSTANCE.getJavaThrowable();

		/**
		 * The meta object literal for the '<em>Java Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Type
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaType()
		 * @generated
		 */
		EDataType JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em>Java URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaURI()
		 * @generated
		 */
		EDataType JAVA_URI = eINSTANCE.getJavaURI();

		/**
		 * The meta object literal for the '<em>Java URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaURL()
		 * @generated
		 */
		EDataType JAVA_URL = eINSTANCE.getJavaURL();

		/**
		 * The meta object literal for the '<em>Java Writer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Writer
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaWriter()
		 * @generated
		 */
		EDataType JAVA_WRITER = eINSTANCE.getJavaWriter();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Java Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaSerializable()
		 * @generated
		 */
		EClass JAVA_SERIALIZABLE = eINSTANCE.getJavaSerializable();

	}

} //UtilPackage
