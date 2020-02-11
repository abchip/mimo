/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data.impl;

import org.abchip.mimo.data.BooleanDef;
import org.abchip.mimo.data.DataPackage;
import org.abchip.mimo.data.DataType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Boolean
 * Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BooleanDefImpl extends DataDefImpl<Boolean> implements BooleanDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.BOOLEAN_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return Boolean.class;
	}

	@Override
	public DataType getDataType() {
		return DataType.BOOLEAN;
	}
} // BooleanDefImpl
