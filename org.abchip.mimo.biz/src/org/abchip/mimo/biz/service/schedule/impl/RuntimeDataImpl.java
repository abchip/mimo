/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RuntimeDataImpl#getRuntimeInfo <em>Runtime Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeDataImpl extends BizEntityImpl implements RuntimeData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRuntimeDataId() <em>Runtime Data Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeDataId()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_DATA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeDataId() <em>Runtime Data Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeDataId()
	 * @generated
	 * @ordered
	 */
	protected String runtimeDataId = RUNTIME_DATA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected String runtimeInfo = RUNTIME_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.RUNTIME_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeDataId() {
		return runtimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeDataId(String newRuntimeDataId) {
		String oldRuntimeDataId = runtimeDataId;
		runtimeDataId = newRuntimeDataId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RUNTIME_DATA__RUNTIME_DATA_ID, oldRuntimeDataId, runtimeDataId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeInfo() {
		return runtimeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfo(String newRuntimeInfo) {
		String oldRuntimeInfo = runtimeInfo;
		runtimeInfo = newRuntimeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RUNTIME_DATA__RUNTIME_INFO, oldRuntimeInfo, runtimeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> applicationSandboxs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> jobSandboxs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEfforts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.RUNTIME_DATA__RUNTIME_DATA_ID:
				return getRuntimeDataId();
			case SchedulePackage.RUNTIME_DATA__RUNTIME_INFO:
				return getRuntimeInfo();
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
			case SchedulePackage.RUNTIME_DATA__RUNTIME_DATA_ID:
				setRuntimeDataId((String)newValue);
				return;
			case SchedulePackage.RUNTIME_DATA__RUNTIME_INFO:
				setRuntimeInfo((String)newValue);
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
			case SchedulePackage.RUNTIME_DATA__RUNTIME_DATA_ID:
				setRuntimeDataId(RUNTIME_DATA_ID_EDEFAULT);
				return;
			case SchedulePackage.RUNTIME_DATA__RUNTIME_INFO:
				setRuntimeInfo(RUNTIME_INFO_EDEFAULT);
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
			case SchedulePackage.RUNTIME_DATA__RUNTIME_DATA_ID:
				return RUNTIME_DATA_ID_EDEFAULT == null ? runtimeDataId != null : !RUNTIME_DATA_ID_EDEFAULT.equals(runtimeDataId);
			case SchedulePackage.RUNTIME_DATA__RUNTIME_INFO:
				return RUNTIME_INFO_EDEFAULT == null ? runtimeInfo != null : !RUNTIME_INFO_EDEFAULT.equals(runtimeInfo);
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
		result.append(" (runtimeDataId: ");
		result.append(runtimeDataId);
		result.append(", runtimeInfo: ");
		result.append(runtimeInfo);
		result.append(')');
		return result.toString();
	}

} //RuntimeDataImpl
