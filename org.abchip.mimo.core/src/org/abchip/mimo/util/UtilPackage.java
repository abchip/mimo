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
package org.abchip.mimo.util;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link java.util.concurrent.BlockingQueue<E> <em>Java Blocking Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.BlockingQueue<E>
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
	 * The meta object id for the '{@link java.util.concurrent.ConcurrentMap<K, V> <em>Java Concurrent Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ConcurrentMap<K, V>
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
	 * The meta object id for the '{@link java.lang.Enum<E> <em>Java Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Enum<E>
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
	 * The number of structural features of the '<em>Java Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_INFO_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Threads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Thread Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UR Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS_FEATURE_COUNT = 0;


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
	 * Returns the meta object for class '{@link java.util.concurrent.BlockingQueue<E> <em>Java Blocking Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Blocking Queue</em>'.
	 * @see java.util.concurrent.BlockingQueue<E>
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
	 * Returns the meta object for class '{@link java.util.concurrent.ConcurrentMap<K, V> <em>Java Concurrent Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Concurrent Map</em>'.
	 * @see java.util.concurrent.ConcurrentMap<K, V>
	 * @model instanceClass="java.util.concurrent.ConcurrentMap&lt;K, V&gt;"
	 * @generated
	 */
	EClass getJavaConcurrentMap();

	/**
	 * Returns the meta object for class '{@link java.lang.Enum<E> <em>Java Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Enum</em>'.
	 * @see java.lang.Enum<E>
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
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.abchip.mimo.util.Thread
	 * @generated
	 */
	EClass getThread();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Is</em>'.
	 * @see org.abchip.mimo.util.URIs
	 * @generated
	 */
	EClass getURIs();

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
		 * The meta object literal for the '{@link java.util.concurrent.BlockingQueue<E> <em>Java Blocking Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.BlockingQueue<E>
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
		 * The meta object literal for the '{@link java.util.concurrent.ConcurrentMap<K, V> <em>Java Concurrent Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ConcurrentMap<K, V>
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getJavaConcurrentMap()
		 * @generated
		 */
		EClass JAVA_CONCURRENT_MAP = eINSTANCE.getJavaConcurrentMap();

		/**
		 * The meta object literal for the '{@link java.lang.Enum<E> <em>Java Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Enum<E>
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
		 * The meta object literal for the '{@link org.abchip.mimo.util.Thread <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Thread
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.URIs
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getURIs()
		 * @generated
		 */
		EClass UR_IS = eINSTANCE.getURIs();

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
