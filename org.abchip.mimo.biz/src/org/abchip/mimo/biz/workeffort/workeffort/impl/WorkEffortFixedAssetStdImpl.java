/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Fixed Asset Std</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedQuantity <em>Estimated Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortFixedAssetStdImpl extends BizEntityImpl implements WorkEffortFixedAssetStd {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedCost = ESTIMATED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected double estimatedDuration = ESTIMATED_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedQuantity() <em>Estimated Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedQuantity() <em>Estimated Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedQuantity()
	 * @generated
	 * @ordered
	 */
	protected double estimatedQuantity = ESTIMATED_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected FixedAssetType fixedAssetTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortFixedAssetStdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCost(BigDecimal newEstimatedCost) {
		estimatedCost = newEstimatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedDuration() {
		return estimatedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDuration(double newEstimatedDuration) {
		estimatedDuration = newEstimatedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedQuantity() {
		return estimatedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedQuantity(double newEstimatedQuantity) {
		estimatedQuantity = newEstimatedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetType getFixedAssetTypeId() {
		if (fixedAssetTypeId != null && ((EObject)fixedAssetTypeId).eIsProxy()) {
			InternalEObject oldFixedAssetTypeId = (InternalEObject)fixedAssetTypeId;
			fixedAssetTypeId = (FixedAssetType)eResolveProxy(oldFixedAssetTypeId);
			if (fixedAssetTypeId != oldFixedAssetTypeId) {
			}
		}
		return fixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAssetType basicGetFixedAssetTypeId() {
		return fixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(FixedAssetType newFixedAssetTypeId) {
		fixedAssetTypeId = newFixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				return getEstimatedCost();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				return getEstimatedDuration();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				return getEstimatedQuantity();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				if (resolve) return getFixedAssetTypeId();
				return basicGetFixedAssetTypeId();
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				setEstimatedCost((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				setEstimatedDuration((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				setEstimatedQuantity((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId((FixedAssetType)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				setEstimatedDuration(ESTIMATED_DURATION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				setEstimatedQuantity(ESTIMATED_QUANTITY_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId((FixedAssetType)null);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				return ESTIMATED_COST_EDEFAULT == null ? estimatedCost != null : !ESTIMATED_COST_EDEFAULT.equals(estimatedCost);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				return estimatedDuration != ESTIMATED_DURATION_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				return estimatedQuantity != ESTIMATED_QUANTITY_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				return fixedAssetTypeId != null;
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
		result.append(" (estimatedCost: ");
		result.append(estimatedCost);
		result.append(", estimatedDuration: ");
		result.append(estimatedDuration);
		result.append(", estimatedQuantity: ");
		result.append(estimatedQuantity);
		result.append(')');
		return result.toString();
	}

} //WorkEffortFixedAssetStdImpl
