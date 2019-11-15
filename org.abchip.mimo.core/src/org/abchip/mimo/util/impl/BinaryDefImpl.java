/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util.impl;

import org.abchip.mimo.util.BinaryDef;
import org.abchip.mimo.util.BinaryType;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.impl.BinaryDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.BinaryDefImpl#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryDefImpl extends MinimalEObjectImpl.Container implements BinaryDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.BINARY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryType getType() {
		return (BinaryType)eGet(UtilPackage.Literals.BINARY_DEF__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(BinaryType newType) {
		eSet(UtilPackage.Literals.BINARY_DEF__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsigned() {
		return (Boolean)eGet(UtilPackage.Literals.BINARY_DEF__UNSIGNED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsigned(boolean newUnsigned) {
		eSet(UtilPackage.Literals.BINARY_DEF__UNSIGNED, newUnsigned);
	}

} //BinaryDefImpl
