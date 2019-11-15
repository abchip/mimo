/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util.impl;

import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.ThreadInfo;
import org.abchip.mimo.util.ThreadStatus;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#getThreadId <em>Thread Id</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#getThreadPriority <em>Thread Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#getThreadCPUUsage <em>Thread CPU Usage</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#getThreadStatus <em>Thread Status</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#isThreadRunnable <em>Thread Runnable</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#isThreadInterrupted <em>Thread Interrupted</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#isThreadNative <em>Thread Native</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#isThreadSuspended <em>Thread Suspended</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.ThreadInfoImpl#isThreadDaemon <em>Thread Daemon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadInfoImpl extends EntityImpl implements ThreadInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.THREAD_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadName() {
		return (String)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadName(String newThreadName) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_NAME, newThreadName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getThreadId() {
		return (Long)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadId(long newThreadId) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_ID, newThreadId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThreadPriority() {
		return (Integer)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadPriority(int newThreadPriority) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_PRIORITY, newThreadPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThreadCPUUsage() {
		return (Double)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_CPU_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadCPUUsage(double newThreadCPUUsage) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_CPU_USAGE, newThreadCPUUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadStatus getThreadStatus() {
		return (ThreadStatus)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadStatus(ThreadStatus newThreadStatus) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_STATUS, newThreadStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreadRunnable() {
		return (Boolean)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_RUNNABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadRunnable(boolean newThreadRunnable) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_RUNNABLE, newThreadRunnable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreadInterrupted() {
		return (Boolean)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_INTERRUPTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadInterrupted(boolean newThreadInterrupted) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_INTERRUPTED, newThreadInterrupted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreadNative() {
		return (Boolean)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_NATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadNative(boolean newThreadNative) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_NATIVE, newThreadNative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreadSuspended() {
		return (Boolean)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_SUSPENDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadSuspended(boolean newThreadSuspended) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_SUSPENDED, newThreadSuspended);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreadDaemon() {
		return (Boolean)eGet(UtilPackage.Literals.THREAD_INFO__THREAD_DAEMON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadDaemon(boolean newThreadDaemon) {
		eSet(UtilPackage.Literals.THREAD_INFO__THREAD_DAEMON, newThreadDaemon);
	}

} //ThreadInfoImpl
