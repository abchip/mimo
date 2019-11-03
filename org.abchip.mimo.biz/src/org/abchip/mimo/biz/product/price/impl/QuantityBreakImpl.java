/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.QuantityBreak;
import org.abchip.mimo.biz.product.price.QuantityBreakType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class QuantityBreakImpl extends BizEntityTypedImpl<QuantityBreakType> implements QuantityBreak {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getQuantityBreakId() <em>Quantity Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityBreakId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_BREAK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityBreakId() <em>Quantity Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityBreakId()
	 * @generated
	 * @ordered
	 */
	protected String quantityBreakId = QUANTITY_BREAK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromQuantity() <em>From Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FROM_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromQuantity() <em>From Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fromQuantity = FROM_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityBreakTypeId() <em>Quantity Break Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityBreakTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_BREAK_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityBreakTypeId() <em>Quantity Break Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityBreakTypeId()
	 * @generated
	 * @ordered
	 */
	protected String quantityBreakTypeId = QUANTITY_BREAK_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruQuantity() <em>Thru Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THRU_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruQuantity() <em>Thru Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal thruQuantity = THRU_QUANTITY_EDEFAULT;

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
		return fromQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromQuantity(BigDecimal newFromQuantity) {
		BigDecimal oldFromQuantity = fromQuantity;
		fromQuantity = newFromQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.QUANTITY_BREAK__FROM_QUANTITY, oldFromQuantity, fromQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuantityBreakId() {
		return quantityBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakId(String newQuantityBreakId) {
		String oldQuantityBreakId = quantityBreakId;
		quantityBreakId = newQuantityBreakId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_ID, oldQuantityBreakId, quantityBreakId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getThruQuantity() {
		return thruQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruQuantity(BigDecimal newThruQuantity) {
		BigDecimal oldThruQuantity = thruQuantity;
		thruQuantity = newThruQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.QUANTITY_BREAK__THRU_QUANTITY, oldThruQuantity, thruQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> priceShipmentCostEstimates() {
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
	public List<String> quantityShipmentCostEstimates() {
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
	public List<String> weightShipmentCostEstimates() {
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
	public String getQuantityBreakTypeId() {
		return quantityBreakTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakTypeId(String newQuantityBreakTypeId) {
		String oldQuantityBreakTypeId = quantityBreakTypeId;
		quantityBreakTypeId = newQuantityBreakTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID, oldQuantityBreakTypeId, quantityBreakTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_ID:
				return getQuantityBreakId();
			case PricePackage.QUANTITY_BREAK__FROM_QUANTITY:
				return getFromQuantity();
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID:
				return getQuantityBreakTypeId();
			case PricePackage.QUANTITY_BREAK__THRU_QUANTITY:
				return getThruQuantity();
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
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_ID:
				setQuantityBreakId((String)newValue);
				return;
			case PricePackage.QUANTITY_BREAK__FROM_QUANTITY:
				setFromQuantity((BigDecimal)newValue);
				return;
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID:
				setQuantityBreakTypeId((String)newValue);
				return;
			case PricePackage.QUANTITY_BREAK__THRU_QUANTITY:
				setThruQuantity((BigDecimal)newValue);
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
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_ID:
				setQuantityBreakId(QUANTITY_BREAK_ID_EDEFAULT);
				return;
			case PricePackage.QUANTITY_BREAK__FROM_QUANTITY:
				setFromQuantity(FROM_QUANTITY_EDEFAULT);
				return;
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID:
				setQuantityBreakTypeId(QUANTITY_BREAK_TYPE_ID_EDEFAULT);
				return;
			case PricePackage.QUANTITY_BREAK__THRU_QUANTITY:
				setThruQuantity(THRU_QUANTITY_EDEFAULT);
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
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_ID:
				return QUANTITY_BREAK_ID_EDEFAULT == null ? quantityBreakId != null : !QUANTITY_BREAK_ID_EDEFAULT.equals(quantityBreakId);
			case PricePackage.QUANTITY_BREAK__FROM_QUANTITY:
				return FROM_QUANTITY_EDEFAULT == null ? fromQuantity != null : !FROM_QUANTITY_EDEFAULT.equals(fromQuantity);
			case PricePackage.QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID:
				return QUANTITY_BREAK_TYPE_ID_EDEFAULT == null ? quantityBreakTypeId != null : !QUANTITY_BREAK_TYPE_ID_EDEFAULT.equals(quantityBreakTypeId);
			case PricePackage.QUANTITY_BREAK__THRU_QUANTITY:
				return THRU_QUANTITY_EDEFAULT == null ? thruQuantity != null : !THRU_QUANTITY_EDEFAULT.equals(thruQuantity);
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
		result.append(" (quantityBreakId: ");
		result.append(quantityBreakId);
		result.append(", fromQuantity: ");
		result.append(fromQuantity);
		result.append(", quantityBreakTypeId: ");
		result.append(quantityBreakTypeId);
		result.append(", thruQuantity: ");
		result.append(thruQuantity);
		result.append(')');
		return result.toString();
	}

} //QuantityBreakImpl
