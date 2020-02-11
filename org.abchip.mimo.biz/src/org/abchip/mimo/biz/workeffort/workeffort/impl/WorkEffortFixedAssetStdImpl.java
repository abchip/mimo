/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCost(BigDecimal newEstimatedCost) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST, newEstimatedCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedDuration() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDuration(double newEstimatedDuration) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION, newEstimatedDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedQuantity() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedQuantity(double newEstimatedQuantity) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY, newEstimatedQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetType getFixedAssetTypeId() {
		return (FixedAssetType)eGet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(FixedAssetType newFixedAssetTypeId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID, newFixedAssetTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		return (WorkEffort)eGet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID, newWorkEffortId);
	}

} //WorkEffortFixedAssetStdImpl
