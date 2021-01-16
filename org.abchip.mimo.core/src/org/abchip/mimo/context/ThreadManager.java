/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getThreadManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ThreadManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.abchip.mimo.java.JavaRunnable" runnableRequired="true"
	 * @generated
	 */
	org.abchip.mimo.context.Thread createThread(String name, Runnable runnable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.abchip.mimo.java.JavaRunnable" runnableRequired="true" daemonRequired="true"
	 * @generated
	 */
	org.abchip.mimo.context.Thread createThread(String name, Runnable runnable, boolean daemon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	org.abchip.mimo.context.Thread currentThread();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	ThreadInfo getThreadInfo(org.abchip.mimo.context.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<org.abchip.mimo.context.Thread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */
	org.abchip.mimo.context.Thread lookupThread(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	org.abchip.mimo.context.Thread lookupThread(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void release(org.abchip.mimo.context.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void start(org.abchip.mimo.context.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void stop(org.abchip.mimo.context.Thread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void suspend(org.abchip.mimo.context.Thread thread);

} // ThreadManager
