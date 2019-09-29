/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.lang.Thread;
import java.lang.management.ThreadInfo;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threads</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getThreads()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Threads extends Singleton<Threads> {
	
	Threads qINSTANCE = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread"
	 * @generated
	 */
	List<Thread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" threadGroupRequired="true"
	 * @generated
	 */
	List<Thread> listThreads(String threadGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" threadGroupType="org.abchip.mimo.util.JavaThreadGroup" threadGroupRequired="true"
	 * @generated
	 */
	List<Thread> listThreads(ThreadGroup threadGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadInfo"
	 * @generated
	 */
	List<ThreadInfo> listThreadInfos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadGroup"
	 * @generated
	 */
	List<ThreadGroup> listThreadGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" threadType="org.abchip.mimo.util.JavaThread" threadRequired="true"
	 * @generated
	 */
	Thread lookupBlockingThread(Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" objectRequired="true"
	 * @generated
	 */
	Thread lookupLockingThread(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" idRequired="true"
	 * @generated
	 */
	Thread lookupThread(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" nameRequired="true"
	 * @generated
	 */
	Thread lookupThread(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThread" infoType="org.abchip.mimo.util.JavaThreadInfo" infoRequired="true"
	 * @generated
	 */
	Thread lookupThread(ThreadInfo info);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadGroup" nameRequired="true"
	 * @generated
	 */
	ThreadGroup lookupThreadGroup(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadInfo" idRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadInfo" nameRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaThreadInfo" threadType="org.abchip.mimo.util.JavaThread" threadRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(Thread thread);

} // Threads
