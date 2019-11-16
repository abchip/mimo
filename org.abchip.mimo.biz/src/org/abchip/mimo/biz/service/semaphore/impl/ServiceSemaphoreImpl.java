/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockThread() <em>Lock Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockThread()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCK_THREAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockThread() <em>Lock Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockThread()
	 * @generated
	 * @ordered
	 */
	protected String lockThread = LOCK_THREAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockTime() <em>Lock Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LOCK_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockTime() <em>Lock Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockTime()
	 * @generated
	 * @ordered
	 */
	protected Date lockTime = LOCK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockedByInstanceId() <em>Locked By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedByInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCKED_BY_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockedByInstanceId() <em>Locked By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedByInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String lockedByInstanceId = LOCKED_BY_INSTANCE_ID_EDEFAULT;

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
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemaphorePackage.SERVICE_SEMAPHORE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockThread() {
		return lockThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockThread(String newLockThread) {
		String oldLockThread = lockThread;
		lockThread = newLockThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemaphorePackage.SERVICE_SEMAPHORE__LOCK_THREAD, oldLockThread, lockThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLockTime() {
		return lockTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockTime(Date newLockTime) {
		Date oldLockTime = lockTime;
		lockTime = newLockTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemaphorePackage.SERVICE_SEMAPHORE__LOCK_TIME, oldLockTime, lockTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockedByInstanceId() {
		return lockedByInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockedByInstanceId(String newLockedByInstanceId) {
		String oldLockedByInstanceId = lockedByInstanceId;
		lockedByInstanceId = newLockedByInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemaphorePackage.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID, oldLockedByInstanceId, lockedByInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemaphorePackage.SERVICE_SEMAPHORE__SERVICE_NAME:
				return getServiceName();
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_THREAD:
				return getLockThread();
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_TIME:
				return getLockTime();
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID:
				return getLockedByInstanceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemaphorePackage.SERVICE_SEMAPHORE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_THREAD:
				setLockThread((String)newValue);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_TIME:
				setLockTime((Date)newValue);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID:
				setLockedByInstanceId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemaphorePackage.SERVICE_SEMAPHORE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_THREAD:
				setLockThread(LOCK_THREAD_EDEFAULT);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_TIME:
				setLockTime(LOCK_TIME_EDEFAULT);
				return;
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID:
				setLockedByInstanceId(LOCKED_BY_INSTANCE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemaphorePackage.SERVICE_SEMAPHORE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_THREAD:
				return LOCK_THREAD_EDEFAULT == null ? lockThread != null : !LOCK_THREAD_EDEFAULT.equals(lockThread);
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCK_TIME:
				return LOCK_TIME_EDEFAULT == null ? lockTime != null : !LOCK_TIME_EDEFAULT.equals(lockTime);
			case SemaphorePackage.SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID:
				return LOCKED_BY_INSTANCE_ID_EDEFAULT == null ? lockedByInstanceId != null : !LOCKED_BY_INSTANCE_ID_EDEFAULT.equals(lockedByInstanceId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", lockThread: ");
		result.append(lockThread);
		result.append(", lockTime: ");
		result.append(lockTime);
		result.append(", lockedByInstanceId: ");
		result.append(lockedByInstanceId);
		result.append(')');
		return result.toString();
	}

} //ServiceSemaphoreImpl
