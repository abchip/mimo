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
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostComponentType;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.abchip.mimo.biz.product.cost.ProductCostComponentCalc;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.ProductCostComponentCalcImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected CostComponentType costComponentTypeId;

	/**
	 * The cached value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected CostComponentCalc costComponentCalcId;

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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		productId = newProductId;
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
		sequenceNum = newSequenceNum;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentType getCostComponentTypeId() {
		if (costComponentTypeId != null && ((EObject)costComponentTypeId).eIsProxy()) {
			InternalEObject oldCostComponentTypeId = (InternalEObject)costComponentTypeId;
			costComponentTypeId = (CostComponentType)eResolveProxy(oldCostComponentTypeId);
			if (costComponentTypeId != oldCostComponentTypeId) {
			}
		}
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostComponentType basicGetCostComponentTypeId() {
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentTypeId(CostComponentType newCostComponentTypeId) {
		costComponentTypeId = newCostComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentCalc getCostComponentCalcId() {
		if (costComponentCalcId != null && ((EObject)costComponentCalcId).eIsProxy()) {
			InternalEObject oldCostComponentCalcId = (InternalEObject)costComponentCalcId;
			costComponentCalcId = (CostComponentCalc)eResolveProxy(oldCostComponentCalcId);
			if (costComponentCalcId != oldCostComponentCalcId) {
			}
		}
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostComponentCalc basicGetCostComponentCalcId() {
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(CostComponentCalc newCostComponentCalcId) {
		costComponentCalcId = newCostComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				return getFromDate();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				return getSequenceNum();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				return getThruDate();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				if (resolve) return getCostComponentTypeId();
				return basicGetCostComponentTypeId();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				if (resolve) return getCostComponentCalcId();
				return basicGetCostComponentCalcId();
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)newValue);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((CostComponentCalc)newValue);
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)null);
				return;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((CostComponentCalc)null);
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
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__PRODUCT_ID:
				return productId != null;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE_ID:
				return costComponentTypeId != null;
			case CostPackage.PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				return costComponentCalcId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductCostComponentCalcImpl
