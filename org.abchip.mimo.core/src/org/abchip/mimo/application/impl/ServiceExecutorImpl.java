/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceExecutor;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceExecutorImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceExecutorImpl#isRemoteExport <em>Remote Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceExecutorImpl extends ServiceRefImpl implements ServiceExecutor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SERVICE_EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceName() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_EXECUTOR__INTERFACE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceName(String newInterfaceName) {
		eSet(ApplicationPackage.Literals.SERVICE_EXECUTOR__INTERFACE_NAME, newInterfaceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoteExport() {
		return (Boolean)eGet(ApplicationPackage.Literals.SERVICE_EXECUTOR__REMOTE_EXPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteExport(boolean newRemoteExport) {
		eSet(ApplicationPackage.Literals.SERVICE_EXECUTOR__REMOTE_EXPORT, newRemoteExport);
	}

} //ServiceExecutorImpl
