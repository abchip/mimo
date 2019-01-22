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

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#getThreadId <em>Thread Id</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#getThreadPriority <em>Thread Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#getThreadCPUUsage <em>Thread CPU Usage</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#getThreadStatus <em>Thread Status</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#isThreadRunnable <em>Thread Runnable</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#isThreadInterrupted <em>Thread Interrupted</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#isThreadNative <em>Thread Native</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#isThreadSuspended <em>Thread Suspended</em>}</li>
 *   <li>{@link org.abchip.mimo.util.ThreadInfo#isThreadDaemon <em>Thread Daemon</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo()
 * @model
 * @generated
 */
public interface ThreadInfo extends Entity {
	/**
	 * Returns the value of the '<em><b>Thread Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Name</em>' attribute.
	 * @see #setThreadName(String)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadName()
	 * @model required="true"
	 * @generated
	 */
	String getThreadName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#getThreadName <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Name</em>' attribute.
	 * @see #getThreadName()
	 * @generated
	 */
	void setThreadName(String value);

	/**
	 * Returns the value of the '<em><b>Thread Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Id</em>' attribute.
	 * @see #setThreadId(long)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadId()
	 * @model required="true"
	 * @generated
	 */
	long getThreadId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#getThreadId <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Id</em>' attribute.
	 * @see #getThreadId()
	 * @generated
	 */
	void setThreadId(long value);

	/**
	 * Returns the value of the '<em><b>Thread Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Priority</em>' attribute.
	 * @see #setThreadPriority(int)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadPriority()
	 * @model required="true"
	 * @generated
	 */
	int getThreadPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#getThreadPriority <em>Thread Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Priority</em>' attribute.
	 * @see #getThreadPriority()
	 * @generated
	 */
	void setThreadPriority(int value);

	/**
	 * Returns the value of the '<em><b>Thread CPU Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread CPU Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread CPU Usage</em>' attribute.
	 * @see #setThreadCPUUsage(double)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadCPUUsage()
	 * @model required="true"
	 * @generated
	 */
	double getThreadCPUUsage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#getThreadCPUUsage <em>Thread CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread CPU Usage</em>' attribute.
	 * @see #getThreadCPUUsage()
	 * @generated
	 */
	void setThreadCPUUsage(double value);

	/**
	 * Returns the value of the '<em><b>Thread Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.util.ThreadStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Status</em>' attribute.
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @see #setThreadStatus(ThreadStatus)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadStatus()
	 * @model required="true"
	 * @generated
	 */
	ThreadStatus getThreadStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#getThreadStatus <em>Thread Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Status</em>' attribute.
	 * @see org.abchip.mimo.util.ThreadStatus
	 * @see #getThreadStatus()
	 * @generated
	 */
	void setThreadStatus(ThreadStatus value);

	/**
	 * Returns the value of the '<em><b>Thread Runnable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Runnable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Runnable</em>' attribute.
	 * @see #setThreadRunnable(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadRunnable()
	 * @model required="true"
	 * @generated
	 */
	boolean isThreadRunnable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#isThreadRunnable <em>Thread Runnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Runnable</em>' attribute.
	 * @see #isThreadRunnable()
	 * @generated
	 */
	void setThreadRunnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Thread Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Interrupted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Interrupted</em>' attribute.
	 * @see #setThreadInterrupted(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadInterrupted()
	 * @model required="true"
	 * @generated
	 */
	boolean isThreadInterrupted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#isThreadInterrupted <em>Thread Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Interrupted</em>' attribute.
	 * @see #isThreadInterrupted()
	 * @generated
	 */
	void setThreadInterrupted(boolean value);

	/**
	 * Returns the value of the '<em><b>Thread Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Native</em>' attribute.
	 * @see #setThreadNative(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadNative()
	 * @model required="true"
	 * @generated
	 */
	boolean isThreadNative();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#isThreadNative <em>Thread Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Native</em>' attribute.
	 * @see #isThreadNative()
	 * @generated
	 */
	void setThreadNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Thread Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Suspended</em>' attribute.
	 * @see #setThreadSuspended(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadSuspended()
	 * @model required="true"
	 * @generated
	 */
	boolean isThreadSuspended();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#isThreadSuspended <em>Thread Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Suspended</em>' attribute.
	 * @see #isThreadSuspended()
	 * @generated
	 */
	void setThreadSuspended(boolean value);

	/**
	 * Returns the value of the '<em><b>Thread Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Daemon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Daemon</em>' attribute.
	 * @see #setThreadDaemon(boolean)
	 * @see org.abchip.mimo.util.UtilPackage#getThreadInfo_ThreadDaemon()
	 * @model required="true"
	 * @generated
	 */
	boolean isThreadDaemon();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.ThreadInfo#isThreadDaemon <em>Thread Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Daemon</em>' attribute.
	 * @see #isThreadDaemon()
	 * @generated
	 */
	void setThreadDaemon(boolean value);

} // ThreadInfo
