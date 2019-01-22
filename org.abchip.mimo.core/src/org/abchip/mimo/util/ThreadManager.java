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

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getThreadManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ThreadManager extends Singleton<ThreadManager> {
	
	ThreadManager qINSTANCE = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.abchip.mimo.util.JavaRunnable" runnableRequired="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread createThread(String name, Runnable runnable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.abchip.mimo.util.JavaRunnable" runnableRequired="true" daemonRequired="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread createThread(String name, Runnable runnable, boolean daemon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread currentThread();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	ThreadInfo getThreadInfo(org.abchip.mimo.util.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<org.abchip.mimo.util.Thread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread lookupThread(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	org.abchip.mimo.util.Thread lookupThread(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void release(org.abchip.mimo.util.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void start(org.abchip.mimo.util.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void stop(org.abchip.mimo.util.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void suspend(org.abchip.mimo.util.Thread thread);

} // ThreadManager
