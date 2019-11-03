/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Fixed Asset Std</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetStdImpl#getEstimatedQuantity <em>Estimated Quantity</em>}</li>
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
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetTypeId = FIXED_ASSET_TYPE_ID_EDEFAULT;

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
		BigDecimal oldEstimatedCost = estimatedCost;
		estimatedCost = newEstimatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST, oldEstimatedCost, estimatedCost));
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
		double oldEstimatedDuration = estimatedDuration;
		estimatedDuration = newEstimatedDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION, oldEstimatedDuration, estimatedDuration));
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
		double oldEstimatedQuantity = estimatedQuantity;
		estimatedQuantity = newEstimatedQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY, oldEstimatedQuantity, estimatedQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetTypeId() {
		return fixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(String newFixedAssetTypeId) {
		String oldFixedAssetTypeId = fixedAssetTypeId;
		fixedAssetTypeId = newFixedAssetTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID, oldFixedAssetTypeId, fixedAssetTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				return getFixedAssetTypeId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				return getEstimatedCost();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				return getEstimatedDuration();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				return getEstimatedQuantity();
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				setEstimatedCost((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				setEstimatedDuration((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				setEstimatedQuantity((Double)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId(FIXED_ASSET_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				setEstimatedDuration(ESTIMATED_DURATION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				setEstimatedQuantity(ESTIMATED_QUANTITY_EDEFAULT);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID:
				return FIXED_ASSET_TYPE_ID_EDEFAULT == null ? fixedAssetTypeId != null : !FIXED_ASSET_TYPE_ID_EDEFAULT.equals(fixedAssetTypeId);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST:
				return ESTIMATED_COST_EDEFAULT == null ? estimatedCost != null : !ESTIMATED_COST_EDEFAULT.equals(estimatedCost);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION:
				return estimatedDuration != ESTIMATED_DURATION_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY:
				return estimatedQuantity != ESTIMATED_QUANTITY_EDEFAULT;
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", fixedAssetTypeId: ");
		result.append(fixedAssetTypeId);
		result.append(", estimatedCost: ");
		result.append(estimatedCost);
		result.append(", estimatedDuration: ");
		result.append(estimatedDuration);
		result.append(", estimatedQuantity: ");
		result.append(estimatedQuantity);
		result.append(')');
		return result.toString();
	}

} //WorkEffortFixedAssetStdImpl
