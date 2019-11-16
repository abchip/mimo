/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(SchedulePackage.Literals.RUNTIME_DATA__RUNTIME_DATA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeDataId(String newRuntimeDataId) {
		eSet(SchedulePackage.Literals.RUNTIME_DATA__RUNTIME_DATA_ID, newRuntimeDataId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeInfo() {
		return (String)eGet(SchedulePackage.Literals.RUNTIME_DATA__RUNTIME_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfo(String newRuntimeInfo) {
		eSet(SchedulePackage.Literals.RUNTIME_DATA__RUNTIME_INFO, newRuntimeInfo);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulePackage.RUNTIME_DATA___APPLICATION_SANDBOXS:
				return applicationSandboxs();
			case SchedulePackage.RUNTIME_DATA___JOB_SANDBOXS:
				return jobSandboxs();
			case SchedulePackage.RUNTIME_DATA___WORK_EFFORTS:
				return workEfforts();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RuntimeDataImpl
