/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester.impl;

import org.eclipse.emf.ecore.EClass;
import org.abchip.mimo.tester.AssertionState;
import org.abchip.mimo.tester.AssertionSuccess;
import org.abchip.mimo.tester.TesterPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assertion Success</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AssertionSuccessImpl extends AssertionResultImpl implements AssertionSuccess {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionSuccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesterPackage.Literals.ASSERTION_SUCCESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public AssertionState getAssertionState() {
		return AssertionState.SUCCESS;
	}

} // AssertionSuccessImpl
