/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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
	 * The meta object id for the '{@link org.abchip.mimo.util.Classes <em>Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Classes
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getClasses()
	 * @generated
	 */
	int CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Files <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Files
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 1;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Singleton <em>Singleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Singleton
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getSingleton()
	 * @generated
	 */
	int SINGLETON = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Lists <em>Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Lists
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getLists()
	 * @generated
	 */
	int LISTS = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Streams <em>Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Streams
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStreams()
	 * @generated
	 */
	int STREAMS = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Strings <em>Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Strings
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Thread <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Thread
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.Threads <em>Threads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.Threads
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreads()
	 * @generated
	 */
	int THREADS = 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.ThreadInfoImpl <em>Thread Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.ThreadInfoImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadInfo()
	 * @generated
	 */
	int THREAD_INFO = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.ThreadManager <em>Thread Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.ThreadManager
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadManager()
	 * @generated
	 */
	int THREAD_MANAGER = 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.URIs <em>UR Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.URIs
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getURIs()
	 * @generated
	 */
	int UR_IS = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadStatus()
	 * @generated
	 */
	int THREAD_STATUS = 12;

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
	 * The meta object id for the '{@link org.abchip.mimo.util.impl.SocketConfigImpl <em>Socket Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.util.impl.SocketConfigImpl
	 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getSocketConfig()
	 * @generated
	 */
	int SOCKET_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG__ADDRESS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG__PORT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Socket Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS_FEATURE_COUNT = 0;

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
	int UR_IS_FEATURE_COUNT = SINGLETON_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see org.abchip.mimo.util.Files
	 * @generated
	 */
	EClass getFiles();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.util.Singleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton</em>'.
	 * @see org.abchip.mimo.util.Singleton
	 * @generated
	 */
	EClass getSingleton();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.util.SocketConfig <em>Socket Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket Config</em>'.
	 * @see org.abchip.mimo.util.SocketConfig
	 * @generated
	 */
	EClass getSocketConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.SocketConfig#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.abchip.mimo.util.SocketConfig#getAddress()
	 * @see #getSocketConfig()
	 * @generated
	 */
	EAttribute getSocketConfig_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.util.SocketConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.util.SocketConfig#getPort()
	 * @see #getSocketConfig()
	 * @generated
	 */
	EAttribute getSocketConfig_Port();

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
	 * Returns the meta object for enum '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Status</em>'.
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @generated
	 */
	EEnum getThreadStatus();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.Classes <em>Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Classes
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getClasses()
		 * @generated
		 */
		EClass CLASSES = eINSTANCE.getClasses();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.Lists <em>Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.Lists
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getLists()
		 * @generated
		 */
		EClass LISTS = eINSTANCE.getLists();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.impl.SocketConfigImpl <em>Socket Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.impl.SocketConfigImpl
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getSocketConfig()
		 * @generated
		 */
		EClass SOCKET_CONFIG = eINSTANCE.getSocketConfig();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_CONFIG__ADDRESS = eINSTANCE.getSocketConfig_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_CONFIG__PORT = eINSTANCE.getSocketConfig_Port();

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
		 * The meta object literal for the '{@link org.abchip.mimo.util.ThreadStatus <em>Thread Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.util.ThreadStatus
		 * @see org.abchip.mimo.util.impl.UtilPackageImpl#getThreadStatus()
		 * @generated
		 */
		EEnum THREAD_STATUS = eINSTANCE.getThreadStatus();

	}

} //UtilPackage
