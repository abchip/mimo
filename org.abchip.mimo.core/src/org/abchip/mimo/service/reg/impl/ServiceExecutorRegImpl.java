/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service.reg.impl;

import org.abchip.mimo.service.reg.RegPackage;
import org.abchip.mimo.service.reg.ServiceExecutorReg;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ServiceScope Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.abchip.mimo.service.reg.impl.ServiceExecutorRegImpl#isRemoteExport <em>Remote Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceExecutorRegImpl extends ServiceRegImpl implements ServiceExecutorReg {
	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EXPORT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteExport = REMOTE_EXPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceExecutorRegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegPackage.Literals.SERVICE_EXECUTOR_REG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegPackage.SERVICE_EXECUTOR_REG__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoteExport() {
		return remoteExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteExport(boolean newRemoteExport) {
		boolean oldRemoteExport = remoteExport;
		remoteExport = newRemoteExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegPackage.SERVICE_EXECUTOR_REG__REMOTE_EXPORT, oldRemoteExport, remoteExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegPackage.SERVICE_EXECUTOR_REG__INTERFACE_NAME:
				return getInterfaceName();
			case RegPackage.SERVICE_EXECUTOR_REG__REMOTE_EXPORT:
				return isRemoteExport();
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
			case RegPackage.SERVICE_EXECUTOR_REG__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case RegPackage.SERVICE_EXECUTOR_REG__REMOTE_EXPORT:
				setRemoteExport((Boolean)newValue);
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
			case RegPackage.SERVICE_EXECUTOR_REG__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case RegPackage.SERVICE_EXECUTOR_REG__REMOTE_EXPORT:
				setRemoteExport(REMOTE_EXPORT_EDEFAULT);
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
			case RegPackage.SERVICE_EXECUTOR_REG__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case RegPackage.SERVICE_EXECUTOR_REG__REMOTE_EXPORT:
				return remoteExport != REMOTE_EXPORT_EDEFAULT;
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
		result.append(" (interfaceName: ");
		result.append(interfaceName);
		result.append(", remoteExport: ");
		result.append(remoteExport);
		result.append(')');
		return result.toString();
	}

} //ServiceExecutorRegImpl
