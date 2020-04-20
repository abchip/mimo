/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.java;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.abchip.mimo.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = org.abchip.mimo.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.lang.AutoCloseable <em>Auto Closeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.AutoCloseable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaAutoCloseable()
	 * @generated
	 */
	int JAVA_AUTO_CLOSEABLE = 0;

	/**
	 * The number of structural features of the '<em>Auto Closeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_AUTO_CLOSEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.nio.ByteBuffer <em>Byte Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.ByteBuffer
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaByteBuffer()
	 * @generated
	 */
	int JAVA_BYTE_BUFFER = 1;

	/**
	 * The number of structural features of the '<em>Byte Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BYTE_BUFFER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.BlockingQueue <em>Blocking Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.BlockingQueue
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaBlockingQueue()
	 * @generated
	 */
	int JAVA_BLOCKING_QUEUE = 2;

	/**
	 * The number of structural features of the '<em>Blocking Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BLOCKING_QUEUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.Callable <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.Callable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCallable()
	 * @generated
	 */
	int JAVA_CALLABLE = 3;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CALLABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.nio.charset.Charset <em>Charset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.charset.Charset
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCharset()
	 * @generated
	 */
	int JAVA_CHARSET = 4;

	/**
	 * The number of structural features of the '<em>Charset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CHARSET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.io.Closeable <em>Closeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Closeable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCloseable()
	 * @generated
	 */
	int JAVA_CLOSEABLE = 5;

	/**
	 * The number of structural features of the '<em>Closeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLOSEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.ConcurrentMap <em>Concurrent Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ConcurrentMap
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaConcurrentMap()
	 * @generated
	 */
	int JAVA_CONCURRENT_MAP = 6;

	/**
	 * The number of structural features of the '<em>Concurrent Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCURRENT_MAP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Enum <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Enum
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaEnum()
	 * @generated
	 */
	int JAVA_ENUM = 7;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ENUM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaExecutorService()
	 * @generated
	 */
	int JAVA_EXECUTOR_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>Executor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXECUTOR_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.io.File <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaFile()
	 * @generated
	 */
	int JAVA_FILE = 9;

	/**
	 * The meta object id for the '{@link java.lang.Iterable <em>Iterable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Iterable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIterable()
	 * @generated
	 */
	int JAVA_ITERABLE = 11;

	/**
	 * The meta object id for the '{@link java.util.Iterator <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIterator()
	 * @generated
	 */
	int JAVA_ITERATOR = 12;

	/**
	 * The meta object id for the '{@link java.util.List <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 13;

	/**
	 * The meta object id for the '{@link java.lang.Number <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaNumber()
	 * @generated
	 */
	int JAVA_NUMBER = 14;

	/**
	 * The meta object id for the '{@link java.security.Principal <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.Principal
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaPrincipal()
	 * @generated
	 */
	int JAVA_PRINCIPAL = 15;

	/**
	 * The meta object id for the '{@link java.lang.Runnable <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Runnable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaRunnable()
	 * @generated
	 */
	int JAVA_RUNNABLE = 16;

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaSerializable()
	 * @generated
	 */
	int JAVA_SERIALIZABLE = 17;

	/**
	 * The meta object id for the '{@link java.lang.Thread <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Thread
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThread()
	 * @generated
	 */
	int JAVA_THREAD = 18;

	/**
	 * The meta object id for the '{@link java.lang.ThreadGroup <em>Thread Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.ThreadGroup
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThreadGroup()
	 * @generated
	 */
	int JAVA_THREAD_GROUP = 19;

	/**
	 * The meta object id for the '{@link java.lang.management.ThreadInfo <em>Thread Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.management.ThreadInfo
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThreadInfo()
	 * @generated
	 */
	int JAVA_THREAD_INFO = 20;

	/**
	 * The meta object id for the '<em>Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.annotation.Annotation
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaAnnotation()
	 * @generated
	 */
	int JAVA_ANNOTATION = 22;

	/**
	 * The meta object id for the '<em>Dictionary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Dictionary
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaDictionary()
	 * @generated
	 */
	int JAVA_DICTIONARY = 23;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaException()
	 * @generated
	 */
	int JAVA_EXCEPTION = 24;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.Future <em>Future</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.Future
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaFuture()
	 * @generated
	 */
	int JAVA_FUTURE = 10;

	/**
	 * The number of structural features of the '<em>Future</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FUTURE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Iterable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NUMBER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PRINCIPAL_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Thread Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_THREAD_INFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.io.File <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaVoid()
	 * @generated
	 */
	int JAVA_VOID = 21;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VOID_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaInputStream()
	 * @generated
	 */
	int JAVA_INPUT_STREAM = 25;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIOException()
	 * @generated
	 */
	int JAVA_IO_EXCEPTION = 26;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaMap()
	 * @generated
	 */
	int JAVA_MAP = 27;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaOutputStream()
	 * @generated
	 */
	int JAVA_OUTPUT_STREAM = 28;

	/**
	 * The meta object id for the '<em>Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Properties
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaProperties()
	 * @generated
	 */
	int JAVA_PROPERTIES = 29;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThrowable()
	 * @generated
	 */
	int JAVA_THROWABLE = 30;

	/**
	 * The meta object id for the '<em>Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Type
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 31;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaURI()
	 * @generated
	 */
	int JAVA_URI = 32;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaURL()
	 * @generated
	 */
	int JAVA_URL = 33;

	/**
	 * The meta object id for the '<em>Writer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Writer
	 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaWriter()
	 * @generated
	 */
	int JAVA_WRITER = 34;


	/**
	 * Returns the meta object for class '{@link java.lang.AutoCloseable <em>Auto Closeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Closeable</em>'.
	 * @see java.lang.AutoCloseable
	 * @model instanceClass="java.lang.AutoCloseable"
	 * @generated
	 */
	EClass getJavaAutoCloseable();

	/**
	 * Returns the meta object for class '{@link java.nio.ByteBuffer <em>Byte Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Buffer</em>'.
	 * @see java.nio.ByteBuffer
	 * @model instanceClass="java.nio.ByteBuffer"
	 * @generated
	 */
	EClass getJavaByteBuffer();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.BlockingQueue <em>Blocking Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocking Queue</em>'.
	 * @see java.util.concurrent.BlockingQueue
	 * @model instanceClass="java.util.concurrent.BlockingQueue&lt;E&gt;"
	 * @generated
	 */
	EClass getJavaBlockingQueue();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see java.util.concurrent.Callable
	 * @model instanceClass="java.util.concurrent.Callable" typeParameters="V"
	 * @generated
	 */
	EClass getJavaCallable();

	/**
	 * Returns the meta object for class '{@link java.nio.charset.Charset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charset</em>'.
	 * @see java.nio.charset.Charset
	 * @model instanceClass="java.nio.charset.Charset"
	 * @generated
	 */
	EClass getJavaCharset();

	/**
	 * Returns the meta object for class '{@link java.io.Closeable <em>Closeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closeable</em>'.
	 * @see java.io.Closeable
	 * @model instanceClass="java.io.Closeable"
	 * @generated
	 */
	EClass getJavaCloseable();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.ConcurrentMap <em>Concurrent Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent Map</em>'.
	 * @see java.util.concurrent.ConcurrentMap
	 * @model instanceClass="java.util.concurrent.ConcurrentMap&lt;K, V&gt;"
	 * @generated
	 */
	EClass getJavaConcurrentMap();

	/**
	 * Returns the meta object for class '{@link java.lang.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see java.lang.Enum
	 * @model instanceClass="java.lang.Enum&lt;E&gt;"
	 * @generated
	 */
	EClass getJavaEnum();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	EClass getJavaExecutorService();

	/**
	 * Returns the meta object for class '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EClass getJavaFile();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.Future <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future</em>'.
	 * @see java.util.concurrent.Future
	 * @model instanceClass="java.util.concurrent.Future" typeParameters="V"
	 * @generated
	 */
	EClass getJavaFuture();

	/**
	 * Returns the meta object for class '{@link java.lang.Iterable <em>Iterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterable</em>'.
	 * @see java.lang.Iterable
	 * @model instanceClass="java.lang.Iterable" typeParameters="T"
	 * @generated
	 */
	EClass getJavaIterable();

	/**
	 * Returns the meta object for class '{@link java.util.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="T"
	 * @generated
	 */
	EClass getJavaIterator();

	/**
	 * Returns the meta object for class '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EClass getJavaList();

	/**
	 * Returns the meta object for class '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EClass getJavaNumber();

	/**
	 * Returns the meta object for class '{@link java.security.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see java.security.Principal
	 * @model instanceClass="java.security.Principal"
	 * @generated
	 */
	EClass getJavaPrincipal();

	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	EClass getJavaRunnable();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EClass getJavaSerializable();

	/**
	 * Returns the meta object for class '{@link java.lang.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see java.lang.Thread
	 * @model instanceClass="java.lang.Thread"
	 * @generated
	 */
	EClass getJavaThread();

	/**
	 * Returns the meta object for class '{@link java.lang.ThreadGroup <em>Thread Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Group</em>'.
	 * @see java.lang.ThreadGroup
	 * @model instanceClass="java.lang.ThreadGroup"
	 * @generated
	 */
	EClass getJavaThreadGroup();

	/**
	 * Returns the meta object for class '{@link java.lang.management.ThreadInfo <em>Thread Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Info</em>'.
	 * @see java.lang.management.ThreadInfo
	 * @model instanceClass="java.lang.management.ThreadInfo"
	 * @generated
	 */
	EClass getJavaThreadInfo();

	/**
	 * Returns the meta object for class '{@link java.io.File <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EClass getJavaVoid();

	/**
	 * Returns the meta object for data type '{@link java.lang.annotation.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Annotation</em>'.
	 * @see java.lang.annotation.Annotation
	 * @model instanceClass="java.lang.annotation.Annotation"
	 * @generated
	 */
	EDataType getJavaAnnotation();

	/**
	 * Returns the meta object for data type '{@link java.util.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dictionary</em>'.
	 * @see java.util.Dictionary
	 * @model instanceClass="java.util.Dictionary" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaDictionary();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getJavaException();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getJavaInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getJavaIOException();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaMap();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getJavaOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getJavaProperties();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getJavaThrowable();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type</em>'.
	 * @see java.lang.reflect.Type
	 * @model instanceClass="java.lang.reflect.Type"
	 * @generated
	 */
	EDataType getJavaType();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getJavaURI();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getJavaURL();

	/**
	 * Returns the meta object for data type '{@link java.io.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Writer</em>'.
	 * @see java.io.Writer
	 * @model instanceClass="java.io.Writer"
	 * @generated
	 */
	EDataType getJavaWriter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

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
		 * The meta object literal for the '{@link java.lang.AutoCloseable <em>Auto Closeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.AutoCloseable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaAutoCloseable()
		 * @generated
		 */
		EClass JAVA_AUTO_CLOSEABLE = eINSTANCE.getJavaAutoCloseable();

		/**
		 * The meta object literal for the '{@link java.nio.ByteBuffer <em>Byte Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.ByteBuffer
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaByteBuffer()
		 * @generated
		 */
		EClass JAVA_BYTE_BUFFER = eINSTANCE.getJavaByteBuffer();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.BlockingQueue <em>Blocking Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.BlockingQueue
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaBlockingQueue()
		 * @generated
		 */
		EClass JAVA_BLOCKING_QUEUE = eINSTANCE.getJavaBlockingQueue();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.Callable <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.Callable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCallable()
		 * @generated
		 */
		EClass JAVA_CALLABLE = eINSTANCE.getJavaCallable();

		/**
		 * The meta object literal for the '{@link java.nio.charset.Charset <em>Charset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.charset.Charset
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCharset()
		 * @generated
		 */
		EClass JAVA_CHARSET = eINSTANCE.getJavaCharset();

		/**
		 * The meta object literal for the '{@link java.io.Closeable <em>Closeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Closeable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaCloseable()
		 * @generated
		 */
		EClass JAVA_CLOSEABLE = eINSTANCE.getJavaCloseable();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.ConcurrentMap <em>Concurrent Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ConcurrentMap
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaConcurrentMap()
		 * @generated
		 */
		EClass JAVA_CONCURRENT_MAP = eINSTANCE.getJavaConcurrentMap();

		/**
		 * The meta object literal for the '{@link java.lang.Enum <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Enum
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaEnum()
		 * @generated
		 */
		EClass JAVA_ENUM = eINSTANCE.getJavaEnum();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaExecutorService()
		 * @generated
		 */
		EClass JAVA_EXECUTOR_SERVICE = eINSTANCE.getJavaExecutorService();

		/**
		 * The meta object literal for the '{@link java.io.File <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaFile()
		 * @generated
		 */
		EClass JAVA_FILE = eINSTANCE.getJavaFile();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.Future <em>Future</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.Future
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaFuture()
		 * @generated
		 */
		EClass JAVA_FUTURE = eINSTANCE.getJavaFuture();

		/**
		 * The meta object literal for the '{@link java.lang.Iterable <em>Iterable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIterable()
		 * @generated
		 */
		EClass JAVA_ITERABLE = eINSTANCE.getJavaIterable();

		/**
		 * The meta object literal for the '{@link java.util.Iterator <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIterator()
		 * @generated
		 */
		EClass JAVA_ITERATOR = eINSTANCE.getJavaIterator();

		/**
		 * The meta object literal for the '{@link java.util.List <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaList()
		 * @generated
		 */
		EClass JAVA_LIST = eINSTANCE.getJavaList();

		/**
		 * The meta object literal for the '{@link java.lang.Number <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaNumber()
		 * @generated
		 */
		EClass JAVA_NUMBER = eINSTANCE.getJavaNumber();

		/**
		 * The meta object literal for the '{@link java.security.Principal <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.Principal
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaPrincipal()
		 * @generated
		 */
		EClass JAVA_PRINCIPAL = eINSTANCE.getJavaPrincipal();

		/**
		 * The meta object literal for the '{@link java.lang.Runnable <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Runnable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaRunnable()
		 * @generated
		 */
		EClass JAVA_RUNNABLE = eINSTANCE.getJavaRunnable();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaSerializable()
		 * @generated
		 */
		EClass JAVA_SERIALIZABLE = eINSTANCE.getJavaSerializable();

		/**
		 * The meta object literal for the '{@link java.lang.Thread <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Thread
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThread()
		 * @generated
		 */
		EClass JAVA_THREAD = eINSTANCE.getJavaThread();

		/**
		 * The meta object literal for the '{@link java.lang.ThreadGroup <em>Thread Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.ThreadGroup
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThreadGroup()
		 * @generated
		 */
		EClass JAVA_THREAD_GROUP = eINSTANCE.getJavaThreadGroup();

		/**
		 * The meta object literal for the '{@link java.lang.management.ThreadInfo <em>Thread Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.management.ThreadInfo
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThreadInfo()
		 * @generated
		 */
		EClass JAVA_THREAD_INFO = eINSTANCE.getJavaThreadInfo();

		/**
		 * The meta object literal for the '{@link java.io.File <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaVoid()
		 * @generated
		 */
		EClass JAVA_VOID = eINSTANCE.getJavaVoid();

		/**
		 * The meta object literal for the '<em>Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.annotation.Annotation
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaAnnotation()
		 * @generated
		 */
		EDataType JAVA_ANNOTATION = eINSTANCE.getJavaAnnotation();

		/**
		 * The meta object literal for the '<em>Dictionary</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Dictionary
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaDictionary()
		 * @generated
		 */
		EDataType JAVA_DICTIONARY = eINSTANCE.getJavaDictionary();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaException()
		 * @generated
		 */
		EDataType JAVA_EXCEPTION = eINSTANCE.getJavaException();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaInputStream()
		 * @generated
		 */
		EDataType JAVA_INPUT_STREAM = eINSTANCE.getJavaInputStream();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaIOException()
		 * @generated
		 */
		EDataType JAVA_IO_EXCEPTION = eINSTANCE.getJavaIOException();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaMap()
		 * @generated
		 */
		EDataType JAVA_MAP = eINSTANCE.getJavaMap();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaOutputStream()
		 * @generated
		 */
		EDataType JAVA_OUTPUT_STREAM = eINSTANCE.getJavaOutputStream();

		/**
		 * The meta object literal for the '<em>Properties</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaProperties()
		 * @generated
		 */
		EDataType JAVA_PROPERTIES = eINSTANCE.getJavaProperties();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaThrowable()
		 * @generated
		 */
		EDataType JAVA_THROWABLE = eINSTANCE.getJavaThrowable();

		/**
		 * The meta object literal for the '<em>Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Type
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaType()
		 * @generated
		 */
		EDataType JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaURI()
		 * @generated
		 */
		EDataType JAVA_URI = eINSTANCE.getJavaURI();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaURL()
		 * @generated
		 */
		EDataType JAVA_URL = eINSTANCE.getJavaURL();

		/**
		 * The meta object literal for the '<em>Writer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Writer
		 * @see org.abchip.mimo.java.impl.JavaPackageImpl#getJavaWriter()
		 * @generated
		 */
		EDataType JAVA_WRITER = eINSTANCE.getJavaWriter();

	}

} //JavaPackage
