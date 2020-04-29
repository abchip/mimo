/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service.reg.impl;

import org.abchip.mimo.service.reg.RegPackage;
import org.abchip.mimo.service.reg.ServiceHookReg;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceHookRegImpl extends ServiceRegImpl implements ServiceHookReg {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceHookRegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegPackage.Literals.SERVICE_HOOK_REG;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getInterfaceName() {
		return getClassName();
	}

} //ServiceHookRegImpl
