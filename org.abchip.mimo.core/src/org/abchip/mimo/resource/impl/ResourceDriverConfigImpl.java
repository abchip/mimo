/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.resource.ResourceDriverConfig;
import org.abchip.mimo.resource.ResourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceDriverConfigImpl#isLockSupport <em>Lock Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceDriverConfigImpl#isOrderSupport <em>Order Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceDriverConfigImpl#getPageSize <em>Page Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDriverConfigImpl extends EntityImpl implements ResourceDriverConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #isLockSupport() <em>Lock Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCK_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLockSupport() <em>Lock Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean lockSupport = LOCK_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrderSupport() <em>Order Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDER_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrderSupport() <em>Order Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean orderSupport = ORDER_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_SIZE_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected int pageSize = PAGE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDriverConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE_DRIVER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLockSupport() {
		return lockSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockSupport(boolean newLockSupport) {
		boolean oldLockSupport = lockSupport;
		lockSupport = newLockSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT, oldLockSupport, lockSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderSupport() {
		return orderSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSupport(boolean newOrderSupport) {
		boolean oldOrderSupport = orderSupport;
		orderSupport = newOrderSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_DRIVER_CONFIG__ORDER_SUPPORT, oldOrderSupport, orderSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageSize(int newPageSize) {
		int oldPageSize = pageSize;
		pageSize = newPageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_DRIVER_CONFIG__PAGE_SIZE, oldPageSize, pageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT:
				return isLockSupport();
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__ORDER_SUPPORT:
				return isOrderSupport();
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__PAGE_SIZE:
				return getPageSize();
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
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT:
				setLockSupport((Boolean)newValue);
				return;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__ORDER_SUPPORT:
				setOrderSupport((Boolean)newValue);
				return;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__PAGE_SIZE:
				setPageSize((Integer)newValue);
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
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT:
				setLockSupport(LOCK_SUPPORT_EDEFAULT);
				return;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__ORDER_SUPPORT:
				setOrderSupport(ORDER_SUPPORT_EDEFAULT);
				return;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__PAGE_SIZE:
				setPageSize(PAGE_SIZE_EDEFAULT);
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
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__LOCK_SUPPORT:
				return lockSupport != LOCK_SUPPORT_EDEFAULT;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__ORDER_SUPPORT:
				return orderSupport != ORDER_SUPPORT_EDEFAULT;
			case ResourcePackage.RESOURCE_DRIVER_CONFIG__PAGE_SIZE:
				return pageSize != PAGE_SIZE_EDEFAULT;
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
		result.append(" (lockSupport: ");
		result.append(lockSupport);
		result.append(", orderSupport: ");
		result.append(orderSupport);
		result.append(", pageSize: ");
		result.append(pageSize);
		result.append(')');
		return result.toString();
	}

} //ResourceDriverConfigImpl
