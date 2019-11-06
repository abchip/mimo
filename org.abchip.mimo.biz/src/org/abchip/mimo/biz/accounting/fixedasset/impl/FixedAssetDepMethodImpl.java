/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Dep Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl#getDepreciationCustomMethodId <em>Depreciation Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetDepMethodImpl extends BizEntityImpl implements FixedAssetDepMethod {
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
	 * The cached value of the '{@link #getDepreciationCustomMethodId() <em>Depreciation Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciationCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod depreciationCustomMethodId;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetDepMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_DEP_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getDepreciationCustomMethodId() {
		if (depreciationCustomMethodId != null && ((EObject)depreciationCustomMethodId).eIsProxy()) {
			InternalEObject oldDepreciationCustomMethodId = (InternalEObject)depreciationCustomMethodId;
			depreciationCustomMethodId = (CustomMethod)eResolveProxy(oldDepreciationCustomMethodId);
			if (depreciationCustomMethodId != oldDepreciationCustomMethodId) {
			}
		}
		return depreciationCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetDepreciationCustomMethodId() {
		return depreciationCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepreciationCustomMethodId(CustomMethod newDepreciationCustomMethodId) {
		depreciationCustomMethodId = newDepreciationCustomMethodId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FROM_DATE:
				return getFromDate();
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__THRU_DATE:
				return getThruDate();
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID:
				if (resolve) return getDepreciationCustomMethodId();
				return basicGetDepreciationCustomMethodId();
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
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
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID:
				setDepreciationCustomMethodId((CustomMethod)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
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
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID:
				setDepreciationCustomMethodId((CustomMethod)null);
				return;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
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
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID:
				return depreciationCustomMethodId != null;
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID:
				return fixedAssetId != null;
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
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //FixedAssetDepMethodImpl
