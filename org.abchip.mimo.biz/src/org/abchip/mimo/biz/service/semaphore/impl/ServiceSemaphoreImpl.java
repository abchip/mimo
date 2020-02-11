/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.semaphore.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.semaphore.SemaphorePackage;
import org.abchip.mimo.biz.service.semaphore.ServiceSemaphore;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl#getLockThread <em>Lock Thread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl#getLockTime <em>Lock Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl#getLockedByInstanceId <em>Locked By Instance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSemaphoreImpl extends BizEntityImpl implements ServiceSemaphore {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemaphorePackage.Literals.SERVICE_SEMAPHORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eGet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eSet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockThread() {
		return (String)eGet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCK_THREAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockThread(String newLockThread) {
		eSet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCK_THREAD, newLockThread);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLockTime() {
		return (Date)eGet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCK_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockTime(Date newLockTime) {
		eSet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCK_TIME, newLockTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockedByInstanceId() {
		return (String)eGet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockedByInstanceId(String newLockedByInstanceId) {
		eSet(SemaphorePackage.Literals.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID, newLockedByInstanceId);
	}

} //ServiceSemaphoreImpl
