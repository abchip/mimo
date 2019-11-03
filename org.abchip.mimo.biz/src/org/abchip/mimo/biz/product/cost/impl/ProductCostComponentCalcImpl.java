/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.abchip.mimo.biz.product.cost.ProductCostComponentCalc;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCostComponentCalcImpl extends BizEntityImpl implements ProductCostComponentCalc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_COMPONENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String costComponentTypeId = COST_COMPONENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_COMPONENT_CALC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected String costComponentCalcId = COST_COMPONENT_CALC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCostComponentCalcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CostPackage.Literals.PRODUCT_COST_COMPONENT_CALC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostComponentTypeId() {
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentTypeId(String newCostComponentTypeId) {
		String oldCostComponentTypeId = costComponentTypeId;
		costComponentTypeId = newCostComponentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID, oldCostComponentTypeId, costComponentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostComponentCalcId() {
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(String newCostComponentCalcId) {
		String oldCostComponentCalcId = costComponentCalcId;
		costComponentCalcId = newCostComponentCalcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				return getProductId();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				return getCostComponentTypeId();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				return getFromDate();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				return getCostComponentCalcId();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				return getSequenceNum();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				return getThruDate();
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((String)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((String)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				setThruDate((Date)newValue);
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId(COST_COMPONENT_TYPE_ID_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId(COST_COMPONENT_CALC_ID_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				return COST_COMPONENT_TYPE_ID_EDEFAULT == null ? costComponentTypeId != null : !COST_COMPONENT_TYPE_ID_EDEFAULT.equals(costComponentTypeId);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				return COST_COMPONENT_CALC_ID_EDEFAULT == null ? costComponentCalcId != null : !COST_COMPONENT_CALC_ID_EDEFAULT.equals(costComponentCalcId);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", costComponentTypeId: ");
		result.append(costComponentTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", costComponentCalcId: ");
		result.append(costComponentCalcId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductCostComponentCalcImpl
