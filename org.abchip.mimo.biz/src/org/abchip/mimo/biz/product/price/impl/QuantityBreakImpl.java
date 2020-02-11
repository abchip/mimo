/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.QuantityBreak;
import org.abchip.mimo.biz.product.price.QuantityBreakType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl#getQuantityBreakId <em>Quantity Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl#getFromQuantity <em>From Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl#getQuantityBreakTypeId <em>Quantity Break Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl#getThruQuantity <em>Thru Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityBreakImpl extends BizEntityImpl implements QuantityBreak {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityBreakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.QUANTITY_BREAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFromQuantity() {
		return (BigDecimal)eGet(PricePackage.Literals.QUANTITY_BREAK__FROM_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromQuantity(BigDecimal newFromQuantity) {
		eSet(PricePackage.Literals.QUANTITY_BREAK__FROM_QUANTITY, newFromQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuantityBreakId() {
		return (String)eGet(PricePackage.Literals.QUANTITY_BREAK__QUANTITY_BREAK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakId(String newQuantityBreakId) {
		eSet(PricePackage.Literals.QUANTITY_BREAK__QUANTITY_BREAK_ID, newQuantityBreakId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getThruQuantity() {
		return (BigDecimal)eGet(PricePackage.Literals.QUANTITY_BREAK__THRU_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruQuantity(BigDecimal newThruQuantity) {
		eSet(PricePackage.Literals.QUANTITY_BREAK__THRU_QUANTITY, newThruQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreakType getQuantityBreakTypeId() {
		return (QuantityBreakType)eGet(PricePackage.Literals.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakTypeId(QuantityBreakType newQuantityBreakTypeId) {
		eSet(PricePackage.Literals.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID, newQuantityBreakTypeId);
	}

} //QuantityBreakImpl
