/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Std Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getFixedAssetStdCostTypeId <em>Fixed Asset Std Cost Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl#getAmountUomId <em>Amount Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetStdCostImpl extends BizEntityTypedImpl<FixedAssetStdCostType> implements FixedAssetStdCost {
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
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
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
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getFixedAssetStdCostTypeId() <em>Fixed Asset Std Cost Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetStdCostTypeId()
	 * @generated
	 * @ordered
	 */
	protected FixedAssetStdCostType fixedAssetStdCostTypeId;
	/**
	 * The cached value of the '{@link #getAmountUomId() <em>Amount Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom amountUomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetStdCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_STD_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		amount = newAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getAmountUomId() {
		if (amountUomId != null && ((EObject)amountUomId).eIsProxy()) {
			InternalEObject oldAmountUomId = (InternalEObject)amountUomId;
			amountUomId = (Uom)eResolveProxy(oldAmountUomId);
			if (amountUomId != oldAmountUomId) {
			}
		}
		return amountUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetAmountUomId() {
		return amountUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountUomId(Uom newAmountUomId) {
		amountUomId = newAmountUomId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetStdCostType getFixedAssetStdCostTypeId() {
		if (fixedAssetStdCostTypeId != null && ((EObject)fixedAssetStdCostTypeId).eIsProxy()) {
			InternalEObject oldFixedAssetStdCostTypeId = (InternalEObject)fixedAssetStdCostTypeId;
			fixedAssetStdCostTypeId = (FixedAssetStdCostType)eResolveProxy(oldFixedAssetStdCostTypeId);
			if (fixedAssetStdCostTypeId != oldFixedAssetStdCostTypeId) {
			}
		}
		return fixedAssetStdCostTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAssetStdCostType basicGetFixedAssetStdCostTypeId() {
		return fixedAssetStdCostTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetStdCostTypeId(FixedAssetStdCostType newFixedAssetStdCostTypeId) {
		fixedAssetStdCostTypeId = newFixedAssetStdCostTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_STD_COST__FROM_DATE:
				return getFromDate();
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT:
				return getAmount();
			case FixedassetPackage.FIXED_ASSET_STD_COST__THRU_DATE:
				return getThruDate();
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID:
				if (resolve) return getFixedAssetStdCostTypeId();
				return basicGetFixedAssetStdCostTypeId();
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT_UOM_ID:
				if (resolve) return getAmountUomId();
				return basicGetAmountUomId();
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
			case FixedassetPackage.FIXED_ASSET_STD_COST__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID:
				setFixedAssetStdCostTypeId((FixedAssetStdCostType)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT_UOM_ID:
				setAmountUomId((Uom)newValue);
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
			case FixedassetPackage.FIXED_ASSET_STD_COST__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID:
				setFixedAssetStdCostTypeId((FixedAssetStdCostType)null);
				return;
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT_UOM_ID:
				setAmountUomId((Uom)null);
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
			case FixedassetPackage.FIXED_ASSET_STD_COST__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case FixedassetPackage.FIXED_ASSET_STD_COST__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID:
				return fixedAssetStdCostTypeId != null;
			case FixedassetPackage.FIXED_ASSET_STD_COST__AMOUNT_UOM_ID:
				return amountUomId != null;
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
		result.append(", amount: ");
		result.append(amount);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //FixedAssetStdCostImpl
