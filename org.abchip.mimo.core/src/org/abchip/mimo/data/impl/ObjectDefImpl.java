/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data.impl;

import org.abchip.mimo.data.DataPackage;
import org.abchip.mimo.data.DataType;
import org.abchip.mimo.data.ObjectDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectDefImpl extends DataDefImpl<Object> implements ObjectDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.OBJECT_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return Object.class;
	}

	@Override
	public DataType getDataType() {
		return DataType.OBJECT;
	}

} //ObjectDefImpl
