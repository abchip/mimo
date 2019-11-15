/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util.impl;

import org.abchip.mimo.util.DecimalDef;
import org.abchip.mimo.util.DecimalType;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.impl.DecimalDefImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.DecimalDefImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.DecimalDefImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalDefImpl extends DataDefImpl<Number> implements DecimalDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.DECIMAL_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrecision() {
		return (Integer)eGet(UtilPackage.Literals.DECIMAL_DEF__PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(int newPrecision) {
		eSet(UtilPackage.Literals.DECIMAL_DEF__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale() {
		return (Integer)eGet(UtilPackage.Literals.DECIMAL_DEF__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale) {
		eSet(UtilPackage.Literals.DECIMAL_DEF__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalType getType() {
		return (DecimalType)eGet(UtilPackage.Literals.DECIMAL_DEF__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DecimalType newType) {
		eSet(UtilPackage.Literals.DECIMAL_DEF__TYPE, newType);
	}

} //DecimalDefImpl
