/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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
	 * @model type="org.abchip.mimo.java.JavaThread"
	 * @generated
	 */
	List<Thread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" threadGroupRequired="true"
	 * @generated
	 */
	List<Thread> listThreads(String threadGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" threadGroupType="org.abchip.mimo.java.JavaThreadGroup" threadGroupRequired="true"
	 * @generated
	 */
	List<Thread> listThreads(ThreadGroup threadGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadInfo"
	 * @generated
	 */
	List<ThreadInfo> listThreadInfos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadGroup"
	 * @generated
	 */
	List<ThreadGroup> listThreadGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" threadType="org.abchip.mimo.java.JavaThread" threadRequired="true"
	 * @generated
	 */
	Thread lookupBlockingThread(Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" objectRequired="true"
	 * @generated
	 */
	Thread lookupLockingThread(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" idRequired="true"
	 * @generated
	 */
	Thread lookupThread(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" nameRequired="true"
	 * @generated
	 */
	Thread lookupThread(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThread" infoType="org.abchip.mimo.java.JavaThreadInfo" infoRequired="true"
	 * @generated
	 */
	Thread lookupThread(ThreadInfo info);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadGroup" nameRequired="true"
	 * @generated
	 */
	ThreadGroup lookupThreadGroup(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadInfo" idRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadInfo" nameRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaThreadInfo" threadType="org.abchip.mimo.java.JavaThread" threadRequired="true"
	 * @generated
	 */
	ThreadInfo lookupThreadInfo(Thread thread);

} // Threads
